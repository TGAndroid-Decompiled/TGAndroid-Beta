package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.mi0;
public class ImageLoader {
    public static final String AUTOPLAY_FILTER = "g";
    public static final String AUTOPLAY_FILTER_NONLOOP = "gl";
    public static final int CACHE_TYPE_CACHE = 1;
    public static final int CACHE_TYPE_ENCRYPTED = 2;
    public static final int CACHE_TYPE_NONE = 0;
    private static final boolean DEBUG_MODE = false;
    private me.c cacheOutQueue;
    private DispatchQueue cacheThumbOutQueue;
    private boolean canForce8888;
    private int currentArtworkTasksCount;
    private int currentHttpFileLoadTasksCount;
    private int currentHttpTasksCount;
    private ConcurrentHashMap<String, long[]> fileProgresses;
    private HashMap<String, Integer> forceLoadingImages;
    private LinkedList<HttpFileTask> httpFileLoadTasks;
    private HashMap<String, HttpFileTask> httpFileLoadTasksByKeys;
    private String ignoreRemoval;
    private DispatchQueue imageLoadQueue;
    private volatile long lastCacheOutTime;
    private int lastImageNum;
    private LruCache<BitmapDrawable> lottieMemCache;
    private LruCache<BitmapDrawable> memCache;
    private HashMap<String, String> replacedBitmaps;
    private HashMap<String, Runnable> retryHttpsTasks;
    private LruCache<BitmapDrawable> smallImagesMemCache;
    private File telegramPath;
    private ConcurrentHashMap<String, WebFile> testWebFile;
    private HashMap<String, ThumbGenerateTask> thumbGenerateTasks;
    private DispatchQueue thumbGeneratingQueue;
    private LruCache<BitmapDrawable> wallpaperMemCache;
    private static ThreadLocal<byte[]> bytesLocal = new ThreadLocal<>();
    private static ThreadLocal<byte[]> bytesThumbLocal = new ThreadLocal<>();
    private static byte[] header = new byte[12];
    private static byte[] headerThumb = new byte[12];
    private static volatile ImageLoader Instance = null;
    private HashMap<String, Integer> bitmapUseCounts = new HashMap<>();
    ArrayList<org.telegram.ui.Components.x5> cachedAnimatedFileDrawables = new ArrayList<>();
    private HashMap<String, CacheImage> imageLoadingByUrl = new HashMap<>();
    private HashMap<String, CacheImage> imageLoadingByUrlPframe = new HashMap<>();
    public ConcurrentHashMap<String, CacheImage> imageLoadingByKeys = new ConcurrentHashMap<>();
    public HashSet<String> imageLoadingKeys = new HashSet<>();
    private SparseArray<CacheImage> imageLoadingByTag = new SparseArray<>();
    private HashMap<String, ThumbGenerateInfo> waitingForQualityThumb = new HashMap<>();
    private SparseArray<String> waitingForQualityThumbByTag = new SparseArray<>();
    private LinkedList<HttpImageTask> httpTasks = new LinkedList<>();
    private LinkedList<ArtworkLoadTask> artworkTasks = new LinkedList<>();

    public class AnonymousClass5 implements FileLoader.FileLoaderDelegate {
        final int val$currentAccount;

        public AnonymousClass5(int i9) {
            ImageLoader.this = r1;
            this.val$currentAccount = i9;
        }

        public void lambda$fileDidFailedLoad$6(String str, int i9, int i10) {
            ImageLoader.this.fileDidFailedLoad(str, i9);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, str, Integer.valueOf(i9));
        }

