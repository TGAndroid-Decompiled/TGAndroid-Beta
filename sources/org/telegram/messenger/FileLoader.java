package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
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

    public class AnonymousClass1 implements FileUploadOperation.FileUploadOperationDelegate {
        final boolean val$encrypted;
        final String val$location;
        final boolean val$small;

        public AnonymousClass1(boolean z4, String str, boolean z10) {
            FileLoader.this = r1;
            this.val$encrypted = z4;
            this.val$location = str;
            this.val$small = z10;
        }

        public void lambda$didFailedUploadingFile$1(boolean z4, String str, boolean z10) {
            FileUploadOperation fileUploadOperation;
            FileUploadOperation fileUploadOperation2;
            if (z4) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidFailedUpload(str, z4);
            }
            if (z10) {
                FileLoader.access$810(FileLoader.this);
                if (FileLoader.this.currentUploadSmallOperationsCount < 1 && (fileUploadOperation2 = (FileUploadOperation) FileLoader.this.uploadSmallOperationQueue.poll()) != null) {
                    FileLoader.access$808(FileLoader.this);
                    fileUploadOperation2.start();
                    return;
                }
                return;
            }
            FileLoader.access$1010(FileLoader.this);
            if (FileLoader.this.currentUploadOperationsCount < 1 && (fileUploadOperation = (FileUploadOperation) FileLoader.this.uploadOperationQueue.poll()) != null) {
                FileLoader.access$1008(FileLoader.this);
                fileUploadOperation.start();
            }
        }

        public void lambda$didFinishUploadingFile$0(boolean z4, String str, boolean z10, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
            FileUploadOperation fileUploadOperation2;
            FileUploadOperation fileUploadOperation3;
            if (z4) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (z10) {
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
        public void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j10, long j11) {
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileUploadProgressChanged(fileUploadOperation, this.val$location, j10, j11, this.val$encrypted);
            }
        }

        @Override
        public void didFailedUploadingFile(FileUploadOperation fileUploadOperation) {
            FileLoader.fileLoaderQueue.postRunnable(new c3(this, this.val$encrypted, this.val$location, this.val$small));
        }

        @Override
        public void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
            FileLoader.fileLoaderQueue.postRunnable(new d3(this, this.val$encrypted, this.val$location, this.val$small, inputFile, inputEncryptedFile, bArr, bArr2, fileUploadOperation));
        }
    }

    public class AnonymousClass2 implements FileLoadOperation.FileLoadOperationDelegate {
        final TLRPC.Document val$document;
        final String val$fileName;
        final int val$finalType;
        final Object val$parentObject;

        public AnonymousClass2(Object obj, TLRPC.Document document, String str, int i10) {
            FileLoader.this = r1;
            this.val$parentObject = obj;
            this.val$document = document;
            this.val$fileName = str;
            this.val$finalType = i10;
        }

        public static void lambda$didPreFinishLoading$0(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue) {
            fileLoadOperation.preFinished = true;
            fileLoaderPriorityQueue.checkLoadingOperations();
        }

        @Override
        public void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j10, long j11) {
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileLoadProgressChanged(fileLoadOperation, this.val$fileName, j10, j11);
            }
        }

        @Override
        public void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i10) {
            FileLoader.this.loadOperationPathsUI.remove(this.val$fileName);
            FileLoader.this.checkDownloadQueue(fileLoadOperation, fileLoadOperation.getQueue());
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidFailedLoad(this.val$fileName, i10);
            }
            if (this.val$document != null && (this.val$parentObject instanceof MessageObject) && i10 == 0) {
                FileLoader.this.getDownloadController().onDownloadFail((MessageObject) this.val$parentObject, i10);
            } else if (i10 == -1) {
                LaunchActivity.E(2);
            }
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
        public void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file) {
            FileLoader.fileLoaderQueue.postRunnable(new e3(0, fileLoadOperation, fileLoadOperation.getQueue()));
        }

        @Override
        public boolean hasAnotherRefOnFile(String str) {
            return FileLoader.this.getFileDatabase().hasAnotherRefOnFile(str);
        }

        @Override
        public boolean isLocallyCreatedFile(String str) {
            return FileLoader.this.getFileDatabase().isLocallyCreated(str);
        }

        @Override
        public void saveFilePath(FilePathDatabase.PathData pathData, File file) {
            String str;
            FilePathDatabase fileDatabase = FileLoader.this.getFileDatabase();
            long j10 = pathData.f18046id;
            int i10 = pathData.f18045dc;
            int i11 = pathData.type;
            if (file != null) {
                str = file.toString();
            } else {
                str = null;
            }
            fileDatabase.putPath(j10, i10, i11, 0, str);
        }
    }

    public interface FileLoaderDelegate {
        void fileDidFailedLoad(String str, int i10);

        void fileDidFailedUpload(String str, boolean z4);

        void fileDidLoaded(String str, File file, Object obj, int i10);

        void fileDidUploaded(String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10);

        void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j10, long j11);

        void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, String str, long j10, long j11, boolean z4);
    }

    public interface FileResolver {
        File getFile();
    }

    public static class LoadOperationUIObject {
        Runnable loadInternalRunnable;

        private LoadOperationUIObject() {
        }

        public LoadOperationUIObject(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public FileLoader(int i10) {
        super(i10);
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
        this.dumpFilesQueueRunnable = new v2(this, 0);
        this.filePathDatabase = new FilePathDatabase(i10);
        int i11 = 0;
        while (true) {
            FileLoaderPriorityQueue[] fileLoaderPriorityQueueArr = this.smallFilesQueue;
            if (i11 < fileLoaderPriorityQueueArr.length) {
                StringBuilder sb = new StringBuilder("smallFilesQueue dc");
                int i12 = i11 + 1;
                sb.append(i12);
                fileLoaderPriorityQueueArr[i11] = new FileLoaderPriorityQueue(i10, sb.toString(), 0, fileLoaderQueue);
                this.largeFilesQueue[i11] = new FileLoaderPriorityQueue(i10, l.d.j(i12, "largeFilesQueue dc"), 1, fileLoaderQueue);
                i11 = i12;
            } else {
                dumpFilesQueue();
                return;
            }
        }
    }

    public static int access$1008(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadOperationsCount;
        fileLoader.currentUploadOperationsCount = i10 + 1;
        return i10;
    }

    public static int access$1010(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadOperationsCount;
        fileLoader.currentUploadOperationsCount = i10 - 1;
        return i10;
    }

    public static int access$808(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadSmallOperationsCount;
        fileLoader.currentUploadSmallOperationsCount = i10 + 1;
        return i10;
    }

    public static int access$810(FileLoader fileLoader) {
        int i10 = fileLoader.currentUploadSmallOperationsCount;
        fileLoader.currentUploadSmallOperationsCount = i10 - 1;
        return i10;
    }

    private void addOperationToQueue(FileLoadOperation fileLoadOperation, LinkedList<FileLoadOperation> linkedList) {
        int priority = fileLoadOperation.getPriority();
        if (priority > 0) {
            int size = linkedList.size();
            int size2 = linkedList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                } else if (linkedList.get(i10).getPriority() < priority) {
                    size = i10;
                    break;
                } else {
                    i10++;
                }
            }
            linkedList.add(size, fileLoadOperation);
            return;
        }
        linkedList.add(fileLoadOperation);
    }

    private void awaitFileLoadOperation(CountDownLatch countDownLatch, boolean z4) {
        try {
            countDownLatch.await();
        } catch (Exception e6) {
            FileLog.e((Throwable) e6, false);
            if (z4) {
                awaitFileLoadOperation(countDownLatch, false);
            }
        }
    }

    public static long bytesToLong(byte[] bArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 = (j10 << 8) ^ (bArr[i10] & 255);
        }
        return j10;
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
            long j10 = fileMetadataFromParent.dialogId;
            if (!getMessagesController().isPeerNoForwards(j10) && !DialogObject.isEncryptedDialog(j10)) {
                int i10 = 2;
                if (obj instanceof MessageObject) {
                    messageObject = (MessageObject) obj;
                    if (messageObject.isRoundVideo() || messageObject.isVoice() || messageObject.isAnyKindOfSticker() || messageObject.messageOwner.noforwards) {
                        return false;
                    }
                } else {
                    int i11 = fileMetadataFromParent.messageType;
                    messageObject = (i11 == 5 || i11 == 13 || i11 == 2) ? null : null;
                }
                if (j10 >= 0) {
                    i10 = 1;
                } else if (ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(-j10)))) {
                    i10 = 4;
                }
                if (SaveToGallerySettingsHelper.needSave(i10, fileMetadataFromParent, messageObject, this.currentAccount)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static File checkDirectory(int i10) {
        return mediaDirs.get(i10);
    }

    public void checkDownloadQueue(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue) {
        checkDownloadQueue(fileLoadOperation, fileLoaderPriorityQueue, 0L);
    }

    public static boolean checkUploadFileSize(int i10, long j10) {
        boolean isPremium = AccountInstance.getInstance(i10).getUserConfig().isPremium();
        if (j10 >= 2097152000) {
            if (j10 >= 4194304000L || !isPremium) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean copyFile(InputStream inputStream, File file) {
        return copyFile(inputStream, file, -1);
    }

    public static String fixFileName(String str) {
        if (str != null) {
            return str.replaceAll("[\u0001-\u001f<>\u202e:\"/\\\\|?*\u007f]+", "").trim();
        }
        return str;
    }

    public static String getAttachFileName(TLObject tLObject) {
        return getAttachFileName(tLObject, null);
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i10) {
        return getClosestPhotoSizeWithSize(arrayList, i10, false);
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i10) {
        return getClosestVideoSizeWithSize(arrayList, i10, false);
    }

    public static File getDirectory(int i10) {
        File file = mediaDirs.get(i10);
        if (file == null && i10 != 4) {
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

    public static String getDocumentExtension(TLRPC.Document document) {
        String str;
        String documentFileName = getDocumentFileName(document);
        int lastIndexOf = documentFileName.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = documentFileName.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = document.mime_type;
        }
        if (str == null) {
            str = "";
        }
        return str.toUpperCase();
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
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String fixFileName = fixFileName(str3);
        if (fixFileName != null) {
            return fixFileName;
        }
        return "";
    }

    public static TLRPC.VideoSize getEmojiMarkup(ArrayList<TLRPC.VideoSize> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if ((arrayList.get(i10) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList.get(i10) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    public static String getExtensionByMimeType(String str) {
        if (str != null) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case 187091926:
                    if (str.equals("audio/ogg")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 1331848029:
                    if (str.equals("video/mp4")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 2039520277:
                    if (str.equals("video/x-matroska")) {
                        c3 = 2;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    return ".ogg";
                case 1:
                    return ".mp4";
                case 2:
                    return ".mkv";
                default:
                    return "";
            }
        }
        return "";
    }

    public static String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(46) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static FilePathDatabase.FileMeta getFileMetadataFromParent(int i10, Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.startsWith("sent_")) {
                if (sentPattern == null) {
                    sentPattern = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
                }
                try {
                    Matcher matcher = sentPattern.matcher(str);
                    if (matcher.matches()) {
                        FilePathDatabase.FileMeta fileMeta = new FilePathDatabase.FileMeta();
                        fileMeta.messageId = Integer.parseInt(matcher.group(1));
                        fileMeta.dialogId = Long.parseLong(matcher.group(2));
                        fileMeta.messageType = Integer.parseInt(matcher.group(3));
                        fileMeta.messageSize = Long.parseLong(matcher.group(4));
                        return fileMeta;
                    }
                    return null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return null;
                }
            }
            return null;
        } else if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            FilePathDatabase.FileMeta fileMeta2 = new FilePathDatabase.FileMeta();
            fileMeta2.messageId = messageObject.getId();
            fileMeta2.dialogId = messageObject.getDialogId();
            fileMeta2.messageType = messageObject.type;
            fileMeta2.messageSize = messageObject.getSize();
            return fileMeta2;
        } else if (obj instanceof TL_stories.StoryItem) {
            FilePathDatabase.FileMeta fileMeta3 = new FilePathDatabase.FileMeta();
            fileMeta3.dialogId = ((TL_stories.StoryItem) obj).dialogId;
            fileMeta3.messageType = 23;
            return fileMeta3;
        } else {
            return null;
        }
    }

    public static FileLoader getInstance(int i10) {
        FileLoader fileLoader;
        FileLoader[] fileLoaderArr = Instance;
        FileLoader fileLoader2 = fileLoaderArr[i10];
        if (fileLoader2 == null) {
            synchronized (FileLoader.class) {
                try {
                    fileLoader = fileLoaderArr[i10];
                    if (fileLoader == null) {
                        fileLoader = new FileLoader(i10);
                        fileLoaderArr[i10] = fileLoader;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileLoader;
        }
        return fileLoader2;
    }

    public static File getInternalCacheDir() {
        return ApplicationLoader.applicationContext.getCacheDir();
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
        } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
            return getAttachFileName(MessageObject.getMedia(message).document);
        } else {
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

    public static String getMimeTypePart(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    public static TLRPC.TL_photoPathSize getPathPhotoSize(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.PhotoSize photoSize = arrayList.get(i10);
                if (!(photoSize instanceof TLRPC.TL_photoPathSize)) {
                    return (TLRPC.TL_photoPathSize) photoSize;
                }
            }
        }
        return null;
    }

    public static long getPhotoId(TLObject tLObject) {
        if (tLObject instanceof TLRPC.Photo) {
            return ((TLRPC.Photo) tLObject).f20867id;
        }
        if (tLObject instanceof TLRPC.ChatPhoto) {
            return ((TLRPC.ChatPhoto) tLObject).photo_id;
        }
        if (tLObject instanceof TLRPC.UserProfilePhoto) {
            return ((TLRPC.UserProfilePhoto) tLObject).photo_id;
        }
        return 0L;
    }

    private int getPriorityValue(int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            return Integer.MAX_VALUE;
        }
        if (i10 == 3) {
            i11 = this.priorityIncreasePointer;
            this.priorityIncreasePointer = i11 + 1;
            i12 = 1048577;
        } else if (i10 == 2) {
            i11 = this.priorityIncreasePointer;
            this.priorityIncreasePointer = i11 + 1;
            i12 = 65537;
        } else if (i10 == 1) {
            return 65536;
        } else {
            return 0;
        }
        return i11 + i12;
    }

    public static TLRPC.TL_photoStrippedSize getStrippedPhotoSize(ArrayList<TLRPC.PhotoSize> arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PhotoSize photoSize = arrayList.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize getVectorMarkupVideoSize(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i10 = 0; i10 < photo.video_sizes.size(); i10++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i10);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static boolean isSamePhoto(TLObject tLObject, TLObject tLObject2) {
        if ((tLObject != null || tLObject2 == null) && (tLObject == null || tLObject2 != null)) {
            if (tLObject == null && tLObject2 == null) {
                return true;
            }
            if (tLObject.getClass() != tLObject2.getClass()) {
                return false;
            }
            return tLObject instanceof TLRPC.UserProfilePhoto ? ((TLRPC.UserProfilePhoto) tLObject).photo_id == ((TLRPC.UserProfilePhoto) tLObject2).photo_id : (tLObject instanceof TLRPC.ChatPhoto) && ((TLRPC.ChatPhoto) tLObject).photo_id == ((TLRPC.ChatPhoto) tLObject2).photo_id;
        }
        return false;
    }

    public static boolean isVideoMimeType(String str) {
        if (!"video/mp4".equals(str)) {
            if (!SharedConfig.streamMkv || !"video/x-matroska".equals(str)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void lambda$cancel$10() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    public void lambda$cancel$9(String str) {
        FileLoadOperation remove = this.loadOperationPaths.remove(str);
        if (remove != null) {
            remove.getQueue().cancel(remove);
        }
    }

    public void lambda$cancelFileUpload$2(boolean z4, String str) {
        FileUploadOperation fileUploadOperation;
        if (!z4) {
            fileUploadOperation = this.uploadOperationPaths.get(str);
        } else {
            fileUploadOperation = this.uploadOperationPathsEnc.get(str);
        }
        this.uploadSizes.remove(str);
        if (fileUploadOperation != null) {
            this.uploadOperationPathsEnc.remove(str);
            this.uploadOperationQueue.remove(fileUploadOperation);
            this.uploadSmallOperationQueue.remove(fileUploadOperation);
            fileUploadOperation.cancel();
        }
    }

    public void lambda$cancelLoadAllFiles$12(String str) {
        FileLoadOperation remove = this.loadOperationPaths.remove(str);
        if (remove != null) {
            remove.getQueue().cancel(remove);
        }
    }

    public void lambda$cancelLoadFile$7(String str) {
        FileLoadOperation remove = this.loadOperationPaths.remove(str);
        if (remove != null) {
            remove.getQueue().cancel(remove);
        }
    }

    public void lambda$cancelLoadFile$8() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    public void lambda$changePriority$11(String str, int i10) {
        int priorityValue;
        FileLoadOperation fileLoadOperation = this.loadOperationPaths.get(str);
        if (fileLoadOperation != null && fileLoadOperation.getPriority() != (priorityValue = getPriorityValue(i10))) {
            fileLoadOperation.setPriority(priorityValue);
            FileLoaderPriorityQueue queue = fileLoadOperation.getQueue();
            queue.remove(fileLoadOperation);
            queue.add(fileLoadOperation);
            queue.checkLoadingOperations();
            StringBuilder sb = new StringBuilder("update priority ");
            sb.append(str);
            sb.append(" position in queue ");
            sb.append(fileLoadOperation.getPositionInQueue());
            sb.append(" account=");
            l.d.t(this.currentAccount, sb);
        }
    }

    public void lambda$checkCurrentDownloadsFiles$17(ArrayList arrayList) {
        getDownloadController().recentDownloadingFiles.removeAll(arrayList);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    public void lambda$checkDownloadQueue$15(FileLoaderPriorityQueue fileLoaderPriorityQueue, FileLoadOperation fileLoadOperation) {
        if (fileLoaderPriorityQueue.remove(fileLoadOperation)) {
            this.loadOperationPaths.remove(fileLoadOperation.getFileName());
            fileLoaderPriorityQueue.checkLoadingOperations(fileLoadOperation.isStory);
        }
    }

    public void lambda$checkUploadNewDataAvailable$3(boolean z4, String str, long j10, long j11, Float f10) {
        FileUploadOperation fileUploadOperation;
        if (z4) {
            fileUploadOperation = this.uploadOperationPathsEnc.get(str);
        } else {
            fileUploadOperation = this.uploadOperationPaths.get(str);
        }
        FileUploadOperation fileUploadOperation2 = fileUploadOperation;
        if (fileUploadOperation2 != null) {
            fileUploadOperation2.checkNewDataAvailable(j10, j11, f10);
        } else if (j11 != 0) {
            this.uploadSizes.put(str, Long.valueOf(j11));
        }
    }

    public static void lambda$deleteFiles$16(ArrayList arrayList, int i10) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            File file = (File) arrayList.get(i11);
            File file2 = new File(file.getAbsolutePath() + ".enc");
            if (file2.exists()) {
                try {
                    if (!file2.delete()) {
                        file2.deleteOnExit();
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                try {
                    File internalCacheDir = getInternalCacheDir();
                    File file3 = new File(internalCacheDir, file.getName() + ".enc.key");
                    if (!file3.delete()) {
                        file3.deleteOnExit();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (file.exists()) {
                try {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            try {
                File parentFile = file.getParentFile();
                File file4 = new File(parentFile, "q_" + file.getName());
                if (file4.exists() && !file4.delete()) {
                    file4.deleteOnExit();
                }
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        if (i10 == 2) {
            ImageLoader.getInstance().clearMemory();
        }
    }

    public void lambda$loadFile$13(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        loadFileInternal(document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str, j10, i10, null, 0L, false, i11);
    }

    public void lambda$loadStreamFile$14(FileLoadOperation[] fileLoadOperationArr, TLRPC.Document document, ImageLocation imageLocation, Object obj, int i10, FileLoadOperationStream fileLoadOperationStream, long j10, boolean z4, int i11, CountDownLatch countDownLatch) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j11;
        String str = null;
        if (document == null && imageLocation != null) {
            tL_fileLocationToBeDeprecated = imageLocation.location;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && imageLocation != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && imageLocation != null) {
            j11 = imageLocation.currentSize;
        } else {
            j11 = 0;
        }
        fileLoadOperationArr[0] = loadFileInternal(document, null, null, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j11, i10, fileLoadOperationStream, j10, z4, i11);
        countDownLatch.countDown();
    }

    public void lambda$new$18() {
        int i10 = 0;
        while (true) {
            FileLoaderPriorityQueue[] fileLoaderPriorityQueueArr = this.smallFilesQueue;
            if (i10 < fileLoaderPriorityQueueArr.length) {
                if (fileLoaderPriorityQueueArr[i10].getCount() > 0 || this.largeFilesQueue[i10].getCount() > 0) {
                    FileLog.d("download queue: dc" + (i10 + 1) + " account=" + this.currentAccount + " small_operations=" + this.smallFilesQueue[i10].getCount() + " large_operations=" + this.largeFilesQueue[i10].getCount());
                }
                i10++;
            } else {
                dumpFilesQueue();
                return;
            }
        }
    }

    public void lambda$onNetworkChanged$4(boolean z4) {
        for (Map.Entry<String, FileUploadOperation> entry : this.uploadOperationPaths.entrySet()) {
            entry.getValue().onNetworkChanged(z4);
        }
        for (Map.Entry<String, FileUploadOperation> entry2 : this.uploadOperationPathsEnc.entrySet()) {
            entry2.getValue().onNetworkChanged(z4);
        }
    }

    public void lambda$setForceStreamLoadingFile$6(TLRPC.FileLocation fileLocation, String str) {
        String attachFileName = getAttachFileName(fileLocation, str);
        this.forceLoadingFile = attachFileName;
        FileLoadOperation fileLoadOperation = this.loadOperationPaths.get(attachFileName);
        if (fileLoadOperation != null) {
            if (fileLoadOperation.isPreloadVideoOperation()) {
                fileLoadOperation.setIsPreloadVideoOperation(false);
            }
            fileLoadOperation.setForceRequest(true);
            fileLoadOperation.setPriority(getPriorityValue(4));
            fileLoadOperation.getQueue().remove(fileLoadOperation);
            fileLoadOperation.getQueue().add(fileLoadOperation);
            fileLoadOperation.getQueue().checkLoadingOperations();
        }
    }

    public void lambda$uploadFile$19(NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr) {
        getNotificationCenter().removeObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploaded);
        getNotificationCenter().removeObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploadFailed);
    }

    public static void lambda$uploadFile$20(String str, Utilities.Callback callback, Runnable runnable, int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            if (objArr[0] == str) {
                callback.run((TLRPC.InputFile) objArr[1]);
                runnable.run();
            }
        } else if (i10 == NotificationCenter.fileUploadFailed && objArr[0] == str) {
            callback.run(null);
            runnable.run();
        }
    }

    public void lambda$uploadFile$5(boolean z4, String str, long j10, int i10, boolean z10, boolean z11) {
        long j11;
        if (z4) {
            if (this.uploadOperationPathsEnc.containsKey(str)) {
                return;
            }
        } else if (this.uploadOperationPaths.containsKey(str)) {
            return;
        }
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 != 0 && this.uploadSizes.get(str) != null) {
            this.uploadSizes.remove(str);
            j11 = 0;
        } else {
            j11 = j10;
        }
        FileUploadOperation fileUploadOperation = new FileUploadOperation(this.currentAccount, str, z4, j11, i10);
        FileLoaderDelegate fileLoaderDelegate = this.delegate;
        if (fileLoaderDelegate != null && i11 != 0) {
            fileLoaderDelegate.fileUploadProgressChanged(fileUploadOperation, str, 0L, j10, z4);
            fileUploadOperation = fileUploadOperation;
        }
        if (z4) {
            this.uploadOperationPathsEnc.put(str, fileUploadOperation);
        } else {
            this.uploadOperationPaths.put(str, fileUploadOperation);
        }
        if (z10) {
            fileUploadOperation.setForceSmallFile();
        }
        fileUploadOperation.setDelegate(new AnonymousClass1(z4, str, z11));
        if (z11) {
            int i12 = this.currentUploadSmallOperationsCount;
            if (i12 < 1) {
                this.currentUploadSmallOperationsCount = i12 + 1;
                fileUploadOperation.start();
                return;
            }
            this.uploadSmallOperationQueue.add(fileUploadOperation);
            return;
        }
        int i13 = this.currentUploadOperationsCount;
        if (i13 < 1) {
            this.currentUploadOperationsCount = i13 + 1;
            fileUploadOperation.start();
            return;
        }
        this.uploadOperationQueue.add(fileUploadOperation);
    }

    private org.telegram.messenger.FileLoadOperation loadFileInternal(org.telegram.tgnet.TLRPC.Document r31, org.telegram.messenger.SecureDocument r32, org.telegram.messenger.WebFile r33, org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated r34, org.telegram.messenger.ImageLocation r35, java.lang.Object r36, java.lang.String r37, long r38, int r40, org.telegram.messenger.FileLoadOperationStream r41, long r42, boolean r44, int r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoader.loadFileInternal(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.SecureDocument, org.telegram.messenger.WebFile, org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated, org.telegram.messenger.ImageLocation, java.lang.Object, java.lang.String, long, int, org.telegram.messenger.FileLoadOperationStream, long, boolean, int):org.telegram.messenger.FileLoadOperation");
    }

    public static byte[] longToBytes(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j10);
        return allocate.array();
    }

    public void lambda$removeLoadingVideo$1(TLRPC.Document document, boolean z4) {
        String str;
        String attachFileName = getAttachFileName(document);
        StringBuilder l10 = e2.c.l(attachFileName);
        if (z4) {
            str = "p";
        } else {
            str = "";
        }
        l10.append(str);
        if (this.loadingVideos.remove(l10.toString()) != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
        }
    }

    public static void setMediaDirs(SparseArray<File> sparseArray) {
        mediaDirs = sparseArray;
    }

    public void cancel(FileLoadOperation fileLoadOperation) {
        Runnable runnable;
        boolean z4;
        if (fileLoadOperation != null) {
            String fileName = fileLoadOperation.getFileName();
            LoadOperationUIObject remove = this.loadOperationPathsUI.remove(fileName);
            if (remove != null) {
                runnable = remove.loadInternalRunnable;
            } else {
                runnable = null;
            }
            if (remove != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (runnable != null) {
                fileLoaderQueue.cancelRunnable(runnable);
            }
            fileLoaderQueue.postRunnable(new x2(this, fileName, 1));
            if (z4) {
                AndroidUtilities.runOnUIThread(new v2(this, 2));
            }
        }
    }

    public void cancelFileUpload(String str, boolean z4) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new q6(this, z4, str, 1));
    }

    public void cancelLoadAllFiles() {
        Runnable runnable;
        for (String str : this.loadOperationPathsUI.keySet()) {
            LoadOperationUIObject loadOperationUIObject = this.loadOperationPathsUI.get(str);
            if (loadOperationUIObject != null) {
                runnable = loadOperationUIObject.loadInternalRunnable;
            } else {
                runnable = null;
            }
            if (runnable != null) {
                fileLoaderQueue.cancelRunnable(runnable);
            }
            fileLoaderQueue.postRunnable(new x2(this, str, 2));
        }
    }

    public void cancelLoadFile(TLRPC.Document document) {
        cancelLoadFile(document, false);
    }

    public void cancelLoadFiles(ArrayList<String> arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            cancelLoadFile(null, null, null, null, null, arrayList.get(i10), true);
        }
    }

    public void changePriority(int i10, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.FileLocation fileLocation, String str, String str2) {
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
        fileLoaderQueue.postRunnable(new s4(this, str2, i10, 3));
    }

    public void checkCurrentDownloadsFiles() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().recentDownloadingFiles);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((MessageObject) arrayList2.get(i10)).checkMediaExistance();
            if (((MessageObject) arrayList2.get(i10)).mediaExists) {
                arrayList.add((MessageObject) arrayList2.get(i10));
            }
        }
        if (!arrayList.isEmpty()) {
            AndroidUtilities.runOnUIThread(new d2(6, this, arrayList));
        }
    }

    public boolean checkLoadCaughtPremiumFloodWait(String str) {
        FileLoadOperation fileLoadOperation;
        if (str == null || (fileLoadOperation = this.loadOperationPaths.get(str)) == null || !fileLoadOperation.caughtPremiumFloodWait) {
            return false;
        }
        fileLoadOperation.caughtPremiumFloodWait = false;
        return true;
    }

    public void checkMediaExistance(ArrayList<MessageObject> arrayList) {
        getFileDatabase().checkMediaExistance(arrayList);
    }

    public boolean checkUploadCaughtPremiumFloodWait(String str) {
        FileUploadOperation fileUploadOperation;
        if (str == null || (fileUploadOperation = this.uploadOperationPaths.get(str)) == null || !fileUploadOperation.caughtPremiumFloodWait) {
            return false;
        }
        fileUploadOperation.caughtPremiumFloodWait = false;
        return true;
    }

    public void checkUploadNewDataAvailable(String str, boolean z4, long j10, long j11) {
        checkUploadNewDataAvailable(str, z4, j10, j11, null);
    }

    public void clearFilePaths() {
        this.filePathDatabase.clear();
    }

    public void clearRecentDownloadedFiles() {
        getDownloadController().clearRecentDownloadedFiles();
    }

    public void deleteFiles(ArrayList<File> arrayList, int i10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            fileLoaderQueue.postRunnable(new s6(arrayList, i10, 5));
        }
    }

    public void dumpFilesQueue() {
        if (!BuildVars.LOGS_ENABLED) {
            return;
        }
        fileLoaderQueue.cancelRunnable(this.dumpFilesQueueRunnable);
        fileLoaderQueue.postRunnable(this.dumpFilesQueueRunnable, 10000L);
    }

    public FileLoadOperation findLoadOperationByRequestToken(int i10) {
        for (FileLoadOperation fileLoadOperation : this.loadOperationPaths.values()) {
            if (fileLoadOperation != null && fileLoadOperation.uiRequestTokens.contains(Integer.valueOf(i10))) {
                return fileLoadOperation;
            }
        }
        return null;
    }

    public FileUploadOperation findUploadOperationByRequestToken(int i10) {
        for (FileUploadOperation fileUploadOperation : this.uploadOperationPaths.values()) {
            if (fileUploadOperation != null && fileUploadOperation.uiRequestTokens.contains(Integer.valueOf(i10))) {
                return fileUploadOperation;
            }
        }
        return null;
    }

    public float getBufferedProgressFromPosition(float f10, String str) {
        FileLoadOperation fileLoadOperation;
        if (TextUtils.isEmpty(str) || (fileLoadOperation = this.loadOperationPaths.get(str)) == null) {
            return 0.0f;
        }
        return fileLoadOperation.getDownloadedLengthFromOffset(f10);
    }

    public void getCurrentLoadingFiles(ArrayList<MessageObject> arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().downloadingFiles);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).isDownloadingFile = true;
        }
    }

    public FilePathDatabase getFileDatabase() {
        return this.filePathDatabase;
    }

    public DispatchQueue getFileLoaderQueue() {
        return fileLoaderQueue;
    }

    public int getFileReference(Object obj) {
        int i10 = this.lastReferenceId;
        this.lastReferenceId = i10 + 1;
        this.parentObjectReferences.put(Integer.valueOf(i10), obj);
        return i10;
    }

    public File getLocalFile(ImageLocation imageLocation) {
        String str;
        if (imageLocation == null) {
            return null;
        }
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
        if (tL_fileLocationToBeDeprecated != null) {
            str = getAttachFileName(tL_fileLocationToBeDeprecated, null);
        } else {
            TLRPC.Document document = imageLocation.document;
            if (document != null) {
                str = getAttachFileName(document);
            } else {
                WebFile webFile = imageLocation.webFile;
                if (webFile != null) {
                    str = getAttachFileName(webFile);
                } else {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        File file = new File(getDirectory(4), str);
        if (file.exists()) {
            return file;
        }
        File file2 = new File(getDirectory(0), str);
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(getDirectory(2), str);
        if (file3.exists()) {
            return file3;
        }
        File file4 = new File(getDirectory(5), str);
        if (!file4.exists()) {
            return null;
        }
        return file4;
    }

    public Object getParentObject(int i10) {
        return this.parentObjectReferences.get(Integer.valueOf(i10));
    }

    public File getPathToAttach(TLObject tLObject) {
        return getPathToAttach(tLObject, null, false);
    }

    public File getPathToMessage(TLRPC.Message message) {
        return getPathToMessage(message, true);
    }

    public void getRecentLoadingFiles(ArrayList<MessageObject> arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().recentDownloadingFiles);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).isDownloadingFile = true;
        }
    }

    public boolean isLoadingFile(String str) {
        if (str != null && this.loadOperationPathsUI.containsKey(str)) {
            return true;
        }
        return false;
    }

    public boolean isLoadingVideo(TLRPC.Document document, boolean z4) {
        String str;
        if (document != null) {
            HashMap<String, Boolean> hashMap = this.loadingVideos;
            StringBuilder sb = new StringBuilder();
            sb.append(getAttachFileName(document));
            if (z4) {
                str = "p";
            } else {
                str = "";
            }
            sb.append(str);
            if (hashMap.containsKey(sb.toString())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isLoadingVideoAny(TLRPC.Document document) {
        if (!isLoadingVideo(document, false) && !isLoadingVideo(document, true)) {
            return false;
        }
        return true;
    }

    public void loadFile(ImageLocation imageLocation, Object obj, String str, int i10, int i11) {
        if (imageLocation == null) {
            return;
        }
        loadFile(imageLocation.document, imageLocation.secureDocument, imageLocation.webFile, imageLocation.location, imageLocation, obj, str, imageLocation.getSize(), i10, (i11 != 0 || (!imageLocation.isEncrypted() && (imageLocation.photoSize == null || imageLocation.getSize() != 0))) ? i11 : 1);
    }

    public FileLoadOperation loadStreamFile(FileLoadOperationStream fileLoadOperationStream, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j10, boolean z4, int i10) {
        return loadStreamFile(fileLoadOperationStream, document, imageLocation, obj, j10, z4, i10, document == null ? 1 : 0);
    }

    public void onNetworkChanged(boolean z4) {
        fileLoaderQueue.postRunnable(new kh.f(6, this, z4));
    }

    public void removeLoadingVideo(TLRPC.Document document, boolean z4, boolean z10) {
        if (document == null) {
            return;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new w2(this, document, z4, 1));
        } else {
            lambda$removeLoadingVideo$1(document, z4);
        }
    }

    public void setDelegate(FileLoaderDelegate fileLoaderDelegate) {
        this.delegate = fileLoaderDelegate;
    }

    public void setForceStreamLoadingFile(TLRPC.FileLocation fileLocation, String str) {
        if (fileLocation == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new g0(this, fileLocation, str, 22));
    }

    public void setLoadingVideo(TLRPC.Document document, boolean z4, boolean z10) {
        if (document == null) {
            return;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new w2(this, document, z4, 0));
        } else {
            lambda$setLoadingVideo$0(document, z4);
        }
    }

    public void setLoadingVideoForPlayer(TLRPC.Document document, boolean z4) {
        String str;
        if (document != null) {
            String attachFileName = getAttachFileName(document);
            HashMap<String, Boolean> hashMap = this.loadingVideos;
            StringBuilder l10 = e2.c.l(attachFileName);
            String str2 = "p";
            if (!z4) {
                str = "p";
            } else {
                str = "";
            }
            l10.append(str);
            if (hashMap.containsKey(l10.toString())) {
                HashMap<String, Boolean> hashMap2 = this.loadingVideos;
                StringBuilder l11 = e2.c.l(attachFileName);
                if (!z4) {
                    str2 = "";
                }
                l11.append(str2);
                hashMap2.put(l11.toString(), Boolean.TRUE);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
            }
        }
    }

    public void lambda$setLoadingVideo$0(TLRPC.Document document, boolean z4) {
        String str;
        String attachFileName = getAttachFileName(document);
        StringBuilder l10 = e2.c.l(attachFileName);
        if (z4) {
            str = "p";
        } else {
            str = "";
        }
        l10.append(str);
        this.loadingVideos.put(l10.toString(), Boolean.TRUE);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
    }

    public void setLocalPathTo(TLObject tLObject, String str) {
        int i10;
        int i11;
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            if (document.key != null) {
                i11 = 4;
            } else if (MessageObject.isVoiceDocument(document)) {
                i11 = 1;
            } else if (MessageObject.isVideoDocument(document)) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            this.filePathDatabase.putPath(document.f20849id, document.dc_id, i11, 1, str);
        } else if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
                TLRPC.FileLocation fileLocation = photoSize.location;
                if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                this.filePathDatabase.putPath(fileLocation.volume_id, fileLocation.dc_id + (fileLocation.local_id << 16), i10, 1, str);
            }
        }
    }

    public void uploadFile(String str, boolean z4, boolean z10, int i10) {
        uploadFile(str, z4, z10, 0L, i10, false);
    }

    public void checkDownloadQueue(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue, long j10) {
        fileLoaderQueue.postRunnable(new g0(this, fileLoaderPriorityQueue, fileLoadOperation, 23), j10);
    }

    public static boolean copyFile(InputStream inputStream, File file, int i10) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i11 += read;
            if (i10 > 0 && i11 >= i10) {
                break;
            }
        }
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
        return true;
    }

    public static String getAttachFileName(TLObject tLObject, String str) {
        return getAttachFileName(tLObject, null, str);
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i10, boolean z4) {
        return getClosestPhotoSizeWithSize(arrayList, i10, z4, null, false);
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i10, boolean z4) {
        return getClosestVideoSizeWithSize(arrayList, i10, z4, false);
    }

    public void cancelLoadFile(TLRPC.Document document, boolean z4) {
        cancelLoadFile(document, null, null, null, null, null, z4);
    }

    public void checkUploadNewDataAvailable(String str, boolean z4, long j10, long j11, Float f10) {
        fileLoaderQueue.postRunnable(new oh.y5(this, z4, str, j10, j11, f10));
    }

    public File getPathToAttach(TLObject tLObject, boolean z4) {
        return getPathToAttach(tLObject, null, z4);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z4) {
        return getPathToMessage(message, false, z4);
    }

    public FileLoadOperation loadStreamFile(final FileLoadOperationStream fileLoadOperationStream, final TLRPC.Document document, final ImageLocation imageLocation, final Object obj, final long j10, final boolean z4, final int i10, final int i11) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final FileLoadOperation[] fileLoadOperationArr = new FileLoadOperation[1];
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.this.lambda$loadStreamFile$14(fileLoadOperationArr, document, imageLocation, obj, i10, fileLoadOperationStream, j10, z4, i11, countDownLatch);
            }
        });
        awaitFileLoadOperation(countDownLatch, true);
        return fileLoadOperationArr[0];
    }

    public void uploadFile(final String str, final boolean z4, final boolean z10, final long j10, final int i10, final boolean z11) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoader.this.lambda$uploadFile$5(z4, str, j10, i10, z11, z10);
            }
        });
    }

    public static String getAttachFileName(TLObject tLObject, String str, String str2) {
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            String documentFileName = getDocumentFileName(document);
            int lastIndexOf = documentFileName.lastIndexOf(46);
            String substring = lastIndexOf != -1 ? documentFileName.substring(lastIndexOf) : "";
            if (substring.length() <= 1) {
                substring = getExtensionByMimeType(document.mime_type);
            }
            if (substring.length() > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(document.dc_id);
                sb.append("_");
                return android.support.v4.media.a.q(sb, document.f20849id, substring);
            }
            return document.dc_id + "_" + document.f20849id;
        } else if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(secureDocument.secureFile.dc_id);
            sb2.append("_");
            return android.support.v4.media.a.q(sb2, secureDocument.secureFile.f20978id, ".jpg");
        } else if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile.dc_id);
            sb3.append("_");
            return android.support.v4.media.a.q(sb3, tL_secureFile.f20978id, ".jpg");
        } else if (tLObject instanceof WebFile) {
            WebFile webFile = (WebFile) tLObject;
            return Utilities.MD5(webFile.url) + "." + ImageLoader.getHttpUrlExtension(webFile.url, getMimeTypePart(webFile.mime_type));
        } else if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                return "";
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(photoSize.location.volume_id);
            sb4.append("_");
            sb4.append(photoSize.location.local_id);
            sb4.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb4.append(str2);
            return sb4.toString();
        } else if (tLObject instanceof TLRPC.TL_videoSize) {
            TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
            TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
            if (fileLocation2 == null || (fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                return "";
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(tL_videoSize.location.volume_id);
            sb5.append("_");
            sb5.append(tL_videoSize.location.local_id);
            sb5.append(".");
            if (str2 == null) {
                str2 = "mp4";
            }
            sb5.append(str2);
            return sb5.toString();
        } else if (tLObject instanceof TLRPC.FileLocation) {
            if (tLObject instanceof TLRPC.TL_fileLocationUnavailable) {
                return "";
            }
            TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(fileLocation3.volume_id);
            sb6.append("_");
            sb6.append(fileLocation3.local_id);
            sb6.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb6.append(str2);
            return sb6.toString();
        } else if (tLObject instanceof TLRPC.UserProfilePhoto) {
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
            StringBuilder sb7 = new StringBuilder();
            sb7.append(userProfilePhoto.photo_id);
            sb7.append("_");
            sb7.append(str);
            sb7.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb7.append(str2);
            return sb7.toString();
        } else if (tLObject instanceof TLRPC.ChatPhoto) {
            TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
            if (chatPhoto.photo_small != null) {
                if ("s".equals(str)) {
                    return getAttachFileName(chatPhoto.photo_small, str2);
                }
                return getAttachFileName(chatPhoto.photo_big, str2);
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append(chatPhoto.photo_id);
            sb8.append("_");
            sb8.append(str);
            sb8.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb8.append(str2);
            return sb8.toString();
        } else {
            return "";
        }
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize getClosestPhotoSizeWithSize(java.util.ArrayList<org.telegram.tgnet.TLRPC.PhotoSize> r8, int r9, boolean r10, org.telegram.tgnet.TLRPC.PhotoSize r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoader.getClosestPhotoSizeWithSize(java.util.ArrayList, int, boolean, org.telegram.tgnet.TLRPC$PhotoSize, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static org.telegram.tgnet.TLRPC.VideoSize getClosestVideoSizeWithSize(java.util.ArrayList<org.telegram.tgnet.TLRPC.VideoSize> r7, int r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoader.getClosestVideoSizeWithSize(java.util.ArrayList, int, boolean, boolean):org.telegram.tgnet.TLRPC$VideoSize");
    }

    public void cancelLoadFile(SecureDocument secureDocument) {
        cancelLoadFile(null, secureDocument, null, null, null, null, false);
    }

    public File getPathToAttach(TLObject tLObject, String str, boolean z4) {
        return getPathToAttach(tLObject, null, str, z4, true);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z4, boolean z10) {
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
                    return getPathToAttach(closestPhotoSizeWithSize3, null, z4, z10);
                }
            }
        } else {
            boolean z11 = false;
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
                return getPathToAttach(MessageObject.getMedia(message).document, null, (z4 || MessageObject.getMedia(message).ttl_seconds != 0) ? true : true, z10);
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = MessageObject.getMedia(message).photo.sizes;
                if (arrayList2.size() > 0 && (closestPhotoSizeWithSize2 = getClosestPhotoSizeWithSize(arrayList2, AndroidUtilities.getPhotoSize(true), false, null, true)) != null) {
                    return getPathToAttach(closestPhotoSizeWithSize2, null, (z4 || MessageObject.getMedia(message).ttl_seconds != 0) ? true : true, z10);
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (MessageObject.getMedia(message).webpage.document != null) {
                    return getPathToAttach(MessageObject.getMedia(message).webpage.document, null, z4, z10);
                }
                if (MessageObject.getMedia(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = MessageObject.getMedia(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (closestPhotoSizeWithSize = getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize())) != null) {
                        return getPathToAttach(closestPhotoSizeWithSize, null, z4, z10);
                    }
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return getPathToAttach(((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(message)).photo, null, true, z10);
            }
        }
        return new File("");
    }

    public void loadFile(SecureDocument secureDocument, int i10) {
        if (secureDocument == null) {
            return;
        }
        loadFile(null, secureDocument, null, null, null, null, null, 0L, i10, 1);
    }

    public void uploadFile(final String str, final Utilities.Callback<TLRPC.InputFile> callback) {
        final d2 d2Var = new d2(5, this, r0);
        NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                FileLoader.lambda$uploadFile$20(str, callback, d2Var, i10, i11, objArr);
            }
        }};
        getNotificationCenter().addObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploaded);
        getNotificationCenter().addObserver(notificationCenterDelegateArr[0], NotificationCenter.fileUploadFailed);
        uploadFile(str, false, false, 67108864);
    }

    public void cancelLoadFile(WebFile webFile) {
        cancelLoadFile(null, null, webFile, null, null, null, false);
    }

    public File getPathToAttach(TLObject tLObject, String str, boolean z4, boolean z10) {
        return getPathToAttach(tLObject, null, str, z4, z10);
    }

    public void loadFile(TLRPC.Document document, Object obj, int i10, int i11) {
        if (document == null) {
            return;
        }
        loadFile(document, null, null, null, null, obj, null, 0L, i10, (i11 != 0 || document.key == null) ? i11 : 1);
    }

    public void cancelLoadFile(TLRPC.PhotoSize photoSize) {
        cancelLoadFile(photoSize, false);
    }

    public java.io.File getPathToAttach(org.telegram.tgnet.TLObject r11, java.lang.String r12, java.lang.String r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileLoader.getPathToAttach(org.telegram.tgnet.TLObject, java.lang.String, java.lang.String, boolean, boolean):java.io.File");
    }

    public void cancelLoadFile(TLRPC.PhotoSize photoSize, boolean z4) {
        cancelLoadFile(null, null, null, photoSize.location, null, null, z4);
    }

    public void loadFile(WebFile webFile, int i10, int i11) {
        loadFile(null, null, webFile, null, null, null, null, 0L, i10, i11);
    }

    private void loadFile(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        String str2;
        String str3;
        String attachFileName;
        a3 a3Var;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, str2);
        } else {
            str2 = str;
            if (document != null) {
                attachFileName = getAttachFileName(document);
            } else if (webFile != null) {
                attachFileName = getAttachFileName(webFile);
            } else {
                str3 = null;
                a3Var = new a3(this, document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j10, i10, i11);
                if (i11 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
                    LoadOperationUIObject loadOperationUIObject = new LoadOperationUIObject(null);
                    loadOperationUIObject.loadInternalRunnable = a3Var;
                    this.loadOperationPathsUI.put(str3, loadOperationUIObject);
                }
                fileLoaderQueue.postRunnable(a3Var);
            }
        }
        str3 = attachFileName;
        a3Var = new a3(this, document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j10, i10, i11);
        if (i11 != 10) {
            LoadOperationUIObject loadOperationUIObject2 = new LoadOperationUIObject(null);
            loadOperationUIObject2.loadInternalRunnable = a3Var;
            this.loadOperationPathsUI.put(str3, loadOperationUIObject2);
        }
        fileLoaderQueue.postRunnable(a3Var);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str) {
        cancelLoadFile(fileLocation, str, false);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str, boolean z4) {
        cancelLoadFile(null, null, null, fileLocation, str, null, z4);
    }

    public void cancelLoadFile(String str) {
        cancelLoadFile(null, null, null, null, null, str, true);
    }

    private void cancelLoadFile(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.FileLocation fileLocation, String str, String str2, boolean z4) {
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
        LoadOperationUIObject remove = this.loadOperationPathsUI.remove(str2);
        Runnable runnable = remove != null ? remove.loadInternalRunnable : null;
        boolean z10 = remove != null;
        if (runnable != null) {
            fileLoaderQueue.cancelRunnable(runnable);
        }
        fileLoaderQueue.postRunnable(new x2(this, str2, 0));
        if (!z10 || document == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new v2(this, 1));
    }

    public static boolean isSamePhoto(TLRPC.FileLocation fileLocation, TLRPC.Photo photo) {
        if (fileLocation != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.FileLocation fileLocation2 = photo.sizes.get(i10).location;
                if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id) {
                    return true;
                }
            }
            if ((-fileLocation.volume_id) == photo.f20867id) {
                return true;
            }
        }
        return false;
    }
}
