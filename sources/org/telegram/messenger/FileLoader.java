package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;

public class FileLoader extends BaseController {
    public static final long DEFAULT_MAX_FILE_SIZE = 2097152000;
    public static final long DEFAULT_MAX_FILE_SIZE_PREMIUM = 4194304000L;
    public static final int IMAGE_TYPE_ANIMATION = 2;
    public static final int IMAGE_TYPE_LOTTIE = 1;
    public static final int IMAGE_TYPE_SVG = 3;
    public static final int IMAGE_TYPE_SVG_WHITE = 4;
    public static final int IMAGE_TYPE_THEME_PREVIEW = 5;
    public static final int MEDIA_DIR_AUDIO = 1;
    public static final int MEDIA_DIR_CACHE = 4;
    public static final int MEDIA_DIR_DOCUMENT = 3;
    public static final int MEDIA_DIR_FILES = 5;
    public static final int MEDIA_DIR_IMAGE = 0;
    public static final int MEDIA_DIR_IMAGE_PUBLIC = 100;
    public static final int MEDIA_DIR_STORIES = 6;
    public static final int MEDIA_DIR_VIDEO = 2;
    public static final int MEDIA_DIR_VIDEO_PUBLIC = 101;
    public static final int PRELOAD_CACHE_TYPE = 11;
    public static final int PRIORITY_HIGH = 3;
    public static final int PRIORITY_LOW = 0;
    public static final int PRIORITY_NORMAL = 1;
    public static final int PRIORITY_NORMAL_UP = 2;
    private static final int PRIORITY_STREAM = 4;
    private static Pattern sentPattern;
    private int currentUploadOperationsCount;
    private int currentUploadSmallOperationsCount;
    private FileLoaderDelegate delegate;
    Runnable dumpFilesQueueRunnable;
    private final FilePathDatabase filePathDatabase;
    private String forceLoadingFile;
    private final FileLoaderPriorityQueue[] largeFilesQueue;
    private int lastReferenceId;
    private final ConcurrentHashMap<String, FileLoadOperation> loadOperationPaths;
    private final ConcurrentHashMap<String, LoadOperationUIObject> loadOperationPathsUI;
    private final HashMap<String, Boolean> loadingVideos;
    private final ConcurrentHashMap<Integer, Object> parentObjectReferences;
    private int priorityIncreasePointer;
    private final FileLoaderPriorityQueue[] smallFilesQueue;
    private final ConcurrentHashMap<String, FileUploadOperation> uploadOperationPaths;
    private final ConcurrentHashMap<String, FileUploadOperation> uploadOperationPathsEnc;
    private final LinkedList<FileUploadOperation> uploadOperationQueue;
    private final HashMap<String, Long> uploadSizes;
    private final LinkedList<FileUploadOperation> uploadSmallOperationQueue;
    private static volatile DispatchQueue fileLoaderQueue = new DispatchQueue("fileUploadQueue");
    private static SparseArray<File> mediaDirs = null;
    private static final FileLoader[] Instance = new FileLoader[4];

    public interface FileLoaderDelegate {
        void fileDidFailedLoad(String str, int i);

        void fileDidFailedUpload(String str, boolean z);

        void fileDidLoaded(String str, File file, Object obj, int i);

        void fileDidUploaded(String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j);

        void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j, long j2);

