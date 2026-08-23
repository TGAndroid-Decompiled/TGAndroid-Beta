package org.telegram.messenger;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.messenger.utils.ImmutableByteArrayOutputStream;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Storage.CacheModel;

public class FileLoadOperation {
    private static final int FINISH_CODE_DEFAULT = 0;
    private static final int FINISH_CODE_FILE_ALREADY_EXIST = 1;
    public static ImmutableByteArrayOutputStream filesQueueByteBuffer = null;
    private static int globalRequestPointer = 0;
    private static final int preloadMaxBytes = 2097152;
    private static final int stateCanceled = 4;
    private static final int stateCancelling = 5;
    private static final int stateDownloading = 1;
    private static final int stateFailed = 2;
    private static final int stateFinished = 3;
    private static final int stateIdle = 0;
    private final boolean FULL_LOGS;
    private boolean allowDisordererFileSave;
    private int bigFileSizeFrom;
    private long bytesCountPadding;
    private File cacheFileFinal;
    private boolean cacheFileFinalReady;
    private File cacheFileGzipTemp;
    private File cacheFileParts;
    private File cacheFilePreload;
    private File cacheFileTemp;
    private File cacheIvTemp;
    private final Runnable cancelAfterNoStreamListeners;
    private ArrayList<RequestInfo> cancelledRequestInfos;
    public volatile boolean caughtPremiumFloodWait;
    private byte[] cdnCheckBytes;
    private int cdnChunkCheckSize;
    private int cdnDatacenterId;
    private HashMap<Long, TLRPC.TL_fileHash> cdnHashes;
    private byte[] cdnIv;
    private byte[] cdnKey;
    private byte[] cdnToken;
    private volatile boolean closeFilePartsStreamOnWriteEnd;
    public int currentAccount;
    private int currentDownloadChunkSize;
    private int currentMaxDownloadRequests;
    private int currentType;
    private int datacenterId;
    private ArrayList<RequestInfo> delayedRequestInfos;
    private FileLoadOperationDelegate delegate;
    private long documentId;
    private int downloadChunkSize;
    private int downloadChunkSizeAnimation;
    private int downloadChunkSizeBig;
    private long downloadedBytes;
    private boolean encryptFile;
    private byte[] encryptIv;
    private byte[] encryptKey;
    private String ext;
    private FilePathDatabase.FileMeta fileMetadata;
    private String fileName;
    private RandomAccessFile fileOutputStream;
    private RandomAccessFile filePartsStream;
    private RandomAccessFile fileReadStream;
    private Runnable fileWriteRunnable;
    private RandomAccessFile fiv;
    private boolean forceSmallChunk;
    private long foundMoovSize;
    private int initialDatacenterId;
    private boolean isCdn;
    private boolean isForceRequest;
    private boolean isPreloadVideoOperation;
    public boolean isStory;
    private boolean isStream;
    private byte[] iv;
    private byte[] key;
    protected long lastProgressUpdateTime;
    protected TLRPC.InputFileLocation location;
    private int maxCdnParts;
    private int maxDownloadRequests;
    private int maxDownloadRequestsAnimation;
    private int maxDownloadRequestsBig;
    private int moovFound;
    private long nextAtomOffset;
    private boolean nextPartWasPreloaded;
    private long nextPreloadDownloadOffset;
    private ArrayList<Range> notCheckedCdnRanges;
    private ArrayList<Range> notLoadedBytesRanges;
    private volatile ArrayList<Range> notLoadedBytesRangesCopy;
    private ArrayList<Range> notRequestedBytesRanges;
    public Object parentObject;
    public FilePathDatabase.PathData pathSaveData;
    private volatile boolean paused;
    public boolean preFinished;
    private boolean preloadFinished;
    private long preloadNotRequestedBytesCount;
    private int preloadPrefixSize;
    private RandomAccessFile preloadStream;
    private int preloadStreamFileOffset;
    private byte[] preloadTempBuffer;
    private int preloadTempBufferCount;
    private HashMap<Long, PreloadRange> preloadedBytesRanges;
    private int priority;
    private FileLoaderPriorityQueue priorityQueue;
    private RequestInfo priorityRequestInfo;
    private int renameRetryCount;
    public ArrayList<RequestInfo> requestInfos;
    private long requestedBytesCount;
    private HashMap<Long, Integer> requestedPreloadedBytesRanges;
    private boolean requestedReference;
    private boolean requestingCdnOffsets;
    protected boolean requestingReference;
    private int requestsCount;
    private boolean reuploadingCdn;
    private long startTime;
    private boolean started;
    private volatile int state;
    private String storeFileName;
    private File storePath;
    FileLoadOperationStream stream;
    private ArrayList<FileLoadOperationStream> streamListeners;
    long streamOffset;
    boolean streamPriority;
    private long streamPriorityStartOffset;
    private long streamStartOffset;
    private boolean supportsPreloading;
    private File tempPath;
    public long totalBytesCount;
    private int totalPreloadedBytes;
    long totalTime;
    public final ArrayList<Integer> uiRequestTokens;
    private boolean ungzip;
    private WebFile webFile;
    private TLRPC.InputWebFileLocation webLocation;
    private volatile boolean writingToFilePartsStream;
    public static volatile DispatchQueue filesQueue = new DispatchQueue("writeFileQueue");
    private static final Object lockObject = new Object();

    public interface FileLoadOperationDelegate {
        void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j, long j2);

