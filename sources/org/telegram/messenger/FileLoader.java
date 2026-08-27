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

    public class AnonymousClass1 implements FileUploadOperation.FileUploadOperationDelegate {
        final boolean val$encrypted;
        final String val$location;
        final boolean val$small;

        public AnonymousClass1(boolean z10, String str, boolean z11) {
            this.val$encrypted = z10;
            this.val$location = str;
            this.val$small = z11;
        }

        public void lambda$didFailedUploadingFile$1(boolean z10, String str, boolean z11) {
            FileUploadOperation fileUploadOperation;
            FileUploadOperation fileUploadOperation2;
            if (z10) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (FileLoader.this.delegate != null) {
                FileLoader.this.delegate.fileDidFailedUpload(str, z10);
            }
            if (z11) {
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

        public void lambda$didFinishUploadingFile$0(boolean z10, String str, boolean z11, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, FileUploadOperation fileUploadOperation) {
            FileUploadOperation fileUploadOperation2;
            FileUploadOperation fileUploadOperation3;
            if (z10) {
                FileLoader.this.uploadOperationPathsEnc.remove(str);
            } else {
                FileLoader.this.uploadOperationPaths.remove(str);
            }
            if (z11) {
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
            FileLoader.this.getFileDatabase().putPath(pathData.f19613id, pathData.f19612dc, pathData.type, 0, file != null ? file.toString() : null);
        }
    }

    public interface FileLoaderDelegate {
        void fileDidFailedLoad(String str, int i10);

        void fileDidFailedUpload(String str, boolean z10);

        void fileDidLoaded(String str, File file, Object obj, int i10);

        void fileDidUploaded(String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10);

        void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j10, long j11);

        void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, String str, long j10, long j11, boolean z10);
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
            if (i11 >= fileLoaderPriorityQueueArr.length) {
                dumpFilesQueue();
                return;
            }
            StringBuilder sb2 = new StringBuilder("smallFilesQueue dc");
            int i12 = i11 + 1;
            sb2.append(i12);
            fileLoaderPriorityQueueArr[i11] = new FileLoaderPriorityQueue(i10, sb2.toString(), 0, fileLoaderQueue);
            this.largeFilesQueue[i11] = new FileLoaderPriorityQueue(i10, i0.a.k(i12, "largeFilesQueue dc"), 1, fileLoaderQueue);
            i11 = i12;
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
        if (priority <= 0) {
            linkedList.add(fileLoadOperation);
            return;
        }
        int size = linkedList.size();
        int size2 = linkedList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (linkedList.get(i10).getPriority() < priority) {
                size = i10;
                break;
            }
        }
        linkedList.add(size, fileLoadOperation);
    }

    private void awaitFileLoadOperation(CountDownLatch countDownLatch, boolean z10) {
        try {
            countDownLatch.await();
        } catch (Exception e9) {
            FileLog.e((Throwable) e9, false);
            if (z10) {
                awaitFileLoadOperation(countDownLatch, false);
            }
        }
    }

    public static long bytesToLong(byte[] bArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 = (j10 << 8) ^ ((long) (bArr[i10] & 255));
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
                    if (i11 != 5 && i11 != 13 && i11 != 2) {
                        messageObject = null;
                    }
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
        boolean zIsPremium = AccountInstance.getInstance(i10).getUserConfig().isPremium();
        if (j10 >= 2097152000) {
            return j10 < 4194304000L && zIsPremium;
        }
        return true;
    }

    public static boolean copyFile(InputStream inputStream, File file) {
        return copyFile(inputStream, file, -1);
    }

    public static String fixFileName(String str) {
        return str != null ? str.replaceAll("[\u0001-\u001f<>\u202e:\"/\\\\|?*\u007f]+", "").trim() : str;
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
        String strFixFileName = fixFileName(str3);
        return strFixFileName != null ? strFixFileName : "";
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
        if (str == null) {
            return "";
        }
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

    public static String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(46) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static FilePathDatabase.FileMeta getFileMetadataFromParent(int i10, Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof MessageObject)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                FilePathDatabase.FileMeta fileMeta = new FilePathDatabase.FileMeta();
                fileMeta.dialogId = ((TL_stories.StoryItem) obj).dialogId;
                fileMeta.messageType = 23;
                return fileMeta;
            }
            MessageObject messageObject = (MessageObject) obj;
            FilePathDatabase.FileMeta fileMeta2 = new FilePathDatabase.FileMeta();
            fileMeta2.messageId = messageObject.getId();
            fileMeta2.dialogId = messageObject.getDialogId();
            fileMeta2.messageType = messageObject.type;
            fileMeta2.messageSize = messageObject.getSize();
            return fileMeta2;
        }
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
            FilePathDatabase.FileMeta fileMeta3 = new FilePathDatabase.FileMeta();
            fileMeta3.messageId = Integer.parseInt(matcher.group(1));
            fileMeta3.dialogId = Long.parseLong(matcher.group(2));
            fileMeta3.messageType = Integer.parseInt(matcher.group(3));
            fileMeta3.messageSize = Long.parseLong(matcher.group(4));
            return fileMeta3;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static FileLoader getInstance(int i10) {
        FileLoader fileLoader;
        FileLoader[] fileLoaderArr = Instance;
        FileLoader fileLoader2 = fileLoaderArr[i10];
        if (fileLoader2 != null) {
            return fileLoader2;
        }
        synchronized (FileLoader.class) {
            try {
                fileLoader = fileLoaderArr[i10];
                if (fileLoader == null) {
                    fileLoader = new FileLoader(i10);
                    fileLoaderArr[i10] = fileLoader;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileLoader;
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

    public static String getMimeTypePart(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : "";
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
            return ((TLRPC.Photo) tLObject).f22404id;
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
        } else {
            if (i10 != 2) {
                return i10 == 1 ? 65536 : 0;
            }
            i11 = this.priorityIncreasePointer;
            this.priorityIncreasePointer = i11 + 1;
            i12 = 65537;
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

    public static boolean isVideoMimeType(String str) {
        if ("video/mp4".equals(str)) {
            return true;
        }
        return SharedConfig.streamMkv && "video/x-matroska".equals(str);
    }

    public void lambda$cancel$10() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    public void lambda$cancel$9(String str) {
        FileLoadOperation fileLoadOperationRemove = this.loadOperationPaths.remove(str);
        if (fileLoadOperationRemove != null) {
            fileLoadOperationRemove.getQueue().cancel(fileLoadOperationRemove);
        }
    }

    public void lambda$cancelFileUpload$2(boolean z10, String str) {
        FileUploadOperation fileUploadOperation = !z10 ? this.uploadOperationPaths.get(str) : this.uploadOperationPathsEnc.get(str);
        this.uploadSizes.remove(str);
        if (fileUploadOperation != null) {
            this.uploadOperationPathsEnc.remove(str);
            this.uploadOperationQueue.remove(fileUploadOperation);
            this.uploadSmallOperationQueue.remove(fileUploadOperation);
            fileUploadOperation.cancel();
        }
    }

    public void lambda$cancelLoadAllFiles$12(String str) {
        FileLoadOperation fileLoadOperationRemove = this.loadOperationPaths.remove(str);
        if (fileLoadOperationRemove != null) {
            fileLoadOperationRemove.getQueue().cancel(fileLoadOperationRemove);
        }
    }

    public void lambda$cancelLoadFile$7(String str) {
        FileLoadOperation fileLoadOperationRemove = this.loadOperationPaths.remove(str);
        if (fileLoadOperationRemove != null) {
            fileLoadOperationRemove.getQueue().cancel(fileLoadOperationRemove);
        }
    }

    public void lambda$cancelLoadFile$8() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onDownloadingFilesChanged, new Object[0]);
    }

    public void lambda$changePriority$11(String str, int i10) {
        int priorityValue;
        FileLoadOperation fileLoadOperation = this.loadOperationPaths.get(str);
        if (fileLoadOperation == null || fileLoadOperation.getPriority() == (priorityValue = getPriorityValue(i10))) {
            return;
        }
        fileLoadOperation.setPriority(priorityValue);
        FileLoaderPriorityQueue queue = fileLoadOperation.getQueue();
        queue.remove(fileLoadOperation);
        queue.add(fileLoadOperation);
        queue.checkLoadingOperations();
        StringBuilder sb2 = new StringBuilder("update priority ");
        sb2.append(str);
        sb2.append(" position in queue ");
        sb2.append(fileLoadOperation.getPositionInQueue());
        sb2.append(" account=");
        i0.a.v(this.currentAccount, sb2);
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

    public void lambda$checkUploadNewDataAvailable$3(boolean z10, String str, long j10, long j11, Float f10) {
        FileUploadOperation fileUploadOperation = z10 ? this.uploadOperationPathsEnc.get(str) : this.uploadOperationPaths.get(str);
        if (fileUploadOperation != null) {
            fileUploadOperation.checkNewDataAvailable(j10, j11, f10);
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
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                try {
                    File file3 = new File(getInternalCacheDir(), file.getName() + ".enc.key");
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
                File file4 = new File(file.getParentFile(), "q_" + file.getName());
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

    public void lambda$loadFile$13(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) throws Throwable {
        loadFileInternal(document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str, j10, i10, null, 0L, false, i11);
    }

    public void lambda$loadStreamFile$14(FileLoadOperation[] fileLoadOperationArr, TLRPC.Document document, ImageLocation imageLocation, Object obj, int i10, FileLoadOperationStream fileLoadOperationStream, long j10, boolean z10, int i11, CountDownLatch countDownLatch) {
        String str = null;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = (document != null || imageLocation == null) ? null : imageLocation.location;
        if (document == null && imageLocation != null) {
            str = "mp4";
        }
        fileLoadOperationArr[0] = loadFileInternal(document, null, null, tL_fileLocationToBeDeprecated, imageLocation, obj, str, (document != null || imageLocation == null) ? 0L : imageLocation.currentSize, i10, fileLoadOperationStream, j10, z10, i11);
        countDownLatch.countDown();
    }

    public void lambda$new$18() {
        int i10 = 0;
        while (true) {
            FileLoaderPriorityQueue[] fileLoaderPriorityQueueArr = this.smallFilesQueue;
            if (i10 >= fileLoaderPriorityQueueArr.length) {
                dumpFilesQueue();
                return;
            }
            if (fileLoaderPriorityQueueArr[i10].getCount() > 0 || this.largeFilesQueue[i10].getCount() > 0) {
                FileLog.d("download queue: dc" + (i10 + 1) + " account=" + this.currentAccount + " small_operations=" + this.smallFilesQueue[i10].getCount() + " large_operations=" + this.largeFilesQueue[i10].getCount());
            }
            i10++;
        }
    }

    public void lambda$onNetworkChanged$4(boolean z10) {
        Iterator<Map.Entry<String, FileUploadOperation>> it = this.uploadOperationPaths.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onNetworkChanged(z10);
        }
        Iterator<Map.Entry<String, FileUploadOperation>> it2 = this.uploadOperationPathsEnc.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().onNetworkChanged(z10);
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
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed && objArr[0] == str) {
            callback.run(null);
            runnable.run();
        }
    }

    public void lambda$uploadFile$5(boolean z10, String str, long j10, int i10, boolean z11, boolean z12) {
        long j11;
        if (z10) {
            if (this.uploadOperationPathsEnc.containsKey(str)) {
                return;
            }
        } else if (this.uploadOperationPaths.containsKey(str)) {
            return;
        }
        if (j10 == 0 || this.uploadSizes.get(str) == null) {
            j11 = j10;
        } else {
            this.uploadSizes.remove(str);
            j11 = 0;
        }
        FileUploadOperation fileUploadOperation = new FileUploadOperation(this.currentAccount, str, z10, j11, i10);
        FileLoaderDelegate fileLoaderDelegate = this.delegate;
        if (fileLoaderDelegate != null && j10 != 0) {
            fileLoaderDelegate.fileUploadProgressChanged(fileUploadOperation, str, 0L, j10, z10);
        }
        if (z10) {
            this.uploadOperationPathsEnc.put(str, fileUploadOperation);
        } else {
            this.uploadOperationPaths.put(str, fileUploadOperation);
        }
        if (z11) {
            fileUploadOperation = fileUploadOperation;
            fileUploadOperation = fileUploadOperation;
            fileUploadOperation.setForceSmallFile();
        }
        fileUploadOperation = fileUploadOperation;
        fileUploadOperation = fileUploadOperation;
        fileUploadOperation.setDelegate(new AnonymousClass1(z10, str, z12));
        if (z12) {
            int i11 = this.currentUploadSmallOperationsCount;
            if (i11 >= 1) {
                this.uploadSmallOperationQueue.add(fileUploadOperation);
                return;
            } else {
                this.currentUploadSmallOperationsCount = i11 + 1;
                fileUploadOperation.start();
                return;
            }
        }
        int i12 = this.currentUploadOperationsCount;
        if (i12 >= 1) {
            this.uploadOperationQueue.add(fileUploadOperation);
        } else {
            this.currentUploadOperationsCount = i12 + 1;
            fileUploadOperation.start();
        }
    }

    private FileLoadOperation loadFileInternal(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, FileLoadOperationStream fileLoadOperationStream, long j11, boolean z10, int i11) throws Throwable {
        String str2;
        String str3;
        String attachFileName;
        int i12;
        ?? r10;
        int i13;
        FileLoadOperation fileLoadOperation;
        int i14;
        int i15;
        long j12;
        int i16;
        int i17;
        FileLoadOperation fileLoadOperation2;
        boolean z11;
        FileLoadOperation fileLoadOperation3;
        int iClamp;
        boolean z12;
        FileLoaderPriorityQueue fileLoaderPriorityQueue;
        long j13;
        int i18;
        File directory;
        String str4;
        String path;
        int i19;
        String name;
        File directory2;
        boolean z13;
        File directory3;
        boolean z14;
        File file;
        String str5;
        FileLoadOperation fileLoadOperation4;
        FileStreamLoadOperation fileStreamLoadOperation;
        boolean z15;
        FileLoadOperation fileLoadOperation5;
        boolean z16;
        boolean z17;
        AnonymousClass1 anonymousClass1 = null;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            attachFileName = getAttachFileName(tL_fileLocationToBeDeprecated, str2);
        } else {
            str2 = str;
            if (secureDocument != null) {
                attachFileName = getAttachFileName(secureDocument);
            } else {
                if (document == null) {
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
                    if (i11 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
                        this.loadOperationPathsUI.put(str3, new LoadOperationUIObject(anonymousClass1));
                    }
                    if (document != null && (obj instanceof MessageObject)) {
                        MessageObject messageObject = (MessageObject) obj;
                        if (messageObject.putInDownloadsStore && !messageObject.isAnyKindOfSticker()) {
                            getDownloadController().startDownloadFile(document, messageObject);
                        }
                    }
                    FileLoadOperation fileLoadOperation6 = this.loadOperationPaths.get(str3);
                    int priorityValue = getPriorityValue(i10);
                    if (fileLoadOperation6 != null) {
                        if (i11 != 10 && fileLoadOperation6.isPreloadVideoOperation()) {
                            fileLoadOperation6.setIsPreloadVideoOperation(false);
                        }
                        fileLoadOperation6.setForceRequest(priorityValue > 0);
                        fileLoadOperation6.setStream(fileLoadOperationStream, z10, j11);
                        if (fileLoadOperation6.getPriority() != priorityValue) {
                            fileLoadOperation6.setPriority(priorityValue);
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        fileLoadOperation6.getQueue().add(fileLoadOperation6);
                        fileLoadOperation6.updateProgress();
                        if (z17) {
                            fileLoadOperation6.getQueue().checkLoadingOperations();
                        }
                        return fileLoadOperation6;
                    }
                    File directory4 = getDirectory(4);
                    long j14 = 0;
                    if (secureDocument == null) {
                        if (tL_fileLocationToBeDeprecated == null) {
                            i12 = priorityValue;
                            r10 = 1;
                            r10 = 1;
                            r10 = 1;
                            r10 = 1;
                            r10 = 1;
                            z11 = true;
                            z16 = true;
                            i13 = 0;
                            if (document != null) {
                                FileLoadOperation fileLoadOperation7 = new FileLoadOperation(document, obj);
                                if (MessageObject.isVoiceDocument(document)) {
                                    fileLoadOperation = fileLoadOperation6;
                                    j12 = 0;
                                    i16 = 0;
                                    i17 = 1;
                                } else if (MessageObject.isVideoDocument(document)) {
                                    fileLoadOperation = fileLoadOperation6;
                                    j12 = document.f22386id;
                                    i16 = document.dc_id;
                                    i17 = 2;
                                } else {
                                    fileLoadOperation = fileLoadOperation6;
                                    j12 = document.f22386id;
                                    i16 = document.dc_id;
                                    i17 = 3;
                                }
                                if (MessageObject.isRoundVideoDocument(document)) {
                                    i15 = i17;
                                    j14 = 0;
                                    i14 = 0;
                                    fileLoadOperation3 = fileLoadOperation7;
                                } else {
                                    i14 = i16;
                                    i15 = i17;
                                    j14 = j12;
                                    fileLoadOperation3 = fileLoadOperation7;
                                }
                            } else if (webFile != null) {
                                FileLoadOperation fileLoadOperation8 = new FileLoadOperation(this.currentAccount, webFile);
                                fileLoadOperation = fileLoadOperation8;
                                if (webFile.location != null) {
                                    j14 = 0;
                                    i14 = 0;
                                    i15 = 4;
                                    fileLoadOperation3 = fileLoadOperation;
                                } else if (MessageObject.isVoiceWebDocument(webFile)) {
                                    j14 = 0;
                                    i14 = 0;
                                    i15 = 1;
                                    fileLoadOperation3 = fileLoadOperation8;
                                } else if (MessageObject.isVideoWebDocument(webFile)) {
                                    j14 = 0;
                                    i14 = 0;
                                    i15 = 2;
                                    fileLoadOperation3 = fileLoadOperation8;
                                } else if (MessageObject.isImageWebDocument(webFile)) {
                                    j14 = 0;
                                    i14 = 0;
                                    fileLoadOperation2 = fileLoadOperation8;
                                } else {
                                    fileLoadOperation5 = fileLoadOperation8;
                                }
                            } else {
                                j14 = 0;
                                i14 = 0;
                                i15 = 4;
                                fileLoadOperation3 = fileLoadOperation;
                            }
                            iClamp = Utilities.clamp(fileLoadOperation3.getDatacenterId() - r10, 4, i13);
                            z12 = obj instanceof TL_stories.StoryItem;
                            if (fileLoadOperation3.totalBytesCount <= 20971520 || z12) {
                                fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                            } else {
                                fileLoaderPriorityQueue = this.smallFilesQueue[iClamp];
                            }
                            FileLoaderPriorityQueue fileLoaderPriorityQueue2 = fileLoaderPriorityQueue;
                            if (i11 == 0 && i11 != 10 && !z12) {
                                if (i11 == 2) {
                                    fileLoadOperation3.setEncryptFile(r10);
                                }
                                str4 = str3;
                                directory = directory4;
                                j13 = j14;
                                i18 = i15;
                            } else if (j14 != 0) {
                                path = getFileDatabase().getPath(j14, i14, i15, true);
                                j13 = j14;
                                i19 = i14;
                                i18 = i15;
                                if (path != null) {
                                    file = new File(path);
                                    if (file.exists()) {
                                        name = file.getName();
                                        directory2 = file.getParentFile();
                                        z13 = true;
                                    } else {
                                        name = str3;
                                        directory2 = directory4;
                                        z13 = false;
                                    }
                                } else {
                                    name = str3;
                                    directory2 = directory4;
                                    z13 = false;
                                }
                                if (!z13) {
                                    directory2 = getDirectory(i18);
                                    if (z12) {
                                        directory3 = getDirectory(6);
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        name = str3;
                                    } else if ((i18 != 0 || i18 == 2) && canSaveToPublicStorage(obj)) {
                                        if (i18 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        name = str3;
                                    } else {
                                        if (TextUtils.isEmpty(getDocumentFileName(document)) && canSaveAsFile(obj)) {
                                            String documentFileName = getDocumentFileName(document);
                                            File directory5 = getDirectory(5);
                                            if (directory5 != null) {
                                                directory2 = directory5;
                                                name = documentFileName;
                                                z14 = true;
                                            } else {
                                                name = documentFileName;
                                            }
                                        } else {
                                            name = str3;
                                        }
                                        z14 = false;
                                    }
                                    if (z14) {
                                        fileLoadOperation3.pathSaveData = new FilePathDatabase.PathData(j13, i19, i18);
                                    }
                                }
                                directory = directory2;
                                str4 = name;
                            } else {
                                j13 = j14;
                                i18 = i15;
                                directory = getDirectory(i18);
                                str4 = str3;
                            }
                            str5 = str3;
                            fileLoadOperation4 = fileLoadOperation3;
                            fileLoadOperation4.setPaths(this.currentAccount, str5, fileLoaderPriorityQueue2, directory, directory4, str4);
                            if (i11 == 10) {
                                fileLoadOperation4.setIsPreloadVideoOperation(r10);
                            }
                            fileLoadOperation4.setDelegate(new AnonymousClass2(obj, document, str5, i18));
                            this.loadOperationPaths.put(str5, fileLoadOperation4);
                            int i20 = i12;
                            fileLoadOperation4.setPriority(i20);
                            if (fileLoadOperationStream == null) {
                                fileStreamLoadOperation = FileStreamLoadOperation.allStreams.get(Long.valueOf(j13));
                            } else {
                                fileStreamLoadOperation = fileLoadOperationStream;
                            }
                            if (fileStreamLoadOperation != null) {
                                fileLoadOperation4.setStream(fileStreamLoadOperation, z10, j11);
                            }
                            fileLoaderPriorityQueue2.add(fileLoadOperation4);
                            if (fileLoadOperation4.isStory || i20 < 1048576) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            fileLoaderPriorityQueue2.checkLoadingOperations(z15);
                            if (BuildVars.LOGS_ENABLED) {
                                StringBuilder sbR = a9.p.r("create load operation fileName=", str5, " documentName=");
                                sbR.append(getDocumentFileName(document));
                                sbR.append(" size=");
                                sbR.append(AndroidUtilities.formatFileSize(fileLoadOperation4.totalBytesCount));
                                sbR.append(" position in queue ");
                                sbR.append(fileLoadOperation4.getPositionInQueue());
                                sbR.append(" account=");
                                i0.a.x(sbR, this.currentAccount, " cacheType=", i11, " priority=");
                                sbR.append(fileLoadOperation4.getPriority());
                                sbR.append(" stream=");
                                sbR.append(fileStreamLoadOperation);
                                FileLog.d(sbR.toString());
                            }
                            return fileLoadOperation4;
                        }
                        long j15 = tL_fileLocationToBeDeprecated.volume_id;
                        i12 = priorityValue;
                        z11 = true;
                        i13 = 0;
                        i14 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
                        fileLoadOperation2 = new FileLoadOperation(imageLocation, obj, str2, j10);
                        j14 = j15;
                        i15 = 0;
                        r10 = z11;
                        fileLoadOperation3 = fileLoadOperation2;
                        iClamp = Utilities.clamp(fileLoadOperation3.getDatacenterId() - r10, 4, i13);
                        z12 = obj instanceof TL_stories.StoryItem;
                        if (fileLoadOperation3.totalBytesCount <= 20971520) {
                            fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                        } else {
                            fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                        }
                        FileLoaderPriorityQueue fileLoaderPriorityQueue3 = fileLoaderPriorityQueue;
                        if (i11 == 0) {
                            if (j14 != 0) {
                                path = getFileDatabase().getPath(j14, i14, i15, true);
                                j13 = j14;
                                i19 = i14;
                                i18 = i15;
                                if (path != null) {
                                    file = new File(path);
                                    if (file.exists()) {
                                        name = file.getName();
                                        directory2 = file.getParentFile();
                                        z13 = true;
                                    } else {
                                        name = str3;
                                        directory2 = directory4;
                                        z13 = false;
                                    }
                                } else {
                                    name = str3;
                                    directory2 = directory4;
                                    z13 = false;
                                }
                                if (!z13) {
                                    directory2 = getDirectory(i18);
                                    if (z12) {
                                        directory3 = getDirectory(6);
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        name = str3;
                                    } else {
                                        if (i18 != 0) {
                                            if (i18 == 0) {
                                                directory3 = getDirectory(100);
                                            } else {
                                                directory3 = getDirectory(101);
                                            }
                                            if (directory3 != null) {
                                                directory2 = directory3;
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            name = str3;
                                        } else {
                                            if (i18 == 0) {
                                                directory3 = getDirectory(100);
                                            } else {
                                                directory3 = getDirectory(101);
                                            }
                                            if (directory3 != null) {
                                                directory2 = directory3;
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            name = str3;
                                        }
                                        if (TextUtils.isEmpty(getDocumentFileName(document))) {
                                            name = str3;
                                            z14 = false;
                                        } else {
                                            name = str3;
                                            z14 = false;
                                        }
                                    }
                                    if (z14) {
                                        fileLoadOperation3.pathSaveData = new FilePathDatabase.PathData(j13, i19, i18);
                                    }
                                }
                                directory = directory2;
                                str4 = name;
                            } else {
                                j13 = j14;
                                i18 = i15;
                                directory = getDirectory(i18);
                                str4 = str3;
                            }
                        } else if (j14 != 0) {
                            path = getFileDatabase().getPath(j14, i14, i15, true);
                            j13 = j14;
                            i19 = i14;
                            i18 = i15;
                            if (path != null) {
                                file = new File(path);
                                if (file.exists()) {
                                    name = file.getName();
                                    directory2 = file.getParentFile();
                                    z13 = true;
                                } else {
                                    name = str3;
                                    directory2 = directory4;
                                    z13 = false;
                                }
                            } else {
                                name = str3;
                                directory2 = directory4;
                                z13 = false;
                            }
                            if (!z13) {
                                directory2 = getDirectory(i18);
                                if (z12) {
                                    directory3 = getDirectory(6);
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    name = str3;
                                } else {
                                    if (i18 != 0) {
                                        if (i18 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        name = str3;
                                    } else {
                                        if (i18 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        name = str3;
                                    }
                                    if (TextUtils.isEmpty(getDocumentFileName(document))) {
                                        name = str3;
                                        z14 = false;
                                    } else {
                                        name = str3;
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    fileLoadOperation3.pathSaveData = new FilePathDatabase.PathData(j13, i19, i18);
                                }
                            }
                            directory = directory2;
                            str4 = name;
                        } else {
                            j13 = j14;
                            i18 = i15;
                            directory = getDirectory(i18);
                            str4 = str3;
                        }
                        str5 = str3;
                        fileLoadOperation4 = fileLoadOperation3;
                        fileLoadOperation4.setPaths(this.currentAccount, str5, fileLoaderPriorityQueue3, directory, directory4, str4);
                        if (i11 == 10) {
                            fileLoadOperation4.setIsPreloadVideoOperation(r10);
                        }
                        fileLoadOperation4.setDelegate(new AnonymousClass2(obj, document, str5, i18));
                        this.loadOperationPaths.put(str5, fileLoadOperation4);
                        int i21 = i12;
                        fileLoadOperation4.setPriority(i21);
                        if (fileLoadOperationStream == null) {
                            fileStreamLoadOperation = FileStreamLoadOperation.allStreams.get(Long.valueOf(j13));
                        } else {
                            fileStreamLoadOperation = fileLoadOperationStream;
                        }
                        if (fileStreamLoadOperation != null) {
                            fileLoadOperation4.setStream(fileStreamLoadOperation, z10, j11);
                        }
                        fileLoaderPriorityQueue3.add(fileLoadOperation4);
                        if (fileLoadOperation4.isStory) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        fileLoaderPriorityQueue3.checkLoadingOperations(z15);
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sbR2 = a9.p.r("create load operation fileName=", str5, " documentName=");
                            sbR2.append(getDocumentFileName(document));
                            sbR2.append(" size=");
                            sbR2.append(AndroidUtilities.formatFileSize(fileLoadOperation4.totalBytesCount));
                            sbR2.append(" position in queue ");
                            sbR2.append(fileLoadOperation4.getPositionInQueue());
                            sbR2.append(" account=");
                            i0.a.x(sbR2, this.currentAccount, " cacheType=", i11, " priority=");
                            sbR2.append(fileLoadOperation4.getPriority());
                            sbR2.append(" stream=");
                            sbR2.append(fileStreamLoadOperation);
                            FileLog.d(sbR2.toString());
                        }
                        return fileLoadOperation4;
                    }
                    i12 = priorityValue;
                    z16 = true;
                    i13 = 0;
                    fileLoadOperation5 = new FileLoadOperation(secureDocument);
                    i14 = 0;
                    i15 = 3;
                    r10 = z16;
                    fileLoadOperation3 = fileLoadOperation5;
                    iClamp = Utilities.clamp(fileLoadOperation3.getDatacenterId() - r10, 4, i13);
                    z12 = obj instanceof TL_stories.StoryItem;
                    if (fileLoadOperation3.totalBytesCount <= 20971520) {
                        fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                    } else {
                        fileLoaderPriorityQueue = this.largeFilesQueue[iClamp];
                    }
                    FileLoaderPriorityQueue fileLoaderPriorityQueue4 = fileLoaderPriorityQueue;
                    if (i11 == 0) {
                        if (j14 != 0) {
                            path = getFileDatabase().getPath(j14, i14, i15, true);
                            j13 = j14;
                            i19 = i14;
                            i18 = i15;
                            if (path != null) {
                                file = new File(path);
                                if (file.exists()) {
                                    name = file.getName();
                                    directory2 = file.getParentFile();
                                    z13 = true;
                                } else {
                                    name = str3;
                                    directory2 = directory4;
                                    z13 = false;
                                }
                            } else {
                                name = str3;
                                directory2 = directory4;
                                z13 = false;
                            }
                            if (!z13) {
                                directory2 = getDirectory(i18);
                                if (z12) {
                                    directory3 = getDirectory(6);
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    name = str3;
                                } else {
                                    if (i18 != 0) {
                                        if (i18 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        name = str3;
                                    } else {
                                        if (i18 == 0) {
                                            directory3 = getDirectory(100);
                                        } else {
                                            directory3 = getDirectory(101);
                                        }
                                        if (directory3 != null) {
                                            directory2 = directory3;
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        name = str3;
                                    }
                                    if (TextUtils.isEmpty(getDocumentFileName(document))) {
                                        name = str3;
                                        z14 = false;
                                    } else {
                                        name = str3;
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    fileLoadOperation3.pathSaveData = new FilePathDatabase.PathData(j13, i19, i18);
                                }
                            }
                            directory = directory2;
                            str4 = name;
                        } else {
                            j13 = j14;
                            i18 = i15;
                            directory = getDirectory(i18);
                            str4 = str3;
                        }
                    } else if (j14 != 0) {
                        path = getFileDatabase().getPath(j14, i14, i15, true);
                        j13 = j14;
                        i19 = i14;
                        i18 = i15;
                        if (path != null) {
                            file = new File(path);
                            if (file.exists()) {
                                name = file.getName();
                                directory2 = file.getParentFile();
                                z13 = true;
                            } else {
                                name = str3;
                                directory2 = directory4;
                                z13 = false;
                            }
                        } else {
                            name = str3;
                            directory2 = directory4;
                            z13 = false;
                        }
                        if (!z13) {
                            directory2 = getDirectory(i18);
                            if (z12) {
                                directory3 = getDirectory(6);
                                if (directory3 != null) {
                                    directory2 = directory3;
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                name = str3;
                            } else {
                                if (i18 != 0) {
                                    if (i18 == 0) {
                                        directory3 = getDirectory(100);
                                    } else {
                                        directory3 = getDirectory(101);
                                    }
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    name = str3;
                                } else {
                                    if (i18 == 0) {
                                        directory3 = getDirectory(100);
                                    } else {
                                        directory3 = getDirectory(101);
                                    }
                                    if (directory3 != null) {
                                        directory2 = directory3;
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    name = str3;
                                }
                                if (TextUtils.isEmpty(getDocumentFileName(document))) {
                                    name = str3;
                                    z14 = false;
                                } else {
                                    name = str3;
                                    z14 = false;
                                }
                            }
                            if (z14) {
                                fileLoadOperation3.pathSaveData = new FilePathDatabase.PathData(j13, i19, i18);
                            }
                        }
                        directory = directory2;
                        str4 = name;
                    } else {
                        j13 = j14;
                        i18 = i15;
                        directory = getDirectory(i18);
                        str4 = str3;
                    }
                    str5 = str3;
                    fileLoadOperation4 = fileLoadOperation3;
                    fileLoadOperation4.setPaths(this.currentAccount, str5, fileLoaderPriorityQueue4, directory, directory4, str4);
                    if (i11 == 10) {
                        fileLoadOperation4.setIsPreloadVideoOperation(r10);
                    }
                    fileLoadOperation4.setDelegate(new AnonymousClass2(obj, document, str5, i18));
                    this.loadOperationPaths.put(str5, fileLoadOperation4);
                    int i22 = i12;
                    fileLoadOperation4.setPriority(i22);
                    if (fileLoadOperationStream == null) {
                        fileStreamLoadOperation = FileStreamLoadOperation.allStreams.get(Long.valueOf(j13));
                    } else {
                        fileStreamLoadOperation = fileLoadOperationStream;
                    }
                    if (fileStreamLoadOperation != null) {
                        fileLoadOperation4.setStream(fileStreamLoadOperation, z10, j11);
                    }
                    fileLoaderPriorityQueue4.add(fileLoadOperation4);
                    if (fileLoadOperation4.isStory) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    fileLoaderPriorityQueue4.checkLoadingOperations(z15);
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sbR3 = a9.p.r("create load operation fileName=", str5, " documentName=");
                        sbR3.append(getDocumentFileName(document));
                        sbR3.append(" size=");
                        sbR3.append(AndroidUtilities.formatFileSize(fileLoadOperation4.totalBytesCount));
                        sbR3.append(" position in queue ");
                        sbR3.append(fileLoadOperation4.getPositionInQueue());
                        sbR3.append(" account=");
                        i0.a.x(sbR3, this.currentAccount, " cacheType=", i11, " priority=");
                        sbR3.append(fileLoadOperation4.getPriority());
                        sbR3.append(" stream=");
                        sbR3.append(fileStreamLoadOperation);
                        FileLog.d(sbR3.toString());
                    }
                    return fileLoadOperation4;
                }
                attachFileName = getAttachFileName(document);
            }
        }
        str3 = attachFileName;
        if (str3 != null) {
        }
        return null;
    }

    public static byte[] longToBytes(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j10);
        return byteBufferAllocate.array();
    }

    public void lambda$removeLoadingVideo$1(TLRPC.Document document, boolean z10) {
        String attachFileName = getAttachFileName(document);
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(attachFileName);
        sbO.append(z10 ? "p" : "");
        if (this.loadingVideos.remove(sbO.toString()) != null) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
        }
    }

    public static void setMediaDirs(SparseArray<File> sparseArray) {
        mediaDirs = sparseArray;
    }

    public void cancel(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation == null) {
            return;
        }
        String fileName = fileLoadOperation.getFileName();
        LoadOperationUIObject loadOperationUIObjectRemove = this.loadOperationPathsUI.remove(fileName);
        Runnable runnable = loadOperationUIObjectRemove != null ? loadOperationUIObjectRemove.loadInternalRunnable : null;
        boolean z10 = loadOperationUIObjectRemove != null;
        if (runnable != null) {
            fileLoaderQueue.cancelRunnable(runnable);
        }
        fileLoaderQueue.postRunnable(new x2(this, fileName, 1));
        if (z10) {
            AndroidUtilities.runOnUIThread(new v2(this, 2));
        }
    }

    public void cancelFileUpload(String str, boolean z10) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new n6(this, z10, str, 1));
    }

    public void cancelLoadAllFiles() {
        for (String str : this.loadOperationPathsUI.keySet()) {
            LoadOperationUIObject loadOperationUIObject = this.loadOperationPathsUI.get(str);
            Runnable runnable = loadOperationUIObject != null ? loadOperationUIObject.loadInternalRunnable : null;
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
        fileLoaderQueue.postRunnable(new r4(this, str2, i10, 3));
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
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new d2(6, this, arrayList));
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

    public void checkUploadNewDataAvailable(String str, boolean z10, long j10, long j11) {
        checkUploadNewDataAvailable(str, z10, j10, j11, null);
    }

    public void clearFilePaths() {
        this.filePathDatabase.clear();
    }

    public void clearRecentDownloadedFiles() {
        getDownloadController().clearRecentDownloadedFiles();
    }

    public void deleteFiles(ArrayList<File> arrayList, int i10) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        fileLoaderQueue.postRunnable(new p6(arrayList, i10, 5));
    }

    public void dumpFilesQueue() {
        if (BuildVars.LOGS_ENABLED) {
            fileLoaderQueue.cancelRunnable(this.dumpFilesQueueRunnable);
            fileLoaderQueue.postRunnable(this.dumpFilesQueueRunnable, 10000L);
        }
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
        return str != null && this.loadOperationPathsUI.containsKey(str);
    }

    public boolean isLoadingVideo(TLRPC.Document document, boolean z10) {
        if (document == null) {
            return false;
        }
        HashMap<String, Boolean> map = this.loadingVideos;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getAttachFileName(document));
        sb2.append(z10 ? "p" : "");
        return map.containsKey(sb2.toString());
    }

    public boolean isLoadingVideoAny(TLRPC.Document document) {
        return isLoadingVideo(document, false) || isLoadingVideo(document, true);
    }

    public void loadFile(ImageLocation imageLocation, Object obj, String str, int i10, int i11) {
        if (imageLocation == null) {
            return;
        }
        loadFile(imageLocation.document, imageLocation.secureDocument, imageLocation.webFile, imageLocation.location, imageLocation, obj, str, imageLocation.getSize(), i10, (i11 != 0 || (!imageLocation.isEncrypted() && (imageLocation.photoSize == null || imageLocation.getSize() != 0))) ? i11 : 1);
    }

    public FileLoadOperation loadStreamFile(FileLoadOperationStream fileLoadOperationStream, TLRPC.Document document, ImageLocation imageLocation, Object obj, long j10, boolean z10, int i10) {
        return loadStreamFile(fileLoadOperationStream, document, imageLocation, obj, j10, z10, i10, document == null ? 1 : 0);
    }

    public void onNetworkChanged(boolean z10) {
        fileLoaderQueue.postRunnable(new fh.f(13, this, z10));
    }

    public void removeLoadingVideo(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            AndroidUtilities.runOnUIThread(new w2(this, document, z10, 1));
        } else {
            lambda$removeLoadingVideo$1(document, z10);
        }
    }

    public void setDelegate(FileLoaderDelegate fileLoaderDelegate) {
        this.delegate = fileLoaderDelegate;
    }

    public void setForceStreamLoadingFile(TLRPC.FileLocation fileLocation, String str) {
        if (fileLocation == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new f0(this, fileLocation, str, 21));
    }

    public void setLoadingVideo(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            AndroidUtilities.runOnUIThread(new w2(this, document, z10, 0));
        } else {
            lambda$setLoadingVideo$0(document, z10);
        }
    }

    public void setLoadingVideoForPlayer(TLRPC.Document document, boolean z10) {
        if (document == null) {
            return;
        }
        String attachFileName = getAttachFileName(document);
        HashMap<String, Boolean> map = this.loadingVideos;
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(attachFileName);
        sbO.append(z10 ? "" : "p");
        if (map.containsKey(sbO.toString())) {
            HashMap<String, Boolean> map2 = this.loadingVideos;
            StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(attachFileName);
            sbO2.append(z10 ? "p" : "");
            map2.put(sbO2.toString(), Boolean.TRUE);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
        }
    }

    public void lambda$setLoadingVideo$0(TLRPC.Document document, boolean z10) {
        String attachFileName = getAttachFileName(document);
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(attachFileName);
        sbO.append(z10 ? "p" : "");
        this.loadingVideos.put(sbO.toString(), Boolean.TRUE);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.videoLoadingStateChanged, attachFileName);
    }

    public void setLocalPathTo(TLObject tLObject, String str) {
        int i10;
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            if (document.key != null) {
                i10 = 4;
            } else if (MessageObject.isVoiceDocument(document)) {
                i10 = 1;
            } else {
                i10 = MessageObject.isVideoDocument(document) ? 2 : 3;
            }
            this.filePathDatabase.putPath(document.f22386id, document.dc_id, i10, 1, str);
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

    public void uploadFile(String str, boolean z10, boolean z11, int i10) {
        uploadFile(str, z10, z11, 0L, i10, false);
    }

    public void checkDownloadQueue(FileLoadOperation fileLoadOperation, FileLoaderPriorityQueue fileLoaderPriorityQueue, long j10) {
        fileLoaderQueue.postRunnable(new f0(this, fileLoaderPriorityQueue, fileLoadOperation, 22), j10);
    }

    public static boolean copyFile(InputStream inputStream, File file, int i10) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i11 = 0;
        while (true) {
            int i12 = inputStream.read(bArr);
            if (i12 <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, i12);
            i11 += i12;
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

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i10, boolean z10) {
        return getClosestPhotoSizeWithSize(arrayList, i10, z10, null, false);
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i10, boolean z10) {
        return getClosestVideoSizeWithSize(arrayList, i10, z10, false);
    }

    public void cancelLoadFile(TLRPC.Document document, boolean z10) {
        cancelLoadFile(document, null, null, null, null, null, z10);
    }

    public void checkUploadNewDataAvailable(String str, boolean z10, long j10, long j11, Float f10) {
        fileLoaderQueue.postRunnable(new jh.w5(this, z10, str, j10, j11, f10));
    }

    public File getPathToAttach(TLObject tLObject, boolean z10) {
        return getPathToAttach(tLObject, null, z10);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z10) {
        return getPathToMessage(message, false, z10);
    }

    public FileLoadOperation loadStreamFile(final FileLoadOperationStream fileLoadOperationStream, final TLRPC.Document document, final ImageLocation imageLocation, final Object obj, final long j10, final boolean z10, final int i10, final int i11) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final FileLoadOperation[] fileLoadOperationArr = new FileLoadOperation[1];
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f22285a.lambda$loadStreamFile$14(fileLoadOperationArr, document, imageLocation, obj, i10, fileLoadOperationStream, j10, z10, i11, countDownLatch);
            }
        });
        awaitFileLoadOperation(countDownLatch, true);
        return fileLoadOperationArr[0];
    }

    public void uploadFile(final String str, final boolean z10, final boolean z11, final long j10, final int i10, final boolean z12) {
        if (str == null) {
            return;
        }
        fileLoaderQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f19756a.lambda$uploadFile$5(z10, str, j10, i10, z12, z11);
            }
        });
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
                StringBuilder sb2 = new StringBuilder();
                sb2.append(document.dc_id);
                sb2.append("_");
                return a9.p.o(sb2, document.f22386id, strSubstring);
            }
            return document.dc_id + "_" + document.f22386id;
        }
        if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(secureDocument.secureFile.dc_id);
            sb3.append("_");
            return a9.p.o(sb3, secureDocument.secureFile.f22515id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile.dc_id);
            sb4.append("_");
            return a9.p.o(sb4, tL_secureFile.f22515id, ".jpg");
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
            StringBuilder sb5 = new StringBuilder();
            sb5.append(photoSize.location.volume_id);
            sb5.append("_");
            sb5.append(photoSize.location.local_id);
            sb5.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb5.append(str2);
            return sb5.toString();
        }
        if (tLObject instanceof TLRPC.TL_videoSize) {
            TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
            TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
            if (fileLocation2 == null || (fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                return "";
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(tL_videoSize.location.volume_id);
            sb6.append("_");
            sb6.append(tL_videoSize.location.local_id);
            sb6.append(".");
            if (str2 == null) {
                str2 = "mp4";
            }
            sb6.append(str2);
            return sb6.toString();
        }
        if (tLObject instanceof TLRPC.FileLocation) {
            if (tLObject instanceof TLRPC.TL_fileLocationUnavailable) {
                return "";
            }
            TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(fileLocation3.volume_id);
            sb7.append("_");
            sb7.append(fileLocation3.local_id);
            sb7.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb7.append(str2);
            return sb7.toString();
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
            StringBuilder sb8 = new StringBuilder();
            sb8.append(userProfilePhoto.photo_id);
            sb8.append("_");
            sb8.append(str);
            sb8.append(".");
            if (str2 == null) {
                str2 = "jpg";
            }
            sb8.append(str2);
            return sb8.toString();
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
        StringBuilder sb9 = new StringBuilder();
        sb9.append(chatPhoto.photo_id);
        sb9.append("_");
        sb9.append(str);
        sb9.append(".");
        if (str2 == null) {
            str2 = "jpg";
        }
        sb9.append(str2);
        return sb9.toString();
    }

    public static TLRPC.PhotoSize getClosestPhotoSizeWithSize(ArrayList<TLRPC.PhotoSize> arrayList, int i10, boolean z10, TLRPC.PhotoSize photoSize, boolean z11) {
        int iMax;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.PhotoSize photoSize3 = arrayList.get(i12);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z11 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z10) {
                        iMax = Math.min(photoSize3.h, photoSize3.f22405w);
                        if (photoSize2 == null || ((i10 > 100 && (fileLocation2 = photoSize2.location) != null && fileLocation2.dc_id == Integer.MIN_VALUE) || (photoSize3 instanceof TLRPC.TL_photoCachedSize) || (i10 > i11 && i11 < iMax))) {
                            photoSize2 = photoSize3;
                            i11 = iMax;
                        }
                    } else {
                        iMax = Math.max(photoSize3.f22405w, photoSize3.h);
                        if (photoSize2 == null || ((i10 > 100 && (fileLocation = photoSize2.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (photoSize3 instanceof TLRPC.TL_photoCachedSize) || (iMax <= i10 && i11 < iMax))) {
                            photoSize2 = photoSize3;
                            i11 = iMax;
                        }
                    }
                }
            }
        }
        return photoSize2;
    }

    public static TLRPC.VideoSize getClosestVideoSizeWithSize(ArrayList<TLRPC.VideoSize> arrayList, int i10, boolean z10, boolean z11) {
        int iMax;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.VideoSize videoSize2 = arrayList.get(i12);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    if (z10) {
                        iMax = Math.min(videoSize2.h, videoSize2.f22531w);
                        if (videoSize == null || ((i10 > 100 && (fileLocation2 = videoSize.location) != null && fileLocation2.dc_id == Integer.MIN_VALUE) || (i10 > i11 && i11 < iMax))) {
                            videoSize = videoSize2;
                            i11 = iMax;
                        }
                    } else {
                        iMax = Math.max(videoSize2.f22531w, videoSize2.h);
                        if (videoSize == null || ((i10 > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (iMax <= i10 && i11 < iMax))) {
                            videoSize = videoSize2;
                            i11 = iMax;
                        }
                    }
                }
            }
        }
        return videoSize;
    }

    public void cancelLoadFile(SecureDocument secureDocument) {
        cancelLoadFile(null, secureDocument, null, null, null, null, false);
    }

    public File getPathToAttach(TLObject tLObject, String str, boolean z10) {
        return getPathToAttach(tLObject, null, str, z10, true);
    }

    public File getPathToMessage(TLRPC.Message message, boolean z10, boolean z11) {
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
                    return getPathToAttach(closestPhotoSizeWithSize3, null, z10, z11);
                }
            }
        } else {
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaDocument) {
                return getPathToAttach(MessageObject.getMedia(message).document, null, z10 || MessageObject.getMedia(message).ttl_seconds != 0, z11);
            }
            if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = MessageObject.getMedia(message).photo.sizes;
                if (arrayList2.size() > 0 && (closestPhotoSizeWithSize2 = getClosestPhotoSizeWithSize(arrayList2, AndroidUtilities.getPhotoSize(true), false, null, true)) != null) {
                    return getPathToAttach(closestPhotoSizeWithSize2, null, z10 || MessageObject.getMedia(message).ttl_seconds != 0, z11);
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (MessageObject.getMedia(message).webpage.document != null) {
                    return getPathToAttach(MessageObject.getMedia(message).webpage.document, null, z10, z11);
                }
                if (MessageObject.getMedia(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = MessageObject.getMedia(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (closestPhotoSizeWithSize = getClosestPhotoSizeWithSize(arrayList3, AndroidUtilities.getPhotoSize())) != null) {
                        return getPathToAttach(closestPhotoSizeWithSize, null, z10, z11);
                    }
                }
            } else if (MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return getPathToAttach(((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(message)).photo, null, true, z11);
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
        final d2 d2Var = new d2(5, this, notificationCenterDelegateArr);
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

    public File getPathToAttach(TLObject tLObject, String str, boolean z10, boolean z11) {
        return getPathToAttach(tLObject, null, str, z10, z11);
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

    public File getPathToAttach(TLObject tLObject, String str, String str2, boolean z10, boolean z11) {
        File directory;
        int i10;
        int i11;
        File directory2;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        String path;
        int i16 = 4;
        long j11 = 0;
        if (z10) {
            directory = getDirectory(4);
        } else {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                if (document.key == null) {
                    if (MessageObject.isVoiceDocument(document)) {
                        i16 = 1;
                    } else {
                        i16 = MessageObject.isVideoDocument(document) ? 2 : 3;
                    }
                }
                j10 = document.f22386id;
                i14 = document.dc_id;
                directory2 = getDirectory(i16);
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return getPathToAttach(getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize(true)), str2, false, z11);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        directory2 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                            directory2 = getDirectory(0);
                        } else {
                            directory2 = getDirectory(4);
                        }
                        TLRPC.FileLocation fileLocation2 = photoSize.location;
                        j10 = fileLocation2.volume_id;
                        i12 = fileLocation2.dc_id;
                        i13 = fileLocation2.local_id;
                    }
                    i16 = 0;
                    TLRPC.FileLocation fileLocation3 = photoSize.location;
                    j10 = fileLocation3.volume_id;
                    i12 = fileLocation3.dc_id;
                    i13 = fileLocation3.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    if (fileLocation4 != null && fileLocation4.key == null && ((fileLocation4.volume_id != -2147483648L || fileLocation4.local_id >= 0) && tL_videoSize.size >= 0)) {
                        directory2 = getDirectory(0);
                        i16 = 0;
                    } else {
                        directory2 = getDirectory(4);
                    }
                    TLRPC.FileLocation fileLocation5 = tL_videoSize.location;
                    j10 = fileLocation5.volume_id;
                    i12 = fileLocation5.dc_id;
                    i13 = fileLocation5.local_id;
                } else {
                    if (tLObject instanceof TLRPC.FileLocation) {
                        TLRPC.FileLocation fileLocation6 = (TLRPC.FileLocation) tLObject;
                        if (fileLocation6.key == null) {
                            j11 = fileLocation6.volume_id;
                            if (j11 != -2147483648L || fileLocation6.local_id >= 0) {
                                i10 = fileLocation6.dc_id + (fileLocation6.local_id << 16);
                                directory = getDirectory(0);
                            } else {
                                directory = getDirectory(4);
                                j11 = 0;
                                i10 = 0;
                            }
                        } else {
                            directory = getDirectory(4);
                            j11 = 0;
                            i10 = 0;
                        }
                        i11 = i10;
                    } else if (!(tLObject instanceof TLRPC.UserProfilePhoto) && !(tLObject instanceof TLRPC.ChatPhoto)) {
                        if (tLObject instanceof WebFile) {
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
                            i11 = 0;
                        }
                    } else {
                        if (str == null) {
                            str = "s";
                        }
                        if ("s".equals(str)) {
                            directory = getDirectory(4);
                        } else {
                            directory = getDirectory(0);
                        }
                    }
                    i15 = 0;
                    if (directory == null) {
                        return new File("");
                    }
                    if (j11 == 0 && (path = getInstance(UserConfig.selectedAccount).getFileDatabase().getPath(j11, i11, i15, z11)) != null) {
                        return new File(path);
                    }
                    return new File(directory, getAttachFileName(tLObject, str2));
                }
                i14 = (i13 << 16) + i12;
            }
            i11 = i14;
            directory = directory2;
            i15 = i16;
            j11 = j10;
            if (directory == null) {
                return new File("");
            }
            if (j11 == 0) {
            }
            return new File(directory, getAttachFileName(tLObject, str2));
        }
        i11 = 0;
        i15 = 0;
        if (directory == null) {
            return new File("");
        }
        if (j11 == 0) {
        }
        return new File(directory, getAttachFileName(tLObject, str2));
    }

    public void cancelLoadFile(TLRPC.PhotoSize photoSize, boolean z10) {
        cancelLoadFile(null, null, null, photoSize.location, null, null, z10);
    }

    public void loadFile(WebFile webFile, int i10, int i11) {
        loadFile(null, null, webFile, null, null, null, null, 0L, i10, i11);
    }

    private void loadFile(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        String str2;
        String str3;
        String attachFileName;
        a3 a3Var;
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
                a3Var = new a3(this, document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j10, i10, i11);
                if (i11 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
                    LoadOperationUIObject loadOperationUIObject = new LoadOperationUIObject(anonymousClass1);
                    loadOperationUIObject.loadInternalRunnable = a3Var;
                    this.loadOperationPathsUI.put(str3, loadOperationUIObject);
                }
                fileLoaderQueue.postRunnable(a3Var);
            }
        }
        str3 = attachFileName;
        a3Var = new a3(this, document, secureDocument, webFile, tL_fileLocationToBeDeprecated, imageLocation, obj, str2, j10, i10, i11);
        if (i11 != 10) {
            LoadOperationUIObject loadOperationUIObject2 = new LoadOperationUIObject(anonymousClass1);
            loadOperationUIObject2.loadInternalRunnable = a3Var;
            this.loadOperationPathsUI.put(str3, loadOperationUIObject2);
        }
        fileLoaderQueue.postRunnable(a3Var);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str) {
        cancelLoadFile(fileLocation, str, false);
    }

    public void cancelLoadFile(TLRPC.FileLocation fileLocation, String str, boolean z10) {
        cancelLoadFile(null, null, null, fileLocation, str, null, z10);
    }

    public void cancelLoadFile(String str) {
        cancelLoadFile(null, null, null, null, null, str, true);
    }

    private void cancelLoadFile(TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.FileLocation fileLocation, String str, String str2, boolean z10) {
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
        boolean z11 = loadOperationUIObjectRemove != null;
        if (runnable != null) {
            fileLoaderQueue.cancelRunnable(runnable);
        }
        fileLoaderQueue.postRunnable(new x2(this, str2, 0));
        if (!z11 || document == null) {
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
            if ((-fileLocation.volume_id) == photo.f22404id) {
                return true;
            }
        }
        return false;
    }
}
