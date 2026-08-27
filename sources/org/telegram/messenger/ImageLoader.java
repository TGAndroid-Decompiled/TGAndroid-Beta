package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.messenger.secretmedia.EncryptedFileInputStream;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.z01;

public class ImageLoader {
    public static final String AUTOPLAY_FILTER = "g";
    public static final String AUTOPLAY_FILTER_NONLOOP = "gl";
    public static final int CACHE_TYPE_CACHE = 1;
    public static final int CACHE_TYPE_ENCRYPTED = 2;
    public static final int CACHE_TYPE_NONE = 0;
    private static final boolean DEBUG_MODE = false;
    private ne.c cacheOutQueue;
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

        public AnonymousClass5(int i10) {
            this.val$currentAccount = i10;
        }

        public void lambda$fileDidFailedLoad$6(String str, int i10, int i11) {
            ImageLoader.this.fileDidFailedLoad(str, i10);
            NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, str, Integer.valueOf(i10));
        }

        public static void lambda$fileDidFailedUpload$3(int i10, String str, boolean z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadFailed, str, Boolean.valueOf(z10));
        }

        public void lambda$fileDidFailedUpload$4(int i10, String str, boolean z10) {
            AndroidUtilities.runOnUIThread(new t4(i10, str, z10));
            ImageLoader.this.fileProgresses.remove(str);
        }

        public void lambda$fileDidLoaded$5(File file, String str, int i10, Object obj, int i11) {
            FilePathDatabase.FileMeta fileMetadataFromParent;
            int i12;
            if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (fileMetadataFromParent = FileLoader.getFileMetadataFromParent(i10, obj)) != null)) {
                MessageObject messageObject = obj instanceof MessageObject ? (MessageObject) obj : null;
                long j10 = fileMetadataFromParent.dialogId;
                if (j10 >= 0) {
                    i12 = 1;
                } else {
                    i12 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10))) ? 4 : 2;
                }
                if (SaveToGallerySettingsHelper.needSave(i12, fileMetadataFromParent, messageObject, i10)) {
                    AndroidUtilities.addMediaToGallery(file.toString());
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, str, file);
            ImageLoader.this.fileDidLoaded(str, file, i11);
        }

        public static void lambda$fileDidUploaded$1(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j10));
        }

        public void lambda$fileDidUploaded$2(int i10, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j10) {
            AndroidUtilities.runOnUIThread(new z4(i10, str, inputFile, inputEncryptedFile, bArr, bArr2, j10));
            ImageLoader.this.fileProgresses.remove(str);
        }

        public void lambda$fileLoadProgressChanged$7(String str, FileLoadOperation fileLoadOperation) {
            Runnable bVar;
            CacheImage cacheImage = (CacheImage) ImageLoader.this.imageLoadingByUrlPframe.remove(str);
            if (cacheImage == null) {
                return;
            }
            ImageLoader.this.imageLoadingByUrl.remove(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cacheImage.imageReceiverArray.size(); i10++) {
                String str2 = cacheImage.keys.get(i10);
                String str3 = cacheImage.filters.get(i10);
                int iIntValue = cacheImage.types.get(i10).intValue();
                ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i10);
                int iIntValue2 = cacheImage.imageReceiverGuidsArray.get(i10).intValue();
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
                    cacheImage2.type = iIntValue;
                    cacheImage2.ext = cacheImage.ext;
                    cacheImage2.encryptionKeyPath = cacheImage.encryptionKeyPath;
                    cacheImage2.cacheTask = ImageLoader.this.new CacheOutTask(cacheImage2);
                    cacheImage2.filter = str3;
                    cacheImage2.imageType = cacheImage.imageType;
                    cacheImage2.cacheType = cacheImage.cacheType;
                    ImageLoader.this.imageLoadingByKeys.put(str2, cacheImage2);
                    ImageLoader.this.imageLoadingKeys.add(ImageLoader.cutFilter(str2));
                    arrayList.add(cacheImage2.cacheTask);
                }
                cacheImage2.addImageReceiver(imageReceiver, str2, str3, iIntValue, iIntValue2);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i11);
                if (cacheOutTask.cacheImage.type == 1) {
                    ImageLoader.this.cacheThumbOutQueue.postRunnable(cacheOutTask);
                } else {
                    ne.c cVar = ImageLoader.this.cacheOutQueue;
                    int i12 = cacheOutTask.cacheImage.priority;
                    if (i12 != 1) {
                        bVar = cacheOutTask;
                        cVar.getClass();
                        bVar = new ne.b(i12, cacheOutTask);
                    }
                    bVar = cacheOutTask;
                    cVar.f18519a.execute(bVar);
                }
            }
        }

        public static void lambda$fileLoadProgressChanged$8(int i10, String str, long j10, long j11) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j10), Long.valueOf(j11));
        }

        public static void lambda$fileUploadProgressChanged$0(int i10, String str, long j10, long j11, boolean z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(z10));
        }

        @Override
        public void fileDidFailedLoad(String str, int i10) {
            ImageLoader.this.fileProgresses.remove(str);
            AndroidUtilities.runOnUIThread(new y4(this, str, i10, this.val$currentAccount, 0));
        }

        @Override
        public void fileDidFailedUpload(String str, boolean z10) {
            Utilities.stageQueue.postRunnable(new v4(this, this.val$currentAccount, str, z10));
        }

        @Override
        public void fileDidLoaded(final String str, final File file, final Object obj, final int i10) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i11 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f21686a.lambda$fileDidLoaded$5(file, str, i11, obj, i10);
                }
            });
        }

        @Override
        public void fileDidUploaded(final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j10) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i10 = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f19672a.lambda$fileDidUploaded$2(i10, str, inputFile, inputEncryptedFile, bArr, bArr2, j10);
                }
            });
        }

        @Override
        public void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j10, long j11) {
            int i10 = 1;
            ImageLoader.this.fileProgresses.put(str, new long[]{j10, j11});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new f0(this, str, fileLoadOperation, i10));
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = fileLoadOperation.lastProgressUpdateTime;
            if (j12 == 0 || j12 < jElapsedRealtime - 500 || j10 == 0) {
                fileLoadOperation.lastProgressUpdateTime = jElapsedRealtime;
                AndroidUtilities.runOnUIThread(new x4(this.val$currentAccount, str, j10, j11));
            }
        }

        @Override
        public void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, final String str, final long j10, final long j11, final boolean z10) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j10, j11});
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = fileUploadOperation.lastProgressUpdateTime;
            if (j12 == 0 || j12 < jElapsedRealtime - 100 || j10 == j11) {
                fileUploadOperation.lastProgressUpdateTime = jElapsedRealtime;
                final int i10 = this.val$currentAccount;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(i10, str, j10, j11, z10);
                    }
                });
            }
        }
    }

    public class AnonymousClass6 extends BroadcastReceiver {
        public AnonymousClass6() {
        }

        public void lambda$onReceive$0() {
            ImageLoader.this.checkMediaPaths();
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("file system changed");
            }
            d1 d1Var = new d1(this, 3);
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(d1Var, 1000L);
            } else {
                d1Var.run();
            }
        }
    }

    public static class AnonymousClass7 {
        static final int[] $SwitchMap$android$graphics$Bitmap$CompressFormat;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            $SwitchMap$android$graphics$Bitmap$CompressFormat = iArr;
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$CompressFormat[Bitmap.CompressFormat.WEBP_LOSSY.ordinal()] = 2;
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
            this.cacheImage = cacheImage;
            this.small = Uri.parse(cacheImage.imageLocation.path).getQueryParameter("s") != null;
        }

        public void lambda$onCancelled$2() {
            ImageLoader.this.runArtworkTasks(true);
        }

        public void lambda$onPostExecute$0(String str) {
            CacheImage cacheImage = this.cacheImage;
            cacheImage.httpTask = ImageLoader.this.new HttpImageTask(cacheImage, 0, str);
            ImageLoader.this.httpTasks.add(this.cacheImage.httpTask);
            ImageLoader.this.runHttpTasks(false);
        }

        public void lambda$onPostExecute$1() {
            ImageLoader.this.runArtworkTasks(true);
        }

        @Override
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new b5(this, 0));
        }

        @Override
        public String doInBackground(Void... voidArr) {
            InputStream inputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            int i10;
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
                    } catch (Exception e9) {
                        FileLog.e((Throwable) e9, false);
                    }
                    InputStream inputStream2 = this.httpConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[32768];
                            while (!isCancelled() && (i10 = inputStream2.read(bArr)) > 0) {
                                byteArrayOutputStream2.write(bArr, 0, i10);
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
                                        } catch (Throwable th) {
                                            FileLog.e(th);
                                        }
                                    }
                                    try {
                                        byteArrayOutputStream2.close();
                                    } catch (Exception unused2) {
                                    }
                                    return string;
                                }
                                String strReplace = string.replace("100x100", "600x600");
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
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                                return strReplace;
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
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            byteArrayOutputStream2.close();
                        } catch (Throwable th4) {
                            inputStream = inputStream2;
                            th = th4;
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
                                    } catch (Throwable th5) {
                                        FileLog.e(th5);
                                    }
                                }
                                if (byteArrayOutputStream != null) {
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
                                    } catch (Throwable th6) {
                                        FileLog.e(th6);
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
                    } catch (Throwable th7) {
                        inputStream = inputStream2;
                        th = th7;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (Exception unused9) {
            }
            return null;
        }

        @Override
        public void onPostExecute(String str) {
            if (str != null) {
                ImageLoader.this.imageLoadQueue.postRunnable(new e3(2, this, str));
            } else if (this.canRetry) {
                ImageLoader.this.artworkLoadError(this.cacheImage.url);
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new b5(this, 1));
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
            this.priority = 1;
            this.imageReceiverArray = new ArrayList<>();
            this.imageReceiverGuidsArray = new ArrayList<>();
            this.keys = new ArrayList<>();
            this.filters = new ArrayList<>();
            this.types = new ArrayList<>();
        }

        public void lambda$setImageAndClear$0(Drawable drawable, ArrayList arrayList, ArrayList arrayList2, String str) {
            int i10;
            char c10;
            char c11;
            org.telegram.ui.Components.x5 x5Var;
            Drawable drawable2 = drawable;
            if (drawable2 instanceof org.telegram.ui.Components.x5) {
                org.telegram.ui.Components.x5 x5Var2 = (org.telegram.ui.Components.x5) drawable2;
                if (x5Var2.f34481j0) {
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        ((ImageReceiver) arrayList.get(i10)).setImageBitmapByKey(drawable2, this.key, this.types.get(i10).intValue(), false, ((Integer) arrayList2.get(i10)).intValue());
                        i10++;
                        drawable2 = drawable;
                    }
                } else {
                    boolean z10 = false;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i11);
                        if (i11 == 0) {
                            x5Var = x5Var2;
                            z10 = z10;
                        } else {
                            AnimatedFileDrawableStream animatedFileDrawableStream = x5Var2.f34488q0;
                            if (animatedFileDrawableStream != null) {
                                File file = x5Var2.C;
                                long j10 = x5Var2.D;
                                int i12 = x5Var2.E;
                                TLRPC.Document document = animatedFileDrawableStream.getDocument();
                                ImageLocation location = x5Var2.f34488q0.getLocation();
                                Object parentObject = x5Var2.f34488q0.getParentObject();
                                long j11 = x5Var2.I;
                                c10 = 1;
                                int i13 = x5Var2.F;
                                c11 = 0;
                                AnimatedFileDrawableStream animatedFileDrawableStream2 = x5Var2.f34488q0;
                                x5Var = new org.telegram.ui.Components.x5(file, false, j10, i12, document, location, parentObject, j11, i13, animatedFileDrawableStream2 != null && animatedFileDrawableStream2.isPreview());
                            } else {
                                c10 = 1;
                                c11 = 0;
                                x5Var = new org.telegram.ui.Components.x5(x5Var2.C, false, x5Var2.D, x5Var2.E, x5Var2.f34482k0, null, null, x5Var2.I, x5Var2.F, false);
                            }
                            int[] iArr = x5Var.d;
                            int[] iArr2 = x5Var2.d;
                            iArr[c11] = iArr2[c11];
                            iArr[c10] = iArr2[c10];
                        }
                        if (imageReceiver.setImageBitmapByKey(x5Var, this.key, this.type, false, ((Integer) arrayList2.get(i11)).intValue())) {
                            if (x5Var == x5Var2) {
                                z10 = true;
                            }
                        } else if (x5Var != x5Var2) {
                            x5Var.u();
                        }
                        z10 = z10;
                    }
                    if (!z10) {
                        x5Var2.u();
                    }
                }
            } else {
                i10 = 0;
                while (i10 < arrayList.size()) {
                    ((ImageReceiver) arrayList.get(i10)).setImageBitmapByKey(drawable2, this.key, this.types.get(i10).intValue(), false, ((Integer) arrayList2.get(i10)).intValue());
                    i10++;
                    drawable2 = drawable;
                }
            }
            if (str != null) {
                ImageLoader.this.decrementUseCount(str);
            }
        }

        public void addImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i10, int i11) {
            int iIndexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (iIndexOf >= 0 && Objects.equals(this.imageReceiverArray.get(iIndexOf).getImageKey(), str)) {
                this.imageReceiverGuidsArray.set(iIndexOf, Integer.valueOf(i11));
                return;
            }
            this.imageReceiverArray.add(imageReceiver);
            this.imageReceiverGuidsArray.add(Integer.valueOf(i11));
            this.keys.add(str);
            this.filters.add(str2);
            this.types.add(Integer.valueOf(i10));
            ImageLoader.this.imageLoadingByTag.put(imageReceiver.getTag(i10), this);
        }

        public void changePriority(int i10) {
            TLRPC.Document document;
            SecureDocument secureDocument;
            Object obj;
            SecureDocument secureDocument2;
            SecureDocument secureDocument3;
            ?? r10;
            ?? r11;
            ?? r12;
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                if (tL_fileLocationToBeDeprecated != null) {
                    r10 = this.ext;
                    r11 = tL_fileLocationToBeDeprecated;
                    document = null;
                    secureDocument = null;
                    r12 = 0;
                } else {
                    TLRPC.Document document2 = imageLocation.document;
                    if (document2 != null) {
                        document = document2;
                        secureDocument = null;
                    } else {
                        SecureDocument secureDocument4 = imageLocation.secureDocument;
                        if (secureDocument4 != null) {
                            secureDocument = secureDocument4;
                            document = null;
                            secureDocument3 = null;
                            secureDocument2 = secureDocument3;
                            obj = secureDocument3;
                        } else {
                            WebFile webFile = imageLocation.webFile;
                            if (webFile != null) {
                                obj = webFile;
                                document = null;
                                secureDocument = null;
                                secureDocument2 = null;
                            } else {
                                document = null;
                                secureDocument = null;
                            }
                        }
                        r10 = secureDocument2;
                        r12 = obj;
                        r11 = secureDocument2;
                    }
                    secureDocument3 = secureDocument;
                    secureDocument2 = secureDocument3;
                    obj = secureDocument3;
                    r10 = secureDocument2;
                    r12 = obj;
                    r11 = secureDocument2;
                }
                FileLoader.getInstance(this.currentAccount).changePriority(i10, document, secureDocument, r12, r11, r10, null);
            }
        }

        public void removeImageReceiver(ImageReceiver imageReceiver) {
            int iIntValue = this.type;
            int i10 = 0;
            while (i10 < this.imageReceiverArray.size()) {
                ImageReceiver imageReceiver2 = this.imageReceiverArray.get(i10);
                if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                    this.imageReceiverArray.remove(i10);
                    this.imageReceiverGuidsArray.remove(i10);
                    this.keys.remove(i10);
                    this.filters.remove(i10);
                    iIntValue = this.types.remove(i10).intValue();
                    if (imageReceiver2 != null) {
                        ImageLoader.this.imageLoadingByTag.remove(imageReceiver2.getTag(iIntValue));
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
                    if (iIntValue == 1) {
                        ImageLoader.this.cacheThumbOutQueue.cancelRunnable(this.cacheTask);
                    } else {
                        ne.c cVar = ImageLoader.this.cacheOutQueue;
                        CacheOutTask cacheOutTask = this.cacheTask;
                        if (cacheOutTask == null) {
                            cVar.getClass();
                        } else {
                            cVar.f18519a.remove(cacheOutTask);
                        }
                        ne.c cVar2 = ImageLoader.this.cacheOutQueue;
                        Runnable runnable = this.runningTask;
                        if (runnable == null) {
                            cVar2.getClass();
                        } else {
                            cVar2.f18519a.remove(runnable);
                        }
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

        public void replaceImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i10, int i11) {
            int iIndexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (iIndexOf == -1) {
                return;
            }
            if (this.types.get(iIndexOf).intValue() != i10) {
                ArrayList<ImageReceiver> arrayList = this.imageReceiverArray;
                iIndexOf = arrayList.subList(iIndexOf + 1, arrayList.size()).indexOf(imageReceiver);
                if (iIndexOf == -1) {
                    return;
                }
            }
            this.imageReceiverGuidsArray.set(iIndexOf, Integer.valueOf(i11));
            this.keys.set(iIndexOf, str);
            this.filters.set(iIndexOf, str2);
        }

        public void setImageAndClear(Drawable drawable, String str) {
            CacheImage cacheImage;
            if (drawable != null) {
                cacheImage = this;
                AndroidUtilities.runOnUIThread(new c5(cacheImage, drawable, new ArrayList(this.imageReceiverArray), new ArrayList(this.imageReceiverGuidsArray), str, 0));
            } else {
                cacheImage = this;
            }
            for (int i10 = 0; i10 < cacheImage.imageReceiverArray.size(); i10++) {
                ImageLoader.this.imageLoadingByTag.remove(cacheImage.imageReceiverArray.get(i10).getTag(cacheImage.type));
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

        public void setImageReceiverGuid(ImageReceiver imageReceiver, int i10) {
            int iIndexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (iIndexOf == -1) {
                return;
            }
            this.imageReceiverGuidsArray.set(iIndexOf, Integer.valueOf(i10));
        }
    }

    public class CacheOutTask implements Runnable {
        private CacheImage cacheImage;
        private boolean isCancelled;
        private Thread runningThread;
        private final Object sync = new Object();

        public CacheOutTask(CacheImage cacheImage) {
            this.cacheImage = cacheImage;
        }

        private Bitmap applyWallpaperSetting(Bitmap bitmap, TLRPC.WallPaper wallPaper) {
            int patternColor;
            if (!wallPaper.pattern || wallPaper.settings == null) {
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                return (wallPaperSettings == null || !wallPaperSettings.blur) ? bitmap : Utilities.blurWallpaper(bitmap);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper.settings;
            boolean z10 = true;
            if (wallPaperSettings2.second_background_color == 0) {
                patternColor = AndroidUtilities.getPatternColor(wallPaperSettings2.background_color);
                canvas.drawColor(i0.b.k(wallPaper.settings.background_color, 255));
            } else if (wallPaperSettings2.third_background_color == 0) {
                int iK = i0.b.k(wallPaperSettings2.background_color, 255);
                int iK2 = i0.b.k(wallPaper.settings.second_background_color, 255);
                int averageColor = AndroidUtilities.getAverageColor(iK, iK2);
                GradientDrawable gradientDrawable = new GradientDrawable(org.telegram.ui.Components.m9.d(wallPaper.settings.rotation), new int[]{iK, iK2});
                gradientDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                gradientDrawable.draw(canvas);
                patternColor = averageColor;
            } else {
                int iK3 = i0.b.k(wallPaperSettings2.background_color, 255);
                int iK4 = i0.b.k(wallPaper.settings.second_background_color, 255);
                int iK5 = i0.b.k(wallPaper.settings.third_background_color, 255);
                int i10 = wallPaper.settings.fourth_background_color;
                int iK6 = i10 == 0 ? 0 : i0.b.k(i10, 255);
                int iG = nb0.g(iK3, iK4, iK5, iK6);
                nb0 nb0Var = new nb0();
                nb0Var.n(iK3, iK4, iK5, iK6);
                nb0Var.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                nb0Var.t(bitmap, wallPaper.settings.intensity);
                nb0Var.draw(canvas);
                patternColor = iG;
                z10 = false;
            }
            if (z10) {
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((wallPaper.settings.intensity / 100.0f) * 255.0f));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            return bitmapCreateBitmap;
        }

        public void lambda$onPostExecute$0(Drawable drawable, String str) {
            this.cacheImage.setImageAndClear(drawable, str);
        }

        public void lambda$onPostExecute$1(Drawable drawable) {
            Drawable drawable2;
            String str;
            BitmapDrawable bitmapDrawable;
            Drawable drawable3;
            boolean z10 = false;
            if (drawable instanceof oi0) {
                oi0 oi0Var = (oi0) drawable;
                Drawable drawable4 = (Drawable) ImageLoader.this.lottieMemCache.get(this.cacheImage.key);
                if (drawable4 == null) {
                    ImageLoader.this.lottieMemCache.put(this.cacheImage.key, oi0Var);
                    drawable3 = oi0Var;
                } else {
                    oi0Var.A(false);
                    drawable3 = drawable4;
                }
                ImageLoader.this.incrementUseCount(this.cacheImage.key);
                str = this.cacheImage.key;
                drawable2 = drawable3;
            } else if (drawable instanceof org.telegram.ui.Components.x5) {
                org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
                if (x5Var.f34481j0) {
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
                } else {
                    str = null;
                    drawable2 = drawable;
                }
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
                } else {
                    str = null;
                    drawable2 = drawable;
                }
            } else {
                drawable2 = null;
                str = null;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new f0(this, drawable2, str, 2), this.cacheImage.priority);
        }

        private void loadLastFrame(oi0 oi0Var, int i10, int i11, boolean z10, boolean z11) {
            Bitmap bitmapCreateBitmap;
            Canvas canvas;
            Drawable bitmapDrawable;
            if (z10 && z11) {
                float f10 = i10 * 1.2f;
                float f11 = i11 * 1.2f;
                bitmapCreateBitmap = Bitmap.createBitmap((int) f10, (int) f11, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(2.0f, 2.0f, f10 / 2.0f, f11 / 2.0f);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bitmapCreateBitmap);
            }
            oi0Var.b();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(oi0Var.f31307b, oi0Var.f31309c, Bitmap.Config.ARGB_8888);
            oi0Var.A0 = z10 ? oi0Var.f31312e[0] - 1 : 0;
            oi0Var.a(bitmapCreateBitmap2);
            oi0Var.c();
            canvas.save();
            if (!z10 || !z11) {
                canvas.scale(bitmapCreateBitmap2.getWidth() / i10, bitmapCreateBitmap2.getHeight() / i11, i10 / 2.0f, i11 / 2.0f);
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            if (z10 && z11) {
                canvas.drawBitmap(bitmapCreateBitmap2, (bitmapCreateBitmap.getWidth() - bitmapCreateBitmap2.getWidth()) / 2.0f, (bitmapCreateBitmap.getHeight() - bitmapCreateBitmap2.getHeight()) / 2.0f, paint);
                bitmapDrawable = new ImageReceiver.ReactionLastFrame(bitmapCreateBitmap);
            } else {
                canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            }
            oi0Var.A(false);
            bitmapCreateBitmap2.recycle();
            onPostExecute(bitmapDrawable);
        }

        private void onPostExecute(Drawable drawable) {
            AndroidUtilities.runOnUIThread(new e3(3, this, drawable));
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
        public void run() throws Throwable {
            z01 z01Var;
            SvgHelper.SvgResult svgBitmap;
            SvgHelper.SvgResult svgResult;
            Bitmap bitmapApplyWallpaperSetting;
            byte[] bArr;
            ?? r10;
            String str;
            Long lValueOf;
            boolean z10;
            boolean z11;
            Long l10;
            boolean z12;
            float f10;
            Bitmap bitmap;
            char c10;
            float f11;
            Bitmap bitmap2;
            float f12;
            Bitmap bitmap3;
            boolean z13;
            boolean z14;
            Bitmap bitmap4;
            int i10;
            ?? r14;
            ?? CreateScaledBitmap;
            float f13;
            boolean z15;
            boolean z16;
            ?? r11;
            ?? r12;
            ?? r13;
            ?? r15;
            boolean z17;
            float f14;
            FileInputStream fileInputStream;
            ?? r16;
            ?? r17;
            char c11;
            Bitmap.Config config;
            ?? r18;
            boolean z18;
            Bitmap bitmapCreateScaledBitmap;
            int length;
            byte[] bArr2;
            boolean z19;
            int i11;
            int i12;
            Bitmap bitmapDecodeByteArray;
            ?? ApplyWallpaperSetting;
            CacheImage cacheImage;
            ExtendedBitmapDrawable extendedBitmapDrawable;
            BitmapDrawable bitmapDrawable;
            String str2;
            Object obj;
            boolean z20;
            ?? r19;
            boolean z21;
            ?? r20;
            ?? r21;
            ?? r22;
            ?? r23;
            char c12;
            ?? r24;
            float width;
            float height;
            boolean z22;
            ?? CreateScaledBitmap2;
            float f15;
            Bitmap bitmapCreateScaledBitmap2;
            ?? r25;
            Bitmap bitmapCreateScaledBitmap3;
            ?? r26;
            int length2;
            byte[] bArr3;
            boolean z23;
            int i13;
            FileInputStream fileInputStream2;
            ?? IntValue;
            ?? IntValue2;
            ?? r110;
            Rect rect;
            String str3;
            Bitmap thumbnail;
            Bitmap thumbnail2;
            CacheImage cacheImage2;
            Bitmap bitmapDecodeStream;
            int i14;
            boolean z24;
            Bitmap bitmap5;
            boolean z25;
            int i15;
            Long lValueOf2;
            boolean z26;
            String strSubstring;
            byte[] bArr4;
            boolean z27;
            boolean z28;
            boolean z29;
            boolean z30;
            boolean z31;
            Bitmap frameAtTime;
            ge.i iVar;
            boolean z32;
            org.telegram.ui.Components.x5 x5Var;
            String str4;
            int i16;
            int i17;
            boolean z33;
            TLRPC.Document document;
            int i18;
            int i19;
            int i20;
            CacheImage cacheImage3;
            TLRPC.Document document2;
            boolean z34;
            String str5;
            String[] strArrSplit;
            int i21;
            int i22;
            String str6;
            boolean z35;
            boolean z36;
            boolean z37;
            boolean zContains;
            int i23;
            boolean z38;
            int i24;
            ?? r27;
            Throwable th;
            ?? r28;
            RandomAccessFile randomAccessFile;
            boolean z39;
            ge.i iVar2;
            int i25;
            oi0 oi0Var;
            int i26;
            oi0 hv0Var;
            int i27;
            char c13;
            boolean zContains2;
            int i28;
            String str7;
            int i29;
            synchronized (this.sync) {
                try {
                    this.runningThread = Thread.currentThread();
                    Thread.interrupted();
                    if (this.isCancelled) {
                        return;
                    }
                    CacheImage cacheImage4 = this.cacheImage;
                    ImageLocation imageLocation = cacheImage4.imageLocation;
                    TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        Bitmap strippedPhotoBitmap = ImageLoader.getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) photoSize).bytes, "b");
                        onPostExecute(strippedPhotoBitmap != null ? new BitmapDrawable(strippedPhotoBitmap) : null);
                        return;
                    }
                    int i30 = cacheImage4.imageType;
                    if (i30 == 5) {
                        try {
                            CacheImage cacheImage5 = this.cacheImage;
                            z01Var = new z01(cacheImage5.finalFilePath, (DocumentObject.ThemeDocument) cacheImage5.imageLocation.document);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            z01Var = null;
                        }
                        onPostExecute(z01Var);
                        return;
                    }
                    if (i30 == 3 || i30 == 4) {
                        Point point = AndroidUtilities.displaySize;
                        int i31 = point.x;
                        int i32 = point.y;
                        String str8 = cacheImage4.filter;
                        if (str8 != null) {
                            String[] strArrSplit2 = str8.split("_");
                            if (strArrSplit2.length >= 2) {
                                float f16 = Float.parseFloat(strArrSplit2[0]);
                                float f17 = Float.parseFloat(strArrSplit2[1]);
                                float f18 = AndroidUtilities.density;
                                int i33 = (int) (f17 * f18);
                                i31 = (int) (f16 * f18);
                                i32 = i33;
                            }
                        }
                        try {
                            CacheImage cacheImage6 = this.cacheImage;
                            svgBitmap = SvgHelper.getSvgBitmap(cacheImage6.finalFilePath, i31, i32, cacheImage6.imageType == 4);
                            try {
                                bitmapApplyWallpaperSetting = svgBitmap.getBitmap();
                                svgResult = svgBitmap;
                            } catch (Throwable th3) {
                                th = th3;
                                FileLog.e(th);
                                svgResult = svgBitmap;
                                bitmapApplyWallpaperSetting = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            svgBitmap = null;
                        }
                        if (bitmapApplyWallpaperSetting != null && !TextUtils.isEmpty(this.cacheImage.filter) && this.cacheImage.filter.contains("wallpaper")) {
                            Object obj2 = this.cacheImage.parentObject;
                            if (obj2 instanceof TLRPC.WallPaper) {
                                bitmapApplyWallpaperSetting = applyWallpaperSetting(bitmapApplyWallpaperSetting, (TLRPC.WallPaper) obj2);
                            }
                        }
                        onPostExecute(mf.b.a(bitmapApplyWallpaperSetting, svgResult != null ? svgResult.getGiftPatternPositions() : null));
                        return;
                    }
                    if (i30 == 1) {
                        int iMin = Math.min(512, AndroidUtilities.dp(170.6f));
                        int iMin2 = Math.min(512, AndroidUtilities.dp(170.6f));
                        String str9 = this.cacheImage.filter;
                        if (str9 != null) {
                            String[] strArrSplit3 = str9.split("_");
                            if (strArrSplit3.length >= 2) {
                                float f19 = Float.parseFloat(strArrSplit3[0]);
                                float f20 = Float.parseFloat(strArrSplit3[1]);
                                int iMin3 = Math.min(512, (int) (AndroidUtilities.density * f19));
                                int iMin4 = Math.min(512, (int) (AndroidUtilities.density * f20));
                                if (f19 > 90.0f || f20 > 90.0f || this.cacheImage.filter.contains("nolimit")) {
                                    iMin2 = iMin4;
                                    i29 = iMin3;
                                    z38 = false;
                                } else {
                                    int iMin5 = Math.min(iMin3, 160);
                                    iMin2 = Math.min(iMin4, 160);
                                    z38 = true;
                                    i29 = iMin5;
                                }
                                z37 = (strArrSplit3.length >= 3 && "pcache".equals(strArrSplit3[2])) || this.cacheImage.filter.contains("pcache") || !(this.cacheImage.filter.contains("nolimit") || SharedConfig.getDevicePerformanceClass() == 2);
                                zContains = this.cacheImage.filter.contains("lastframe");
                                c13 = 4;
                                zContains2 = this.cacheImage.filter.contains("lastreactframe");
                                if (zContains2) {
                                    zContains = true;
                                }
                                if (this.cacheImage.filter.contains("firstframe")) {
                                    z35 = true;
                                    i28 = i29;
                                } else {
                                    z35 = false;
                                    i28 = i29;
                                }
                            } else {
                                c13 = 4;
                                z38 = false;
                                z35 = false;
                                zContains2 = false;
                                z37 = false;
                                zContains = false;
                                i28 = iMin;
                            }
                            if (strArrSplit3.length >= 3) {
                                if (!"nr".equals(strArrSplit3[2])) {
                                    if ("nrs".equals(strArrSplit3[2])) {
                                        str7 = null;
                                        i23 = 3;
                                    } else {
                                        str7 = "dice".equals(strArrSplit3[2]) ? strArrSplit3[3] : null;
                                    }
                                    if (strArrSplit3.length < 5) {
                                        i24 = 0;
                                    } else if ("c1".equals(strArrSplit3[c13])) {
                                        i24 = 12;
                                    } else if ("c2".equals(strArrSplit3[c13])) {
                                        i24 = 3;
                                    } else if ("c3".equals(strArrSplit3[c13])) {
                                        i24 = 4;
                                    } else if ("c4".equals(strArrSplit3[c13])) {
                                        i24 = 5;
                                    } else if ("c5".equals(strArrSplit3[c13])) {
                                        i24 = 6;
                                    } else {
                                        i24 = 0;
                                    }
                                    i21 = iMin2;
                                    str6 = str7;
                                    z36 = zContains2;
                                    r27 = i28;
                                    i22 = i28;
                                }
                                i23 = 2;
                                if (strArrSplit3.length < 5) {
                                    i24 = 0;
                                } else if ("c1".equals(strArrSplit3[c13])) {
                                    i24 = 12;
                                } else if ("c2".equals(strArrSplit3[c13])) {
                                    i24 = 3;
                                } else if ("c3".equals(strArrSplit3[c13])) {
                                    i24 = 4;
                                } else if ("c4".equals(strArrSplit3[c13])) {
                                    i24 = 5;
                                } else if ("c5".equals(strArrSplit3[c13])) {
                                    i24 = 6;
                                } else {
                                    i24 = 0;
                                }
                                i21 = iMin2;
                                str6 = str7;
                                z36 = zContains2;
                                r27 = i28;
                                i22 = i28;
                            }
                            str7 = null;
                            i23 = 1;
                            if (strArrSplit3.length < 5) {
                                i24 = 0;
                            } else if ("c1".equals(strArrSplit3[c13])) {
                                i24 = 12;
                            } else if ("c2".equals(strArrSplit3[c13])) {
                                i24 = 3;
                            } else if ("c3".equals(strArrSplit3[c13])) {
                                i24 = 4;
                            } else if ("c4".equals(strArrSplit3[c13])) {
                                i24 = 5;
                            } else if ("c5".equals(strArrSplit3[c13])) {
                                i24 = 6;
                            } else {
                                i24 = 0;
                            }
                            i21 = iMin2;
                            str6 = str7;
                            z36 = zContains2;
                            r27 = i28;
                            i22 = i28;
                        } else {
                            i21 = iMin2;
                            i22 = iMin;
                            str6 = null;
                            z35 = false;
                            z36 = false;
                            z37 = false;
                            zContains = false;
                            i23 = 1;
                            z38 = false;
                            i24 = 0;
                        }
                        if (str6 != null) {
                            r27 = iMin;
                            hv0Var = "🎰".equals(str6) ? new hv0(str6, i22, i21) : new ki0(str6, i22, i21);
                            i25 = i21;
                            i27 = i22;
                        } else {
                            r27 = iMin;
                            File file = this.cacheImage.finalFilePath;
                            try {
                                try {
                                    randomAccessFile = new RandomAccessFile(this.cacheImage.finalFilePath, "r");
                                    try {
                                        byte[] bArr5 = this.cacheImage.type == 1 ? ImageLoader.headerThumb : ImageLoader.header;
                                        randomAccessFile.readFully(bArr5, 0, 2);
                                        z39 = bArr5[0] == 31 && bArr5[1] == -117;
                                        try {
                                            randomAccessFile.close();
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        FileLog.e((Throwable) e, false);
                                        if (randomAccessFile != null) {
                                            try {
                                                randomAccessFile.close();
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                            }
                                        }
                                        z39 = false;
                                    }
                                } catch (Throwable th5) {
                                    r28 = r27;
                                    th = th5;
                                    if (r28 != 0) {
                                        throw th;
                                    }
                                    try {
                                        r28.close();
                                        throw th;
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                        throw th;
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                randomAccessFile = null;
                            } catch (Throwable th6) {
                                th = th6;
                                r28 = 0;
                                if (r28 != 0) {
                                    throw th;
                                }
                                r28.close();
                                throw th;
                            }
                            if (zContains || z35) {
                                z37 = false;
                            }
                            if (z37 || zContains || z35) {
                                ge.i iVar3 = new ge.i();
                                if (zContains || z35) {
                                    iVar3.f6887c = true;
                                } else {
                                    String str10 = this.cacheImage.filter;
                                    if (str10 != null && str10.contains("compress")) {
                                        iVar3.f6885a = 60;
                                    }
                                    String str11 = this.cacheImage.filter;
                                    if (str11 != null && str11.contains("flbk")) {
                                        iVar3.f6886b = true;
                                    }
                                }
                                iVar2 = iVar3;
                            } else {
                                iVar2 = null;
                            }
                            ImageLocation imageLocation2 = this.cacheImage.imageLocation;
                            boolean z40 = imageLocation2 != null && MessageObject.isTextColorEmoji(imageLocation2.document);
                            if (z39) {
                                File file2 = this.cacheImage.finalFilePath;
                                i25 = i21;
                                int i34 = i22;
                                oi0Var = new oi0(file2, ImageLoader.decompressGzip(file2), i34 == true ? 1 : 0, i25, iVar2, z38, i24, z40);
                                i26 = i34;
                            } else {
                                i25 = i21;
                                int i35 = i22;
                                oi0Var = new oi0(this.cacheImage.finalFilePath, null, i35 == true ? 1 : 0, i25, iVar2, z38, i24, z40);
                                i26 = i35;
                            }
                            hv0Var = oi0Var;
                            i27 = i26;
                        }
                        if (zContains || z35) {
                            loadLastFrame(hv0Var, i25, i27 == true ? 1 : 0, zContains, z36);
                            return;
                        } else {
                            hv0Var.I(i23);
                            onPostExecute(hv0Var);
                            return;
                        }
                    }
                    if (i30 == 2) {
                        long j10 = imageLocation.videoSeekTo;
                        String str12 = cacheImage4.filter;
                        if (str12 != null) {
                            String[] strArrSplit4 = str12.split("_");
                            if (strArrSplit4.length >= 2) {
                                float f21 = Float.parseFloat(strArrSplit4[0]);
                                float f22 = Float.parseFloat(strArrSplit4[1]);
                                if (f21 > 90.0f || f22 > 90.0f || this.cacheImage.filter.contains("nolimit")) {
                                    z27 = false;
                                } else {
                                    z27 = true;
                                }
                            } else {
                                z27 = false;
                            }
                            boolean z41 = false;
                            z28 = false;
                            z29 = false;
                            z30 = false;
                            for (int i36 = 0; i36 < strArrSplit4.length; i36++) {
                                if ("pcache".equals(strArrSplit4[i36])) {
                                    z28 = true;
                                }
                                if ("firstframe".equals(strArrSplit4[i36])) {
                                    z41 = true;
                                }
                                if ("nostream".equals(strArrSplit4[i36])) {
                                    z30 = true;
                                }
                                if ("pframe".equals(strArrSplit4[i36])) {
                                    z29 = true;
                                }
                            }
                            z31 = z41;
                            if (z41) {
                                z30 = true;
                            }
                        } else {
                            z27 = false;
                            z28 = false;
                            z29 = false;
                            z30 = false;
                            z31 = false;
                        }
                        if (z29) {
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                mediaMetadataRetriever.setDataSource(this.cacheImage.finalFilePath.getAbsolutePath());
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(2L);
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception e14) {
                                    e = e14;
                                    e.printStackTrace();
                                }
                            } catch (Exception e15) {
                                e = e15;
                                frameAtTime = null;
                            }
                            Thread.interrupted();
                            if (frameAtTime == null) {
                                onPostExecute(null);
                                return;
                            } else {
                                onPostExecute(new BitmapDrawable(frameAtTime));
                                return;
                            }
                        }
                        if (!z28 || z31) {
                            iVar = null;
                        } else {
                            ge.i iVar4 = new ge.i();
                            String str13 = this.cacheImage.filter;
                            if (str13 != null && str13.contains("compress")) {
                                iVar4.f6885a = 60;
                            }
                            iVar = iVar4;
                        }
                        if (ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter) || "g".equals(this.cacheImage.filter) || "gl".equals(this.cacheImage.filter)) {
                            TLRPC.Document document3 = this.cacheImage.imageLocation.document;
                            if ((document3 instanceof TLRPC.TL_documentEncrypted) || z28) {
                                z32 = z31;
                                str4 = this.cacheImage.filter;
                                if (str4 != null) {
                                    strArrSplit = str4.split("_");
                                    if (strArrSplit.length >= 2) {
                                        float f23 = Float.parseFloat(strArrSplit[0]);
                                        float f24 = Float.parseFloat(strArrSplit[1]);
                                        float f25 = AndroidUtilities.density;
                                        i17 = (int) (f24 * f25);
                                        i16 = (int) (f23 * f25);
                                    } else {
                                        i16 = 0;
                                        i17 = 0;
                                    }
                                } else {
                                    i16 = 0;
                                    i17 = 0;
                                }
                                if (!z32 || ((str5 = this.cacheImage.filter) != null && ("d".equals(str5) || this.cacheImage.filter.contains("_d")))) {
                                    z33 = true;
                                } else {
                                    z33 = false;
                                }
                                if (z30) {
                                    document = null;
                                } else {
                                    document = this.cacheImage.imageLocation.document;
                                }
                                if (document != null) {
                                    i18 = 1;
                                } else {
                                    i18 = 0;
                                }
                                i19 = this.cacheImage.cacheType;
                                if (i19 > 1) {
                                    i20 = i19;
                                } else {
                                    i20 = i18;
                                }
                                cacheImage3 = this.cacheImage;
                                File file3 = cacheImage3.finalFilePath;
                                int i37 = cacheImage3.priority;
                                if (z30) {
                                    document2 = null;
                                } else {
                                    document2 = cacheImage3.imageLocation.document;
                                }
                                x5Var = new org.telegram.ui.Components.x5(file3, z33, 0L, i37, document2, null, null, j10, cacheImage3.currentAccount, false, i16, i17, iVar, i20, true);
                                if (!MessageObject.isWebM(this.cacheImage.imageLocation.document) || MessageObject.isVideoSticker(this.cacheImage.imageLocation.document) || ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter)) {
                                    z34 = true;
                                } else {
                                    z34 = false;
                                }
                                x5Var.f34481j0 = z34;
                                if (z34) {
                                    x5Var.f34469b = false;
                                    x5Var.f34490r0 = true;
                                }
                            } else {
                                TLRPC.Document document4 = com.google.android.recaptcha.internal.a.u(document3) ? this.cacheImage.imageLocation.document : null;
                                CacheImage cacheImage7 = this.cacheImage;
                                long j11 = document4 != null ? cacheImage7.size : cacheImage7.imageLocation.currentSize;
                                int i38 = document4 != null ? 1 : 0;
                                int i39 = this.cacheImage.cacheType;
                                int i40 = i39 > 1 ? i39 : i38;
                                CacheImage cacheImage8 = this.cacheImage;
                                org.telegram.ui.Components.x5 x5Var2 = new org.telegram.ui.Components.x5(cacheImage8.finalFilePath, z31, z30 ? 0L : j11, cacheImage8.priority, z30 ? null : document4, (document4 != null || z30) ? null : cacheImage8.imageLocation, cacheImage8.parentObject, j10, cacheImage8.currentAccount, false, 0, 0, iVar, i40, !"gl".equals(cacheImage8.filter));
                                z32 = z31;
                                boolean z42 = MessageObject.isWebM(document4) || MessageObject.isVideoSticker(document4) || ImageLoader.this.isAnimatedAvatar(this.cacheImage.filter);
                                x5Var2.f34481j0 = z42;
                                if (z42) {
                                    x5Var2.f34469b = false;
                                    x5Var2.f34490r0 = true;
                                }
                                x5Var = x5Var2;
                            }
                        } else {
                            z32 = z31;
                            str4 = this.cacheImage.filter;
                            if (str4 != null) {
                                strArrSplit = str4.split("_");
                                if (strArrSplit.length >= 2) {
                                    float f26 = Float.parseFloat(strArrSplit[0]);
                                    float f27 = Float.parseFloat(strArrSplit[1]);
                                    float f28 = AndroidUtilities.density;
                                    i17 = (int) (f27 * f28);
                                    i16 = (int) (f26 * f28);
                                } else {
                                    i16 = 0;
                                    i17 = 0;
                                }
                            } else {
                                i16 = 0;
                                i17 = 0;
                            }
                            if (z32) {
                                z33 = true;
                            } else {
                                z33 = true;
                            }
                            if (z30) {
                                document = null;
                            } else {
                                document = this.cacheImage.imageLocation.document;
                            }
                            if (document != null) {
                                i18 = 1;
                            } else {
                                i18 = 0;
                            }
                            i19 = this.cacheImage.cacheType;
                            if (i19 > 1) {
                                i20 = i19;
                            } else {
                                i20 = i18;
                            }
                            cacheImage3 = this.cacheImage;
                            File file4 = cacheImage3.finalFilePath;
                            int i310 = cacheImage3.priority;
                            if (z30) {
                                document2 = null;
                            } else {
                                document2 = cacheImage3.imageLocation.document;
                            }
                            x5Var = new org.telegram.ui.Components.x5(file4, z33, 0L, i310, document2, null, null, j10, cacheImage3.currentAccount, false, i16, i17, iVar, i20, true);
                            if (MessageObject.isWebM(this.cacheImage.imageLocation.document)) {
                                z34 = true;
                            } else {
                                z34 = true;
                            }
                            x5Var.f34481j0 = z34;
                            if (z34) {
                                x5Var.f34469b = false;
                                x5Var.f34490r0 = true;
                            }
                        }
                        if (!z32) {
                            x5Var.A(z27);
                            Thread.interrupted();
                            onPostExecute(x5Var);
                            return;
                        }
                        Bitmap bitmapQ = x5Var.q(0L, false);
                        x5Var.u();
                        Thread.interrupted();
                        if (bitmapQ == null) {
                            onPostExecute(null);
                            return;
                        } else {
                            onPostExecute(new BitmapDrawable(bitmapQ));
                            return;
                        }
                    }
                    File file5 = cacheImage4.finalFilePath;
                    boolean z43 = (cacheImage4.secureDocument == null && (cacheImage4.encryptionKeyPath == null || file5 == null || !file5.getAbsolutePath().endsWith(".enc"))) ? false : true;
                    CacheImage cacheImage9 = this.cacheImage;
                    SecureDocument secureDocument = cacheImage9.secureDocument;
                    if (secureDocument != null) {
                        SecureDocumentKey secureDocumentKey = secureDocument.secureDocumentKey;
                        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
                        if (tL_secureFile == null || (bArr4 = tL_secureFile.file_hash) == null) {
                            bArr = secureDocument.fileHash;
                            r10 = secureDocumentKey;
                        } else {
                            bArr = bArr4;
                            r10 = secureDocumentKey;
                        }
                    } else {
                        bArr = null;
                        r10 = 0;
                    }
                    String str14 = cacheImage9.imageLocation.path;
                    if (str14 == null) {
                        str = null;
                        lValueOf = null;
                        z10 = false;
                        z11 = true;
                    } else {
                        if (str14.startsWith("thumb://")) {
                            int iIndexOf = str14.indexOf(":", 8);
                            if (iIndexOf >= 0) {
                                lValueOf = Long.valueOf(Long.parseLong(str14.substring(8, iIndexOf)));
                                strSubstring = str14.substring(iIndexOf + 1);
                            } else {
                                strSubstring = null;
                                lValueOf = null;
                            }
                            str = strSubstring;
                        } else {
                            if (str14.startsWith("vthumb://")) {
                                int iIndexOf2 = str14.indexOf(":", 9);
                                if (iIndexOf2 >= 0) {
                                    lValueOf2 = Long.valueOf(Long.parseLong(str14.substring(9, iIndexOf2)));
                                    z26 = true;
                                } else {
                                    lValueOf2 = null;
                                    z26 = false;
                                }
                                lValueOf = lValueOf2;
                                z10 = z26;
                                str = null;
                            } else if (str14.startsWith("http")) {
                                str = null;
                                lValueOf = null;
                                z10 = false;
                                z11 = true;
                            } else {
                                str = null;
                                lValueOf = null;
                            }
                            z11 = false;
                        }
                        z10 = false;
                        z11 = false;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 1;
                    boolean z44 = ImageLoader.this.canForce8888;
                    ?? r111 = 1067030938;
                    r111 = 1067030938;
                    r111 = 1067030938;
                    r111 = 1067030938;
                    try {
                        String str15 = this.cacheImage.filter;
                        if (str15 != null) {
                            f10 = 0.0f;
                            try {
                                String[] strArrSplit5 = str15.split("_");
                                if (strArrSplit5.length >= 2) {
                                    f11 = Float.parseFloat(strArrSplit5[0]) * AndroidUtilities.density;
                                    try {
                                        f12 = Float.parseFloat(strArrSplit5[1]) * AndroidUtilities.density;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        str = str;
                                        l10 = lValueOf;
                                        z12 = z10;
                                        bitmap2 = null;
                                        c10 = 0;
                                        f12 = 0.0f;
                                        bitmap3 = bitmap2;
                                    }
                                } else {
                                    f11 = 0.0f;
                                    f12 = 0.0f;
                                }
                                try {
                                    if (this.cacheImage.filter.contains("b2r")) {
                                        c10 = 4;
                                    } else if (this.cacheImage.filter.contains("b2")) {
                                        c10 = 3;
                                    } else if (this.cacheImage.filter.contains("b1")) {
                                        c10 = 2;
                                    } else {
                                        c10 = this.cacheImage.filter.contains("b") ? (char) 1 : (char) 0;
                                    }
                                    try {
                                        boolean zContains3 = this.cacheImage.filter.contains("i");
                                        try {
                                            if (this.cacheImage.filter.contains("f")) {
                                                z44 = true;
                                            } else if (this.cacheImage.filter.contains("F")) {
                                                z44 = z44;
                                                z44 = false;
                                            }
                                            z44 = z44;
                                            if (f11 == 0.0f || f12 == 0.0f) {
                                                str = str;
                                                l10 = lValueOf;
                                                z13 = zContains3;
                                                z12 = z10;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                try {
                                                    try {
                                                        if (lValueOf == null || str != null) {
                                                            str = str;
                                                            l10 = lValueOf;
                                                            if (r10 != 0) {
                                                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file5, "r");
                                                                int length3 = (int) randomAccessFile2.length();
                                                                byte[] bArr6 = (byte[]) ImageLoader.bytesLocal.get();
                                                                if (bArr6 == null || bArr6.length < length3) {
                                                                    bArr6 = null;
                                                                }
                                                                if (bArr6 == null) {
                                                                    bArr6 = new byte[length3];
                                                                    ImageLoader.bytesLocal.set(bArr6);
                                                                }
                                                                randomAccessFile2.readFully(bArr6, 0, length3);
                                                                randomAccessFile2.close();
                                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr6, 0, length3, (SecureDocumentKey) r10);
                                                                z13 = zContains3;
                                                                z12 = z10;
                                                                boolean z45 = bArr == null || !Arrays.equals(Utilities.computeSHA256(bArr6, 0, (long) length3), bArr);
                                                                int i41 = bArr6[0] & 255;
                                                                int i42 = length3 - i41;
                                                                if (!z45) {
                                                                    BitmapFactory.decodeByteArray(bArr6, i41, i42, options);
                                                                }
                                                            } else {
                                                                z13 = zContains3;
                                                                z12 = z10;
                                                                FileInputStream encryptedFileInputStream = z43 ? new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath) : new FileInputStream(file5);
                                                                BitmapFactory.decodeStream(encryptedFileInputStream, null, options);
                                                                encryptedFileInputStream.close();
                                                            }
                                                        } else {
                                                            if (z10) {
                                                                l10 = lValueOf;
                                                                MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                            } else {
                                                                l10 = lValueOf;
                                                                MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                            }
                                                            z13 = zContains3;
                                                            z12 = z10;
                                                        }
                                                        float f29 = options.outWidth;
                                                        float f30 = options.outHeight;
                                                        float fMin = (f11 < f12 || f29 <= f30) ? Math.min(f29 / f11, f30 / f12) : Math.max(f29 / f11, f30 / f12);
                                                        if (fMin < 1.2f) {
                                                            fMin = 1.0f;
                                                        }
                                                        options.inJustDecodeBounds = false;
                                                        if (fMin <= 1.0f || (f29 <= f11 && f30 <= f12)) {
                                                            options.inSampleSize = (int) fMin;
                                                        } else {
                                                            int i43 = 1;
                                                            while (true) {
                                                                i15 = i43 * 2;
                                                                if (i43 * 4 >= fMin) {
                                                                    break;
                                                                } else {
                                                                    i43 = i15;
                                                                }
                                                            }
                                                            options.inSampleSize = i15;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        z13 = zContains3;
                                                        z12 = z10;
                                                        z25 = z44;
                                                        bitmap4 = null;
                                                        z14 = z25;
                                                        i10 = 1;
                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                        CreateScaledBitmap = bitmap4;
                                                        r14 = z14;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    z25 = z44;
                                                    bitmap4 = null;
                                                    z14 = z25;
                                                    i10 = 1;
                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                    CreateScaledBitmap = bitmap4;
                                                    r14 = z14;
                                                }
                                            }
                                            bitmap5 = null;
                                            z24 = z44;
                                            i10 = 1;
                                            CreateScaledBitmap = bitmap5;
                                            r14 = z24;
                                        } catch (Throwable th10) {
                                            th = th10;
                                            str = str;
                                            l10 = lValueOf;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        str = str;
                                        l10 = lValueOf;
                                        z12 = z10;
                                        bitmap3 = null;
                                        z13 = false;
                                        bitmap4 = bitmap3;
                                        z14 = z44;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    str = str;
                                    l10 = lValueOf;
                                    z12 = z10;
                                    bitmap3 = null;
                                    c10 = 0;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                str = str;
                                l10 = lValueOf;
                                z12 = z10;
                                bitmap = null;
                                c10 = 0;
                                f11 = 0.0f;
                                bitmap2 = bitmap;
                            }
                            f13 = f12;
                            z15 = z13;
                            if (this.cacheImage.type == i10) {
                                try {
                                    ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                    synchronized (this.sync) {
                                        try {
                                            if (this.isCancelled) {
                                                return;
                                            }
                                            if (r10 != 0) {
                                                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file5, "r");
                                                length = (int) randomAccessFile3.length();
                                                bArr2 = (byte[]) ImageLoader.bytesThumbLocal.get();
                                                if (bArr2 != null || bArr2.length < length) {
                                                    bArr2 = null;
                                                }
                                                if (bArr2 == null) {
                                                    bArr2 = new byte[length];
                                                    ImageLoader.bytesThumbLocal.set(bArr2);
                                                }
                                                randomAccessFile3.readFully(bArr2, 0, length);
                                                randomAccessFile3.close();
                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr2, 0, length, (SecureDocumentKey) r10);
                                                z17 = z15;
                                                f14 = 20.0f;
                                                byte[] bArrComputeSHA256 = Utilities.computeSHA256(bArr2, 0, length);
                                                if (bArr == null && Arrays.equals(bArrComputeSHA256, bArr)) {
                                                    z19 = false;
                                                } else {
                                                    z19 = true;
                                                }
                                                i11 = bArr2[0] & 255;
                                                i12 = length - i11;
                                                r16 = CreateScaledBitmap;
                                                if (!z19) {
                                                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, i11, i12, options);
                                                }
                                            } else {
                                                z17 = z15;
                                                f14 = 20.0f;
                                                if (z43) {
                                                    fileInputStream = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                } else {
                                                    fileInputStream = new FileInputStream(file5);
                                                }
                                                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(fileInputStream, null, options);
                                                fileInputStream.close();
                                                r16 = bitmapDecodeStream2;
                                            }
                                            if (r16 == 0) {
                                                if (file5.length() != 0 || this.cacheImage.filter == null) {
                                                    r16 = bitmapDecodeByteArray;
                                                    r16 = bitmapDecodeByteArray;
                                                    file5.delete();
                                                }
                                                r16 = bitmapDecodeByteArray;
                                                z16 = false;
                                                r12 = r16;
                                            } else {
                                                if (this.cacheImage.filter != null) {
                                                    float width2 = r16.getWidth();
                                                    float height2 = r16.getHeight();
                                                    if (f11 != f10 && width2 != f11 && width2 > f11 + f14 && r16 != (bitmapCreateScaledBitmap = Bitmaps.createScaledBitmap(r16, (int) f11, (int) (height2 / (width2 / f11)), true))) {
                                                        r16 = bitmapDecodeByteArray;
                                                        r17 = r16;
                                                        r17 = r16;
                                                        r17 = r16;
                                                        r17 = r16;
                                                        r17 = r16;
                                                        r16.recycle();
                                                        r17 = bitmapCreateScaledBitmap;
                                                    }
                                                }
                                                if (z17) {
                                                    if (Utilities.needInvert(r17) != 0) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    z16 = z18;
                                                } else {
                                                    z16 = false;
                                                }
                                                try {
                                                    if (c10 == 1) {
                                                        if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                                            r12 = r17;
                                                            Utilities.blurBitmap(r17, 3);
                                                            r12 = r17;
                                                        }
                                                    } else if (c10 == 2) {
                                                        if (c10 != 3) {
                                                            c11 = 4;
                                                            if (c10 == 4) {
                                                                r12 = r17;
                                                            }
                                                        } else {
                                                            c11 = 4;
                                                        }
                                                        config = r17.getConfig();
                                                        r12 = r17;
                                                        r18 = r17;
                                                        if (config == Bitmap.Config.ARGB_8888) {
                                                            if (c10 == c11) {
                                                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r17.getWidth(), r17.getHeight(), r17.getConfig());
                                                                ?? canvas = new Canvas(bitmapCreateBitmap);
                                                                canvas.save();
                                                                canvas.scale(1.2f, 1.2f, r17.getWidth() / 2.0f, r17.getHeight() / 2.0f);
                                                                canvas.drawBitmap(r17, 0.0f, 0.0f, null);
                                                                canvas.restore();
                                                                Path path = new Path();
                                                                path.addCircle(r17.getWidth() / 2.0f, r17.getHeight() / 2.0f, Math.min(r17.getWidth(), r17.getHeight()) / 2.0f, Path.Direction.CW);
                                                                canvas.clipPath(path);
                                                                canvas.drawBitmap(r17, 0.0f, 0.0f, null);
                                                                r17.recycle();
                                                                r18 = bitmapCreateBitmap;
                                                            }
                                                            Utilities.blurBitmap(r18, 7);
                                                            Utilities.blurBitmap(r18, 7);
                                                            Utilities.blurBitmap(r18, 7);
                                                            r12 = r18;
                                                        }
                                                    } else if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                                        r12 = r17;
                                                        Utilities.blurBitmap(r17, 1);
                                                        r12 = r17;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    r11 = r17;
                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                    r12 = r11;
                                                }
                                            }
                                            r12 = r17;
                                            r12 = r17;
                                            r12 = r17;
                                            r13 = 0;
                                            r15 = 0;
                                            ApplyWallpaperSetting = r12;
                                        } catch (Throwable th15) {
                                            throw th15;
                                        }
                                    }
                                } catch (Throwable th16) {
                                    th = th16;
                                    z16 = false;
                                    r11 = CreateScaledBitmap;
                                }
                            } else {
                                try {
                                    ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                    synchronized (this.sync) {
                                        try {
                                            if (this.isCancelled) {
                                                return;
                                            }
                                            if (r14 == 0) {
                                                cacheImage2 = this.cacheImage;
                                                if (cacheImage2.filter == null && c10 == 0 && cacheImage2.imageLocation.path == null) {
                                                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                                                } else {
                                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                                }
                                            } else {
                                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                            }
                                            options.inDither = false;
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            if (l10 == null && str == null) {
                                                if (!z12) {
                                                    thumbnail = MediaStore.Images.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                } else if (l10.longValue() == 0) {
                                                    try {
                                                        org.telegram.ui.Components.x5 x5Var3 = new org.telegram.ui.Components.x5(file5, true, 0L, 0, null, null, null, 0L, 0, true);
                                                        Bitmap bitmapQ2 = x5Var3.q(0L, true);
                                                        x5Var3.u();
                                                        CreateScaledBitmap = bitmapQ2;
                                                        r111 = x5Var3;
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        file5 = file5;
                                                        r23 = 0;
                                                        r22 = CreateScaledBitmap;
                                                        z21 = false;
                                                        r19 = 0;
                                                        r21 = r23;
                                                        r20 = r22;
                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                        z16 = z21;
                                                        r15 = r19;
                                                        r13 = r21;
                                                        ApplyWallpaperSetting = r20;
                                                        Thread.interrupted();
                                                        if (BuildVars.LOGS_ENABLED) {
                                                            StringBuilder sb2 = new StringBuilder("Image Loader image is empty = ");
                                                            if (ApplyWallpaperSetting == 0) {
                                                                z20 = true;
                                                            } else {
                                                                z20 = false;
                                                            }
                                                            sb2.append(z20);
                                                            sb2.append(" ");
                                                            sb2.append(file5);
                                                            FileLog.e(sb2.toString());
                                                        }
                                                        if (ApplyWallpaperSetting != 0) {
                                                            obj = this.cacheImage.parentObject;
                                                            if (obj instanceof TLRPC.WallPaper) {
                                                                ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                            }
                                                        }
                                                        cacheImage = this.cacheImage;
                                                        if (cacheImage == null) {
                                                            if (ApplyWallpaperSetting != 0) {
                                                                extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                            } else {
                                                                extendedBitmapDrawable = null;
                                                            }
                                                            onPostExecute(extendedBitmapDrawable);
                                                            return;
                                                        }
                                                        if (ApplyWallpaperSetting != 0) {
                                                            extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                        } else {
                                                            extendedBitmapDrawable = null;
                                                        }
                                                        onPostExecute(extendedBitmapDrawable);
                                                        return;
                                                        if (ApplyWallpaperSetting != 0) {
                                                            bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                        } else {
                                                            bitmapDrawable = null;
                                                        }
                                                        onPostExecute(bitmapDrawable);
                                                    }
                                                } else {
                                                    thumbnail2 = MediaStore.Video.Thumbnails.getThumbnail(ApplicationLoader.applicationContext.getContentResolver(), l10.longValue(), 1, options);
                                                }
                                                if (CreateScaledBitmap == 0) {
                                                    if (CreateScaledBitmap == 0) {
                                                        if (r10 != 0) {
                                                            fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        } else if (z43) {
                                                            fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        } else {
                                                            fileInputStream2 = new FileInputStream(file5);
                                                        }
                                                        IntValue = this.cacheImage;
                                                        IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                                        if (IntValue2 == 0) {
                                                            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                            IntValue2 = ((Integer) imageOrientation.first).intValue();
                                                            IntValue = ((Integer) imageOrientation.second).intValue();
                                                            if (r10 == 0) {
                                                                r14 = CreateScaledBitmap;
                                                                c12 = c10;
                                                                fileInputStream2.close();
                                                                r110 = r14;
                                                                if (r10 != 0) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                    r110 = r14;
                                                                } else if (z43) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                    r110 = r14;
                                                                }
                                                            } else if (this.cacheImage.encryptionKeyPath != null) {
                                                                r14 = CreateScaledBitmap;
                                                                c12 = c10;
                                                                fileInputStream2.close();
                                                                r110 = r14;
                                                                if (r10 != 0) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                    r110 = r14;
                                                                } else if (z43) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                    r110 = r14;
                                                                }
                                                            } else {
                                                                r110 = CreateScaledBitmap;
                                                                c12 = c10;
                                                                fileInputStream2.getChannel().position(0L);
                                                            }
                                                            rect = null;
                                                            IntValue = IntValue;
                                                            IntValue2 = IntValue2;
                                                            r14 = r110;
                                                            CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                            fileInputStream2.close();
                                                            CreateScaledBitmap = CreateScaledBitmap;
                                                            r26 = IntValue;
                                                            r10 = IntValue2;
                                                        } else {
                                                            Pair<Integer, Integer> imageOrientation2 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                            IntValue2 = ((Integer) imageOrientation2.first).intValue();
                                                            IntValue = ((Integer) imageOrientation2.second).intValue();
                                                            if (r10 == 0) {
                                                                r14 = CreateScaledBitmap;
                                                                c12 = c10;
                                                                fileInputStream2.close();
                                                                r110 = r14;
                                                                if (r10 != 0) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                    r110 = r14;
                                                                } else if (z43) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                    r110 = r14;
                                                                }
                                                            } else if (this.cacheImage.encryptionKeyPath != null) {
                                                                r14 = CreateScaledBitmap;
                                                                c12 = c10;
                                                                fileInputStream2.close();
                                                                r110 = r14;
                                                                if (r10 != 0) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                    r110 = r14;
                                                                } else if (z43) {
                                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                    r110 = r14;
                                                                }
                                                            } else {
                                                                r110 = CreateScaledBitmap;
                                                                c12 = c10;
                                                                fileInputStream2.getChannel().position(0L);
                                                            }
                                                            rect = null;
                                                            IntValue = IntValue;
                                                            IntValue2 = IntValue2;
                                                            r14 = r110;
                                                            CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                            fileInputStream2.close();
                                                            CreateScaledBitmap = CreateScaledBitmap;
                                                            r26 = IntValue;
                                                            r10 = IntValue2;
                                                        }
                                                    } else {
                                                        c12 = c10;
                                                        r26 = 0;
                                                        r10 = 0;
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                    }
                                                    if (CreateScaledBitmap == 0) {
                                                        RandomAccessFile randomAccessFile4 = new RandomAccessFile(file5, "r");
                                                        r111 = r26;
                                                        length2 = (int) randomAccessFile4.length();
                                                        bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                                        if (bArr3 != null) {
                                                            bArr3 = null;
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        if (bArr3 == null) {
                                                            bArr3 = new byte[length2];
                                                            ImageLoader.bytesLocal.set(bArr3);
                                                        }
                                                        randomAccessFile4.readFully(bArr3, 0, length2);
                                                        randomAccessFile4.close();
                                                        if (r10 != 0) {
                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                                            byte[] bArrComputeSHA257 = Utilities.computeSHA256(bArr3, 0, length2);
                                                            if (bArr == null) {
                                                                z23 = true;
                                                            } else {
                                                                z23 = true;
                                                            }
                                                            i13 = bArr3[0] & 255;
                                                            length2 -= i13;
                                                        } else {
                                                            if (z43) {
                                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                                            }
                                                            z23 = false;
                                                            i13 = 0;
                                                        }
                                                        if (!z23) {
                                                            CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                                        }
                                                    } else {
                                                        r111 = r26;
                                                        r10 = r10;
                                                    }
                                                    r24 = r111;
                                                    r10 = r10;
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                } else {
                                                    CreateScaledBitmap = thumbnail;
                                                    CreateScaledBitmap = thumbnail2;
                                                    c12 = c10;
                                                    r10 = 0;
                                                    r24 = 0;
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                }
                                                if (CreateScaledBitmap == 0) {
                                                    if (this.cacheImage.filter != null) {
                                                        width = CreateScaledBitmap.getWidth();
                                                        height = CreateScaledBitmap.getHeight();
                                                        if (f11 != 0.0f) {
                                                            if (width > height) {
                                                                f15 = height / f13;
                                                                if (f15 > 1.0f) {
                                                                    bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                                } else {
                                                                    r25 = CreateScaledBitmap;
                                                                }
                                                            } else {
                                                                f15 = height / f13;
                                                                if (f15 > 1.0f) {
                                                                    bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                                } else {
                                                                    r25 = CreateScaledBitmap;
                                                                }
                                                            }
                                                            if (CreateScaledBitmap != r25) {
                                                                r25 = bitmapCreateScaledBitmap2;
                                                                r25 = bitmapCreateScaledBitmap3;
                                                                CreateScaledBitmap.recycle();
                                                                CreateScaledBitmap = r25;
                                                            }
                                                        }
                                                        if (CreateScaledBitmap != 0) {
                                                            if (z15) {
                                                                if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                                    CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                                } else {
                                                                    CreateScaledBitmap2 = CreateScaledBitmap;
                                                                }
                                                                if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                                    z22 = true;
                                                                } else {
                                                                    z22 = false;
                                                                }
                                                                if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                                    CreateScaledBitmap2.recycle();
                                                                }
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            CreateScaledBitmap = CreateScaledBitmap;
                                                            if (c12 != 0) {
                                                                CreateScaledBitmap = CreateScaledBitmap;
                                                                height = 80.0f;
                                                                CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                                width = 80.0f;
                                                            }
                                                            if (c12 != 0) {
                                                                Utilities.blurBitmap(CreateScaledBitmap, 3);
                                                            }
                                                        }
                                                    }
                                                    z16 = z22;
                                                    r13 = r10;
                                                    ApplyWallpaperSetting = CreateScaledBitmap;
                                                    r15 = r24;
                                                } else if (z11) {
                                                    file5.delete();
                                                }
                                                z22 = false;
                                                z16 = z22;
                                                r13 = r10;
                                                ApplyWallpaperSetting = CreateScaledBitmap;
                                                r15 = r24;
                                            } else {
                                                if (CreateScaledBitmap == 0) {
                                                    if (CreateScaledBitmap == 0) {
                                                        if (r10 != 0) {
                                                            fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        } else if (z43) {
                                                            fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        } else {
                                                            try {
                                                                fileInputStream2 = new FileInputStream(file5);
                                                            } catch (Throwable th18) {
                                                                th = th18;
                                                                r23 = 0;
                                                                r22 = CreateScaledBitmap;
                                                                z21 = false;
                                                                r19 = 0;
                                                                r21 = r23;
                                                                r20 = r22;
                                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                z16 = z21;
                                                                r15 = r19;
                                                                r13 = r21;
                                                                ApplyWallpaperSetting = r20;
                                                                Thread.interrupted();
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    StringBuilder sb3 = new StringBuilder("Image Loader image is empty = ");
                                                                    if (ApplyWallpaperSetting == 0) {
                                                                        z20 = true;
                                                                    } else {
                                                                        z20 = false;
                                                                    }
                                                                    sb3.append(z20);
                                                                    sb3.append(" ");
                                                                    sb3.append(file5);
                                                                    FileLog.e(sb3.toString());
                                                                }
                                                                if (ApplyWallpaperSetting != 0) {
                                                                    obj = this.cacheImage.parentObject;
                                                                    if (obj instanceof TLRPC.WallPaper) {
                                                                        ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                                    }
                                                                }
                                                                cacheImage = this.cacheImage;
                                                                if (cacheImage == null) {
                                                                    if (ApplyWallpaperSetting != 0) {
                                                                        extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                    } else {
                                                                        extendedBitmapDrawable = null;
                                                                    }
                                                                    onPostExecute(extendedBitmapDrawable);
                                                                    return;
                                                                }
                                                                if (ApplyWallpaperSetting != 0) {
                                                                    extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                } else {
                                                                    extendedBitmapDrawable = null;
                                                                }
                                                                onPostExecute(extendedBitmapDrawable);
                                                                return;
                                                                if (ApplyWallpaperSetting != 0) {
                                                                    bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                                } else {
                                                                    bitmapDrawable = null;
                                                                }
                                                                onPostExecute(bitmapDrawable);
                                                            }
                                                        }
                                                        IntValue = this.cacheImage;
                                                        IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                                        try {
                                                            if (IntValue2 == 0 || ((str3 = IntValue.filter) != null && str3.contains("exif"))) {
                                                                Pair<Integer, Integer> imageOrientation3 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                                IntValue2 = ((Integer) imageOrientation3.first).intValue();
                                                                try {
                                                                    IntValue = ((Integer) imageOrientation3.second).intValue();
                                                                    if (r10 == 0) {
                                                                        try {
                                                                            if (this.cacheImage.encryptionKeyPath != null) {
                                                                                r14 = CreateScaledBitmap;
                                                                                c12 = c10;
                                                                                try {
                                                                                    fileInputStream2.close();
                                                                                    r110 = r14;
                                                                                    if (r10 != 0) {
                                                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                                        r110 = r14;
                                                                                    } else if (z43) {
                                                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                                        r110 = r14;
                                                                                    }
                                                                                } catch (Throwable th19) {
                                                                                    th = th19;
                                                                                    r111 = IntValue;
                                                                                    r10 = IntValue2;
                                                                                    CreateScaledBitmap = r14;
                                                                                    z21 = false;
                                                                                    r21 = r10;
                                                                                    r20 = CreateScaledBitmap;
                                                                                    r19 = r111;
                                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                                    z16 = z21;
                                                                                    r15 = r19;
                                                                                    r13 = r21;
                                                                                    ApplyWallpaperSetting = r20;
                                                                                    Thread.interrupted();
                                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                                        StringBuilder sb4 = new StringBuilder("Image Loader image is empty = ");
                                                                                        if (ApplyWallpaperSetting == 0) {
                                                                                            z20 = true;
                                                                                        } else {
                                                                                            z20 = false;
                                                                                        }
                                                                                        sb4.append(z20);
                                                                                        sb4.append(" ");
                                                                                        sb4.append(file5);
                                                                                        FileLog.e(sb4.toString());
                                                                                    }
                                                                                    if (ApplyWallpaperSetting != 0) {
                                                                                        obj = this.cacheImage.parentObject;
                                                                                        if (obj instanceof TLRPC.WallPaper) {
                                                                                            ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                                                        }
                                                                                    }
                                                                                    cacheImage = this.cacheImage;
                                                                                    if (cacheImage == null) {
                                                                                        if (ApplyWallpaperSetting != 0) {
                                                                                            extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                                        } else {
                                                                                            extendedBitmapDrawable = null;
                                                                                        }
                                                                                        onPostExecute(extendedBitmapDrawable);
                                                                                        return;
                                                                                    }
                                                                                    if (ApplyWallpaperSetting != 0) {
                                                                                        extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                                    } else {
                                                                                        extendedBitmapDrawable = null;
                                                                                    }
                                                                                    onPostExecute(extendedBitmapDrawable);
                                                                                    return;
                                                                                    if (ApplyWallpaperSetting != 0) {
                                                                                        bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                                                    } else {
                                                                                        bitmapDrawable = null;
                                                                                    }
                                                                                    onPostExecute(bitmapDrawable);
                                                                                }
                                                                            } else {
                                                                                r110 = CreateScaledBitmap;
                                                                                c12 = c10;
                                                                                fileInputStream2.getChannel().position(0L);
                                                                            }
                                                                        } catch (Throwable th20) {
                                                                            th = th20;
                                                                            r111 = IntValue;
                                                                            r10 = IntValue2;
                                                                            z21 = false;
                                                                            r21 = r10;
                                                                            r20 = CreateScaledBitmap;
                                                                            r19 = r111;
                                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                            z16 = z21;
                                                                            r15 = r19;
                                                                            r13 = r21;
                                                                            ApplyWallpaperSetting = r20;
                                                                            Thread.interrupted();
                                                                            if (BuildVars.LOGS_ENABLED) {
                                                                                StringBuilder sb5 = new StringBuilder("Image Loader image is empty = ");
                                                                                if (ApplyWallpaperSetting == 0) {
                                                                                    z20 = true;
                                                                                } else {
                                                                                    z20 = false;
                                                                                }
                                                                                sb5.append(z20);
                                                                                sb5.append(" ");
                                                                                sb5.append(file5);
                                                                                FileLog.e(sb5.toString());
                                                                            }
                                                                            if (ApplyWallpaperSetting != 0) {
                                                                                obj = this.cacheImage.parentObject;
                                                                                if (obj instanceof TLRPC.WallPaper) {
                                                                                    ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                                                }
                                                                            }
                                                                            cacheImage = this.cacheImage;
                                                                            if (cacheImage == null) {
                                                                                if (ApplyWallpaperSetting != 0) {
                                                                                    extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                                } else {
                                                                                    extendedBitmapDrawable = null;
                                                                                }
                                                                                onPostExecute(extendedBitmapDrawable);
                                                                                return;
                                                                            }
                                                                            if (ApplyWallpaperSetting != 0) {
                                                                                extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                            } else {
                                                                                extendedBitmapDrawable = null;
                                                                            }
                                                                            onPostExecute(extendedBitmapDrawable);
                                                                            return;
                                                                            if (ApplyWallpaperSetting != 0) {
                                                                                bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                                            } else {
                                                                                bitmapDrawable = null;
                                                                            }
                                                                            onPostExecute(bitmapDrawable);
                                                                        }
                                                                    } else {
                                                                        r14 = CreateScaledBitmap;
                                                                        c12 = c10;
                                                                        fileInputStream2.close();
                                                                        r110 = r14;
                                                                        if (r10 != 0) {
                                                                            fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                            r110 = r14;
                                                                        } else if (z43) {
                                                                            fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                            r110 = r14;
                                                                        }
                                                                    }
                                                                    rect = null;
                                                                    IntValue = IntValue;
                                                                    IntValue2 = IntValue2;
                                                                    r14 = r110;
                                                                } catch (Throwable th21) {
                                                                    th = th21;
                                                                    r23 = IntValue2;
                                                                    r22 = CreateScaledBitmap;
                                                                    z21 = false;
                                                                    r19 = 0;
                                                                    r21 = r23;
                                                                    r20 = r22;
                                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                    z16 = z21;
                                                                    r15 = r19;
                                                                    r13 = r21;
                                                                    ApplyWallpaperSetting = r20;
                                                                    Thread.interrupted();
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                        StringBuilder sb6 = new StringBuilder("Image Loader image is empty = ");
                                                                        if (ApplyWallpaperSetting == 0) {
                                                                            z20 = true;
                                                                        } else {
                                                                            z20 = false;
                                                                        }
                                                                        sb6.append(z20);
                                                                        sb6.append(" ");
                                                                        sb6.append(file5);
                                                                        FileLog.e(sb6.toString());
                                                                    }
                                                                    if (ApplyWallpaperSetting != 0) {
                                                                        obj = this.cacheImage.parentObject;
                                                                        if (obj instanceof TLRPC.WallPaper) {
                                                                            ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                                        }
                                                                    }
                                                                    cacheImage = this.cacheImage;
                                                                    if (cacheImage == null) {
                                                                        if (ApplyWallpaperSetting != 0) {
                                                                            extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                        } else {
                                                                            extendedBitmapDrawable = null;
                                                                        }
                                                                        onPostExecute(extendedBitmapDrawable);
                                                                        return;
                                                                    }
                                                                    if (ApplyWallpaperSetting != 0) {
                                                                        extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                    } else {
                                                                        extendedBitmapDrawable = null;
                                                                    }
                                                                    onPostExecute(extendedBitmapDrawable);
                                                                    return;
                                                                    if (ApplyWallpaperSetting != 0) {
                                                                        bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                                    } else {
                                                                        bitmapDrawable = null;
                                                                    }
                                                                    onPostExecute(bitmapDrawable);
                                                                }
                                                            } else {
                                                                r14 = CreateScaledBitmap;
                                                                c12 = c10;
                                                                rect = null;
                                                                IntValue = 0;
                                                                IntValue2 = 0;
                                                            }
                                                            CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                            try {
                                                                fileInputStream2.close();
                                                                CreateScaledBitmap = CreateScaledBitmap;
                                                                r26 = IntValue;
                                                                r10 = IntValue2;
                                                            } catch (Throwable th22) {
                                                                th = th22;
                                                                r111 = IntValue;
                                                                r10 = IntValue2;
                                                                z21 = false;
                                                                r21 = r10;
                                                                r20 = CreateScaledBitmap;
                                                                r19 = r111;
                                                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                z16 = z21;
                                                                r15 = r19;
                                                                r13 = r21;
                                                                ApplyWallpaperSetting = r20;
                                                                Thread.interrupted();
                                                                if (BuildVars.LOGS_ENABLED) {
                                                                    StringBuilder sb7 = new StringBuilder("Image Loader image is empty = ");
                                                                    if (ApplyWallpaperSetting == 0) {
                                                                        z20 = true;
                                                                    } else {
                                                                        z20 = false;
                                                                    }
                                                                    sb7.append(z20);
                                                                    sb7.append(" ");
                                                                    sb7.append(file5);
                                                                    FileLog.e(sb7.toString());
                                                                }
                                                                if (ApplyWallpaperSetting != 0) {
                                                                    obj = this.cacheImage.parentObject;
                                                                    if (obj instanceof TLRPC.WallPaper) {
                                                                        ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                                    }
                                                                }
                                                                cacheImage = this.cacheImage;
                                                                if (cacheImage == null) {
                                                                    if (ApplyWallpaperSetting != 0) {
                                                                        extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                    } else {
                                                                        extendedBitmapDrawable = null;
                                                                    }
                                                                    onPostExecute(extendedBitmapDrawable);
                                                                    return;
                                                                }
                                                                if (ApplyWallpaperSetting != 0) {
                                                                    extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                } else {
                                                                    extendedBitmapDrawable = null;
                                                                }
                                                                onPostExecute(extendedBitmapDrawable);
                                                                return;
                                                                if (ApplyWallpaperSetting != 0) {
                                                                    bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                                } else {
                                                                    bitmapDrawable = null;
                                                                }
                                                                onPostExecute(bitmapDrawable);
                                                            }
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                        }
                                                    } else {
                                                        c12 = c10;
                                                        r26 = 0;
                                                        r10 = 0;
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                    }
                                                    if (CreateScaledBitmap == 0) {
                                                        try {
                                                            RandomAccessFile randomAccessFile5 = new RandomAccessFile(file5, "r");
                                                            r111 = r26;
                                                            try {
                                                                length2 = (int) randomAccessFile5.length();
                                                                bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                                                if (bArr3 != null || bArr3.length < length2) {
                                                                    bArr3 = null;
                                                                }
                                                                if (bArr3 == null) {
                                                                    bArr3 = new byte[length2];
                                                                    ImageLoader.bytesLocal.set(bArr3);
                                                                }
                                                                randomAccessFile5.readFully(bArr3, 0, length2);
                                                                randomAccessFile5.close();
                                                                try {
                                                                    if (r10 != 0) {
                                                                        EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                                                        byte[] bArrComputeSHA258 = Utilities.computeSHA256(bArr3, 0, length2);
                                                                        if (bArr == null && Arrays.equals(bArrComputeSHA258, bArr)) {
                                                                            z23 = false;
                                                                        } else {
                                                                            z23 = true;
                                                                        }
                                                                        i13 = bArr3[0] & 255;
                                                                        length2 -= i13;
                                                                    } else {
                                                                        if (z43) {
                                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                                                        }
                                                                        z23 = false;
                                                                        i13 = 0;
                                                                    }
                                                                    if (!z23) {
                                                                        CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                                                    }
                                                                } catch (Throwable th24) {
                                                                    th = th24;
                                                                    r10 = r10;
                                                                    r111 = r111;
                                                                    try {
                                                                        FileLog.e(th);
                                                                    } catch (Throwable th25) {
                                                                        th = th25;
                                                                        z21 = false;
                                                                        r21 = r10;
                                                                        r20 = CreateScaledBitmap;
                                                                        r19 = r111;
                                                                        FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                        z16 = z21;
                                                                        r15 = r19;
                                                                        r13 = r21;
                                                                        ApplyWallpaperSetting = r20;
                                                                        Thread.interrupted();
                                                                        if (BuildVars.LOGS_ENABLED) {
                                                                            StringBuilder sb8 = new StringBuilder("Image Loader image is empty = ");
                                                                            if (ApplyWallpaperSetting == 0) {
                                                                                z20 = true;
                                                                            } else {
                                                                                z20 = false;
                                                                            }
                                                                            sb8.append(z20);
                                                                            sb8.append(" ");
                                                                            sb8.append(file5);
                                                                            FileLog.e(sb8.toString());
                                                                        }
                                                                        if (ApplyWallpaperSetting != 0) {
                                                                            obj = this.cacheImage.parentObject;
                                                                            if (obj instanceof TLRPC.WallPaper) {
                                                                                ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                                            }
                                                                        }
                                                                        cacheImage = this.cacheImage;
                                                                        if (cacheImage == null) {
                                                                            if (ApplyWallpaperSetting != 0) {
                                                                                extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                            } else {
                                                                                extendedBitmapDrawable = null;
                                                                            }
                                                                            onPostExecute(extendedBitmapDrawable);
                                                                            return;
                                                                        }
                                                                        if (ApplyWallpaperSetting != 0) {
                                                                            extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                                        } else {
                                                                            extendedBitmapDrawable = null;
                                                                        }
                                                                        onPostExecute(extendedBitmapDrawable);
                                                                        return;
                                                                        if (ApplyWallpaperSetting != 0) {
                                                                            bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                                        } else {
                                                                            bitmapDrawable = null;
                                                                        }
                                                                        onPostExecute(bitmapDrawable);
                                                                    }
                                                                }
                                                            } catch (Throwable th26) {
                                                                th = th26;
                                                                r10 = r10;
                                                                r111 = r111 == true ? 1 : 0;
                                                            }
                                                        } catch (Throwable th27) {
                                                            th = th27;
                                                            r111 = r26;
                                                            r10 = r10;
                                                        }
                                                    } else {
                                                        r111 = r26;
                                                        r10 = r10;
                                                    }
                                                    r24 = r111;
                                                    r10 = r10;
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                } else {
                                                    CreateScaledBitmap = thumbnail;
                                                    CreateScaledBitmap = thumbnail2;
                                                    c12 = c10;
                                                    r10 = 0;
                                                    r24 = 0;
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                }
                                                try {
                                                    if (CreateScaledBitmap == 0) {
                                                        if (this.cacheImage.filter != null) {
                                                            width = CreateScaledBitmap.getWidth();
                                                            height = CreateScaledBitmap.getHeight();
                                                            if (f11 != 0.0f && width != f11 && width > f11 + 20.0f) {
                                                                if (width > height || f11 <= f13) {
                                                                    f15 = height / f13;
                                                                    if (f15 > 1.0f) {
                                                                        bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                                    } else {
                                                                        r25 = CreateScaledBitmap;
                                                                    }
                                                                } else {
                                                                    float f31 = width / f11;
                                                                    if (f31 > 1.0f) {
                                                                        bitmapCreateScaledBitmap3 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) f11, (int) (height / f31), true);
                                                                    } else {
                                                                        r25 = CreateScaledBitmap;
                                                                    }
                                                                }
                                                                if (CreateScaledBitmap != r25) {
                                                                    r25 = bitmapCreateScaledBitmap2;
                                                                    r25 = bitmapCreateScaledBitmap3;
                                                                    CreateScaledBitmap.recycle();
                                                                    CreateScaledBitmap = r25;
                                                                }
                                                            }
                                                            if (CreateScaledBitmap != 0) {
                                                                if (z15) {
                                                                    if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                                        CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                                    } else {
                                                                        CreateScaledBitmap2 = CreateScaledBitmap;
                                                                    }
                                                                    if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                                        z22 = true;
                                                                    } else {
                                                                        z22 = false;
                                                                    }
                                                                    if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                                        try {
                                                                            CreateScaledBitmap2.recycle();
                                                                        } catch (Throwable th28) {
                                                                            th = th28;
                                                                            r19 = r24 == true ? 1 : 0;
                                                                            z21 = z22;
                                                                            r21 = r10;
                                                                            r20 = CreateScaledBitmap;
                                                                            FileLog.e(th, !(th instanceof FileNotFoundException));
                                                                            z16 = z21;
                                                                            r15 = r19;
                                                                            r13 = r21;
                                                                            ApplyWallpaperSetting = r20;
                                                                        }
                                                                    }
                                                                } else {
                                                                    z22 = false;
                                                                }
                                                                CreateScaledBitmap = CreateScaledBitmap;
                                                                if (c12 != 0 && (height > 100.0f || width > 100.0f)) {
                                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                                    height = 80.0f;
                                                                    CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                                    width = 80.0f;
                                                                }
                                                                if (c12 != 0 && height < 100.0f && width < 100.0f && CreateScaledBitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                                                                    Utilities.blurBitmap(CreateScaledBitmap, 3);
                                                                }
                                                            }
                                                        }
                                                        z16 = z22;
                                                        r13 = r10;
                                                        ApplyWallpaperSetting = CreateScaledBitmap;
                                                        r15 = r24;
                                                    } else if (z11 && (file5.length() == 0 || this.cacheImage.filter == null)) {
                                                        file5.delete();
                                                    }
                                                    z22 = false;
                                                    z16 = z22;
                                                    r13 = r10;
                                                    ApplyWallpaperSetting = CreateScaledBitmap;
                                                    r15 = r24;
                                                } catch (Throwable th29) {
                                                    th = th29;
                                                    r111 = r24 == true ? 1 : 0;
                                                    z21 = false;
                                                    r21 = r10;
                                                    r20 = CreateScaledBitmap;
                                                    r19 = r111;
                                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                                    z16 = z21;
                                                    r15 = r19;
                                                    r13 = r21;
                                                    ApplyWallpaperSetting = r20;
                                                    Thread.interrupted();
                                                    if (BuildVars.LOGS_ENABLED) {
                                                        StringBuilder sb9 = new StringBuilder("Image Loader image is empty = ");
                                                        if (ApplyWallpaperSetting == 0) {
                                                            z20 = true;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        sb9.append(z20);
                                                        sb9.append(" ");
                                                        sb9.append(file5);
                                                        FileLog.e(sb9.toString());
                                                    }
                                                    if (ApplyWallpaperSetting != 0) {
                                                        obj = this.cacheImage.parentObject;
                                                        if (obj instanceof TLRPC.WallPaper) {
                                                            ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                                        }
                                                    }
                                                    cacheImage = this.cacheImage;
                                                    if (cacheImage == null) {
                                                        if (ApplyWallpaperSetting != 0) {
                                                            extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                        } else {
                                                            extendedBitmapDrawable = null;
                                                        }
                                                        onPostExecute(extendedBitmapDrawable);
                                                        return;
                                                    }
                                                    if (ApplyWallpaperSetting != 0) {
                                                        extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                                    } else {
                                                        extendedBitmapDrawable = null;
                                                    }
                                                    onPostExecute(extendedBitmapDrawable);
                                                    return;
                                                    if (ApplyWallpaperSetting != 0) {
                                                        bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                                    } else {
                                                        bitmapDrawable = null;
                                                    }
                                                    onPostExecute(bitmapDrawable);
                                                }
                                            }
                                        } catch (Throwable th30) {
                                            throw th30;
                                        }
                                    }
                                } catch (Throwable th31) {
                                    th = th31;
                                }
                            }
                            Thread.interrupted();
                            if (BuildVars.LOGS_ENABLED && z43) {
                                StringBuilder sb10 = new StringBuilder("Image Loader image is empty = ");
                                if (ApplyWallpaperSetting == 0) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                sb10.append(z20);
                                sb10.append(" ");
                                sb10.append(file5);
                                FileLog.e(sb10.toString());
                            }
                            if (ApplyWallpaperSetting != 0 && !TextUtils.isEmpty(this.cacheImage.filter) && this.cacheImage.filter.contains("wallpaper")) {
                                obj = this.cacheImage.parentObject;
                                if (obj instanceof TLRPC.WallPaper) {
                                    ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                }
                            }
                            cacheImage = this.cacheImage;
                            if ((cacheImage == null && (str2 = cacheImage.filter) != null && str2.contains("ignoreOrientation")) || (!z16 && r13 == 0 && r15 == 0)) {
                                if (ApplyWallpaperSetting != 0) {
                                    bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                } else {
                                    bitmapDrawable = null;
                                }
                                onPostExecute(bitmapDrawable);
                            }
                            if (ApplyWallpaperSetting != 0) {
                                extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                            } else {
                                extendedBitmapDrawable = null;
                            }
                            onPostExecute(extendedBitmapDrawable);
                            return;
                        }
                        str = str;
                        l10 = lValueOf;
                        z12 = z10;
                        f10 = 0.0f;
                        if (str != null) {
                            try {
                                options.inJustDecodeBounds = true;
                                options.inPreferredConfig = z44 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                                FileInputStream fileInputStream3 = new FileInputStream(file5);
                                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream3, null, options);
                                try {
                                    fileInputStream3.close();
                                    int i44 = options.outWidth;
                                    int i45 = options.outHeight;
                                    options.inJustDecodeBounds = false;
                                    float fMin2 = (Math.min(i45, i44) / Math.max(66, Math.min(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y))) * 6.0f;
                                    if (fMin2 < 1.0f) {
                                        fMin2 = 1.0f;
                                    }
                                    if (fMin2 > 1.0f) {
                                        int i46 = 1;
                                        while (true) {
                                            i14 = i46 * 2;
                                            if (i46 * 4 > fMin2) {
                                                break;
                                            } else {
                                                i46 = i14;
                                            }
                                        }
                                        options.inSampleSize = i14;
                                    } else {
                                        options.inSampleSize = (int) fMin2;
                                    }
                                } catch (Throwable th32) {
                                    th = th32;
                                    bitmap = bitmapDecodeStream;
                                    c10 = 0;
                                    f11 = 0.0f;
                                    bitmap2 = bitmap;
                                    f12 = 0.0f;
                                    bitmap3 = bitmap2;
                                    z13 = false;
                                    bitmap4 = bitmap3;
                                    z14 = z44;
                                    i10 = 1;
                                    FileLog.e(th, !(th instanceof FileNotFoundException));
                                    CreateScaledBitmap = bitmap4;
                                    r14 = z14;
                                }
                            } catch (Throwable th33) {
                                th = th33;
                                bitmap = null;
                                c10 = 0;
                                f11 = 0.0f;
                                bitmap2 = bitmap;
                                f12 = 0.0f;
                                bitmap3 = bitmap2;
                                z13 = false;
                                bitmap4 = bitmap3;
                                z14 = z44;
                                i10 = 1;
                                FileLog.e(th, !(th instanceof FileNotFoundException));
                                CreateScaledBitmap = bitmap4;
                                r14 = z14;
                                f13 = f12;
                                z15 = z13;
                                if (this.cacheImage.type == i10) {
                                    ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                    synchronized (this.sync) {
                                        if (this.isCancelled) {
                                            return;
                                        }
                                        if (r10 != 0) {
                                            RandomAccessFile randomAccessFile6 = new RandomAccessFile(file5, "r");
                                            length = (int) randomAccessFile6.length();
                                            bArr2 = (byte[]) ImageLoader.bytesThumbLocal.get();
                                            if (bArr2 != null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = null;
                                            }
                                            if (bArr2 == null) {
                                                bArr2 = new byte[length];
                                                ImageLoader.bytesThumbLocal.set(bArr2);
                                            }
                                            randomAccessFile6.readFully(bArr2, 0, length);
                                            randomAccessFile6.close();
                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr2, 0, length, (SecureDocumentKey) r10);
                                            z17 = z15;
                                            f14 = 20.0f;
                                            byte[] bArrComputeSHA259 = Utilities.computeSHA256(bArr2, 0, length);
                                            if (bArr == null) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            i11 = bArr2[0] & 255;
                                            i12 = length - i11;
                                            r16 = CreateScaledBitmap;
                                            if (!z19) {
                                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, i11, i12, options);
                                            }
                                        } else {
                                            z17 = z15;
                                            f14 = 20.0f;
                                            if (z43) {
                                                fileInputStream = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                            } else {
                                                fileInputStream = new FileInputStream(file5);
                                            }
                                            Bitmap bitmapDecodeStream3 = BitmapFactory.decodeStream(fileInputStream, null, options);
                                            fileInputStream.close();
                                            r16 = bitmapDecodeStream3;
                                        }
                                        if (r16 == 0) {
                                            if (file5.length() != 0) {
                                                r16 = bitmapDecodeByteArray;
                                                r16 = bitmapDecodeByteArray;
                                                file5.delete();
                                            } else {
                                                r16 = bitmapDecodeByteArray;
                                                r16 = bitmapDecodeByteArray;
                                                file5.delete();
                                            }
                                            r16 = bitmapDecodeByteArray;
                                            z16 = false;
                                            r12 = r16;
                                        } else {
                                            if (this.cacheImage.filter != null) {
                                                float width3 = r16.getWidth();
                                                float height3 = r16.getHeight();
                                                if (f11 != f10) {
                                                    r16 = bitmapDecodeByteArray;
                                                    r17 = r16;
                                                    r17 = r16;
                                                    r17 = r16;
                                                    r17 = r16;
                                                    r17 = r16;
                                                    r16.recycle();
                                                    r17 = bitmapCreateScaledBitmap;
                                                }
                                            }
                                            if (z17) {
                                                if (Utilities.needInvert(r17) != 0) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                z16 = z18;
                                            } else {
                                                z16 = false;
                                            }
                                            if (c10 == 1) {
                                                if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                                    r12 = r17;
                                                    Utilities.blurBitmap(r17, 3);
                                                    r12 = r17;
                                                }
                                            } else if (c10 == 2) {
                                                if (c10 != 3) {
                                                    c11 = 4;
                                                    if (c10 == 4) {
                                                        r12 = r17;
                                                    }
                                                } else {
                                                    c11 = 4;
                                                }
                                                config = r17.getConfig();
                                                r12 = r17;
                                                r18 = r17;
                                                if (config == Bitmap.Config.ARGB_8888) {
                                                    if (c10 == c11) {
                                                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(r17.getWidth(), r17.getHeight(), r17.getConfig());
                                                        ?? canvas2 = new Canvas(bitmapCreateBitmap2);
                                                        canvas2.save();
                                                        canvas2.scale(1.2f, 1.2f, r17.getWidth() / 2.0f, r17.getHeight() / 2.0f);
                                                        canvas2.drawBitmap(r17, 0.0f, 0.0f, null);
                                                        canvas2.restore();
                                                        Path path2 = new Path();
                                                        path2.addCircle(r17.getWidth() / 2.0f, r17.getHeight() / 2.0f, Math.min(r17.getWidth(), r17.getHeight()) / 2.0f, Path.Direction.CW);
                                                        canvas2.clipPath(path2);
                                                        canvas2.drawBitmap(r17, 0.0f, 0.0f, null);
                                                        r17.recycle();
                                                        r18 = bitmapCreateBitmap2;
                                                    }
                                                    Utilities.blurBitmap(r18, 7);
                                                    Utilities.blurBitmap(r18, 7);
                                                    Utilities.blurBitmap(r18, 7);
                                                    r12 = r18;
                                                }
                                            } else if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                                r12 = r17;
                                                Utilities.blurBitmap(r17, 1);
                                                r12 = r17;
                                            }
                                        }
                                        r12 = r17;
                                        r12 = r17;
                                        r12 = r17;
                                        r13 = 0;
                                        r15 = 0;
                                        ApplyWallpaperSetting = r12;
                                    }
                                } else {
                                    ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                                    synchronized (this.sync) {
                                        if (this.isCancelled) {
                                            return;
                                        }
                                        if (r14 == 0) {
                                            cacheImage2 = this.cacheImage;
                                            if (cacheImage2.filter == null) {
                                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                            } else {
                                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                            }
                                        } else {
                                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        }
                                        options.inDither = false;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                        if (l10 == null) {
                                            if (CreateScaledBitmap == 0) {
                                                if (CreateScaledBitmap == 0) {
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    } else {
                                                        fileInputStream2 = new FileInputStream(file5);
                                                    }
                                                    IntValue = this.cacheImage;
                                                    IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                                    if (IntValue2 == 0) {
                                                        Pair<Integer, Integer> imageOrientation4 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                        IntValue2 = ((Integer) imageOrientation4.first).intValue();
                                                        IntValue = ((Integer) imageOrientation4.second).intValue();
                                                        if (r10 == 0) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else if (this.cacheImage.encryptionKeyPath != null) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else {
                                                            r110 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.getChannel().position(0L);
                                                        }
                                                        rect = null;
                                                        IntValue = IntValue;
                                                        IntValue2 = IntValue2;
                                                        r14 = r110;
                                                        CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                        fileInputStream2.close();
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                        r26 = IntValue;
                                                        r10 = IntValue2;
                                                    } else {
                                                        Pair<Integer, Integer> imageOrientation5 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                        IntValue2 = ((Integer) imageOrientation5.first).intValue();
                                                        IntValue = ((Integer) imageOrientation5.second).intValue();
                                                        if (r10 == 0) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else if (this.cacheImage.encryptionKeyPath != null) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else {
                                                            r110 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.getChannel().position(0L);
                                                        }
                                                        rect = null;
                                                        IntValue = IntValue;
                                                        IntValue2 = IntValue2;
                                                        r14 = r110;
                                                        CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                        fileInputStream2.close();
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                        r26 = IntValue;
                                                        r10 = IntValue2;
                                                    }
                                                } else {
                                                    c12 = c10;
                                                    r26 = 0;
                                                    r10 = 0;
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                }
                                                if (CreateScaledBitmap == 0) {
                                                    RandomAccessFile randomAccessFile7 = new RandomAccessFile(file5, "r");
                                                    r111 = r26;
                                                    length2 = (int) randomAccessFile7.length();
                                                    bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                                    if (bArr3 != null) {
                                                        bArr3 = null;
                                                    } else {
                                                        bArr3 = null;
                                                    }
                                                    if (bArr3 == null) {
                                                        bArr3 = new byte[length2];
                                                        ImageLoader.bytesLocal.set(bArr3);
                                                    }
                                                    randomAccessFile7.readFully(bArr3, 0, length2);
                                                    randomAccessFile7.close();
                                                    if (r10 != 0) {
                                                        EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                                        byte[] bArrComputeSHA2510 = Utilities.computeSHA256(bArr3, 0, length2);
                                                        if (bArr == null) {
                                                            z23 = true;
                                                        } else {
                                                            z23 = true;
                                                        }
                                                        i13 = bArr3[0] & 255;
                                                        length2 -= i13;
                                                    } else {
                                                        if (z43) {
                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                                        }
                                                        z23 = false;
                                                        i13 = 0;
                                                    }
                                                    if (!z23) {
                                                        CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                                    }
                                                } else {
                                                    r111 = r26;
                                                    r10 = r10;
                                                }
                                                r24 = r111;
                                                r10 = r10;
                                                CreateScaledBitmap = CreateScaledBitmap;
                                            } else {
                                                CreateScaledBitmap = thumbnail;
                                                CreateScaledBitmap = thumbnail2;
                                                c12 = c10;
                                                r10 = 0;
                                                r24 = 0;
                                                CreateScaledBitmap = CreateScaledBitmap;
                                            }
                                            if (CreateScaledBitmap == 0) {
                                                if (this.cacheImage.filter != null) {
                                                    width = CreateScaledBitmap.getWidth();
                                                    height = CreateScaledBitmap.getHeight();
                                                    if (f11 != 0.0f) {
                                                        if (width > height) {
                                                            f15 = height / f13;
                                                            if (f15 > 1.0f) {
                                                                bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                            } else {
                                                                r25 = CreateScaledBitmap;
                                                            }
                                                        } else {
                                                            f15 = height / f13;
                                                            if (f15 > 1.0f) {
                                                                bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                            } else {
                                                                r25 = CreateScaledBitmap;
                                                            }
                                                        }
                                                        if (CreateScaledBitmap != r25) {
                                                            r25 = bitmapCreateScaledBitmap2;
                                                            r25 = bitmapCreateScaledBitmap3;
                                                            CreateScaledBitmap.recycle();
                                                            CreateScaledBitmap = r25;
                                                        }
                                                    }
                                                    if (CreateScaledBitmap != 0) {
                                                        if (z15) {
                                                            if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                                CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                            } else {
                                                                CreateScaledBitmap2 = CreateScaledBitmap;
                                                            }
                                                            if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                                z22 = true;
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                                CreateScaledBitmap2.recycle();
                                                            }
                                                        } else {
                                                            z22 = false;
                                                        }
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                        if (c12 != 0) {
                                                            CreateScaledBitmap = CreateScaledBitmap;
                                                            height = 80.0f;
                                                            CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                            width = 80.0f;
                                                        }
                                                        if (c12 != 0) {
                                                            Utilities.blurBitmap(CreateScaledBitmap, 3);
                                                        }
                                                    }
                                                }
                                                z16 = z22;
                                                r13 = r10;
                                                ApplyWallpaperSetting = CreateScaledBitmap;
                                                r15 = r24;
                                            } else if (z11) {
                                                file5.delete();
                                            }
                                            z22 = false;
                                            z16 = z22;
                                            r13 = r10;
                                            ApplyWallpaperSetting = CreateScaledBitmap;
                                            r15 = r24;
                                        } else {
                                            if (CreateScaledBitmap == 0) {
                                                if (CreateScaledBitmap == 0) {
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    } else {
                                                        fileInputStream2 = new FileInputStream(file5);
                                                    }
                                                    IntValue = this.cacheImage;
                                                    IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                                    if (IntValue2 == 0) {
                                                        Pair<Integer, Integer> imageOrientation6 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                        IntValue2 = ((Integer) imageOrientation6.first).intValue();
                                                        IntValue = ((Integer) imageOrientation6.second).intValue();
                                                        if (r10 == 0) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else if (this.cacheImage.encryptionKeyPath != null) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else {
                                                            r110 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.getChannel().position(0L);
                                                        }
                                                        rect = null;
                                                        IntValue = IntValue;
                                                        IntValue2 = IntValue2;
                                                        r14 = r110;
                                                        CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                        fileInputStream2.close();
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                        r26 = IntValue;
                                                        r10 = IntValue2;
                                                    } else {
                                                        Pair<Integer, Integer> imageOrientation7 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                        IntValue2 = ((Integer) imageOrientation7.first).intValue();
                                                        IntValue = ((Integer) imageOrientation7.second).intValue();
                                                        if (r10 == 0) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else if (this.cacheImage.encryptionKeyPath != null) {
                                                            r14 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.close();
                                                            r110 = r14;
                                                            if (r10 != 0) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                                r110 = r14;
                                                            } else if (z43) {
                                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                                r110 = r14;
                                                            }
                                                        } else {
                                                            r110 = CreateScaledBitmap;
                                                            c12 = c10;
                                                            fileInputStream2.getChannel().position(0L);
                                                        }
                                                        rect = null;
                                                        IntValue = IntValue;
                                                        IntValue2 = IntValue2;
                                                        r14 = r110;
                                                        CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                        fileInputStream2.close();
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                        r26 = IntValue;
                                                        r10 = IntValue2;
                                                    }
                                                } else {
                                                    c12 = c10;
                                                    r26 = 0;
                                                    r10 = 0;
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                }
                                                if (CreateScaledBitmap == 0) {
                                                    RandomAccessFile randomAccessFile8 = new RandomAccessFile(file5, "r");
                                                    r111 = r26;
                                                    length2 = (int) randomAccessFile8.length();
                                                    bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                                    if (bArr3 != null) {
                                                        bArr3 = null;
                                                    } else {
                                                        bArr3 = null;
                                                    }
                                                    if (bArr3 == null) {
                                                        bArr3 = new byte[length2];
                                                        ImageLoader.bytesLocal.set(bArr3);
                                                    }
                                                    randomAccessFile8.readFully(bArr3, 0, length2);
                                                    randomAccessFile8.close();
                                                    if (r10 != 0) {
                                                        EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                                        byte[] bArrComputeSHA2511 = Utilities.computeSHA256(bArr3, 0, length2);
                                                        if (bArr == null) {
                                                            z23 = true;
                                                        } else {
                                                            z23 = true;
                                                        }
                                                        i13 = bArr3[0] & 255;
                                                        length2 -= i13;
                                                    } else {
                                                        if (z43) {
                                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                                        }
                                                        z23 = false;
                                                        i13 = 0;
                                                    }
                                                    if (!z23) {
                                                        CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                                    }
                                                } else {
                                                    r111 = r26;
                                                    r10 = r10;
                                                }
                                                r24 = r111;
                                                r10 = r10;
                                                CreateScaledBitmap = CreateScaledBitmap;
                                            } else {
                                                CreateScaledBitmap = thumbnail;
                                                CreateScaledBitmap = thumbnail2;
                                                c12 = c10;
                                                r10 = 0;
                                                r24 = 0;
                                                CreateScaledBitmap = CreateScaledBitmap;
                                            }
                                            if (CreateScaledBitmap == 0) {
                                                if (this.cacheImage.filter != null) {
                                                    width = CreateScaledBitmap.getWidth();
                                                    height = CreateScaledBitmap.getHeight();
                                                    if (f11 != 0.0f) {
                                                        if (width > height) {
                                                            f15 = height / f13;
                                                            if (f15 > 1.0f) {
                                                                bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                            } else {
                                                                r25 = CreateScaledBitmap;
                                                            }
                                                        } else {
                                                            f15 = height / f13;
                                                            if (f15 > 1.0f) {
                                                                bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                            } else {
                                                                r25 = CreateScaledBitmap;
                                                            }
                                                        }
                                                        if (CreateScaledBitmap != r25) {
                                                            r25 = bitmapCreateScaledBitmap2;
                                                            r25 = bitmapCreateScaledBitmap3;
                                                            CreateScaledBitmap.recycle();
                                                            CreateScaledBitmap = r25;
                                                        }
                                                    }
                                                    if (CreateScaledBitmap != 0) {
                                                        if (z15) {
                                                            if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                                CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                            } else {
                                                                CreateScaledBitmap2 = CreateScaledBitmap;
                                                            }
                                                            if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                                z22 = true;
                                                            } else {
                                                                z22 = false;
                                                            }
                                                            if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                                CreateScaledBitmap2.recycle();
                                                            }
                                                        } else {
                                                            z22 = false;
                                                        }
                                                        CreateScaledBitmap = CreateScaledBitmap;
                                                        if (c12 != 0) {
                                                            CreateScaledBitmap = CreateScaledBitmap;
                                                            height = 80.0f;
                                                            CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                            width = 80.0f;
                                                        }
                                                        if (c12 != 0) {
                                                            Utilities.blurBitmap(CreateScaledBitmap, 3);
                                                        }
                                                    }
                                                }
                                                z16 = z22;
                                                r13 = r10;
                                                ApplyWallpaperSetting = CreateScaledBitmap;
                                                r15 = r24;
                                            } else if (z11) {
                                                file5.delete();
                                            }
                                            z22 = false;
                                            z16 = z22;
                                            r13 = r10;
                                            ApplyWallpaperSetting = CreateScaledBitmap;
                                            r15 = r24;
                                        }
                                    }
                                }
                                Thread.interrupted();
                                if (BuildVars.LOGS_ENABLED) {
                                    StringBuilder sb11 = new StringBuilder("Image Loader image is empty = ");
                                    if (ApplyWallpaperSetting == 0) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    sb11.append(z20);
                                    sb11.append(" ");
                                    sb11.append(file5);
                                    FileLog.e(sb11.toString());
                                }
                                if (ApplyWallpaperSetting != 0) {
                                    obj = this.cacheImage.parentObject;
                                    if (obj instanceof TLRPC.WallPaper) {
                                        ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                                    }
                                }
                                cacheImage = this.cacheImage;
                                if (cacheImage == null) {
                                    if (ApplyWallpaperSetting != 0) {
                                        extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                    } else {
                                        extendedBitmapDrawable = null;
                                    }
                                    onPostExecute(extendedBitmapDrawable);
                                    return;
                                }
                                if (ApplyWallpaperSetting != 0) {
                                    extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                                } else {
                                    extendedBitmapDrawable = null;
                                }
                                onPostExecute(extendedBitmapDrawable);
                                return;
                                if (ApplyWallpaperSetting != 0) {
                                    bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                                } else {
                                    bitmapDrawable = null;
                                }
                                onPostExecute(bitmapDrawable);
                            }
                        } else {
                            bitmapDecodeStream = null;
                        }
                        c10 = 0;
                        f11 = 0.0f;
                        f12 = 0.0f;
                        z13 = false;
                        bitmap5 = bitmapDecodeStream;
                        z24 = z44;
                        i10 = 1;
                        CreateScaledBitmap = bitmap5;
                        r14 = z24;
                        f13 = f12;
                        z15 = z13;
                        if (this.cacheImage.type == i10) {
                            ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                            synchronized (this.sync) {
                                if (this.isCancelled) {
                                    return;
                                }
                                if (r10 != 0) {
                                    RandomAccessFile randomAccessFile9 = new RandomAccessFile(file5, "r");
                                    length = (int) randomAccessFile9.length();
                                    bArr2 = (byte[]) ImageLoader.bytesThumbLocal.get();
                                    if (bArr2 != null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    if (bArr2 == null) {
                                        bArr2 = new byte[length];
                                        ImageLoader.bytesThumbLocal.set(bArr2);
                                    }
                                    randomAccessFile9.readFully(bArr2, 0, length);
                                    randomAccessFile9.close();
                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr2, 0, length, (SecureDocumentKey) r10);
                                    z17 = z15;
                                    f14 = 20.0f;
                                    byte[] bArrComputeSHA2512 = Utilities.computeSHA256(bArr2, 0, length);
                                    if (bArr == null) {
                                        z19 = true;
                                    } else {
                                        z19 = true;
                                    }
                                    i11 = bArr2[0] & 255;
                                    i12 = length - i11;
                                    r16 = CreateScaledBitmap;
                                    if (!z19) {
                                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, i11, i12, options);
                                    }
                                } else {
                                    z17 = z15;
                                    f14 = 20.0f;
                                    if (z43) {
                                        fileInputStream = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                    } else {
                                        fileInputStream = new FileInputStream(file5);
                                    }
                                    Bitmap bitmapDecodeStream4 = BitmapFactory.decodeStream(fileInputStream, null, options);
                                    fileInputStream.close();
                                    r16 = bitmapDecodeStream4;
                                }
                                if (r16 == 0) {
                                    if (file5.length() != 0) {
                                        r16 = bitmapDecodeByteArray;
                                        r16 = bitmapDecodeByteArray;
                                        file5.delete();
                                    } else {
                                        r16 = bitmapDecodeByteArray;
                                        r16 = bitmapDecodeByteArray;
                                        file5.delete();
                                    }
                                    r16 = bitmapDecodeByteArray;
                                    z16 = false;
                                    r12 = r16;
                                } else {
                                    if (this.cacheImage.filter != null) {
                                        float width4 = r16.getWidth();
                                        float height4 = r16.getHeight();
                                        if (f11 != f10) {
                                            r16 = bitmapDecodeByteArray;
                                            r17 = r16;
                                            r17 = r16;
                                            r17 = r16;
                                            r17 = r16;
                                            r17 = r16;
                                            r16.recycle();
                                            r17 = bitmapCreateScaledBitmap;
                                        }
                                    }
                                    if (z17) {
                                        if (Utilities.needInvert(r17) != 0) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        z16 = z18;
                                    } else {
                                        z16 = false;
                                    }
                                    if (c10 == 1) {
                                        if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                            r12 = r17;
                                            Utilities.blurBitmap(r17, 3);
                                            r12 = r17;
                                        }
                                    } else if (c10 == 2) {
                                        if (c10 != 3) {
                                            c11 = 4;
                                            if (c10 == 4) {
                                                r12 = r17;
                                            }
                                        } else {
                                            c11 = 4;
                                        }
                                        config = r17.getConfig();
                                        r12 = r17;
                                        r18 = r17;
                                        if (config == Bitmap.Config.ARGB_8888) {
                                            if (c10 == c11) {
                                                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(r17.getWidth(), r17.getHeight(), r17.getConfig());
                                                ?? canvas3 = new Canvas(bitmapCreateBitmap3);
                                                canvas3.save();
                                                canvas3.scale(1.2f, 1.2f, r17.getWidth() / 2.0f, r17.getHeight() / 2.0f);
                                                canvas3.drawBitmap(r17, 0.0f, 0.0f, null);
                                                canvas3.restore();
                                                Path path3 = new Path();
                                                path3.addCircle(r17.getWidth() / 2.0f, r17.getHeight() / 2.0f, Math.min(r17.getWidth(), r17.getHeight()) / 2.0f, Path.Direction.CW);
                                                canvas3.clipPath(path3);
                                                canvas3.drawBitmap(r17, 0.0f, 0.0f, null);
                                                r17.recycle();
                                                r18 = bitmapCreateBitmap3;
                                            }
                                            Utilities.blurBitmap(r18, 7);
                                            Utilities.blurBitmap(r18, 7);
                                            Utilities.blurBitmap(r18, 7);
                                            r12 = r18;
                                        }
                                    } else if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                        r12 = r17;
                                        Utilities.blurBitmap(r17, 1);
                                        r12 = r17;
                                    }
                                }
                                r12 = r17;
                                r12 = r17;
                                r12 = r17;
                                r13 = 0;
                                r15 = 0;
                                ApplyWallpaperSetting = r12;
                            }
                        } else {
                            ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                            synchronized (this.sync) {
                                if (this.isCancelled) {
                                    return;
                                }
                                if (r14 == 0) {
                                    cacheImage2 = this.cacheImage;
                                    if (cacheImage2.filter == null) {
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    } else {
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                    }
                                } else {
                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                }
                                options.inDither = false;
                                CreateScaledBitmap = CreateScaledBitmap;
                                CreateScaledBitmap = CreateScaledBitmap;
                                if (l10 == null) {
                                    if (CreateScaledBitmap == 0) {
                                        if (CreateScaledBitmap == 0) {
                                            if (r10 != 0) {
                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                            } else if (z43) {
                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                            } else {
                                                fileInputStream2 = new FileInputStream(file5);
                                            }
                                            IntValue = this.cacheImage;
                                            IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                            if (IntValue2 == 0) {
                                                Pair<Integer, Integer> imageOrientation8 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                IntValue2 = ((Integer) imageOrientation8.first).intValue();
                                                IntValue = ((Integer) imageOrientation8.second).intValue();
                                                if (r10 == 0) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else if (this.cacheImage.encryptionKeyPath != null) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else {
                                                    r110 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.getChannel().position(0L);
                                                }
                                                rect = null;
                                                IntValue = IntValue;
                                                IntValue2 = IntValue2;
                                                r14 = r110;
                                                CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                fileInputStream2.close();
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                r26 = IntValue;
                                                r10 = IntValue2;
                                            } else {
                                                Pair<Integer, Integer> imageOrientation9 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                IntValue2 = ((Integer) imageOrientation9.first).intValue();
                                                IntValue = ((Integer) imageOrientation9.second).intValue();
                                                if (r10 == 0) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else if (this.cacheImage.encryptionKeyPath != null) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else {
                                                    r110 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.getChannel().position(0L);
                                                }
                                                rect = null;
                                                IntValue = IntValue;
                                                IntValue2 = IntValue2;
                                                r14 = r110;
                                                CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                fileInputStream2.close();
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                r26 = IntValue;
                                                r10 = IntValue2;
                                            }
                                        } else {
                                            c12 = c10;
                                            r26 = 0;
                                            r10 = 0;
                                            CreateScaledBitmap = CreateScaledBitmap;
                                        }
                                        if (CreateScaledBitmap == 0) {
                                            RandomAccessFile randomAccessFile10 = new RandomAccessFile(file5, "r");
                                            r111 = r26;
                                            length2 = (int) randomAccessFile10.length();
                                            bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                            if (bArr3 != null) {
                                                bArr3 = null;
                                            } else {
                                                bArr3 = null;
                                            }
                                            if (bArr3 == null) {
                                                bArr3 = new byte[length2];
                                                ImageLoader.bytesLocal.set(bArr3);
                                            }
                                            randomAccessFile10.readFully(bArr3, 0, length2);
                                            randomAccessFile10.close();
                                            if (r10 != 0) {
                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                                byte[] bArrComputeSHA2513 = Utilities.computeSHA256(bArr3, 0, length2);
                                                if (bArr == null) {
                                                    z23 = true;
                                                } else {
                                                    z23 = true;
                                                }
                                                i13 = bArr3[0] & 255;
                                                length2 -= i13;
                                            } else {
                                                if (z43) {
                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                                }
                                                z23 = false;
                                                i13 = 0;
                                            }
                                            if (!z23) {
                                                CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                            }
                                        } else {
                                            r111 = r26;
                                            r10 = r10;
                                        }
                                        r24 = r111;
                                        r10 = r10;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                    } else {
                                        CreateScaledBitmap = thumbnail;
                                        CreateScaledBitmap = thumbnail2;
                                        c12 = c10;
                                        r10 = 0;
                                        r24 = 0;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                    }
                                    if (CreateScaledBitmap == 0) {
                                        if (this.cacheImage.filter != null) {
                                            width = CreateScaledBitmap.getWidth();
                                            height = CreateScaledBitmap.getHeight();
                                            if (f11 != 0.0f) {
                                                if (width > height) {
                                                    f15 = height / f13;
                                                    if (f15 > 1.0f) {
                                                        bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                    } else {
                                                        r25 = CreateScaledBitmap;
                                                    }
                                                } else {
                                                    f15 = height / f13;
                                                    if (f15 > 1.0f) {
                                                        bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                    } else {
                                                        r25 = CreateScaledBitmap;
                                                    }
                                                }
                                                if (CreateScaledBitmap != r25) {
                                                    r25 = bitmapCreateScaledBitmap2;
                                                    r25 = bitmapCreateScaledBitmap3;
                                                    CreateScaledBitmap.recycle();
                                                    CreateScaledBitmap = r25;
                                                }
                                            }
                                            if (CreateScaledBitmap != 0) {
                                                if (z15) {
                                                    if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                        CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                    } else {
                                                        CreateScaledBitmap2 = CreateScaledBitmap;
                                                    }
                                                    if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                        CreateScaledBitmap2.recycle();
                                                    }
                                                } else {
                                                    z22 = false;
                                                }
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                if (c12 != 0) {
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                    height = 80.0f;
                                                    CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                    width = 80.0f;
                                                }
                                                if (c12 != 0) {
                                                    Utilities.blurBitmap(CreateScaledBitmap, 3);
                                                }
                                            }
                                        }
                                        z16 = z22;
                                        r13 = r10;
                                        ApplyWallpaperSetting = CreateScaledBitmap;
                                        r15 = r24;
                                    } else if (z11) {
                                        file5.delete();
                                    }
                                    z22 = false;
                                    z16 = z22;
                                    r13 = r10;
                                    ApplyWallpaperSetting = CreateScaledBitmap;
                                    r15 = r24;
                                } else {
                                    if (CreateScaledBitmap == 0) {
                                        if (CreateScaledBitmap == 0) {
                                            if (r10 != 0) {
                                                fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                            } else if (z43) {
                                                fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                            } else {
                                                fileInputStream2 = new FileInputStream(file5);
                                            }
                                            IntValue = this.cacheImage;
                                            IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                            if (IntValue2 == 0) {
                                                Pair<Integer, Integer> imageOrientation10 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                IntValue2 = ((Integer) imageOrientation10.first).intValue();
                                                IntValue = ((Integer) imageOrientation10.second).intValue();
                                                if (r10 == 0) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else if (this.cacheImage.encryptionKeyPath != null) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else {
                                                    r110 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.getChannel().position(0L);
                                                }
                                                rect = null;
                                                IntValue = IntValue;
                                                IntValue2 = IntValue2;
                                                r14 = r110;
                                                CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                fileInputStream2.close();
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                r26 = IntValue;
                                                r10 = IntValue2;
                                            } else {
                                                Pair<Integer, Integer> imageOrientation11 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                                IntValue2 = ((Integer) imageOrientation11.first).intValue();
                                                IntValue = ((Integer) imageOrientation11.second).intValue();
                                                if (r10 == 0) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else if (this.cacheImage.encryptionKeyPath != null) {
                                                    r14 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.close();
                                                    r110 = r14;
                                                    if (r10 != 0) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                        r110 = r14;
                                                    } else if (z43) {
                                                        fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                        r110 = r14;
                                                    }
                                                } else {
                                                    r110 = CreateScaledBitmap;
                                                    c12 = c10;
                                                    fileInputStream2.getChannel().position(0L);
                                                }
                                                rect = null;
                                                IntValue = IntValue;
                                                IntValue2 = IntValue2;
                                                r14 = r110;
                                                CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                                fileInputStream2.close();
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                r26 = IntValue;
                                                r10 = IntValue2;
                                            }
                                        } else {
                                            c12 = c10;
                                            r26 = 0;
                                            r10 = 0;
                                            CreateScaledBitmap = CreateScaledBitmap;
                                        }
                                        if (CreateScaledBitmap == 0) {
                                            RandomAccessFile randomAccessFile11 = new RandomAccessFile(file5, "r");
                                            r111 = r26;
                                            length2 = (int) randomAccessFile11.length();
                                            bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                            if (bArr3 != null) {
                                                bArr3 = null;
                                            } else {
                                                bArr3 = null;
                                            }
                                            if (bArr3 == null) {
                                                bArr3 = new byte[length2];
                                                ImageLoader.bytesLocal.set(bArr3);
                                            }
                                            randomAccessFile11.readFully(bArr3, 0, length2);
                                            randomAccessFile11.close();
                                            if (r10 != 0) {
                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                                byte[] bArrComputeSHA2514 = Utilities.computeSHA256(bArr3, 0, length2);
                                                if (bArr == null) {
                                                    z23 = true;
                                                } else {
                                                    z23 = true;
                                                }
                                                i13 = bArr3[0] & 255;
                                                length2 -= i13;
                                            } else {
                                                if (z43) {
                                                    EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                                }
                                                z23 = false;
                                                i13 = 0;
                                            }
                                            if (!z23) {
                                                CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                            }
                                        } else {
                                            r111 = r26;
                                            r10 = r10;
                                        }
                                        r24 = r111;
                                        r10 = r10;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                    } else {
                                        CreateScaledBitmap = thumbnail;
                                        CreateScaledBitmap = thumbnail2;
                                        c12 = c10;
                                        r10 = 0;
                                        r24 = 0;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                    }
                                    if (CreateScaledBitmap == 0) {
                                        if (this.cacheImage.filter != null) {
                                            width = CreateScaledBitmap.getWidth();
                                            height = CreateScaledBitmap.getHeight();
                                            if (f11 != 0.0f) {
                                                if (width > height) {
                                                    f15 = height / f13;
                                                    if (f15 > 1.0f) {
                                                        bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                    } else {
                                                        r25 = CreateScaledBitmap;
                                                    }
                                                } else {
                                                    f15 = height / f13;
                                                    if (f15 > 1.0f) {
                                                        bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                    } else {
                                                        r25 = CreateScaledBitmap;
                                                    }
                                                }
                                                if (CreateScaledBitmap != r25) {
                                                    r25 = bitmapCreateScaledBitmap2;
                                                    r25 = bitmapCreateScaledBitmap3;
                                                    CreateScaledBitmap.recycle();
                                                    CreateScaledBitmap = r25;
                                                }
                                            }
                                            if (CreateScaledBitmap != 0) {
                                                if (z15) {
                                                    if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                        CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                    } else {
                                                        CreateScaledBitmap2 = CreateScaledBitmap;
                                                    }
                                                    if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                        CreateScaledBitmap2.recycle();
                                                    }
                                                } else {
                                                    z22 = false;
                                                }
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                if (c12 != 0) {
                                                    CreateScaledBitmap = CreateScaledBitmap;
                                                    height = 80.0f;
                                                    CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                    width = 80.0f;
                                                }
                                                if (c12 != 0) {
                                                    Utilities.blurBitmap(CreateScaledBitmap, 3);
                                                }
                                            }
                                        }
                                        z16 = z22;
                                        r13 = r10;
                                        ApplyWallpaperSetting = CreateScaledBitmap;
                                        r15 = r24;
                                    } else if (z11) {
                                        file5.delete();
                                    }
                                    z22 = false;
                                    z16 = z22;
                                    r13 = r10;
                                    ApplyWallpaperSetting = CreateScaledBitmap;
                                    r15 = r24;
                                }
                            }
                        }
                        Thread.interrupted();
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb12 = new StringBuilder("Image Loader image is empty = ");
                            if (ApplyWallpaperSetting == 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            sb12.append(z20);
                            sb12.append(" ");
                            sb12.append(file5);
                            FileLog.e(sb12.toString());
                        }
                        if (ApplyWallpaperSetting != 0) {
                            obj = this.cacheImage.parentObject;
                            if (obj instanceof TLRPC.WallPaper) {
                                ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                            }
                        }
                        cacheImage = this.cacheImage;
                        if (cacheImage == null) {
                            if (ApplyWallpaperSetting != 0) {
                                extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                            } else {
                                extendedBitmapDrawable = null;
                            }
                            onPostExecute(extendedBitmapDrawable);
                            return;
                        }
                        if (ApplyWallpaperSetting != 0) {
                            extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                        } else {
                            extendedBitmapDrawable = null;
                        }
                        onPostExecute(extendedBitmapDrawable);
                        return;
                        if (ApplyWallpaperSetting != 0) {
                            bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                        } else {
                            bitmapDrawable = null;
                        }
                        onPostExecute(bitmapDrawable);
                    } catch (Throwable th34) {
                        th = th34;
                        str = str;
                        l10 = lValueOf;
                        z12 = z10;
                        f10 = 0.0f;
                    }
                    f12 = 0.0f;
                    bitmap3 = bitmap2;
                    z13 = false;
                    bitmap4 = bitmap3;
                    z14 = z44;
                    i10 = 1;
                    FileLog.e(th, !(th instanceof FileNotFoundException));
                    CreateScaledBitmap = bitmap4;
                    r14 = z14;
                    f13 = f12;
                    z15 = z13;
                    if (this.cacheImage.type == i10) {
                        ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                        synchronized (this.sync) {
                            if (this.isCancelled) {
                                return;
                            }
                            if (r10 != 0) {
                                RandomAccessFile randomAccessFile12 = new RandomAccessFile(file5, "r");
                                length = (int) randomAccessFile12.length();
                                bArr2 = (byte[]) ImageLoader.bytesThumbLocal.get();
                                if (bArr2 != null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                if (bArr2 == null) {
                                    bArr2 = new byte[length];
                                    ImageLoader.bytesThumbLocal.set(bArr2);
                                }
                                randomAccessFile12.readFully(bArr2, 0, length);
                                randomAccessFile12.close();
                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr2, 0, length, (SecureDocumentKey) r10);
                                z17 = z15;
                                f14 = 20.0f;
                                byte[] bArrComputeSHA2515 = Utilities.computeSHA256(bArr2, 0, length);
                                if (bArr == null) {
                                    z19 = true;
                                } else {
                                    z19 = true;
                                }
                                i11 = bArr2[0] & 255;
                                i12 = length - i11;
                                r16 = CreateScaledBitmap;
                                if (!z19) {
                                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, i11, i12, options);
                                }
                            } else {
                                z17 = z15;
                                f14 = 20.0f;
                                if (z43) {
                                    fileInputStream = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                } else {
                                    fileInputStream = new FileInputStream(file5);
                                }
                                Bitmap bitmapDecodeStream5 = BitmapFactory.decodeStream(fileInputStream, null, options);
                                fileInputStream.close();
                                r16 = bitmapDecodeStream5;
                            }
                            if (r16 == 0) {
                                if (file5.length() != 0) {
                                    r16 = bitmapDecodeByteArray;
                                    r16 = bitmapDecodeByteArray;
                                    file5.delete();
                                } else {
                                    r16 = bitmapDecodeByteArray;
                                    r16 = bitmapDecodeByteArray;
                                    file5.delete();
                                }
                                r16 = bitmapDecodeByteArray;
                                z16 = false;
                                r12 = r16;
                            } else {
                                if (this.cacheImage.filter != null) {
                                    float width5 = r16.getWidth();
                                    float height5 = r16.getHeight();
                                    if (f11 != f10) {
                                        r16 = bitmapDecodeByteArray;
                                        r17 = r16;
                                        r17 = r16;
                                        r17 = r16;
                                        r17 = r16;
                                        r17 = r16;
                                        r16.recycle();
                                        r17 = bitmapCreateScaledBitmap;
                                    }
                                }
                                if (z17) {
                                    if (Utilities.needInvert(r17) != 0) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    z16 = z18;
                                } else {
                                    z16 = false;
                                }
                                if (c10 == 1) {
                                    if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                        r12 = r17;
                                        Utilities.blurBitmap(r17, 3);
                                        r12 = r17;
                                    }
                                } else if (c10 == 2) {
                                    if (c10 != 3) {
                                        c11 = 4;
                                        if (c10 == 4) {
                                            r12 = r17;
                                        }
                                    } else {
                                        c11 = 4;
                                    }
                                    config = r17.getConfig();
                                    r12 = r17;
                                    r18 = r17;
                                    if (config == Bitmap.Config.ARGB_8888) {
                                        if (c10 == c11) {
                                            Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(r17.getWidth(), r17.getHeight(), r17.getConfig());
                                            ?? canvas4 = new Canvas(bitmapCreateBitmap4);
                                            canvas4.save();
                                            canvas4.scale(1.2f, 1.2f, r17.getWidth() / 2.0f, r17.getHeight() / 2.0f);
                                            canvas4.drawBitmap(r17, 0.0f, 0.0f, null);
                                            canvas4.restore();
                                            Path path4 = new Path();
                                            path4.addCircle(r17.getWidth() / 2.0f, r17.getHeight() / 2.0f, Math.min(r17.getWidth(), r17.getHeight()) / 2.0f, Path.Direction.CW);
                                            canvas4.clipPath(path4);
                                            canvas4.drawBitmap(r17, 0.0f, 0.0f, null);
                                            r17.recycle();
                                            r18 = bitmapCreateBitmap4;
                                        }
                                        Utilities.blurBitmap(r18, 7);
                                        Utilities.blurBitmap(r18, 7);
                                        Utilities.blurBitmap(r18, 7);
                                        r12 = r18;
                                    }
                                } else if (r17.getConfig() == Bitmap.Config.ARGB_8888) {
                                    r12 = r17;
                                    Utilities.blurBitmap(r17, 1);
                                    r12 = r17;
                                }
                            }
                            r12 = r17;
                            r12 = r17;
                            r12 = r17;
                            r13 = 0;
                            r15 = 0;
                            ApplyWallpaperSetting = r12;
                        }
                    } else {
                        ImageLoader.this.lastCacheOutTime = SystemClock.elapsedRealtime();
                        synchronized (this.sync) {
                            if (this.isCancelled) {
                                return;
                            }
                            if (r14 == 0) {
                                cacheImage2 = this.cacheImage;
                                if (cacheImage2.filter == null) {
                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                } else {
                                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                }
                            } else {
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            }
                            options.inDither = false;
                            CreateScaledBitmap = CreateScaledBitmap;
                            CreateScaledBitmap = CreateScaledBitmap;
                            if (l10 == null) {
                                if (CreateScaledBitmap == 0) {
                                    if (CreateScaledBitmap == 0) {
                                        if (r10 != 0) {
                                            fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                        } else if (z43) {
                                            fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                        } else {
                                            fileInputStream2 = new FileInputStream(file5);
                                        }
                                        IntValue = this.cacheImage;
                                        IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                        if (IntValue2 == 0) {
                                            Pair<Integer, Integer> imageOrientation12 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                            IntValue2 = ((Integer) imageOrientation12.first).intValue();
                                            IntValue = ((Integer) imageOrientation12.second).intValue();
                                            if (r10 == 0) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else if (this.cacheImage.encryptionKeyPath != null) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else {
                                                r110 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.getChannel().position(0L);
                                            }
                                            rect = null;
                                            IntValue = IntValue;
                                            IntValue2 = IntValue2;
                                            r14 = r110;
                                            CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                            fileInputStream2.close();
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            r26 = IntValue;
                                            r10 = IntValue2;
                                        } else {
                                            Pair<Integer, Integer> imageOrientation13 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                            IntValue2 = ((Integer) imageOrientation13.first).intValue();
                                            IntValue = ((Integer) imageOrientation13.second).intValue();
                                            if (r10 == 0) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else if (this.cacheImage.encryptionKeyPath != null) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else {
                                                r110 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.getChannel().position(0L);
                                            }
                                            rect = null;
                                            IntValue = IntValue;
                                            IntValue2 = IntValue2;
                                            r14 = r110;
                                            CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                            fileInputStream2.close();
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            r26 = IntValue;
                                            r10 = IntValue2;
                                        }
                                    } else {
                                        c12 = c10;
                                        r26 = 0;
                                        r10 = 0;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                    }
                                    if (CreateScaledBitmap == 0) {
                                        RandomAccessFile randomAccessFile13 = new RandomAccessFile(file5, "r");
                                        r111 = r26;
                                        length2 = (int) randomAccessFile13.length();
                                        bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                        if (bArr3 != null) {
                                            bArr3 = null;
                                        } else {
                                            bArr3 = null;
                                        }
                                        if (bArr3 == null) {
                                            bArr3 = new byte[length2];
                                            ImageLoader.bytesLocal.set(bArr3);
                                        }
                                        randomAccessFile13.readFully(bArr3, 0, length2);
                                        randomAccessFile13.close();
                                        if (r10 != 0) {
                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                            byte[] bArrComputeSHA2516 = Utilities.computeSHA256(bArr3, 0, length2);
                                            if (bArr == null) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            i13 = bArr3[0] & 255;
                                            length2 -= i13;
                                        } else {
                                            if (z43) {
                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                            }
                                            z23 = false;
                                            i13 = 0;
                                        }
                                        if (!z23) {
                                            CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                        }
                                    } else {
                                        r111 = r26;
                                        r10 = r10;
                                    }
                                    r24 = r111;
                                    r10 = r10;
                                    CreateScaledBitmap = CreateScaledBitmap;
                                } else {
                                    CreateScaledBitmap = thumbnail;
                                    CreateScaledBitmap = thumbnail2;
                                    c12 = c10;
                                    r10 = 0;
                                    r24 = 0;
                                    CreateScaledBitmap = CreateScaledBitmap;
                                }
                                if (CreateScaledBitmap == 0) {
                                    if (this.cacheImage.filter != null) {
                                        width = CreateScaledBitmap.getWidth();
                                        height = CreateScaledBitmap.getHeight();
                                        if (f11 != 0.0f) {
                                            if (width > height) {
                                                f15 = height / f13;
                                                if (f15 > 1.0f) {
                                                    bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                } else {
                                                    r25 = CreateScaledBitmap;
                                                }
                                            } else {
                                                f15 = height / f13;
                                                if (f15 > 1.0f) {
                                                    bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                } else {
                                                    r25 = CreateScaledBitmap;
                                                }
                                            }
                                            if (CreateScaledBitmap != r25) {
                                                r25 = bitmapCreateScaledBitmap2;
                                                r25 = bitmapCreateScaledBitmap3;
                                                CreateScaledBitmap.recycle();
                                                CreateScaledBitmap = r25;
                                            }
                                        }
                                        if (CreateScaledBitmap != 0) {
                                            if (z15) {
                                                if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                    CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                } else {
                                                    CreateScaledBitmap2 = CreateScaledBitmap;
                                                }
                                                if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                                if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                    CreateScaledBitmap2.recycle();
                                                }
                                            } else {
                                                z22 = false;
                                            }
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            if (c12 != 0) {
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                height = 80.0f;
                                                CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                width = 80.0f;
                                            }
                                            if (c12 != 0) {
                                                Utilities.blurBitmap(CreateScaledBitmap, 3);
                                            }
                                        }
                                    }
                                    z16 = z22;
                                    r13 = r10;
                                    ApplyWallpaperSetting = CreateScaledBitmap;
                                    r15 = r24;
                                } else if (z11) {
                                    file5.delete();
                                }
                                z22 = false;
                                z16 = z22;
                                r13 = r10;
                                ApplyWallpaperSetting = CreateScaledBitmap;
                                r15 = r24;
                            } else {
                                if (CreateScaledBitmap == 0) {
                                    if (CreateScaledBitmap == 0) {
                                        if (r10 != 0) {
                                            fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                        } else if (z43) {
                                            fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                        } else {
                                            fileInputStream2 = new FileInputStream(file5);
                                        }
                                        IntValue = this.cacheImage;
                                        IntValue2 = IntValue.imageLocation.document instanceof TLRPC.TL_document;
                                        if (IntValue2 == 0) {
                                            Pair<Integer, Integer> imageOrientation14 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                            IntValue2 = ((Integer) imageOrientation14.first).intValue();
                                            IntValue = ((Integer) imageOrientation14.second).intValue();
                                            if (r10 == 0) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else if (this.cacheImage.encryptionKeyPath != null) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else {
                                                r110 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.getChannel().position(0L);
                                            }
                                            rect = null;
                                            IntValue = IntValue;
                                            IntValue2 = IntValue2;
                                            r14 = r110;
                                            CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                            fileInputStream2.close();
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            r26 = IntValue;
                                            r10 = IntValue2;
                                        } else {
                                            Pair<Integer, Integer> imageOrientation15 = AndroidUtilities.getImageOrientation(fileInputStream2);
                                            IntValue2 = ((Integer) imageOrientation15.first).intValue();
                                            IntValue = ((Integer) imageOrientation15.second).intValue();
                                            if (r10 == 0) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else if (this.cacheImage.encryptionKeyPath != null) {
                                                r14 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.close();
                                                r110 = r14;
                                                if (r10 != 0) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, (SecureDocumentKey) r10);
                                                    r110 = r14;
                                                } else if (z43) {
                                                    fileInputStream2 = new EncryptedFileInputStream(file5, this.cacheImage.encryptionKeyPath);
                                                    r110 = r14;
                                                }
                                            } else {
                                                r110 = CreateScaledBitmap;
                                                c12 = c10;
                                                fileInputStream2.getChannel().position(0L);
                                            }
                                            rect = null;
                                            IntValue = IntValue;
                                            IntValue2 = IntValue2;
                                            r14 = r110;
                                            CreateScaledBitmap = BitmapFactory.decodeStream(fileInputStream2, rect, options);
                                            fileInputStream2.close();
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            r26 = IntValue;
                                            r10 = IntValue2;
                                        }
                                    } else {
                                        c12 = c10;
                                        r26 = 0;
                                        r10 = 0;
                                        CreateScaledBitmap = CreateScaledBitmap;
                                    }
                                    if (CreateScaledBitmap == 0) {
                                        RandomAccessFile randomAccessFile14 = new RandomAccessFile(file5, "r");
                                        r111 = r26;
                                        length2 = (int) randomAccessFile14.length();
                                        bArr3 = (byte[]) ImageLoader.bytesLocal.get();
                                        if (bArr3 != null) {
                                            bArr3 = null;
                                        } else {
                                            bArr3 = null;
                                        }
                                        if (bArr3 == null) {
                                            bArr3 = new byte[length2];
                                            ImageLoader.bytesLocal.set(bArr3);
                                        }
                                        randomAccessFile14.readFully(bArr3, 0, length2);
                                        randomAccessFile14.close();
                                        if (r10 != 0) {
                                            EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, (SecureDocumentKey) r10);
                                            byte[] bArrComputeSHA2517 = Utilities.computeSHA256(bArr3, 0, length2);
                                            if (bArr == null) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            i13 = bArr3[0] & 255;
                                            length2 -= i13;
                                        } else {
                                            if (z43) {
                                                EncryptedFileInputStream.decryptBytesWithKeyFile(bArr3, 0, length2, this.cacheImage.encryptionKeyPath);
                                            }
                                            z23 = false;
                                            i13 = 0;
                                        }
                                        if (!z23) {
                                            CreateScaledBitmap = BitmapFactory.decodeByteArray(bArr3, i13, length2, options);
                                        }
                                    } else {
                                        r111 = r26;
                                        r10 = r10;
                                    }
                                    r24 = r111;
                                    r10 = r10;
                                    CreateScaledBitmap = CreateScaledBitmap;
                                } else {
                                    CreateScaledBitmap = thumbnail;
                                    CreateScaledBitmap = thumbnail2;
                                    c12 = c10;
                                    r10 = 0;
                                    r24 = 0;
                                    CreateScaledBitmap = CreateScaledBitmap;
                                }
                                if (CreateScaledBitmap == 0) {
                                    if (this.cacheImage.filter != null) {
                                        width = CreateScaledBitmap.getWidth();
                                        height = CreateScaledBitmap.getHeight();
                                        if (f11 != 0.0f) {
                                            if (width > height) {
                                                f15 = height / f13;
                                                if (f15 > 1.0f) {
                                                    bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                } else {
                                                    r25 = CreateScaledBitmap;
                                                }
                                            } else {
                                                f15 = height / f13;
                                                if (f15 > 1.0f) {
                                                    bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, (int) (width / f15), (int) f13, true);
                                                } else {
                                                    r25 = CreateScaledBitmap;
                                                }
                                            }
                                            if (CreateScaledBitmap != r25) {
                                                r25 = bitmapCreateScaledBitmap2;
                                                r25 = bitmapCreateScaledBitmap3;
                                                CreateScaledBitmap.recycle();
                                                CreateScaledBitmap = r25;
                                            }
                                        }
                                        if (CreateScaledBitmap != 0) {
                                            if (z15) {
                                                if (CreateScaledBitmap.getWidth() * CreateScaledBitmap.getHeight() > 22500) {
                                                    CreateScaledBitmap2 = Bitmaps.createScaledBitmap(CreateScaledBitmap, 100, 100, false);
                                                } else {
                                                    CreateScaledBitmap2 = CreateScaledBitmap;
                                                }
                                                if (Utilities.needInvert(CreateScaledBitmap2) != 0) {
                                                    z22 = true;
                                                } else {
                                                    z22 = false;
                                                }
                                                if (CreateScaledBitmap2 != CreateScaledBitmap) {
                                                    CreateScaledBitmap2.recycle();
                                                }
                                            } else {
                                                z22 = false;
                                            }
                                            CreateScaledBitmap = CreateScaledBitmap;
                                            if (c12 != 0) {
                                                CreateScaledBitmap = CreateScaledBitmap;
                                                height = 80.0f;
                                                CreateScaledBitmap = Bitmaps.createScaledBitmap(CreateScaledBitmap, 80, 80, false);
                                                width = 80.0f;
                                            }
                                            if (c12 != 0) {
                                                Utilities.blurBitmap(CreateScaledBitmap, 3);
                                            }
                                        }
                                    }
                                    z16 = z22;
                                    r13 = r10;
                                    ApplyWallpaperSetting = CreateScaledBitmap;
                                    r15 = r24;
                                } else if (z11) {
                                    file5.delete();
                                }
                                z22 = false;
                                z16 = z22;
                                r13 = r10;
                                ApplyWallpaperSetting = CreateScaledBitmap;
                                r15 = r24;
                            }
                        }
                    }
                    Thread.interrupted();
                    if (BuildVars.LOGS_ENABLED) {
                        StringBuilder sb13 = new StringBuilder("Image Loader image is empty = ");
                        if (ApplyWallpaperSetting == 0) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        sb13.append(z20);
                        sb13.append(" ");
                        sb13.append(file5);
                        FileLog.e(sb13.toString());
                    }
                    if (ApplyWallpaperSetting != 0) {
                        obj = this.cacheImage.parentObject;
                        if (obj instanceof TLRPC.WallPaper) {
                            ApplyWallpaperSetting = applyWallpaperSetting(ApplyWallpaperSetting, (TLRPC.WallPaper) obj);
                        }
                    }
                    cacheImage = this.cacheImage;
                    if (cacheImage == null) {
                        if (ApplyWallpaperSetting != 0) {
                            extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                        } else {
                            extendedBitmapDrawable = null;
                        }
                        onPostExecute(extendedBitmapDrawable);
                        return;
                    }
                    if (ApplyWallpaperSetting != 0) {
                        extendedBitmapDrawable = new ExtendedBitmapDrawable(ApplyWallpaperSetting, r13, r15);
                    } else {
                        extendedBitmapDrawable = null;
                    }
                    onPostExecute(extendedBitmapDrawable);
                    return;
                    if (ApplyWallpaperSetting != 0) {
                        bitmapDrawable = new BitmapDrawable((Bitmap) ApplyWallpaperSetting);
                    } else {
                        bitmapDrawable = null;
                    }
                    onPostExecute(bitmapDrawable);
                } catch (Throwable th35) {
                    throw th35;
                }
            }
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

        public HttpFileTask(String str, File file, String str2, int i10) {
            this.url = str;
            this.tempFile = file;
            this.ext = str2;
            this.currentAccount = i10;
        }

        public void lambda$reportProgress$0(long j10, long j11) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.url, Long.valueOf(j10), Long.valueOf(j11));
        }

        public void lambda$reportProgress$1(long j10, long j11) {
            ImageLoader.this.fileProgresses.put(this.url, new long[]{j10, j11});
            AndroidUtilities.runOnUIThread(new d5(this, j10, j11, 0));
        }

        private void reportProgress(long j10, long j11) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j10 != j11) {
                long j12 = this.lastProgressTime;
                if (j12 != 0 && j12 >= jElapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = jElapsedRealtime;
            Utilities.stageQueue.postRunnable(new d5(this, j10, j11, 1));
        }

        @Override
        public void onCancelled() {
            ImageLoader.this.runHttpFileLoadTasks(this, 2);
        }

        @Override
        public Boolean doInBackground(Void... voidArr) {
            InputStream inputStream;
            URLConnection uRLConnectionOpenConnection;
            InputStream inputStream2;
            List<String> list;
            String str;
            int responseCode;
            boolean z10 = true;
            boolean z11 = false;
            try {
                uRLConnectionOpenConnection = new URL(this.url).openConnection();
                try {
                    uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                    uRLConnectionOpenConnection.setConnectTimeout(5000);
                    uRLConnectionOpenConnection.setReadTimeout(5000);
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                        httpURLConnection.setInstanceFollowRedirects(true);
                        int responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 == 302 || responseCode2 == 301 || responseCode2 == 303) {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                            uRLConnectionOpenConnection = new URL(headerField).openConnection();
                            uRLConnectionOpenConnection.setRequestProperty("Cookie", headerField2);
                            uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                        }
                    }
                    uRLConnectionOpenConnection.connect();
                    inputStream2 = uRLConnectionOpenConnection.getInputStream();
                    try {
                        this.fileOutputStream = new RandomAccessFile(this.tempFile, "rws");
                    } catch (Throwable th) {
                        inputStream = inputStream2;
                        th = th;
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
                        FileLog.e(th);
                        inputStream2 = inputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                uRLConnectionOpenConnection = null;
            }
            if (this.canRetry) {
                try {
                    if ((uRLConnectionOpenConnection instanceof HttpURLConnection) && (responseCode = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.canRetry = false;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (uRLConnectionOpenConnection != null) {
                    try {
                        Map<String, List<String>> headerFields = uRLConnectionOpenConnection.getHeaderFields();
                        if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                            this.fileSize = Utilities.parseInt((CharSequence) str).intValue();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (inputStream2 != null) {
                    try {
                        byte[] bArr = new byte[32768];
                        int i10 = 0;
                        while (true) {
                            try {
                                if (!isCancelled()) {
                                    try {
                                        int i11 = inputStream2.read(bArr);
                                        if (i11 > 0) {
                                            this.fileOutputStream.write(bArr, 0, i11);
                                            i10 += i11;
                                            int i12 = this.fileSize;
                                            if (i12 > 0) {
                                                reportProgress(i10, i12);
                                            }
                                        } else {
                                            if (i11 == -1) {
                                                try {
                                                    int i13 = this.fileSize;
                                                    if (i13 != 0) {
                                                        reportProgress(i13, i13);
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    FileLog.e(e);
                                                }
                                            }
                                            z11 = z10;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        z10 = false;
                                    }
                                    FileLog.e(e);
                                    z11 = z10;
                                }
                                z10 = false;
                            } catch (Throwable th4) {
                                th = th4;
                                FileLog.e(th);
                            }
                            z11 = z10;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z10 = false;
                    }
                }
                try {
                    RandomAccessFile randomAccessFile = this.fileOutputStream;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                        this.fileOutputStream = null;
                    }
                } catch (Throwable th6) {
                    FileLog.e(th6);
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Throwable th7) {
                        FileLog.e(th7);
                    }
                }
            }
            return Boolean.valueOf(z11);
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
            AndroidUtilities.runOnUIThread(new f5(this, 3));
        }

        public void lambda$onPostExecute$3(Boolean bool) {
            if (!bool.booleanValue()) {
                NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 2);
                return;
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.cacheImage.currentAccount);
            int i10 = NotificationCenter.fileLoaded;
            CacheImage cacheImage = this.cacheImage;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, cacheImage.url, cacheImage.finalFilePath);
        }

        public void lambda$onPostExecute$4(Boolean bool) {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new g5(this, bool, 0));
        }

        public void lambda$onPostExecute$5() {
            ImageLoader.this.runHttpTasks(true);
        }

        public void lambda$reportProgress$0(long j10, long j11) {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.cacheImage.url, Long.valueOf(j10), Long.valueOf(j11));
        }

        public void lambda$reportProgress$1(long j10, long j11) {
            ImageLoader.this.fileProgresses.put(this.cacheImage.url, new long[]{j10, j11});
            AndroidUtilities.runOnUIThread(new h5(this, j10, j11, 0));
        }

        private void reportProgress(long j10, long j11) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j10 != j11) {
                long j12 = this.lastProgressTime;
                if (j12 != 0 && j12 >= jElapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = jElapsedRealtime;
            Utilities.stageQueue.postRunnable(new h5(this, j10, j11, 1));
        }

        @Override
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new f5(this, 0), this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new f5(this, 1));
        }

        @Override
        public Boolean doInBackground(Void... voidArr) {
            InputStream inputStream;
            boolean z10;
            InputStream inputStream2;
            WebFile webFile;
            CacheImage cacheImage;
            File file;
            HttpURLConnection httpURLConnection;
            RandomAccessFile randomAccessFile;
            HttpURLConnection httpURLConnection2;
            List<String> list;
            String str;
            int responseCode;
            boolean z11 = true;
            boolean z12 = false;
            if (isCancelled()) {
                inputStream2 = null;
            } else {
                try {
                    String str2 = this.cacheImage.imageLocation.path;
                    if (str2.startsWith("https://static-maps") || str2.startsWith("https://maps.googleapis")) {
                        int i10 = MessagesController.getInstance(this.cacheImage.currentAccount).mapProvider;
                        if ((i10 == 3 || i10 == 4) && (webFile = (WebFile) ImageLoader.this.testWebFile.get(str2)) != null) {
                            TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                            tL_upload_getWebFile.location = webFile.location;
                            tL_upload_getWebFile.offset = 0;
                            tL_upload_getWebFile.limit = 0;
                            ConnectionsManager.getInstance(this.cacheImage.currentAccount).sendRequest(tL_upload_getWebFile, new e5(0));
                        }
                    }
                    String str3 = this.overrideUrl;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(str2).openConnection();
                    this.httpConnection = httpURLConnection3;
                    httpURLConnection3.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                    this.httpConnection.setConnectTimeout(5000);
                    this.httpConnection.setReadTimeout(5000);
                    this.httpConnection.setInstanceFollowRedirects(true);
                    if (isCancelled()) {
                        inputStream2 = null;
                    } else {
                        this.httpConnection.connect();
                        inputStream2 = this.httpConnection.getInputStream();
                        try {
                            this.fileOutputStream = new RandomAccessFile(this.cacheImage.tempFilePath, "rws");
                        } catch (Throwable th) {
                            inputStream = inputStream2;
                            th = th;
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
                            } else {
                                if (!(th instanceof InterruptedIOException)) {
                                    z10 = true;
                                }
                                FileLog.e(th, z10);
                                inputStream2 = inputStream;
                            }
                            z10 = false;
                            FileLog.e(th, z10);
                            inputStream2 = inputStream;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            }
            if (!isCancelled()) {
                try {
                    HttpURLConnection httpURLConnection4 = this.httpConnection;
                    if (httpURLConnection4 != null && (responseCode = httpURLConnection4.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.canRetry = false;
                    }
                } catch (Exception e9) {
                    FileLog.e((Throwable) e9, false);
                }
                if (this.imageSize == 0 && (httpURLConnection2 = this.httpConnection) != null) {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                        if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                            this.imageSize = Utilities.parseInt((CharSequence) str).intValue();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (inputStream2 != null) {
                    try {
                        byte[] bArr = new byte[8192];
                        int i11 = 0;
                        while (true) {
                            if (!isCancelled()) {
                                try {
                                    int i12 = inputStream2.read(bArr);
                                    if (i12 > 0) {
                                        i11 += i12;
                                        this.fileOutputStream.write(bArr, 0, i12);
                                        long j10 = this.imageSize;
                                        if (j10 != 0) {
                                            reportProgress(i11, j10);
                                        }
                                    } else if (i12 == -1) {
                                        try {
                                            long j11 = this.imageSize;
                                            if (j11 == 0) {
                                                break;
                                            }
                                            reportProgress(j11, j11);
                                            break;
                                        } catch (Exception e11) {
                                            e = e11;
                                            z12 = true;
                                            FileLog.e(e);
                                            z11 = z12;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z12 = true;
                                            FileLog.e(th);
                                            randomAccessFile = this.fileOutputStream;
                                            if (randomAccessFile != null) {
                                                randomAccessFile.close();
                                                this.fileOutputStream = null;
                                            }
                                            httpURLConnection = this.httpConnection;
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (Throwable th4) {
                                                    FileLog.e(th4);
                                                }
                                            }
                                            if (z12) {
                                                CacheImage cacheImage2 = this.cacheImage;
                                                cacheImage2.finalFilePath = cacheImage2.tempFilePath;
                                            }
                                            return Boolean.valueOf(z12);
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                FileLog.e(e);
                                z11 = z12;
                            }
                            z11 = false;
                            break;
                        }
                        z12 = z11;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
            try {
                randomAccessFile = this.fileOutputStream;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    this.fileOutputStream = null;
                }
            } catch (Throwable th6) {
                FileLog.e(th6);
            }
            try {
                httpURLConnection = this.httpConnection;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
            if (z12 && (file = (cacheImage = this.cacheImage).tempFilePath) != null && !file.renameTo(cacheImage.finalFilePath)) {
                CacheImage cacheImage3 = this.cacheImage;
                cacheImage3.finalFilePath = cacheImage3.tempFilePath;
            }
            return Boolean.valueOf(z12);
        }

        @Override
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue() || !this.canRetry) {
                ImageLoader imageLoader = ImageLoader.this;
                CacheImage cacheImage = this.cacheImage;
                imageLoader.fileDidLoaded(cacheImage.url, cacheImage.finalFilePath, 0);
            } else {
                ImageLoader.this.httpFileLoadError(this.cacheImage.url);
            }
            Utilities.stageQueue.postRunnable(new g5(this, bool, 1));
            ImageLoader.this.imageLoadQueue.postRunnable(new f5(this, 2), this.cacheImage.priority);
        }

        public HttpImageTask(CacheImage cacheImage, int i10, String str) {
            this.cacheImage = cacheImage;
            this.imageSize = i10;
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

        public ThumbGenerateTask(int i10, File file, ThumbGenerateInfo thumbGenerateInfo) {
            this.mediaType = i10;
            this.originalPath = file;
            this.info = thumbGenerateInfo;
        }

        public void lambda$removeTask$0(String str) {
            ImageLoader.this.thumbGenerateTasks.remove(str);
        }

        public void lambda$run$1(String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
            removeTask();
            if (this.info.filter != null) {
                StringBuilder sbF = s3.c.f(str, "@");
                sbF.append(this.info.filter);
                str = sbF.toString();
            }
            String str2 = str;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((ImageReceiver) arrayList.get(i10)).setImageBitmapByKey(bitmapDrawable, str2, 0, false, ((Integer) arrayList2.get(i10)).intValue());
            }
            if (str2.contains("nocache")) {
                return;
            }
            ImageLoader.this.memCache.put(str2, bitmapDrawable);
        }

        private void removeTask() {
            ThumbGenerateInfo thumbGenerateInfo = this.info;
            if (thumbGenerateInfo == null) {
                return;
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new e3(4, this, FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)));
        }

        @Override
        public void run() {
            int iMin;
            Bitmap bitmapCreateScaledBitmap;
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
                        iMin = Math.max(point.x, point.y);
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        iMin = Math.min(180, Math.min(point2.x, point2.y) / 4);
                    }
                    int i10 = this.mediaType;
                    Bitmap bitmapLoadBitmap = null;
                    if (i10 == 0) {
                        float f10 = iMin;
                        bitmapLoadBitmap = ImageLoader.loadBitmap(this.originalPath.toString(), null, f10, f10, false);
                    } else {
                        int i11 = 2;
                        if (i10 == 2) {
                            String string = this.originalPath.toString();
                            if (!this.info.big) {
                                i11 = 1;
                            }
                            bitmapLoadBitmap = SendMessagesHelper.createVideoThumbnail(string, i11);
                        } else if (i10 == 3) {
                            String lowerCase = this.originalPath.toString().toLowerCase();
                            if (lowerCase.endsWith("mp4")) {
                                String string2 = this.originalPath.toString();
                                if (!this.info.big) {
                                    i11 = 1;
                                }
                                bitmapLoadBitmap = SendMessagesHelper.createVideoThumbnail(string2, i11);
                            } else if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                float f11 = iMin;
                                bitmapLoadBitmap = ImageLoader.loadBitmap(lowerCase, null, f11, f11, false);
                            }
                        }
                    }
                    if (bitmapLoadBitmap == null) {
                        removeTask();
                        return;
                    }
                    int width = bitmapLoadBitmap.getWidth();
                    int height = bitmapLoadBitmap.getHeight();
                    if (width != 0 && height != 0) {
                        float f12 = width;
                        float f13 = iMin;
                        float f14 = height;
                        float fMin = Math.min(f12 / f13, f14 / f13);
                        if (fMin > 1.0f && (bitmapCreateScaledBitmap = Bitmaps.createScaledBitmap(bitmapLoadBitmap, (int) (f12 / fMin), (int) (f14 / fMin), true)) != bitmapLoadBitmap) {
                            bitmapLoadBitmap.recycle();
                            bitmapLoadBitmap = bitmapCreateScaledBitmap;
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        bitmapLoadBitmap.compress(Bitmap.CompressFormat.JPEG, this.info.big ? 83 : 60, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        AndroidUtilities.runOnUIThread(new c5(this, str, new ArrayList(this.info.imageReceiverArray), new BitmapDrawable(bitmapLoadBitmap), new ArrayList(this.info.imageReceiverGuidsArray)));
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
        ne.c cVar = new ne.c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.f18519a = new ne.a(cVar, new PriorityBlockingQueue(10, new d2.a(5)));
        this.cacheOutQueue = cVar;
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
        int iMin = Math.min(z10 ? 30 : 15, memoryClass / 7) * 1048576;
        float f10 = iMin;
        this.memCache = new LruCache<BitmapDrawable>((int) (0.8f * f10)) {
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
        this.wallpaperMemCache = new LruCache<BitmapDrawable>(iMin / 4) {
            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.lottieMemCache = new LruCache<BitmapDrawable>(10485760) {
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
                    if (bitmapDrawable instanceof oi0) {
                        ((oi0) bitmapDrawable).A(false);
                    }
                }
            }

            @Override
            public BitmapDrawable put(String str, BitmapDrawable bitmapDrawable) {
                if (bitmapDrawable instanceof org.telegram.ui.Components.x5) {
                    ImageLoader.this.cachedAnimatedFileDrawables.add((org.telegram.ui.Components.x5) bitmapDrawable);
                }
                return (BitmapDrawable) super.put(str, bitmapDrawable);
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
            } catch (Exception e9) {
                FileLog.e(e9);
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
        this.imageLoadQueue.postRunnable(new q4(this, str, 0));
    }

    private boolean canMoveFiles(File file, File file2, int i10) throws Throwable {
        File file3;
        File file4;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                if (i10 == 0 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 1 || i10 == 2) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    file4 = null;
                    file3 = null;
                }
                byte[] bArr = new byte[1024];
                file3.createNewFile();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file3, "rws");
                try {
                    randomAccessFile2.write(bArr);
                    randomAccessFile2.close();
                    boolean zRenameTo = file3.renameTo(file4);
                    file3.delete();
                    file4.delete();
                    return zRenameTo;
                } catch (Exception e9) {
                    e = e9;
                    randomAccessFile = randomAccessFile2;
                    FileLog.e(e);
                    if (randomAccessFile == null) {
                        return false;
                    }
                    try {
                        randomAccessFile.close();
                        return false;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private void createLoadOperationForImageReceiver(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ImageLocation imageLocation, final String str4, final long j10, final int i10, final int i11, final int i12, final int i13) {
        if (imageReceiver == null || str2 == null || str == null || imageLocation == null) {
            return;
        }
        int tag = imageReceiver.getTag(i11);
        if (tag == 0) {
            tag = this.lastImageNum;
            imageReceiver.setTag(tag, i11);
            int i14 = this.lastImageNum + 1;
            this.lastImageNum = i14;
            if (i14 == Integer.MAX_VALUE) {
                this.lastImageNum = 0;
            }
        }
        final int i15 = tag;
        final boolean zIsNeedsQualityThumb = imageReceiver.isNeedsQualityThumb();
        final Object parentObject = imageReceiver.getParentObject();
        final TLRPC.Document qualityThumbDocument = imageReceiver.getQualityThumbDocument();
        final boolean zIsShouldGenerateQualityThumb = imageReceiver.isShouldGenerateQualityThumb();
        final int currentAccount = imageReceiver.getCurrentAccount();
        final boolean z10 = i11 == 0 && imageReceiver.isCurrentKeyQuality();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f21490a.lambda$createLoadOperationForImageReceiver$7(i12, str2, str, i15, imageReceiver, i13, str4, i11, imageLocation, z10, parentObject, currentAccount, qualityThumbDocument, zIsNeedsQualityThumb, zIsShouldGenerateQualityThumb, str3, i10, j10);
            }
        };
        this.imageLoadQueue.postRunnable(runnable, imageReceiver.getFileLoadingPriority() == 0 ? 0L : 1L);
        imageReceiver.addLoadingImageRunnable(runnable);
    }

    public static Drawable createStripedBitmap(ArrayList<TLRPC.PhotoSize> arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) arrayList.get(i10)).bytes, "b"));
            }
        }
        return null;
    }

    public static String cutFilter(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(64);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public static String decompressGzip(File file) {
        StringBuilder sb2 = new StringBuilder();
        if (file == null) {
            return "";
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = sb2.toString();
                            bufferedReader.close();
                            gZIPInputStream.close();
                            return string;
                        }
                        sb2.append(line);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                gZIPInputStream.close();
                throw th4;
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public void fileDidFailedLoad(String str, int i10) {
        if (i10 == 1) {
            return;
        }
        this.imageLoadQueue.postRunnable(new q4(this, str, 4));
    }

    public void fileDidLoaded(String str, File file, int i10) {
        this.imageLoadQueue.postRunnable(new h0(this, str, i10, file, 4));
    }

    public static TLRPC.PhotoSize fileToSize(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.f22405w = i10;
            tL_photoSize_layer127.h = i11;
            if (i10 <= 100 && i11 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i10 <= 320 && i11 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i10 <= 800 && i11 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i10 > 1280 || i11 > 1280) {
                tL_photoSize_layer127.type = "w";
            } else {
                tL_photoSize_layer127.type = "y";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            String strK = a9.p.k(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2);
            File directory = (z10 || tL_fileLocationToBeDeprecated.volume_id == -2147483648L) ? FileLoader.getDirectory(4) : FileLoader.getDirectory(0);
            File file = new File(directory, strK);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e9) {
            FileLog.e(e9);
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
        for (int i10 = 0; i10 < list.size(); i10++) {
            ImageReceiver imageReceiver = list.get(i10);
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
        int i10 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i10 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i10);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i10++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i10 < size2) {
                TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i10);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i10++;
            }
            return null;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage)) {
            if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
                return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
            }
            return null;
        }
        TLRPC.Photo photo = messageMedia.webpage.photo;
        if (photo == null) {
            return null;
        }
        int size3 = photo.sizes.size();
        while (i10 < size3) {
            TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i10);
            if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                return photoSize3;
            }
            i10++;
        }
        return null;
    }

    public static MessageThumb generateMessageThumb(TLRPC.Message message) throws FileNotFoundException {
        int i10;
        int i11;
        Bitmap strippedPhotoBitmap;
        byte[] bArr;
        TLRPC.PhotoSize photoSizeFindPhotoCachedSize = findPhotoCachedSize(message);
        if (photoSizeFindPhotoCachedSize == null || (bArr = photoSizeFindPhotoCachedSize.bytes) == null || bArr.length == 0) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i12);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(message.media.document.thumbs, 320);
                        if (closestPhotoSizeWithSize == null) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= message.media.document.attributes.size()) {
                                    i10 = 0;
                                    i11 = 0;
                                    break;
                                }
                                if (message.media.document.attributes.get(i13) instanceof TLRPC.TL_documentAttributeVideo) {
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i13);
                                    i11 = tL_documentAttributeVideo.h;
                                    i10 = tL_documentAttributeVideo.f22387w;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i11 = closestPhotoSizeWithSize.h;
                            i10 = closestPhotoSizeWithSize.f22405w;
                        }
                        PointF pointFB2 = org.telegram.ui.Cells.s1.B2(i10, i11, 0, 0);
                        Locale locale = Locale.US;
                        String str = ImageLocation.getStrippedKey(message, message, photoSize) + "_false@" + ((int) (pointFB2.x / AndroidUtilities.density)) + "_" + ((int) (pointFB2.y / AndroidUtilities.density)) + "_b";
                        if (!getInstance().isInMemCache(str, false) && (strippedPhotoBitmap = getStrippedPhotoBitmap(photoSize.bytes, null)) != null) {
                            Utilities.blurBitmap(strippedPhotoBitmap, 3);
                            float f10 = pointFB2.x;
                            float f11 = AndroidUtilities.density;
                            Bitmap bitmapCreateScaledBitmap = Bitmaps.createScaledBitmap(strippedPhotoBitmap, (int) (f10 / f11), (int) (pointFB2.y / f11), true);
                            if (bitmapCreateScaledBitmap != strippedPhotoBitmap) {
                                strippedPhotoBitmap.recycle();
                                strippedPhotoBitmap = bitmapCreateScaledBitmap;
                            }
                            return new MessageThumb(str, new BitmapDrawable(strippedPhotoBitmap));
                        }
                    }
                }
            }
        } else {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSizeFindPhotoCachedSize, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f22405w = photoSizeFindPhotoCachedSize.f22405w;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.size = photoSizeFindPhotoCachedSize.size;
            tL_photoSize_layer127.type = photoSizeFindPhotoCachedSize.type;
            if (pathToAttach.exists() && message.grouped_id == 0) {
                PointF pointFB3 = org.telegram.ui.Cells.s1.B2(photoSizeFindPhotoCachedSize.f22405w, photoSizeFindPhotoCachedSize.h, 0, 0);
                Locale locale2 = Locale.US;
                String str2 = photoSizeFindPhotoCachedSize.location.volume_id + "_" + photoSizeFindPhotoCachedSize.location.local_id + "@" + ((int) (pointFB3.x / AndroidUtilities.density)) + "_" + ((int) (pointFB3.y / AndroidUtilities.density)) + "_b";
                if (!getInstance().isInMemCache(str2, false)) {
                    String path = pathToAttach.getPath();
                    float f12 = pointFB3.x;
                    float f13 = AndroidUtilities.density;
                    Bitmap bitmapLoadBitmap = loadBitmap(path, null, (int) (f12 / f13), (int) (pointFB3.y / f13), false);
                    if (bitmapLoadBitmap != null) {
                        Utilities.blurBitmap(bitmapLoadBitmap, 3);
                        float f14 = pointFB3.x;
                        float f15 = AndroidUtilities.density;
                        Bitmap bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(bitmapLoadBitmap, (int) (f14 / f15), (int) (pointFB3.y / f15), true);
                        if (bitmapCreateScaledBitmap2 != bitmapLoadBitmap) {
                            bitmapLoadBitmap.recycle();
                            bitmapLoadBitmap = bitmapCreateScaledBitmap2;
                        }
                        return new MessageThumb(str2, new BitmapDrawable(bitmapLoadBitmap));
                    }
                }
            }
        }
        return null;
    }

    private void generateThumb(int i10, File file, ThumbGenerateInfo thumbGenerateInfo) {
        if ((i10 != 0 && i10 != 2 && i10 != 3) || file == null || thumbGenerateInfo == null) {
            return;
        }
        if (this.thumbGenerateTasks.get(FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)) == null) {
            this.thumbGeneratingQueue.postRunnable(new ThumbGenerateTask(i10, file, thumbGenerateInfo));
        }
    }

    public BitmapDrawable getFromLottieCache(String str) {
        BitmapDrawable bitmapDrawable = this.lottieMemCache.get(str);
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.x5)) {
            return bitmapDrawable;
        }
        org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) bitmapDrawable;
        if (!x5Var.Y && x5Var.C0 < 15) {
            return bitmapDrawable;
        }
        this.lottieMemCache.remove(str);
        return null;
    }

    public static String getHttpFileName(String str) {
        return Utilities.MD5(str);
    }

    public static File getHttpFilePath(String str, String str2) {
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        return new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "." + httpUrlExtension);
    }

    public static String getHttpUrlExtension(String str, String str2) {
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() > 1) {
            str = lastPathSegment;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : null;
        return (strSubstring == null || strSubstring.length() == 0 || strSubstring.length() > 4) ? str2 : strSubstring;
    }

    public static ImageLoader getInstance() {
        ImageLoader imageLoader;
        ImageLoader imageLoader2 = Instance;
        if (imageLoader2 != null) {
            return imageLoader2;
        }
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

    private File getPublicStorageDir() {
        File file = ApplicationLoader.applicationContext.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
            for (int i10 = 0; i10 < ApplicationLoader.applicationContext.getExternalMediaDirs().length; i10++) {
                File file2 = ApplicationLoader.applicationContext.getExternalMediaDirs()[i10];
                if (file2 != null && file2.getPath().startsWith(SharedConfig.storageCacheDir)) {
                    file = ApplicationLoader.applicationContext.getExternalMediaDirs()[i10];
                }
            }
        }
        return file;
    }

    public static Bitmap getStrippedPhotoBitmap(byte[] bArr, String str) {
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
        bArr2[164] = bArr[1];
        bArr2[166] = bArr[2];
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z10 = !TextUtils.isEmpty(str) && str.contains("r");
        options.inPreferredConfig = (SharedConfig.deviceIsHigh() || z10) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length, options);
        if (z10) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), bitmapDecodeByteArray.getConfig());
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.save();
            canvas.scale(1.2f, 1.2f, bitmapDecodeByteArray.getWidth() / 2.0f, bitmapDecodeByteArray.getHeight() / 2.0f);
            canvas.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            Path path = new Path();
            path.addCircle(bitmapDecodeByteArray.getWidth() / 2.0f, bitmapDecodeByteArray.getHeight() / 2.0f, Math.min(bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight()) / 2.0f, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, (Paint) null);
            bitmapDecodeByteArray.recycle();
            bitmapDecodeByteArray = bitmapCreateBitmap;
        }
        if (bitmapDecodeByteArray != null && !TextUtils.isEmpty(str) && str.contains("b")) {
            Utilities.blurBitmap(bitmapDecodeByteArray, 3);
        }
        return bitmapDecodeByteArray;
    }

    public static boolean hasAutoplayFilter(String str) {
        if (str == null) {
            return false;
        }
        String[] strArrSplit = str.split("_");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if ("g".equals(strArrSplit[i10]) || "gl".equals(strArrSplit[i10]) || "pframe".equals(strArrSplit[i10])) {
                return true;
            }
        }
        return false;
    }

    public void httpFileLoadError(String str) {
        this.imageLoadQueue.postRunnable(new q4(this, str, 3));
    }

    public boolean isAnimatedAvatar(String str) {
        return str != null && str.endsWith("avatar");
    }

    private boolean isPFrame(String str) {
        return str != null && str.endsWith("pframe");
    }

    public static boolean isSdCardPath(File file) {
        return !TextUtils.isEmpty(SharedConfig.storageCacheDir) && file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir);
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
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (i10 >= 3) {
                return;
            }
            if (i10 > 0 && !z10) {
                return;
            }
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 1) {
                i11 = 0;
            }
            int tag = imageReceiver.getTag(i11);
            if (tag != 0) {
                if (i10 == 0) {
                    removeFromWaitingForThumb(tag, imageReceiver);
                }
                CacheImage cacheImage = this.imageLoadingByTag.get(tag);
                if (cacheImage != null) {
                    cacheImage.removeImageReceiver(imageReceiver);
                }
            }
            i10++;
        }
    }

    public void lambda$changeFileLoadingPriorityForImageReceiver$3(ImageReceiver imageReceiver, int i10) {
        CacheImage cacheImage;
        int i11 = 0;
        while (true) {
            int i12 = 3;
            if (i11 >= 3) {
                return;
            }
            if (i11 == 0) {
                i12 = 1;
            } else if (i11 == 1) {
                i12 = 0;
            }
            int tag = imageReceiver.getTag(i12);
            if (tag != 0 && (cacheImage = this.imageLoadingByTag.get(tag)) != null) {
                cacheImage.changePriority(i10);
            }
            i11++;
        }
    }

    public static void lambda$checkMediaPaths$0(SparseArray sparseArray, Runnable runnable) {
        FileLoader.setMediaDirs(sparseArray);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$checkMediaPaths$1(Runnable runnable) {
        AndroidUtilities.runOnUIThread(new d2(13, createMediaPaths(), runnable));
    }

    public void lambda$createLoadOperationForImageReceiver$7(int i10, String str, String str2, int i11, ImageReceiver imageReceiver, int i12, String str3, int i13, ImageLocation imageLocation, boolean z10, Object obj, int i14, TLRPC.Document document, boolean z11, boolean z12, String str4, int i15, long j10) {
        String str5;
        int i16;
        boolean z13;
        String str6;
        boolean z14;
        boolean z15;
        int i17;
        File file;
        boolean z16;
        int mediaType;
        String str7;
        File pathToMessage;
        File file2;
        File file3;
        String attachFileName;
        ThumbGenerateInfo thumbGenerateInfo;
        TLRPC.Document document2;
        boolean z17;
        CacheImage cacheImage;
        int i18;
        String str8;
        int i19;
        boolean z18;
        long j11;
        int i20;
        ne.c cVar;
        Runnable bVar;
        int i21;
        TLRPC.PhotoSize photoSize;
        String str9;
        String str10;
        long j12;
        String str11;
        String str12;
        File file4;
        int i22;
        boolean z19;
        boolean z20;
        ImageReceiver imageReceiver2 = imageReceiver;
        TLRPC.Document document3 = document;
        if (i10 != 2) {
            CacheImage cacheImage2 = this.imageLoadingByUrl.get(str);
            CacheImage cacheImage3 = this.imageLoadingByKeys.get(str2);
            CacheImage cacheImage4 = this.imageLoadingByTag.get(i11);
            if (cacheImage4 != null) {
                if (cacheImage4 == cacheImage3) {
                    cacheImage4.setImageReceiverGuid(imageReceiver2, i12);
                    cacheImage2 = cacheImage2;
                    cacheImage3 = cacheImage3;
                    i16 = 0;
                } else if (cacheImage4 == cacheImage2) {
                    cacheImage2 = cacheImage2;
                    cacheImage3 = cacheImage3;
                    i16 = 0;
                    if (cacheImage3 == null) {
                        cacheImage4.replaceImageReceiver(imageReceiver2, str2, str3, i13, i12);
                    }
                } else {
                    i16 = 0;
                    cacheImage4.removeImageReceiver(imageReceiver2);
                }
                z20 = true;
                if (!z20 && cacheImage3 != null) {
                    cacheImage3.addImageReceiver(imageReceiver2, str2, str3, i13, i12);
                    z20 = true;
                }
                if (!z20 || cacheImage2 == null) {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    z13 = z20;
                } else {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    cacheImage2.addImageReceiver(imageReceiver2, str2, str5, i13, i12);
                    z13 = true;
                }
            } else {
                i16 = 0;
            }
            z20 = false;
            if (!z20) {
                cacheImage3.addImageReceiver(imageReceiver2, str2, str3, i13, i12);
                z20 = true;
            }
            if (z20) {
                imageReceiver2 = imageReceiver;
                str5 = str3;
                z13 = z20;
            } else {
                imageReceiver2 = imageReceiver;
                str5 = str3;
                z13 = z20;
            }
        } else {
            str5 = str3;
            i16 = 0;
            z13 = false;
        }
        if (z13) {
            return;
        }
        String str13 = imageLocation.path;
        String str14 = "_";
        if (str13 == null) {
            if (i10 == 0 && z10) {
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    document2 = messageObject.getDocument();
                    str7 = messageObject.messageOwner.attachPath;
                    str6 = "athumb";
                    pathToMessage = FileLoader.getInstance(i14).getPathToMessage(messageObject.messageOwner);
                    mediaType = messageObject.getMediaType();
                    z16 = false;
                } else {
                    str6 = "athumb";
                    if (document3 != null) {
                        File pathToAttach = FileLoader.getInstance(i14).getPathToAttach(document3, true);
                        mediaType = MessageObject.isVideoDocument(document3) ? 2 : 3;
                        pathToMessage = pathToAttach;
                        z16 = true;
                        str7 = null;
                    } else {
                        z16 = false;
                        mediaType = 0;
                        document3 = null;
                        str7 = null;
                        pathToMessage = null;
                    }
                }
                if (document3 != null) {
                    if (z11) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb2 = new StringBuilder("q_");
                        sb2.append(document3.dc_id);
                        sb2.append("_");
                        str14 = "_";
                        file2 = new File(directory, a9.p.o(sb2, document3.f22386id, ".jpg"));
                        if (file2.exists()) {
                            z14 = true;
                        }
                        if (TextUtils.isEmpty(str7)) {
                            file3 = null;
                        } else {
                            file3 = new File(str7);
                            if (!file3.exists()) {
                                file3 = null;
                            }
                        }
                        if (file3 == null) {
                            file3 = pathToMessage;
                        }
                        if (file2 == null) {
                            attachFileName = FileLoader.getAttachFileName(document3);
                            thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                            if (thumbGenerateInfo == null) {
                                thumbGenerateInfo = new ThumbGenerateInfo();
                                thumbGenerateInfo.parentDocument = document3;
                                thumbGenerateInfo.filter = str5;
                                thumbGenerateInfo.big = z16;
                                this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                            }
                            if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver2)) {
                                thumbGenerateInfo.imageReceiverArray.add(imageReceiver2);
                                thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i12));
                            }
                            this.waitingForQualityThumbByTag.put(i11, attachFileName);
                            if (file3.exists() || !z12) {
                                return;
                            }
                            generateThumb(mediaType, file3, thumbGenerateInfo);
                            return;
                        }
                        i10 = i10;
                        file = file2;
                        z15 = true;
                    } else {
                        str14 = "_";
                    }
                    z14 = false;
                    file2 = null;
                    if (TextUtils.isEmpty(str7)) {
                        file3 = new File(str7);
                        if (!file3.exists()) {
                            file3 = null;
                        }
                    } else {
                        file3 = null;
                    }
                    if (file3 == null) {
                        file3 = pathToMessage;
                    }
                    if (file2 == null) {
                        attachFileName = FileLoader.getAttachFileName(document3);
                        thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                        if (thumbGenerateInfo == null) {
                            thumbGenerateInfo = new ThumbGenerateInfo();
                            thumbGenerateInfo.parentDocument = document3;
                            thumbGenerateInfo.filter = str5;
                            thumbGenerateInfo.big = z16;
                            this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                        }
                        if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver2)) {
                            thumbGenerateInfo.imageReceiverArray.add(imageReceiver2);
                            thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i12));
                        }
                        this.waitingForQualityThumbByTag.put(i11, attachFileName);
                        if (file3.exists()) {
                            return;
                        } else {
                            return;
                        }
                    }
                    i10 = i10;
                    file = file2;
                    z15 = true;
                } else {
                    document3 = document2;
                    z14 = false;
                    z15 = true;
                }
            } else {
                str6 = "athumb";
                z14 = false;
                z15 = false;
            }
            i17 = 2;
            file = null;
            if (i10 != i17) {
                boolean zIsEncrypted = imageLocation.isEncrypted();
                z17 = z15;
                cacheImage = new CacheImage();
                if (imageReceiver2.getFileLoadingPriority() == 0) {
                    i18 = 0;
                } else {
                    i18 = 1;
                }
                cacheImage.priority = i18;
                if (!z10) {
                    if (imageLocation.imageType != i17 || MessageObject.isGifDocument(imageLocation.webFile) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.isVideoSticker(imageLocation.document)) {
                        cacheImage.imageType = i17;
                    } else {
                        String str15 = imageLocation.path;
                        if (str15 != null && !str15.startsWith("vthumb") && !str15.startsWith("thumb")) {
                            String httpUrlExtension = getHttpUrlExtension(str15, "jpg");
                            if (httpUrlExtension.equalsIgnoreCase("webm") || httpUrlExtension.equalsIgnoreCase("mp4") || httpUrlExtension.equalsIgnoreCase("gif")) {
                                cacheImage.imageType = i17;
                            } else if ("tgs".equals(str4)) {
                                cacheImage.imageType = 1;
                            }
                        }
                    }
                }
                if (file == null) {
                    photoSize = imageLocation.photoSize;
                    j11 = 0;
                    str9 = "gl";
                    str10 = "g";
                    if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        str8 = str;
                        str9 = "gl";
                        str10 = "g";
                        i19 = i15;
                        z14 = z14;
                        j12 = 0;
                        z18 = true;
                    } else {
                        SecureDocument secureDocument = imageLocation.secureDocument;
                        if (secureDocument != null) {
                            cacheImage.secureDocument = secureDocument;
                            boolean z21 = secureDocument.secureFile.dc_id == Integer.MIN_VALUE;
                            str8 = str;
                            file = new File(FileLoader.getDirectory(4), str8);
                            z18 = z21;
                            str9 = "gl";
                            str10 = "g";
                        } else {
                            str8 = str;
                            boolean z22 = z14;
                            if ("g".equals(str5) || "gl".equals(str5) || isAnimatedAvatar(str5)) {
                                str11 = "application/x-tgwallpattern";
                            } else if (i15 != 0 || j10 <= 0 || imageLocation.path != null || zIsEncrypted) {
                                file = new File(FileLoader.getDirectory(4), str8);
                                if (file.exists()) {
                                    i22 = i15;
                                    z19 = true;
                                } else {
                                    i22 = i15;
                                    if (i22 == 2) {
                                        file = new File(FileLoader.getDirectory(4), s3.c.l(str8, ".enc"));
                                    }
                                    z19 = z22;
                                }
                                TLRPC.Document document4 = imageLocation.document;
                                z14 = z19;
                                if (document4 == null) {
                                    z18 = z17;
                                } else {
                                    if (document4 instanceof DocumentObject.ThemeDocument) {
                                        if (((DocumentObject.ThemeDocument) document4).wallpaper == null) {
                                            z17 = true;
                                        }
                                        cacheImage.imageType = 5;
                                    } else if ("application/x-tgsdice".equals(document4.mime_type)) {
                                        cacheImage.imageType = 1;
                                        z18 = true;
                                    } else if ("application/x-tgsticker".equals(imageLocation.document.mime_type)) {
                                        cacheImage.imageType = 1;
                                    } else if ("application/x-tgwallpattern".equals(imageLocation.document.mime_type) || FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                        cacheImage.imageType = 3;
                                    }
                                    z18 = z17;
                                }
                                j12 = 0;
                                i19 = i22;
                            } else {
                                str11 = "application/x-tgwallpattern";
                            }
                            TLRPC.Document document5 = imageLocation.document;
                            if (document5 != null) {
                                z18 = z17;
                                if (document5 instanceof TLRPC.TL_documentEncrypted) {
                                    file4 = new File(FileLoader.getDirectory(4), str8);
                                } else {
                                    file4 = MessageObject.isVideoDocument(document5) ? new File(FileLoader.getDirectory(2), str8) : new File(FileLoader.getDirectory(3), str8);
                                }
                                if ((isAnimatedAvatar(str5) || "g".equals(str5) || "gl".equals(str5)) && !file4.exists()) {
                                    File directory2 = FileLoader.getDirectory(4);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(document5.dc_id);
                                    sb3.append(str14);
                                    file4 = new File(directory2, a9.p.o(sb3, document5.f22386id, ".temp"));
                                }
                                file = file4;
                                if (document5 instanceof DocumentObject.ThemeDocument) {
                                    if (((DocumentObject.ThemeDocument) document5).wallpaper == null) {
                                        z18 = true;
                                    }
                                    cacheImage.imageType = 5;
                                } else {
                                    if ("application/x-tgsdice".equals(imageLocation.document.mime_type)) {
                                        cacheImage.imageType = 1;
                                        z18 = true;
                                    } else if ("application/x-tgsticker".equals(document5.mime_type)) {
                                        cacheImage.imageType = 1;
                                    } else if (str11.equals(document5.mime_type) || FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                        cacheImage.imageType = 3;
                                    }
                                    z14 = z22;
                                    i19 = i15;
                                    j12 = document5.size;
                                    str9 = "gl";
                                }
                                z14 = z22;
                                i19 = i15;
                                j12 = document5.size;
                                str9 = "gl";
                            } else {
                                z18 = z17;
                                str10 = "g";
                                String str16 = str14;
                                if (imageLocation.webFile != null) {
                                    file = new File(FileLoader.getDirectory(3), str8);
                                    z14 = z22;
                                    str9 = "gl";
                                } else {
                                    i19 = i15;
                                    file = i19 == 1 ? new File(FileLoader.getDirectory(4), str8) : new File(FileLoader.getDirectory(i16), str8);
                                    if (isAnimatedAvatar(str5)) {
                                        str9 = "gl";
                                        str12 = str10;
                                    } else {
                                        str12 = str10;
                                        if (str12.equals(str5)) {
                                            str9 = "gl";
                                        } else {
                                            str9 = "gl";
                                            if (str9.equals(str5)) {
                                            }
                                            z14 = z22;
                                            j12 = 0;
                                            str10 = str12;
                                        }
                                        if (imageLocation.location == null || file.exists()) {
                                            z14 = z22;
                                            j12 = 0;
                                            str10 = str12;
                                        }
                                    }
                                    File directory3 = FileLoader.getDirectory(4);
                                    StringBuilder sb4 = new StringBuilder();
                                    str10 = str12;
                                    sb4.append(imageLocation.location.volume_id);
                                    sb4.append(str16);
                                    file = new File(directory3, a9.p.k(imageLocation.location.local_id, ".temp", sb4));
                                    z14 = z22;
                                    j12 = 0;
                                }
                            }
                        }
                        j12 = 0;
                        i19 = i15;
                    }
                    if (hasAutoplayFilter(str5) || isAnimatedAvatar(str5)) {
                        cacheImage.imageType = 2;
                        cacheImage.size = j12;
                        cacheImage.isPFrame = isPFrame(str5);
                        if (!str10.equals(str5) || str9.equals(str5) || isAnimatedAvatar(str5)) {
                            z18 = true;
                        }
                    }
                    cacheImage.type = i13;
                    cacheImage.key = str2;
                    cacheImage.cacheType = i19;
                    cacheImage.filter = str5;
                    cacheImage.imageLocation = imageLocation;
                    cacheImage.ext = str4;
                    cacheImage.currentAccount = i14;
                    cacheImage.parentObject = obj;
                    i20 = imageLocation.imageType;
                    if (i20 != 0) {
                        cacheImage.imageType = i20;
                    }
                    if (i19 == 2) {
                        cacheImage.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), s3.c.l(str8, ".enc.key"));
                    }
                    boolean z23 = z14;
                    String str17 = str6;
                    cacheImage.addImageReceiver(imageReceiver, str2, str5, i13, i12);
                    if (!z18 || z23 || file.exists()) {
                        cacheImage.finalFilePath = file;
                        cacheImage.imageLocation = imageLocation;
                        cacheImage.cacheTask = new CacheOutTask(cacheImage);
                        this.imageLoadingByKeys.put(str2, cacheImage);
                        this.imageLoadingKeys.add(cutFilter(str2));
                        if (i10 != 0) {
                            this.cacheThumbOutQueue.postRunnable(cacheImage.cacheTask);
                            return;
                        }
                        cVar = this.cacheOutQueue;
                        bVar = cacheImage.cacheTask;
                        i21 = cacheImage.priority;
                        if (i21 != 1) {
                            cVar.getClass();
                            bVar = new ne.b(i21, bVar);
                        }
                        cVar.f18519a.execute(bVar);
                        cacheImage.runningTask = bVar;
                    }
                    cacheImage.url = str8;
                    this.imageLoadingByUrl.put(str8, cacheImage);
                    if (cacheImage.isPFrame) {
                        this.imageLoadingByUrlPframe.put(str8, cacheImage);
                    }
                    String str18 = imageLocation.path;
                    if (str18 != null) {
                        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), s3.c.l(Utilities.MD5(str18), "_temp.jpg"));
                        cacheImage.finalFilePath = file;
                        if (imageLocation.path.startsWith(str17)) {
                            ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage);
                            cacheImage.artworkTask = artworkLoadTask;
                            this.artworkTasks.add(artworkLoadTask);
                            runArtworkTasks(false);
                            return;
                        }
                        HttpImageTask httpImageTask = new HttpImageTask(cacheImage, j10);
                        cacheImage.httpTask = httpImageTask;
                        this.httpTasks.add(httpImageTask);
                        runHttpTasks(false);
                        return;
                    }
                    int fileLoadingPriority = i10 != 0 ? 3 : imageReceiver.getFileLoadingPriority();
                    if (imageLocation.location != null) {
                        FileLoader.getInstance(i14).loadFile(imageLocation, obj, str4, fileLoadingPriority, (i19 != 0 || (j10 > j11 && imageLocation.key == null)) ? i19 : 1);
                    } else if (imageLocation.document != null) {
                        FileLoader.getInstance(i14).loadFile(imageLocation.document, obj, fileLoadingPriority, i19);
                    } else if (imageLocation.secureDocument != null) {
                        FileLoader.getInstance(i14).loadFile(imageLocation.secureDocument, fileLoadingPriority);
                    } else if (imageLocation.webFile != null) {
                        FileLoader.getInstance(i14).loadFile(imageLocation.webFile, fileLoadingPriority, i19);
                    }
                    if (imageReceiver.isForceLoding()) {
                        this.forceLoadingImages.put(cacheImage.key, 0);
                        return;
                    }
                    return;
                }
                str8 = str;
                i19 = i15;
                z18 = z17;
                j11 = 0;
                cacheImage.type = i13;
                cacheImage.key = str2;
                cacheImage.cacheType = i19;
                cacheImage.filter = str5;
                cacheImage.imageLocation = imageLocation;
                cacheImage.ext = str4;
                cacheImage.currentAccount = i14;
                cacheImage.parentObject = obj;
                i20 = imageLocation.imageType;
                if (i20 != 0) {
                    cacheImage.imageType = i20;
                }
                if (i19 == 2) {
                    cacheImage.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), s3.c.l(str8, ".enc.key"));
                }
                boolean z24 = z14;
                String str19 = str6;
                cacheImage.addImageReceiver(imageReceiver, str2, str5, i13, i12);
                if (z18) {
                }
                cacheImage.finalFilePath = file;
                cacheImage.imageLocation = imageLocation;
                cacheImage.cacheTask = new CacheOutTask(cacheImage);
                this.imageLoadingByKeys.put(str2, cacheImage);
                this.imageLoadingKeys.add(cutFilter(str2));
                if (i10 != 0) {
                    this.cacheThumbOutQueue.postRunnable(cacheImage.cacheTask);
                    return;
                }
                cVar = this.cacheOutQueue;
                bVar = cacheImage.cacheTask;
                i21 = cacheImage.priority;
                if (i21 != 1) {
                    cVar.getClass();
                    bVar = new ne.b(i21, bVar);
                }
                cVar.f18519a.execute(bVar);
                cacheImage.runningTask = bVar;
            }
        }
        if (str13.startsWith("http") || str13.startsWith("athumb")) {
            z15 = false;
            file = null;
        } else {
            if (str13.startsWith("thumb://")) {
                int iIndexOf = str13.indexOf(":", 8);
                if (iIndexOf >= 0) {
                    file = new File(str13.substring(iIndexOf + 1));
                } else {
                    file = null;
                }
            } else if (str13.startsWith("vthumb://")) {
                int iIndexOf2 = str13.indexOf(":", 9);
                if (iIndexOf2 >= 0) {
                    file = new File(str13.substring(iIndexOf2 + 1));
                } else {
                    file = null;
                }
            } else {
                file = new File(str13);
            }
            z15 = true;
        }
        i10 = i10;
        str6 = "athumb";
        str14 = "_";
        z14 = false;
        i17 = 2;
        if (i10 != i17) {
            boolean zIsEncrypted2 = imageLocation.isEncrypted();
            z17 = z15;
            cacheImage = new CacheImage();
            if (imageReceiver2.getFileLoadingPriority() == 0) {
                i18 = 0;
            } else {
                i18 = 1;
            }
            cacheImage.priority = i18;
            if (!z10) {
                if (imageLocation.imageType != i17) {
                    cacheImage.imageType = i17;
                } else {
                    cacheImage.imageType = i17;
                }
            }
            if (file == null) {
                photoSize = imageLocation.photoSize;
                j11 = 0;
                str9 = "gl";
                str10 = "g";
                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                    str8 = str;
                    str9 = "gl";
                    str10 = "g";
                    i19 = i15;
                    z14 = z14;
                    j12 = 0;
                    z18 = true;
                } else {
                    str8 = str;
                    str9 = "gl";
                    str10 = "g";
                    i19 = i15;
                    z14 = z14;
                    j12 = 0;
                    z18 = true;
                }
                if (hasAutoplayFilter(str5)) {
                    cacheImage.imageType = 2;
                    cacheImage.size = j12;
                    cacheImage.isPFrame = isPFrame(str5);
                    if (!str10.equals(str5)) {
                    }
                    z18 = true;
                } else {
                    cacheImage.imageType = 2;
                    cacheImage.size = j12;
                    cacheImage.isPFrame = isPFrame(str5);
                    if (!str10.equals(str5)) {
                    }
                    z18 = true;
                }
                cacheImage.type = i13;
                cacheImage.key = str2;
                cacheImage.cacheType = i19;
                cacheImage.filter = str5;
                cacheImage.imageLocation = imageLocation;
                cacheImage.ext = str4;
                cacheImage.currentAccount = i14;
                cacheImage.parentObject = obj;
                i20 = imageLocation.imageType;
                if (i20 != 0) {
                    cacheImage.imageType = i20;
                }
                if (i19 == 2) {
                    cacheImage.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), s3.c.l(str8, ".enc.key"));
                }
                boolean z25 = z14;
                String str110 = str6;
                cacheImage.addImageReceiver(imageReceiver, str2, str5, i13, i12);
                if (z18) {
                }
                cacheImage.finalFilePath = file;
                cacheImage.imageLocation = imageLocation;
                cacheImage.cacheTask = new CacheOutTask(cacheImage);
                this.imageLoadingByKeys.put(str2, cacheImage);
                this.imageLoadingKeys.add(cutFilter(str2));
                if (i10 != 0) {
                    this.cacheThumbOutQueue.postRunnable(cacheImage.cacheTask);
                    return;
                }
                cVar = this.cacheOutQueue;
                bVar = cacheImage.cacheTask;
                i21 = cacheImage.priority;
                if (i21 != 1) {
                    cVar.getClass();
                    bVar = new ne.b(i21, bVar);
                }
                cVar.f18519a.execute(bVar);
                cacheImage.runningTask = bVar;
            }
            str8 = str;
            i19 = i15;
            z18 = z17;
            j11 = 0;
            cacheImage.type = i13;
            cacheImage.key = str2;
            cacheImage.cacheType = i19;
            cacheImage.filter = str5;
            cacheImage.imageLocation = imageLocation;
            cacheImage.ext = str4;
            cacheImage.currentAccount = i14;
            cacheImage.parentObject = obj;
            i20 = imageLocation.imageType;
            if (i20 != 0) {
                cacheImage.imageType = i20;
            }
            if (i19 == 2) {
                cacheImage.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), s3.c.l(str8, ".enc.key"));
            }
            boolean z26 = z14;
            String str111 = str6;
            cacheImage.addImageReceiver(imageReceiver, str2, str5, i13, i12);
            if (z18) {
            }
            cacheImage.finalFilePath = file;
            cacheImage.imageLocation = imageLocation;
            cacheImage.cacheTask = new CacheOutTask(cacheImage);
            this.imageLoadingByKeys.put(str2, cacheImage);
            this.imageLoadingKeys.add(cutFilter(str2));
            if (i10 != 0) {
                this.cacheThumbOutQueue.postRunnable(cacheImage.cacheTask);
                return;
            }
            cVar = this.cacheOutQueue;
            bVar = cacheImage.cacheTask;
            i21 = cacheImage.priority;
            if (i21 != 1) {
                cVar.getClass();
                bVar = new ne.b(i21, bVar);
            }
            cVar.f18519a.execute(bVar);
            cacheImage.runningTask = bVar;
        }
    }

    public void lambda$fileDidFailedLoad$12(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage != null) {
            cacheImage.setImageAndClear(null, null);
        }
    }

    public void lambda$fileDidLoaded$11(String str, int i10, File file) {
        Runnable bVar;
        ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
        if (thumbGenerateInfo != null && thumbGenerateInfo.parentDocument != null) {
            generateThumb(i10, file, thumbGenerateInfo);
            this.waitingForQualityThumb.remove(str);
        }
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        this.imageLoadingByUrl.remove(str);
        this.imageLoadingByUrlPframe.remove(str);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < cacheImage.imageReceiverArray.size(); i11++) {
            String str2 = cacheImage.keys.get(i11);
            String str3 = cacheImage.filters.get(i11);
            int iIntValue = cacheImage.types.get(i11).intValue();
            ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i11);
            int iIntValue2 = cacheImage.imageReceiverGuidsArray.get(i11).intValue();
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
                cacheImage2.type = iIntValue;
                cacheImage2.ext = cacheImage.ext;
                cacheImage2.encryptionKeyPath = cacheImage.encryptionKeyPath;
                cacheImage2.cacheTask = new CacheOutTask(cacheImage2);
                cacheImage2.filter = str3;
                cacheImage2.imageType = cacheImage.imageType;
                this.imageLoadingByKeys.put(str2, cacheImage2);
                this.imageLoadingKeys.add(cutFilter(str2));
                arrayList.add(cacheImage2.cacheTask);
            }
            cacheImage2.addImageReceiver(imageReceiver, str2, str3, iIntValue, iIntValue2);
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i12);
            if (cacheOutTask.cacheImage.type == 1) {
                this.cacheThumbOutQueue.postRunnable(cacheOutTask);
            } else {
                ne.c cVar = this.cacheOutQueue;
                int i13 = cacheOutTask.cacheImage.priority;
                if (i13 != 1) {
                    bVar = cacheOutTask;
                    cVar.getClass();
                    bVar = new ne.b(i13, cacheOutTask);
                }
                bVar = cacheOutTask;
                cVar.f18519a.execute(bVar);
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
        } catch (Exception e9) {
            FileLog.e(e9);
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
        int i10 = forPath.imageType;
        if (i10 != 0) {
            cacheImage.imageType = i10;
        }
        cacheImage.url = str2;
        this.imageLoadingByUrl.put(str2, cacheImage);
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), s3.c.l(Utilities.MD5(forPath.path), "_temp.jpg"));
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

    public void lambda$runHttpFileLoadTasks$14(HttpFileTask httpFileTask, int i10) {
        ImageLoader imageLoader;
        int i11 = 1;
        if (httpFileTask != null) {
            this.currentHttpFileLoadTasksCount--;
        }
        if (httpFileTask == null) {
            imageLoader = this;
        } else if (i10 != 1) {
            imageLoader = this;
            if (i10 == 2) {
                imageLoader.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                File file = new File(FileLoader.getDirectory(4), Utilities.MD5(httpFileTask.url) + "." + httpFileTask.ext);
                if (!httpFileTask.tempFile.renameTo(file)) {
                    file = httpFileTask.tempFile;
                }
                NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidLoad, httpFileTask.url, file.toString());
            }
        } else if (httpFileTask.canRetry) {
            imageLoader = this;
            e3 e3Var = new e3(i11, this, imageLoader.new HttpFileTask(httpFileTask.url, httpFileTask.tempFile, httpFileTask.ext, httpFileTask.currentAccount));
            imageLoader.retryHttpsTasks.put(httpFileTask.url, e3Var);
            AndroidUtilities.runOnUIThread(e3Var, 1000L);
        } else {
            imageLoader = this;
            imageLoader.httpFileLoadTasksByKeys.remove(httpFileTask.url);
            NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidFailedLoad, httpFileTask.url, 0);
        }
        while (imageLoader.currentHttpFileLoadTasksCount < 2 && !imageLoader.httpFileLoadTasks.isEmpty()) {
            imageLoader.httpFileLoadTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            imageLoader.currentHttpFileLoadTasksCount++;
        }
    }

    public static Bitmap loadBitmap(String str, Uri uri, float f10, float f11, boolean z10) throws FileNotFoundException {
        String str2;
        InputStream inputStreamOpenInputStream;
        float f12;
        float f13;
        float fMin;
        int i10;
        Matrix matrix;
        float f14;
        Matrix matrix2;
        Bitmap bitmapDecodeFile;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
        Bitmap bitmapDecodeStream;
        Bitmap bitmapCreateBitmap3;
        Pair<Integer, Integer> imageOrientation;
        float f15;
        float f16;
        InputStream inputStreamOpenInputStream2;
        int i11;
        int i12;
        String path;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null || uri == null || uri.getScheme() == null) {
            str2 = str;
        } else {
            if (uri.getScheme().contains("file")) {
                path = uri.getPath();
            } else {
                if (Build.VERSION.SDK_INT < 30 || !"content".equals(uri.getScheme())) {
                    try {
                        path = AndroidUtilities.getPath(uri);
                    } catch (Throwable th) {
                        FileLog.e(th);
                        str2 = str;
                    }
                }
                str2 = str;
            }
            str2 = path;
        }
        Bitmap bitmapDecodeFile2 = null;
        try {
            try {
                if (str2 == null) {
                    if (uri != null) {
                        try {
                            InputStream inputStreamOpenInputStream3 = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                            BitmapFactory.decodeStream(inputStreamOpenInputStream3, null, options);
                            inputStreamOpenInputStream3.close();
                            inputStreamOpenInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            return null;
                        }
                    }
                    f12 = options.outWidth / f10;
                    f13 = options.outHeight / f11;
                    if (z10) {
                        fMin = Math.max(f12, f13);
                    } else {
                        fMin = Math.min(f12, f13);
                    }
                    if (fMin < 1.0f) {
                        fMin = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    i10 = (int) fMin;
                    options.inSampleSize = i10;
                    if (i10 % 2 != 0) {
                        i11 = 1;
                        while (true) {
                            i12 = i11 * 2;
                            if (i12 < options.inSampleSize) {
                                break;
                            }
                            i11 = i12;
                        }
                        options.inSampleSize = i11;
                    }
                    imageOrientation = AndroidUtilities.getImageOrientation(str2);
                    if (((Integer) imageOrientation.first).intValue() == 0 && ((Integer) imageOrientation.second).intValue() == 0) {
                        try {
                            inputStreamOpenInputStream2 = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                            try {
                                imageOrientation = AndroidUtilities.getImageOrientation(inputStreamOpenInputStream2);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                            } catch (Throwable unused) {
                                if (inputStreamOpenInputStream2 == null) {
                                    if (((Integer) imageOrientation.first).intValue() == 0) {
                                    }
                                    matrix = new Matrix();
                                    if (((Integer) imageOrientation.second).intValue() != 0) {
                                        f15 = -1.0f;
                                        if (((Integer) imageOrientation.second).intValue() == 1) {
                                            f16 = -1.0f;
                                        } else {
                                            f16 = 1.0f;
                                        }
                                        if (((Integer) imageOrientation.second).intValue() != 2) {
                                            f15 = 1.0f;
                                        }
                                        matrix.postScale(f16, f15);
                                    }
                                    if (((Integer) imageOrientation.first).intValue() != 0) {
                                        matrix.postRotate(((Integer) imageOrientation.first).intValue());
                                    }
                                }
                                f14 = fMin / options.inSampleSize;
                                if (f14 > 1.0f) {
                                    if (matrix == null) {
                                        matrix = new Matrix();
                                    }
                                    float f17 = 1.0f / f14;
                                    matrix.postScale(f17, f17);
                                }
                                matrix2 = matrix;
                                if (str2 == null) {
                                    if (uri == null) {
                                        return null;
                                    }
                                    try {
                                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                                        if (bitmapDecodeStream != null) {
                                            try {
                                                bitmapCreateBitmap3 = Bitmaps.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix2, true);
                                                if (bitmapCreateBitmap3 != bitmapDecodeStream) {
                                                    bitmapDecodeStream.recycle();
                                                    bitmapDecodeFile2 = bitmapCreateBitmap3;
                                                } else {
                                                    bitmapDecodeFile2 = bitmapDecodeStream;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                bitmapDecodeFile2 = bitmapDecodeStream;
                                                try {
                                                    FileLog.e(th);
                                                } finally {
                                                    try {
                                                        inputStreamOpenInputStream.close();
                                                    } catch (Throwable th4) {
                                                        FileLog.e(th4);
                                                    }
                                                }
                                            }
                                        } else {
                                            bitmapDecodeFile2 = bitmapDecodeStream;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                    try {
                                        return bitmapDecodeFile2;
                                    } catch (Throwable th6) {
                                        return bitmapDecodeFile2;
                                    }
                                }
                                try {
                                    bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                                    if (bitmapDecodeFile != null) {
                                        try {
                                            bitmapCreateBitmap2 = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix2, true);
                                            if (bitmapCreateBitmap2 != bitmapDecodeFile) {
                                                bitmapDecodeFile.recycle();
                                                return bitmapCreateBitmap2;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bitmapDecodeFile2 = bitmapDecodeFile;
                                            FileLog.e(th);
                                            getInstance().clearMemory();
                                            if (bitmapDecodeFile2 == null) {
                                                try {
                                                    bitmapDecodeFile2 = BitmapFactory.decodeFile(str2, options);
                                                    bitmapDecodeFile = bitmapDecodeFile2;
                                                    if (bitmapDecodeFile != null) {
                                                        try {
                                                            bitmapCreateBitmap = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix2, true);
                                                            if (bitmapCreateBitmap != bitmapDecodeFile) {
                                                                bitmapDecodeFile.recycle();
                                                                bitmapDecodeFile = bitmapCreateBitmap;
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            bitmapDecodeFile2 = bitmapDecodeFile;
                                                            FileLog.e(th);
                                                            return bitmapDecodeFile2;
                                                        }
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    FileLog.e(th);
                                                    return bitmapDecodeFile2;
                                                }
                                            } else {
                                                bitmapDecodeFile = bitmapDecodeFile2;
                                                if (bitmapDecodeFile != null) {
                                                    bitmapCreateBitmap = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix2, true);
                                                    if (bitmapCreateBitmap != bitmapDecodeFile) {
                                                        bitmapDecodeFile.recycle();
                                                        bitmapDecodeFile = bitmapCreateBitmap;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                return bitmapDecodeFile;
                            }
                        } catch (Throwable unused2) {
                            inputStreamOpenInputStream2 = null;
                        }
                    }
                    if (((Integer) imageOrientation.first).intValue() == 0 || ((Integer) imageOrientation.second).intValue() != 0) {
                        matrix = new Matrix();
                        if (((Integer) imageOrientation.second).intValue() != 0) {
                            f15 = -1.0f;
                            if (((Integer) imageOrientation.second).intValue() == 1) {
                                f16 = -1.0f;
                            } else {
                                f16 = 1.0f;
                            }
                            if (((Integer) imageOrientation.second).intValue() != 2) {
                                f15 = 1.0f;
                            }
                            matrix.postScale(f16, f15);
                        }
                        if (((Integer) imageOrientation.first).intValue() != 0) {
                            matrix.postRotate(((Integer) imageOrientation.first).intValue());
                        }
                    } else {
                        matrix = null;
                    }
                    f14 = fMin / options.inSampleSize;
                    if (f14 > 1.0f) {
                        if (matrix == null) {
                            matrix = new Matrix();
                        }
                        float f18 = 1.0f / f14;
                        matrix.postScale(f18, f18);
                    }
                    matrix2 = matrix;
                    if (str2 == null) {
                        bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                        if (bitmapDecodeFile != null) {
                            bitmapCreateBitmap2 = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix2, true);
                            if (bitmapCreateBitmap2 != bitmapDecodeFile) {
                                bitmapDecodeFile.recycle();
                                return bitmapCreateBitmap2;
                            }
                        }
                        return bitmapDecodeFile;
                    }
                    if (uri == null) {
                        return null;
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (bitmapDecodeStream != null) {
                        bitmapCreateBitmap3 = Bitmaps.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix2, true);
                        if (bitmapCreateBitmap3 != bitmapDecodeStream) {
                            bitmapDecodeStream.recycle();
                            bitmapDecodeFile2 = bitmapCreateBitmap3;
                        } else {
                            bitmapDecodeFile2 = bitmapDecodeStream;
                        }
                    } else {
                        bitmapDecodeFile2 = bitmapDecodeStream;
                    }
                    return bitmapDecodeFile2;
                }
                BitmapFactory.decodeFile(str2, options);
                if (((Integer) imageOrientation.second).intValue() != 0) {
                    f15 = -1.0f;
                    if (((Integer) imageOrientation.second).intValue() == 1) {
                        f16 = -1.0f;
                    } else {
                        f16 = 1.0f;
                    }
                    if (((Integer) imageOrientation.second).intValue() != 2) {
                        f15 = 1.0f;
                    }
                    matrix.postScale(f16, f15);
                }
                if (((Integer) imageOrientation.first).intValue() != 0) {
                    matrix.postRotate(((Integer) imageOrientation.first).intValue());
                }
            } catch (Throwable unused3) {
            }
            imageOrientation = AndroidUtilities.getImageOrientation(str2);
            if (((Integer) imageOrientation.first).intValue() == 0) {
                inputStreamOpenInputStream2 = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                imageOrientation = AndroidUtilities.getImageOrientation(inputStreamOpenInputStream2);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            }
            if (((Integer) imageOrientation.first).intValue() == 0) {
            }
            matrix = new Matrix();
        } catch (Throwable unused4) {
        }
        inputStreamOpenInputStream = null;
        f12 = options.outWidth / f10;
        f13 = options.outHeight / f11;
        if (z10) {
            fMin = Math.max(f12, f13);
        } else {
            fMin = Math.min(f12, f13);
        }
        if (fMin < 1.0f) {
            fMin = 1.0f;
        }
        options.inJustDecodeBounds = false;
        i10 = (int) fMin;
        options.inSampleSize = i10;
        if (i10 % 2 != 0) {
            i11 = 1;
            while (true) {
                i12 = i11 * 2;
                if (i12 < options.inSampleSize) {
                    break;
                    break;
                }
                i11 = i12;
            }
            options.inSampleSize = i11;
        }
        f14 = fMin / options.inSampleSize;
        if (f14 > 1.0f) {
            if (matrix == null) {
                matrix = new Matrix();
            }
            float f19 = 1.0f / f14;
            matrix.postScale(f19, f19);
        }
        matrix2 = matrix;
        if (str2 == null) {
            bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
            if (bitmapDecodeFile != null) {
                bitmapCreateBitmap2 = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix2, true);
                if (bitmapCreateBitmap2 != bitmapDecodeFile) {
                    bitmapDecodeFile.recycle();
                    return bitmapCreateBitmap2;
                }
            }
            return bitmapDecodeFile;
        }
        if (uri == null) {
            return null;
        }
        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (bitmapDecodeStream != null) {
            bitmapCreateBitmap3 = Bitmaps.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix2, true);
            if (bitmapCreateBitmap3 != bitmapDecodeStream) {
                bitmapDecodeStream.recycle();
                bitmapDecodeFile2 = bitmapCreateBitmap3;
            } else {
                bitmapDecodeFile2 = bitmapDecodeStream;
            }
        } else {
            bitmapDecodeFile2 = bitmapDecodeStream;
        }
        return bitmapDecodeFile2;
    }

    private static void moveDirectory(File file, final File file2) {
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    Stream streamE = b.e(file.toPath());
                    try {
                        streamE.forEach(new Consumer() {
                            @Override
                            public final void x(Object obj) {
                                ImageLoader.lambda$moveDirectory$2(file2, (java.nio.file.Path) obj);
                            }

                            public Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        streamE.close();
                    } catch (Throwable th) {
                        if (streamE != null) {
                            try {
                                streamE.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
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
            if (bitmapDrawable2 == null || bitmapDrawable2.getBitmap() == null || bitmapDrawable.getBitmap() == null) {
                this.ignoreRemoval = str;
                lruCache.remove(str);
                lruCache.put(str2, bitmapDrawable);
                this.ignoreRemoval = null;
            } else {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    lruCache.remove(str);
                } else {
                    this.ignoreRemoval = str;
                    lruCache.remove(str);
                    lruCache.put(str2, bitmapDrawable);
                    this.ignoreRemoval = null;
                }
            }
        }
        Integer num = this.bitmapUseCounts.get(str);
        if (num != null) {
            this.bitmapUseCounts.put(str2, num);
            this.bitmapUseCounts.remove(str);
        }
    }

    private void removeFromWaitingForThumb(int i10, ImageReceiver imageReceiver) {
        String str = this.waitingForQualityThumbByTag.get(i10);
        if (str != null) {
            ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
            if (thumbGenerateInfo != null) {
                int iIndexOf = thumbGenerateInfo.imageReceiverArray.indexOf(imageReceiver);
                if (iIndexOf >= 0) {
                    thumbGenerateInfo.imageReceiverArray.remove(iIndexOf);
                    thumbGenerateInfo.imageReceiverGuidsArray.remove(iIndexOf);
                }
                if (thumbGenerateInfo.imageReceiverArray.isEmpty()) {
                    this.waitingForQualityThumb.remove(str);
                }
            }
            this.waitingForQualityThumbByTag.remove(i10);
        }
    }

    public void lambda$replaceImageInCache$5(String str, String str2, ImageLocation imageLocation) {
        int i10 = 0;
        while (i10 < 2) {
            ArrayList<String> filterKeys = i10 == 0 ? this.memCache.getFilterKeys(str) : this.smallImagesMemCache.getFilterKeys(str);
            if (filterKeys != null) {
                for (int i11 = 0; i11 < filterKeys.size(); i11++) {
                    String str3 = filterKeys.get(i11);
                    String strW = a9.p.w(str, "@", str3);
                    String strW2 = a9.p.w(str2, "@", str3);
                    performReplace(strW, strW2);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, strW, strW2, imageLocation);
                }
            } else {
                performReplace(str, str2);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str, str2, imageLocation);
            }
            i10++;
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

    public void runHttpFileLoadTasks(HttpFileTask httpFileTask, int i10) {
        AndroidUtilities.runOnUIThread(new r4(this, httpFileTask, i10, 0));
    }

    public void runHttpTasks(boolean z10) {
        if (z10) {
            this.currentHttpTasksCount--;
        }
        while (this.currentHttpTasksCount < 4 && !this.httpTasks.isEmpty()) {
            HttpImageTask httpImageTaskPoll = this.httpTasks.poll();
            if (httpImageTaskPoll != null) {
                httpImageTaskPoll.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
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
        int i10 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            while (i10 < tL_messageMediaPaidMedia.extended_media.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i10);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    saveMessageThumbs(message, ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media);
                }
                i10++;
            }
            return;
        }
        TLRPC.PhotoSize photoSizeFindPhotoCachedSize = findPhotoCachedSize(message);
        if (photoSizeFindPhotoCachedSize == null || (bArr = photoSizeFindPhotoCachedSize.bytes) == null || bArr.length == 0) {
            return;
        }
        TLRPC.FileLocation fileLocation = photoSizeFindPhotoCachedSize.location;
        if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            photoSizeFindPhotoCachedSize.location = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        }
        if (photoSizeFindPhotoCachedSize.h > 50 || photoSizeFindPhotoCachedSize.f22405w > 50) {
            boolean z10 = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSizeFindPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z10 = false;
            }
            if (!pathToAttach.exists()) {
                if (z10) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(FileLoader.getInternalCacheDir(), pathToAttach.getName() + ".key"), "rws");
                        long length = randomAccessFile.length();
                        byte[] bArr2 = new byte[32];
                        byte[] bArr3 = new byte[16];
                        if (length <= 0 || length % 48 != 0) {
                            Utilities.random.nextBytes(bArr2);
                            Utilities.random.nextBytes(bArr3);
                            randomAccessFile.write(bArr2);
                            randomAccessFile.write(bArr3);
                        } else {
                            randomAccessFile.read(bArr2, 0, 32);
                            randomAccessFile.read(bArr3, 0, 16);
                        }
                        randomAccessFile.close();
                        byte[] bArr4 = photoSizeFindPhotoCachedSize.bytes;
                        Utilities.aesCtrDecryptionByteArray(bArr4, bArr2, bArr3, 0, bArr4.length, 0);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(photoSizeFindPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f22405w = photoSizeFindPhotoCachedSize.f22405w;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.size = photoSizeFindPhotoCachedSize.size;
            tL_photoSize_layer127.type = photoSizeFindPhotoCachedSize.type;
        } else {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = photoSizeFindPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.f22405w = photoSizeFindPhotoCachedSize.f22405w;
        }
        TLRPC.MessageMedia messageMedia2 = message.media;
        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia2.photo.sizes.size();
            while (i10 < size) {
                if (message.media.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia2.document.thumbs.size();
            while (i10 < size2) {
                if (message.media.document.thumbs.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.document.thumbs.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia2.webpage.photo.sizes.size();
            while (i10 < size3) {
                if (message.media.webpage.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.webpage.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
        }
    }

    public static void saveMessagesThumbs(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            saveMessageThumbs(arrayList.get(i10));
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f10, float f11, int i10, boolean z10) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f10, f11, i10, z10, 0, 0, false);
    }

    private static TLRPC.PhotoSize scaleAndSaveImageInternal(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10, int i10, int i11, float f10, float f11, float f12, int i12, boolean z11, boolean z12, boolean z13) throws IOException {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        int i13;
        Bitmap bitmapCreateScaledBitmap = (f12 > 1.0f || z12) ? Bitmaps.createScaledBitmap(bitmap, i10, i11, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated) {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
            } else {
                tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
                tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
                tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
                tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
                tL_fileLocationToBeDeprecated.file_reference = new byte[0];
                photoSize = new TLRPC.TL_photoSize_layer127();
                photoSize.location = tL_fileLocationToBeDeprecated;
                photoSize.f22405w = bitmapCreateScaledBitmap.getWidth();
                int height = bitmapCreateScaledBitmap.getHeight();
                photoSize.h = height;
                i13 = photoSize.f22405w;
                if (i13 > 100 && height <= 100) {
                    photoSize.type = "s";
                } else if (i13 > 320 && height <= 320) {
                    photoSize.type = "m";
                } else if (i13 > 800 && height <= 800) {
                    photoSize.type = "x";
                } else if (i13 <= 1280 || height > 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "y";
                }
            }
        } else {
            tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            photoSize = new TLRPC.TL_photoSize_layer127();
            photoSize.location = tL_fileLocationToBeDeprecated;
            photoSize.f22405w = bitmapCreateScaledBitmap.getWidth();
            int height2 = bitmapCreateScaledBitmap.getHeight();
            photoSize.h = height2;
            i13 = photoSize.f22405w;
            if (i13 > 100) {
                if (i13 > 320) {
                    if (i13 > 800) {
                        if (i13 <= 1280) {
                            photoSize.type = "w";
                        } else {
                            photoSize.type = "w";
                        }
                    } else if (i13 <= 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i13 > 800) {
                    if (i13 <= 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i13 <= 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i13 > 320) {
                if (i13 > 800) {
                    if (i13 <= 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i13 <= 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i13 > 800) {
                if (i13 <= 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i13 <= 1280) {
                photoSize.type = "w";
            } else {
                photoSize.type = "w";
            }
        }
        int i14 = AnonymousClass7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        String str = (i14 == 1 || i14 == 2 || i14 == 3) ? ".webp" : ".jpg";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_fileLocationToBeDeprecated.volume_id);
        sb2.append("_");
        String strK = a9.p.k(tL_fileLocationToBeDeprecated.local_id, str, sb2);
        File directory = (z13 || tL_fileLocationToBeDeprecated.volume_id == -2147483648L) ? FileLoader.getDirectory(4) : FileLoader.getDirectory(0);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(directory, strK));
        bitmapCreateScaledBitmap.compress(compressFormat, i12, fileOutputStream);
        if (!z11) {
            photoSize.size = (int) fileOutputStream.getChannel().size();
        }
        fileOutputStream.close();
        if (z11) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateScaledBitmap.compress(compressFormat, i12, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            photoSize.bytes = byteArray;
            photoSize.size = byteArray.length;
            byteArrayOutputStream.close();
        }
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        return photoSize;
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
                InputStream inputStreamOpenInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                inputStreamOpenInputStream.close();
            } catch (Throwable th2) {
                FileLog.e(th2);
                return false;
            }
        }
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        return f10 / f11 > 10.0f || f11 / f10 > 10.0f;
    }

    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.x5) {
            org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) bitmapDrawable;
            return Math.max(x5Var.getIntrinsicHeight() * x5Var.getIntrinsicWidth(), x5Var.f34477f0 * x5Var.f34475e0) * 12;
        }
        if (!(bitmapDrawable instanceof oi0)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        oi0 oi0Var = (oi0) bitmapDrawable;
        int i10 = oi0Var.f31307b * oi0Var.f31309c;
        return oi0Var.C ? i10 * 2 : i10 * 8;
    }

    private boolean useLottieMemCache(ImageLocation imageLocation, String str) {
        return (str.endsWith("_firstframe") || str.endsWith("_lastframe") || ((imageLocation == null || (!MessageObject.isAnimatedStickerDocument(imageLocation.document, true) && imageLocation.imageType != 1 && !MessageObject.isVideoSticker(imageLocation.document))) && !isAnimatedAvatar(str))) ? false : true;
    }

    public void addTestWebFile(String str, WebFile webFile) {
        if (str == null || webFile == null) {
            return;
        }
        this.testWebFile.put(str, webFile);
    }

    public void cancelForceLoadingForImageReceiver(ImageReceiver imageReceiver) {
        String imageKey;
        if (imageReceiver == null || (imageKey = imageReceiver.getImageKey()) == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new q4(this, imageKey, 1));
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
        HashMap map = org.telegram.ui.web.e2.f43823f;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                ArrayList arrayList = (ArrayList) entry.getValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((Pair) arrayList.get(i10)).first == imageReceiver) {
                        arrayList.remove(i10);
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    org.telegram.ui.web.e2.f43823f.remove(str);
                    break;
                }
            }
        }
        ArrayList<Runnable> loadingOperations = imageReceiver.getLoadingOperations();
        if (!loadingOperations.isEmpty()) {
            for (int i11 = 0; i11 < loadingOperations.size(); i11++) {
                this.imageLoadQueue.cancelRunnable(loadingOperations.get(i11));
            }
            loadingOperations.clear();
        }
        imageReceiver.addLoadingImageRunnable(null);
        this.imageLoadQueue.postRunnable(new n6(this, z10, imageReceiver, 2));
    }

    public void changeFileLoadingPriorityForImageReceiver(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new r4(this, imageReceiver, imageReceiver.getFileLoadingPriority(), 4));
    }

    public void checkMediaPaths() {
        checkMediaPaths(null);
    }

    public void clearMemory() {
        this.smallImagesMemCache.evictAll();
        this.memCache.evictAll();
        this.lottieMemCache.evictAll();
    }

    public SparseArray<File> createMediaPaths() {
        File file;
        File[] externalFilesDirs;
        SparseArray<File> sparseArray = new SparseArray<>();
        File cacheDir = AndroidUtilities.getCacheDir();
        if (!cacheDir.isDirectory()) {
            try {
                cacheDir.mkdirs();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("cache path = " + cacheDir);
        }
        org.telegram.ui.Cells.pa.v(SharedConfig.storageCacheDir, new StringBuilder("selected SD card = "));
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file2 = null;
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                    if (rootDirs != null) {
                        int size = rootDirs.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            File file3 = rootDirs.get(i10);
                            FileLog.d("root dir " + i10 + " " + file3);
                            if (file3.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                externalStorageDirectory = file3;
                                break;
                            }
                        }
                    }
                    if (!externalStorageDirectory.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && (externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null)) != null) {
                        for (int i11 = 0; i11 < externalFilesDirs.length; i11++) {
                            if (externalFilesDirs[i11] != null) {
                                FileLog.d("dirsDebug " + i11 + " " + externalFilesDirs[i11]);
                            }
                        }
                    }
                }
                FileLog.d("external storage = " + externalStorageDirectory);
                if (Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (ApplicationLoader.applicationContext.getExternalMediaDirs().length > 0) {
                            File publicStorageDir = getPublicStorageDir();
                            try {
                                file = new File(publicStorageDir, "Telegram");
                                try {
                                    file.mkdirs();
                                } catch (Exception e10) {
                                    e = e10;
                                    FileLog.e(e);
                                }
                            } catch (Exception e11) {
                                file = publicStorageDir;
                                e = e11;
                            }
                        } else {
                            file = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        file = null;
                    }
                    this.telegramPath = new File(ApplicationLoader.applicationContext.getExternalFilesDir(null), "Telegram");
                    file2 = file;
                } else {
                    if (TextUtils.isEmpty(SharedConfig.storageCacheDir) || !externalStorageDirectory.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                        if (externalStorageDirectory.exists()) {
                            if (externalStorageDirectory.isDirectory()) {
                                if (!externalStorageDirectory.canWrite()) {
                                }
                            }
                        } else if (externalStorageDirectory.mkdirs()) {
                            if (!externalStorageDirectory.canWrite()) {
                            }
                        }
                        FileLog.d("can't write to this directory = " + externalStorageDirectory + " use files dir");
                        externalStorageDirectory = ApplicationLoader.applicationContext.getExternalFilesDir(null);
                    }
                    this.telegramPath = new File(externalStorageDirectory, "Telegram");
                }
                this.telegramPath.mkdirs();
                if (!this.telegramPath.isDirectory()) {
                    ArrayList<File> dataDirs = AndroidUtilities.getDataDirs();
                    int size2 = dataDirs.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        File file4 = dataDirs.get(i12);
                        if (file4 != null && !TextUtils.isEmpty(SharedConfig.storageCacheDir) && file4.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                            File file5 = new File(file4, "Telegram");
                            this.telegramPath = file5;
                            file5.mkdirs();
                            break;
                        }
                    }
                }
                if (this.telegramPath.isDirectory()) {
                    try {
                        File file6 = new File(this.telegramPath, "Telegram Images");
                        file6.mkdir();
                        if (file6.isDirectory() && canMoveFiles(cacheDir, file6, 0)) {
                            sparseArray.put(0, file6);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("image path = " + file6);
                            }
                        }
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    try {
                        File file7 = new File(this.telegramPath, "Telegram Video");
                        file7.mkdir();
                        if (file7.isDirectory() && canMoveFiles(cacheDir, file7, 2)) {
                            sparseArray.put(2, file7);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("video path = " + file7);
                            }
                        }
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                    try {
                        File file8 = new File(this.telegramPath, "Telegram Audio");
                        file8.mkdir();
                        if (file8.isDirectory() && canMoveFiles(cacheDir, file8, 1)) {
                            AndroidUtilities.createEmptyFile(new File(file8, ".nomedia"));
                            sparseArray.put(1, file8);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("audio path = " + file8);
                            }
                        }
                    } catch (Exception e15) {
                        FileLog.e(e15);
                    }
                    try {
                        File file9 = new File(this.telegramPath, "Telegram Documents");
                        file9.mkdir();
                        if (file9.isDirectory() && canMoveFiles(cacheDir, file9, 3)) {
                            AndroidUtilities.createEmptyFile(new File(file9, ".nomedia"));
                            sparseArray.put(3, file9);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("documents path = " + file9);
                            }
                        }
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                    try {
                        File file10 = new File(this.telegramPath, "Telegram Files");
                        file10.mkdir();
                        if (file10.isDirectory() && canMoveFiles(cacheDir, file10, 5)) {
                            AndroidUtilities.createEmptyFile(new File(file10, ".nomedia"));
                            sparseArray.put(5, file10);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("files path = " + file10);
                            }
                        }
                    } catch (Exception e17) {
                        FileLog.e(e17);
                    }
                    try {
                        File file11 = new File(this.telegramPath, "Telegram Stories");
                        file11.mkdir();
                        if (file11.isDirectory() && canMoveFiles(cacheDir, file11, 6)) {
                            AndroidUtilities.createEmptyFile(new File(file11, ".nomedia"));
                            sparseArray.put(6, file11);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("stories path = " + file11);
                            }
                        }
                    } catch (Exception e18) {
                        FileLog.e(e18);
                    }
                }
                if (file2 != null && file2.isDirectory()) {
                    try {
                        File file12 = new File(file2, "Telegram Images");
                        file12.mkdir();
                        if (file12.isDirectory() && canMoveFiles(cacheDir, file12, 0)) {
                            sparseArray.put(100, file12);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("image path = " + file12);
                            }
                        }
                    } catch (Exception e19) {
                        FileLog.e(e19);
                    }
                    try {
                        File file13 = new File(file2, "Telegram Video");
                        file13.mkdir();
                        if (file13.isDirectory() && canMoveFiles(cacheDir, file13, 2)) {
                            sparseArray.put(101, file13);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("video path = " + file13);
                            }
                        }
                    } catch (Exception e20) {
                        FileLog.e(e20);
                    }
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("this Android can't rename files");
            }
            SharedConfig.checkSaveToGalleryFiles();
        } catch (Exception e21) {
            FileLog.e(e21);
        }
        return sparseArray;
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

    public ne.c getCacheOutQueue() {
        return this.cacheOutQueue;
    }

    public Float getFileProgress(String str) {
        long[] jArr;
        if (str == null || (jArr = this.fileProgresses.get(str)) == null) {
            return null;
        }
        long j10 = jArr[1];
        return j10 == 0 ? Float.valueOf(0.0f) : Float.valueOf(Math.min(1.0f, jArr[0] / j10));
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
        return bitmapDrawable == null ? getFromLottieCache(str) : bitmapDrawable;
    }

    public BitmapDrawable getImageFromMemory(TLObject tLObject, String str, String str2) {
        String strMD5 = null;
        if (tLObject == null && str == null) {
            return null;
        }
        if (str != null) {
            strMD5 = Utilities.MD5(str);
        } else if (tLObject instanceof TLRPC.FileLocation) {
            TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) tLObject;
            strMD5 = fileLocation.volume_id + "_" + fileLocation.local_id;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            strMD5 = document.dc_id + "_" + document.f22386id;
        } else if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            strMD5 = secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.f22515id;
        } else if (tLObject instanceof WebFile) {
            strMD5 = Utilities.MD5(((WebFile) tLObject).url);
        }
        if (str2 != null) {
            strMD5 = a9.p.w(strMD5, "@", str2);
        }
        return getFromMemCache(strMD5);
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
        return lruCache != null && lruCache.contains(str);
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
            return getFromLottieCache(str) != null;
        }
        return getFromMemCache(str) != null;
    }

    public boolean isLoadingHttpFile(String str) {
        return this.httpFileLoadTasksByKeys.containsKey(str);
    }

    public void loadHttpFile(String str, String str2, int i10) {
        if (str == null || str.length() == 0 || this.httpFileLoadTasksByKeys.containsKey(str)) {
            return;
        }
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "_temp." + httpUrlExtension);
        file.delete();
        HttpFileTask httpFileTask = new HttpFileTask(str, file, httpUrlExtension, i10);
        this.httpFileLoadTasks.add(httpFileTask);
        this.httpFileLoadTasksByKeys.put(str, httpFileTask);
        runHttpFileLoadTasks(null, 0);
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver) {
        loadImageForImageReceiver(imageReceiver, null);
    }

    public void moveToFront(String str) {
        if (str == null) {
            return;
        }
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

    public void onFragmentStackChanged() {
        for (int i10 = 0; i10 < this.cachedAnimatedFileDrawables.size(); i10++) {
            this.cachedAnimatedFileDrawables.get(i10).f34494u0 = 0;
        }
    }

    public void preloadArtwork(String str) {
        this.imageLoadQueue.postRunnable(new q4(this, str, 2));
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            putImageToCache(arrayList.get(i10).drawable, arrayList.get(i10).key, true);
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
            AndroidUtilities.runOnUIThread(new lk(this, str, str2, imageLocation, 8));
        } else {
            lambda$replaceImageInCache$5(str, str2, imageLocation);
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float f10, float f11, int i10, boolean z10, boolean z11) {
        return scaleAndSaveImage(photoSize, bitmap, Bitmap.CompressFormat.JPEG, false, f10, f11, i10, z10, 0, 0, z11);
    }

    public void checkMediaPaths(Runnable runnable) {
        ne.c cVar = this.cacheOutQueue;
        cVar.f18519a.execute(new d2(12, this, runnable));
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver, List<ImageReceiver> list) {
        boolean z10;
        boolean z11;
        boolean z12;
        ImageReceiver imageReceiver2;
        boolean z13;
        ImageLocation forDocument;
        boolean z14;
        ImageLocation imageLocation;
        String strW;
        String str;
        ImageLocation imageLocation2;
        int i10;
        boolean z15;
        boolean z16;
        ImageLocation imageLocation3;
        String str2;
        BitmapDrawable fromLottieCache;
        boolean zS;
        ImageReceiver imageReceiver3 = imageReceiver;
        if (imageReceiver3 == null) {
            return;
        }
        String mediaKey = imageReceiver3.getMediaKey();
        int newGuid = imageReceiver3.getNewGuid();
        if (mediaKey != null) {
            ImageLocation mediaLocation = imageReceiver3.getMediaLocation();
            BitmapDrawable bitmapDrawableFindInPreloadImageReceivers = findInPreloadImageReceivers(mediaKey, list);
            if (bitmapDrawableFindInPreloadImageReceivers == null) {
                if (useLottieMemCache(mediaLocation, mediaKey)) {
                    bitmapDrawableFindInPreloadImageReceivers = getFromLottieCache(mediaKey);
                } else {
                    BitmapDrawable bitmapDrawable = this.memCache.get(mediaKey);
                    if (bitmapDrawable != null) {
                        this.memCache.moveToFront(mediaKey);
                    }
                    if (bitmapDrawable == null && (bitmapDrawable = this.smallImagesMemCache.get(mediaKey)) != null) {
                        this.smallImagesMemCache.moveToFront(mediaKey);
                    }
                    bitmapDrawableFindInPreloadImageReceivers = bitmapDrawable;
                    if (bitmapDrawableFindInPreloadImageReceivers == null && (bitmapDrawableFindInPreloadImageReceivers = this.wallpaperMemCache.get(mediaKey)) != null) {
                        this.wallpaperMemCache.moveToFront(mediaKey);
                    }
                }
            }
            Drawable drawable = bitmapDrawableFindInPreloadImageReceivers;
            if (drawable instanceof oi0) {
                zS = ((oi0) drawable).s();
            } else {
                zS = drawable instanceof org.telegram.ui.Components.x5 ? ((org.telegram.ui.Components.x5) drawable).s() : true;
            }
            if (zS && drawable != null) {
                cancelLoadingForImageReceiver(imageReceiver3, true);
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                if (!imageReceiver.isForcePreview()) {
                    return;
                }
                imageReceiver3 = imageReceiver;
                z10 = true;
                z11 = false;
            } else if (drawable != null) {
                imageReceiver3 = imageReceiver;
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                mediaKey = mediaKey;
                z10 = false;
                z11 = true;
            } else {
                imageReceiver3 = imageReceiver;
                z10 = false;
                z11 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        String imageKey = imageReceiver3.getImageKey();
        if (z10 || imageKey == null) {
            z12 = z10;
        } else {
            ImageLocation imageLocation4 = imageReceiver3.getImageLocation();
            BitmapDrawable bitmapDrawableFindInPreloadImageReceivers2 = findInPreloadImageReceivers(imageKey, list);
            if (bitmapDrawableFindInPreloadImageReceivers2 == null && useLottieMemCache(imageLocation4, imageKey)) {
                bitmapDrawableFindInPreloadImageReceivers2 = getFromLottieCache(imageKey);
            }
            if (bitmapDrawableFindInPreloadImageReceivers2 == null) {
                BitmapDrawable bitmapDrawable2 = this.memCache.get(imageKey);
                if (bitmapDrawable2 != null) {
                    this.memCache.moveToFront(imageKey);
                }
                if (bitmapDrawable2 == null && (bitmapDrawable2 = this.smallImagesMemCache.get(imageKey)) != null) {
                    this.smallImagesMemCache.moveToFront(imageKey);
                }
                bitmapDrawableFindInPreloadImageReceivers2 = bitmapDrawable2;
                if (bitmapDrawableFindInPreloadImageReceivers2 == null && (bitmapDrawableFindInPreloadImageReceivers2 = this.wallpaperMemCache.get(imageKey)) != null) {
                    this.wallpaperMemCache.moveToFront(imageKey);
                }
            }
            if (bitmapDrawableFindInPreloadImageReceivers2 != null) {
                cancelLoadingForImageReceiver(imageReceiver3, true);
                imageReceiver3.setImageBitmapByKey(bitmapDrawableFindInPreloadImageReceivers2, imageKey, 0, true, newGuid);
                if (!imageReceiver.isForcePreview() && (mediaKey == null || z11)) {
                    return;
                } else {
                    z12 = true;
                }
            } else {
                z12 = z10;
            }
        }
        String thumbKey = imageReceiver.getThumbKey();
        if (thumbKey == null) {
            imageReceiver2 = imageReceiver;
            z13 = false;
        } else {
            if (useLottieMemCache(imageReceiver.getThumbLocation(), thumbKey)) {
                fromLottieCache = getFromLottieCache(thumbKey);
            } else {
                fromLottieCache = this.memCache.get(thumbKey);
                if (fromLottieCache != null) {
                    this.memCache.moveToFront(thumbKey);
                }
                if (fromLottieCache == null && (fromLottieCache = this.smallImagesMemCache.get(thumbKey)) != null) {
                    this.smallImagesMemCache.moveToFront(thumbKey);
                }
                if (fromLottieCache == null && (fromLottieCache = this.wallpaperMemCache.get(thumbKey)) != null) {
                    this.wallpaperMemCache.moveToFront(thumbKey);
                }
            }
            BitmapDrawable bitmapDrawable3 = fromLottieCache;
            if (bitmapDrawable3 != null) {
                imageReceiver2 = imageReceiver;
                imageReceiver2.setImageBitmapByKey(bitmapDrawable3, thumbKey, 1, true, newGuid);
                cancelLoadingForImageReceiver(imageReceiver2, false);
                if (z12 && imageReceiver2.isForcePreview()) {
                    return;
                } else {
                    z13 = true;
                }
            } else {
                imageReceiver2 = imageReceiver;
                z13 = false;
            }
        }
        Object parentObject = imageReceiver2.getParentObject();
        TLRPC.Document qualityThumbDocument = imageReceiver2.getQualityThumbDocument();
        ImageLocation thumbLocation = imageReceiver2.getThumbLocation();
        String thumbFilter = imageReceiver2.getThumbFilter();
        ImageLocation mediaLocation2 = imageReceiver2.getMediaLocation();
        String mediaFilter = imageReceiver2.getMediaFilter();
        ImageLocation imageLocation5 = imageReceiver2.getImageLocation();
        String imageFilter = imageReceiver2.getImageFilter();
        if (imageLocation5 == null && imageReceiver2.isNeedsQualityThumb() && imageReceiver2.isCurrentKeyQuality()) {
            if (parentObject instanceof MessageObject) {
                forDocument = ImageLocation.getForDocument(((MessageObject) parentObject).getDocument());
            } else if (qualityThumbDocument != null) {
                forDocument = ImageLocation.getForDocument(qualityThumbDocument);
            } else {
                forDocument = imageLocation5;
                z14 = false;
            }
            z14 = true;
        } else {
            forDocument = imageLocation5;
            z14 = false;
        }
        String str3 = null;
        String str4 = (forDocument == null || forDocument.imageType != 2) ? null : "mp4";
        String str5 = (mediaLocation2 == null || mediaLocation2.imageType != 2) ? null : "mp4";
        String ext = imageReceiver2.getExt();
        if (ext == null) {
            ext = "jpg";
        }
        String str6 = str4 == null ? ext : str4;
        if (str5 == null) {
            str5 = ext;
        }
        boolean z17 = z13;
        ImageLocation imageLocation6 = mediaLocation2;
        boolean z18 = z14;
        String strW2 = null;
        String strW3 = null;
        String str7 = null;
        String str8 = null;
        int i11 = 0;
        boolean z19 = false;
        while (true) {
            imageLocation = imageLocation5;
            if (i11 >= 2) {
                break;
            }
            if (i11 == 0) {
                imageLocation2 = forDocument;
                str = str6;
            } else {
                str = str5;
                imageLocation2 = imageLocation6;
            }
            if (imageLocation2 == null) {
                i10 = newGuid;
                z15 = z11;
            } else {
                i10 = newGuid;
                z15 = z11;
                String key = imageLocation2.getKey(parentObject, imageLocation6 != null ? imageLocation6 : forDocument, false);
                if (key != null) {
                    z16 = z12;
                    String key2 = imageLocation2.getKey(parentObject, imageLocation6 != null ? imageLocation6 : forDocument, true);
                    if (imageLocation2.path != null) {
                        StringBuilder sbF = s3.c.f(key2, ".");
                        sbF.append(getHttpUrlExtension(imageLocation2.path, "jpg"));
                        key2 = sbF.toString();
                        imageLocation3 = forDocument;
                    } else {
                        TLRPC.PhotoSize photoSize = imageLocation2.photoSize;
                        imageLocation3 = forDocument;
                        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                            key2 = a9.p.w(key2, ".", str);
                        } else if (imageLocation2.location != null) {
                            String strW4 = a9.p.w(key2, ".", str);
                            if (imageReceiver.getExt() == null) {
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation2.location;
                                if (tL_fileLocationToBeDeprecated.key == null) {
                                    str2 = strW4;
                                    if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L || tL_fileLocationToBeDeprecated.local_id >= 0) {
                                        key2 = str2;
                                    }
                                } else {
                                    str2 = strW4;
                                }
                                key2 = str2;
                            } else {
                                str2 = strW4;
                                key2 = str2;
                            }
                        } else {
                            WebFile webFile = imageLocation2.webFile;
                            if (webFile != null) {
                                String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
                                StringBuilder sbF2 = s3.c.f(key2, ".");
                                sbF2.append(getHttpUrlExtension(imageLocation2.webFile.url, mimeTypePart));
                                key2 = sbF2.toString();
                            } else if (imageLocation2.secureDocument != null) {
                                key2 = a9.p.w(key2, ".", str);
                            } else if (imageLocation2.document != null) {
                                if (i11 == 0 && z18) {
                                    key = "q_".concat(key);
                                }
                                String documentFileName = FileLoader.getDocumentFileName(imageLocation2.document);
                                int iLastIndexOf = documentFileName.lastIndexOf(46);
                                String str9 = "";
                                String strSubstring = iLastIndexOf == -1 ? "" : documentFileName.substring(iLastIndexOf);
                                if (strSubstring.length() > 1) {
                                    str9 = strSubstring;
                                } else if ("video/mp4".equals(imageLocation2.document.mime_type)) {
                                    str9 = ".mp4";
                                } else if ("video/x-matroska".equals(imageLocation2.document.mime_type)) {
                                    str9 = ".mkv";
                                }
                                key2 = s3.c.l(key2, str9);
                                z19 = (MessageObject.isVideoDocument(imageLocation2.document) || MessageObject.isGifDocument(imageLocation2.document) || MessageObject.isRoundVideoDocument(imageLocation2.document) || MessageObject.canPreviewDocument(imageLocation2.document)) ? false : true;
                            } else if (parentObject instanceof TLRPC.StickerSet) {
                                key2 = a9.p.w(key2, ".", str);
                            }
                        }
                    }
                    if (i11 == 0) {
                        strW3 = key;
                        str7 = key2;
                    } else {
                        strW2 = key;
                        str8 = key2;
                    }
                    if (imageLocation2 != thumbLocation) {
                        forDocument = imageLocation3;
                    } else if (i11 == 0) {
                        strW3 = null;
                        forDocument = null;
                        str7 = null;
                    } else {
                        strW2 = null;
                        imageLocation6 = null;
                        str8 = null;
                        forDocument = imageLocation3;
                    }
                }
                i11++;
                imageLocation5 = imageLocation;
                newGuid = i10;
                z11 = z15;
                z12 = z16;
            }
            z16 = z12;
            i11++;
            imageLocation5 = imageLocation;
            newGuid = i10;
            z11 = z15;
            z12 = z16;
        }
        ImageLocation imageLocation7 = forDocument;
        int i12 = newGuid;
        boolean z20 = z11;
        boolean z21 = z12;
        if (thumbLocation != null) {
            ImageLocation strippedLocation = imageReceiver.getStrippedLocation();
            if (strippedLocation == null) {
                strippedLocation = imageLocation6 != null ? imageLocation6 : imageLocation;
            }
            String key3 = thumbLocation.getKey(parentObject, strippedLocation, false);
            String key4 = thumbLocation.getKey(parentObject, strippedLocation, true);
            if (thumbLocation.path != null) {
                StringBuilder sbF3 = s3.c.f(key4, ".");
                sbF3.append(getHttpUrlExtension(thumbLocation.path, "jpg"));
                key4 = sbF3.toString();
            } else {
                TLRPC.PhotoSize photoSize2 = thumbLocation.photoSize;
                if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize) || thumbLocation.location != null) {
                    key4 = a9.p.w(key4, ".", ext);
                }
            }
            str3 = key4;
            strW = key3;
        } else {
            strW = null;
        }
        if (strW2 != null && mediaFilter != null) {
            strW2 = a9.p.w(strW2, "@", mediaFilter);
        }
        if (strW3 != null && imageFilter != null) {
            strW3 = a9.p.w(strW3, "@", imageFilter);
        }
        if (strW != null && thumbFilter != null) {
            strW = a9.p.w(strW, "@", thumbFilter);
        }
        if (imageReceiver.getUniqKeyPrefix() != null && strW3 != null) {
            strW3 = imageReceiver.getUniqKeyPrefix() + strW3;
        }
        String str10 = strW3;
        if (imageReceiver.getUniqKeyPrefix() != null && strW2 != null) {
            strW2 = imageReceiver.getUniqKeyPrefix() + strW2;
        }
        String str11 = strW2;
        if (imageLocation7 != null) {
            if (imageLocation7.path != null) {
                createLoadOperationForImageReceiver(imageReceiver, strW, str3, ext, thumbLocation, thumbFilter, 0L, 1, 1, z17 ? 2 : 1, i12);
                createLoadOperationForImageReceiver(imageReceiver, str10, str7, str6, imageLocation7, imageFilter, imageReceiver.getSize(), 1, 0, 0, i12);
                return;
            }
            imageLocation7 = imageLocation7;
        }
        if (imageLocation6 == null) {
            int cacheType = imageReceiver.getCacheType();
            int i13 = (cacheType == 0 && z19) ? 1 : cacheType;
            createLoadOperationForImageReceiver(imageReceiver, strW, str3, ext, thumbLocation, thumbFilter, 0L, i13 == 0 ? 1 : i13, 1, z17 ? 2 : 1, i12);
            createLoadOperationForImageReceiver(imageReceiver, str10, str7, str6, imageLocation7, imageFilter, imageReceiver.getSize(), i13, 0, 0, i12);
            return;
        }
        int cacheType2 = imageReceiver.getCacheType();
        int i14 = (cacheType2 == 0 && z19) ? 1 : cacheType2;
        int i15 = i14 == 0 ? 1 : i14;
        if (!z17) {
            createLoadOperationForImageReceiver(imageReceiver, strW, str3, ext, thumbLocation, thumbFilter, 0L, i15, 1, 1, i12);
        }
        if (!z21) {
            createLoadOperationForImageReceiver(imageReceiver, str10, str7, str6, imageLocation7, imageFilter, 0L, 1, 0, 0, i12);
        }
        if (z20) {
            return;
        }
        createLoadOperationForImageReceiver(imageReceiver, str11, str8, str5, imageLocation6, mediaFilter, imageReceiver.getSize(), i14, 3, 0, i12);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f10, float f11, int i10, boolean z10, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f10, f11, i10, z10, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f10, float f11, boolean z10, int i10, boolean z11, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, z10, f10, f11, i10, z11, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i10, boolean z10, int i11, int i12) {
        return scaleAndSaveImage(null, bitmap, compressFormat, false, f10, f11, i10, z10, i11, i12, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10, float f10, float f11, int i10, boolean z11, int i11, int i12, boolean z12) {
        boolean z13;
        float fMax;
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width != 0.0f && height != 0.0f) {
            float fMax2 = Math.max(width / f10, height / f11);
            if (i11 == 0 || i12 == 0) {
                z13 = false;
            } else {
                float f12 = i11;
                if (width < f12 || height < i12) {
                    if (width < f12 && height > i12) {
                        fMax = width / f12;
                    } else if (width > f12) {
                        float f13 = i12;
                        if (height < f13) {
                            fMax = height / f13;
                        } else {
                            fMax = Math.max(width / f12, height / i12);
                        }
                    } else {
                        fMax = Math.max(width / f12, height / i12);
                    }
                    fMax2 = fMax;
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            float f14 = fMax2;
            int i13 = (int) (width / f14);
            int i14 = (int) (height / f14);
            if (i14 != 0 && i13 != 0) {
                try {
                    return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f14, i10, z11, z13, z12);
                } catch (Throwable th) {
                    FileLog.e(th);
                    getInstance().clearMemory();
                    System.gc();
                    try {
                        return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z10, i13, i14, width, height, f14, i10, z11, z13, z12);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
            }
        }
        return null;
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.MessageMedia messageMedia) {
        int i10 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i10 < size) {
                TLRPC.PhotoSize photoSize = messageMedia.photo.sizes.get(i10);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i10++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i10 < size2) {
                TLRPC.PhotoSize photoSize2 = messageMedia.document.thumbs.get(i10);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i10++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo == null) {
                return null;
            }
            int size3 = photo.sizes.size();
            while (i10 < size3) {
                TLRPC.PhotoSize photoSize3 = messageMedia.webpage.photo.sizes.get(i10);
                if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize3;
                }
                i10++;
            }
            return null;
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (messageMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) messageMedia.extended_media.get(0)).thumb;
        }
        return null;
    }

    public static void saveMessageThumbs(TLRPC.Message message, TLRPC.MessageMedia messageMedia) {
        TLRPC.PhotoSize photoSizeFindPhotoCachedSize;
        byte[] bArr;
        TLRPC.PhotoSize tL_photoSize_layer127;
        if (message == null || messageMedia == null || (photoSizeFindPhotoCachedSize = findPhotoCachedSize(messageMedia)) == null || (bArr = photoSizeFindPhotoCachedSize.bytes) == null || bArr.length == 0) {
            return;
        }
        TLRPC.FileLocation fileLocation = photoSizeFindPhotoCachedSize.location;
        if (fileLocation == null || (fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            photoSizeFindPhotoCachedSize.location = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
        }
        int i10 = 0;
        if (photoSizeFindPhotoCachedSize.h <= 50 && photoSizeFindPhotoCachedSize.f22405w <= 50) {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = photoSizeFindPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.f22405w = photoSizeFindPhotoCachedSize.f22405w;
        } else {
            boolean z10 = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSizeFindPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z10 = false;
            }
            if (!pathToAttach.exists()) {
                if (z10) {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(FileLoader.getInternalCacheDir(), pathToAttach.getName() + ".key"), "rws");
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
                        byte[] bArr4 = photoSizeFindPhotoCachedSize.bytes;
                        Utilities.aesCtrDecryptionByteArray(bArr4, bArr2, bArr3, 0, bArr4.length, 0);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(photoSizeFindPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f22405w = photoSizeFindPhotoCachedSize.f22405w;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.size = photoSizeFindPhotoCachedSize.size;
            tL_photoSize_layer127.type = photoSizeFindPhotoCachedSize.type;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i10 < size) {
                if (messageMedia.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia.document.thumbs.size();
            while (i10 < size2) {
                if (messageMedia.document.thumbs.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.document.thumbs.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia.webpage.photo.sizes.size();
            while (i10 < size3) {
                if (messageMedia.webpage.photo.sizes.get(i10) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.webpage.photo.sizes.set(i10, tL_photoSize_layer127);
                    return;
                }
                i10++;
            }
        }
    }
}