        void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i);

        void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file);

        void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file);

        boolean hasAnotherRefOnFile(String str);

        boolean isLocallyCreatedFile(String str);

        void saveFilePath(FilePathDatabase.PathData pathData, File file);
    }

    public void setStream(final FileLoadOperationStream fileLoadOperationStream, boolean z, long j) {
        this.stream = fileLoadOperationStream;
        this.streamOffset = j;
        this.streamPriority = z;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.$r8$lambda$aIPrMqUafVk9CHPkrLsBAmTwp60(this.f$0, fileLoadOperationStream);
            }
        });
    }

    public static void $r8$lambda$aIPrMqUafVk9CHPkrLsBAmTwp60(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream) {
        if (fileLoadOperation.streamListeners == null) {
            fileLoadOperation.streamListeners = new ArrayList<>();
        }
        if (fileLoadOperationStream != null && !fileLoadOperation.streamListeners.contains(fileLoadOperationStream)) {
            fileLoadOperation.streamListeners.add(fileLoadOperationStream);
        }
        if (!fileLoadOperation.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(fileLoadOperation.cancelAfterNoStreamListeners);
        }
        if (fileLoadOperationStream == null || fileLoadOperation.state == 1 || fileLoadOperation.state == 0) {
            return;
        }
        fileLoadOperationStream.newDataAvailable();
    }

    public int getPositionInQueue() {
        return getQueue().getPosition(this);
    }

    public boolean checkPrefixPreloadFinished() {
        int i = this.preloadPrefixSize;
        if (i > 0 && this.downloadedBytes > i) {
            ArrayList<Range> arrayList = this.notLoadedBytesRanges;
            if (arrayList == null) {
                return true;
            }
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    jMin = Math.min(jMin, arrayList.get(i2).start);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return true;
                }
            }
            if (jMin > this.preloadPrefixSize) {
                return true;
            }
        }
        return false;
    }

    protected static class RequestInfo {
        public boolean cancelled;
        public boolean cancelling;
        public int chunkSize;
        public int connectionType;
        private boolean forceSmallChunk;
        private long offset;
        public long requestStartTime;
        public int requestToken;
        private TLRPC.TL_upload_file response;
        private TLRPC.TL_upload_cdnFile responseCdn;
        private TLRPC.TL_upload_webFile responseWeb;
        public Runnable whenCancelled;

        protected RequestInfo() {
        }
    }

    public static class Range {
        private long end;
        private long start;

        private Range(long j, long j2) {
            this.start = j;
            this.end = j2;
        }

        public String toString() {
            return "Range{start=" + this.start + ", end=" + this.end + '}';
        }
    }

    static class PreloadRange {
        private long fileOffset;
        private long length;

        private PreloadRange(long j, long j2) {
            this.fileOffset = j;
            this.length = j2;
        }
    }

    private void updateParams() {
        if ((this.preloadPrefixSize > 0 || MessagesController.getInstance(this.currentAccount).getfileExperimentalParams) && !this.forceSmallChunk) {
            this.downloadChunkSizeBig = 524288;
            this.maxDownloadRequests = 8;
            this.maxDownloadRequestsBig = 8;
        } else {
            this.downloadChunkSizeBig = 131072;
            this.maxDownloadRequests = 4;
            this.maxDownloadRequestsBig = 4;
        }
        this.maxCdnParts = (int) (2097152000 / ((long) this.downloadChunkSizeBig));
    }

    public FileLoadOperation(ImageLocation imageLocation, Object obj, String str, long j) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.m437$r8$lambda$IbDGTS_pBx3XIQphxaYlWvQU(this.f$0);
            }
        };
        updateParams();
        this.parentObject = obj;
        this.isStory = obj instanceof TL_stories.TL_storyItem;
        this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
        this.isStream = imageLocation.imageType == 2;
        if (imageLocation.isEncrypted()) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.location = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
            long j2 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.id = j2;
            tL_inputEncryptedFileLocation.volume_id = j2;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = imageLocation.access_hash;
            byte[] bArr = new byte[32];
            this.iv = bArr;
            System.arraycopy(imageLocation.iv, 0, bArr, 0, 32);
            this.key = imageLocation.key;
        } else if (imageLocation.photoPeer != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
            long j3 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.id = j3;
            tL_inputPeerPhotoFileLocation.volume_id = j3;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = imageLocation.photoId;
            tL_inputPeerPhotoFileLocation.big = imageLocation.photoPeerType == 0;
            tL_inputPeerPhotoFileLocation.peer = imageLocation.photoPeer;
            this.location = tL_inputPeerPhotoFileLocation;
        } else if (imageLocation.stickerSet != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
            long j4 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.id = j4;
            tL_inputStickerSetThumb.volume_id = j4;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = imageLocation.thumbVersion;
            tL_inputStickerSetThumb.stickerset = imageLocation.stickerSet;
            this.location = tL_inputStickerSetThumb;
        } else if (imageLocation.thumbSize != null) {
            if (imageLocation.photoId != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.location = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.id = imageLocation.photoId;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = imageLocation.location;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = imageLocation.access_hash;
                tL_inputPhotoFileLocation.file_reference = imageLocation.file_reference;
                tL_inputPhotoFileLocation.thumb_size = imageLocation.thumbSize;
                if (imageLocation.imageType == 2) {
                    this.allowDisordererFileSave = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j5 = imageLocation.documentId;
                tL_inputDocumentFileLocation.id = j5;
                this.documentId = j5;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = imageLocation.location;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = imageLocation.access_hash;
                tL_inputDocumentFileLocation.file_reference = imageLocation.file_reference;
                tL_inputDocumentFileLocation.thumb_size = imageLocation.thumbSize;
            }
            TLRPC.InputFileLocation inputFileLocation = this.location;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.location = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = imageLocation.location;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = imageLocation.access_hash;
            byte[] bArr2 = imageLocation.file_reference;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.allowDisordererFileSave = true;
        }
        int i = imageLocation.imageType;
        this.ungzip = i == 1 || i == 3;
        int i2 = imageLocation.dc_id;
        this.datacenterId = i2;
        this.initialDatacenterId = i2;
        this.currentType = 16777216;
        this.totalBytesCount = j;
        this.ext = str == null ? "jpg" : str;
    }

    public FileLoadOperation(SecureDocument secureDocument) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.m437$r8$lambda$IbDGTS_pBx3XIQphxaYlWvQU(this.f$0);
            }
        };
        updateParams();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.location = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        tL_inputSecureFileLocation.id = tL_secureFile.id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.datacenterId = tL_secureFile.dc_id;
        this.totalBytesCount = tL_secureFile.size;
        this.allowDisordererFileSave = true;
        this.currentType = 67108864;
        this.ext = ".jpg";
    }

    public FileLoadOperation(int i, WebFile webFile) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.m437$r8$lambda$IbDGTS_pBx3XIQphxaYlWvQU(this.f$0);
            }
        };
        updateParams();
        this.currentAccount = i;
        this.webFile = webFile;
        this.webLocation = webFile.location;
        this.totalBytesCount = webFile.size;
        int i2 = MessagesController.getInstance(i).webFileDatacenterId;
        this.datacenterId = i2;
        this.initialDatacenterId = i2;
        String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
        if (webFile.mime_type.startsWith("image/")) {
            this.currentType = 16777216;
        } else if (webFile.mime_type.equals("audio/ogg")) {
            this.currentType = 50331648;
        } else if (webFile.mime_type.startsWith("video/")) {
            this.currentType = 33554432;
        } else {
            this.currentType = 67108864;
        }
        this.allowDisordererFileSave = true;
        this.ext = ImageLoader.getHttpUrlExtension(webFile.url, mimeTypePart);
    }

    public FileLoadOperation(TLRPC.Document document, Object obj) {
        int iLastIndexOf;
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.m437$r8$lambda$IbDGTS_pBx3XIQphxaYlWvQU(this.f$0);
            }
        };
        updateParams();
        try {
            this.parentObject = obj;
            this.isStory = obj instanceof TL_stories.TL_storyItem;
            this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.location = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.id = document.id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i = document.dc_id;
                this.datacenterId = i;
                this.initialDatacenterId = i;
                byte[] bArr = new byte[32];
                this.iv = bArr;
                System.arraycopy(document.iv, 0, bArr, 0, 32);
                this.key = document.key;
            } else if (document instanceof TLRPC.TL_document) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j = document.id;
                tL_inputDocumentFileLocation.id = j;
                this.documentId = j;
                tL_inputDocumentFileLocation.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocumentFileLocation.file_reference = bArr2;
                tL_inputDocumentFileLocation.thumb_size = "";
                if (bArr2 == null) {
                    tL_inputDocumentFileLocation.file_reference = new byte[0];
                }
                int i2 = document.dc_id;
                this.datacenterId = i2;
                this.initialDatacenterId = i2;
                this.allowDisordererFileSave = true;
                int size = document.attributes.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.supportsPreloading = true;
                        this.preloadPrefixSize = document.attributes.get(i3).preload_prefix_size;
                        break;
                    }
                }
            }
            this.ungzip = "application/x-tgsticker".equals(document.mime_type) || "application/x-tgwallpattern".equals(document.mime_type);
            long j2 = document.size;
            this.totalBytesCount = j2;
            if (this.key != null && j2 % 16 != 0) {
                long j3 = 16 - (j2 % 16);
                this.bytesCountPadding = j3;
                this.totalBytesCount = j2 + j3;
            }
            String documentFileName = FileLoader.getDocumentFileName(document);
            this.ext = documentFileName;
            if (documentFileName == null || (iLastIndexOf = documentFileName.lastIndexOf(46)) == -1) {
                this.ext = "";
            } else {
                this.ext = this.ext.substring(iLastIndexOf);
            }
            if ("audio/ogg".equals(document.mime_type)) {
                this.currentType = 50331648;
            } else if (FileLoader.isVideoMimeType(document.mime_type)) {
                this.currentType = 33554432;
            } else {
                this.currentType = 67108864;
            }
            if (this.ext.length() <= 1) {
                this.ext = FileLoader.getExtensionByMimeType(document.mime_type);
            }
        } catch (Exception e) {
            FileLog.e(e);
            onFail(true, 0);
        }
    }

    public void setEncryptFile(boolean z) {
        this.encryptFile = z;
        if (z) {
            this.allowDisordererFileSave = false;
        }
    }

    public int getDatacenterId() {
        return this.initialDatacenterId;
    }

    public void setForceRequest(boolean z) {
        this.isForceRequest = z;
    }

    public boolean isForceRequest() {
        return this.isForceRequest;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPaths(int i, String str, FileLoaderPriorityQueue fileLoaderPriorityQueue, File file, File file2, String str2) {
        this.storePath = file;
        this.tempPath = file2;
        this.currentAccount = i;
        this.fileName = str;
        this.storeFileName = str2;
        this.priorityQueue = fileLoaderPriorityQueue;
    }

    public FileLoaderPriorityQueue getQueue() {
        return this.priorityQueue;
    }

    public boolean wasStarted() {
        return this.started && !this.paused;
    }

    public int getCurrentType() {
        return this.currentType;
    }

    private void removePart(ArrayList<Range> arrayList, long j, long j2) {
        boolean z;
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            Range range = arrayList.get(i2);
            if (j == range.end) {
                range.end = j2;
            } else if (j2 == range.start) {
                range.start = j;
            } else {
                i2++;
            }
            z = true;
            break;
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return FileLoadOperation.m441$r8$lambda$jrrmjRfBdFxX5rOyA6qI6qziWE((FileLoadOperation.Range) obj, (FileLoadOperation.Range) obj2);
            }
        });
        while (i < arrayList.size() - 1) {
            Range range2 = arrayList.get(i);
            int i3 = i + 1;
            Range range3 = arrayList.get(i3);
            if (range2.end == range3.start) {
                range2.end = range3.end;
                arrayList.remove(i3);
                i--;
            }
            i++;
        }
        if (z) {
            return;
        }
        arrayList.add(new Range(j, j2));
    }

    public static int m441$r8$lambda$jrrmjRfBdFxX5rOyA6qI6qziWE(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        return range.start < range2.start ? -1 : 0;
    }

    private void addPart(ArrayList<Range> arrayList, long j, long j2, boolean z) {
        long j3;
        if (arrayList == null || j2 < j) {
            return;
        }
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i < size) {
                Range range = arrayList.get(i);
                if (j <= range.start) {
                    if (j2 >= range.end) {
                        arrayList.remove(i);
                    } else if (j2 > range.start) {
                        range.start = j2;
                    } else {
                        i++;
                    }
                    j3 = j;
                    z2 = true;
                } else {
                    if (j2 < range.end) {
                        j3 = j;
                        arrayList.add(0, new Range(range.start, j3));
                        range.start = j2;
                    } else {
                        j3 = j;
                        if (j3 < range.end) {
                            range.end = j3;
                        } else {
                            i++;
                        }
                    }
                    z2 = true;
                }
            } else {
                j3 = j;
            }
            if (z) {
                if (z2) {
                    final ArrayList arrayList2 = new ArrayList(arrayList);
                    if (this.fileWriteRunnable != null) {
                        filesQueue.cancelRunnable(this.fileWriteRunnable);
                    }
                    synchronized (this) {
                        this.writingToFilePartsStream = true;
                    }
                    DispatchQueue dispatchQueue = filesQueue;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            FileLoadOperation.m438$r8$lambda$MdKLK1tGNaOfCQR1nMxBOyXfeU(this.f$0, arrayList2);
                        }
                    };
                    this.fileWriteRunnable = runnable;
                    dispatchQueue.postRunnable(runnable);
                    notifyStreamListeners();
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j3 + " - " + j2);
                    return;
                }
                return;
            }
            return;
        }
    }

    public static void m438$r8$lambda$MdKLK1tGNaOfCQR1nMxBOyXfeU(FileLoadOperation fileLoadOperation, ArrayList arrayList) {
        fileLoadOperation.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (fileLoadOperation.filePartsStream == null) {
                return;
            }
            int size = arrayList.size();
            int i = (size * 16) + 4;
            ImmutableByteArrayOutputStream immutableByteArrayOutputStream = filesQueueByteBuffer;
            if (immutableByteArrayOutputStream == null) {
                filesQueueByteBuffer = new ImmutableByteArrayOutputStream(i);
            } else {
                immutableByteArrayOutputStream.reset();
            }
            filesQueueByteBuffer.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Range range = (Range) arrayList.get(i2);
                filesQueueByteBuffer.writeLong(range.start);
                filesQueueByteBuffer.writeLong(range.end);
            }
            synchronized (fileLoadOperation) {
                try {
                    RandomAccessFile randomAccessFile = fileLoadOperation.filePartsStream;
                    if (randomAccessFile == null) {
                        return;
                    }
                    randomAccessFile.seek(0L);
                    fileLoadOperation.filePartsStream.write(filesQueueByteBuffer.buf, 0, i);
                    fileLoadOperation.writingToFilePartsStream = false;
                    if (fileLoadOperation.closeFilePartsStreamOnWriteEnd) {
                        try {
                            fileLoadOperation.filePartsStream.getChannel().close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        fileLoadOperation.filePartsStream.close();
                        fileLoadOperation.filePartsStream = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            FileLog.e((Throwable) e2, false);
            if (AndroidUtilities.isENOSPC(e2)) {
                LaunchActivity.checkFreeDiscSpaceStatic(1);
            } else if (AndroidUtilities.isEROFS(e2)) {
                SharedConfig.checkSdCard(fileLoadOperation.cacheFileFinal);
            }
        }
        fileLoadOperation.totalTime += System.currentTimeMillis() - jCurrentTimeMillis;
    }

    private void notifyStreamListeners() {
        ArrayList<FileLoadOperationStream> arrayList = this.streamListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.streamListeners.get(i).newDataAvailable();
            }
        }
    }

    protected File getCacheFileFinal() {
        return this.cacheFileFinal;
    }

    protected File getCurrentFile() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final File[] fileArr = new File[1];
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.$r8$lambda$Cy1sXdcHQV6ntsmZ77tNEhPS0mM(this.f$0, fileArr, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return fileArr[0];
    }

    public static void $r8$lambda$Cy1sXdcHQV6ntsmZ77tNEhPS0mM(FileLoadOperation fileLoadOperation, File[] fileArr, CountDownLatch countDownLatch) {
        if (fileLoadOperation.state == 3 && !fileLoadOperation.preloadFinished) {
            fileArr[0] = fileLoadOperation.cacheFileFinal;
        } else {
            fileArr[0] = fileLoadOperation.cacheFileTemp;
        }
        countDownLatch.countDown();
    }

    protected File getCurrentFileFast() {
        if (this.state == 3 && !this.preloadFinished && this.cacheFileFinalReady) {
            return this.cacheFileFinal;
        }
        return this.cacheFileTemp;
    }

    private long getDownloadedLengthFromOffsetInternal(ArrayList<Range> arrayList, long j, long j2) {
        long j3;
        if (arrayList == null || this.state == 3 || arrayList.isEmpty()) {
            if (this.state == 3) {
                return j2;
            }
            long j4 = this.downloadedBytes;
            if (j4 == 0) {
                return 0L;
            }
            return Math.min(j2, Math.max(j4 - j, 0L));
        }
        int size = arrayList.size();
        Range range = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                j3 = j2;
                break;
            }
            Range range2 = arrayList.get(i);
            if (j <= range2.start && (range == null || range2.start < range.start)) {
                range = range2;
            }
            if (range2.start <= j && range2.end > j) {
                j3 = 0;
                break;
            }
            i++;
        }
        if (j3 == 0) {
            return 0L;
        }
        if (range != null) {
            return Math.min(j2, range.start - j);
        }
        return Math.min(j2, Math.max(this.totalBytesCount - j, 0L));
    }

    protected float getDownloadedLengthFromOffset(float f) {
        ArrayList<Range> arrayList = this.notLoadedBytesRangesCopy;
        long j = this.totalBytesCount;
        if (j == 0 || arrayList == null) {
            return 0.0f;
        }
        return f + (getDownloadedLengthFromOffsetInternal(arrayList, (int) (j * f), j) / this.totalBytesCount);
    }

    protected long[] getDownloadedLengthFromOffset(final long j, final long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final long[] jArr = new long[2];
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.m445$r8$lambda$z09YniD4r24QWQ5cEQps6s3T0(this.f$0, jArr, j, j2, countDownLatch);
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return jArr;
    }

    public static void m445$r8$lambda$z09YniD4r24QWQ5cEQps6s3T0(FileLoadOperation fileLoadOperation, long[] jArr, long j, long j2, CountDownLatch countDownLatch) {
        FileLoadOperation fileLoadOperation2;
        fileLoadOperation.getClass();
        try {
            fileLoadOperation2 = fileLoadOperation;
            try {
                jArr[0] = fileLoadOperation2.getDownloadedLengthFromOffsetInternal(fileLoadOperation.notLoadedBytesRanges, j, j2);
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
                jArr[0] = 0;
            }
        } catch (Throwable th2) {
            th = th2;
            fileLoadOperation2 = fileLoadOperation;
        }
        if (fileLoadOperation2.state == 3) {
            jArr[1] = 1;
        }
        countDownLatch.countDown();
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getDocumentId() {
        return this.documentId;
    }

    protected void removeStreamListener(final FileLoadOperationStream fileLoadOperationStream) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.$r8$lambda$Zx8nYjN28M3jJdc0DnWTRtmLSKQ(this.f$0, fileLoadOperationStream);
            }
        });
    }

    public static void $r8$lambda$Zx8nYjN28M3jJdc0DnWTRtmLSKQ(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream) {
        if (fileLoadOperation.streamListeners == null) {
            return;
        }
        FileLog.e("FileLoadOperation " + fileLoadOperation.getFileName() + " removing stream listener " + fileLoadOperationStream);
        fileLoadOperation.streamListeners.remove(fileLoadOperationStream);
    }

    public static void m437$r8$lambda$IbDGTS_pBx3XIQphxaYlWvQU(FileLoadOperation fileLoadOperation) {
        fileLoadOperation.pause();
        FileLoader.getInstance(fileLoadOperation.currentAccount).cancelLoadFile(fileLoadOperation.getFileName());
    }

    private void copyNotLoadedRanges() {
        if (this.notLoadedBytesRanges == null) {
            return;
        }
        this.notLoadedBytesRangesCopy = new ArrayList<>(this.notLoadedBytesRanges);
    }

    public void pause() {
        if (this.state != 1) {
            return;
        }
        this.paused = true;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.$r8$lambda$KBtsGQBA6jF20iflz9NrjgtsRos(this.f$0);
            }
        });
    }

    public static void $r8$lambda$KBtsGQBA6jF20iflz9NrjgtsRos(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation.isStory) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " pause operation, clear requests");
            }
            fileLoadOperation.clearOperation(null, false, true);
            return;
        }
        for (int i = 0; i < fileLoadOperation.requestInfos.size(); i++) {
            ConnectionsManager.getInstance(fileLoadOperation.currentAccount).failNotRunningRequest(fileLoadOperation.requestInfos.get(i).requestToken);
        }
    }

    public boolean start() {
        return start(this.stream, this.streamOffset, this.streamPriority);
    }

    public boolean start(final FileLoadOperationStream fileLoadOperationStream, final long j, final boolean z) {
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        boolean z2;
        boolean z3;
        long j3;
        ?? r12;
        long j4;
        ?? r6;
        long j5;
        boolean z4;
        boolean z5;
        RandomAccessFile randomAccessFile;
        int i2;
        this.startTime = System.currentTimeMillis();
        updateParams();
        if (this.currentDownloadChunkSize == 0) {
            if (this.forceSmallChunk) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: restart with small chunk");
                }
                this.currentDownloadChunkSize = 32768;
                this.currentMaxDownloadRequests = 4;
            } else if (this.isStory) {
                this.currentDownloadChunkSize = this.downloadChunkSizeBig;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsBig;
            } else if (this.isStream) {
                this.currentDownloadChunkSize = this.downloadChunkSizeAnimation;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsAnimation;
            } else {
                boolean z6 = this.totalBytesCount >= ((long) this.bigFileSizeFrom);
                this.currentDownloadChunkSize = z6 ? this.downloadChunkSizeBig : this.downloadChunkSize;
                this.currentMaxDownloadRequests = z6 ? this.maxDownloadRequestsBig : this.maxDownloadRequests;
            }
        }
        final boolean z7 = this.state != 0;
        boolean z8 = this.paused;
        this.paused = false;
        if (fileLoadOperationStream != null) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoadOperation.$r8$lambda$AjDyTHXJZKzXkVi74T4G73LZdRA(this.f$0, z, j, fileLoadOperationStream, z7);
                }
            });
        } else if (z7) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.startDownloadRequest(-1);
                }
            });
        }
        if (z7) {
            return z8;
        }
        if (this.location == null && this.webLocation == null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("loadOperation: no location, failing");
            }
            onFail(true, 0);
            return false;
        }
        long j6 = this.currentDownloadChunkSize;
        this.streamStartOffset = (j / j6) * j6;
        if (this.allowDisordererFileSave) {
            long j7 = this.totalBytesCount;
            if (j7 > 0 && j7 > j6) {
                this.notLoadedBytesRanges = new ArrayList<>();
                this.notRequestedBytesRanges = new ArrayList<>();
            }
        }
        if (this.webLocation != null) {
            String strMD5 = Utilities.MD5(this.webFile.url);
            if (this.encryptFile) {
                String str9 = strMD5 + ".temp.enc";
                str2 = strMD5 + "." + this.ext + ".enc";
                if (this.key != null) {
                    str3 = strMD5 + "_64.iv.enc";
                    str = str9;
                    j2 = 0;
                } else {
                    str = str9;
                    j2 = 0;
                    str3 = null;
                }
            } else {
                String str10 = strMD5 + ".temp";
                String str11 = strMD5 + "." + this.ext;
                if (this.key != null) {
                    str3 = strMD5 + "_64.iv";
                    str = str10;
                    j2 = 0;
                    str2 = str11;
                } else {
                    str = str10;
                    j2 = 0;
                    str2 = str11;
                    str3 = null;
                }
            }
            str4 = null;
            str8 = null;
        } else {
            TLRPC.InputFileLocation inputFileLocation = this.location;
            long j8 = inputFileLocation.volume_id;
            j2 = 0;
            if (j8 != 0 && inputFileLocation.local_id != 0) {
                int i3 = this.datacenterId;
                if (i3 == Integer.MIN_VALUE || j8 == -2147483648L || i3 == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    str6 = this.location.volume_id + "_" + this.location.local_id + ".temp.enc";
                    str2 = this.location.volume_id + "_" + this.location.local_id + "." + this.ext + ".enc";
                    if (this.key != null) {
                        str7 = this.location.volume_id + "_" + this.location.local_id + "_64.iv.enc";
                        String str12 = str6;
                        str3 = str7;
                        str = str12;
                        str4 = null;
                        str8 = null;
                    }
                    str = str6;
                    str3 = null;
                    str4 = null;
                    str8 = null;
                } else {
                    str = this.location.volume_id + "_" + this.location.local_id + ".temp";
                    str2 = this.location.volume_id + "_" + this.location.local_id + "." + this.ext;
                    str3 = this.key != null ? this.location.volume_id + "_" + this.location.local_id + "_64.iv" : null;
                    str4 = this.notLoadedBytesRanges != null ? this.location.volume_id + "_" + this.location.local_id + "_64.pt" : null;
                    str5 = this.location.volume_id + "_" + this.location.local_id + "_64.preload";
                    str8 = str5;
                }
            } else {
                if (this.datacenterId == 0 || inputFileLocation.id == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    str6 = this.datacenterId + "_" + this.location.id + ".temp.enc";
                    str2 = this.datacenterId + "_" + this.location.id + this.ext + ".enc";
                    if (this.key != null) {
                        str7 = this.datacenterId + "_" + this.location.id + "_64.iv.enc";
                        String str13 = str6;
                        str3 = str7;
                        str = str13;
                        str4 = null;
                        str8 = null;
                    }
                    str = str6;
                    str3 = null;
                    str4 = null;
                    str8 = null;
                } else {
                    str = this.datacenterId + "_" + this.location.id + ".temp";
                    str2 = this.datacenterId + "_" + this.location.id + this.ext;
                    str3 = this.key != null ? this.datacenterId + "_" + this.location.id + "_64.iv" : null;
                    str4 = this.notLoadedBytesRanges != null ? this.datacenterId + "_" + this.location.id + "_64.pt" : null;
                    str5 = this.datacenterId + "_" + this.location.id + "_64.preload";
                    str8 = str5;
                }
            }
        }
        this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
        this.cancelledRequestInfos = new ArrayList<>();
        this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
        this.state = 1;
        Object obj = this.parentObject;
        if (obj instanceof TLRPC.TL_theme) {
            this.cacheFileFinal = new File(ApplicationLoader.getFilesDirFixed(), "remote" + ((TLRPC.TL_theme) obj).id + ".attheme");
        } else if (!this.encryptFile) {
            this.cacheFileFinal = new File(this.storePath, this.storeFileName);
        } else {
            this.cacheFileFinal = new File(this.storePath, str2);
        }
        boolean zExists = this.cacheFileFinal.exists();
        this.cacheFileFinalReady = zExists;
        if (zExists) {
            if (!(this.parentObject instanceof TLRPC.TL_theme)) {
                long j9 = this.totalBytesCount;
                if (j9 != j2 && !this.ungzip && j9 != this.cacheFileFinal.length()) {
                    if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                        }
                        if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                            this.cacheFileFinal.delete();
                        }
                        zExists = false;
                    }
                }
            } else if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                }
                if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                    this.cacheFileFinal.delete();
                }
                zExists = false;
            }
        }
        if (!zExists) {
            this.cacheFileTemp = new File(this.tempPath, str);
            if (this.ungzip) {
                this.cacheFileGzipTemp = new File(this.tempPath, str + ".gz");
            }
            if (this.encryptFile) {
                File file = new File(FileLoader.getInternalCacheDir(), str2 + ".key");
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rws");
                    long length = file.length();
                    byte[] bArr = new byte[32];
                    this.encryptKey = bArr;
                    this.encryptIv = new byte[16];
                    if (length > j2 && length % 48 == j2) {
                        randomAccessFile2.read(bArr, 0, 32);
                        randomAccessFile2.read(this.encryptIv, 0, 16);
                        z3 = false;
                    } else {
                        Utilities.random.nextBytes(bArr);
                        Utilities.random.nextBytes(this.encryptIv);
                        randomAccessFile2.write(this.encryptKey);
                        randomAccessFile2.write(this.encryptIv);
                        z3 = true;
                    }
                    try {
                        try {
                            randomAccessFile2.getChannel().close();
                        } catch (Exception e) {
                            e = e;
                            if (AndroidUtilities.isENOSPC(e)) {
                                LaunchActivity.checkFreeDiscSpaceStatic(1);
                                FileLog.e((Throwable) e, false);
                            } else if (AndroidUtilities.isEROFS(e)) {
                                SharedConfig.checkSdCard(this.cacheFileFinal);
                                FileLog.e((Throwable) e, false);
                            } else {
                                FileLog.e(e);
                            }
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    randomAccessFile2.close();
                } catch (Exception e3) {
                    e = e3;
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            final boolean[] zArr = {false};
            long j10 = 8;
            if (!this.supportsPreloading || str8 == null) {
                z3 = z3;
                j3 = 8;
                r12 = 1;
                j4 = 2;
            } else {
                this.cacheFilePreload = new File(this.tempPath, str8);
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.cacheFilePreload, "rws");
                    this.preloadStream = randomAccessFile3;
                    long length2 = randomAccessFile3.length();
                    this.preloadStreamFileOffset = 1;
                    long j11 = 1;
                    if (length2 > 1) {
                        zArr[0] = this.preloadStream.readByte() != 0;
                        while (true) {
                            if (j11 < length2 && length2 - j11 >= j10) {
                                long j12 = this.preloadStream.readLong();
                                if (length2 - (j11 + j10) >= j10 && j12 >= j2) {
                                    j4 = 2;
                                    try {
                                        if (j12 <= this.totalBytesCount) {
                                            long j13 = this.preloadStream.readLong();
                                            long j14 = j11 + 16;
                                            if (length2 - j14 >= j13 && j13 <= this.currentDownloadChunkSize) {
                                                PreloadRange preloadRange = new PreloadRange(j14, j13);
                                                long j15 = j14 + j13;
                                                this.preloadStream.seek(j15);
                                                if (length2 - j15 >= 24) {
                                                    j3 = j10;
                                                    try {
                                                        long j16 = this.preloadStream.readLong();
                                                        this.foundMoovSize = j16;
                                                        if (j16 != j2) {
                                                            z4 = true;
                                                            i2 = 1;
                                                            z4 = true;
                                                            try {
                                                                z3 = z3;
                                                                try {
                                                                    this.moovFound = this.nextPreloadDownloadOffset > this.totalBytesCount / 2 ? 2 : 1;
                                                                    this.preloadNotRequestedBytesCount = j16;
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z3 = z3;
                                                            }
                                                        } else {
                                                            z3 = z3;
                                                            i2 = 1;
                                                        }
                                                        this.nextPreloadDownloadOffset = this.preloadStream.readLong();
                                                        this.nextAtomOffset = this.preloadStream.readLong();
                                                        long j17 = j15 + 24;
                                                        if (this.preloadedBytesRanges == null) {
                                                            this.preloadedBytesRanges = new HashMap<>();
                                                        }
                                                        if (this.requestedPreloadedBytesRanges == null) {
                                                            this.requestedPreloadedBytesRanges = new HashMap<>();
                                                        }
                                                        this.preloadedBytesRanges.put(Long.valueOf(j12), preloadRange);
                                                        this.requestedPreloadedBytesRanges.put(Long.valueOf(j12), Integer.valueOf(i2));
                                                        this.totalPreloadedBytes = (int) (((long) this.totalPreloadedBytes) + j13);
                                                        this.preloadStreamFileOffset = (int) (((long) this.preloadStreamFileOffset) + j13 + 36);
                                                        j10 = j3;
                                                        z3 = z3;
                                                        j11 = j17;
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        z4 = true;
                                                    }
                                                }
                                                e = e4;
                                                FileLog.e((Throwable) e, false);
                                                z5 = z4;
                                                r12 = z5;
                                                if (!this.isPreloadVideoOperation) {
                                                    r12 = z5;
                                                    this.cacheFilePreload = null;
                                                    randomAccessFile = this.preloadStream;
                                                    r12 = z5;
                                                    if (randomAccessFile != null) {
                                                        randomAccessFile.getChannel().close();
                                                        this.preloadStream.close();
                                                        this.preloadStream = null;
                                                        r12 = z5;
                                                    }
                                                }
                                            }
                                        }
                                        z3 = z3;
                                        j3 = j10;
                                        z4 = true;
                                        this.preloadStream.seek(this.preloadStreamFileOffset);
                                        z5 = z4;
                                    } catch (Exception e7) {
                                        e = e7;
                                        j3 = j10;
                                    }
                                    r12 = z5;
                                    if (!this.isPreloadVideoOperation) {
                                        r12 = z5;
                                        this.cacheFilePreload = null;
                                        randomAccessFile = this.preloadStream;
                                        r12 = z5;
                                        if (randomAccessFile != null) {
                                            randomAccessFile.getChannel().close();
                                            this.preloadStream.close();
                                            this.preloadStream = null;
                                            r12 = z5;
                                        }
                                    }
                                }
                            }
                            z3 = z3;
                            j3 = j10;
                            z4 = true;
                            j4 = 2;
                            this.preloadStream.seek(this.preloadStreamFileOffset);
                            z5 = z4;
                            r12 = z5;
                            if (!this.isPreloadVideoOperation) {
                                r12 = z5;
                                this.cacheFilePreload = null;
                                randomAccessFile = this.preloadStream;
                                r12 = z5;
                                if (randomAccessFile != null) {
                                    randomAccessFile.getChannel().close();
                                    this.preloadStream.close();
                                    this.preloadStream = null;
                                    r12 = z5;
                                }
                            }
                        }
                    } else {
                        z3 = z3;
                        j3 = j10;
                        z4 = true;
                        j4 = 2;
                        this.preloadStream.seek(this.preloadStreamFileOffset);
                        z5 = z4;
                        r12 = z5;
                        if (!this.isPreloadVideoOperation && this.preloadedBytesRanges == null) {
                            r12 = z5;
                            this.cacheFilePreload = null;
                            try {
                                randomAccessFile = this.preloadStream;
                                r12 = z5;
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.getChannel().close();
                                    } catch (Exception e8) {
                                        FileLog.e(e8);
                                    }
                                    this.preloadStream.close();
                                    this.preloadStream = null;
                                    r12 = z5;
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                r12 = z5;
                            }
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    z3 = z3;
                    j3 = j10;
                    z4 = true;
                    j4 = 2;
                }
            }
            if (str4 != null) {
                this.cacheFileParts = new File(this.tempPath, str4);
                if (!this.cacheFileTemp.exists()) {
                    this.cacheFileParts.delete();
                }
                try {
                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.cacheFileParts, "rws");
                    this.filePartsStream = randomAccessFile4;
                    long length3 = randomAccessFile4.length();
                    if (length3 % j3 == 4) {
                        int i4 = this.filePartsStream.readInt();
                        if (i4 <= (length3 - 4) / j4) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                long j18 = this.filePartsStream.readLong();
                                long j19 = this.filePartsStream.readLong();
                                this.notLoadedBytesRanges.add(new Range(j18, j19));
                                this.notRequestedBytesRanges.add(new Range(j18, j19));
                            }
                        }
                    }
                } catch (Exception e11) {
                    FileLog.e(e11, (AndroidUtilities.isFilNotFoundException(e11) ? 1 : 0) ^ r12);
                }
            }
            if (this.fileMetadata != null) {
                FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
                FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
            }
            if (!this.cacheFileTemp.exists()) {
                ArrayList<Range> arrayList = this.notLoadedBytesRanges;
                if (arrayList != null && arrayList.isEmpty()) {
                    long j20 = 0;
                    this.notLoadedBytesRanges.add(new Range(j20, this.totalBytesCount));
                    this.notRequestedBytesRanges.add(new Range(j20, this.totalBytesCount));
                }
            } else if (z3) {
                this.cacheFileTemp.delete();
            } else {
                long length4 = this.cacheFileTemp.length();
                if (str3 != null && length4 % ((long) this.currentDownloadChunkSize) != j2) {
                    this.requestedBytesCount = j2;
                } else {
                    long jFloorDiv = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * ((long) this.currentDownloadChunkSize);
                    this.downloadedBytes = jFloorDiv;
                    this.requestedBytesCount = jFloorDiv;
                }
                ArrayList<Range> arrayList2 = this.notLoadedBytesRanges;
                if (arrayList2 != null && arrayList2.isEmpty()) {
                    this.notLoadedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                    this.notRequestedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                }
            }
            ArrayList<Range> arrayList3 = this.notLoadedBytesRanges;
            if (arrayList3 != null) {
                this.downloadedBytes = this.totalBytesCount;
                int size = arrayList3.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Range range = this.notLoadedBytesRanges.get(i6);
                    this.downloadedBytes -= range.end - range.start;
                }
                this.requestedBytesCount = this.downloadedBytes;
            }
            if (BuildVars.LOGS_ENABLED) {
                if (this.isPreloadVideoOperation) {
                    FileLog.d("start preloading file to temp = " + this.cacheFileTemp);
                } else {
                    FileLog.d("start loading file to temp = " + this.cacheFileTemp + " final = " + this.cacheFileFinal + " priority" + this.priority);
                }
            }
            if (str3 != null) {
                this.cacheIvTemp = new File(this.tempPath, str3);
                try {
                    this.fiv = new RandomAccessFile(this.cacheIvTemp, "rws");
                    if (this.downloadedBytes != 0 && !z3) {
                        long length5 = this.cacheIvTemp.length();
                        if (length5 <= 0) {
                            j5 = 0;
                        } else if (length5 % 64 == 0) {
                            this.fiv.read(this.iv, 0, 64);
                        } else {
                            j5 = 0;
                        }
                        this.downloadedBytes = j5;
                        this.requestedBytesCount = j5;
                    }
                } catch (Exception e12) {
                    this.downloadedBytes = 0L;
                    this.requestedBytesCount = 0L;
                    if (AndroidUtilities.isENOSPC(e12)) {
                        LaunchActivity.checkFreeDiscSpaceStatic(r12);
                        FileLog.e((Throwable) e12, false);
                    } else if (AndroidUtilities.isEROFS(e12)) {
                        SharedConfig.checkSdCard(this.cacheFileFinal);
                        FileLog.e((Throwable) e12, false);
                    } else {
                        FileLog.e(e12);
                    }
                }
            }
            if (!this.isPreloadVideoOperation && this.downloadedBytes != 0 && this.totalBytesCount > 0) {
                copyNotLoadedRanges();
            }
            updateProgress();
            try {
                RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.cacheFileTemp, "rws");
                this.fileOutputStream = randomAccessFile5;
                long j21 = this.downloadedBytes;
                if (j21 != 0) {
                    randomAccessFile5.seek(j21);
                }
                r6 = 0;
            } catch (Exception e13) {
                r6 = 0;
                FileLog.e((Throwable) e13, false);
                if (AndroidUtilities.isENOSPC(e13)) {
                    LaunchActivity.checkFreeDiscSpaceStatic(r12);
                    onFail(r12, -1);
                    return false;
                }
                if (AndroidUtilities.isEROFS(e13)) {
                    SharedConfig.checkSdCard(this.cacheFileFinal);
                    FileLog.e((Throwable) e13, false);
                    onFail(r12, -1);
                    return false;
                }
            }
            if (this.fileOutputStream == null) {
                onFail(r12, r6);
                return r6;
            }
            this.started = r12;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoadOperation.m444$r8$lambda$uxa2nRVkcn7jYcobqxOcHprXhM(this.f$0, zArr);
                }
            });
            return r12;
        }
        this.started = true;
        try {
            onFinishLoadingFile(false, 1, false);
            FilePathDatabase.PathData pathData = this.pathSaveData;
            if (pathData != null) {
                this.delegate.saveFilePath(pathData, this.cacheFileFinal);
            }
            return true;
        } catch (Exception e14) {
            FileLog.e((Throwable) e14, false);
            if (AndroidUtilities.isENOSPC(e14)) {
                z2 = true;
                LaunchActivity.checkFreeDiscSpaceStatic(1);
                i = -1;
                onFail(true, -1);
            } else {
                i = -1;
                z2 = true;
            }
            if (AndroidUtilities.isEROFS(e14)) {
                SharedConfig.checkSdCard(this.cacheFileFinal);
                onFail(z2, i);
                return false;
            }
            onFail(z2, 0);
            return z2;
        }
    }

    public static void $r8$lambda$AjDyTHXJZKzXkVi74T4G73LZdRA(final FileLoadOperation fileLoadOperation, boolean z, long j, FileLoadOperationStream fileLoadOperationStream, boolean z2) {
        if (fileLoadOperation.streamListeners == null) {
            fileLoadOperation.streamListeners = new ArrayList<>();
        }
        if (z) {
            long j2 = fileLoadOperation.currentDownloadChunkSize;
            long j3 = (j / j2) * j2;
            RequestInfo requestInfo = fileLoadOperation.priorityRequestInfo;
            if (requestInfo != null && requestInfo.offset != j3) {
                RequestInfo requestInfo2 = fileLoadOperation.priorityRequestInfo;
                final int i = requestInfo2.requestToken;
                fileLoadOperation.requestInfos.remove(requestInfo2);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.uiRequestTokens.remove(Integer.valueOf(i));
                    }
                });
                fileLoadOperation.requestedBytesCount -= (long) fileLoadOperation.currentDownloadChunkSize;
                fileLoadOperation.removePart(fileLoadOperation.notRequestedBytesRanges, fileLoadOperation.priorityRequestInfo.offset, fileLoadOperation.priorityRequestInfo.offset + ((long) fileLoadOperation.currentDownloadChunkSize));
                if (fileLoadOperation.priorityRequestInfo.requestToken != 0) {
                    ConnectionsManager.getInstance(fileLoadOperation.currentAccount).cancelRequest(fileLoadOperation.priorityRequestInfo.requestToken, true);
                    fileLoadOperation.requestsCount--;
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("frame get cancel request at offset " + fileLoadOperation.priorityRequestInfo.offset);
                }
                fileLoadOperation.priorityRequestInfo = null;
            }
            if (fileLoadOperation.priorityRequestInfo == null) {
                fileLoadOperation.streamPriorityStartOffset = j3;
            }
        } else {
            long j4 = fileLoadOperation.currentDownloadChunkSize;
            fileLoadOperation.streamStartOffset = (j / j4) * j4;
        }
        if (!fileLoadOperation.streamListeners.contains(fileLoadOperationStream)) {
            fileLoadOperation.streamListeners.add(fileLoadOperationStream);
            FileLog.e("FileLoadOperation " + fileLoadOperation.getFileName() + " start, adding stream " + fileLoadOperationStream);
        }
        if (!fileLoadOperation.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(fileLoadOperation.cancelAfterNoStreamListeners);
        }
        if (z2) {
            if (fileLoadOperation.preloadedBytesRanges != null && fileLoadOperation.getDownloadedLengthFromOffsetInternal(fileLoadOperation.notLoadedBytesRanges, fileLoadOperation.streamStartOffset, 1L) == 0 && fileLoadOperation.preloadedBytesRanges.get(Long.valueOf(fileLoadOperation.streamStartOffset)) != null) {
                fileLoadOperation.nextPartWasPreloaded = true;
            }
            fileLoadOperation.startDownloadRequest(-1);
            fileLoadOperation.nextPartWasPreloaded = false;
        }
        if (fileLoadOperation.notLoadedBytesRanges != null) {
            fileLoadOperation.notifyStreamListeners();
        }
    }

    public static void m444$r8$lambda$uxa2nRVkcn7jYcobqxOcHprXhM(FileLoadOperation fileLoadOperation, boolean[] zArr) {
        boolean z = fileLoadOperation.isPreloadVideoOperation && zArr[0];
        int i = fileLoadOperation.preloadPrefixSize;
        boolean z2 = i > 0 && fileLoadOperation.downloadedBytes >= ((long) i) && fileLoadOperation.canFinishPreload();
        long j = fileLoadOperation.totalBytesCount;
        if (j != 0 && (z || fileLoadOperation.downloadedBytes == j || z2)) {
            try {
                fileLoadOperation.onFinishLoadingFile(false, 1, true);
                return;
            } catch (Exception unused) {
                fileLoadOperation.onFail(true, 0);
                return;
            }
        }
        fileLoadOperation.startDownloadRequest(-1);
    }

    public void updateProgress() {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            long j = this.downloadedBytes;
            long j2 = this.totalBytesCount;
            if (j == j2 || j2 <= 0) {
                return;
            }
            fileLoadOperationDelegate.didChangedLoadProgress(this, j, j2);
        }
    }

    public boolean isPaused() {
        return this.paused;
    }

    public void setIsPreloadVideoOperation(final boolean z) {
        if (this.isPreloadVideoOperation != z) {
            if (!z || this.totalBytesCount > 2097152) {
                FileLog.e("setIsPreloadVideoOperation " + z + " file=" + this.fileName);
                if (!z && this.isPreloadVideoOperation) {
                    if (this.state == 3) {
                        this.isPreloadVideoOperation = z;
                        this.state = 0;
                        this.preloadFinished = false;
                        start();
                        return;
                    }
                    if (this.state == 1) {
                        Utilities.stageQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                FileLoadOperation.$r8$lambda$AHUcgcyjleCAb_DZSXdAeDpVYiQ(this.f$0, z);
                            }
                        });
                        return;
                    } else {
                        this.isPreloadVideoOperation = z;
                        return;
                    }
                }
                this.isPreloadVideoOperation = z;
            }
        }
    }

    public static void $r8$lambda$AHUcgcyjleCAb_DZSXdAeDpVYiQ(FileLoadOperation fileLoadOperation, boolean z) {
        fileLoadOperation.requestedBytesCount = 0L;
        fileLoadOperation.clearOperation(null, true, true);
        fileLoadOperation.isPreloadVideoOperation = z;
        fileLoadOperation.startDownloadRequest(-1);
    }

    public boolean isPreloadVideoOperation() {
        return this.isPreloadVideoOperation;
    }

    public boolean isPreloadFinished() {
        return this.preloadFinished;
    }

    public void cancel() {
        cancel(false);
    }

    private void cancel(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.cancelOnStage(z);
            }
        });
    }

    public void cancelOnStage(boolean z) {
        if (this.state != 3 && this.state != 2) {
            this.state = 5;
            cancelRequests(new Runnable() {
                @Override
                public final void run() {
                    FileLoadOperation.m439$r8$lambda$ZbkCjEZwmArqOgVJyY5DVszwQk(this.f$0);
                }
            });
        }
        if (z) {
            File file = this.cacheFileFinal;
            if (file != null) {
                try {
                    if (!file.delete()) {
                        this.cacheFileFinal.deleteOnExit();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            File file2 = this.cacheFileTemp;
            if (file2 != null) {
                try {
                    if (!file2.delete()) {
                        this.cacheFileTemp.deleteOnExit();
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            File file3 = this.cacheFileParts;
            if (file3 != null) {
                try {
                    if (!file3.delete()) {
                        this.cacheFileParts.deleteOnExit();
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            }
            File file4 = this.cacheIvTemp;
            if (file4 != null) {
                try {
                    if (!file4.delete()) {
                        this.cacheIvTemp.deleteOnExit();
                    }
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            File file5 = this.cacheFilePreload;
            if (file5 != null) {
                try {
                    if (file5.delete()) {
                        return;
                    }
                    this.cacheFilePreload.deleteOnExit();
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
            }
        }
    }

    public static void m439$r8$lambda$ZbkCjEZwmArqOgVJyY5DVszwQk(FileLoadOperation fileLoadOperation) {
        if (fileLoadOperation.state == 5) {
            fileLoadOperation.onFail(false, 1);
        }
    }

    private void cancelRequests(final Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("cancelRequests");
        sb.append(runnable != null ? " with callback" : "");
        FileLog.d(sb.toString());
        if (this.requestInfos != null) {
            final int[] iArr = new int[1];
            int[] iArr2 = new int[2];
            int i = 0;
            for (int i2 = 0; i2 < this.requestInfos.size(); i2++) {
                final RequestInfo requestInfo = this.requestInfos.get(i2);
                if (requestInfo.requestToken != 0) {
                    requestInfo.cancelling = true;
                    if (runnable == null) {
                        requestInfo.cancelled = true;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken);
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true);
                    } else {
                        requestInfo.whenCancelled = new Runnable() {
                            @Override
                            public final void run() {
                                FileLoadOperation.m443$r8$lambda$nGf2vg6_qrzCPXWCMNer3l8Da0(requestInfo, iArr, runnable);
                            }
                        };
                        iArr[0] = iArr[0] + 1;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken + " with callback");
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true, new Runnable() {
                            @Override
                            public final void run() {
                                FileLoadOperation.m436$r8$lambda$CDuAUjvsTX7Jq3JXybbY9NKqJ4(requestInfo);
                            }
                        });
                    }
                    char c = requestInfo.connectionType == 2 ? (char) 0 : (char) 1;
                    iArr2[c] = iArr2[c] + requestInfo.chunkSize;
                }
            }
            while (i < 2) {
                int i3 = i == 0 ? 2 : 65538;
                if (iArr2[i] > 1048576) {
                    ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i3);
                }
                i++;
            }
        }
    }

    public static void m443$r8$lambda$nGf2vg6_qrzCPXWCMNer3l8Da0(RequestInfo requestInfo, int[] iArr, Runnable runnable) {
        requestInfo.whenCancelled = null;
        requestInfo.cancelled = true;
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            runnable.run();
        }
    }

    public static void m436$r8$lambda$CDuAUjvsTX7Jq3JXybbY9NKqJ4(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void cleanup() {
        try {
            RandomAccessFile randomAccessFile = this.fileOutputStream;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.fileOutputStream.close();
                this.fileOutputStream = null;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.preloadStream;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                this.preloadStream.close();
                this.preloadStream = null;
            }
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.fileReadStream;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
                this.fileReadStream.close();
                this.fileReadStream = null;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            if (this.filePartsStream != null) {
                synchronized (this) {
                    try {
                        if (!this.writingToFilePartsStream) {
                            try {
                                this.filePartsStream.getChannel().close();
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            this.filePartsStream.close();
                            this.filePartsStream = null;
                        } else {
                            this.closeFilePartsStreamOnWriteEnd = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Exception e8) {
            FileLog.e(e8);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.fiv;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.fiv = null;
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (this.delayedRequestInfos != null) {
            for (int i = 0; i < this.delayedRequestInfos.size(); i++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i);
                if (requestInfo.response != null) {
                    requestInfo.response.disableFree = false;
                    requestInfo.response.freeResources();
                } else if (requestInfo.responseWeb != null) {
                    requestInfo.responseWeb.disableFree = false;
                    requestInfo.responseWeb.freeResources();
                } else if (requestInfo.responseCdn != null) {
                    requestInfo.responseCdn.disableFree = false;
                    requestInfo.responseCdn.freeResources();
                }
            }
            this.delayedRequestInfos.clear();
        }
    }

    private void onFinishLoadingFile(final boolean z, int i, boolean z2) {
        if (this.state == 1 || this.state == 5) {
            this.state = 3;
            notifyStreamListeners();
            cleanup();
            if (this.isPreloadVideoOperation || z2) {
                this.preloadFinished = true;
                if (BuildVars.DEBUG_VERSION) {
                    if (i == 1) {
                        FileLog.d("file already exist " + this.cacheFileTemp);
                    } else {
                        FileLog.d("finished preloading file to " + this.cacheFileTemp + " loaded " + this.downloadedBytes + " of " + this.totalBytesCount + " prefSize=" + this.preloadPrefixSize);
                    }
                }
                if (this.fileMetadata != null) {
                    if (this.cacheFileTemp != null) {
                        FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new CacheModel.FileInfo(this.cacheFileTemp)));
                    }
                    if (this.cacheFileParts != null) {
                        FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new CacheModel.FileInfo(this.cacheFileParts)));
                    }
                }
                this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
                this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
                return;
            }
            final File file = this.cacheIvTemp;
            final File file2 = this.cacheFileParts;
            final File file3 = this.cacheFilePreload;
            final File file4 = this.cacheFileTemp;
            filesQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoadOperation.$r8$lambda$VR284php6E0_hR0gtNT9yJxsRfc(this.f$0, file, file2, file3, file4, z);
                }
            });
            this.cacheIvTemp = null;
            this.cacheFileParts = null;
            this.cacheFilePreload = null;
            this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
        }
    }

    public static void $r8$lambda$VR284php6E0_hR0gtNT9yJxsRfc(final FileLoadOperation fileLoadOperation, File file, File file2, File file3, File file4, final boolean z) {
        Throwable th;
        File file5;
        boolean zCopyFile;
        int i;
        int i2;
        int iLastIndexOf;
        String str;
        fileLoadOperation.getClass();
        if (file != null) {
            file.delete();
        }
        if (file2 != null) {
            file2.delete();
        }
        if (file3 != null) {
            file3.delete();
        }
        if (file4 != null) {
            if (fileLoadOperation.ungzip) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file4));
                    FileLoader.copyFile(gZIPInputStream, fileLoadOperation.cacheFileGzipTemp, 2097152);
                    gZIPInputStream.close();
                    file4.delete();
                    file5 = fileLoadOperation.cacheFileGzipTemp;
                    try {
                        fileLoadOperation.ungzip = false;
                    } catch (ZipException unused) {
                        file4 = file5;
                        fileLoadOperation.ungzip = false;
                        if (!fileLoadOperation.ungzip) {
                            if (fileLoadOperation.parentObject instanceof TLRPC.TL_theme) {
                                try {
                                    zCopyFile = AndroidUtilities.copyFile(file4, fileLoadOperation.cacheFileFinal);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    zCopyFile = false;
                                }
                            } else {
                                try {
                                    if (fileLoadOperation.pathSaveData != null) {
                                        synchronized (lockObject) {
                                            try {
                                                fileLoadOperation.cacheFileFinal = new File(fileLoadOperation.storePath, fileLoadOperation.storeFileName);
                                                i2 = 1;
                                                while (fileLoadOperation.cacheFileFinal.exists()) {
                                                    iLastIndexOf = fileLoadOperation.storeFileName.lastIndexOf(46);
                                                    if (iLastIndexOf > 0) {
                                                        str = fileLoadOperation.storeFileName.substring(0, iLastIndexOf) + " (" + i2 + ")" + fileLoadOperation.storeFileName.substring(iLastIndexOf);
                                                    } else {
                                                        str = fileLoadOperation.storeFileName + " (" + i2 + ")";
                                                    }
                                                    fileLoadOperation.cacheFileFinal = new File(fileLoadOperation.storePath, str);
                                                    i2++;
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                    zCopyFile = file4.renameTo(fileLoadOperation.cacheFileFinal);
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                    zCopyFile = false;
                                }
                            }
                            if (!zCopyFile) {
                                try {
                                    zCopyFile = AndroidUtilities.copyFile(file4, fileLoadOperation.cacheFileFinal);
                                    if (zCopyFile) {
                                        fileLoadOperation.cacheFileFinal.delete();
                                    }
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            if (!zCopyFile) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("unable to rename temp = " + file4 + " to final = " + fileLoadOperation.cacheFileFinal + " retry = " + fileLoadOperation.renameRetryCount);
                                }
                                i = fileLoadOperation.renameRetryCount + 1;
                                fileLoadOperation.renameRetryCount = i;
                                if (i < 3) {
                                    fileLoadOperation.state = 1;
                                    Utilities.stageQueue.postRunnable(new Runnable() {
                                        @Override
                                        public final void run() {
                                            FileLoadOperation.$r8$lambda$Td4LvGKldQtADOBnT076fEkxr7Q(this.f$0, z);
                                        }
                                    }, 200L);
                                    return;
                                } else {
                                    fileLoadOperation.cacheFileFinal = file4;
                                    fileLoadOperation.cacheFileFinalReady = false;
                                }
                            } else {
                                fileLoadOperation.cacheFileFinalReady = true;
                                if (fileLoadOperation.pathSaveData != null) {
                                    fileLoadOperation.delegate.saveFilePath(fileLoadOperation.pathSaveData, fileLoadOperation.cacheFileFinal);
                                }
                            }
                            Utilities.stageQueue.postRunnable(new Runnable() {
                                @Override
                                public final void run() {
                                    FileLoadOperation.$r8$lambda$5MMqhtRyNOkdzrlCWT9ofCaqoD4(this.f$0, z);
                                }
                            });
                        }
                        Utilities.stageQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.onFail(false, 0);
                            }
                        });
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        FileLog.e(th, !AndroidUtilities.isFilNotFoundException(th));
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("unable to ungzip temp = " + file4 + " to final = " + fileLoadOperation.cacheFileFinal);
                        }
                    }
                } catch (ZipException unused2) {
                } catch (Throwable th5) {
                    th = th5;
                    file5 = file4;
                }
                file4 = file5;
            }
            if (!fileLoadOperation.ungzip) {
                if (fileLoadOperation.parentObject instanceof TLRPC.TL_theme) {
                    zCopyFile = AndroidUtilities.copyFile(file4, fileLoadOperation.cacheFileFinal);
                } else {
                    if (fileLoadOperation.pathSaveData != null) {
                        synchronized (lockObject) {
                            fileLoadOperation.cacheFileFinal = new File(fileLoadOperation.storePath, fileLoadOperation.storeFileName);
                            i2 = 1;
                            while (fileLoadOperation.cacheFileFinal.exists()) {
                                iLastIndexOf = fileLoadOperation.storeFileName.lastIndexOf(46);
                                if (iLastIndexOf > 0) {
                                    str = fileLoadOperation.storeFileName.substring(0, iLastIndexOf) + " (" + i2 + ")" + fileLoadOperation.storeFileName.substring(iLastIndexOf);
                                } else {
                                    str = fileLoadOperation.storeFileName + " (" + i2 + ")";
                                }
                                fileLoadOperation.cacheFileFinal = new File(fileLoadOperation.storePath, str);
                                i2++;
                            }
                        }
                    }
                    zCopyFile = file4.renameTo(fileLoadOperation.cacheFileFinal);
                }
                if (!zCopyFile && fileLoadOperation.renameRetryCount == 3) {
                    zCopyFile = AndroidUtilities.copyFile(file4, fileLoadOperation.cacheFileFinal);
                    if (zCopyFile) {
                        fileLoadOperation.cacheFileFinal.delete();
                    }
                }
                if (!zCopyFile) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("unable to rename temp = " + file4 + " to final = " + fileLoadOperation.cacheFileFinal + " retry = " + fileLoadOperation.renameRetryCount);
                    }
                    i = fileLoadOperation.renameRetryCount + 1;
                    fileLoadOperation.renameRetryCount = i;
                    if (i < 3) {
                        fileLoadOperation.state = 1;
                        Utilities.stageQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                FileLoadOperation.$r8$lambda$Td4LvGKldQtADOBnT076fEkxr7Q(this.f$0, z);
                            }
                        }, 200L);
                        return;
                    } else {
                        fileLoadOperation.cacheFileFinal = file4;
                        fileLoadOperation.cacheFileFinalReady = false;
                    }
                } else {
                    fileLoadOperation.cacheFileFinalReady = true;
                    if (fileLoadOperation.pathSaveData != null && fileLoadOperation.cacheFileFinal.exists()) {
                        fileLoadOperation.delegate.saveFilePath(fileLoadOperation.pathSaveData, fileLoadOperation.cacheFileFinal);
                    }
                }
            } else {
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.onFail(false, 0);
                    }
                });
                return;
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FileLoadOperation.$r8$lambda$5MMqhtRyNOkdzrlCWT9ofCaqoD4(this.f$0, z);
            }
        });
    }

    public static void $r8$lambda$Td4LvGKldQtADOBnT076fEkxr7Q(FileLoadOperation fileLoadOperation, boolean z) {
        fileLoadOperation.getClass();
        try {
            fileLoadOperation.onFinishLoadingFile(z, 0, false);
        } catch (Exception unused) {
            fileLoadOperation.onFail(false, 0);
        }
    }

    public static void $r8$lambda$5MMqhtRyNOkdzrlCWT9ofCaqoD4(FileLoadOperation fileLoadOperation, boolean z) {
        fileLoadOperation.getClass();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("finished downloading file to " + fileLoadOperation.cacheFileFinal + " time = " + (System.currentTimeMillis() - fileLoadOperation.startTime) + " dc = " + fileLoadOperation.datacenterId + " size = " + AndroidUtilities.formatFileSize(fileLoadOperation.totalBytesCount));
        }
        if (z) {
            int i = fileLoadOperation.currentType;
            if (i == 50331648) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            } else if (i == 33554432) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            } else if (i == 16777216) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            } else if (i == 67108864) {
                String str = fileLoadOperation.ext;
                if (str != null && (str.toLowerCase().endsWith("mp3") || fileLoadOperation.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                } else {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                }
            }
        }
        fileLoadOperation.delegate.didFinishLoadingFile(fileLoadOperation, fileLoadOperation.cacheFileFinal);
    }

    private void delayRequestInfo(RequestInfo requestInfo) {
        this.delayedRequestInfos.add(requestInfo);
        if (requestInfo.response != null) {
            requestInfo.response.disableFree = true;
        } else if (requestInfo.responseWeb != null) {
            requestInfo.responseWeb.disableFree = true;
        } else if (requestInfo.responseCdn != null) {
            requestInfo.responseCdn.disableFree = true;
        }
    }

    private long findNextPreloadDownloadOffset(long j, long j2, NativeByteBuffer nativeByteBuffer) {
        long j3;
        int iLimit = nativeByteBuffer.limit();
        long j4 = j;
        do {
            if (j4 >= j2 - ((long) (this.preloadTempBuffer != null ? 16 : 0))) {
                j3 = j2 + ((long) iLimit);
                if (j4 < j3) {
                    if (j4 >= j3 - 16) {
                        long j5 = j3 - j4;
                        if (j5 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        this.preloadTempBufferCount = (int) j5;
                        nativeByteBuffer.position(nativeByteBuffer.limit() - this.preloadTempBufferCount);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, this.preloadTempBufferCount, false);
                        return j3;
                    }
                    if (this.preloadTempBufferCount != 0) {
                        nativeByteBuffer.position(0);
                        byte[] bArr = this.preloadTempBuffer;
                        int i = this.preloadTempBufferCount;
                        nativeByteBuffer.readBytes(bArr, i, 16 - i, false);
                        this.preloadTempBufferCount = 0;
                    } else {
                        long j6 = j4 - j2;
                        if (j6 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        nativeByteBuffer.position((int) j6);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, 16, false);
                    }
                    byte[] bArr2 = this.preloadTempBuffer;
                    int i2 = ((bArr2[0] & 255) << 24) + ((bArr2[1] & 255) << 16) + ((bArr2[2] & 255) << 8) + (bArr2[3] & 255);
                    if (i2 == 0) {
                        return 0L;
                    }
                    if (i2 == 1) {
                        i2 = ((bArr2[12] & 255) << 24) + ((bArr2[13] & 255) << 16) + ((bArr2[14] & 255) << 8) + (bArr2[15] & 255);
                    }
                    if (bArr2[4] == 109 && bArr2[5] == 111 && bArr2[6] == 111 && bArr2[7] == 118) {
                        return -i2;
                    }
                    j4 += (long) i2;
                }
            }
            return 0L;
        } while (j4 < j3);
        return j4;
    }

    private void requestFileOffsets(long j) {
        if (this.requestingCdnOffsets) {
            return;
        }
        this.requestingCdnOffsets = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.cdnToken;
        tL_upload_getCdnFileHashes.offset = j;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_getCdnFileHashes, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                FileLoadOperation.$r8$lambda$xgWfPCP1UZUPPhxwgbeN2K1mCR4(this.f$0, tLObject, tL_error);
            }
        }, null, null, 0, this.datacenterId, 1, true);
    }

    public static void $r8$lambda$xgWfPCP1UZUPPhxwgbeN2K1mCR4(FileLoadOperation fileLoadOperation, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            fileLoadOperation.onFail(false, 0);
            return;
        }
        fileLoadOperation.getClass();
        if (tLObject instanceof Vector) {
            fileLoadOperation.requestingCdnOffsets = false;
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (fileLoadOperation.cdnHashes == null) {
                    fileLoadOperation.cdnHashes = new HashMap<>();
                }
                for (int i = 0; i < vector.objects.size(); i++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i);
                    fileLoadOperation.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            for (int i2 = 0; i2 < fileLoadOperation.delayedRequestInfos.size(); i2++) {
                RequestInfo requestInfo = fileLoadOperation.delayedRequestInfos.get(i2);
                if (fileLoadOperation.notLoadedBytesRanges != null || fileLoadOperation.downloadedBytes == requestInfo.offset) {
                    fileLoadOperation.delayedRequestInfos.remove(i2);
                    if (fileLoadOperation.processRequestResult(requestInfo, null)) {
                        return;
                    }
                    if (requestInfo.response != null) {
                        requestInfo.response.disableFree = false;
                        requestInfo.response.freeResources();
                        return;
                    } else if (requestInfo.responseWeb != null) {
                        requestInfo.responseWeb.disableFree = false;
                        requestInfo.responseWeb.freeResources();
                        return;
                    } else {
                        if (requestInfo.responseCdn != null) {
                            requestInfo.responseCdn.disableFree = false;
                            requestInfo.responseCdn.freeResources();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    protected boolean processRequestResult(RequestInfo requestInfo, TLRPC.TL_error tL_error) {
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        long j;
        char c;
        char c2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.TL_fileHash tL_fileHash;
        int i;
        int i2;
        Integer numValueOf;
        String str = " volume_id = ";
        if (this.state != 1 && this.state != 5) {
            if (BuildVars.DEBUG_VERSION && this.state == 3) {
                FileLog.e(new FileLog.IgnoreSentException("trying to write to finished file " + this.fileName + " offset " + requestInfo.offset + " " + this.totalBytesCount + " reqToken=" + requestInfo.requestToken + " (state=" + this.state + ")"));
            }
            return false;
        }
        final int i3 = requestInfo.requestToken;
        this.requestInfos.remove(requestInfo);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRequestTokens.remove(Integer.valueOf(i3));
            }
        });
        String str2 = " id = ";
        String str3 = " secret = ";
        if (tL_error == null) {
            try {
                if (this.notLoadedBytesRanges != null || this.downloadedBytes == requestInfo.offset) {
                    if (requestInfo.response != null) {
                        nativeByteBuffer2 = requestInfo.response.bytes;
                    } else if (requestInfo.responseWeb != null) {
                        nativeByteBuffer2 = requestInfo.responseWeb.bytes;
                    } else {
                        if (requestInfo.responseCdn != null) {
                            nativeByteBuffer2 = requestInfo.responseCdn.bytes;
                        } else {
                            nativeByteBuffer = null;
                        }
                        if (nativeByteBuffer != null || nativeByteBuffer.limit() == 0) {
                            onFinishLoadingFile(true, 0, false);
                            return false;
                        }
                        int iLimit = nativeByteBuffer.limit();
                        if (this.isCdn) {
                            long j2 = requestInfo.offset;
                            j = 0;
                            long j3 = this.cdnChunkCheckSize;
                            long j4 = (j2 / j3) * j3;
                            HashMap<Long, TLRPC.TL_fileHash> map = this.cdnHashes;
                            if ((map != null ? map.get(Long.valueOf(j4)) : null) == null) {
                                delayRequestInfo(requestInfo);
                                requestFileOffsets(j4);
                                return true;
                            }
                        } else {
                            j = 0;
                        }
                        if (requestInfo.responseCdn != null) {
                            long j5 = requestInfo.offset / 16;
                            c = '\f';
                            byte[] bArr = this.cdnIv;
                            c2 = '\r';
                            bArr[15] = (byte) (j5 & 255);
                            bArr[14] = (byte) ((j5 >> 8) & 255);
                            bArr[13] = (byte) ((j5 >> 16) & 255);
                            bArr[12] = (byte) ((j5 >> 24) & 255);
                            Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.cdnKey, bArr, 0, nativeByteBuffer.limit());
                        } else {
                            c = '\f';
                            c2 = '\r';
                        }
                        if (this.isPreloadVideoOperation) {
                            this.preloadStream.writeLong(requestInfo.offset);
                            long j6 = iLimit;
                            this.preloadStream.writeLong(j6);
                            this.preloadStreamFileOffset += 16;
                            this.preloadStream.getChannel().write(nativeByteBuffer.buffer);
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("save preload file part " + this.cacheFilePreload + " offset " + requestInfo.offset + " size " + iLimit);
                            }
                            if (this.preloadedBytesRanges == null) {
                                this.preloadedBytesRanges = new HashMap<>();
                            }
                            this.preloadedBytesRanges.put(Long.valueOf(requestInfo.offset), new PreloadRange(this.preloadStreamFileOffset, j6));
                            this.totalPreloadedBytes += iLimit;
                            this.preloadStreamFileOffset += iLimit;
                            if (this.moovFound == 0) {
                                long jFindNextPreloadDownloadOffset = findNextPreloadDownloadOffset(this.nextAtomOffset, requestInfo.offset, nativeByteBuffer);
                                if (jFindNextPreloadDownloadOffset < j) {
                                    jFindNextPreloadDownloadOffset *= -1;
                                    long j7 = this.nextPreloadDownloadOffset + ((long) this.currentDownloadChunkSize);
                                    this.nextPreloadDownloadOffset = j7;
                                    if (j7 < this.totalBytesCount / 2) {
                                        long j8 = 1048576 + jFindNextPreloadDownloadOffset;
                                        this.foundMoovSize = j8;
                                        this.preloadNotRequestedBytesCount = j8;
                                        this.moovFound = 1;
                                    } else {
                                        this.foundMoovSize = 2097152L;
                                        this.preloadNotRequestedBytesCount = 2097152L;
                                        this.moovFound = 2;
                                    }
                                    this.nextPreloadDownloadOffset = -1L;
                                } else {
                                    this.nextPreloadDownloadOffset += (long) this.currentDownloadChunkSize;
                                }
                                this.nextAtomOffset = jFindNextPreloadDownloadOffset;
                            }
                            this.preloadStream.writeLong(this.foundMoovSize);
                            this.preloadStream.writeLong(this.nextPreloadDownloadOffset);
                            this.preloadStream.writeLong(this.nextAtomOffset);
                            this.preloadStreamFileOffset += 24;
                            long j9 = this.nextPreloadDownloadOffset;
                            z3 = j9 == j || (this.moovFound != 0 && this.foundMoovSize < j) || this.totalPreloadedBytes > 2097152 || j9 >= this.totalBytesCount;
                            if (z3) {
                                this.preloadStream.seek(j);
                                this.preloadStream.write(1);
                            } else if (this.moovFound != 0) {
                                this.foundMoovSize -= (long) this.currentDownloadChunkSize;
                            }
                            z4 = false;
                        } else {
                            long j10 = iLimit;
                            long j11 = this.downloadedBytes + j10;
                            this.downloadedBytes = j11;
                            long j12 = this.totalBytesCount;
                            if (j12 > 0) {
                                z = j11 >= j12 || ((i = this.preloadPrefixSize) > 0 && j11 >= ((long) i) && canFinishPreload() && this.requestInfos.isEmpty());
                                z2 = this.downloadedBytes < this.totalBytesCount;
                            } else {
                                int i4 = this.currentDownloadChunkSize;
                                z = iLimit != i4 || ((j12 == j11 || j11 % ((long) i4) != 0) && (j12 <= 0 || j12 <= j11));
                                z2 = false;
                            }
                            boolean z5 = BuildVars.DEBUG_VERSION;
                            byte[] bArr2 = this.key;
                            if (bArr2 != null) {
                                Utilities.aesIgeEncryption(nativeByteBuffer.buffer, bArr2, this.iv, false, true, 0, nativeByteBuffer.limit());
                                if (z && this.bytesCountPadding != 0) {
                                    long jLimit = ((long) nativeByteBuffer.limit()) - this.bytesCountPadding;
                                    if (BuildVars.DEBUG_VERSION && jLimit > 2147483647L) {
                                        throw new RuntimeException("Out of limit" + jLimit);
                                    }
                                    nativeByteBuffer.limit((int) jLimit);
                                }
                            }
                            if (this.encryptFile) {
                                long j13 = requestInfo.offset / 16;
                                byte[] bArr3 = this.encryptIv;
                                bArr3[15] = (byte) (j13 & 255);
                                bArr3[14] = (byte) ((j13 >> 8) & 255);
                                bArr3[c2] = (byte) ((j13 >> 16) & 255);
                                bArr3[c] = (byte) ((j13 >> 24) & 255);
                                Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.encryptKey, bArr3, 0, nativeByteBuffer.limit());
                            }
                            if (this.notLoadedBytesRanges != null) {
                                this.fileOutputStream.seek(requestInfo.offset);
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                                }
                            }
                            this.fileOutputStream.getChannel().write(nativeByteBuffer.buffer);
                            addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j10, true);
                            if (this.isCdn) {
                                long j14 = requestInfo.offset / ((long) this.cdnChunkCheckSize);
                                int size = this.notCheckedCdnRanges.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    Range range = this.notCheckedCdnRanges.get(i5);
                                    if (range.start <= j14 && j14 <= range.end) {
                                        long j15 = this.cdnChunkCheckSize;
                                        long j16 = j14 * j15;
                                        long downloadedLengthFromOffsetInternal = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j16, j15);
                                        if (downloadedLengthFromOffsetInternal == 0) {
                                            break;
                                        }
                                        String str4 = str2;
                                        if (downloadedLengthFromOffsetInternal == this.cdnChunkCheckSize) {
                                            tL_fileHash = this.cdnHashes.get(Long.valueOf(j16));
                                            if (this.fileReadStream == null) {
                                                this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                                this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                            }
                                            this.fileReadStream.seek(j16);
                                            if (BuildVars.DEBUG_VERSION) {
                                                throw new RuntimeException("!!!");
                                            }
                                            this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                            if (this.encryptFile) {
                                                long j17 = j16 / 16;
                                                byte[] bArr4 = this.encryptIv;
                                                bArr4[15] = (byte) (j17 & 255);
                                                bArr4[14] = (byte) ((j17 >> 8) & 255);
                                                bArr4[c2] = (byte) ((j17 >> 16) & 255);
                                                bArr4[c] = (byte) ((j17 >> 24) & 255);
                                                Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr4, 0, downloadedLengthFromOffsetInternal, 0);
                                            }
                                            if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, downloadedLengthFromOffsetInternal), tL_fileHash.hash)) {
                                                if (BuildVars.LOGS_ENABLED) {
                                                    if (this.location != null) {
                                                        FileLog.e("invalid cdn hash " + this.location + str4 + this.location.id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + str + this.location.volume_id + str3 + this.location.secret);
                                                    } else if (this.webLocation != null) {
                                                        FileLog.e("invalid cdn hash  " + this.webLocation + str4 + this.fileName);
                                                    }
                                                }
                                                onFail(false, 0);
                                                this.cacheFileTemp.delete();
                                                return false;
                                            }
                                            this.cdnHashes.remove(Long.valueOf(j16));
                                            addPart(this.notCheckedCdnRanges, j14, j14 + 1, false);
                                            break;
                                        }
                                        long j18 = this.totalBytesCount;
                                        if ((j18 <= 0 || downloadedLengthFromOffsetInternal != j18 - j16) && (j18 > 0 || !z)) {
                                            break;
                                            break;
                                        }
                                        tL_fileHash = this.cdnHashes.get(Long.valueOf(j16));
                                        if (this.fileReadStream == null) {
                                            this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                            this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                        }
                                        this.fileReadStream.seek(j16);
                                        if (BuildVars.DEBUG_VERSION && downloadedLengthFromOffsetInternal > 2147483647L) {
                                            throw new RuntimeException("!!!");
                                        }
                                        this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                        if (this.encryptFile) {
                                            long j19 = j16 / 16;
                                            byte[] bArr5 = this.encryptIv;
                                            bArr5[15] = (byte) (j19 & 255);
                                            bArr5[14] = (byte) ((j19 >> 8) & 255);
                                            bArr5[c2] = (byte) ((j19 >> 16) & 255);
                                            bArr5[c] = (byte) ((j19 >> 24) & 255);
                                            Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr5, 0, downloadedLengthFromOffsetInternal, 0);
                                        }
                                        if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, downloadedLengthFromOffsetInternal), tL_fileHash.hash)) {
                                            if (BuildVars.LOGS_ENABLED) {
                                                if (this.location != null) {
                                                    FileLog.e("invalid cdn hash " + this.location + str4 + this.location.id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + str + this.location.volume_id + str3 + this.location.secret);
                                                } else if (this.webLocation != null) {
                                                    FileLog.e("invalid cdn hash  " + this.webLocation + str4 + this.fileName);
                                                }
                                            }
                                            onFail(false, 0);
                                            this.cacheFileTemp.delete();
                                            return false;
                                        }
                                        this.cdnHashes.remove(Long.valueOf(j16));
                                        addPart(this.notCheckedCdnRanges, j14, j14 + 1, false);
                                        break;
                                    }
                                    i5++;
                                    str = str;
                                    str3 = str3;
                                    j14 = j14;
                                    str2 = str2;
                                }
                            }
                            RandomAccessFile randomAccessFile = this.fiv;
                            if (randomAccessFile != null) {
                                randomAccessFile.seek(0L);
                                this.fiv.write(this.iv);
                            }
                            if (this.totalBytesCount > 0 && this.state == 1) {
                                copyNotLoadedRanges();
                                this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                            }
                            z3 = z;
                            z4 = z2;
                        }
                        while (i2 < this.delayedRequestInfos.size()) {
                            RequestInfo requestInfo2 = this.delayedRequestInfos.get(i2);
                            i2 = (this.notLoadedBytesRanges == null && this.downloadedBytes != requestInfo2.offset) ? i2 + 1 : 0;
                            this.delayedRequestInfos.remove(i2);
                            if (!processRequestResult(requestInfo2, null)) {
                                if (requestInfo2.response != null) {
                                    requestInfo2.response.disableFree = false;
                                    requestInfo2.response.freeResources();
                                    break;
                                }
                                if (requestInfo2.responseWeb != null) {
                                    requestInfo2.responseWeb.disableFree = false;
                                    requestInfo2.responseWeb.freeResources();
                                    break;
                                }
                                if (requestInfo2.responseCdn == null) {
                                    break;
                                }
                                requestInfo2.responseCdn.disableFree = false;
                                requestInfo2.responseCdn.freeResources();
                                break;
                            }
                            break;
                        }
                        if (z3) {
                            onFinishLoadingFile(true, 0, z4);
                        } else if (this.state != 4 && this.state != 5) {
                            startDownloadRequest(requestInfo.connectionType);
                        }
                    }
                    nativeByteBuffer = nativeByteBuffer2;
                    if (nativeByteBuffer != null) {
                    }
                    onFinishLoadingFile(true, 0, false);
                    return false;
                }
                delayRequestInfo(requestInfo);
                return false;
            } catch (Exception e) {
                FileLog.e(e, (AndroidUtilities.isFilNotFoundException(e) || AndroidUtilities.isENOSPC(e)) ? false : true);
                if (AndroidUtilities.isENOSPC(e)) {
                    onFail(false, -1);
                    return false;
                }
                if (AndroidUtilities.isEROFS(e)) {
                    SharedConfig.checkSdCard(this.cacheFileFinal);
                    onFail(true, -1);
                    return false;
                }
                onFail(false, 0);
            }
        } else if (tL_error.text.contains("LIMIT_INVALID") && !requestInfo.forceSmallChunk) {
            Runnable runnable = requestInfo.whenCancelled;
            if (runnable != null) {
                runnable.run();
            }
            removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + ((long) requestInfo.chunkSize));
            if (!this.forceSmallChunk) {
                this.forceSmallChunk = true;
                this.currentDownloadChunkSize = 32768;
                this.currentMaxDownloadRequests = 4;
            }
            startDownloadRequest(requestInfo.connectionType);
        } else if (tL_error.text.contains("FILE_MIGRATE_")) {
            Scanner scanner = new Scanner(tL_error.text.replace("FILE_MIGRATE_", ""));
            scanner.useDelimiter("");
            try {
                numValueOf = Integer.valueOf(scanner.nextInt());
            } catch (Exception unused) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                onFail(false, 0);
            } else {
                this.datacenterId = numValueOf.intValue();
                this.downloadedBytes = 0L;
                this.requestedBytesCount = 0L;
                startDownloadRequest(requestInfo.connectionType);
            }
        } else {
            if (tL_error.text.contains("OFFSET_INVALID")) {
                if (this.downloadedBytes % ((long) this.currentDownloadChunkSize) == 0) {
                    try {
                        onFinishLoadingFile(true, 0, false);
                        return false;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        onFail(false, 0);
                        return false;
                    }
                }
                onFail(false, 0);
                return false;
            }
            if (tL_error.text.contains("RETRY_LIMIT")) {
                onFail(false, 2);
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    TLRPC.InputFileLocation inputFileLocation = this.location;
                    if (inputFileLocation != null) {
                        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            FileLog.e(tL_error.text + " " + this.location + " peer_did = " + DialogObject.getPeerDialogId(((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).big);
                        } else {
                            FileLog.e(tL_error.text + " " + this.location + " id = " + this.location.id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + str3 + this.location.secret);
                        }
                    } else if (this.webLocation != null) {
                        FileLog.e(tL_error.text + " " + this.webLocation + " id = " + this.fileName);
                    }
                }
                onFail(false, 0);
                return false;
            }
        }
        return false;
    }

    private boolean canFinishPreload() {
        return this.isStory && this.priority < 3;
    }

    public void onFail(boolean z, final int i) {
        cleanup();
        this.state = i == 1 ? 4 : 2;
        if (this.delegate != null && BuildVars.LOGS_ENABLED) {
            long jCurrentTimeMillis = this.startTime != 0 ? System.currentTimeMillis() - this.startTime : 0L;
            if (i == 1) {
                FileLog.d("cancel downloading file to " + this.cacheFileFinal + " time = " + jCurrentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            } else {
                FileLog.d("failed downloading file to " + this.cacheFileFinal + " reason = " + i + " time = " + jCurrentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            }
        }
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLoadOperation.m442$r8$lambda$maafuPct8aqEBc9YU0uxFjKukM(this.f$0, i);
                }
            });
            return;
        }
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i);
        }
        notifyStreamListeners();
    }

    public static void m442$r8$lambda$maafuPct8aqEBc9YU0uxFjKukM(FileLoadOperation fileLoadOperation, int i) {
        FileLoadOperationDelegate fileLoadOperationDelegate = fileLoadOperation.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(fileLoadOperation, i);
        }
        fileLoadOperation.notifyStreamListeners();
    }

    private void clearOperation(RequestInfo requestInfo, boolean z, boolean z2) {
        int[] iArr = new int[2];
        long j = Long.MAX_VALUE;
        int i = 0;
        while (i < this.requestInfos.size()) {
            final RequestInfo requestInfo2 = this.requestInfos.get(i);
            long jMin = Math.min(requestInfo2.offset, j);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo2.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo2.offset, requestInfo2.offset + ((long) requestInfo2.chunkSize));
            }
            if (requestInfo != requestInfo2 && requestInfo2.requestToken != 0) {
                requestInfo2.cancelling = true;
                if (z2) {
                    this.cancelledRequestInfos.add(requestInfo2);
                    requestInfo2.whenCancelled = new Runnable() {
                        @Override
                        public final void run() {
                            FileLoadOperation.$r8$lambda$Foz_40_ipmHQ9nzNP1r71YBabK8(this.f$0, requestInfo2);
                        }
                    };
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true, new Runnable() {
                        @Override
                        public final void run() {
                            FileLoadOperation.$r8$lambda$WZILNyIhrBQAst1rN6aS3FVcWXI(requestInfo2);
                        }
                    });
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true);
                    requestInfo2.cancelled = true;
                }
            }
            i++;
            j = jMin;
        }
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 == 0 ? 2 : 65538;
            if (iArr[i2] > 1048576) {
                ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i3);
            }
            i2++;
        }
        this.requestInfos.clear();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.uiRequestTokens.clear();
            }
        });
        long jMin2 = j;
        for (int i4 = 0; i4 < this.delayedRequestInfos.size(); i4++) {
            RequestInfo requestInfo3 = this.delayedRequestInfos.get(i4);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo3.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo3.offset, requestInfo3.offset + ((long) requestInfo3.chunkSize));
            }
            if (requestInfo3.response != null) {
                requestInfo3.response.disableFree = false;
                requestInfo3.response.freeResources();
            } else if (requestInfo3.responseWeb != null) {
                requestInfo3.responseWeb.disableFree = false;
                requestInfo3.responseWeb.freeResources();
            } else if (requestInfo3.responseCdn != null) {
                requestInfo3.responseCdn.disableFree = false;
                requestInfo3.responseCdn.freeResources();
            }
            jMin2 = Math.min(requestInfo3.offset, jMin2);
        }
        this.delayedRequestInfos.clear();
        this.requestsCount = 0;
        if (!z && this.isPreloadVideoOperation) {
            this.requestedBytesCount = this.totalPreloadedBytes;
        } else if (this.notLoadedBytesRanges == null) {
            this.downloadedBytes = jMin2;
            this.requestedBytesCount = jMin2;
        }
    }

    public static void $r8$lambda$Foz_40_ipmHQ9nzNP1r71YBabK8(FileLoadOperation fileLoadOperation, RequestInfo requestInfo) {
        fileLoadOperation.getClass();
        requestInfo.whenCancelled = null;
        fileLoadOperation.cancelledRequestInfos.remove(requestInfo);
        requestInfo.cancelled = true;
    }

    public static void $r8$lambda$WZILNyIhrBQAst1rN6aS3FVcWXI(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void requestReference(RequestInfo requestInfo) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.requestingReference) {
            return;
        }
        clearOperation(null, false, false);
        this.requestingReference = true;
        this.requestedReference = true;
        Object obj = this.parentObject;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.getId() < 0 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.parentObject = webPage;
                this.isStory = false;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " file reference expired ");
        }
        FileRefController.getInstance(this.currentAccount).requestReference(this.parentObject, this.location, this, requestInfo);
    }

    public void startDownloadRequest(int i) {
        int i2;
        int iMax;
        int i3;
        final FileLoadOperation fileLoadOperation;
        long j;
        boolean z;
        ArrayList<Range> arrayList;
        long j2;
        long j3;
        long j4;
        int size;
        long jMin;
        int i4;
        long j5;
        Range range;
        int i5;
        long j6;
        long j7;
        boolean z2;
        final int i6;
        int i7;
        final TLObject tLObject;
        int i8;
        final RequestInfo requestInfo;
        boolean z3;
        long j8;
        TLRPC.InputFileLocation inputFileLocation;
        int i9;
        final int i10;
        int i11;
        HashMap<Long, PreloadRange> map;
        PreloadRange preloadRange;
        boolean z4;
        ArrayList<Range> arrayList2;
        long j9;
        boolean z5;
        int i12;
        long j10;
        long j11;
        long j12;
        long j13;
        FileLoadOperation fileLoadOperation2 = this;
        int i13 = 2;
        ?? r9 = 0;
        boolean z6 = true;
        if (BuildVars.DEBUG_PRIVATE_VERSION && Utilities.stageQueue != null && Utilities.stageQueue.getHandler() != null && Thread.currentThread() != Utilities.stageQueue.getHandler().getLooper().getThread()) {
            throw new RuntimeException("Wrong thread!!!");
        }
        if (fileLoadOperation2.state == 5) {
            fileLoadOperation2.state = 1;
        }
        if (fileLoadOperation2.paused || fileLoadOperation2.reuploadingCdn || fileLoadOperation2.state != 1 || fileLoadOperation2.requestingReference) {
            return;
        }
        long j14 = 0;
        if (fileLoadOperation2.isStory || fileLoadOperation2.streamPriorityStartOffset != 0 || fileLoadOperation2.nextPartWasPreloaded || fileLoadOperation2.requestInfos.size() + fileLoadOperation2.delayedRequestInfos.size() < fileLoadOperation2.currentMaxDownloadRequests) {
            if (fileLoadOperation2.isPreloadVideoOperation) {
                if (fileLoadOperation2.requestedBytesCount > 2097152) {
                    return;
                }
                if (fileLoadOperation2.moovFound != 0 && fileLoadOperation2.requestInfos.size() > 0) {
                    return;
                }
            }
            if (fileLoadOperation2.isStory) {
                iMax = Math.max(0, fileLoadOperation2.currentMaxDownloadRequests - fileLoadOperation2.requestInfos.size());
            } else {
                if (fileLoadOperation2.streamPriorityStartOffset != 0 || fileLoadOperation2.nextPartWasPreloaded || ((fileLoadOperation2.isPreloadVideoOperation && fileLoadOperation2.moovFound == 0) || fileLoadOperation2.totalBytesCount <= 0)) {
                    i2 = 1;
                } else {
                    iMax = Math.max(0, fileLoadOperation2.currentMaxDownloadRequests - fileLoadOperation2.requestInfos.size());
                }
                if (!fileLoadOperation2.requestedReference && FileRefController.getInstance(fileLoadOperation2.currentAccount).applyCachedFileReference(fileLoadOperation2.parentObject, fileLoadOperation2.location, fileLoadOperation2)) {
                    FileLog.d(fileLoadOperation2.fileName + " before download updated file ref from file ref cache!");
                }
                i3 = 0;
                fileLoadOperation = fileLoadOperation2;
                while (i3 < i2) {
                    if (fileLoadOperation.isPreloadVideoOperation) {
                        if (fileLoadOperation.moovFound == 0 && fileLoadOperation.preloadNotRequestedBytesCount <= j14) {
                            boolean z7 = BuildVars.DEBUG_VERSION;
                            return;
                        }
                        j9 = fileLoadOperation.nextPreloadDownloadOffset;
                        if (j9 == -1) {
                            i12 = (2097152 / fileLoadOperation.currentDownloadChunkSize) + i13;
                            j10 = j14;
                            while (true) {
                                if (i12 != 0) {
                                    j = j14;
                                    z5 = true;
                                    j9 = j10;
                                    z6 = false;
                                    break;
                                }
                                if (fileLoadOperation.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j10))) {
                                    int i14 = fileLoadOperation.currentDownloadChunkSize;
                                    j11 = i14;
                                    j10 += j11;
                                    j12 = j14;
                                    j13 = fileLoadOperation.totalBytesCount;
                                    if (j10 > j13) {
                                        j9 = j10;
                                        j = j12;
                                        z6 = false;
                                    } else {
                                        if (fileLoadOperation.moovFound == i13 && j10 == i14 * 8) {
                                            j10 = ((j13 - 1048576) / j11) * j11;
                                        }
                                        i12--;
                                        j14 = j12;
                                        z6 = true;
                                    }
                                } else {
                                    j9 = j10;
                                    j = j14;
                                }
                                z5 = true;
                                break;
                            }
                            if (!z6 && fileLoadOperation.requestInfos.isEmpty()) {
                                fileLoadOperation.onFinishLoadingFile(r9, r9, r9);
                            }
                        } else {
                            j = j14;
                            z5 = true;
                        }
                        if (fileLoadOperation.requestedPreloadedBytesRanges == null) {
                            fileLoadOperation.requestedPreloadedBytesRanges = new HashMap<>();
                        }
                        fileLoadOperation.requestedPreloadedBytesRanges.put(Long.valueOf(j9), Integer.valueOf(z5 ? 1 : 0));
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("start next preload from " + j9 + " size " + fileLoadOperation.totalBytesCount + " for " + fileLoadOperation.cacheFilePreload);
                        }
                        fileLoadOperation.preloadNotRequestedBytesCount -= (long) fileLoadOperation.currentDownloadChunkSize;
                        j3 = j9;
                        z = z5;
                    } else {
                        j = j14;
                        z = 1;
                        z = 1;
                        arrayList = fileLoadOperation.notRequestedBytesRanges;
                        if (arrayList != null) {
                            j4 = fileLoadOperation.streamPriorityStartOffset;
                            if (j4 == j) {
                                j4 = fileLoadOperation.streamStartOffset;
                            }
                            size = arrayList.size();
                            jMin = Long.MAX_VALUE;
                            i4 = 0;
                            j5 = Long.MAX_VALUE;
                            while (true) {
                                if (i4 < size) {
                                    j2 = j5;
                                    break;
                                }
                                range = fileLoadOperation.notRequestedBytesRanges.get(i4);
                                if (j4 == j) {
                                    if (range.start > j4 && range.end > j4) {
                                        j2 = j4;
                                        jMin = Long.MAX_VALUE;
                                        break;
                                    } else if (j4 >= range.start && range.start < j5) {
                                        j5 = range.start;
                                    }
                                }
                                jMin = Math.min(jMin, range.start);
                                i4++;
                            }
                            if (j2 != Long.MAX_VALUE) {
                                if (jMin != Long.MAX_VALUE) {
                                    boolean z8 = BuildVars.DEBUG_VERSION;
                                    return;
                                }
                                j3 = jMin;
                            }
                        } else {
                            j2 = fileLoadOperation.requestedBytesCount;
                        }
                        j3 = j2;
                    }
                    i5 = fileLoadOperation.preloadPrefixSize;
                    if (i5 <= 0 && j3 >= i5 && fileLoadOperation.canFinishPreload()) {
                        boolean z9 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    j6 = fileLoadOperation.totalBytesCount;
                    if (j6 <= j && j3 > j && j3 >= j6) {
                        boolean z10 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    if (!fileLoadOperation.isPreloadVideoOperation && (arrayList2 = fileLoadOperation.notRequestedBytesRanges) != null) {
                        fileLoadOperation.addPart(arrayList2, j3, ((long) fileLoadOperation.currentDownloadChunkSize) + j3, false);
                        boolean z11 = BuildVars.DEBUG_VERSION;
                    }
                    j7 = fileLoadOperation.totalBytesCount;
                    if (j7 > j || i3 == i2 - 1 || (j7 > j && ((long) fileLoadOperation.currentDownloadChunkSize) + j3 >= j7)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i == -1) {
                        i6 = i;
                    } else if (fileLoadOperation.requestsCount % 2 == 0) {
                        i6 = 2;
                    } else {
                        i6 = 65538;
                    }
                    if (fileLoadOperation.isForceRequest) {
                        i7 = 32;
                    } else {
                        i7 = 0;
                    }
                    if (fileLoadOperation.isCdn) {
                        TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                        tL_upload_getCdnFile.file_token = fileLoadOperation.cdnToken;
                        tL_upload_getCdnFile.offset = j3;
                        tL_upload_getCdnFile.limit = fileLoadOperation.currentDownloadChunkSize;
                        i8 = i7 | z;
                        tLObject = tL_upload_getCdnFile;
                    } else if (fileLoadOperation.webLocation != null) {
                        TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                        tL_upload_getWebFile.location = fileLoadOperation.webLocation;
                        tL_upload_getWebFile.offset = (int) j3;
                        tL_upload_getWebFile.limit = fileLoadOperation.currentDownloadChunkSize;
                        i8 = i7;
                        tLObject = tL_upload_getWebFile;
                    } else {
                        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                        tL_upload_getFile.location = fileLoadOperation.location;
                        tL_upload_getFile.offset = j3;
                        tL_upload_getFile.limit = fileLoadOperation.currentDownloadChunkSize;
                        tL_upload_getFile.cdn_supported = z;
                        i8 = i7;
                        tLObject = tL_upload_getFile;
                    }
                    fileLoadOperation.requestedBytesCount += (long) fileLoadOperation.currentDownloadChunkSize;
                    requestInfo = new RequestInfo();
                    fileLoadOperation.requestInfos.add(requestInfo);
                    requestInfo.offset = j3;
                    requestInfo.chunkSize = fileLoadOperation.currentDownloadChunkSize;
                    requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                    requestInfo.connectionType = i6;
                    if (fileLoadOperation.isPreloadVideoOperation && fileLoadOperation.supportsPreloading && fileLoadOperation.preloadStream != null && (map = fileLoadOperation.preloadedBytesRanges) != null && (preloadRange = map.get(Long.valueOf(requestInfo.offset))) != null) {
                        requestInfo.response = new TLRPC.TL_upload_file();
                        try {
                            if (BuildVars.DEBUG_VERSION) {
                                try {
                                    if (preloadRange.length > 2147483647L) {
                                        throw new RuntimeException("cast long to integer");
                                    }
                                } catch (Exception unused) {
                                    z3 = false;
                                    if (fileLoadOperation.streamPriorityStartOffset != j) {
                                        if (BuildVars.DEBUG_VERSION) {
                                            FileLog.d("frame get offset = " + fileLoadOperation.streamPriorityStartOffset);
                                        }
                                        j8 = j;
                                        fileLoadOperation.streamPriorityStartOffset = j8;
                                        fileLoadOperation.priorityRequestInfo = requestInfo;
                                    } else {
                                        j8 = j;
                                    }
                                    inputFileLocation = fileLoadOperation.location;
                                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                    }
                                    requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                                    if (BuildVars.LOGS_ENABLED) {
                                        requestInfo.requestStartTime = System.currentTimeMillis();
                                    }
                                    int i15 = i8 | 2048;
                                    if (fileLoadOperation.isCdn) {
                                        i9 = fileLoadOperation.cdnDatacenterId;
                                    } else {
                                        i9 = fileLoadOperation.datacenterId;
                                    }
                                    i10 = i9;
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                                    final FileLoadOperation fileLoadOperation3 = fileLoadOperation;
                                    fileLoadOperation = fileLoadOperation3;
                                    final int iSendRequestSync = connectionsManager.sendRequestSync(tLObject, new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                            FileLoadOperation.m440$r8$lambda$cms_68n3kdyASkghRjcxIfsFy8(this.f$0, requestInfo, i10, i6, tLObject, tLObject2, tL_error);
                                        }
                                    }, null, null, i15, i10, i6, z2);
                                    requestInfo.requestToken = iSendRequestSync;
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " dc=" + i10 + " send reqId " + requestInfo.requestToken + " offset=" + requestInfo.offset + " conType=" + i6 + " priority=" + fileLoadOperation.priority);
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            this.f$0.uiRequestTokens.add(Integer.valueOf(iSendRequestSync));
                                        }
                                    });
                                    i11 = 1;
                                    fileLoadOperation.requestsCount++;
                                    i3 += i11;
                                    j14 = j8;
                                    i13 = 2;
                                    z6 = true;
                                    fileLoadOperation = fileLoadOperation;
                                    r9 = z3;
                                }
                            }
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) preloadRange.length);
                            fileLoadOperation.preloadStream.seek(preloadRange.fileOffset);
                            fileLoadOperation.preloadStream.getChannel().read(nativeByteBuffer.buffer);
                            z4 = false;
                            z3 = false;
                            try {
                                nativeByteBuffer.buffer.position(0);
                                requestInfo.response.bytes = nativeByteBuffer;
                                Utilities.stageQueue.postRunnable(new Runnable() {
                                    @Override
                                    public final void run() {
                                        FileLoadOperation.$r8$lambda$drnn5CDhM9_HquwsfjxFQMbcgpg(this.f$0, requestInfo);
                                    }
                                });
                                j8 = j;
                            } catch (Exception unused2) {
                                z3 = z4;
                                if (fileLoadOperation.streamPriorityStartOffset != j) {
                                    if (BuildVars.DEBUG_VERSION) {
                                        FileLog.d("frame get offset = " + fileLoadOperation.streamPriorityStartOffset);
                                    }
                                    j8 = j;
                                    fileLoadOperation.streamPriorityStartOffset = j8;
                                    fileLoadOperation.priorityRequestInfo = requestInfo;
                                } else {
                                    j8 = j;
                                }
                                inputFileLocation = fileLoadOperation.location;
                                if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                }
                                requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                                if (BuildVars.LOGS_ENABLED) {
                                    requestInfo.requestStartTime = System.currentTimeMillis();
                                }
                                int i16 = i8 | 2048;
                                if (fileLoadOperation.isCdn) {
                                    i9 = fileLoadOperation.cdnDatacenterId;
                                } else {
                                    i9 = fileLoadOperation.datacenterId;
                                }
                                i10 = i9;
                                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                                final FileLoadOperation fileLoadOperation4 = fileLoadOperation;
                                fileLoadOperation = fileLoadOperation4;
                                final int iSendRequestSync2 = connectionsManager2.sendRequestSync(tLObject, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                        FileLoadOperation.m440$r8$lambda$cms_68n3kdyASkghRjcxIfsFy8(this.f$0, requestInfo, i10, i6, tLObject, tLObject2, tL_error);
                                    }
                                }, null, null, i16, i10, i6, z2);
                                requestInfo.requestToken = iSendRequestSync2;
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " dc=" + i10 + " send reqId " + requestInfo.requestToken + " offset=" + requestInfo.offset + " conType=" + i6 + " priority=" + fileLoadOperation.priority);
                                }
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.uiRequestTokens.add(Integer.valueOf(iSendRequestSync2));
                                    }
                                });
                                i11 = 1;
                                fileLoadOperation.requestsCount++;
                                i3 += i11;
                                j14 = j8;
                                i13 = 2;
                                z6 = true;
                                fileLoadOperation = fileLoadOperation;
                                r9 = z3;
                            }
                        } catch (Exception unused3) {
                            z4 = false;
                        }
                    } else {
                        z3 = false;
                        if (fileLoadOperation.streamPriorityStartOffset != j) {
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("frame get offset = " + fileLoadOperation.streamPriorityStartOffset);
                            }
                            j8 = j;
                            fileLoadOperation.streamPriorityStartOffset = j8;
                            fileLoadOperation.priorityRequestInfo = requestInfo;
                        } else {
                            j8 = j;
                        }
                        inputFileLocation = fileLoadOperation.location;
                        if ((inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) || ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation).photo_id != j8) {
                            requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                            if (BuildVars.LOGS_ENABLED) {
                                requestInfo.requestStartTime = System.currentTimeMillis();
                            }
                            int i17 = i8 | 2048;
                            if (fileLoadOperation.isCdn) {
                                i9 = fileLoadOperation.cdnDatacenterId;
                            } else {
                                i9 = fileLoadOperation.datacenterId;
                            }
                            i10 = i9;
                            ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                            final FileLoadOperation fileLoadOperation5 = fileLoadOperation;
                            fileLoadOperation = fileLoadOperation5;
                            final int iSendRequestSync3 = connectionsManager3.sendRequestSync(tLObject, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                                    FileLoadOperation.m440$r8$lambda$cms_68n3kdyASkghRjcxIfsFy8(this.f$0, requestInfo, i10, i6, tLObject, tLObject2, tL_error);
                                }
                            }, null, null, i17, i10, i6, z2);
                            requestInfo.requestToken = iSendRequestSync3;
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " dc=" + i10 + " send reqId " + requestInfo.requestToken + " offset=" + requestInfo.offset + " conType=" + i6 + " priority=" + fileLoadOperation.priority);
                            }
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.uiRequestTokens.add(Integer.valueOf(iSendRequestSync3));
                                }
                            });
                            i11 = 1;
                            fileLoadOperation.requestsCount++;
                        } else {
                            fileLoadOperation.requestReference(requestInfo);
                            z3 = z3;
                        }
                        i3 += i11;
                        j14 = j8;
                        i13 = 2;
                        z6 = true;
                        fileLoadOperation = fileLoadOperation;
                        r9 = z3;
                    }
                    i11 = 1;
                    i3 += i11;
                    j14 = j8;
                    i13 = 2;
                    z6 = true;
                    fileLoadOperation = fileLoadOperation;
                    r9 = z3;
                }
            }
            i2 = iMax;
            if (!fileLoadOperation2.requestedReference) {
                FileLog.d(fileLoadOperation2.fileName + " before download updated file ref from file ref cache!");
            }
            i3 = 0;
            fileLoadOperation = fileLoadOperation2;
            while (i3 < i2) {
                if (fileLoadOperation.isPreloadVideoOperation) {
                    if (fileLoadOperation.moovFound == 0) {
                    }
                    j9 = fileLoadOperation.nextPreloadDownloadOffset;
                    if (j9 == -1) {
                        i12 = (2097152 / fileLoadOperation.currentDownloadChunkSize) + i13;
                        j10 = j14;
                        while (true) {
                            if (i12 != 0) {
                                j = j14;
                                z5 = true;
                                j9 = j10;
                                z6 = false;
                                break;
                            }
                            if (fileLoadOperation.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j10))) {
                                j9 = j10;
                                j = j14;
                            } else {
                                int i18 = fileLoadOperation.currentDownloadChunkSize;
                                j11 = i18;
                                j10 += j11;
                                j12 = j14;
                                j13 = fileLoadOperation.totalBytesCount;
                                if (j10 > j13) {
                                    j9 = j10;
                                    j = j12;
                                    z6 = false;
                                } else {
                                    if (fileLoadOperation.moovFound == i13) {
                                        j10 = ((j13 - 1048576) / j11) * j11;
                                    }
                                    i12--;
                                    j14 = j12;
                                    z6 = true;
                                }
                            }
                            z5 = true;
                            break;
                        }
                        if (!z6) {
                            fileLoadOperation.onFinishLoadingFile(r9, r9, r9);
                        }
                    } else {
                        j = j14;
                        z5 = true;
                    }
                    if (fileLoadOperation.requestedPreloadedBytesRanges == null) {
                        fileLoadOperation.requestedPreloadedBytesRanges = new HashMap<>();
                    }
                    fileLoadOperation.requestedPreloadedBytesRanges.put(Long.valueOf(j9), Integer.valueOf(z5 ? 1 : 0));
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("start next preload from " + j9 + " size " + fileLoadOperation.totalBytesCount + " for " + fileLoadOperation.cacheFilePreload);
                    }
                    fileLoadOperation.preloadNotRequestedBytesCount -= (long) fileLoadOperation.currentDownloadChunkSize;
                    j3 = j9;
                    z = z5;
                } else {
                    j = j14;
                    z = 1;
                    z = 1;
                    arrayList = fileLoadOperation.notRequestedBytesRanges;
                    if (arrayList != null) {
                        j4 = fileLoadOperation.streamPriorityStartOffset;
                        if (j4 == j) {
                            j4 = fileLoadOperation.streamStartOffset;
                        }
                        size = arrayList.size();
                        jMin = Long.MAX_VALUE;
                        i4 = 0;
                        j5 = Long.MAX_VALUE;
                        while (true) {
                            if (i4 < size) {
                                j2 = j5;
                                break;
                            }
                            range = fileLoadOperation.notRequestedBytesRanges.get(i4);
                            if (j4 == j) {
                                if (range.start > j4) {
                                }
                                if (j4 >= range.start) {
                                }
                            }
                            jMin = Math.min(jMin, range.start);
                            i4++;
                        }
                        if (j2 != Long.MAX_VALUE) {
                            if (jMin != Long.MAX_VALUE) {
                                boolean z12 = BuildVars.DEBUG_VERSION;
                                return;
                            }
                            j3 = jMin;
                        }
                    } else {
                        j2 = fileLoadOperation.requestedBytesCount;
                    }
                    j3 = j2;
                }
                i5 = fileLoadOperation.preloadPrefixSize;
                if (i5 <= 0) {
                }
                j6 = fileLoadOperation.totalBytesCount;
                if (j6 <= j) {
                }
                if (!fileLoadOperation.isPreloadVideoOperation) {
                    fileLoadOperation.addPart(arrayList2, j3, ((long) fileLoadOperation.currentDownloadChunkSize) + j3, false);
                    boolean z13 = BuildVars.DEBUG_VERSION;
                }
                j7 = fileLoadOperation.totalBytesCount;
                if (j7 > j) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (i == -1) {
                    i6 = i;
                } else if (fileLoadOperation.requestsCount % 2 == 0) {
                    i6 = 2;
                } else {
                    i6 = 65538;
                }
                if (fileLoadOperation.isForceRequest) {
                    i7 = 32;
                } else {
                    i7 = 0;
                }
                if (fileLoadOperation.isCdn) {
                    TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile2 = new TLRPC.TL_upload_getCdnFile();
                    tL_upload_getCdnFile2.file_token = fileLoadOperation.cdnToken;
                    tL_upload_getCdnFile2.offset = j3;
                    tL_upload_getCdnFile2.limit = fileLoadOperation.currentDownloadChunkSize;
                    i8 = i7 | z;
                    tLObject = tL_upload_getCdnFile2;
                } else if (fileLoadOperation.webLocation != null) {
                    TLRPC.TL_upload_getWebFile tL_upload_getWebFile2 = new TLRPC.TL_upload_getWebFile();
                    tL_upload_getWebFile2.location = fileLoadOperation.webLocation;
                    tL_upload_getWebFile2.offset = (int) j3;
                    tL_upload_getWebFile2.limit = fileLoadOperation.currentDownloadChunkSize;
                    i8 = i7;
                    tLObject = tL_upload_getWebFile2;
                } else {
                    TLRPC.TL_upload_getFile tL_upload_getFile2 = new TLRPC.TL_upload_getFile();
                    tL_upload_getFile2.location = fileLoadOperation.location;
                    tL_upload_getFile2.offset = j3;
                    tL_upload_getFile2.limit = fileLoadOperation.currentDownloadChunkSize;
                    tL_upload_getFile2.cdn_supported = z;
                    i8 = i7;
                    tLObject = tL_upload_getFile2;
                }
                fileLoadOperation.requestedBytesCount += (long) fileLoadOperation.currentDownloadChunkSize;
                requestInfo = new RequestInfo();
                fileLoadOperation.requestInfos.add(requestInfo);
                requestInfo.offset = j3;
                requestInfo.chunkSize = fileLoadOperation.currentDownloadChunkSize;
                requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                requestInfo.connectionType = i6;
                if (fileLoadOperation.isPreloadVideoOperation) {
                    z3 = false;
                    if (fileLoadOperation.streamPriorityStartOffset != j) {
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("frame get offset = " + fileLoadOperation.streamPriorityStartOffset);
                        }
                        j8 = j;
                        fileLoadOperation.streamPriorityStartOffset = j8;
                        fileLoadOperation.priorityRequestInfo = requestInfo;
                    } else {
                        j8 = j;
                    }
                    inputFileLocation = fileLoadOperation.location;
                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                    }
                    requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                    if (BuildVars.LOGS_ENABLED) {
                        requestInfo.requestStartTime = System.currentTimeMillis();
                    }
                    int i19 = i8 | 2048;
                    if (fileLoadOperation.isCdn) {
                        i9 = fileLoadOperation.cdnDatacenterId;
                    } else {
                        i9 = fileLoadOperation.datacenterId;
                    }
                    i10 = i9;
                    ConnectionsManager connectionsManager4 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                    final FileLoadOperation fileLoadOperation6 = fileLoadOperation;
                    fileLoadOperation = fileLoadOperation6;
                    final int iSendRequestSync4 = connectionsManager4.sendRequestSync(tLObject, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                            FileLoadOperation.m440$r8$lambda$cms_68n3kdyASkghRjcxIfsFy8(this.f$0, requestInfo, i10, i6, tLObject, tLObject2, tL_error);
                        }
                    }, null, null, i19, i10, i6, z2);
                    requestInfo.requestToken = iSendRequestSync4;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " dc=" + i10 + " send reqId " + requestInfo.requestToken + " offset=" + requestInfo.offset + " conType=" + i6 + " priority=" + fileLoadOperation.priority);
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.uiRequestTokens.add(Integer.valueOf(iSendRequestSync4));
                        }
                    });
                    i11 = 1;
                    fileLoadOperation.requestsCount++;
                    i3 += i11;
                    j14 = j8;
                    i13 = 2;
                    z6 = true;
                    fileLoadOperation = fileLoadOperation;
                    r9 = z3;
                } else {
                    z3 = false;
                    if (fileLoadOperation.streamPriorityStartOffset != j) {
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("frame get offset = " + fileLoadOperation.streamPriorityStartOffset);
                        }
                        j8 = j;
                        fileLoadOperation.streamPriorityStartOffset = j8;
                        fileLoadOperation.priorityRequestInfo = requestInfo;
                    } else {
                        j8 = j;
                    }
                    inputFileLocation = fileLoadOperation.location;
                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                    }
                    requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                    if (BuildVars.LOGS_ENABLED) {
                        requestInfo.requestStartTime = System.currentTimeMillis();
                    }
                    int i110 = i8 | 2048;
                    if (fileLoadOperation.isCdn) {
                        i9 = fileLoadOperation.cdnDatacenterId;
                    } else {
                        i9 = fileLoadOperation.datacenterId;
                    }
                    i10 = i9;
                    ConnectionsManager connectionsManager5 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                    final FileLoadOperation fileLoadOperation7 = fileLoadOperation;
                    fileLoadOperation = fileLoadOperation7;
                    final int iSendRequestSync5 = connectionsManager5.sendRequestSync(tLObject, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                            FileLoadOperation.m440$r8$lambda$cms_68n3kdyASkghRjcxIfsFy8(this.f$0, requestInfo, i10, i6, tLObject, tLObject2, tL_error);
                        }
                    }, null, null, i110, i10, i6, z2);
                    requestInfo.requestToken = iSendRequestSync5;
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " dc=" + i10 + " send reqId " + requestInfo.requestToken + " offset=" + requestInfo.offset + " conType=" + i6 + " priority=" + fileLoadOperation.priority);
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.uiRequestTokens.add(Integer.valueOf(iSendRequestSync5));
                        }
                    });
                    i11 = 1;
                    fileLoadOperation.requestsCount++;
                    i3 += i11;
                    j14 = j8;
                    i13 = 2;
                    z6 = true;
                    fileLoadOperation = fileLoadOperation;
                    r9 = z3;
                }
                i11 = 1;
                i3 += i11;
                j14 = j8;
                i13 = 2;
                z6 = true;
                fileLoadOperation = fileLoadOperation;
                r9 = z3;
            }
        }
    }

    public static void $r8$lambda$drnn5CDhM9_HquwsfjxFQMbcgpg(FileLoadOperation fileLoadOperation, RequestInfo requestInfo) {
        fileLoadOperation.processRequestResult(requestInfo, null);
        requestInfo.response.freeResources();
    }

    public static void m440$r8$lambda$cms_68n3kdyASkghRjcxIfsFy8(final FileLoadOperation fileLoadOperation, final RequestInfo requestInfo, int i, final int i2, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        byte[] bArr;
        fileLoadOperation.getClass();
        if (requestInfo.cancelled) {
            FileLog.e("received chunk but definitely cancelled offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
            return;
        }
        if (requestInfo.cancelling) {
            FileLog.e("received cancelled chunk after cancelRequests! offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
        }
        if (!fileLoadOperation.requestInfos.contains(requestInfo)) {
            if (!fileLoadOperation.cancelledRequestInfos.contains(requestInfo)) {
                return;
            }
            int i3 = 0;
            boolean z = false;
            while (i3 < fileLoadOperation.requestInfos.size()) {
                RequestInfo requestInfo2 = fileLoadOperation.requestInfos.get(i3);
                if (requestInfo2 != null && requestInfo2 != requestInfo && requestInfo2.offset == requestInfo.offset && requestInfo2.chunkSize == requestInfo.chunkSize) {
                    FileLog.e("received cancelled chunk faster than new one! received=" + requestInfo.requestToken + " new=" + requestInfo2.requestToken);
                    if (!z) {
                        fileLoadOperation.requestInfos.set(i3, requestInfo);
                        z = true;
                    } else {
                        fileLoadOperation.requestInfos.remove(i3);
                        i3--;
                    }
                }
                i3++;
            }
        }
        int i4 = 0;
        while (i4 < fileLoadOperation.cancelledRequestInfos.size()) {
            RequestInfo requestInfo3 = fileLoadOperation.cancelledRequestInfos.get(i4);
            if (requestInfo3 != null && requestInfo3 != requestInfo && requestInfo3.offset == requestInfo.offset && requestInfo3.chunkSize == requestInfo.chunkSize) {
                FileLog.e("received new chunk faster than cancelled one! received=" + requestInfo.requestToken + " cancelled=" + requestInfo3.requestToken);
                fileLoadOperation.cancelledRequestInfos.remove(i4);
                i4 += -1;
            }
            i4++;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_loading: " + fileLoadOperation.cacheFileFinal.getName() + " time=" + (System.currentTimeMillis() - requestInfo.requestStartTime) + " dcId=" + i + " cdn=" + fileLoadOperation.isCdn + " conType=" + i2 + " reqId" + requestInfo.requestToken);
        }
        if (requestInfo == fileLoadOperation.priorityRequestInfo) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("frame get request completed " + fileLoadOperation.priorityRequestInfo.offset);
            }
            fileLoadOperation.priorityRequestInfo = null;
        }
        if (tL_error != null) {
            Runnable runnable = requestInfo.whenCancelled;
            if (runnable != null) {
                runnable.run();
            }
            if (tL_error.code == -2000) {
                fileLoadOperation.requestInfos.remove(requestInfo);
                fileLoadOperation.requestedBytesCount -= (long) requestInfo.chunkSize;
                fileLoadOperation.removePart(fileLoadOperation.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + ((long) requestInfo.chunkSize));
                return;
            } else if (FileRefController.isFileRefError(tL_error.text)) {
                fileLoadOperation.requestReference(requestInfo);
                return;
            } else if ((tLObject instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                fileLoadOperation.isCdn = false;
                fileLoadOperation.clearOperation(requestInfo, false, false);
                fileLoadOperation.startDownloadRequest(i2);
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_upload_fileCdnRedirect) {
            TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject2;
            if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                if (fileLoadOperation.cdnHashes == null) {
                    fileLoadOperation.cdnHashes = new HashMap<>();
                }
                for (int i5 = 0; i5 < tL_upload_fileCdnRedirect.file_hashes.size(); i5++) {
                    TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i5);
                    fileLoadOperation.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
            if (bArr2 == null || (bArr = tL_upload_fileCdnRedirect.encryption_key) == null || bArr2.length != 16 || bArr.length != 32) {
                Runnable runnable2 = requestInfo.whenCancelled;
                if (runnable2 != null) {
                    runnable2.run();
                }
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "bad redirect response";
                tL_error2.code = 400;
                fileLoadOperation.processRequestResult(requestInfo, tL_error2);
                return;
            }
            fileLoadOperation.isCdn = true;
            if (fileLoadOperation.notCheckedCdnRanges == null) {
                ArrayList<Range> arrayList = new ArrayList<>();
                fileLoadOperation.notCheckedCdnRanges = arrayList;
                arrayList.add(new Range(0L, fileLoadOperation.maxCdnParts));
            }
            fileLoadOperation.cdnDatacenterId = tL_upload_fileCdnRedirect.dc_id;
            fileLoadOperation.cdnIv = tL_upload_fileCdnRedirect.encryption_iv;
            fileLoadOperation.cdnKey = tL_upload_fileCdnRedirect.encryption_key;
            fileLoadOperation.cdnToken = tL_upload_fileCdnRedirect.file_token;
            fileLoadOperation.clearOperation(requestInfo, false, false);
            fileLoadOperation.startDownloadRequest(i2);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
            if (fileLoadOperation.reuploadingCdn) {
                return;
            }
            fileLoadOperation.clearOperation(requestInfo, false, false);
            fileLoadOperation.reuploadingCdn = true;
            TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
            tL_upload_reuploadCdnFile.file_token = fileLoadOperation.cdnToken;
            tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject2).request_token;
            ConnectionsManager.getInstance(fileLoadOperation.currentAccount).sendRequest(tL_upload_reuploadCdnFile, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error3) {
                    FileLoadOperation.$r8$lambda$xIsS8tcOFL4CbN7Yw5q_YGpbhjY(this.f$0, i2, requestInfo, tLObject3, tL_error3);
                }
            }, null, null, 0, fileLoadOperation.datacenterId, 1, true);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_file) {
            requestInfo.response = (TLRPC.TL_upload_file) tLObject2;
        } else if (tLObject2 instanceof TLRPC.TL_upload_webFile) {
            requestInfo.responseWeb = (TLRPC.TL_upload_webFile) tLObject2;
            if (fileLoadOperation.totalBytesCount == 0 && requestInfo.responseWeb.size != 0) {
                fileLoadOperation.totalBytesCount = requestInfo.responseWeb.size;
            }
        } else {
            requestInfo.responseCdn = (TLRPC.TL_upload_cdnFile) tLObject2;
        }
        if (tLObject2 != null) {
            int i6 = fileLoadOperation.currentType;
            if (i6 == 50331648) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
            } else if (i6 == 33554432) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
            } else if (i6 == 16777216) {
                StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
            } else if (i6 == 67108864) {
                String str = fileLoadOperation.ext;
                if (str != null && (str.toLowerCase().endsWith("mp3") || fileLoadOperation.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 7, tLObject2.getObjectSize() + 4);
                } else {
                    StatsController.getInstance(fileLoadOperation.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                }
            }
        }
        fileLoadOperation.processRequestResult(requestInfo, tL_error);
        Runnable runnable3 = requestInfo.whenCancelled;
        if (runnable3 != null) {
            runnable3.run();
        }
    }

    public static void $r8$lambda$xIsS8tcOFL4CbN7Yw5q_YGpbhjY(FileLoadOperation fileLoadOperation, int i, RequestInfo requestInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        fileLoadOperation.reuploadingCdn = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (fileLoadOperation.cdnHashes == null) {
                    fileLoadOperation.cdnHashes = new HashMap<>();
                }
                for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i2);
                    fileLoadOperation.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            fileLoadOperation.startDownloadRequest(i);
            return;
        }
        if (tL_error != null) {
            if (tL_error.text.equals("FILE_TOKEN_INVALID") || tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                fileLoadOperation.isCdn = false;
                fileLoadOperation.clearOperation(requestInfo, false, false);
                fileLoadOperation.startDownloadRequest(i);
                return;
            }
            fileLoadOperation.onFail(false, 0);
        }
    }

    public void setDelegate(FileLoadOperationDelegate fileLoadOperationDelegate) {
        this.delegate = fileLoadOperationDelegate;
    }

    public static long floorDiv(long j, long j2) {
        long j3 = j / j2;
        return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
    }

    public boolean isFinished() {
        return this.state == 3;
    }
}