        void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, String str, long j, long j2, boolean z);
    }

    public interface FileResolver {
        File getFile();
    }

    static int access$1008(FileLoader fileLoader) {
        int i = fileLoader.currentUploadOperationsCount;
        fileLoader.currentUploadOperationsCount = i + 1;
        return i;
    }

    static int access$1010(FileLoader fileLoader) {
        int i = fileLoader.currentUploadOperationsCount;
        fileLoader.currentUploadOperationsCount = i - 1;
        return i;
    }

    static int access$808(FileLoader fileLoader) {
        int i = fileLoader.currentUploadSmallOperationsCount;
        fileLoader.currentUploadSmallOperationsCount = i + 1;
        return i;
    }

    static int access$810(FileLoader fileLoader) {
        int i = fileLoader.currentUploadSmallOperationsCount;
        fileLoader.currentUploadSmallOperationsCount = i - 1;
        return i;
    }

    public static FilePathDatabase.FileMeta getFileMetadataFromParent(int i, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (!str.startsWith("sent_")) {
                return null;
            }
            if (sentPattern == null) {
                sentPattern = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
            }
            try {
                Matcher matcher = sentPattern.matcher(str);
                if (!matcher.matches()) {
                    return null;
                }
                FilePathDatabase.FileMeta fileMeta = new FilePathDatabase.FileMeta();
                fileMeta.messageId = Integer.parseInt(matcher.group(1));
                fileMeta.dialogId = Long.parseLong(matcher.group(2));
                fileMeta.messageType = Integer.parseInt(matcher.group(3));
                fileMeta.messageSize = Long.parseLong(matcher.group(4));
                return fileMeta;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            FilePathDatabase.FileMeta fileMeta2 = new FilePathDatabase.FileMeta();
            fileMeta2.messageId = messageObject.getId();
            fileMeta2.dialogId = messageObject.getDialogId();
            fileMeta2.messageType = messageObject.type;
            fileMeta2.messageSize = messageObject.getSize();
            return fileMeta2;
        }
        if (!(obj instanceof TL_stories.StoryItem)) {
            return null;
        }
        FilePathDatabase.FileMeta fileMeta3 = new FilePathDatabase.FileMeta();
        fileMeta3.dialogId = ((TL_stories.StoryItem) obj).dialogId;
        fileMeta3.messageType = 23;
        return fileMeta3;
    }

    public static TLRPC.VideoSize getVectorMarkupVideoSize(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i = 0; i < photo.video_sizes.size(); i++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static TLRPC.VideoSize getEmojiMarkup(ArrayList<TLRPC.VideoSize> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList.get(i) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                return arrayList.get(i);
            }
        }
        return null;
    }

    private int getPriorityValue(int i) {
        int i2;
        int i3;
        if (i == 4) {
            return Integer.MAX_VALUE;
        }
        if (i == 3) {
            i2 = this.priorityIncreasePointer;
            this.priorityIncreasePointer = i2 + 1;
            i3 = 1048577;
        } else {
            if (i != 2) {
                return i == 1 ? 65536 : 0;
            }
            i2 = this.priorityIncreasePointer;
            this.priorityIncreasePointer = i2 + 1;
            i3 = 65537;
        }
        return i2 + i3;
    }

    public DispatchQueue getFileLoaderQueue() {
        return fileLoaderQueue;
    }

    public void setLocalPathTo(TLObject tLObject, String str) {
        int i;
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            if (document.key != null) {
                i = 4;
            } else if (MessageObject.isVoiceDocument(document)) {
                i = 1;
            } else {
                i = MessageObject.isVideoDocument(document) ? 2 : 3;
            }
            this.filePathDatabase.putPath(document.id, document.dc_id, i, 1, str);
            return;
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                return;
            }
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.filePathDatabase.putPath(fileLocation.volume_id, fileLocation.dc_id + (fileLocation.local_id << 16), (fileLocation == null || fileLocation.key != null || (fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0) ? 4 : 0, 1, str);
        }
    }

    public static FileLoader getInstance(int i) {
        FileLoader fileLoader;
        FileLoader[] fileLoaderArr = Instance;
        FileLoader fileLoader2 = fileLoaderArr[i];
        if (fileLoader2 != null) {
            return fileLoader2;
        }
        synchronized (FileLoader.class) {
            try {
                fileLoader = fileLoaderArr[i];
                if (fileLoader == null) {
                    fileLoader = new FileLoader(i);
                    fileLoaderArr[i] = fileLoader;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileLoader;
    }

    public FileLoader(int i) {
        super(i);
        this.smallFilesQueue = new FileLoaderPriorityQueue[5];
        this.largeFilesQueue = new FileLoaderPriorityQueue[5];
        this.uploadOperationQueue = new LinkedList<>();
        this.uploadSmallOperationQueue = new LinkedList<>();
        this.uploadOperationPaths = new ConcurrentHashMap<>();
        this.uploadOperationPathsEnc = new ConcurrentHashMap<>();
        this.currentUploadOperationsCount = 0;
        this.currentUploadSmallOperationsCount = 0;
        this.loadOperationPaths = new ConcurrentHashMap<>();
        this.loadOperationPathsUI = new ConcurrentHashMap<>(10, 1.0f, 2);
        this.uploadSizes = new HashMap<>();
        this.loadingVideos = new HashMap<>();
        this.delegate = null;
        this.parentObjectReferences = new ConcurrentHashMap<>();
        this.dumpFilesQueueRunnable = new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$uHLmzhBP7qiyrI_rMMfEWDKRAVQ(this.f$0);
            }
        };
        this.filePathDatabase = new FilePathDatabase(i);
        int i2 = 0;
        while (true) {
            FileLoaderPriorityQueue[] fileLoaderPriorityQueueArr = this.smallFilesQueue;
            if (i2 < fileLoaderPriorityQueueArr.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("smallFilesQueue dc");
                int i3 = i2 + 1;
                sb.append(i3);
                fileLoaderPriorityQueueArr[i2] = new FileLoaderPriorityQueue(i, sb.toString(), 0, fileLoaderQueue);
                this.largeFilesQueue[i2] = new FileLoaderPriorityQueue(i, "largeFilesQueue dc" + i3, 1, fileLoaderQueue);
                i2 = i3;
            } else {
                dumpFilesQueue();
                return;
            }
        }
    }

    public static void setMediaDirs(SparseArray<File> sparseArray) {
        mediaDirs = sparseArray;
    }

    public static File checkDirectory(int i) {
        return mediaDirs.get(i);
    }

    public static File getDirectory(int i) {
        File file = mediaDirs.get(i);
        if (file == null && i != 4) {
            file = mediaDirs.get(4);
        }
        if (BuildVars.NO_SCOPED_STORAGE && file != null) {
            try {
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
            } catch (Exception unused) {
            }
        }
        return file;
    }

    public int getFileReference(Object obj) {
        int i = this.lastReferenceId;
        this.lastReferenceId = i + 1;
        this.parentObjectReferences.put(Integer.valueOf(i), obj);
        return i;
    }

    public Object getParentObject(int i) {
        return this.parentObjectReferences.get(Integer.valueOf(i));
    }

    public void setLoadingVideoInternal(TLRPC.Document document, boolean z) {
        String attachFileName = getAttachFileName(document);
        StringBuilder sb = new StringBuilder();
        sb.append(attachFileName);
        sb.append(z ? "p" : "");
        this.loadingVideos.put(sb.toString(), Boolean.TRUE);
        getNotificationCenter().postNotificationName(NotificationCenter.videoLoadingStateChanged, attachFileName);
    }

    public void setLoadingVideo(final TLRPC.Document document, final boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.setLoadingVideoInternal(document, z);
                }
            });
        } else {
            setLoadingVideoInternal(document, z);
        }
    }

    public void setLoadingVideoForPlayer(TLRPC.Document document, boolean z) {
        if (document == null) {
            return;
        }
        String attachFileName = getAttachFileName(document);
        HashMap<String, Boolean> map = this.loadingVideos;
        StringBuilder sb = new StringBuilder();
        sb.append(attachFileName);
        sb.append(z ? "" : "p");
        if (map.containsKey(sb.toString())) {
            HashMap<String, Boolean> map2 = this.loadingVideos;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attachFileName);
            sb2.append(z ? "p" : "");
            map2.put(sb2.toString(), Boolean.TRUE);
            getNotificationCenter().postNotificationName(NotificationCenter.videoLoadingStateChanged, attachFileName);
        }
    }

    public void removeLoadingVideoInternal(TLRPC.Document document, boolean z) {
        String attachFileName = getAttachFileName(document);
        StringBuilder sb = new StringBuilder();
        sb.append(attachFileName);
        sb.append(z ? "p" : "");
        if (this.loadingVideos.remove(sb.toString()) != null) {
            getNotificationCenter().postNotificationName(NotificationCenter.videoLoadingStateChanged, attachFileName);
        }
    }

    public void removeLoadingVideo(final TLRPC.Document document, final boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.removeLoadingVideoInternal(document, z);
                }
            });
        } else {
            removeLoadingVideoInternal(document, z);
        }
    }

    public boolean isLoadingVideo(TLRPC.Document document, boolean z) {
        if (document == null) {
            return false;
        }
        HashMap<String, Boolean> map = this.loadingVideos;
        StringBuilder sb = new StringBuilder();
        sb.append(getAttachFileName(document));
        sb.append(z ? "p" : "");
        return map.containsKey(sb.toString());
    }

    public boolean isLoadingVideoAny(TLRPC.Document document) {
        return isLoadingVideo(document, false) || isLoadingVideo(document, true);
    }

    public void cancelFileUpload(final String str, final boolean z) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$jFhfuJBFQrDjRp9WrPwBCGMsKyc(this.f$0, z, str);
            }
        });
    }

    public static void $r8$lambda$jFhfuJBFQrDjRp9WrPwBCGMsKyc(FileLoader fileLoader, boolean z, String str) {
        FileUploadOperation fileUploadOperation;
        if (!z) {
            fileUploadOperation = fileLoader.uploadOperationPaths.get(str);
        } else {
            fileUploadOperation = fileLoader.uploadOperationPathsEnc.get(str);
        }
        fileLoader.uploadSizes.remove(str);
        if (fileUploadOperation != null) {
            fileLoader.uploadOperationPathsEnc.remove(str);
            fileLoader.uploadOperationQueue.remove(fileUploadOperation);
            fileLoader.uploadSmallOperationQueue.remove(fileUploadOperation);
            fileUploadOperation.cancel();
        }
    }

    public void checkUploadNewDataAvailable(String str, boolean z, long j, long j2) {
        checkUploadNewDataAvailable(str, z, j, j2, null);
    }

    public void checkUploadNewDataAvailable(final String str, final boolean z, final long j, final long j2, final Float f) {
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$fryEbw2PPFDF_HTxPaY4FZ1T9iw(this.f$0, z, str, j, j2, f);
            }
        });
    }

    public static void $r8$lambda$fryEbw2PPFDF_HTxPaY4FZ1T9iw(FileLoader fileLoader, boolean z, String str, long j, long j2, Float f) {
        FileUploadOperation fileUploadOperation;
        if (z) {
            fileUploadOperation = fileLoader.uploadOperationPathsEnc.get(str);
        } else {
            fileUploadOperation = fileLoader.uploadOperationPaths.get(str);
        }
        FileUploadOperation fileUploadOperation2 = fileUploadOperation;
        if (fileUploadOperation2 != null) {
            fileUploadOperation2.checkNewDataAvailable(j, j2, f);
        } else if (j2 != 0) {
            fileLoader.uploadSizes.put(str, Long.valueOf(j2));
        }
    }

    public void onNetworkChanged(final boolean z) {
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$n4pHL6xqejY4aOohbO19kzJ09Tc(this.f$0, z);
            }
        });
    }

    public static void $r8$lambda$n4pHL6xqejY4aOohbO19kzJ09Tc(FileLoader fileLoader, boolean z) {
        Iterator<Map.Entry<String, FileUploadOperation>> it = fileLoader.uploadOperationPaths.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onNetworkChanged(z);
        }
        Iterator<Map.Entry<String, FileUploadOperation>> it2 = fileLoader.uploadOperationPathsEnc.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().onNetworkChanged(z);
        }
    }

    public void uploadFile(String str, boolean z, boolean z2, int i) {
        uploadFile(str, z, z2, 0L, i, false);
    }

    public void uploadFile(final String str, final boolean z, final boolean z2, final long j, final int i, final boolean z3) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$t8Su9aLjzQX2k0ehoEDf7r47kyU(this.f$0, z, str, j, i, z3, z2);
            }
        });
    }

    public static void $r8$lambda$t8Su9aLjzQX2k0ehoEDf7r47kyU(FileLoader fileLoader, boolean z, String str, long j, int i, boolean z2, boolean z3) {
        long j2;
        if (z) {
            if (fileLoader.uploadOperationPathsEnc.containsKey(str)) {
                return;
            }
        } else if (fileLoader.uploadOperationPaths.containsKey(str)) {
            return;
        }
        if (j == 0 || fileLoader.uploadSizes.get(str) == null) {
            j2 = j;
        } else {
            fileLoader.uploadSizes.remove(str);
            j2 = 0;
        }
        FileUploadOperation fileUploadOperation = new FileUploadOperation(fileLoader.currentAccount, str, z, j2, i);
        FileLoaderDelegate fileLoaderDelegate = fileLoader.delegate;
        if (fileLoaderDelegate != null && j != 0) {
            fileLoaderDelegate.fileUploadProgressChanged(fileUploadOperation, str, 0L, j, z);
        }
        if (z) {
            fileLoader.uploadOperationPathsEnc.put(str, fileUploadOperation);
        } else {
            fileLoader.uploadOperationPaths.put(str, fileUploadOperation);
        }
        if (z2) {
            fileUploadOperation = fileUploadOperation;
            fileUploadOperation = fileUploadOperation;
            fileUploadOperation.setForceSmallFile();
        }
        fileUploadOperation = fileUploadOperation;
        fileUploadOperation = fileUploadOperation;
        fileUploadOperation.setDelegate(fileLoader.new AnonymousClass1(z, str, z3));
        if (z3) {
            int i2 = fileLoader.currentUploadSmallOperationsCount;
            if (i2 < 1) {
                fileLoader.currentUploadSmallOperationsCount = i2 + 1;
                fileUploadOperation.start();
                return;
            } else {
                fileLoader.uploadSmallOperationQueue.add(fileUploadOperation);
                return;
            }
        }
        int i3 = fileLoader.currentUploadOperationsCount;
        if (i3 < 1) {
            fileLoader.currentUploadOperationsCount = i3 + 1;
            fileUploadOperation.start();
        } else {
            fileLoader.uploadOperationQueue.add(fileUploadOperation);
        }
    }

    class AnonymousClass1 implements FileUploadOperation.FileUploadOperationDelegate {
        final boolean val$encrypted;
        final String val$location;
        final boolean val$small;

        AnonymousClass1(boolean z, String str, boolean z2) {
            this.val$encrypted = z;
            this.val$location = str;
            this.val$small = z2;
        }

        @Override
        public void didFinishUploadingFile(final FileUploadOperation fileUploadOperation, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2) {
            DispatchQueue dispatchQueue = FileLoader.fileLoaderQueue;
            final boolean z = this.val$encrypted;
            final String str = this.val$location;
            final boolean z2 = this.val$small;
            dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoader.AnonymousClass1.m443$r8$lambda$Rs3O13V_5hw4u4o2C0PygpoFfw(this.f$0, z, str, z2, inputFile, inputEncryptedFile, bArr, bArr2, fileUploadOperation);
                }
            });
        }

        public static void m443$r8$lambda$Rs3O13V_5hw4u4o2C0PygpoFfw(AnonymousClass1 anonymousClass1, boolean z, String str, boolean z2, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
            FileUploadOperation fileUploadOperation2;
            FileUploadOperation fileUploadOperation3;
            if (z) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (z2) {
                FileLoader.access$810(FileLoader.this);
                if (FileLoader.this.currentUploadSmallOperationsCount < 1 && (fileUploadOperation3 = (FileUploadOperation) FileLoader.this.uploadSmallOperationQueue.poll()) != null) {
                    FileLoader.access$808(FileLoader.this);
                    fileUploadOperation3.start();
                }
            } else {
                FileLoader.access$1010(FileLoader.this);
                if (FileLoader.this.currentUploadOperationsCount < 1 && (fileUploadOperation2 = (FileUploadOperation) FileLoader.this.uploadOperationQueue.poll()) != null) {
                    FileLoader.access$1008(FileLoader.this);
                    fileUploadOperation2.start();
                }
            }
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidUploaded(str, inputFile, inputEncryptedFile, bArr, bArr2, fileUploadOperation.getTotalFileSize());
            }
        }

        @Override
        public void didFailedUploadingFile(FileUploadOperation fileUploadOperation) {
            DispatchQueue dispatchQueue = FileLoader.fileLoaderQueue;
            final boolean z = this.val$encrypted;
            final String str = this.val$location;
            final boolean z2 = this.val$small;
            dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoader.AnonymousClass1.$r8$lambda$DFG8Rcj4K3apSJBkoxiDkZQcXP4(this.f$0, z, str, z2);
                }
            });
        }

        public static void $r8$lambda$DFG8Rcj4K3apSJBkoxiDkZQcXP4(AnonymousClass1 anonymousClass1, boolean z, String str, boolean z2) {
            FileUploadOperation fileUploadOperation;
            FileUploadOperation fileUploadOperation2;
            if (z) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidFailedUpload(str, z);
            }
            if (z2) {
                FileLoader.access$810(FileLoader.this);
                if (FileLoader.this.currentUploadSmallOperationsCount >= 1 || (fileUploadOperation2 = (FileUploadOperation) FileLoader.this.uploadSmallOperationQueue.poll()) == null) {
                    return;
                }
                FileLoader.access$808(FileLoader.this);
                fileUploadOperation2.start();
                return;
            }
            FileLoader.access$1010(FileLoader.this);
            if (FileLoader.this.currentUploadOperationsCount >= 1 || (fileUploadOperation = (FileUploadOperation) FileLoader.this.uploadOperationQueue.poll()) == null) {
                return;
            }
            FileLoader.access$1008(FileLoader.this);
            fileUploadOperation.start();
        }

        @Override
        public void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j, long j2) {
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileUploadProgressChanged(fileUploadOperation, this.val$location, j, j2, this.val$encrypted);
            }
        }
    }

    public void setForceStreamLoadingFile(final TLRPC.FileLocation fileLocation, final String str) {
        if (fileLocation == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$Y2FpK_ednifbXGtkp3YXvSjpFII(this.f$0, fileLocation, str);
            }
        });
    }

    public static void $r8$lambda$Y2FpK_ednifbXGtkp3YXvSjpFII(FileLoader fileLoader, TLRPC.FileLocation fileLocation, String str) {
        fileLoader.getClass();
        String attachFileName = getAttachFileName(fileLocation, str);
        fileLoader.forceLoadingFile = attachFileName;
        FileLoadOperation fileLoadOperation = fileLoader.loadOperationPaths.get(attachFileName);
        if (fileLoadOperation != null) {
            if (fileLoadOperation.isPreloadVideoOperation()) {
                fileLoadOperation.setIsPreloadVideoOperation(false);
            }
            fileLoadOperation.setForceRequest(true);
            fileLoadOperation.setPriority(fileLoader.getPriorityValue(4));
            fileLoadOperation.getQueue().remove(fileLoadOperation);
            fileLoadOperation.getQueue().add(fileLoadOperation);
            fileLoadOperation.getQueue().checkLoadingOperations();
        }
    }

    public void cancelLoadFile(TLRPC.Document document) {
        cancelLoadFile(document, false);
    }

    public void cancelLoadFile(TLRPC.Document document, boolean z) {
        cancelLoadFile(document, null, null, null, null, null, z);
    }

    public void cancelLoadFile(SecureDocument secureDocument) {
        cancelLoadFile(null, secureDocument, null, null, null, null, false);
    }

    public void cancelLoadFile(WebFile webFile) {
        cancelLoadFile(null, null, webFile, null, null, null, false);
    }

    public void cancelLoadFile(TLRPC.PhotoSize photoSize) {
        cancelLoadFile(photoSize, false);
    }

    public void cancelLoadFile(TLRPC.PhotoSize photoSize, boolean z) {
        cancelLoadFile(null, null, null, photoSize.location, null, null, z);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str) {
        cancelLoadFile(fileLocation, str, false);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str, boolean z) {
        cancelLoadFile(null, null, null, fileLocation, str, null, z);
    }

    public void cancelLoadFile(String str) {
        cancelLoadFile(null, null, null, null, null, str, true);
    }

    public void cancelLoadFiles(ArrayList<String> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cancelLoadFile(null, null, null, null, null, arrayList.get(i), true);
        }
    }

    private void cancelLoadFile(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.FileLocation fileLocation, String str, final String str2, boolean z) {
        if (fileLocation == null && document == null && webFile == null && secureDocument == null && TextUtils.isEmpty(str2)) {
            return;
        }
        if (fileLocation != null) {
            str2 = getAttachFileName(fileLocation, str);
        } else if (document != null) {
            str2 = getAttachFileName(document);
        } else if (secureDocument != null) {
            str2 = getAttachFileName(secureDocument);
        } else if (webFile != null) {
            str2 = getAttachFileName(webFile);
        }
        LoadOperationUIObject loadOperationUIObjectRemove = this.loadOperationPathsUI.remove(str2);
        Runnable runnable = loadOperationUIObjectRemove != null ? loadOperationUIObjectRemove.loadInternalRunnable : null;
        boolean z2 = loadOperationUIObjectRemove != null;
        if (runnable != null) {
            fileLoaderQueue.cancelRunnable(runnable);
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$y6TnDiAaartuZy2trnc9k7oNMpY(this.f$0, str2);
            }
        });
        if (!z2 || document == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
            }
        });
    }

    public static void $r8$lambda$y6TnDiAaartuZy2trnc9k7oNMpY(FileLoader fileLoader, String str) {
        FileLoadOperation fileLoadOperationRemove = fileLoader.loadOperationPaths.remove(str);
        if (fileLoadOperationRemove != null) {
            fileLoadOperationRemove.getQueue().cancel(fileLoadOperationRemove);
        }
    }

    public void cancel(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation == null) {
            return;
        }
        final String fileName = fileLoadOperation.getFileName();
        LoadOperationUIObject loadOperationUIObjectRemove = this.loadOperationPathsUI.remove(fileName);
        Runnable runnable = loadOperationUIObjectRemove != null ? loadOperationUIObjectRemove.loadInternalRunnable : null;
        boolean z = loadOperationUIObjectRemove != null;
        if (runnable != null) {
            fileLoaderQueue.cancelRunnable(runnable);
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.m438$r8$lambda$2Ctm0RRnO_gT49ZnU7GbCTeMWM(this.f$0, fileName);
            }
        });
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
                }
            });
        }
    }

    public static void m438$r8$lambda$2Ctm0RRnO_gT49ZnU7GbCTeMWM(FileLoader fileLoader, String str) {
        FileLoadOperation fileLoadOperationRemove = fileLoader.loadOperationPaths.remove(str);
        if (fileLoadOperationRemove != null) {
            fileLoadOperationRemove.getQueue().cancel(fileLoadOperationRemove);
        }
    }

    public void changePriority(final int i, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.FileLocation fileLocation, String str, final String str2) {
        if (fileLocation == null && document == null && webFile == null && secureDocument == null && TextUtils.isEmpty(str2)) {
            return;
        }
        if (fileLocation != null) {
            str2 = getAttachFileName(fileLocation, str);
        } else if (document != null) {
            str2 = getAttachFileName(document);
        } else if (secureDocument != null) {
            str2 = getAttachFileName(secureDocument);
        } else if (webFile != null) {
            str2 = getAttachFileName(webFile);
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.m439$r8$lambda$EknGph0ZntSvZj4F4uFewjXlZc(this.f$0, str2, i);
            }
        });
    }

    public static void m439$r8$lambda$EknGph0ZntSvZj4F4uFewjXlZc(FileLoader fileLoader, String str, int i) {
        int priorityValue;
        FileLoadOperation fileLoadOperation = fileLoader.loadOperationPaths.get(str);
        if (fileLoadOperation == null || fileLoadOperation.getPriority() == (priorityValue = fileLoader.getPriorityValue(i))) {
            return;
        }
        fileLoadOperation.setPriority(priorityValue);
        FileLoaderPriorityQueue queue = fileLoadOperation.getQueue();
        queue.remove(fileLoadOperation);
        queue.add(fileLoadOperation);
        queue.checkLoadingOperations();
        FileLog.d("update priority " + str + " position in queue " + fileLoadOperation.getPositionInQueue() + " account=" + fileLoader.currentAccount);
    }

    public void cancelLoadAllFiles() {
        for (final String str : this.loadOperationPathsUI.keySet()) {
            LoadOperationUIObject loadOperationUIObject = this.loadOperationPathsUI.get(str);
            Runnable runnable = loadOperationUIObject != null ? loadOperationUIObject.loadInternalRunnable : null;
            if (runnable != null) {
                fileLoaderQueue.cancelRunnable(runnable);
            }
            fileLoaderQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoader.$r8$lambda$sK43yibFN5OQXnWyJ6fHD8AKFXs(this.f$0, str);
                }
            });
        }
    }

    public static void $r8$lambda$sK43yibFN5OQXnWyJ6fHD8AKFXs(FileLoader fileLoader, String str) {
        FileLoadOperation fileLoadOperationRemove = fileLoader.loadOperationPaths.remove(str);
        if (fileLoadOperationRemove != null) {
            fileLoadOperationRemove.getQueue().cancel(fileLoadOperationRemove);
        }
    }

    public FileUploadOperation findUploadOperationByRequestToken(int i) {
        for (FileUploadOperation fileUploadOperation : this.uploadOperationPaths.values()) {
            if (fileUploadOperation != null && fileUploadOperation.uiRequestTokens.contains(Integer.valueOf(i))) {
                return fileUploadOperation;
            }
        }
        return null;
    }

    public boolean checkUploadCaughtPremiumFloodWait(String str) {
        FileUploadOperation fileUploadOperation;
        if (str == null || (fileUploadOperation = this.uploadOperationPaths.get(str)) == null || !fileUploadOperation.caughtPremiumFloodWait) {
            return false;
        }
        fileUploadOperation.caughtPremiumFloodWait = false;
        return true;
    }

    public FileLoadOperation findLoadOperationByRequestToken(int i) {
        for (FileLoadOperation fileLoadOperation : this.loadOperationPaths.values()) {
            if (fileLoadOperation != null && fileLoadOperation.uiRequestTokens.contains(Integer.valueOf(i))) {
                return fileLoadOperation;
            }
        }
        return null;
    }

    public boolean checkLoadCaughtPremiumFloodWait(String str) {
        FileLoadOperation fileLoadOperation;
        if (str == null || (fileLoadOperation = this.loadOperationPaths.get(str)) == null || !fileLoadOperation.caughtPremiumFloodWait) {
            return false;
        }
        fileLoadOperation.caughtPremiumFloodWait = false;
        return true;
    }

    public boolean isLoadingFile(String str) {
        return str != null && this.loadOperationPathsUI.containsKey(str);
    }

    public float getBufferedProgressFromPosition(float f, String str) {
        FileLoadOperation fileLoadOperation;
        if (TextUtils.isEmpty(str) || (fileLoadOperation = this.loadOperationPaths.get(str)) == null) {
            return 0.0f;
        }
        return fileLoadOperation.getDownloadedLengthFromOffset(f);
    }

    public File getLocalFile(ImageLocation imageLocation) {
        String attachFileName;
        if (imageLocation == null) {
            return null;
        }
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
        if (tL_fileLocationToBeDeprecated != null) {
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, null);
        } else {
            TLRPC.Document document = imageLocation.document;
            if (document != null) {
                attachFileName = getAttachFileName(document);
            } else {
                WebFile webFile = imageLocation.webFile;
                attachFileName = webFile != null ? getAttachFileName(webFile) : null;
            }
        }
        if (attachFileName == null) {
            return null;
        }
        File file = new File(getDirectory(4), attachFileName);
        if (file.exists()) {
            return file;
        }
        File file2 = new File(getDirectory(0), attachFileName);
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(getDirectory(2), attachFileName);
        if (file3.exists()) {
            return file3;
        }
        File file4 = new File(getDirectory(5), attachFileName);
        if (file4.exists()) {
            return file4;
        }
        return null;
    }

    public void loadFile(ImageLocation imageLocation, Object obj, String str, int i, int i2) {
        if (imageLocation == null) {
            return;
        }
        loadFile(imageLocation.document, imageLocation.secureDocument, imageLocation.webFile, imageLocation.location, imageLocation, obj, str, imageLocation.getSize(), i, (i2 != 0 || (!imageLocation.isEncrypted() && (imageLocation.photoSize == null || imageLocation.getSize() != 0))) ? i2 : 1);
    }

    public void loadFile(SecureDocument secureDocument, int i) {
        if (secureDocument == null) {
            return;
        }
        loadFile(null, secureDocument, null, null, null, null, null, 0L, i, 1);
    }

    public void loadFile(TLRPC.Document document, Object obj, int i, int i2) {
        if (document == null) {
            return;
        }
        loadFile(document, null, null, null, null, obj, null, 0L, i, (i2 != 0 || document.key == null) ? i2 : 1);
    }

    public void loadFile(WebFile webFile, int i, int i2) {
        loadFile(null, null, webFile, null, null, null, null, 0L, i, i2);
    }

    public FileLoadOperation loadFileInternal(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j, int i, FileLoadOperationStream fileLoadOperationStream, long j2, boolean z, int i2) {
        String str2;
        String str3;
        String attachFileName;
        int i3;
        ?? r12;
        FileLoadOperation fileLoadOperation;
        long j3;
        int i4;
        int i5;
        FileLoadOperation fileLoadOperation2;
        int i6;
        long j4;
        boolean z2;
        FileLoadOperation fileLoadOperation3;
        FileLoadOperation fileLoadOperation4;
        int iClamp;
        boolean z3;
        FileLoaderPriorityQueue fileLoaderPriorityQueue;
        long j5;
        int i7;
        File directory;
        String str4;
        String path;
        int i8;
        String name;
        File parentFile;
        boolean z4;
        File directory2;
        File directory3;
        boolean z5;
        boolean z6;
        File file;
        FileLoadOperation fileLoadOperation5;
        FileStreamLoadOperation fileStreamLoadOperation;
        boolean z7;
        boolean z8;
        FileLoadOperation fileLoadOperation6;
        boolean z9;
        AnonymousClass1 anonymousClass1 = null;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, str2);
        } else {
            str2 = str;
            if (secureDocument != null) {
                attachFileName = getAttachFileName(secureDocument);
            } else if (document != null) {
                attachFileName = getAttachFileName(document);
            } else {
                if (webFile != null) {
                    attachFileName = getAttachFileName(webFile);
                } else {
                    str3 = null;
                }
                if (str3 != null || str3.contains("-2147483648")) {
                    return null;
                }
                if (str3.startsWith("0_0")) {
                    FileLog.e(new RuntimeException("cant get hash from " + document));
                    return null;
                }
                if (i2 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
                    this.loadOperationPathsUI.put(str3, new LoadOperationUIObject(anonymousClass1));
                }
                if (document != null && (obj instanceof MessageObject)) {
                    MessageObject messageObject = (MessageObject) obj;
                    if (messageObject.putInDownloadsStore && !messageObject.isAnyKindOfSticker()) {
                        getDownloadController().startDownloadFile(document, messageObject);
                    }
                }
                FileLoadOperation fileLoadOperation7 = this.loadOperationPaths.get(str3);
                int priorityValue = getPriorityValue(i);
                String str5 = str3;
                if (fileLoadOperation7 != null) {
                    if (i2 != 10 && fileLoadOperation7.isPreloadVideoOperation()) {
                        fileLoadOperation7.setIsPreloadVideoOperation(false);
                    }
                    fileLoadOperation7.setForceRequest(priorityValue > 0);
                    fileLoadOperation7.setStream(fileLoadOperationStream, z, j2);
                    if (fileLoadOperation7.getPriority() != priorityValue) {
                        fileLoadOperation7.setPriority(priorityValue);
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    fileLoadOperation7.getQueue().add(fileLoadOperation7);
                    fileLoadOperation7.updateProgress();
                    if (z9) {
                        fileLoadOperation7.getQueue().checkLoadingOperations();
                    }
                    return fileLoadOperation7;
                }
                int i9 = 10;
                File directory4 = getDirectory(4);
                int i10 = 3;
                if (secureDocument != null) {
                    i3 = priorityValue;
                    j3 = 0;
                    z8 = true;
                    i4 = 0;
                    fileLoadOperation6 = new FileLoadOperation(secureDocument);
                } else {
                    if (tL_fileLocationToBeDeprecated != null) {
                        long j6 = tL_fileLocationToBeDeprecated.volume_id;
                        i3 = priorityValue;
                        z2 = true;
                        i4 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
                        fileLoadOperation3 = new FileLoadOperation(imageLocation, obj, str2, j);
                        j3 = j6;
                        i9 = 10;
                    } else {
                        i3 = priorityValue;
                        r12 = 1;
                        r12 = 1;
                        r12 = 1;
                        r12 = 1;
                        r12 = 1;
                        z2 = true;
                        z8 = true;
                        if (document != null) {
                            FileLoadOperation fileLoadOperation8 = new FileLoadOperation(document, obj);
                            if (MessageObject.isVoiceDocument(document)) {
                                fileLoadOperation = fileLoadOperation7;
                                j4 = 0;
                                i6 = 0;
                                i10 = 1;
                            } else if (MessageObject.isVideoDocument(document)) {
                                fileLoadOperation = fileLoadOperation7;
                                long j7 = document.id;
                                i6 = document.dc_id;
                                j4 = j7;
                                i10 = 2;
                            } else {
                                fileLoadOperation = fileLoadOperation7;
                                long j8 = document.id;
                                i6 = document.dc_id;
                                j4 = j8;
                            }
                            if (MessageObject.isRoundVideoDocument(document)) {
                                i5 = i10;
                                j3 = 0;
                                i4 = 0;
                                fileLoadOperation4 = fileLoadOperation8;
                            } else {
                                i4 = i6;
                                j3 = j4;
                                i5 = i10;
                                fileLoadOperation4 = fileLoadOperation8;
                            }
                        } else if (webFile != null) {
                            fileLoadOperation2 = new FileLoadOperation(this.currentAccount, webFile);
                            fileLoadOperation = fileLoadOperation2;
                            if (webFile.location != null) {
                                j3 = 0;
                                i4 = 0;
                                i5 = 4;
                                fileLoadOperation4 = fileLoadOperation;
                            } else if (MessageObject.isVoiceWebDocument(webFile)) {
                                j3 = 0;
                                i4 = 0;
                                i5 = 1;
                                fileLoadOperation4 = fileLoadOperation2;
                            } else if (MessageObject.isVideoWebDocument(webFile)) {
                                j3 = 0;
                                i4 = 0;
                                i5 = 2;
                                fileLoadOperation4 = fileLoadOperation2;
                            } else {
                                j3 = 0;
                                i4 = 0;
                                if (MessageObject.isImageWebDocument(webFile)) {
                                }
                            }
                        } else {
                            j3 = 0;
                            i4 = 0;
                            i5 = 4;
                            fileLoadOperation4 = fileLoadOperation;
                        }
                        iClamp = Utilities.clamp(fileLoadOperation4.getDatacenterId() - r12, 4, 0);
                        z3 = obj instanceof TL_stories.StoryItem;
                        if (fileLoadOperation4.totalBytesCount <= 20971520 || z3) {
                            fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                        } else {
                            fileLoaderPriorityQueue = this.smallFilesQueue[iClamp];
                        }
                        FileLoaderPriorityQueue fileLoaderPriorityQueue2 = fileLoaderPriorityQueue;
                        if (i2 == 0 && i2 != i9 && !z3) {
                            if (i2 == 2) {
                                fileLoadOperation4.setEncryptFile(r12);
                            }
                            str4 = str5;
                            directory = directory4;
                            j5 = j3;
                            i7 = i5;
                        } else if (j3 != 0) {
                            path = getFileDatabase().getPath(j3, i4, i5, true);
                            j5 = j3;
                            i8 = i4;
                            i7 = i5;
                            if (path != null) {
                                file = new File(path);
                                if (file.exists()) {
                                    name = file.getName();
                                    parentFile = file.getParentFile();
                                    z4 = true;
                                } else {
                                    name = str5;
                                    parentFile = directory4;
                                    z4 = false;
                                }
                            } else {
                                name = str5;
                                parentFile = directory4;
                                z4 = false;
                            }
                            if (!z4) {
                                directory2 = getDirectory(i7);
                                if (z3) {
                                    directory3 = getDirectory(6);
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                } else {
                                    if ((i7 != 0 || i7 == 2) && canSaveToPublicStorage(obj)) {
                                        if (i7 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z6 = true;
                                        }
                                        z5 = z6;
                                        parentFile = directory2;
                                        name = str5;
                                    } else if (!TextUtils.isEmpty(getDocumentFileName(document)) && canSaveAsFile(obj)) {
                                        String documentFileName = getDocumentFileName(document);
                                        File directory5 = getDirectory(5);
                                        if (directory5 != null) {
                                            name = documentFileName;
                                            parentFile = directory5;
                                            z5 = true;
                                        } else {
                                            parentFile = directory2;
                                            name = documentFileName;
                                            z5 = false;
                                        }
                                    }
                                    z6 = false;
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                }
                                if (z5) {
                                    fileLoadOperation4.pathSaveData = new FilePathDatabase.PathData(j5, i8, i7);
                                }
                            }
                            str4 = name;
                            directory = parentFile;
                        } else {
                            j5 = j3;
                            i7 = i5;
                            directory = getDirectory(i7);
                            str4 = str5;
                        }
                        fileLoadOperation5 = fileLoadOperation4;
                        fileLoadOperation5.setPaths(this.currentAccount, str5, fileLoaderPriorityQueue2, directory, directory4, str4);
                        if (i2 == i9) {
                            fileLoadOperation5.setIsPreloadVideoOperation(r12);
                        }
                        fileLoadOperation5.setDelegate(new AnonymousClass2(obj, document, str5, i7));
                        this.loadOperationPaths.put(str5, fileLoadOperation5);
                        int i11 = i3;
                        fileLoadOperation5.setPriority(i11);
                        if (fileLoadOperationStream == null) {
                            fileStreamLoadOperation = FileStreamLoadOperation.allStreams.get(Long.valueOf(j5));
                        } else {
                            fileStreamLoadOperation = fileLoadOperationStream;
                        }
                        if (fileStreamLoadOperation != null) {
                            fileLoadOperation5.setStream(fileStreamLoadOperation, z, j2);
                        }
                        fileLoaderPriorityQueue2.add(fileLoadOperation5);
                        if (fileLoadOperation5.isStory || i11 < 1048576) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        fileLoaderPriorityQueue2.checkLoadingOperations(z7);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("create load operation fileName=" + str5 + " documentName=" + getDocumentFileName(document) + " size=" + AndroidUtilities.formatFileSize(fileLoadOperation5.totalBytesCount) + " position in queue " + fileLoadOperation5.getPositionInQueue() + " account=" + this.currentAccount + " cacheType=" + i2 + " priority=" + fileLoadOperation5.getPriority() + " stream=" + fileStreamLoadOperation);
                        }
                        return fileLoadOperation5;
                    }
                    fileLoadOperation6 = fileLoadOperation2;
                    fileLoadOperation3 = fileLoadOperation2;
                    i5 = 0;
                    fileLoadOperation4 = fileLoadOperation3;
                    r12 = z2;
                    iClamp = Utilities.clamp(fileLoadOperation4.getDatacenterId() - r12, 4, 0);
                    z3 = obj instanceof TL_stories.StoryItem;
                    if (fileLoadOperation4.totalBytesCount <= 20971520) {
                        fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                    } else {
                        fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                    }
                    FileLoaderPriorityQueue fileLoaderPriorityQueue3 = fileLoaderPriorityQueue;
                    if (i2 == 0) {
                        if (j3 != 0) {
                            path = getFileDatabase().getPath(j3, i4, i5, true);
                            j5 = j3;
                            i8 = i4;
                            i7 = i5;
                            if (path != null) {
                                file = new File(path);
                                if (file.exists()) {
                                    name = file.getName();
                                    parentFile = file.getParentFile();
                                    z4 = true;
                                } else {
                                    name = str5;
                                    parentFile = directory4;
                                    z4 = false;
                                }
                            } else {
                                name = str5;
                                parentFile = directory4;
                                z4 = false;
                            }
                            if (!z4) {
                                directory2 = getDirectory(i7);
                                if (z3) {
                                    directory3 = getDirectory(6);
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                } else {
                                    if (i7 != 0) {
                                        if (i7 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z6 = true;
                                        }
                                        z5 = z6;
                                        parentFile = directory2;
                                        name = str5;
                                    } else {
                                        if (i7 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z6 = true;
                                        }
                                        z5 = z6;
                                        parentFile = directory2;
                                        name = str5;
                                    }
                                    z6 = false;
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                }
                                if (z5) {
                                    fileLoadOperation4.pathSaveData = new FilePathDatabase.PathData(j5, i8, i7);
                                }
                            }
                            str4 = name;
                            directory = parentFile;
                        } else {
                            j5 = j3;
                            i7 = i5;
                            directory = getDirectory(i7);
                            str4 = str5;
                        }
                    } else if (j3 != 0) {
                        path = getFileDatabase().getPath(j3, i4, i5, true);
                        j5 = j3;
                        i8 = i4;
                        i7 = i5;
                        if (path != null) {
                            file = new File(path);
                            if (file.exists()) {
                                name = file.getName();
                                parentFile = file.getParentFile();
                                z4 = true;
                            } else {
                                name = str5;
                                parentFile = directory4;
                                z4 = false;
                            }
                        } else {
                            name = str5;
                            parentFile = directory4;
                            z4 = false;
                        }
                        if (!z4) {
                            directory2 = getDirectory(i7);
                            if (z3) {
                                directory3 = getDirectory(6);
                                if (directory3 != null) {
                                    directory2 = directory3;
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z5 = z6;
                                parentFile = directory2;
                                name = str5;
                            } else {
                                if (i7 != 0) {
                                    if (i7 == 0) {
                                        directory3 = getDirectory(100);
                                    } else {
                                        directory3 = getDirectory(101);
                                    }
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z6 = true;
                                    }
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                } else {
                                    if (i7 == 0) {
                                        directory3 = getDirectory(100);
                                    } else {
                                        directory3 = getDirectory(101);
                                    }
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z6 = true;
                                    }
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                }
                                z6 = false;
                                z5 = z6;
                                parentFile = directory2;
                                name = str5;
                            }
                            if (z5) {
                                fileLoadOperation4.pathSaveData = new FilePathDatabase.PathData(j5, i8, i7);
                            }
                        }
                        str4 = name;
                        directory = parentFile;
                    } else {
                        j5 = j3;
                        i7 = i5;
                        directory = getDirectory(i7);
                        str4 = str5;
                    }
                    fileLoadOperation5 = fileLoadOperation4;
                    fileLoadOperation5.setPaths(this.currentAccount, str5, fileLoaderPriorityQueue3, directory, directory4, str4);
                    if (i2 == i9) {
                        fileLoadOperation5.setIsPreloadVideoOperation(r12);
                    }
                    fileLoadOperation5.setDelegate(new AnonymousClass2(obj, document, str5, i7));
                    this.loadOperationPaths.put(str5, fileLoadOperation5);
                    int i12 = i3;
                    fileLoadOperation5.setPriority(i12);
                    if (fileLoadOperationStream == null) {
                        fileStreamLoadOperation = FileStreamLoadOperation.allStreams.get(Long.valueOf(j5));
                    } else {
                        fileStreamLoadOperation = fileLoadOperationStream;
                    }
                    if (fileStreamLoadOperation != null) {
                        fileLoadOperation5.setStream(fileStreamLoadOperation, z, j2);
                    }
                    fileLoaderPriorityQueue3.add(fileLoadOperation5);
                    if (fileLoadOperation5.isStory) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    fileLoaderPriorityQueue3.checkLoadingOperations(z7);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("create load operation fileName=" + str5 + " documentName=" + getDocumentFileName(document) + " size=" + AndroidUtilities.formatFileSize(fileLoadOperation5.totalBytesCount) + " position in queue " + fileLoadOperation5.getPositionInQueue() + " account=" + this.currentAccount + " cacheType=" + i2 + " priority=" + fileLoadOperation5.getPriority() + " stream=" + fileStreamLoadOperation);
                    }
                    return fileLoadOperation5;
                }
                fileLoadOperation6 = fileLoadOperation2;
                fileLoadOperation3 = fileLoadOperation2;
                i5 = 3;
                fileLoadOperation4 = fileLoadOperation6;
                r12 = z8;
                iClamp = Utilities.clamp(fileLoadOperation4.getDatacenterId() - r12, 4, 0);
                z3 = obj instanceof TL_stories.StoryItem;
                if (fileLoadOperation4.totalBytesCount <= 20971520) {
                    fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                } else {
                    fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                }
                FileLoaderPriorityQueue fileLoaderPriorityQueue4 = fileLoaderPriorityQueue;
                if (i2 == 0) {
                    if (j3 != 0) {
                        path = getFileDatabase().getPath(j3, i4, i5, true);
                        j5 = j3;
                        i8 = i4;
                        i7 = i5;
                        if (path != null) {
                            file = new File(path);
                            if (file.exists()) {
                                name = file.getName();
                                parentFile = file.getParentFile();
                                z4 = true;
                            } else {
                                name = str5;
                                parentFile = directory4;
                                z4 = false;
                            }
                        } else {
                            name = str5;
                            parentFile = directory4;
                            z4 = false;
                        }
                        if (!z4) {
                            directory2 = getDirectory(i7);
                            if (z3) {
                                directory3 = getDirectory(6);
                                if (directory3 != null) {
                                    directory2 = directory3;
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z5 = z6;
                                parentFile = directory2;
                                name = str5;
                            } else {
                                if (i7 != 0) {
                                    if (i7 == 0) {
                                        directory3 = getDirectory(100);
                                    } else {
                                        directory3 = getDirectory(101);
                                    }
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z6 = true;
                                    }
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                } else {
                                    if (i7 == 0) {
                                        directory3 = getDirectory(100);
                                    } else {
                                        directory3 = getDirectory(101);
                                    }
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z6 = true;
                                    }
                                    z5 = z6;
                                    parentFile = directory2;
                                    name = str5;
                                }
                                z6 = false;
                                z5 = z6;
                                parentFile = directory2;
                                name = str5;
                            }
                            if (z5) {
                                fileLoadOperation4.pathSaveData = new FilePathDatabase.PathData(j5, i8, i7);
                            }
                        }
                        str4 = name;
                        directory = parentFile;
                    } else {
                        j5 = j3;
                        i7 = i5;
                        directory = getDirectory(i7);
                        str4 = str5;
                    }
                } else if (j3 != 0) {
                    path = getFileDatabase().getPath(j3, i4, i5, true);
                    j5 = j3;
                    i8 = i4;
                    i7 = i5;
                    if (path != null) {
                        file = new File(path);
                        if (file.exists()) {
                            name = file.getName();
                            parentFile = file.getParentFile();
                            z4 = true;
                        } else {
                            name = str5;
                            parentFile = directory4;
                            z4 = false;
                        }
                    } else {
                        name = str5;
                        parentFile = directory4;
                        z4 = false;
                    }
                    if (!z4) {
                        directory2 = getDirectory(i7);
                        if (z3) {
                            directory3 = getDirectory(6);
                            if (directory3 != null) {
                                directory2 = directory3;
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            z5 = z6;
                            parentFile = directory2;
                            name = str5;
                        } else {
                            if (i7 != 0) {
                                if (i7 == 0) {
                                    directory3 = getDirectory(100);
                                } else {
                                    directory3 = getDirectory(101);
                                }
                                if (directory3 != null) {
                                    directory2 = directory3;
                                    z6 = true;
                                }
                                z5 = z6;
                                parentFile = directory2;
                                name = str5;
                            } else {
                                if (i7 == 0) {
                                    directory3 = getDirectory(100);
                                } else {
                                    directory3 = getDirectory(101);
                                }
                                if (directory3 != null) {
                                    directory2 = directory3;
                                    z6 = true;
                                }
                                z5 = z6;
                                parentFile = directory2;
                                name = str5;
                            }
                            z6 = false;
                            z5 = z6;
                            parentFile = directory2;
                            name = str5;
                        }
                        if (z5) {
                            fileLoadOperation4.pathSaveData = new FilePathDatabase.PathData(j5, i8, i7);
                        }
                    }
                    str4 = name;
                    directory = parentFile;
                } else {
                    j5 = j3;
                    i7 = i5;
                    directory = getDirectory(i7);
                    str4 = str5;
                }
                fileLoadOperation5 = fileLoadOperation4;
                fileLoadOperation5.setPaths(this.currentAccount, str5, fileLoaderPriorityQueue4, directory, directory4, str4);
                if (i2 == i9) {
                    fileLoadOperation5.setIsPreloadVideoOperation(r12);
                }
                fileLoadOperation5.setDelegate(new AnonymousClass2(obj, document, str5, i7));
                this.loadOperationPaths.put(str5, fileLoadOperation5);
                int i13 = i3;
                fileLoadOperation5.setPriority(i13);
                if (fileLoadOperationStream == null) {
                    fileStreamLoadOperation = FileStreamLoadOperation.allStreams.get(Long.valueOf(j5));
                } else {
                    fileStreamLoadOperation = fileLoadOperationStream;
                }
                if (fileStreamLoadOperation != null) {
                    fileLoadOperation5.setStream(fileStreamLoadOperation, z, j2);
                }
                fileLoaderPriorityQueue4.add(fileLoadOperation5);
                if (fileLoadOperation5.isStory) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                fileLoaderPriorityQueue4.checkLoadingOperations(z7);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("create load operation fileName=" + str5 + " documentName=" + getDocumentFileName(document) + " size=" + AndroidUtilities.formatFileSize(fileLoadOperation5.totalBytesCount) + " position in queue " + fileLoadOperation5.getPositionInQueue() + " account=" + this.currentAccount + " cacheType=" + i2 + " priority=" + fileLoadOperation5.getPriority() + " stream=" + fileStreamLoadOperation);
                }
                return fileLoadOperation5;
            }
        }
        str3 = attachFileName;
        if (str3 != null) {
        }
        return null;
    }

    class AnonymousClass2 implements FileLoadOperation.FileLoadOperationDelegate {
        final TLRPC.Document val$document;
        final String val$fileName;
        final int val$finalType;
        final Object val$parentObject;

        AnonymousClass2(Object obj, TLRPC.Document document, String str, int i) {
            this.val$parentObject = obj;
            this.val$document = document;
            this.val$fileName = str;
            this.val$finalType = i;
        }

        @Override
        public void didPreFinishLoading(final FileLoadOperation fileLoadOperation, File file) {
            final FileLoaderPriorityQueue queue = fileLoadOperation.getQueue();
            FileLoader.fileLoaderQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoader.AnonymousClass2.m444$r8$lambda$mxbBfeFTETIsHMKtk_6I_mmOw(fileLoadOperation, queue);
                }
            });
        }

        public static void m444$r8$lambda$mxbBfeFTETIsHMKtk_6I_mmOw(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue) {
            fileLoadOperation.preFinished = true;
            fileLoaderPriorityQueue.checkLoadingOperations();
        }

        @Override
        public void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file) {
            if (!fileLoadOperation.isPreloadVideoOperation() && fileLoadOperation.isPreloadFinished()) {
                FileLoader.this.checkDownloadQueue(fileLoadOperation, fileLoadOperation.getQueue(), 0L);
                return;
            }
            FilePathDatabase.FileMeta fileMetadataFromParent = FileLoader.getFileMetadataFromParent(FileLoader.this.currentAccount, this.val$parentObject);
            if (fileMetadataFromParent != null) {
                FileLoader.this.getFileLoader().getFileDatabase().saveFileDialogId(file, fileMetadataFromParent);
            }
            Object obj = this.val$parentObject;
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                if (this.val$document != null && messageObject.putInDownloadsStore) {
                    FileLoader.this.getDownloadController().onDownloadComplete(messageObject);
                }
            }
            if (!fileLoadOperation.isPreloadVideoOperation()) {
                FileLoader.this.loadOperationPathsUI.remove(this.val$fileName);
                if (FileLoader.this.delegate != null) {
                    FileLoader.this.delegate.fileDidLoaded(this.val$fileName, file, this.val$parentObject, this.val$finalType);
                }
            }
            FileLoader.this.checkDownloadQueue(fileLoadOperation, fileLoadOperation.getQueue(), 0L);
        }

        @Override
        public void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i) {
            FileLoader.this.loadOperationPathsUI.remove(this.val$fileName);
            FileLoader.this.checkDownloadQueue(fileLoadOperation, fileLoadOperation.getQueue());
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidFailedLoad(this.val$fileName, i);
            }
            if (this.val$document != null && (this.val$parentObject instanceof MessageObject) && i == 0) {
                FileLoader.this.getDownloadController().onDownloadFail((MessageObject) this.val$parentObject, i);
            } else if (i == -1) {
                LaunchActivity.checkFreeDiscSpaceStatic(2);
            }
        }

        @Override
        public void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j, long j2) {
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileLoadProgressChanged(fileLoadOperation, this.val$fileName, j, j2);
            }
        }

        @Override
        public void saveFilePath(FilePathDatabase.PathData pathData, File file) {
            FileLoader.this.getFileDatabase().putPath(pathData.id, pathData.dc, pathData.type, 0, file != null ? file.toString() : null);
        }

        @Override
        public boolean hasAnotherRefOnFile(String str) {
            return FileLoader.this.getFileDatabase().hasAnotherRefOnFile(str);
        }

        @Override
        public boolean isLocallyCreatedFile(String str) {
            return FileLoader.this.getFileDatabase().isLocallyCreated(str);
        }
    }

    public static boolean canSaveAsFile(Object obj) {
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.isDocument() && !messageObject.isRoundVideo() && !messageObject.isVoice()) {
                return true;
            }
        }
        return false;
    }

    private boolean canSaveToPublicStorage(Object obj) {
        FilePathDatabase.FileMeta fileMetadataFromParent;
        MessageObject messageObject;
        if (!BuildVars.NO_SCOPED_STORAGE && (fileMetadataFromParent = getFileMetadataFromParent(this.currentAccount, obj)) != null) {
            long j = fileMetadataFromParent.dialogId;
            if (!getMessagesController().isPeerNoForwards(j) && !DialogObject.isEncryptedDialog(j)) {
                int i = 2;
                if (obj instanceof MessageObject) {
                    messageObject = (MessageObject) obj;
                    if (messageObject.isRoundVideo() || messageObject.isVoice() || messageObject.isAnyKindOfSticker() || messageObject.messageOwner.noforwards) {
                        return false;
                    }
                } else {
                    int i2 = fileMetadataFromParent.messageType;
                    if (i2 != 5 && i2 != 13 && i2 != 2) {
                        messageObject = null;
                    }
                }
                if (j >= 0) {
                    i = 1;
                } else if (ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(-j)))) {
                    i = 4;
                }
                if (SaveToGallerySettingsHelper.needSave(i, fileMetadataFromParent, messageObject, this.currentAccount)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void addOperationToQueue(FileLoadOperation fileLoadOperation, LinkedList<FileLoadOperation> linkedList) {
        int priority = fileLoadOperation.getPriority();
        if (priority > 0) {
            int size = linkedList.size();
            int size2 = linkedList.size();
            for (int i = 0; i < size2; i++) {
                if (linkedList.get(i).getPriority() < priority) {
                    size = i;
                    break;
                }
            }
            linkedList.add(size, fileLoadOperation);
            return;
        }
        linkedList.add(fileLoadOperation);
    }

    private void loadFile(final TLRPC.Document document, final SecureDocument secureDocument, final WebFile webFile, final TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, final ImageLocation imageLocation, final Object obj, String str, final long j, final int i, final int i2) {
        final String str2;
        String str3;
        String attachFileName;
        Runnable runnable;
        AnonymousClass1 anonymousClass1 = null;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, str2);
        } else {
            str2 = str;
            if (document != null) {
                attachFileName = getAttachFileName(document);
            } else {
                if (webFile != null) {
                    attachFileName = getAttachFileName(webFile);
                } else {
                    str3 = null;
                }
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.loadFileInternal(document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j, i, null, 0L, false, i2);
                    }
                };
                if (i2 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
                    LoadOperationUIObject loadOperationUIObject = new LoadOperationUIObject(anonymousClass1);
                    loadOperationUIObject.loadInternalRunnable = runnable;
                    this.loadOperationPathsUI.put(str3, loadOperationUIObject);
                }
                fileLoaderQueue.postRunnable(runnable);
            }
        }
        str3 = attachFileName;
        runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadFileInternal(document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j, i, null, 0L, false, i2);
            }
        };
        if (i2 != 10) {
            LoadOperationUIObject loadOperationUIObject2 = new LoadOperationUIObject(anonymousClass1);
            loadOperationUIObject2.loadInternalRunnable = runnable;
            this.loadOperationPathsUI.put(str3, loadOperationUIObject2);
        }
        fileLoaderQueue.postRunnable(runnable);
    }

    protected FileLoadOperation loadStreamFile(FileLoadOperationStream fileLoadOperationStream, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j, boolean z, int i) {
        return loadStreamFile(fileLoadOperationStream, document, imageLocation, obj, j, z, i, document == null ? 1 : 0);
    }

    protected FileLoadOperation loadStreamFile(final FileLoadOperationStream fileLoadOperationStream, final TLRPC.Document document, final ImageLocation imageLocation, final Object obj, final long j, final boolean z, final int i, final int i2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final FileLoadOperation[] fileLoadOperationArr = new FileLoadOperation[1];
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.m441$r8$lambda$pURvZN6hmOuxGELs9q0TzMbtFE(this.f$0, fileLoadOperationArr, document, imageLocation, obj, i, fileLoadOperationStream, j, z, i2, countDownLatch);
            }
        });
        awaitFileLoadOperation(countDownLatch, true);
        return fileLoadOperationArr[0];
    }

    public static void m441$r8$lambda$pURvZN6hmOuxGELs9q0TzMbtFE(FileLoader fileLoader, FileLoadOperation[] fileLoadOperationArr, TLRPC.Document document, ImageLocation imageLocation, Object obj, int i, FileLoadOperationStream fileLoadOperationStream, long j, boolean z, int i2, CountDownLatch countDownLatch) {
        fileLoader.getClass();
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || imageLocation == null) ? null : imageLocation.location;
        if (document == null && imageLocation != null) {
            str = "mp4";
        }
        fileLoadOperationArr[0] = fileLoader.loadFileInternal(document, null, null, tL_fileLocationToBeDeprecated, imageLocation, obj, str, (document != null || imageLocation == null) ? 0L : imageLocation.currentSize, i, fileLoadOperationStream, j, z, i2);
        countDownLatch.countDown();
    }

    private void awaitFileLoadOperation(CountDownLatch countDownLatch, boolean z) {
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e((Throwable) e, false);
            if (z) {
                awaitFileLoadOperation(countDownLatch, false);
            }
        }
    }

    public void checkDownloadQueue(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue) {
        checkDownloadQueue(fileLoadOperation, fileLoaderPriorityQueue, 0L);
    }

    public void checkDownloadQueue(final FileLoadOperation fileLoadOperation, final FileLoaderPriorityQueue fileLoaderPriorityQueue, long j) {
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$klpcS6sBoAvLATizSwjYSBTU_9Y(this.f$0, fileLoaderPriorityQueue, fileLoadOperation);
            }
        }, j);
    }

    public static void $r8$lambda$klpcS6sBoAvLATizSwjYSBTU_9Y(FileLoader fileLoader, FileLoaderPriorityQueue fileLoaderPriorityQueue, FileLoadOperation fileLoadOperation) {
        fileLoader.getClass();
        if (fileLoaderPriorityQueue.remove(fileLoadOperation)) {
            fileLoader.loadOperationPaths.remove(fileLoadOperation.getFileName());
            fileLoaderPriorityQueue.checkLoadingOperations(fileLoadOperation.isStory);
        }
    }

    public void setDelegate(FileLoaderDelegate fileLoaderDelegate) {
        this.delegate = fileLoaderDelegate;
    }

    public static String getMessageFileName(TLRPC.Message message) {
        TLRPC.WebDocument webDocument;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize2;
        TLRPC.PhotoSize closestPhotoSizeWithSize3;
        if (message == null) {
            return "";
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (closestPhotoSizeWithSize3 = getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                    return getAttachFileName(closestPhotoSizeWithSize3);
                }
            }
        } else {
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
                return getAttachFileName(MessageObject.getMedia(message).document);
            }
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = MessageObject.getMedia(message).photo.sizes;
                if (arrayList2.size() > 0 && (closestPhotoSizeWithSize2 = getClosestPhotoSizeWithSize(arrayList2, AndroidUtilities.getPhotoSize(true), false, null, true)) != null) {
                    return getAttachFileName(closestPhotoSizeWithSize2);
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (MessageObject.getMedia(message).webpage.document != null) {
                    return getAttachFileName(MessageObject.getMedia(message).webpage.document);
                }
                if (MessageObject.getMedia(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = MessageObject.getMedia(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (closestPhotoSizeWithSize = getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize())) != null) {
                        return getAttachFileName(closestPhotoSizeWithSize);
                    }
                }
            } else if ((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaInvoice) && (webDocument = ((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(message)).webPhoto) != null) {
                return Utilities.MD5(webDocument.url) + "." + ImageLoader.getHttpUrlExtension(webDocument.url, getMimeTypePart(webDocument.mime_type));
            }
        }
        return "";
    }

    public File getPathToMessage(TLRPC.Message message) {
        return getPathToMessage(message, true);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z) {
        return getPathToMessage(message, false, z);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z, boolean z2) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.PhotoSize closestPhotoSizeWithSize2;
        TLRPC.PhotoSize closestPhotoSizeWithSize3;
        if (message == null) {
            return new File("");
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (closestPhotoSizeWithSize3 = getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize())) != null) {
                    return getPathToAttach(closestPhotoSizeWithSize3, null, z, z2);
                }
            }
        } else {
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
                return getPathToAttach(MessageObject.getMedia(message).document, null, z || MessageObject.getMedia(message).ttl_seconds != 0, z2);
            }
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = MessageObject.getMedia(message).photo.sizes;
                if (arrayList2.size() > 0 && (closestPhotoSizeWithSize2 = getClosestPhotoSizeWithSize(arrayList2, AndroidUtilities.getPhotoSize(true), false, null, true)) != null) {
                    return getPathToAttach(closestPhotoSizeWithSize2, null, z || MessageObject.getMedia(message).ttl_seconds != 0, z2);
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (MessageObject.getMedia(message).webpage.document != null) {
                    return getPathToAttach(MessageObject.getMedia(message).webpage.document, null, z, z2);
                }
                if (MessageObject.getMedia(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = MessageObject.getMedia(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (closestPhotoSizeWithSize = getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize())) != null) {
                        return getPathToAttach(closestPhotoSizeWithSize, null, z, z2);
                    }
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return getPathToAttach(((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(message)).photo, null, true, z2);
            }
        }
        return new File("");
    }

    public File getPathToAttach(TLObject tLObject) {
        return getPathToAttach(tLObject, null, false);
    }

    public File getPathToAttach(TLObject tLObject, boolean z) {
        return getPathToAttach(tLObject, null, z);
    }

    public File getPathToAttach(TLObject tLObject, String str, boolean z) {
        return getPathToAttach(tLObject, null, str, z, true);
    }

    public File getPathToAttach(TLObject tLObject, String str, boolean z, boolean z2) {
        return getPathToAttach(tLObject, null, str, z, z2);
    }

    public File getPathToAttach(TLObject tLObject, String str, String str2, boolean z, boolean z2) {
        File directory;
        int i;
        int i2;
        File directory2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        String path;
        int i7 = 4;
        long j2 = 0;
        if (z) {
            directory = getDirectory(4);
        } else {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                if (document.key == null) {
                    if (MessageObject.isVoiceDocument(document)) {
                        i7 = 1;
                    } else {
                        i7 = MessageObject.isVideoDocument(document) ? 2 : 3;
                    }
                }
                j = document.id;
                i5 = document.dc_id;
                directory2 = getDirectory(i7);
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return getPathToAttach(getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize(true)), str2, false, z2);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        directory2 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation == null || fileLocation.key != null || ((fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0)) {
                            directory2 = getDirectory(4);
                        } else {
                            directory2 = getDirectory(0);
                        }
                        TLRPC.FileLocation fileLocation2 = photoSize.location;
                        j = fileLocation2.volume_id;
                        i3 = fileLocation2.dc_id;
                        i4 = fileLocation2.local_id;
                    }
                    i7 = 0;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    j = fileLocation3.volume_id;
                    i3 = fileLocation3.dc_id;
                    i4 = fileLocation3.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    if (fileLocation4 == null || fileLocation4.key != null || ((fileLocation4.volume_id == -2147483648L && fileLocation4.local_id < 0) || tL_videoSize.size < 0)) {
                        directory2 = getDirectory(4);
                    } else {
                        directory2 = getDirectory(0);
                        i7 = 0;
                    }
                    TLRPC.FileLocation fileLocation5 = tL_videoSize.location;
                    j = fileLocation5.volume_id;
                    i3 = fileLocation5.dc_id;
                    i4 = fileLocation5.local_id;
                } else {
                    if (tLObject instanceof TLRPC.FileLocation) {
                        TLRPC.FileLocation fileLocation6 = (TLRPC.FileLocation) tLObject;
                        if (fileLocation6.key == null) {
                            j2 = fileLocation6.volume_id;
                            if (j2 == -2147483648L && fileLocation6.local_id < 0) {
                                directory = getDirectory(4);
                                j2 = 0;
                                i = 0;
                            } else {
                                i = fileLocation6.dc_id + (fileLocation6.local_id << 16);
                                directory = getDirectory(0);
                            }
                        } else {
                            directory = getDirectory(4);
                            j2 = 0;
                            i = 0;
                        }
                        i2 = i;
                    } else if ((tLObject instanceof TLRPC.UserProfilePhoto) || (tLObject instanceof TLRPC.ChatPhoto)) {
                        if (str == null) {
                            str = "s";
                        }
                        if ("s".equals(str)) {
                            directory = getDirectory(4);
                        } else {
                            directory = getDirectory(0);
                        }
                    } else if (tLObject instanceof WebFile) {
                        WebFile webFile = (WebFile) tLObject;
                        if (webFile.mime_type.startsWith("image/")) {
                            directory = getDirectory(0);
                        } else if (webFile.mime_type.startsWith("audio/")) {
                            directory = getDirectory(1);
                        } else if (webFile.mime_type.startsWith("video/")) {
                            directory = getDirectory(2);
                        } else {
                            directory = getDirectory(3);
                        }
                    } else {
                        if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof SecureDocument)) {
                            directory = getDirectory(4);
                        } else {
                            directory = null;
                        }
                        i2 = 0;
                    }
                    i6 = 0;
                    if (directory == null) {
                        return new File("");
                    }
                    if (j2 == 0 && (path = getInstance(UserConfig.selectedAccount).getFileDatabase().getPath(j2, i2, i6, z2)) != null) {
                        return new File(path);
                    }
                    return new File(directory, getAttachFileName(tLObject, str2));
                }
                i5 = (i4 << 16) + i3;
            }
            i2 = i5;
            directory = directory2;
            i6 = i7;
            j2 = j;
            if (directory == null) {
                return new File("");
            }
            if (j2 == 0) {
            }
            return new File(directory, getAttachFileName(tLObject, str2));
        }
        i2 = 0;
        i6 = 0;
        if (directory == null) {
            return new File("");
        }
        if (j2 == 0) {
        }
        return new File(directory, getAttachFileName(tLObject, str2));
    }

    public FilePathDatabase getFileDatabase() {
        return this.filePathDatabase;
    }

    public static TLRPC.TL_photoStrippedSize getStrippedPhotoSize(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i) {
        return getClosestPhotoSizeWithSize(arrayList, i, false);
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i, boolean z) {
        return getClosestPhotoSizeWithSize(arrayList, i, z, null, false);
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i, boolean z, TLRPC.PhotoSize photoSize, boolean z2) {
        int iMax;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.PhotoSize photoSize3 = arrayList.get(i3);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z2 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z) {
                        iMax = Math.min(photoSize3.h, photoSize3.w);
                        if (photoSize2 == null || ((i > 100 && (fileLocation2 = photoSize2.location) != null && fileLocation2.dc_id == Integer.MIN_VALUE) || (photoSize3 instanceof TLRPC.TL_photoCachedSize) || (i > i2 && i2 < iMax))) {
                            photoSize2 = photoSize3;
                            i2 = iMax;
                        }
                    } else {
                        iMax = Math.max(photoSize3.w, photoSize3.h);
                        if (photoSize2 == null || ((i > 100 && (fileLocation = photoSize2.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (photoSize3 instanceof TLRPC.TL_photoCachedSize) || (iMax <= i && i2 < iMax))) {
                            photoSize2 = photoSize3;
                            i2 = iMax;
                        }
                    }
                }
            }
        }
        return photoSize2;
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i) {
        return getClosestVideoSizeWithSize(arrayList, i, false);
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i, boolean z) {
        return getClosestVideoSizeWithSize(arrayList, i, z, false);
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i, boolean z, boolean z2) {
        int iMax;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.VideoSize videoSize2 = arrayList.get(i3);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    if (z) {
                        iMax = Math.min(videoSize2.h, videoSize2.w);
                        if (videoSize == null || ((i > 100 && (fileLocation2 = videoSize.location) != null && fileLocation2.dc_id == Integer.MIN_VALUE) || (i > i2 && i2 < iMax))) {
                            videoSize = videoSize2;
                            i2 = iMax;
                        }
                    } else {
                        iMax = Math.max(videoSize2.w, videoSize2.h);
                        if (videoSize == null || ((i > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (iMax <= i && i2 < iMax))) {
                            videoSize = videoSize2;
                            i2 = iMax;
                        }
                    }
                }
            }
        }
        return videoSize;
    }

    public static TLRPC.TL_photoPathSize getPathPhotoSize(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.PhotoSize photoSize = arrayList.get(i);
                if (!(photoSize instanceof TLRPC.TL_photoPathSize)) {
                    return (TLRPC.TL_photoPathSize) photoSize;
                }
            }
        }
        return null;
    }

    public static String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(46) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String fixFileName(String str) {
        return str != null ? str.replaceAll("[\u0001-\u001f<>\u202e:\"/\\\\|?*\u007f]+", "").trim() : str;
    }

    public static String getDocumentFileName(TLRPC.Document document) {
        String str = null;
        if (document == null) {
            return null;
        }
        String str2 = document.file_name_fixed;
        if (str2 != null) {
            return str2;
        }
        String str3 = document.file_name;
        if (str3 == null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String strFixFileName = fixFileName(str3);
        return strFixFileName != null ? strFixFileName : "";
    }

    public static String getMimeTypePart(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            return str.substring(iLastIndexOf + 1);
        }
        return "";
    }

    public static String getExtensionByMimeType(String str) {
        if (str != null) {
            switch (str) {
                case "audio/ogg":
                    return ".ogg";
                case "video/mp4":
                    return ".mp4";
                case "video/x-matroska":
                    return ".mkv";
                default:
                    return "";
            }
        }
        return "";
    }

    public static File getInternalCacheDir() {
        return ApplicationLoader.applicationContext.getCacheDir();
    }

    public static String getDocumentExtension(TLRPC.Document document) {
        String documentFileName = getDocumentFileName(document);
        int iLastIndexOf = documentFileName.lastIndexOf(46);
        String strSubstring = iLastIndexOf != -1 ? documentFileName.substring(iLastIndexOf + 1) : null;
        if (strSubstring == null || strSubstring.length() == 0) {
            strSubstring = document.mime_type;
        }
        if (strSubstring == null) {
            strSubstring = "";
        }
        return strSubstring.toUpperCase();
    }

    public static String getAttachFileName(TLObject tLObject) {
        return getAttachFileName(tLObject, null);
    }

    public static String getAttachFileName(TLObject tLObject, String str) {
        return getAttachFileName(tLObject, null, str);
    }

    public static String getAttachFileName(TLObject tLObject, String str, String str2) {
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            String documentFileName = getDocumentFileName(document);
            int iLastIndexOf = documentFileName.lastIndexOf(46);
            String strSubstring = iLastIndexOf != -1 ? documentFileName.substring(iLastIndexOf) : "";
            if (strSubstring.length() <= 1) {
                strSubstring = getExtensionByMimeType(document.mime_type);
            }
            if (strSubstring.length() > 1) {
                return document.dc_id + "_" + document.id + strSubstring;
            }
            return document.dc_id + "_" + document.id;
        }
        if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            return secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.id + ".jpg";
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tLObject;
            return tL_secureFile.dc_id + "_" + tL_secureFile.id + ".jpg";
        }
        if (tLObject instanceof WebFile) {
            WebFile webFile = (WebFile) tLObject;
            return Utilities.MD5(webFile.url) + "." + ImageLoader.getHttpUrlExtension(webFile.url, getMimeTypePart(webFile.mime_type));
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(photoSize.location.volume_id);
            sb.append("_");
            sb.append(photoSize.location.local_id);
            sb.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb.append(str2);
            return sb.toString();
        }
        if (tLObject instanceof TLRPC.TL_videoSize) {
            TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
            TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
            if (fileLocation2 == null || (fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_videoSize.location.volume_id);
            sb2.append("_");
            sb2.append(tL_videoSize.location.local_id);
            sb2.append(".");
            if (str2 == null) {
                str2 = "mp4";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        if (tLObject instanceof TLRPC.FileLocation) {
            if (tLObject instanceof TLRPC.TL_fileLocationUnavailable) {
                return "";
            }
            TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(fileLocation3.volume_id);
            sb3.append("_");
            sb3.append(fileLocation3.local_id);
            sb3.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb3.append(str2);
            return sb3.toString();
        }
        if (tLObject instanceof TLRPC.UserProfilePhoto) {
            if (str == null) {
                str = "s";
            }
            TLRPC.UserProfilePhoto userProfilePhoto = (TLRPC.UserProfilePhoto) tLObject;
            if (userProfilePhoto.photo_small != null) {
                if ("s".equals(str)) {
                    return getAttachFileName(userProfilePhoto.photo_small, str2);
                }
                return getAttachFileName(userProfilePhoto.photo_big, str2);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(userProfilePhoto.photo_id);
            sb4.append("_");
            sb4.append(str);
            sb4.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb4.append(str2);
            return sb4.toString();
        }
        if (!(tLObject instanceof TLRPC.ChatPhoto)) {
            return "";
        }
        TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
        if (chatPhoto.photo_small != null) {
            if ("s".equals(str)) {
                return getAttachFileName(chatPhoto.photo_small, str2);
            }
            return getAttachFileName(chatPhoto.photo_big, str2);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(chatPhoto.photo_id);
        sb5.append("_");
        sb5.append(str);
        sb5.append(".");
        if (str2 == null) {
            str2 = "jpg";
        }
        sb5.append(str2);
        return sb5.toString();
    }

    public void deleteFiles(final ArrayList<File> arrayList, final int i) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$aznnlSjB__e8IovJEzDI8QCbiag(arrayList, i);
            }
        });
    }

    public static void $r8$lambda$aznnlSjB__e8IovJEzDI8QCbiag(ArrayList arrayList, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            File file = (File) arrayList.get(i2);
            File file2 = new File(file.getAbsolutePath() + ".enc");
            if (file2.exists()) {
                try {
                    if (!file2.delete()) {
                        file2.deleteOnExit();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    File file3 = new File(getInternalCacheDir(), file.getName() + ".enc.key");
                    if (!file3.delete()) {
                        file3.deleteOnExit();
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            } else if (file.exists()) {
                try {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            try {
                File file4 = new File(file.getParentFile(), "q_" + file.getName());
                if (file4.exists() && !file4.delete()) {
                    file4.deleteOnExit();
                }
            } catch (Exception e4) {
                FileLog.e(e4);
            }
        }
        if (i == 2) {
            ImageLoader.getInstance().clearMemory();
        }
    }

    public static boolean isVideoMimeType(String str) {
        if ("video/mp4".equals(str)) {
            return true;
        }
        return SharedConfig.streamMkv && "video/x-matroska".equals(str);
    }

    public static boolean copyFile(InputStream inputStream, File file) {
        return copyFile(inputStream, file, -1);
    }

    public static boolean copyFile(InputStream inputStream, File file, int i) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, i3);
            i2 += i3;
            if (i > 0 && i2 >= i) {
                break;
            }
        }
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
        return true;
    }

    public static boolean isSamePhoto(TLObject tLObject, TLObject tLObject2) {
        if ((tLObject == null && tLObject2 != null) || (tLObject != null && tLObject2 == null)) {
            return false;
        }
        if (tLObject == null && tLObject2 == null) {
            return true;
        }
        if (tLObject.getClass() != tLObject2.getClass()) {
            return false;
        }
        if (tLObject instanceof TLRPC.UserProfilePhoto) {
            return ((TLRPC.UserProfilePhoto) tLObject).photo_id == ((TLRPC.UserProfilePhoto) tLObject2).photo_id;
        }
        return (tLObject instanceof TLRPC.ChatPhoto) && ((TLRPC.ChatPhoto) tLObject).photo_id == ((TLRPC.ChatPhoto) tLObject2).photo_id;
    }

    public static boolean isSamePhoto(TLRPC.FileLocation fileLocation, TLRPC.Photo photo) {
        if (fileLocation != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.FileLocation fileLocation2 = photo.sizes.get(i).location;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id) {
                    return true;
                }
            }
            if ((-fileLocation.volume_id) == photo.id) {
                return true;
            }
        }
        return false;
    }

    public static long getPhotoId(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Photo) {
            return ((TLRPC.Photo) tLObject).id;
        }
        if (tLObject instanceof TLRPC.ChatPhoto) {
            return ((TLRPC.ChatPhoto) tLObject).photo_id;
        }
        if (tLObject instanceof TLRPC.UserProfilePhoto) {
            return ((TLRPC.UserProfilePhoto) tLObject).photo_id;
        }
        return 0L;
    }

    public void getCurrentLoadingFiles(ArrayList<MessageObject> arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().downloadingFiles);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).isDownloadingFile = true;
        }
    }

    public void getRecentLoadingFiles(ArrayList<MessageObject> arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().recentDownloadingFiles);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).isDownloadingFile = true;
        }
    }

    public void checkCurrentDownloadsFiles() {
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().recentDownloadingFiles);
        for (int i = 0; i < arrayList2.size(); i++) {
            ((MessageObject) arrayList2.get(i)).checkMediaExistance();
            if (((MessageObject) arrayList2.get(i)).mediaExists) {
                arrayList.add((MessageObject) arrayList2.get(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$LnObBXAmRgD6P2knEpXSVsNVzvQ(this.f$0, arrayList);
            }
        });
    }

    public static void $r8$lambda$LnObBXAmRgD6P2knEpXSVsNVzvQ(FileLoader fileLoader, ArrayList arrayList) {
        fileLoader.getDownloadController().recentDownloadingFiles.removeAll(arrayList);
        fileLoader.getNotificationCenter().postNotificationName(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    public void checkMediaExistance(ArrayList<MessageObject> arrayList) {
        getFileDatabase().checkMediaExistance(arrayList);
    }

    public void clearRecentDownloadedFiles() {
        getDownloadController().clearRecentDownloadedFiles();
    }

    public void clearFilePaths() {
        this.filePathDatabase.clear();
    }

    public static boolean checkUploadFileSize(int i, long j) {
        boolean zIsPremium = AccountInstance.getInstance(i).getUserConfig().isPremium();
        if (j >= 2097152000) {
            return j < 4194304000L && zIsPremium;
        }
        return true;
    }

    private static class LoadOperationUIObject {
        Runnable loadInternalRunnable;

        private LoadOperationUIObject() {
        }

        LoadOperationUIObject(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static byte[] longToBytes(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j);
        return byteBufferAllocate.array();
    }

    public static long bytesToLong(byte[] bArr) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j = (j << 8) ^ ((long) (bArr[i] & 255));
        }
        return j;
    }

    public static void $r8$lambda$uHLmzhBP7qiyrI_rMMfEWDKRAVQ(FileLoader fileLoader) {
        int i = 0;
        while (true) {
            FileLoaderPriorityQueue[] fileLoaderPriorityQueueArr = fileLoader.smallFilesQueue;
            if (i < fileLoaderPriorityQueueArr.length) {
                if (fileLoaderPriorityQueueArr[i].getCount() > 0 || fileLoader.largeFilesQueue[i].getCount() > 0) {
                    FileLog.d("download queue: dc" + (i + 1) + " account=" + fileLoader.currentAccount + " small_operations=" + fileLoader.smallFilesQueue[i].getCount() + " large_operations=" + fileLoader.largeFilesQueue[i].getCount());
                }
                i++;
            } else {
                fileLoader.dumpFilesQueue();
                return;
            }
        }
    }

    public void dumpFilesQueue() {
        if (BuildVars.LOGS_ENABLED) {
            fileLoaderQueue.cancelRunnable(this.dumpFilesQueueRunnable);
            fileLoaderQueue.postRunnable(this.dumpFilesQueueRunnable, 10000L);
        }
    }

    public void uploadFile(final String str, final Utilities.Callback<TLRPC.InputFile> callback) {
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                FileLoader.$r8$lambda$UWip9yAOtkcFB6AIU8XCJ_3lX2Y(this.f$0, notificationCenterDelegateArr);
            }
        };
        final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                FileLoader.m440$r8$lambda$gKJsZClCE1qk51wAobZ3vhvknU(str, callback, runnable, i, i2, objArr);
            }
        }};
        getNotificationCenter().addObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploadFailed);
        uploadFile(str, false, false, 67108864);
    }

    public static void $r8$lambda$UWip9yAOtkcFB6AIU8XCJ_3lX2Y(FileLoader fileLoader, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        fileLoader.getNotificationCenter().removeObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploaded);
        fileLoader.getNotificationCenter().removeObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploadFailed);
    }

    public static void m440$r8$lambda$gKJsZClCE1qk51wAobZ3vhvknU(String str, Utilities.Callback callback, Runnable runnable, int i, int i2, Object[] objArr) {
        if (i == NotificationCenter.fileUploaded) {
            if (objArr[0] == str) {
                callback.run((TLRPC.InputFile) objArr[1]);
                runnable.run();
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploadFailed && objArr[0] == str) {
            callback.run(null);
            runnable.run();
        }
    }
}