        public static void lambda$fileDidFailedUpload$3(int i9, String str, boolean z10) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadFailed, str, Boolean.valueOf(z10));
        }

        public void lambda$fileDidFailedUpload$4(int i9, String str, boolean z10) {
            AndroidUtilities.runOnUIThread(new r4(i9, str, z10));
            ImageLoader.this.fileProgresses.remove(str);
        }

        public void lambda$fileDidLoaded$5(File file, String str, int i9, Object obj, int i10) {
            FilePathDatabase.FileMeta fileMetadataFromParent;
            MessageObject messageObject;
            int i11;
            if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (fileMetadataFromParent = FileLoader.getFileMetadataFromParent(i9, obj)) != null)) {
                if (obj instanceof MessageObject) {
                    messageObject = (MessageObject) obj;
                } else {
                    messageObject = null;
                }
                long j10 = fileMetadataFromParent.dialogId;
                if (j10 >= 0) {
                    i11 = 1;
                } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)))) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                if (SaveToGallerySettingsHelper.needSave(i11, fileMetadataFromParent, messageObject, i9)) {
                    AndroidUtilities.addMediaToGallery(file.toString());
                }
            }
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, str, file);
            ImageLoader.this.fileDidLoaded(str, file, i10);
        }

        public static void lambda$fileDidUploaded$1(int i9, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j10));
        }

        public void lambda$fileDidUploaded$2(int i9, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
            AndroidUtilities.runOnUIThread(new x4(i9, str, inputFile, inputEncryptedFile, bArr, bArr2, j10));
            ImageLoader.this.fileProgresses.remove(str);
        }

        public void lambda$fileLoadProgressChanged$7(String str, FileLoadOperation fileLoadOperation) {
            CacheImage cacheImage = (CacheImage) ImageLoader.this.imageLoadingByUrlPframe.remove(str);
            if (cacheImage != null) {
                ImageLoader.this.imageLoadingByUrl.remove(str);
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < cacheImage.imageReceiverArray.size(); i9++) {
                    String str2 = cacheImage.keys.get(i9);
                    String str3 = cacheImage.filters.get(i9);
                    int intValue = cacheImage.types.get(i9).intValue();
                    ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i9);
                    int intValue2 = cacheImage.imageReceiverGuidsArray.get(i9).intValue();
                    CacheImage cacheImage2 = ImageLoader.this.imageLoadingByKeys.get(str2);
                    if (cacheImage2 == null) {
                        cacheImage2 = new CacheImage();
                        cacheImage2.priority = cacheImage.priority;
                        cacheImage2.secureDocument = cacheImage.secureDocument;
                        cacheImage2.currentAccount = cacheImage.currentAccount;
                        cacheImage2.finalFilePath = fileLoadOperation.getCurrentFile();
                        cacheImage2.parentObject = cacheImage.parentObject;
                        cacheImage2.isPFrame = cacheImage.isPFrame;
                        cacheImage2.key = str2;
                        cacheImage2.imageLocation = cacheImage.imageLocation;
                        cacheImage2.type = intValue;
                        cacheImage2.ext = cacheImage.ext;
                        cacheImage2.encryptionKeyPath = cacheImage.encryptionKeyPath;
                        cacheImage2.cacheTask = new CacheOutTask(cacheImage2);
                        cacheImage2.filter = str3;
                        cacheImage2.imageType = cacheImage.imageType;
                        cacheImage2.cacheType = cacheImage.cacheType;
                        ImageLoader.this.imageLoadingByKeys.put(str2, cacheImage2);
                        ImageLoader.this.imageLoadingKeys.add(ImageLoader.cutFilter(str2));
                        arrayList.add(cacheImage2.cacheTask);
                    }
                    cacheImage2.addImageReceiver(imageReceiver, str2, str3, intValue, intValue2);
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i10);
                    if (cacheOutTask.cacheImage.type != 1) {
                        me.c cVar = ImageLoader.this.cacheOutQueue;
                        int i11 = cacheOutTask.cacheImage.priority;
                        if (i11 != 1) {
                            cVar.getClass();
                            cacheOutTask = new me.b(i11, cacheOutTask);
                        }
                        cVar.f17683a.execute(cacheOutTask);
                    } else {
                        ImageLoader.this.cacheThumbOutQueue.postRunnable(cacheOutTask);
                    }
                }
            }
        }

        public static void lambda$fileLoadProgressChanged$8(int i9, String str, long j10, long j11) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j10), Long.valueOf(j11));
        }

        public static void lambda$fileUploadProgressChanged$0(int i9, String str, long j10, long j11, boolean z10) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
        }

        @Override
        public void fileDidFailedLoad(String str, int i9) {
            ImageLoader.this.fileProgresses.remove(str);
            AndroidUtilities.runOnUIThread(new w4(this, str, i9, this.val$currentAccount, 0));
        }

        @Override
        public void fileDidFailedUpload(String str, boolean z10) {
            Utilities.stageQueue.postRunnable(new t4(this, this.val$currentAccount, str, z10));
        }

        @Override
        public void fileDidLoaded(final String str, final File file, final Object obj, final int i9) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i10 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ImageLoader.AnonymousClass5.this.lambda$fileDidLoaded$5(file, str, i10, obj, i9);
                }
            });
        }

        @Override
        public void fileDidUploaded(final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j10) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i9 = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ImageLoader.AnonymousClass5.this.lambda$fileDidUploaded$2(i9, str, inputFile, inputEncryptedFile, bArr, bArr2, j10);
                }
            });
        }

        @Override
        public void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j10, long j11) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j10, j11});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new f0(this, str, fileLoadOperation, 1));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = fileLoadOperation.lastProgressUpdateTime;
            if (j12 != 0 && j12 >= elapsedRealtime - 500 && j10 != 0) {
                return;
            }
            fileLoadOperation.lastProgressUpdateTime = elapsedRealtime;
            AndroidUtilities.runOnUIThread(new v4(this.val$currentAccount, str, j10, j11));
        }

        @Override
        public void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, final String str, final long j10, final long j11, final boolean z10) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j10, j11});
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = fileUploadOperation.lastProgressUpdateTime;
            if (j12 != 0 && j12 >= elapsedRealtime - 100 && j10 != j11) {
                return;
            }
            fileUploadOperation.lastProgressUpdateTime = elapsedRealtime;
            final int i9 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(i9, str, j10, j11, z10);
                }
            });
        }
    }

    public class AnonymousClass6 extends BroadcastReceiver {
        public AnonymousClass6() {
            ImageLoader.this = r1;
        }

        public void lambda$onReceive$0() {
            ImageLoader.this.checkMediaPaths();
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("file system changed");
            }
            e1 e1Var = new e1(this, 3);
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(e1Var, 1000L);
            } else {
                e1Var.run();
            }
        }
    }

    public static class AnonymousClass7 {
        static final int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            Bitmap.CompressFormat compressFormat;
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$android$graphics$Bitmap$CompressFormat;
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
                iArr2[compressFormat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP_LOSSLESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class ArtworkLoadTask extends AsyncTask<Void, Void, String> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private HttpURLConnection httpConnection;
        private boolean small;

        public ArtworkLoadTask(CacheImage cacheImage) {
            ImageLoader.this = r2;
            this.cacheImage = cacheImage;
            this.small = Uri.parse(cacheImage.imageLocation.path).getQueryParameter("s") != null;
        }

        public void lambda$onCancelled$2() {
            ImageLoader.this.runArtworkTasks(true);
        }

        public void lambda$onPostExecute$0(String str) {
            CacheImage cacheImage = this.cacheImage;
            cacheImage.httpTask = new HttpImageTask(cacheImage, 0, str);
            ImageLoader.this.httpTasks.add(this.cacheImage.httpTask);
            ImageLoader.this.runHttpTasks(false);
        }

        public void lambda$onPostExecute$1() {
            ImageLoader.this.runArtworkTasks(true);
        }

        @Override
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new z4(this, 0));
        }

        @Override
        public String doInBackground(Void... voidArr) {
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream2;
            ByteArrayOutputStream byteArrayOutputStream2;
            int read;
            int responseCode;
            try {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.cacheImage.imageLocation.path.replace("athumb://", "https://")).openConnection();
                    this.httpConnection = httpURLConnection;
                    httpURLConnection.setConnectTimeout(5000);
                    this.httpConnection.setReadTimeout(5000);
                    this.httpConnection.connect();
                    try {
                        HttpURLConnection httpURLConnection2 = this.httpConnection;
                        if (httpURLConnection2 != null && (responseCode = httpURLConnection2.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                            this.canRetry = false;
                        }
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    inputStream2 = this.httpConnection.getInputStream();
                    try {
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                    } catch (Throwable th) {
                        inputStream = inputStream2;
                        th = th;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[32768];
                    while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    }
                    this.canRetry = false;
                    JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("results");
                    if (jSONArray.length() > 0) {
                        String string = jSONArray.getJSONObject(0).getString("artworkUrl100");
                        if (this.small) {
                            try {
                                HttpURLConnection httpURLConnection3 = this.httpConnection;
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                            } catch (Throwable unused) {
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception unused2) {
                            }
                            return string;
                        }
                        String replace = string.replace("100x100", "600x600");
                        try {
                            HttpURLConnection httpURLConnection4 = this.httpConnection;
                            if (httpURLConnection4 != null) {
                                httpURLConnection4.disconnect();
                            }
                        } catch (Throwable unused3) {
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th4) {
                                FileLog.e(th4);
                            }
                        }
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused4) {
                        }
                        return replace;
                    }
                    try {
                        HttpURLConnection httpURLConnection5 = this.httpConnection;
                        if (httpURLConnection5 != null) {
                            httpURLConnection5.disconnect();
                        }
                    } catch (Throwable unused5) {
                    }
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (Throwable th5) {
                            FileLog.e(th5);
                        }
                    }
                    byteArrayOutputStream2.close();
                } catch (Throwable th6) {
                    inputStream = inputStream2;
                    th = th6;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        if (th instanceof SocketTimeoutException) {
                            if (ApplicationLoader.isNetworkOnline()) {
                                this.canRetry = false;
                            }
                        } else if (th instanceof UnknownHostException) {
                            this.canRetry = false;
                        } else if (th instanceof SocketException) {
                            if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                                this.canRetry = false;
                            }
                        } else if (th instanceof FileNotFoundException) {
                            this.canRetry = false;
                        }
                        FileLog.e(th, false);
                        try {
                            HttpURLConnection httpURLConnection6 = this.httpConnection;
                            if (httpURLConnection6 != null) {
                                httpURLConnection6.disconnect();
                            }
                        } catch (Throwable unused6) {
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                FileLog.e(th7);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return null;
                    } finally {
                        try {
                            HttpURLConnection httpURLConnection7 = this.httpConnection;
                            if (httpURLConnection7 != null) {
                                httpURLConnection7.disconnect();
                            }
                        } catch (Throwable unused7) {
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th8) {
                                FileLog.e(th8);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused8) {
                            }
                        }
                    }
                }
            } catch (Exception unused9) {
            }
        }

        @Override
        public void onPostExecute(String str) {
            if (str != null) {
                ImageLoader.this.imageLoadQueue.postRunnable(new c3(2, this, str));
            } else if (this.canRetry) {
                ImageLoader.this.artworkLoadError(this.cacheImage.url);
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new z4(this, 1));
        }
    }

    public class CacheImage {
        protected ArtworkLoadTask artworkTask;
        protected CacheOutTask cacheTask;
        protected int cacheType;
        protected int currentAccount;
        protected File encryptionKeyPath;
        protected String ext;
        protected String filter;
        protected ArrayList<String> filters;
        protected File finalFilePath;
        protected HttpImageTask httpTask;
        protected ImageLocation imageLocation;
        protected ArrayList<ImageReceiver> imageReceiverArray;
        protected ArrayList<Integer> imageReceiverGuidsArray;
        protected int imageType;
        public boolean isPFrame;
        protected String key;
        protected ArrayList<String> keys;
        protected Object parentObject;
        public int priority;
        public Runnable runningTask;
        protected SecureDocument secureDocument;
        protected long size;
        protected File tempFilePath;
        protected int type;
        protected ArrayList<Integer> types;
        protected String url;

        private CacheImage() {
            ImageLoader.this = r1;
            this.priority = 1;
            this.imageReceiverArray = new ArrayList<>();
            this.imageReceiverGuidsArray = new ArrayList<>();
            this.keys = new ArrayList<>();
            this.filters = new ArrayList<>();
            this.types = new ArrayList<>();
        }

        public void lambda$setImageAndClear$0(android.graphics.drawable.Drawable r40, java.util.ArrayList r41, java.util.ArrayList r42, java.lang.String r43) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.CacheImage.lambda$setImageAndClear$0(android.graphics.drawable.Drawable, java.util.ArrayList, java.util.ArrayList, java.lang.String):void");
        }

        public void addImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i9, int i10) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf >= 0 && Objects.equals(this.imageReceiverArray.get(indexOf).getImageKey(), str)) {
                this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i10));
                return;
            }
            this.imageReceiverArray.add(imageReceiver);
            this.imageReceiverGuidsArray.add(Integer.valueOf(i10));
            this.keys.add(str);
            this.filters.add(str2);
            this.types.add(Integer.valueOf(i9));
            ImageLoader.this.imageLoadingByTag.put(imageReceiver.getTag(i9), this);
        }

        public void changePriority(int i9) {
            TLRPC.Document document;
            SecureDocument secureDocument;
            WebFile webFile;
            TLRPC.FileLocation fileLocation;
            SecureDocument secureDocument2;
            String str;
            WebFile webFile2;
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                if (tL_fileLocationToBeDeprecated != null) {
                    str = this.ext;
                    fileLocation = tL_fileLocationToBeDeprecated;
                    document = null;
                    secureDocument = null;
                    webFile2 = null;
                } else {
                    TLRPC.Document document2 = imageLocation.document;
                    if (document2 != null) {
                        document = document2;
                        secureDocument = null;
                    } else {
                        SecureDocument secureDocument3 = imageLocation.secureDocument;
                        if (secureDocument3 != null) {
                            secureDocument = secureDocument3;
                            document = null;
                            secureDocument2 = null;
                            fileLocation = secureDocument2;
                            webFile = secureDocument2;
                            str = fileLocation;
                            webFile2 = webFile;
                        } else {
                            WebFile webFile3 = imageLocation.webFile;
                            if (webFile3 != null) {
                                webFile = webFile3;
                                document = null;
                                secureDocument = null;
                                fileLocation = null;
                                str = fileLocation;
                                webFile2 = webFile;
                            } else {
                                document = null;
                                secureDocument = null;
                            }
                        }
                    }
                    secureDocument2 = secureDocument;
                    fileLocation = secureDocument2;
                    webFile = secureDocument2;
                    str = fileLocation;
                    webFile2 = webFile;
                }
                FileLoader.getInstance(this.currentAccount).changePriority(i9, document, secureDocument, webFile2, fileLocation, str, null);
            }
        }

        public void removeImageReceiver(ImageReceiver imageReceiver) {
            int i9 = this.type;
            int i10 = 0;
            while (i10 < this.imageReceiverArray.size()) {
                ImageReceiver imageReceiver2 = this.imageReceiverArray.get(i10);
                if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                    this.imageReceiverArray.remove(i10);
                    this.imageReceiverGuidsArray.remove(i10);
                    this.keys.remove(i10);
                    this.filters.remove(i10);
                    i9 = this.types.remove(i10).intValue();
                    if (imageReceiver2 != null) {
                        ImageLoader.this.imageLoadingByTag.remove(imageReceiver2.getTag(i9));
                    }
                    i10--;
                }
                i10++;
            }
            if (this.imageReceiverArray.isEmpty()) {
                if (this.imageLocation != null && !ImageLoader.this.forceLoadingImages.containsKey(this.key)) {
                    ImageLocation imageLocation = this.imageLocation;
                    if (imageLocation.location != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.location, this.ext);
                    } else if (imageLocation.document != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.document);
                    } else if (imageLocation.secureDocument != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.secureDocument);
                    } else if (imageLocation.webFile != null) {
                        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.imageLocation.webFile);
                    }
                }
                if (this.cacheTask != null) {
                    if (i9 != 1) {
                        me.c cVar = ImageLoader.this.cacheOutQueue;
                        CacheOutTask cacheOutTask = this.cacheTask;
                        if (cacheOutTask == null) {
                            cVar.getClass();
                        } else {
                            cVar.f17683a.remove(cacheOutTask);
                        }
                        me.c cVar2 = ImageLoader.this.cacheOutQueue;
                        Runnable runnable = this.runningTask;
                        if (runnable == null) {
                            cVar2.getClass();
                        } else {
                            cVar2.f17683a.remove(runnable);
                        }
                    } else {
                        ImageLoader.this.cacheThumbOutQueue.cancelRunnable(this.cacheTask);
                    }
                    this.cacheTask.cancel();
                    this.cacheTask = null;
                }
                if (this.httpTask != null) {
                    ImageLoader.this.httpTasks.remove(this.httpTask);
                    this.httpTask.cancel(true);
                    this.httpTask = null;
                }
                if (this.artworkTask != null) {
                    ImageLoader.this.artworkTasks.remove(this.artworkTask);
                    this.artworkTask.cancel(true);
                    this.artworkTask = null;
                }
                if (this.url != null) {
                    ImageLoader.this.imageLoadingByUrl.remove(this.url);
                }
                if (this.url != null) {
                    ImageLoader.this.imageLoadingByUrlPframe.remove(this.url);
                }
                String str = this.key;
                if (str != null) {
                    ImageLoader.this.imageLoadingByKeys.remove(str);
                    ImageLoader.this.imageLoadingKeys.remove(ImageLoader.cutFilter(this.key));
                }
            }
        }

        public void replaceImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i9, int i10) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf != -1) {
                if (this.types.get(indexOf).intValue() != i9) {
                    ArrayList<ImageReceiver> arrayList = this.imageReceiverArray;
                    indexOf = arrayList.subList(indexOf + 1, arrayList.size()).indexOf(imageReceiver);
                    if (indexOf == -1) {
                        return;
                    }
                }
                this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i10));
                this.keys.set(indexOf, str);
                this.filters.set(indexOf, str2);
            }
        }

        public void setImageAndClear(Drawable drawable, String str) {
            CacheImage cacheImage;
            if (drawable != null) {
                cacheImage = this;
                AndroidUtilities.runOnUIThread(new a5(cacheImage, drawable, new ArrayList(this.imageReceiverArray), new ArrayList(this.imageReceiverGuidsArray), str, 0));
            } else {
                cacheImage = this;
            }
            for (int i9 = 0; i9 < cacheImage.imageReceiverArray.size(); i9++) {
                ImageLoader.this.imageLoadingByTag.remove(cacheImage.imageReceiverArray.get(i9).getTag(cacheImage.type));
            }
            cacheImage.imageReceiverArray.clear();
            cacheImage.imageReceiverGuidsArray.clear();
            if (cacheImage.url != null) {
                ImageLoader.this.imageLoadingByUrl.remove(cacheImage.url);
            }
            if (cacheImage.url != null) {
                ImageLoader.this.imageLoadingByUrlPframe.remove(cacheImage.url);
            }
            String str2 = cacheImage.key;
            if (str2 != null) {
                ImageLoader.this.imageLoadingByKeys.remove(str2);
                ImageLoader.this.imageLoadingKeys.remove(ImageLoader.cutFilter(cacheImage.key));
            }
        }

        public void setImageReceiverGuid(ImageReceiver imageReceiver, int i9) {
            int indexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (indexOf == -1) {
                return;
            }
            this.imageReceiverGuidsArray.set(indexOf, Integer.valueOf(i9));
        }
    }

    public class CacheOutTask implements Runnable {
        private CacheImage cacheImage;
        private boolean isCancelled;
        private Thread runningThread;
        private final Object sync = new Object();

        public CacheOutTask(CacheImage cacheImage) {
            ImageLoader.this = r1;
            this.cacheImage = cacheImage;
        }

        private Bitmap applyWallpaperSetting(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
            int k10;
            int i9;
            if (wallPaper.pattern && wallPaper.settings != null) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                boolean z10 = true;
                if (wallPaperSettings.second_background_color == 0) {
                    i9 = AndroidUtilities.getPatternColor(wallPaperSettings.background_color);
                    canvas.drawColor(i0.a.k(wallPaper.settings.background_color, 255));
                } else if (wallPaperSettings.third_background_color == 0) {
                    int k11 = i0.a.k(wallPaperSettings.background_color, 255);
                    int k12 = i0.a.k(wallPaper.settings.second_background_color, 255);
                    int averageColor = AndroidUtilities.getAverageColor(k11, k12);
                    GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.n9.d(wallPaper.settings.rotation), new int[]{k11, k12});
                    gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    gradientDrawable.draw(canvas);
                    i9 = averageColor;
                } else {
                    int k13 = i0.a.k(wallPaperSettings.background_color, 255);
                    int k14 = i0.a.k(wallPaper.settings.second_background_color, 255);
                    int k15 = i0.a.k(wallPaper.settings.third_background_color, 255);
                    int i10 = wallPaper.settings.fourth_background_color;
                    if (i10 == 0) {
                        k10 = 0;
                    } else {
                        k10 = i0.a.k(i10, 255);
                    }
                    int g10 = jb0.g(k13, k14, k15, k10);
                    jb0 jb0Var = new jb0();
                    jb0Var.n(k13, k14, k15, k10);
                    jb0Var.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    jb0Var.t(bitmap, wallPaper.settings.intensity);
                    jb0Var.draw(canvas);
                    i9 = g10;
                    z10 = false;
                }
                if (z10) {
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
                    paint.setAlpha((int) ((wallPaper.settings.intensity / 100.0f) * 255.0f));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                }
                return createBitmap;
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
            if (wallPaperSettings2 != null && wallPaperSettings2.blur) {
                return Utilities.blurWallpaper(bitmap);
            }
            return bitmap;
        }

        public void lambda$onPostExecute$0(Drawable drawable, String str) {
            this.cacheImage.setImageAndClear(drawable, str);
        }

        public void lambda$onPostExecute$1(Drawable drawable) {
            Drawable drawable2;
            String str;
            BitmapDrawable bitmapDrawable;
            mi0 mi0Var;
            boolean z10 = false;
            if (drawable instanceof mi0) {
                mi0 mi0Var2 = (mi0) drawable;
                Drawable drawable3 = (Drawable) ImageLoader.this.lottieMemCache.get(this.cacheImage.key);
                if (drawable3 == null) {
                    ImageLoader.this.lottieMemCache.put(this.cacheImage.key, mi0Var2);
                    mi0Var = mi0Var2;
                } else {
                    mi0Var2.A(false);
                    mi0Var = drawable3;
                }
                ImageLoader.this.incrementUseCount(this.cacheImage.key);
                str = this.cacheImage.key;
                drawable2 = mi0Var;
            } else if (drawable instanceof org.telegram.ui.Components.x5) {
                org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
                if (x5Var.f34520j0) {
                    BitmapDrawable fromLottieCache = ImageLoader.this.getFromLottieCache(this.cacheImage.key);
                    if (fromLottieCache == null) {
                        ImageLoader.this.lottieMemCache.put(this.cacheImage.key, x5Var);
                        bitmapDrawable = x5Var;
                    } else {
                        x5Var.u();
                        bitmapDrawable = fromLottieCache;
                    }
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                    drawable2 = bitmapDrawable;
                }
                str = null;
                drawable2 = drawable;
            } else if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
                BitmapDrawable fromMemCache = ImageLoader.this.getFromMemCache(this.cacheImage.key);
                boolean z11 = true;
                if (fromMemCache == null) {
                    if (this.cacheImage.key.endsWith("_f")) {
                        ImageLoader.this.wallpaperMemCache.put(this.cacheImage.key, bitmapDrawable2);
                    } else {
                        if (!this.cacheImage.key.endsWith("_isc") && !this.cacheImage.key.endsWith("_nocache") && bitmapDrawable2.getBitmap().getWidth() <= AndroidUtilities.density * 80.0f && bitmapDrawable2.getBitmap().getHeight() <= AndroidUtilities.density * 80.0f) {
                            ImageLoader.this.smallImagesMemCache.put(this.cacheImage.key, bitmapDrawable2);
                        } else if (!this.cacheImage.key.endsWith("_nocache")) {
                            ImageLoader.this.memCache.put(this.cacheImage.key, bitmapDrawable2);
                        }
                        z10 = true;
                    }
                    z11 = z10;
                    drawable = bitmapDrawable2;
                } else {
                    AndroidUtilities.recycleBitmap(bitmapDrawable2.getBitmap());
                    drawable = fromMemCache;
                }
                if (z11) {
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                    drawable2 = drawable;
                }
                str = null;
                drawable2 = drawable;
            } else {
                drawable2 = null;
                str = null;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new f0(this, drawable2, str, 2), this.cacheImage.priority);
        }

        private void loadLastFrame(mi0 mi0Var, int i9, int i10, boolean z10, boolean z11) {
            Bitmap createBitmap;
            Canvas canvas;
            int i11;
            Drawable bitmapDrawable;
            if (z10 && z11) {
                float f10 = i9 * 1.2f;
                float f11 = i10 * 1.2f;
                createBitmap = Bitmap.createBitmap((int) f10, (int) f11, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
                canvas.scale(2.0f, 2.0f, f10 / 2.0f, f11 / 2.0f);
            } else {
                createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(createBitmap);
            }
            mi0Var.b();
            Bitmap createBitmap2 = Bitmap.createBitmap(mi0Var.f30842b, mi0Var.f30844c, Bitmap.Config.ARGB_8888);
            if (z10) {
                i11 = mi0Var.f30847e[0] - 1;
            } else {
                i11 = 0;
            }
            mi0Var.A0 = i11;
            mi0Var.a(createBitmap2);
            mi0Var.c();
            canvas.save();
            if (!z10 || !z11) {
                canvas.scale(createBitmap2.getWidth() / i9, createBitmap2.getHeight() / i10, i9 / 2.0f, i10 / 2.0f);
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            if (z10 && z11) {
                canvas.drawBitmap(createBitmap2, (createBitmap.getWidth() - createBitmap2.getWidth()) / 2.0f, (createBitmap.getHeight() - createBitmap2.getHeight()) / 2.0f, paint);
                bitmapDrawable = new ImageReceiver.ReactionLastFrame(createBitmap);
            } else {
                canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            mi0Var.A(false);
            createBitmap2.recycle();
            onPostExecute(bitmapDrawable);
        }

        private void onPostExecute(Drawable drawable) {
            AndroidUtilities.runOnUIThread(new c3(3, this, drawable));
        }

        public void cancel() {
            synchronized (this.sync) {
                try {
                    this.isCancelled = true;
                    Thread thread = this.runningThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Exception unused) {
                }
            }
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.CacheOutTask.run():void");
        }
    }

    public class HttpFileTask extends AsyncTask<Void, Void, Boolean> {
        private int currentAccount;
        private String ext;
        private int fileSize;
        private long lastProgressTime;
        private File tempFile;
        private String url;
        private RandomAccessFile fileOutputStream = null;
        private boolean canRetry = true;

        public HttpFileTask(String str, File file, String str2, int i9) {
            ImageLoader.this = r1;
            this.url = str;
            this.tempFile = file;
            this.ext = str2;
            this.currentAccount = i9;
        }

        public void lambda$reportProgress$0(long j10, long j11) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.url, Long.valueOf(j10), Long.valueOf(j11));
        }

        public void lambda$reportProgress$1(long j10, long j11) {
            ImageLoader.this.fileProgresses.put(this.url, new long[]{j10, j11});
            AndroidUtilities.runOnUIThread(new b5(this, j10, j11, 0));
        }

        private void reportProgress(long j10, long j11) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j10 != j11) {
                long j12 = this.lastProgressTime;
                if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new b5(this, j10, j11, 1));
        }

        @Override
        public void onCancelled() {
            ImageLoader.this.runHttpFileLoadTasks(this, 2);
        }

        @Override
        public java.lang.Boolean doInBackground(java.lang.Void... r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.HttpFileTask.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        @Override
        public void onPostExecute(Boolean bool) {
            ImageLoader.this.runHttpFileLoadTasks(this, bool.booleanValue() ? 2 : 1);
        }
    }

    public class HttpImageTask extends AsyncTask<Void, Void, Boolean> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private RandomAccessFile fileOutputStream;
        private HttpURLConnection httpConnection;
        private long imageSize;
        private long lastProgressTime;
        private String overrideUrl;

        public HttpImageTask(CacheImage cacheImage, long j10) {
            ImageLoader.this = r1;
            this.cacheImage = cacheImage;
            this.imageSize = j10;
        }

        public void lambda$onCancelled$6() {
            ImageLoader.this.runHttpTasks(true);
        }

        public void lambda$onCancelled$7() {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 1);
        }

        public void lambda$onCancelled$8() {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new d5(this, 3));
        }

        public void lambda$onPostExecute$3(Boolean bool) {
            if (bool.booleanValue()) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.cacheImage.currentAccount);
                int i9 = NotificationCenter.fileLoaded;
                CacheImage cacheImage = this.cacheImage;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, cacheImage.url, cacheImage.finalFilePath);
                return;
            }
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 2);
        }

        public void lambda$onPostExecute$4(Boolean bool) {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new e5(this, bool, 0));
        }

        public void lambda$onPostExecute$5() {
            ImageLoader.this.runHttpTasks(true);
        }

        public void lambda$reportProgress$0(long j10, long j11) {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.cacheImage.url, Long.valueOf(j10), Long.valueOf(j11));
        }

        public void lambda$reportProgress$1(long j10, long j11) {
            ImageLoader.this.fileProgresses.put(this.cacheImage.url, new long[]{j10, j11});
            AndroidUtilities.runOnUIThread(new f5(this, j10, j11, 0));
        }

        private void reportProgress(long j10, long j11) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j10 != j11) {
                long j12 = this.lastProgressTime;
                if (j12 != 0 && j12 >= elapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = elapsedRealtime;
            Utilities.stageQueue.postRunnable(new f5(this, j10, j11, 1));
        }

        @Override
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new d5(this, 0), this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new d5(this, 1));
        }

        @Override
        public java.lang.Boolean doInBackground(java.lang.Void... r13) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.HttpImageTask.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        @Override
        public void onPostExecute(Boolean bool) {
            if (!bool.booleanValue() && this.canRetry) {
                ImageLoader.this.httpFileLoadError(this.cacheImage.url);
            } else {
                ImageLoader imageLoader = ImageLoader.this;
                CacheImage cacheImage = this.cacheImage;
                imageLoader.fileDidLoaded(cacheImage.url, cacheImage.finalFilePath, 0);
            }
            Utilities.stageQueue.postRunnable(new e5(this, bool, 1));
            ImageLoader.this.imageLoadQueue.postRunnable(new d5(this, 2), this.cacheImage.priority);
        }

        public HttpImageTask(CacheImage cacheImage, int i9, String str) {
            ImageLoader.this = r1;
            this.cacheImage = cacheImage;
            this.imageSize = i9;
            this.overrideUrl = str;
        }

        public static void lambda$doInBackground$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        }
    }

    public static class MessageThumb {
        BitmapDrawable drawable;
        String key;

        public MessageThumb(String str, BitmapDrawable bitmapDrawable) {
            this.key = str;
            this.drawable = bitmapDrawable;
        }
    }

    public static class PhotoSizeFromPhoto extends TLRPC.PhotoSize {
        public final TLRPC.InputPhoto inputPhoto;
        public final TLRPC.Photo photo;

        public PhotoSizeFromPhoto(TLRPC.Photo photo) {
            this.photo = photo;
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f22399id = photo.f22404id;
            tL_inputPhoto.file_reference = photo.file_reference;
            tL_inputPhoto.access_hash = photo.access_hash;
            this.inputPhoto = tL_inputPhoto;
        }
    }

    public static class ThumbGenerateInfo {
        private boolean big;
        private String filter;
        private ArrayList<ImageReceiver> imageReceiverArray;
        private ArrayList<Integer> imageReceiverGuidsArray;
        private TLRPC.Document parentDocument;

        private ThumbGenerateInfo() {
            this.imageReceiverArray = new ArrayList<>();
            this.imageReceiverGuidsArray = new ArrayList<>();
        }
    }

    public class ThumbGenerateTask implements Runnable {
        private ThumbGenerateInfo info;
        private int mediaType;
        private File originalPath;

        public ThumbGenerateTask(int i9, File file, ThumbGenerateInfo thumbGenerateInfo) {
            ImageLoader.this = r1;
            this.mediaType = i9;
            this.originalPath = file;
            this.info = thumbGenerateInfo;
        }

        public void lambda$removeTask$0(String str) {
            ImageLoader.this.thumbGenerateTasks.remove(str);
        }

        public void lambda$run$1(String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
            removeTask();
            if (this.info.filter != null) {
                StringBuilder e10 = ta.b.e(str, "@");
                e10.append(this.info.filter);
                str = e10.toString();
            }
            String str2 = str;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((ImageReceiver) arrayList.get(i9)).setImageBitmapByKey(bitmapDrawable, str2, 0, false, ((Integer) arrayList2.get(i9)).intValue());
            }
            if (!str2.contains("nocache")) {
                ImageLoader.this.memCache.put(str2, bitmapDrawable);
            }
        }

        private void removeTask() {
            ThumbGenerateInfo thumbGenerateInfo = this.info;
            if (thumbGenerateInfo == null) {
                return;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new c3(4, this, FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)));
        }

        @Override
        public void run() {
            int min;
            int i9;
            Bitmap createScaledBitmap;
            try {
                if (this.info == null) {
                    removeTask();
                    return;
                }
                String str = "q_" + this.info.parentDocument.dc_id + "_" + this.info.parentDocument.f22386id;
                File file = new File(FileLoader.getDirectory(4), str + ".jpg");
                if (!file.exists() && this.originalPath.exists()) {
                    if (this.info.big) {
                        Point point = AndroidUtilities.displaySize;
                        min = Math.max(point.x, point.y);
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        min = Math.min(180, Math.min(point2.x, point2.y) / 4);
                    }
                    int i10 = this.mediaType;
                    Bitmap bitmap = null;
                    if (i10 == 0) {
                        float f10 = min;
                        bitmap = ImageLoader.loadBitmap(this.originalPath.toString(), null, f10, f10, false);
                    } else {
                        int i11 = 2;
                        if (i10 == 2) {
                            String file2 = this.originalPath.toString();
                            if (!this.info.big) {
                                i11 = 1;
                            }
                            bitmap = SendMessagesHelper.createVideoThumbnail(file2, i11);
                        } else if (i10 == 3) {
                            String lowerCase = this.originalPath.toString().toLowerCase();
                            if (lowerCase.endsWith("mp4")) {
                                String file3 = this.originalPath.toString();
                                if (!this.info.big) {
                                    i11 = 1;
                                }
                                bitmap = SendMessagesHelper.createVideoThumbnail(file3, i11);
                            } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                float f11 = min;
                                bitmap = ImageLoader.loadBitmap(lowerCase, null, f11, f11, false);
                            }
                        }
                    }
                    if (bitmap == null) {
                        removeTask();
                        return;
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    if (width != 0 && height != 0) {
                        float f12 = width;
                        float f13 = min;
                        float f14 = height;
                        float min2 = Math.min(f12 / f13, f14 / f13);
                        if (min2 > 1.0f && (createScaledBitmap = Bitmaps.createScaledBitmap(bitmap, (int) (f12 / min2), (int) (f14 / min2), true)) != bitmap) {
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                        if (this.info.big) {
                            i9 = 83;
                        } else {
                            i9 = 60;
                        }
                        bitmap.compress(compressFormat, i9, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        AndroidUtilities.runOnUIThread(new a5(this, str, new ArrayList(this.info.imageReceiverArray), new BitmapDrawable(bitmap), new ArrayList(this.info.imageReceiverGuidsArray)));
                        return;
                    }
                    removeTask();
                    return;
                }
                removeTask();
            } catch (Throwable th) {
                FileLog.e(th);
                removeTask();
            }
        }
    }

    public ImageLoader() {
        int i9;
        ?? obj = new Object();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        obj.f17683a = new me.a(obj, new PriorityBlockingQueue(10, new d2.a(5)));
        this.cacheOutQueue = obj;
        this.cacheThumbOutQueue = new DispatchQueue("cacheThumbOutQueue");
        this.thumbGeneratingQueue = new DispatchQueue("thumbGeneratingQueue");
        this.imageLoadQueue = new DispatchQueue("imageLoadQueue");
        this.replacedBitmaps = new HashMap<>();
        this.fileProgresses = new ConcurrentHashMap<>();
        this.thumbGenerateTasks = new HashMap<>();
        this.forceLoadingImages = new HashMap<>();
        this.currentHttpTasksCount = 0;
        this.currentArtworkTasksCount = 0;
        this.testWebFile = new ConcurrentHashMap<>();
        this.httpFileLoadTasks = new LinkedList<>();
        this.httpFileLoadTasksByKeys = new HashMap<>();
        this.retryHttpsTasks = new HashMap<>();
        this.currentHttpFileLoadTasksCount = 0;
        this.ignoreRemoval = null;
        this.lastCacheOutTime = 0L;
        this.lastImageNum = 0;
        this.telegramPath = null;
        this.thumbGeneratingQueue.setPriority(1);
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        boolean z10 = memoryClass >= 192;
        this.canForce8888 = z10;
        if (z10) {
            i9 = 30;
        } else {
            i9 = 15;
        }
        int min = Math.min(i9, memoryClass / 7) * 1048576;
        float f10 = min;
        this.memCache = new LruCache<BitmapDrawable>((int) (0.8f * f10)) {
            {
                ImageLoader.this = this;
            }

            @Override
            public void entryRemoved(boolean z11, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                if (ImageLoader.this.ignoreRemoval == null || !ImageLoader.this.ignoreRemoval.equals(str)) {
                    Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bitmap);
                        AndroidUtilities.recycleBitmaps(arrayList);
                    }
                }
            }

            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.smallImagesMemCache = new LruCache<BitmapDrawable>((int) (f10 * 0.2f)) {
            {
                ImageLoader.this = this;
            }

            @Override
            public void entryRemoved(boolean z11, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                if (ImageLoader.this.ignoreRemoval == null || !ImageLoader.this.ignoreRemoval.equals(str)) {
                    Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(bitmap);
                        AndroidUtilities.recycleBitmaps(arrayList);
                    }
                }
            }

            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.wallpaperMemCache = new LruCache<BitmapDrawable>(min / 4) {
            {
                ImageLoader.this = this;
            }

            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.lottieMemCache = new LruCache<BitmapDrawable>(10485760) {
            {
                ImageLoader.this = this;
            }

            @Override
            public void entryRemoved(boolean z11, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                boolean z12 = bitmapDrawable instanceof org.telegram.ui.Components.x5;
                if (z12) {
                    ImageLoader.this.cachedAnimatedFileDrawables.remove((org.telegram.ui.Components.x5) bitmapDrawable);
                }
                if (num == null || num.intValue() == 0) {
                    if (z12) {
                        ((org.telegram.ui.Components.x5) bitmapDrawable).u();
                    }
                    if (bitmapDrawable instanceof mi0) {
                        ((mi0) bitmapDrawable).A(false);
                    }
                }
            }

            @Override
            public BitmapDrawable put(String str, BitmapDrawable bitmapDrawable) {
                if (bitmapDrawable instanceof org.telegram.ui.Components.x5) {
                    ImageLoader.this.cachedAnimatedFileDrawables.add((org.telegram.ui.Components.x5) bitmapDrawable);
                }
                return (BitmapDrawable) super.put(str, (String) bitmapDrawable);
            }

            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        SparseArray sparseArray = new SparseArray();
        File cacheDir = AndroidUtilities.getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        for (int i10 = 0; i10 < 4; i10++) {
            FileLoader.getInstance(i10).setDelegate(new AnonymousClass5(i10));
        }
        FileLoader.setMediaDirs(sparseArray);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_NOFS");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                ApplicationLoader.applicationContext.registerReceiver(anonymousClass6, intentFilter, 4);
            } else {
                ApplicationLoader.applicationContext.registerReceiver(anonymousClass6, intentFilter);
            }
        } catch (Throwable unused) {
        }
        checkMediaPaths();
    }

    public void artworkLoadError(String str) {
        this.imageLoadQueue.postRunnable(new o4(this, str, 0));
    }

    private boolean canMoveFiles(File file, File file2, int i9) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i9 == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i9 != 3 && i9 != 5 && i9 != 6) {
                        if (i9 == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i9 == 2) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else {
                            file4 = null;
                            file3 = null;
                        }
                    }
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                }
                bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            if (renameTo) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e = e11;
            randomAccessFile2 = randomAccessFile;
            FileLog.e(e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    return false;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            throw th;
        }
    }

    private void createLoadOperationForImageReceiver(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ImageLocation imageLocation, final String str4, final long j10, final int i9, final int i10, final int i11, final int i12) {
        final boolean z10;
        long j11;
        if (imageReceiver != null && str2 != null && str != null && imageLocation != null) {
            int tag = imageReceiver.getTag(i10);
            if (tag == 0) {
                tag = this.lastImageNum;
                imageReceiver.setTag(tag, i10);
                int i13 = this.lastImageNum + 1;
                this.lastImageNum = i13;
                if (i13 == Integer.MAX_VALUE) {
                    this.lastImageNum = 0;
                }
            }
            final int i14 = tag;
            final boolean isNeedsQualityThumb = imageReceiver.isNeedsQualityThumb();
            final Object parentObject = imageReceiver.getParentObject();
            final TLRPC.Document qualityThumbDocument = imageReceiver.getQualityThumbDocument();
            final boolean isShouldGenerateQualityThumb = imageReceiver.isShouldGenerateQualityThumb();
            final int currentAccount = imageReceiver.getCurrentAccount();
            if (i10 == 0 && imageReceiver.isCurrentKeyQuality()) {
                z10 = true;
            } else {
                z10 = false;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ImageLoader.this.lambda$createLoadOperationForImageReceiver$7(i11, str2, str, i14, imageReceiver, i12, str4, i10, imageLocation, z10, parentObject, currentAccount, qualityThumbDocument, isNeedsQualityThumb, isShouldGenerateQualityThumb, str3, i9, j10);
                }
            };
            DispatchQueue dispatchQueue = this.imageLoadQueue;
            if (imageReceiver.getFileLoadingPriority() == 0) {
                j11 = 0;
            } else {
                j11 = 1;
            }
            dispatchQueue.postRunnable(runnable, j11);
            imageReceiver.addLoadingImageRunnable(runnable);
        }
    }

    public static Drawable createStripedBitmap(ArrayList<TLRPC.PhotoSize> arrayList) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (arrayList.get(i9) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) arrayList.get(i9)).bytes, "b"));
            }
        }
        return null;
    }

    public static String cutFilter(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static String decompressGzip(File file) {
        StringBuilder sb2 = new StringBuilder();
        if (file == null) {
            return "";
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                    } else {
                        String sb3 = sb2.toString();
                        bufferedReader.close();
                        gZIPInputStream.close();
                        return sb3;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public void fileDidFailedLoad(String str, int i9) {
        if (i9 == 1) {
            return;
        }
        this.imageLoadQueue.postRunnable(new o4(this, str, 4));
    }

    public void fileDidLoaded(String str, File file, int i9) {
        this.imageLoadQueue.postRunnable(new h0(this, str, i9, file, 4));
    }

    public static TLRPC.PhotoSize fileToSize(String str, boolean z10) {
        File directory;
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i9 = options.outWidth;
            int i10 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.f22405w = i9;
            tL_photoSize_layer127.h = i10;
            if (i9 <= 100 && i10 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i9 <= 320 && i10 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i9 <= 800 && i10 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i9 <= 1280 && i10 <= 1280) {
                tL_photoSize_layer127.type = "y";
            } else {
                tL_photoSize_layer127.type = "w";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            String l10 = aa.d.l(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2);
            if (z10) {
                directory = FileLoader.getDirectory(4);
            } else if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L) {
                directory = FileLoader.getDirectory(0);
            } else {
                directory = FileLoader.getDirectory(4);
            }
            File file = new File(directory, l10);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static void fillPhotoSizeWithBytes(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSize, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        byte[] bArr2 = new byte[(int) randomAccessFile.length()];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, bArr2.length);
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
    }

    private Drawable findInPreloadImageReceivers(String str, List<ImageReceiver> list) {
        if (list == null) {
            return null;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ImageReceiver imageReceiver = list.get(i9);
            if (str.equals(imageReceiver.getImageKey())) {
                return imageReceiver.getImageDrawable();
            }
            if (str.equals(imageReceiver.getMediaKey())) {
                return imageReceiver.getMediaDrawable();
            }
        }
        return null;
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i9 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i9 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i9);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i9++;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i9 < size2) {
                    TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i9);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i9++;
                }
                return null;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i9 < size3) {
                    TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i9);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i9++;
                }
                return null;
            }
            return null;
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
        } else {
            return null;
        }
    }

    public static MessageThumb generateMessageThumb(TLRPC.Message message) {
        int i9;
        int i10;
        Bitmap strippedPhotoBitmap;
        byte[] bArr;
        TLRPC.PhotoSize findPhotoCachedSize = findPhotoCachedSize(message);
        if (findPhotoCachedSize != null && (bArr = findPhotoCachedSize.bytes) != null && bArr.length != 0) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f22405w = findPhotoCachedSize.f22405w;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.size = findPhotoCachedSize.size;
            tL_photoSize_layer127.type = findPhotoCachedSize.type;
            if (pathToAttach.exists() && message.grouped_id == 0) {
                PointF C2 = org.telegram.ui.Cells.t1.C2(findPhotoCachedSize.f22405w, findPhotoCachedSize.h, 0, 0);
                Locale locale = Locale.US;
                String str = findPhotoCachedSize.location.volume_id + "_" + findPhotoCachedSize.location.local_id + "@" + ((int) (C2.x / AndroidUtilities.density)) + "_" + ((int) (C2.y / AndroidUtilities.density)) + "_b";
                if (!getInstance().isInMemCache(str, false)) {
                    String path = pathToAttach.getPath();
                    float f10 = C2.x;
                    float f11 = AndroidUtilities.density;
                    Bitmap loadBitmap = loadBitmap(path, null, (int) (f10 / f11), (int) (C2.y / f11), false);
                    if (loadBitmap != null) {
                        Utilities.blurBitmap(loadBitmap, 3);
                        float f12 = C2.x;
                        float f13 = AndroidUtilities.density;
                        Bitmap createScaledBitmap = Bitmaps.createScaledBitmap(loadBitmap, (int) (f12 / f13), (int) (C2.y / f13), true);
                        if (createScaledBitmap != loadBitmap) {
                            loadBitmap.recycle();
                            loadBitmap = createScaledBitmap;
                        }
                        return new MessageThumb(str, new BitmapDrawable(loadBitmap));
                    }
                }
            }
        } else {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i11);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(message.media.document.thumbs, 320);
                        if (closestPhotoSizeWithSize != null) {
                            i10 = closestPhotoSizeWithSize.h;
                            i9 = closestPhotoSizeWithSize.f22405w;
                        } else {
                            int i12 = 0;
                            while (true) {
                                if (i12 < message.media.document.attributes.size()) {
                                    if (message.media.document.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i12);
                                        i10 = tL_documentAttributeVideo.h;
                                        i9 = tL_documentAttributeVideo.f22387w;
                                        break;
                                    }
                                    i12++;
                                } else {
                                    i9 = 0;
                                    i10 = 0;
                                    break;
                                }
                            }
                        }
                        PointF C22 = org.telegram.ui.Cells.t1.C2(i9, i10, 0, 0);
                        Locale locale2 = Locale.US;
                        String str2 = ImageLocation.getStrippedKey(message, message, photoSize) + "_false@" + ((int) (C22.x / AndroidUtilities.density)) + "_" + ((int) (C22.y / AndroidUtilities.density)) + "_b";
                        if (!getInstance().isInMemCache(str2, false) && (strippedPhotoBitmap = getStrippedPhotoBitmap(photoSize.bytes, null)) != null) {
                            Utilities.blurBitmap(strippedPhotoBitmap, 3);
                            float f14 = C22.x;
                            float f15 = AndroidUtilities.density;
                            Bitmap createScaledBitmap2 = Bitmaps.createScaledBitmap(strippedPhotoBitmap, (int) (f14 / f15), (int) (C22.y / f15), true);
                            if (createScaledBitmap2 != strippedPhotoBitmap) {
                                strippedPhotoBitmap.recycle();
                                strippedPhotoBitmap = createScaledBitmap2;
                            }
                            return new MessageThumb(str2, new BitmapDrawable(strippedPhotoBitmap));
                        }
                    }
                }
            }
        }
        return null;
    }

    private void generateThumb(int i9, File file, ThumbGenerateInfo thumbGenerateInfo) {
        if ((i9 == 0 || i9 == 2 || i9 == 3) && file != null && thumbGenerateInfo != null) {
            if (this.thumbGenerateTasks.get(FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)) == null) {
                this.thumbGeneratingQueue.postRunnable(new ThumbGenerateTask(i9, file, thumbGenerateInfo));
            }
        }
    }

    public BitmapDrawable getFromLottieCache(String str) {
        BitmapDrawable bitmapDrawable = this.lottieMemCache.get(str);
        if (bitmapDrawable instanceof org.telegram.ui.Components.x5) {
            org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) bitmapDrawable;
            if (!x5Var.Y && x5Var.C0 < 15) {
                return bitmapDrawable;
            }
            this.lottieMemCache.remove(str);
            return null;
        }
        return bitmapDrawable;
    }

    public static String getHttpFileName(String str) {
        return Utilities.MD5(str);
    }

    public static File getHttpFilePath(String str, String str2) {
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        File directory = FileLoader.getDirectory(4);
        return new File(directory, Utilities.MD5(str) + "." + httpUrlExtension);
    }

    public static String getHttpUrlExtension(String str, String str2) {
        String str3;
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() > 1) {
            str = lastPathSegment;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str.substring(lastIndexOf + 1);
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0 && str3.length() <= 4) {
            return str3;
        }
        return str2;
    }

    public static ImageLoader getInstance() {
        ImageLoader imageLoader;
        ImageLoader imageLoader2 = Instance;
        if (imageLoader2 == null) {
            synchronized (ImageLoader.class) {
                try {
                    imageLoader = Instance;
                    if (imageLoader == null) {
                        imageLoader = new ImageLoader();
                        Instance = imageLoader;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return imageLoader;
        }
        return imageLoader2;
    }

    private File getPublicStorageDir() {
        File file = ApplicationLoader.applicationContext.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            for (int i9 = 0; i9 < ApplicationLoader.applicationContext.getExternalMediaDirs().length; i9++) {
                File file2 = ApplicationLoader.applicationContext.getExternalMediaDirs()[i9];
                if (file2 != null && file2.getPath().startsWith(SharedConfig.storageCacheDir)) {
                    file = ApplicationLoader.applicationContext.getExternalMediaDirs()[i9];
                }
            }
        }
        return file;
    }

    public static Bitmap getStrippedPhotoBitmap(byte[] bArr, String str) {
        Bitmap.Config config;
        int length = (bArr.length - 3) + Bitmaps.header.length + Bitmaps.footer.length;
        byte[] bArr2 = bytesLocal.get();
        if (bArr2 == null || bArr2.length < length) {
            bArr2 = null;
        }
        if (bArr2 == null) {
            bArr2 = new byte[length];
            bytesLocal.set(bArr2);
        }
        byte[] bArr3 = Bitmaps.header;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(bArr, 3, bArr2, Bitmaps.header.length, bArr.length - 3);
        byte[] bArr4 = Bitmaps.footer;
        System.arraycopy(bArr4, 0, bArr2, (Bitmaps.header.length + bArr.length) - 3, bArr4.length);
        boolean z10 = true;
        bArr2[164] = bArr[1];
        bArr2[166] = bArr[2];
        BitmapFactory.Options options = new BitmapFactory.Options();
        z10 = (TextUtils.isEmpty(str) || !str.contains("r")) ? false : false;
        if (!SharedConfig.deviceIsHigh() && !z10) {
            config = Bitmap.Config.RGB_565;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        options.inPreferredConfig = config;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length, options);
        if (z10) {
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), decodeByteArray.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(1.2f, 1.2f, decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f);
            canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            Path path = new Path();
            path.addCircle(decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f, Math.min(decodeByteArray.getWidth(), decodeByteArray.getHeight()) / 2.0f, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
            decodeByteArray.recycle();
            decodeByteArray = createBitmap;
        }
        if (decodeByteArray != null && !TextUtils.isEmpty(str) && str.contains("b")) {
            Utilities.blurBitmap(decodeByteArray, 3);
        }
        return decodeByteArray;
    }

    public static boolean hasAutoplayFilter(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split("_");
        for (int i9 = 0; i9 < split.length; i9++) {
            if ("g".equals(split[i9]) || "gl".equals(split[i9]) || "pframe".equals(split[i9])) {
                return true;
            }
        }
        return false;
    }

    public void httpFileLoadError(String str) {
        this.imageLoadQueue.postRunnable(new o4(this, str, 3));
    }

    public boolean isAnimatedAvatar(String str) {
        if (str != null && str.endsWith("avatar")) {
            return true;
        }
        return false;
    }

    private boolean isPFrame(String str) {
        if (str != null && str.endsWith("pframe")) {
            return true;
        }
        return false;
    }

    public static boolean isSdCardPath(File file) {
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir) && file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
            return true;
        }
        return false;
    }

    public void lambda$artworkLoadError$10(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        ArtworkLoadTask artworkLoadTask = cacheImage.artworkTask;
        if (artworkLoadTask != null) {
            ArtworkLoadTask artworkLoadTask2 = new ArtworkLoadTask(artworkLoadTask.cacheImage);
            cacheImage.artworkTask = artworkLoadTask2;
            this.artworkTasks.add(artworkLoadTask2);
        }
        runArtworkTasks(false);
    }

    public void lambda$cancelForceLoadingForImageReceiver$6(String str) {
        this.forceLoadingImages.remove(str);
    }

    public void lambda$cancelLoadingForImageReceiver$4(boolean z10, ImageReceiver imageReceiver) {
        int i9 = 0;
        while (true) {
            int i10 = 3;
            if (i9 < 3) {
                if (i9 <= 0 || z10) {
                    if (i9 == 0) {
                        i10 = 1;
                    } else if (i9 == 1) {
                        i10 = 0;
                    }
                    int tag = imageReceiver.getTag(i10);
                    if (tag != 0) {
                        if (i9 == 0) {
                            removeFromWaitingForThumb(tag, imageReceiver);
                        }
                        CacheImage cacheImage = this.imageLoadingByTag.get(tag);
                        if (cacheImage != null) {
                            cacheImage.removeImageReceiver(imageReceiver);
                        }
                    }
                    i9++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void lambda$changeFileLoadingPriorityForImageReceiver$3(ImageReceiver imageReceiver, int i9) {
        CacheImage cacheImage;
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (i10 < 3) {
                if (i10 == 0) {
                    i11 = 1;
                } else if (i10 == 1) {
                    i11 = 0;
                }
                int tag = imageReceiver.getTag(i11);
                if (tag != 0 && (cacheImage = this.imageLoadingByTag.get(tag)) != null) {
                    cacheImage.changePriority(i9);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public static void lambda$checkMediaPaths$0(SparseArray sparseArray, Runnable runnable) {
        FileLoader.setMediaDirs(sparseArray);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$checkMediaPaths$1(Runnable runnable) {
        AndroidUtilities.runOnUIThread(new c2(13, createMediaPaths(), runnable));
    }

    public void lambda$createLoadOperationForImageReceiver$7(int r26, java.lang.String r27, java.lang.String r28, int r29, org.telegram.messenger.ImageReceiver r30, int r31, java.lang.String r32, int r33, org.telegram.messenger.ImageLocation r34, boolean r35, java.lang.Object r36, int r37, org.telegram.tgnet.TLRPC.Document r38, boolean r39, boolean r40, java.lang.String r41, int r42, long r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.lambda$createLoadOperationForImageReceiver$7(int, java.lang.String, java.lang.String, int, org.telegram.messenger.ImageReceiver, int, java.lang.String, int, org.telegram.messenger.ImageLocation, boolean, java.lang.Object, int, org.telegram.tgnet.TLRPC$Document, boolean, boolean, java.lang.String, int, long):void");
    }

    public void lambda$fileDidFailedLoad$12(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage != null) {
            cacheImage.setImageAndClear(null, null);
        }
    }

    public void lambda$fileDidLoaded$11(String str, int i9, File file) {
        ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
        if (thumbGenerateInfo != null && thumbGenerateInfo.parentDocument != null) {
            generateThumb(i9, file, thumbGenerateInfo);
            this.waitingForQualityThumb.remove(str);
        }
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage != null) {
            this.imageLoadingByUrl.remove(str);
            this.imageLoadingByUrlPframe.remove(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cacheImage.imageReceiverArray.size(); i10++) {
                String str2 = cacheImage.keys.get(i10);
                String str3 = cacheImage.filters.get(i10);
                int intValue = cacheImage.types.get(i10).intValue();
                ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i10);
                int intValue2 = cacheImage.imageReceiverGuidsArray.get(i10).intValue();
                CacheImage cacheImage2 = this.imageLoadingByKeys.get(str2);
                if (cacheImage2 == null) {
                    cacheImage2 = new CacheImage();
                    cacheImage2.priority = cacheImage.priority;
                    cacheImage2.secureDocument = cacheImage.secureDocument;
                    cacheImage2.currentAccount = cacheImage.currentAccount;
                    cacheImage2.finalFilePath = file;
                    cacheImage2.parentObject = cacheImage.parentObject;
                    cacheImage2.isPFrame = cacheImage.isPFrame;
                    cacheImage2.key = str2;
                    cacheImage2.cacheType = cacheImage.cacheType;
                    cacheImage2.imageLocation = cacheImage.imageLocation;
                    cacheImage2.type = intValue;
                    cacheImage2.ext = cacheImage.ext;
                    cacheImage2.encryptionKeyPath = cacheImage.encryptionKeyPath;
                    cacheImage2.cacheTask = new CacheOutTask(cacheImage2);
                    cacheImage2.filter = str3;
                    cacheImage2.imageType = cacheImage.imageType;
                    this.imageLoadingByKeys.put(str2, cacheImage2);
                    this.imageLoadingKeys.add(cutFilter(str2));
                    arrayList.add(cacheImage2.cacheTask);
                }
                cacheImage2.addImageReceiver(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i11);
                if (cacheOutTask.cacheImage.type == 1) {
                    this.cacheThumbOutQueue.postRunnable(cacheOutTask);
                } else {
                    me.c cVar = this.cacheOutQueue;
                    int i12 = cacheOutTask.cacheImage.priority;
                    if (i12 != 1) {
                        cVar.getClass();
                        cacheOutTask = new me.b(i12, cacheOutTask);
                    }
                    cVar.f17683a.execute(cacheOutTask);
                }
            }
        }
    }

    public void lambda$httpFileLoadError$9(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        HttpImageTask httpImageTask = cacheImage.httpTask;
        if (httpImageTask != null) {
            HttpImageTask httpImageTask2 = new HttpImageTask(httpImageTask.cacheImage, httpImageTask.imageSize);
            cacheImage.httpTask = httpImageTask2;
            this.httpTasks.add(httpImageTask2);
        }
        runHttpTasks(false);
    }

    public static void lambda$moveDirectory$2(File file, java.nio.file.Path path) {
        File file2 = new File(file, path.getFileName().toString());
        if (Files.isDirectory(path, new LinkOption[0])) {
            moveDirectory(path.toFile(), file2);
            return;
        }
        try {
            Files.move(path, file2.toPath(), new CopyOption[0]);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void lambda$preloadArtwork$8(String str) {
        String httpUrlExtension = getHttpUrlExtension(str, "jpg");
        String str2 = Utilities.MD5(str) + "." + httpUrlExtension;
        File file = new File(FileLoader.getDirectory(4), str2);
        if (file.exists()) {
            return;
        }
        ImageLocation forPath = ImageLocation.getForPath(str);
        CacheImage cacheImage = new CacheImage();
        cacheImage.type = 1;
        cacheImage.key = Utilities.MD5(str);
        cacheImage.filter = null;
        cacheImage.imageLocation = forPath;
        cacheImage.ext = httpUrlExtension;
        cacheImage.parentObject = null;
        int i9 = forPath.imageType;
        if (i9 != 0) {
            cacheImage.imageType = i9;
        }
        cacheImage.url = str2;
        this.imageLoadingByUrl.put(str2, cacheImage);
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), ta.b.j(Utilities.MD5(forPath.path), "_temp.jpg"));
        cacheImage.finalFilePath = file;
        ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage);
        cacheImage.artworkTask = artworkLoadTask;
        this.artworkTasks.add(artworkLoadTask);
        runArtworkTasks(false);
    }

    public void lambda$runHttpFileLoadTasks$13(HttpFileTask httpFileTask) {
        this.httpFileLoadTasks.add(httpFileTask);
        runHttpFileLoadTasks(null, 0);
    }

    public void lambda$runHttpFileLoadTasks$14(HttpFileTask httpFileTask, int i9) {
        ImageLoader imageLoader;
        if (httpFileTask != null) {
            this.currentHttpFileLoadTasksCount--;
        }
        if (httpFileTask != null) {
            if (i9 == 1) {
                if (httpFileTask.canRetry) {
                    imageLoader = this;
                    c3 c3Var = new c3(1, this, new HttpFileTask(httpFileTask.url, httpFileTask.tempFile, httpFileTask.ext, httpFileTask.currentAccount));
                    imageLoader.retryHttpsTasks.put(httpFileTask.url, c3Var);
                    AndroidUtilities.runOnUIThread(c3Var, 1000L);
                } else {
                    imageLoader = this;
                    imageLoader.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                    NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidFailedLoad, httpFileTask.url, 0);
                }
            } else {
                imageLoader = this;
                if (i9 == 2) {
                    imageLoader.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                    File file = new File(FileLoader.getDirectory(4), Utilities.MD5(httpFileTask.url) + "." + httpFileTask.ext);
                    if (!httpFileTask.tempFile.renameTo(file)) {
                        file = httpFileTask.tempFile;
                    }
                    NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidLoad, httpFileTask.url, file.toString());
                }
            }
        } else {
            imageLoader = this;
        }
        while (imageLoader.currentHttpFileLoadTasksCount < 2 && !imageLoader.httpFileLoadTasks.isEmpty()) {
            imageLoader.httpFileLoadTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            imageLoader.currentHttpFileLoadTasksCount++;
        }
    }

    public static android.graphics.Bitmap loadBitmap(java.lang.String r18, android.net.Uri r19, float r20, float r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.loadBitmap(java.lang.String, android.net.Uri, float, float, boolean):android.graphics.Bitmap");
    }

    private static void moveDirectory(File file, final File file2) {
        Stream convert;
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    convert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    convert.forEach(new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            ImageLoader.lambda$moveDirectory$2(file2, (java.nio.file.Path) obj);
                        }

                        public Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    convert.close();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    private void performReplace(String str, String str2) {
        LruCache<BitmapDrawable> lruCache = this.memCache;
        BitmapDrawable bitmapDrawable = lruCache.get(str);
        if (bitmapDrawable == null) {
            lruCache = this.smallImagesMemCache;
            bitmapDrawable = lruCache.get(str);
        }
        this.replacedBitmaps.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = lruCache.get(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    lruCache.remove(str);
                }
            }
            this.ignoreRemoval = str;
            lruCache.remove(str);
            lruCache.put(str2, bitmapDrawable);
            this.ignoreRemoval = null;
        }
        Integer num = this.bitmapUseCounts.get(str);
        if (num != null) {
            this.bitmapUseCounts.put(str2, num);
            this.bitmapUseCounts.remove(str);
        }
    }

    private void removeFromWaitingForThumb(int i9, ImageReceiver imageReceiver) {
        String str = this.waitingForQualityThumbByTag.get(i9);
        if (str != null) {
            ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
            if (thumbGenerateInfo != null) {
                int indexOf = thumbGenerateInfo.imageReceiverArray.indexOf(imageReceiver);
                if (indexOf >= 0) {
                    thumbGenerateInfo.imageReceiverArray.remove(indexOf);
                    thumbGenerateInfo.imageReceiverGuidsArray.remove(indexOf);
                }
                if (thumbGenerateInfo.imageReceiverArray.isEmpty()) {
                    this.waitingForQualityThumb.remove(str);
                }
            }
            this.waitingForQualityThumbByTag.remove(i9);
        }
    }

    public void lambda$replaceImageInCache$5(String str, String str2, ImageLocation imageLocation) {
        ArrayList<String> filterKeys;
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                filterKeys = this.memCache.getFilterKeys(str);
            } else {
                filterKeys = this.smallImagesMemCache.getFilterKeys(str);
            }
            if (filterKeys != null) {
                for (int i10 = 0; i10 < filterKeys.size(); i10++) {
                    String str3 = filterKeys.get(i10);
                    String z10 = aa.d.z(str, "@", str3);
                    String z11 = aa.d.z(str2, "@", str3);
                    performReplace(z10, z11);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, z10, z11, imageLocation);
                }
            } else {
                performReplace(str, str2);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str, str2, imageLocation);
            }
        }
    }

    public void runArtworkTasks(boolean z10) {
        if (z10) {
            this.currentArtworkTasksCount--;
        }
        while (this.currentArtworkTasksCount < 4 && !this.artworkTasks.isEmpty()) {
            try {
                this.artworkTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.currentArtworkTasksCount++;
            } catch (Throwable unused) {
                runArtworkTasks(false);
            }
        }
    }

    public void runHttpFileLoadTasks(HttpFileTask httpFileTask, int i9) {
        AndroidUtilities.runOnUIThread(new p4(this, httpFileTask, i9, 0));
    }

    public void runHttpTasks(boolean z10) {
        if (z10) {
            this.currentHttpTasksCount--;
        }
        while (this.currentHttpTasksCount < 4 && !this.httpTasks.isEmpty()) {
            HttpImageTask poll = this.httpTasks.poll();
            if (poll != null) {
                poll.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.currentHttpTasksCount++;
            }
        }
    }

    public static void saveMessageThumbs(TLRPC.Message message) {
        byte[] bArr;
        TLRPC.PhotoSize tL_photoSize_layer127;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            return;
        }
        int i9 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            while (i9 < tL_messageMediaPaidMedia.extended_media.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i9);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    saveMessageThumbs(message, ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media);
                }
                i9++;
            }
            return;
        }
        TLRPC.PhotoSize findPhotoCachedSize = findPhotoCachedSize(message);
        if (findPhotoCachedSize == null || (bArr = findPhotoCachedSize.bytes) == null || bArr.length == 0) {
            return;
        }
        TLRPC.FileLocation fileLocation = findPhotoCachedSize.location;
        if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            findPhotoCachedSize.location = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        }
        if (findPhotoCachedSize.h <= 50 && findPhotoCachedSize.f22405w <= 50) {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = findPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.f22405w = findPhotoCachedSize.f22405w;
        } else {
            boolean z10 = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z10 = false;
            }
            if (!pathToAttach.exists()) {
                if (z10) {
                    try {
                        File internalCacheDir = FileLoader.getInternalCacheDir();
                        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(internalCacheDir, pathToAttach.getName() + ".key"), "rws");
                        long length = randomAccessFile.length();
                        byte[] bArr2 = new byte[32];
                        byte[] bArr3 = new byte[16];
                        if (length > 0 && length % 48 == 0) {
                            randomAccessFile.read(bArr2, 0, 32);
                            randomAccessFile.read(bArr3, 0, 16);
                        } else {
                            Utilities.random.nextBytes(bArr2);
                            Utilities.random.nextBytes(bArr3);
                            randomAccessFile.write(bArr2);
                            randomAccessFile.write(bArr3);
                        }
                        randomAccessFile.close();
                        byte[] bArr4 = findPhotoCachedSize.bytes;
                        Utilities.aesCtrDecryptionByteArray(bArr4, bArr2, bArr3, 0, bArr4.length, 0);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(findPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f22405w = findPhotoCachedSize.f22405w;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.size = findPhotoCachedSize.size;
            tL_photoSize_layer127.type = findPhotoCachedSize.type;
        }
        TLRPC.MessageMedia messageMedia2 = message.media;
        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia2.photo.sizes.size();
            while (i9 < size) {
                if (message.media.photo.sizes.get(i9) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.photo.sizes.set(i9, tL_photoSize_layer127);
                    return;
                }
                i9++;
            }
        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia2.document.thumbs.size();
            while (i9 < size2) {
                if (message.media.document.thumbs.get(i9) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.document.thumbs.set(i9, tL_photoSize_layer127);
                    return;
                }
                i9++;
            }
        } else if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia2.webpage.photo.sizes.size();
            while (i9 < size3) {
                if (message.media.webpage.photo.sizes.get(i9) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.webpage.photo.sizes.set(i9, tL_photoSize_layer127);
                    return;
                }
                i9++;
            }
        }
    }

    public static void saveMessagesThumbs(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                saveMessageThumbs(arrayList.get(i9));
            }
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f10, float f11, int i9, boolean z10) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f10, f11, i9, z10, 0, 0, false);
    }

    private static org.telegram.tgnet.TLRPC.PhotoSize scaleAndSaveImageInternal(org.telegram.tgnet.TLRPC.PhotoSize r2, android.graphics.Bitmap r3, android.graphics.Bitmap.CompressFormat r4, boolean r5, int r6, int r7, float r8, float r9, float r10, int r11, boolean r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.scaleAndSaveImageInternal(org.telegram.tgnet.TLRPC$PhotoSize, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, boolean, int, int, float, float, float, int, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static boolean shouldSendImageAsDocument(String str, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                str = uri.getPath();
            } else {
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th2) {
                FileLog.e(th2);
                return false;
            }
        }
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        if (f10 / f11 > 10.0f || f11 / f10 > 10.0f) {
            return true;
        }
        return false;
    }

    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.x5) {
            org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) bitmapDrawable;
            return Math.max(x5Var.getIntrinsicHeight() * x5Var.getIntrinsicWidth(), x5Var.f34516f0 * x5Var.f34514e0) * 12;
        } else if (bitmapDrawable instanceof mi0) {
            mi0 mi0Var = (mi0) bitmapDrawable;
            int i9 = mi0Var.f30842b * mi0Var.f30844c;
            if (mi0Var.C) {
                return i9 * 2;
            }
            return i9 * 8;
        } else {
            return bitmapDrawable.getBitmap().getByteCount();
        }
    }

    private boolean useLottieMemCache(ImageLocation imageLocation, String str) {
        if (str.endsWith("_firstframe") || str.endsWith("_lastframe") || ((imageLocation == null || (!MessageObject.isAnimatedStickerDocument(imageLocation.document, true) && imageLocation.imageType != 1 && !MessageObject.isVideoSticker(imageLocation.document))) && !isAnimatedAvatar(str))) {
            return false;
        }
        return true;
    }

    public void addTestWebFile(String str, WebFile webFile) {
        if (str != null && webFile != null) {
            this.testWebFile.put(str, webFile);
        }
    }

    public void cancelForceLoadingForImageReceiver(ImageReceiver imageReceiver) {
        String imageKey;
        if (imageReceiver == null || (imageKey = imageReceiver.getImageKey()) == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new o4(this, imageKey, 1));
    }

    public void cancelLoadHttpFile(String str) {
        HttpFileTask httpFileTask = this.httpFileLoadTasksByKeys.get(str);
        if (httpFileTask != null) {
            httpFileTask.cancel(true);
            this.httpFileLoadTasksByKeys.remove(str);
            this.httpFileLoadTasks.remove(httpFileTask);
        }
        Runnable runnable = this.retryHttpsTasks.get(str);
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        runHttpFileLoadTasks(null, 0);
    }

    public void cancelLoadingForImageReceiver(ImageReceiver imageReceiver, boolean z10) {
        if (imageReceiver == null) {
            return;
        }
        HashMap hashMap = org.telegram.ui.web.d2.f43836f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList = (ArrayList) entry.getValue();
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList.size()) {
                        break;
                    } else if (((Pair) arrayList.get(i9)).first == imageReceiver) {
                        arrayList.remove(i9);
                        break;
                    } else {
                        i9++;
                    }
                }
                if (arrayList.isEmpty()) {
                    org.telegram.ui.web.d2.f43836f.remove(str);
                    break;
                }
            }
        }
        ArrayList<Runnable> loadingOperations = imageReceiver.getLoadingOperations();
        if (!loadingOperations.isEmpty()) {
            for (int i10 = 0; i10 < loadingOperations.size(); i10++) {
                this.imageLoadQueue.cancelRunnable(loadingOperations.get(i10));
            }
            loadingOperations.clear();
        }
        imageReceiver.addLoadingImageRunnable(null);
        this.imageLoadQueue.postRunnable(new l6(this, z10, imageReceiver, 2));
    }

    public void changeFileLoadingPriorityForImageReceiver(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new p4(this, imageReceiver, imageReceiver.getFileLoadingPriority(), 4));
    }

    public void checkMediaPaths() {
        checkMediaPaths(null);
    }

    public void clearMemory() {
        this.smallImagesMemCache.evictAll();
        this.memCache.evictAll();
        this.lottieMemCache.evictAll();
    }

    public android.util.SparseArray<java.io.File> createMediaPaths() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.createMediaPaths():android.util.SparseArray");
    }

    public boolean decrementUseCount(String str) {
        Integer num = this.bitmapUseCounts.get(str);
        if (num == null) {
            return true;
        }
        if (num.intValue() == 1) {
            this.bitmapUseCounts.remove(str);
            return true;
        }
        this.bitmapUseCounts.put(str, Integer.valueOf(num.intValue() - 1));
        return false;
    }

    public me.c getCacheOutQueue() {
        return this.cacheOutQueue;
    }

    public Float getFileProgress(String str) {
        long[] jArr;
        if (str == null || (jArr = this.fileProgresses.get(str)) == null) {
            return null;
        }
        long j10 = jArr[1];
        if (j10 == 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.min(1.0f, ((float) jArr[0]) / ((float) j10)));
    }

    public long[] getFileProgressSizes(String str) {
        if (str == null) {
            return null;
        }
        return this.fileProgresses.get(str);
    }

    public BitmapDrawable getFromMemCache(String str) {
        BitmapDrawable bitmapDrawable = this.memCache.get(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = this.smallImagesMemCache.get(str);
        }
        if (bitmapDrawable == null) {
            bitmapDrawable = this.wallpaperMemCache.get(str);
        }
        if (bitmapDrawable == null) {
            return getFromLottieCache(str);
        }
        return bitmapDrawable;
    }

    public BitmapDrawable getImageFromMemory(TLObject tLObject, String str, String str2) {
        String str3 = null;
        if (tLObject == null && str == null) {
            return null;
        }
        if (str != null) {
            str3 = Utilities.MD5(str);
        } else if (tLObject instanceof TLRPC.FileLocation) {
            TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) tLObject;
            str3 = fileLocation.volume_id + "_" + fileLocation.local_id;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            str3 = document.dc_id + "_" + document.f22386id;
        } else if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            str3 = secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.f22515id;
        } else if (tLObject instanceof WebFile) {
            str3 = Utilities.MD5(((WebFile) tLObject).url);
        }
        if (str2 != null) {
            str3 = aa.d.z(str3, "@", str2);
        }
        return getFromMemCache(str3);
    }

    public LruCache<BitmapDrawable> getLottieMemCahce() {
        return this.lottieMemCache;
    }

    public String getReplacedKey(String str) {
        if (str == null) {
            return null;
        }
        return this.replacedBitmaps.get(str);
    }

    public boolean hasLottieMemCache(String str) {
        LruCache<BitmapDrawable> lruCache = this.lottieMemCache;
        if (lruCache != null && lruCache.contains(str)) {
            return true;
        }
        return false;
    }

    public void incrementUseCount(String str) {
        Integer num = this.bitmapUseCounts.get(str);
        if (num == null) {
            this.bitmapUseCounts.put(str, 1);
        } else {
            this.bitmapUseCounts.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public boolean isInMemCache(String str, boolean z10) {
        if (z10) {
            if (getFromLottieCache(str) == null) {
                return false;
            }
            return true;
        } else if (getFromMemCache(str) == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isLoadingHttpFile(String str) {
        return this.httpFileLoadTasksByKeys.containsKey(str);
    }

    public void loadHttpFile(String str, String str2, int i9) {
        if (str != null && str.length() != 0 && !this.httpFileLoadTasksByKeys.containsKey(str)) {
            String httpUrlExtension = getHttpUrlExtension(str, str2);
            File directory = FileLoader.getDirectory(4);
            File file = new File(directory, Utilities.MD5(str) + "_temp." + httpUrlExtension);
            file.delete();
            HttpFileTask httpFileTask = new HttpFileTask(str, file, httpUrlExtension, i9);
            this.httpFileLoadTasks.add(httpFileTask);
            this.httpFileLoadTasksByKeys.put(str, httpFileTask);
            runHttpFileLoadTasks(null, 0);
        }
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver) {
        loadImageForImageReceiver(imageReceiver, null);
    }

    public void moveToFront(String str) {
        if (str != null) {
            if (this.lottieMemCache.get(str) != null) {
                this.lottieMemCache.moveToFront(str);
            }
            if (this.memCache.get(str) != null) {
                this.memCache.moveToFront(str);
            }
            if (this.smallImagesMemCache.get(str) != null) {
                this.smallImagesMemCache.moveToFront(str);
            }
        }
    }

    public void onFragmentStackChanged() {
        for (int i9 = 0; i9 < this.cachedAnimatedFileDrawables.size(); i9++) {
            this.cachedAnimatedFileDrawables.get(i9).f34533u0 = 0;
        }
    }

    public void preloadArtwork(String str) {
        this.imageLoadQueue.postRunnable(new o4(this, str, 2));
    }

    public void putImageToCache(BitmapDrawable bitmapDrawable, String str, boolean z10) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z10) {
            this.smallImagesMemCache.put(str, bitmapDrawable);
        } else {
            this.memCache.put(str, bitmapDrawable);
        }
    }

    public void putThumbsToCache(ArrayList<MessageThumb> arrayList) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            putImageToCache(arrayList.get(i9).drawable, arrayList.get(i9).key, true);
        }
    }

    public void removeImage(String str) {
        this.bitmapUseCounts.remove(str);
        this.memCache.remove(str);
        this.smallImagesMemCache.remove(str);
    }

    public void removeTestWebFile(String str) {
        if (str == null) {
            return;
        }
        this.testWebFile.remove(str);
    }

    public void replaceImageInCache(String str, String str2, ImageLocation imageLocation, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new gk(this, str, str2, imageLocation, 8));
        } else {
            lambda$replaceImageInCache$5(str, str2, imageLocation);
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float f10, float f11, int i9, boolean z10, boolean z11) {
        return scaleAndSaveImage(photoSize, bitmap, Bitmap.CompressFormat.JPEG, false, f10, f11, i9, z10, 0, 0, z11);
    }

    public void checkMediaPaths(Runnable runnable) {
        me.c cVar = this.cacheOutQueue;
        cVar.f17683a.execute(new c2(12, this, runnable));
    }

    public void loadImageForImageReceiver(org.telegram.messenger.ImageReceiver r37, java.util.List<org.telegram.messenger.ImageReceiver> r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.loadImageForImageReceiver(org.telegram.messenger.ImageReceiver, java.util.List):void");
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f10, float f11, int i9, boolean z10, int i10, int i11) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f10, f11, i9, z10, i10, i11, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f10, float f11, boolean z10, int i9, boolean z11, int i10, int i11) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, z10, f10, f11, i9, z11, i10, i11, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i9, boolean z10, int i10, int i11) {
        return scaleAndSaveImage(null, bitmap, compressFormat, false, f10, f11, i9, z10, i10, i11, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10, float f10, float f11, int i9, boolean z11, int i10, int i11, boolean z12) {
        boolean z13;
        float f12;
        int i12;
        float max;
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width != 0.0f && height != 0.0f) {
            float max2 = Math.max(width / f10, height / f11);
            if (i10 == 0 || i11 == 0 || (width >= i10 && height >= i11)) {
                z13 = false;
            } else {
                if (i12 >= 0 || height <= i11) {
                    if (width > f12) {
                        float f13 = i11;
                        if (height < f13) {
                            max = height / f13;
                        }
                    }
                    max = Math.max(width / f12, height / i11);
                } else {
                    max = width / f12;
                }
                max2 = max;
                z13 = true;
            }
            float f14 = max2;
            int i13 = (int) (width / f14);
            int i14 = (int) (height / f14);
            if (i14 != 0 && i13 != 0) {
                try {
                    return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f14, i9, z11, z13, z12);
                } catch (Throwable th) {
                    FileLog.e(th);
                    getInstance().clearMemory();
                    System.gc();
                    try {
                        return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f14, i9, z11, z13, z12);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
            }
        }
        return null;
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.MessageMedia messageMedia) {
        int i9 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i9 < size) {
                TLRPC.PhotoSize photoSize = messageMedia.photo.sizes.get(i9);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i9++;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i9 < size2) {
                    TLRPC.PhotoSize photoSize2 = messageMedia.document.thumbs.get(i9);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i9++;
                }
                return null;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i9 < size3) {
                    TLRPC.PhotoSize photoSize3 = messageMedia.webpage.photo.sizes.get(i9);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i9++;
                }
                return null;
            }
            return null;
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (messageMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) messageMedia.extended_media.get(0)).thumb;
        } else {
            return null;
        }
    }

    public static void saveMessageThumbs(TLRPC.Message message, TLRPC.MessageMedia messageMedia) {
        TLRPC.PhotoSize findPhotoCachedSize;
        byte[] bArr;
        TLRPC.PhotoSize tL_photoSize_layer127;
        if (message == null || messageMedia == null || (findPhotoCachedSize = findPhotoCachedSize(messageMedia)) == null || (bArr = findPhotoCachedSize.bytes) == null || bArr.length == 0) {
            return;
        }
        TLRPC.FileLocation fileLocation = findPhotoCachedSize.location;
        if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            findPhotoCachedSize.location = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        }
        int i9 = 0;
        if (findPhotoCachedSize.h <= 50 && findPhotoCachedSize.f22405w <= 50) {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = findPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.f22405w = findPhotoCachedSize.f22405w;
        } else {
            boolean z10 = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(findPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z10 = false;
            }
            if (!pathToAttach.exists()) {
                if (z10) {
                    try {
                        File internalCacheDir = FileLoader.getInternalCacheDir();
                        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(internalCacheDir, pathToAttach.getName() + ".key"), "rws");
                        long length = randomAccessFile.length();
                        byte[] bArr2 = new byte[32];
                        byte[] bArr3 = new byte[16];
                        if (length > 0 && length % 48 == 0) {
                            randomAccessFile.read(bArr2, 0, 32);
                            randomAccessFile.read(bArr3, 0, 16);
                        } else {
                            Utilities.random.nextBytes(bArr2);
                            Utilities.random.nextBytes(bArr3);
                            randomAccessFile.write(bArr2);
                            randomAccessFile.write(bArr3);
                        }
                        randomAccessFile.close();
                        byte[] bArr4 = findPhotoCachedSize.bytes;
                        Utilities.aesCtrDecryptionByteArray(bArr4, bArr2, bArr3, 0, bArr4.length, 0);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(findPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f22405w = findPhotoCachedSize.f22405w;
            tL_photoSize_layer127.h = findPhotoCachedSize.h;
            tL_photoSize_layer127.location = findPhotoCachedSize.location;
            tL_photoSize_layer127.size = findPhotoCachedSize.size;
            tL_photoSize_layer127.type = findPhotoCachedSize.type;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i9 < size) {
                if (messageMedia.photo.sizes.get(i9) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.photo.sizes.set(i9, tL_photoSize_layer127);
                    return;
                }
                i9++;
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia.document.thumbs.size();
            while (i9 < size2) {
                if (messageMedia.document.thumbs.get(i9) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.document.thumbs.set(i9, tL_photoSize_layer127);
                    return;
                }
                i9++;
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia.webpage.photo.sizes.size();
            while (i9 < size3) {
                if (messageMedia.webpage.photo.sizes.get(i9) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.webpage.photo.sizes.set(i9, tL_photoSize_layer127);
                    return;
                }
                i9++;
            }
        }
    }
}
