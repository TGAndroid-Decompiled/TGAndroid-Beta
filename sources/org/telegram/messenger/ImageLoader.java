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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.DispatchQueuePriority;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.web.WebInstantView;

public class ImageLoader {
    public static final String AUTOPLAY_FILTER = "g";
    public static final String AUTOPLAY_FILTER_NONLOOP = "gl";
    public static final int CACHE_TYPE_CACHE = 1;
    public static final int CACHE_TYPE_ENCRYPTED = 2;
    public static final int CACHE_TYPE_NONE = 0;
    private static final boolean DEBUG_MODE = false;
    private boolean canForce8888;
    private LruCache<BitmapDrawable> lottieMemCache;
    private LruCache<BitmapDrawable> memCache;
    private LruCache<BitmapDrawable> smallImagesMemCache;
    private LruCache<BitmapDrawable> wallpaperMemCache;
    private static ThreadLocal<byte[]> bytesLocal = new ThreadLocal<>();
    private static ThreadLocal<byte[]> bytesThumbLocal = new ThreadLocal<>();
    private static byte[] header = new byte[12];
    private static byte[] headerThumb = new byte[12];
    private static volatile ImageLoader Instance = null;
    private HashMap<String, Integer> bitmapUseCounts = new HashMap<>();
    ArrayList<AnimatedFileDrawable> cachedAnimatedFileDrawables = new ArrayList<>();
    private HashMap<String, CacheImage> imageLoadingByUrl = new HashMap<>();
    private HashMap<String, CacheImage> imageLoadingByUrlPframe = new HashMap<>();
    public ConcurrentHashMap<String, CacheImage> imageLoadingByKeys = new ConcurrentHashMap<>();
    public HashSet<String> imageLoadingKeys = new HashSet<>();
    private SparseArray<CacheImage> imageLoadingByTag = new SparseArray<>();
    private HashMap<String, ThumbGenerateInfo> waitingForQualityThumb = new HashMap<>();
    private SparseArray<String> waitingForQualityThumbByTag = new SparseArray<>();
    private LinkedList<HttpImageTask> httpTasks = new LinkedList<>();
    private LinkedList<ArtworkLoadTask> artworkTasks = new LinkedList<>();
    private DispatchQueuePriority cacheOutQueue = new DispatchQueuePriority();
    private DispatchQueue cacheThumbOutQueue = new DispatchQueue("cacheThumbOutQueue");
    private DispatchQueue thumbGeneratingQueue = new DispatchQueue("thumbGeneratingQueue");
    private DispatchQueue imageLoadQueue = new DispatchQueue("imageLoadQueue");
    private HashMap<String, String> replacedBitmaps = new HashMap<>();
    private ConcurrentHashMap<String, long[]> fileProgresses = new ConcurrentHashMap<>();
    private HashMap<String, ThumbGenerateTask> thumbGenerateTasks = new HashMap<>();
    private HashMap<String, Integer> forceLoadingImages = new HashMap<>();
    private int currentHttpTasksCount = 0;
    private int currentArtworkTasksCount = 0;
    private ConcurrentHashMap<String, WebFile> testWebFile = new ConcurrentHashMap<>();
    private LinkedList<HttpFileTask> httpFileLoadTasks = new LinkedList<>();
    private HashMap<String, HttpFileTask> httpFileLoadTasksByKeys = new HashMap<>();
    private HashMap<String, Runnable> retryHttpsTasks = new HashMap<>();
    private int currentHttpFileLoadTasksCount = 0;
    private String ignoreRemoval = null;
    private volatile long lastCacheOutTime = 0;
    private int lastImageNum = 0;
    private File telegramPath = null;

    public class AnonymousClass5 implements FileLoader.FileLoaderDelegate {
        final int val$currentAccount;

        public AnonymousClass5(int i) {
            this.val$currentAccount = i;
        }

        public void lambda$fileDidFailedLoad$6(String str, int i, int i2) {
            ImageLoader.this.fileDidFailedLoad(str, i);
            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, str, Integer.valueOf(i));
        }

        public static void lambda$fileDidFailedUpload$3(int i, String str, boolean z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadFailed, str, Boolean.valueOf(z));
        }

        public void lambda$fileDidFailedUpload$4(int i, String str, boolean z) {
            AndroidUtilities.runOnUIThread(new ImageLoader$5$$ExternalSyntheticLambda0(i, str, z));
            ImageLoader.this.fileProgresses.remove(str);
        }

        public void lambda$fileDidLoaded$5(File file, String str, int i, Object obj, int i2) {
            FilePathDatabase.FileMeta fileMetadataFromParent;
            int i3;
            if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (fileMetadataFromParent = FileLoader.getFileMetadataFromParent(i, obj)) != null)) {
                MessageObject messageObject = obj instanceof MessageObject ? (MessageObject) obj : null;
                long j = fileMetadataFromParent.dialogId;
                if (j >= 0) {
                    i3 = 1;
                } else {
                    i3 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i).getChat(Long.valueOf(-j))) ? 4 : 2;
                }
                if (SaveToGallerySettingsHelper.needSave(i3, fileMetadataFromParent, messageObject, i)) {
                    AndroidUtilities.addMediaToGallery(file.toString());
                }
            }
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, str, file);
            ImageLoader.this.fileDidLoaded(str, file, i2);
        }

        public static void lambda$fileDidUploaded$1(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j));
        }

        public void lambda$fileDidUploaded$2(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
            AndroidUtilities.runOnUIThread(new ImageLoader$5$$ExternalSyntheticLambda7(i, str, inputFile, inputEncryptedFile, bArr, bArr2, j));
            ImageLoader.this.fileProgresses.remove(str);
        }

        public void lambda$fileLoadProgressChanged$7(String str, FileLoadOperation fileLoadOperation) {
            Runnable priorityRunnable;
            CacheImage cacheImage = (CacheImage) ImageLoader.this.imageLoadingByUrlPframe.remove(str);
            if (cacheImage == null) {
                return;
            }
            ImageLoader.this.imageLoadingByUrl.remove(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cacheImage.imageReceiverArray.size(); i++) {
                String str2 = cacheImage.keys.get(i);
                String str3 = cacheImage.filters.get(i);
                int iIntValue = cacheImage.types.get(i).intValue();
                ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i);
                int iIntValue2 = cacheImage.imageReceiverGuidsArray.get(i).intValue();
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
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i2);
                if (cacheOutTask.cacheImage.type == 1) {
                    ImageLoader.this.cacheThumbOutQueue.postRunnable(cacheOutTask);
                } else {
                    DispatchQueuePriority dispatchQueuePriority = ImageLoader.this.cacheOutQueue;
                    int i3 = cacheOutTask.cacheImage.priority;
                    if (i3 != 1) {
                        priorityRunnable = cacheOutTask;
                        dispatchQueuePriority.getClass();
                        priorityRunnable = new DispatchQueuePriority.PriorityRunnable(i3, cacheOutTask);
                    }
                    priorityRunnable = cacheOutTask;
                    dispatchQueuePriority.threadPoolExecutor.execute(priorityRunnable);
                }
            }
        }

        public static void lambda$fileLoadProgressChanged$8(int i, String str, long j, long j2) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2));
        }

        public static void lambda$fileUploadProgressChanged$0(int i, String str, long j, long j2, boolean z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
        }

        @Override
        public void fileDidFailedLoad(String str, int i) {
            ImageLoader.this.fileProgresses.remove(str);
            AndroidUtilities.runOnUIThread(new ImageLoader$5$$ExternalSyntheticLambda6(this, str, i, this.val$currentAccount, 0));
        }

        @Override
        public void fileDidFailedUpload(String str, boolean z) {
            Utilities.stageQueue.postRunnable(new ImageLoader$5$$ExternalSyntheticLambda2(this, this.val$currentAccount, str, z));
        }

        @Override
        public void fileDidLoaded(final String str, final File file, final Object obj, final int i) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i2 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fileDidLoaded$5(file, str, i2, obj, i);
                }
            });
        }

        @Override
        public void fileDidUploaded(final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fileDidUploaded$2(i, str, inputFile, inputEncryptedFile, bArr, bArr2, j);
                }
            });
        }

        @Override
        public void fileLoadProgressChanged(FileLoadOperation fileLoadOperation, String str, long j, long j2) {
            int i = 2;
            ImageLoader.this.fileProgresses.put(str, new long[]{j, j2});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda0((Object) this, str, (Object) fileLoadOperation, i));
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = fileLoadOperation.lastProgressUpdateTime;
            if (j3 == 0 || j3 < jElapsedRealtime - 500 || j == 0) {
                fileLoadOperation.lastProgressUpdateTime = jElapsedRealtime;
                AndroidUtilities.runOnUIThread(new FileLog$$ExternalSyntheticLambda0(this.val$currentAccount, str, j, j2));
            }
        }

        @Override
        public void fileUploadProgressChanged(FileUploadOperation fileUploadOperation, final String str, final long j, final long j2, final boolean z) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j, j2});
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = fileUploadOperation.lastProgressUpdateTime;
            if (j3 == 0 || j3 < jElapsedRealtime - 100 || j == j2) {
                fileUploadOperation.lastProgressUpdateTime = jElapsedRealtime;
                final int i = this.val$currentAccount;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ImageLoader.AnonymousClass5.lambda$fileUploadProgressChanged$0(i, str, j, j2, z);
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
            ANRDetector$$ExternalSyntheticLambda0 aNRDetector$$ExternalSyntheticLambda0 = new ANRDetector$$ExternalSyntheticLambda0(this, 4);
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(aNRDetector$$ExternalSyntheticLambda0, 1000L);
            } else {
                aNRDetector$$ExternalSyntheticLambda0.run();
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
            ImageLoader.this.imageLoadQueue.postRunnable(new ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda0(this, 0));
        }

        @Override
        public String doInBackground(Void... voidArr) {
            InputStream inputStream;
            Throwable th;
            ByteArrayOutputStream byteArrayOutputStream;
            HttpURLConnection httpURLConnection;
            int i;
            int responseCode;
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.cacheImage.imageLocation.path.replace("athumb://", "https://")).openConnection();
                    this.httpConnection = httpURLConnection2;
                    httpURLConnection2.setConnectTimeout(5000);
                    this.httpConnection.setReadTimeout(5000);
                    this.httpConnection.connect();
                    try {
                        HttpURLConnection httpURLConnection3 = this.httpConnection;
                        if (httpURLConnection3 != null && (responseCode = httpURLConnection3.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                            this.canRetry = false;
                        }
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    InputStream inputStream2 = this.httpConnection.getInputStream();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[32768];
                            while (!isCancelled() && (i = inputStream2.read(bArr)) > 0) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                            this.canRetry = false;
                            JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream.toByteArray())).getJSONArray("results");
                            if (jSONArray.length() > 0) {
                                String string = jSONArray.getJSONObject(0).getString("artworkUrl100");
                                if (this.small) {
                                    try {
                                        HttpURLConnection httpURLConnection4 = this.httpConnection;
                                        if (httpURLConnection4 != null) {
                                            httpURLConnection4.disconnect();
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Throwable th2) {
                                            FileLog.e(th2);
                                        }
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    return string;
                                }
                                String strReplace = string.replace("100x100", "600x600");
                                try {
                                    HttpURLConnection httpURLConnection5 = this.httpConnection;
                                    if (httpURLConnection5 != null) {
                                        httpURLConnection5.disconnect();
                                    }
                                } catch (Throwable unused3) {
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th3) {
                                        FileLog.e(th3);
                                    }
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception unused4) {
                                }
                                return strReplace;
                            }
                            try {
                                HttpURLConnection httpURLConnection6 = this.httpConnection;
                                if (httpURLConnection6 != null) {
                                    httpURLConnection6.disconnect();
                                }
                            } catch (Throwable unused5) {
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable th4) {
                                    FileLog.e(th4);
                                }
                            }
                            byteArrayOutputStream.close();
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                if (th instanceof SocketTimeoutException) {
                                    if (ApplicationLoader.isNetworkOnline()) {
                                        this.canRetry = false;
                                    }
                                } else if (th instanceof UnknownHostException) {
                                    this.canRetry = false;
                                } else if (th instanceof SocketException) {
                                    if (th.getMessage() != null) {
                                        this.canRetry = false;
                                    }
                                } else if (th instanceof FileNotFoundException) {
                                    this.canRetry = false;
                                }
                                FileLog.e(th, false);
                                try {
                                    httpURLConnection = this.httpConnection;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                } catch (Throwable unused6) {
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th6) {
                                        FileLog.e(th6);
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
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th7) {
                                        FileLog.e(th7);
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
                    } catch (Throwable th8) {
                        inputStream = inputStream2;
                        th = th8;
                        th = th;
                        inputStream2 = inputStream;
                        byteArrayOutputStream = null;
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
                        httpURLConnection = this.httpConnection;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return null;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = null;
                }
            } catch (Exception unused9) {
            }
            return null;
        }

        @Override
        public void onPostExecute(String str) {
            if (str != null) {
                ImageLoader.this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda5(2, this, str));
            } else if (this.canRetry) {
                ImageLoader.this.artworkLoadError(this.cacheImage.url);
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new ImageLoader$ArtworkLoadTask$$ExternalSyntheticLambda0(this, 1));
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
            int i;
            char c;
            char c2;
            AnimatedFileDrawable animatedFileDrawable;
            Drawable drawable2 = drawable;
            if (drawable2 instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable2 = (AnimatedFileDrawable) drawable2;
                if (animatedFileDrawable2.isWebmSticker) {
                    i = 0;
                    while (i < arrayList.size()) {
                        ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(drawable2, this.key, this.types.get(i).intValue(), false, ((Integer) arrayList2.get(i)).intValue());
                        i++;
                        drawable2 = drawable;
                    }
                } else {
                    boolean z = false;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i2);
                        if (i2 == 0) {
                            animatedFileDrawable = animatedFileDrawable2;
                            z = z;
                        } else {
                            AnimatedFileDrawableStream animatedFileDrawableStream = animatedFileDrawable2.stream;
                            if (animatedFileDrawableStream != null) {
                                File file = animatedFileDrawable2.path;
                                long j = animatedFileDrawable2.streamFileSize;
                                int i3 = animatedFileDrawable2.streamLoadingPriority;
                                TLRPC.Document document = animatedFileDrawableStream.getDocument();
                                ImageLocation location = animatedFileDrawable2.stream.getLocation();
                                Object parentObject = animatedFileDrawable2.stream.getParentObject();
                                long j2 = animatedFileDrawable2.pendingSeekToUI;
                                c = 1;
                                int i4 = animatedFileDrawable2.currentAccount;
                                c2 = 0;
                                AnimatedFileDrawableStream animatedFileDrawableStream2 = animatedFileDrawable2.stream;
                                animatedFileDrawable = new AnimatedFileDrawable(file, false, j, i3, document, location, parentObject, j2, i4, animatedFileDrawableStream2 != null && animatedFileDrawableStream2.isPreview());
                            } else {
                                c = 1;
                                c2 = 0;
                                animatedFileDrawable = new AnimatedFileDrawable(animatedFileDrawable2.path, false, animatedFileDrawable2.streamFileSize, animatedFileDrawable2.streamLoadingPriority, animatedFileDrawable2.document, null, null, animatedFileDrawable2.pendingSeekToUI, animatedFileDrawable2.currentAccount, false);
                            }
                            int[] iArr = animatedFileDrawable.metaData;
                            int[] iArr2 = animatedFileDrawable2.metaData;
                            iArr[c2] = iArr2[c2];
                            iArr[c] = iArr2[c];
                        }
                        if (imageReceiver.setImageBitmapByKey(animatedFileDrawable, this.key, this.type, false, ((Integer) arrayList2.get(i2)).intValue())) {
                            if (animatedFileDrawable == animatedFileDrawable2) {
                                z = true;
                            }
                        } else if (animatedFileDrawable != animatedFileDrawable2) {
                            animatedFileDrawable.recycle();
                        }
                        z = z;
                    }
                    if (!z) {
                        animatedFileDrawable2.recycle();
                    }
                }
            } else {
                i = 0;
                while (i < arrayList.size()) {
                    ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(drawable2, this.key, this.types.get(i).intValue(), false, ((Integer) arrayList2.get(i)).intValue());
                    i++;
                    drawable2 = drawable;
                }
            }
            if (str != null) {
                ImageLoader.this.decrementUseCount(str);
            }
        }

        public void addImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i, int i2) {
            int iIndexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (iIndexOf >= 0 && Objects.equals(this.imageReceiverArray.get(iIndexOf).getImageKey(), str)) {
                this.imageReceiverGuidsArray.set(iIndexOf, Integer.valueOf(i2));
                return;
            }
            this.imageReceiverArray.add(imageReceiver);
            this.imageReceiverGuidsArray.add(Integer.valueOf(i2));
            this.keys.add(str);
            this.filters.add(str2);
            this.types.add(Integer.valueOf(i));
            ImageLoader.this.imageLoadingByTag.put(imageReceiver.getTag(i), this);
        }

        public void changePriority(int i) {
            TLRPC.Document document;
            SecureDocument secureDocument;
            Object obj;
            SecureDocument secureDocument2;
            SecureDocument secureDocument3;
            ?? r9;
            ?? r8;
            ?? r7;
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                if (tL_fileLocationToBeDeprecated != null) {
                    r9 = this.ext;
                    r8 = tL_fileLocationToBeDeprecated;
                    document = null;
                    secureDocument = null;
                    r7 = 0;
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
                        r9 = secureDocument2;
                        r7 = obj;
                        r8 = secureDocument2;
                    }
                    secureDocument3 = secureDocument;
                    secureDocument2 = secureDocument3;
                    obj = secureDocument3;
                    r9 = secureDocument2;
                    r7 = obj;
                    r8 = secureDocument2;
                }
                FileLoader.getInstance(this.currentAccount).changePriority(i, document, secureDocument, r7, r8, r9, null);
            }
        }

        public void removeImageReceiver(ImageReceiver imageReceiver) {
            int iIntValue = this.type;
            int i = 0;
            while (i < this.imageReceiverArray.size()) {
                ImageReceiver imageReceiver2 = this.imageReceiverArray.get(i);
                if (imageReceiver2 == null || imageReceiver2 == imageReceiver) {
                    this.imageReceiverArray.remove(i);
                    this.imageReceiverGuidsArray.remove(i);
                    this.keys.remove(i);
                    this.filters.remove(i);
                    iIntValue = this.types.remove(i).intValue();
                    if (imageReceiver2 != null) {
                        ImageLoader.this.imageLoadingByTag.remove(imageReceiver2.getTag(iIntValue));
                    }
                    i--;
                }
                i++;
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
                        DispatchQueuePriority dispatchQueuePriority = ImageLoader.this.cacheOutQueue;
                        CacheOutTask cacheOutTask = this.cacheTask;
                        if (cacheOutTask == null) {
                            dispatchQueuePriority.getClass();
                        } else {
                            dispatchQueuePriority.threadPoolExecutor.remove(cacheOutTask);
                        }
                        DispatchQueuePriority dispatchQueuePriority2 = ImageLoader.this.cacheOutQueue;
                        Runnable runnable = this.runningTask;
                        if (runnable == null) {
                            dispatchQueuePriority2.getClass();
                        } else {
                            dispatchQueuePriority2.threadPoolExecutor.remove(runnable);
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

        public void replaceImageReceiver(ImageReceiver imageReceiver, String str, String str2, int i, int i2) {
            int iIndexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (iIndexOf == -1) {
                return;
            }
            if (this.types.get(iIndexOf).intValue() != i) {
                ArrayList<ImageReceiver> arrayList = this.imageReceiverArray;
                iIndexOf = arrayList.subList(iIndexOf + 1, arrayList.size()).indexOf(imageReceiver);
                if (iIndexOf == -1) {
                    return;
                }
            }
            this.imageReceiverGuidsArray.set(iIndexOf, Integer.valueOf(i2));
            this.keys.set(iIndexOf, str);
            this.filters.set(iIndexOf, str2);
        }

        public void setImageAndClear(Drawable drawable, String str) {
            CacheImage cacheImage;
            if (drawable != null) {
                cacheImage = this;
                AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda84((Object) cacheImage, (Object) drawable, new ArrayList(this.imageReceiverArray), new ArrayList(this.imageReceiverGuidsArray), (Object) str, 1));
            } else {
                cacheImage = this;
            }
            for (int i = 0; i < cacheImage.imageReceiverArray.size(); i++) {
                ImageLoader.this.imageLoadingByTag.remove(cacheImage.imageReceiverArray.get(i).getTag(cacheImage.type));
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

        public void setImageReceiverGuid(ImageReceiver imageReceiver, int i) {
            int iIndexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (iIndexOf == -1) {
                return;
            }
            this.imageReceiverGuidsArray.set(iIndexOf, Integer.valueOf(i));
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
            boolean z = true;
            if (wallPaperSettings2.second_background_color == 0) {
                patternColor = AndroidUtilities.getPatternColor(wallPaperSettings2.background_color);
                canvas.drawColor(ColorUtils.setAlphaComponent(wallPaper.settings.background_color, 255));
            } else if (wallPaperSettings2.third_background_color == 0) {
                int alphaComponent = ColorUtils.setAlphaComponent(wallPaperSettings2.background_color, 255);
                int alphaComponent2 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, 255);
                int averageColor = AndroidUtilities.getAverageColor(alphaComponent, alphaComponent2);
                GradientDrawable gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(wallPaper.settings.rotation), new int[]{alphaComponent, alphaComponent2});
                gradientDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                gradientDrawable.draw(canvas);
                patternColor = averageColor;
            } else {
                int alphaComponent3 = ColorUtils.setAlphaComponent(wallPaperSettings2.background_color, 255);
                int alphaComponent4 = ColorUtils.setAlphaComponent(wallPaper.settings.second_background_color, 255);
                int alphaComponent5 = ColorUtils.setAlphaComponent(wallPaper.settings.third_background_color, 255);
                int i = wallPaper.settings.fourth_background_color;
                int alphaComponent6 = i == 0 ? 0 : ColorUtils.setAlphaComponent(i, 255);
                patternColor = MotionBackgroundDrawable.getPatternColor(alphaComponent3, alphaComponent4, alphaComponent5, alphaComponent6);
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
                motionBackgroundDrawable.setColors(alphaComponent3, alphaComponent4, alphaComponent5, alphaComponent6, 0, true);
                motionBackgroundDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                motionBackgroundDrawable.setPatternBitmap(bitmap, wallPaper.settings.intensity);
                motionBackgroundDrawable.draw(canvas);
                z = false;
            }
            if (z) {
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
            RLottieDrawable rLottieDrawable;
            boolean z = false;
            String str = null;
            if (drawable instanceof RLottieDrawable) {
                rLottieDrawable = (RLottieDrawable) drawable;
                Drawable drawable2 = (Drawable) ImageLoader.this.lottieMemCache.get(this.cacheImage.key);
                if (drawable2 == null) {
                    ImageLoader.this.lottieMemCache.put(this.cacheImage.key, rLottieDrawable);
                } else {
                    rLottieDrawable.recycle(false);
                    drawable = drawable2;
                }
                if (drawable != null) {
                    drawable = rLottieDrawable;
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                }
            } else if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                if (animatedFileDrawable.isWebmSticker) {
                    BitmapDrawable fromLottieCache = ImageLoader.this.getFromLottieCache(this.cacheImage.key);
                    if (fromLottieCache == null) {
                        ImageLoader.this.lottieMemCache.put(this.cacheImage.key, animatedFileDrawable);
                        drawable = animatedFileDrawable;
                    } else {
                        animatedFileDrawable.recycle();
                        drawable = fromLottieCache;
                    }
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                }
            } else if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                BitmapDrawable fromMemCache = ImageLoader.this.getFromMemCache(this.cacheImage.key);
                boolean z2 = true;
                if (fromMemCache == null) {
                    if (this.cacheImage.key.endsWith("_f")) {
                        ImageLoader.this.wallpaperMemCache.put(this.cacheImage.key, bitmapDrawable);
                    } else {
                        if (!this.cacheImage.key.endsWith("_isc") && !this.cacheImage.key.endsWith("_nocache") && bitmapDrawable.getBitmap().getWidth() <= AndroidUtilities.density * 80.0f && bitmapDrawable.getBitmap().getHeight() <= AndroidUtilities.density * 80.0f) {
                            ImageLoader.this.smallImagesMemCache.put(this.cacheImage.key, bitmapDrawable);
                        } else if (!this.cacheImage.key.endsWith("_nocache")) {
                            ImageLoader.this.memCache.put(this.cacheImage.key, bitmapDrawable);
                        }
                        z = true;
                    }
                    z2 = z;
                    drawable = bitmapDrawable;
                } else {
                    AndroidUtilities.recycleBitmap(bitmapDrawable.getBitmap());
                    drawable = fromMemCache;
                }
                if (drawable != null && z2) {
                    ImageLoader.this.incrementUseCount(this.cacheImage.key);
                    str = this.cacheImage.key;
                }
            } else {
                drawable = null;
            }
            drawable = rLottieDrawable;
            ImageLoader.this.imageLoadQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda0(this, drawable, str, 3), this.cacheImage.priority);
        }

        private void loadLastFrame(RLottieDrawable rLottieDrawable, int i, int i2, boolean z, boolean z2) {
            Bitmap bitmapCreateBitmap;
            Canvas canvas;
            Drawable bitmapDrawable;
            if (z && z2) {
                float f = i * 1.2f;
                float f2 = i2 * 1.2f;
                bitmapCreateBitmap = Bitmap.createBitmap((int) f, (int) f2, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(2.0f, 2.0f, f / 2.0f, f2 / 2.0f);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                canvas = new Canvas(bitmapCreateBitmap);
            }
            rLottieDrawable.prepareForGenerateCache();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(rLottieDrawable.width, rLottieDrawable.height, Bitmap.Config.ARGB_8888);
            rLottieDrawable.generateCacheFramePointer = z ? rLottieDrawable.metaData[0] - 1 : 0;
            rLottieDrawable.getNextFrame(bitmapCreateBitmap2);
            rLottieDrawable.releaseForGenerateCache();
            canvas.save();
            if (!z || !z2) {
                canvas.scale(bitmapCreateBitmap2.getWidth() / i, bitmapCreateBitmap2.getHeight() / i2, i / 2.0f, i2 / 2.0f);
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            if (z && z2) {
                canvas.drawBitmap(bitmapCreateBitmap2, (bitmapCreateBitmap.getWidth() - bitmapCreateBitmap2.getWidth()) / 2.0f, (bitmapCreateBitmap.getHeight() - bitmapCreateBitmap2.getHeight()) / 2.0f, paint);
                bitmapDrawable = new ImageReceiver.ReactionLastFrame(bitmapCreateBitmap);
            } else {
                canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            }
            rLottieDrawable.recycle(false);
            bitmapCreateBitmap2.recycle();
            onPostExecute(bitmapDrawable);
        }

        private void onPostExecute(Drawable drawable) {
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda5(3, this, drawable));
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
        public void run() throws java.lang.Throwable {
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

        public HttpFileTask(String str, File file, String str2, int i) {
            this.url = str;
            this.tempFile = file;
            this.ext = str2;
            this.currentAccount = i;
        }

        public void lambda$reportProgress$0(long j, long j2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.url, Long.valueOf(j), Long.valueOf(j2));
        }

        public void lambda$reportProgress$1(long j, long j2) {
            ImageLoader.this.fileProgresses.put(this.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new ImageLoader$HttpFileTask$$ExternalSyntheticLambda0(this, j, j2, 0));
        }

        private void reportProgress(long j, long j2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j != j2) {
                long j3 = this.lastProgressTime;
                if (j3 != 0 && j3 >= jElapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = jElapsedRealtime;
            Utilities.stageQueue.postRunnable(new ImageLoader$HttpFileTask$$ExternalSyntheticLambda0(this, j, j2, 1));
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
            boolean z = true;
            boolean z2 = false;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (uRLConnectionOpenConnection != null) {
                    try {
                        Map<String, List<String>> headerFields = uRLConnectionOpenConnection.getHeaderFields();
                        if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                            this.fileSize = Utilities.parseInt((CharSequence) str).intValue();
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                if (inputStream2 != null) {
                    try {
                        byte[] bArr = new byte[32768];
                        int i = 0;
                        while (true) {
                            try {
                                if (!isCancelled()) {
                                    try {
                                        int i2 = inputStream2.read(bArr);
                                        if (i2 > 0) {
                                            this.fileOutputStream.write(bArr, 0, i2);
                                            i += i2;
                                            int i3 = this.fileSize;
                                            if (i3 > 0) {
                                                reportProgress(i, i3);
                                            }
                                        } else if (i2 == -1) {
                                            try {
                                                int i4 = this.fileSize;
                                                if (i4 != 0) {
                                                    long j = i4;
                                                    reportProgress(j, j);
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                FileLog.e(e);
                                            }
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        z = false;
                                    }
                                    FileLog.e(e);
                                }
                                z = false;
                            } catch (Throwable th4) {
                                th = th4;
                                FileLog.e(th);
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                } else {
                    z = false;
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
                z2 = z;
            }
            return Boolean.valueOf(z2);
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

        public HttpImageTask(CacheImage cacheImage, long j) {
            this.cacheImage = cacheImage;
            this.imageSize = j;
        }

        public static void lambda$doInBackground$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public void lambda$onCancelled$6() {
            ImageLoader.this.runHttpTasks(true);
        }

        public void lambda$onCancelled$7() {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 1);
        }

        public void lambda$onCancelled$8() {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda1(this, 3));
        }

        public void lambda$onPostExecute$3(Boolean bool) {
            if (!bool.booleanValue()) {
                NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 2);
                return;
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.cacheImage.currentAccount);
            int i = NotificationCenter.fileLoaded;
            CacheImage cacheImage = this.cacheImage;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i, cacheImage.url, cacheImage.finalFilePath);
        }

        public void lambda$onPostExecute$4(Boolean bool) {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda3(this, bool, 0));
        }

        public void lambda$onPostExecute$5() {
            ImageLoader.this.runHttpTasks(true);
        }

        public void lambda$reportProgress$0(long j, long j2) {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.cacheImage.url, Long.valueOf(j), Long.valueOf(j2));
        }

        public void lambda$reportProgress$1(long j, long j2) {
            ImageLoader.this.fileProgresses.put(this.cacheImage.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda6(this, j, j2, 0));
        }

        private void reportProgress(long j, long j2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j != j2) {
                long j3 = this.lastProgressTime;
                if (j3 != 0 && j3 >= jElapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = jElapsedRealtime;
            Utilities.stageQueue.postRunnable(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda6(this, j, j2, 1));
        }

        @Override
        public void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda1(this, 0), this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda1(this, 1));
        }

        @Override
        public Boolean doInBackground(Void... voidArr) {
            InputStream inputStream;
            boolean z;
            InputStream inputStream2;
            WebFile webFile;
            HttpURLConnection httpURLConnection;
            List<String> list;
            String str;
            int responseCode;
            CacheImage cacheImage;
            File file;
            boolean z2 = true;
            boolean z3 = false;
            if (isCancelled()) {
                inputStream2 = null;
            } else {
                try {
                    String str2 = this.cacheImage.imageLocation.path;
                    if (str2.startsWith("https://static-maps") || str2.startsWith("https://maps.googleapis")) {
                        int i = MessagesController.getInstance(this.cacheImage.currentAccount).mapProvider;
                        if ((i == 3 || i == 4) && (webFile = (WebFile) ImageLoader.this.testWebFile.get(str2)) != null) {
                            TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                            tL_upload_getWebFile.location = webFile.location;
                            tL_upload_getWebFile.offset = 0;
                            tL_upload_getWebFile.limit = 0;
                            ConnectionsManager.getInstance(this.cacheImage.currentAccount).sendRequest(tL_upload_getWebFile, new FileRefController$$ExternalSyntheticLambda11(1));
                        }
                    }
                    String str3 = this.overrideUrl;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str2).openConnection();
                    this.httpConnection = httpURLConnection2;
                    httpURLConnection2.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
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
                                    z = true;
                                }
                                FileLog.e(th, z);
                                inputStream2 = inputStream;
                            }
                            z = false;
                            FileLog.e(th, z);
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
                    HttpURLConnection httpURLConnection3 = this.httpConnection;
                    if (httpURLConnection3 != null && (responseCode = httpURLConnection3.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.canRetry = false;
                    }
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                if (this.imageSize == 0 && (httpURLConnection = this.httpConnection) != null) {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                            this.imageSize = Utilities.parseInt((CharSequence) str).intValue();
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                if (inputStream2 == null) {
                    z2 = false;
                    break;
                }
                try {
                    byte[] bArr = new byte[8192];
                    int i2 = 0;
                    while (true) {
                        if (!isCancelled()) {
                            try {
                                int i3 = inputStream2.read(bArr);
                                if (i3 > 0) {
                                    i2 += i3;
                                    this.fileOutputStream.write(bArr, 0, i3);
                                    long j = this.imageSize;
                                    if (j != 0) {
                                        reportProgress(i2, j);
                                    }
                                } else if (i3 == -1) {
                                    try {
                                        long j2 = this.imageSize;
                                        if (j2 == 0) {
                                            break;
                                        }
                                        reportProgress(j2, j2);
                                        break;
                                    } catch (Exception e3) {
                                        e = e3;
                                        z3 = true;
                                        FileLog.e(e);
                                        z2 = z3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z3 = true;
                                        FileLog.e(th);
                                        z2 = z3;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                            FileLog.e(e);
                            z2 = z3;
                        }
                        z2 = false;
                        break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                z2 = false;
                break;
            }
            try {
                RandomAccessFile randomAccessFile = this.fileOutputStream;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    this.fileOutputStream = null;
                }
            } catch (Throwable th5) {
                FileLog.e(th5);
            }
            try {
                HttpURLConnection httpURLConnection4 = this.httpConnection;
                if (httpURLConnection4 != null) {
                    httpURLConnection4.disconnect();
                }
            } catch (Throwable unused) {
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th6) {
                    FileLog.e(th6);
                }
            }
            if (z2 && (file = (cacheImage = this.cacheImage).tempFilePath) != null && !file.renameTo(cacheImage.finalFilePath)) {
                CacheImage cacheImage2 = this.cacheImage;
                cacheImage2.finalFilePath = cacheImage2.tempFilePath;
            }
            return Boolean.valueOf(z2);
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
            Utilities.stageQueue.postRunnable(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda3(this, bool, 1));
            ImageLoader.this.imageLoadQueue.postRunnable(new ImageLoader$HttpImageTask$$ExternalSyntheticLambda1(this, 2), this.cacheImage.priority);
        }

        public HttpImageTask(CacheImage cacheImage, int i, String str) {
            this.cacheImage = cacheImage;
            this.imageSize = i;
            this.overrideUrl = str;
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
            tL_inputPhoto.id = photo.id;
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

        public ThumbGenerateTask(int i, File file, ThumbGenerateInfo thumbGenerateInfo) {
            this.mediaType = i;
            this.originalPath = file;
            this.info = thumbGenerateInfo;
        }

        public void lambda$removeTask$0(String str) {
            ImageLoader.this.thumbGenerateTasks.remove(str);
        }

        public void lambda$run$1(String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
            removeTask();
            if (this.info.filter != null) {
                StringBuilder sbM = Log.m(str, "@");
                sbM.append(this.info.filter);
                str = sbM.toString();
            }
            String str2 = str;
            for (int i = 0; i < arrayList.size(); i++) {
                ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(bitmapDrawable, str2, 0, false, ((Integer) arrayList2.get(i)).intValue());
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
            ImageLoader.this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda5(4, this, FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)));
        }

        @Override
        public void run() {
            int iMin;
            Bitmap bitmapLoadBitmap;
            int width;
            int height;
            float fMin;
            int i;
            Bitmap bitmapCreateScaledBitmap;
            try {
                if (this.info == null) {
                    removeTask();
                    return;
                }
                String str = "q_" + this.info.parentDocument.dc_id + "_" + this.info.parentDocument.id;
                File file = new File(FileLoader.getDirectory(4), str + ".jpg");
                if (!file.exists() && this.originalPath.exists()) {
                    if (this.info.big) {
                        Point point = AndroidUtilities.displaySize;
                        iMin = Math.max(point.x, point.y);
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        iMin = Math.min(180, Math.min(point2.x, point2.y) / 4);
                    }
                    int i2 = this.mediaType;
                    Bitmap bitmap = null;
                    if (i2 == 0) {
                        float f = iMin;
                        bitmapLoadBitmap = ImageLoader.loadBitmap(this.originalPath.toString(), null, f, f, false);
                    } else {
                        int i3 = 2;
                        if (i2 != 2) {
                            if (i2 == 3) {
                                String lowerCase = this.originalPath.toString().toLowerCase();
                                if (!lowerCase.endsWith("mp4")) {
                                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                        float f2 = iMin;
                                        bitmapLoadBitmap = ImageLoader.loadBitmap(lowerCase, null, f2, f2, false);
                                    }
                                    FileLog.e(th);
                                    removeTask();
                                }
                                String string = this.originalPath.toString();
                                if (!this.info.big) {
                                    i3 = 1;
                                }
                                bitmapLoadBitmap = SendMessagesHelper.createVideoThumbnail(string, i3);
                            }
                            if (bitmap == null) {
                                removeTask();
                                return;
                            }
                            width = bitmap.getWidth();
                            height = bitmap.getHeight();
                            if (width != 0 && height != 0) {
                                float f3 = width;
                                float f4 = iMin;
                                float f5 = height;
                                fMin = Math.min(f3 / f4, f5 / f4);
                                if (fMin > 1.0f && (bitmapCreateScaledBitmap = Bitmaps.createScaledBitmap(bitmap, (int) (f3 / fMin), (int) (f5 / fMin), true)) != bitmap) {
                                    bitmap.recycle();
                                    bitmap = bitmapCreateScaledBitmap;
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                if (this.info.big) {
                                    i = 83;
                                } else {
                                    i = 60;
                                }
                                bitmap.compress(compressFormat, i, fileOutputStream);
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda84(this, str, new ArrayList(this.info.imageReceiverArray), new BitmapDrawable(bitmap), new ArrayList(this.info.imageReceiverGuidsArray)));
                                return;
                            }
                            removeTask();
                            return;
                        }
                        String string2 = this.originalPath.toString();
                        if (!this.info.big) {
                            i3 = 1;
                        }
                        bitmapLoadBitmap = SendMessagesHelper.createVideoThumbnail(string2, i3);
                    }
                    bitmap = bitmapLoadBitmap;
                    if (bitmap == null) {
                        removeTask();
                        return;
                    }
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                    if (width != 0) {
                        float f6 = width;
                        float f7 = iMin;
                        float f8 = height;
                        fMin = Math.min(f6 / f7, f8 / f7);
                        if (fMin > 1.0f) {
                            bitmap.recycle();
                            bitmap = bitmapCreateScaledBitmap;
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
                        if (this.info.big) {
                            i = 83;
                        } else {
                            i = 60;
                        }
                        bitmap.compress(compressFormat2, i, fileOutputStream2);
                        fileOutputStream2.close();
                        AndroidUtilities.runOnUIThread(new MessagesStorage$$ExternalSyntheticLambda84(this, str, new ArrayList(this.info.imageReceiverArray), new BitmapDrawable(bitmap), new ArrayList(this.info.imageReceiverGuidsArray)));
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
        this.thumbGeneratingQueue.setPriority(1);
        int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
        boolean z = memoryClass >= 192;
        this.canForce8888 = z;
        int iMin = Math.min(z ? 30 : 15, memoryClass / 7) * 1048576;
        float f = iMin;
        this.memCache = new LruCache<BitmapDrawable>((int) (0.8f * f)) {
            @Override
            public void entryRemoved(boolean z2, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
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
        this.smallImagesMemCache = new LruCache<BitmapDrawable>((int) (f * 0.2f)) {
            @Override
            public void entryRemoved(boolean z2, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
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
            public void entryRemoved(boolean z2, String str, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
                Integer num = (Integer) ImageLoader.this.bitmapUseCounts.get(str);
                boolean z3 = bitmapDrawable instanceof AnimatedFileDrawable;
                if (z3) {
                    ImageLoader.this.cachedAnimatedFileDrawables.remove((AnimatedFileDrawable) bitmapDrawable);
                }
                if (num == null || num.intValue() == 0) {
                    if (z3) {
                        ((AnimatedFileDrawable) bitmapDrawable).recycle();
                    }
                    if (bitmapDrawable instanceof RLottieDrawable) {
                        ((RLottieDrawable) bitmapDrawable).recycle(false);
                    }
                }
            }

            @Override
            public BitmapDrawable put(String str, BitmapDrawable bitmapDrawable) {
                if (bitmapDrawable instanceof AnimatedFileDrawable) {
                    ImageLoader.this.cachedAnimatedFileDrawables.add((AnimatedFileDrawable) bitmapDrawable);
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        for (int i = 0; i < 4; i++) {
            FileLoader.getInstance(i).setDelegate(new AnonymousClass5(i));
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
        this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda2(this, str, 1));
    }

    private boolean canMoveFiles(File file, File file2, int i) throws Throwable {
        RandomAccessFile randomAccessFile;
        File file3;
        File file4;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i == 0 || i == 3 || i == 5 || i == 6 || i == 1 || i == 2) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    file4 = null;
                    file3 = null;
                }
                byte[] bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
                try {
                    randomAccessFile.write(bArr);
                    randomAccessFile.close();
                    boolean zRenameTo = file3.renameTo(file4);
                    file3.delete();
                    file4.delete();
                    return zRenameTo;
                } catch (Exception e) {
                    e = e;
                    randomAccessFile2 = randomAccessFile;
                    FileLog.e(e);
                    if (randomAccessFile2 == null) {
                        return false;
                    }
                    try {
                        randomAccessFile2.close();
                        return false;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e3) {
                            FileLog.e(e3);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = null;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    private void createLoadOperationForImageReceiver(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ImageLocation imageLocation, final String str4, final long j, final int i, final int i2, final int i3, final int i4) {
        if (imageReceiver == null || str2 == null || str == null || imageLocation == null) {
            return;
        }
        int tag = imageReceiver.getTag(i2);
        if (tag == 0) {
            tag = this.lastImageNum;
            imageReceiver.setTag(tag, i2);
            int i5 = this.lastImageNum + 1;
            this.lastImageNum = i5;
            if (i5 == Integer.MAX_VALUE) {
                this.lastImageNum = 0;
            }
        }
        final int i6 = tag;
        final boolean zIsNeedsQualityThumb = imageReceiver.isNeedsQualityThumb();
        final Object parentObject = imageReceiver.getParentObject();
        final TLRPC.Document qualityThumbDocument = imageReceiver.getQualityThumbDocument();
        final boolean zIsShouldGenerateQualityThumb = imageReceiver.isShouldGenerateQualityThumb();
        final int currentAccount = imageReceiver.getCurrentAccount();
        final boolean z = i2 == 0 && imageReceiver.isCurrentKeyQuality();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createLoadOperationForImageReceiver$7(i3, str2, str, i6, imageReceiver, i4, str4, i2, imageLocation, z, parentObject, currentAccount, qualityThumbDocument, zIsNeedsQualityThumb, zIsShouldGenerateQualityThumb, str3, i, j);
            }
        };
        this.imageLoadQueue.postRunnable(runnable, imageReceiver.getFileLoadingPriority() == 0 ? 0L : 1L);
        imageReceiver.addLoadingImageRunnable(runnable);
    }

    public static Drawable createStripedBitmap(ArrayList<TLRPC.PhotoSize> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) arrayList.get(i)).bytes, "b"));
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
        StringBuilder sb = new StringBuilder();
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
                            String string = sb.toString();
                            bufferedReader.close();
                            gZIPInputStream.close();
                            return string;
                        }
                        sb.append(line);
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

    public void fileDidFailedLoad(String str, int i) {
        if (i == 1) {
            return;
        }
        this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda2(this, str, 4));
    }

    public void fileDidLoaded(String str, File file, int i) {
        this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda14(this, str, i, file, 0));
    }

    public static TLRPC.PhotoSize fileToSize(String str, boolean z) {
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = SharedConfig.getLastLocalId();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.w = i;
            tL_photoSize_layer127.h = i2;
            if (i <= 100 && i2 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i <= 320 && i2 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i <= 800 && i2 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i > 1280 || i2 > 1280) {
                tL_photoSize_layer127.type = "w";
            } else {
                tL_photoSize_layer127.type = "y";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(tL_fileLocationToBeDeprecated.volume_id);
            sb.append("_");
            String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb);
            File directory = (z || tL_fileLocationToBeDeprecated.volume_id == -2147483648L) ? FileLoader.getDirectory(4) : FileLoader.getDirectory(0);
            File file = new File(directory, strM);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e) {
            FileLog.e(e);
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
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
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
        for (int i = 0; i < list.size(); i++) {
            ImageReceiver imageReceiver = list.get(i);
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
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i < size2) {
                TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i++;
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
        while (i < size3) {
            TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i);
            if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                return photoSize3;
            }
            i++;
        }
        return null;
    }

    public static MessageThumb generateMessageThumb(TLRPC.Message message) throws FileNotFoundException {
        int i;
        int i2;
        Bitmap strippedPhotoBitmap;
        byte[] bArr;
        TLRPC.PhotoSize photoSizeFindPhotoCachedSize = findPhotoCachedSize(message);
        if (photoSizeFindPhotoCachedSize == null || (bArr = photoSizeFindPhotoCachedSize.bytes) == null || bArr.length == 0) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i3);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(message.media.document.thumbs, 320);
                        if (closestPhotoSizeWithSize == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= message.media.document.attributes.size()) {
                                    i = 0;
                                    i2 = 0;
                                    break;
                                }
                                if (message.media.document.attributes.get(i4) instanceof TLRPC.TL_documentAttributeVideo) {
                                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i4);
                                    i2 = tL_documentAttributeVideo.h;
                                    i = tL_documentAttributeVideo.w;
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            i2 = closestPhotoSizeWithSize.h;
                            i = closestPhotoSizeWithSize.w;
                        }
                        PointF messageSize = ChatMessageCell.getMessageSize(i, i2, 0, 0);
                        Locale locale = Locale.US;
                        String strippedKey = ImageLocation.getStrippedKey(message, message, photoSize);
                        float f = messageSize.x;
                        float f2 = AndroidUtilities.density;
                        String str = strippedKey + "_false@" + ((int) (f / f2)) + "_" + ((int) (messageSize.y / f2)) + "_b";
                        if (!getInstance().isInMemCache(str, false) && (strippedPhotoBitmap = getStrippedPhotoBitmap(photoSize.bytes, null)) != null) {
                            Utilities.blurBitmap(strippedPhotoBitmap, 3);
                            float f3 = messageSize.x;
                            float f4 = AndroidUtilities.density;
                            Bitmap bitmapCreateScaledBitmap = Bitmaps.createScaledBitmap(strippedPhotoBitmap, (int) (f3 / f4), (int) (messageSize.y / f4), true);
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
            tL_photoSize_layer127.w = photoSizeFindPhotoCachedSize.w;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.size = photoSizeFindPhotoCachedSize.size;
            tL_photoSize_layer127.type = photoSizeFindPhotoCachedSize.type;
            if (pathToAttach.exists() && message.grouped_id == 0) {
                PointF messageSize2 = ChatMessageCell.getMessageSize(photoSizeFindPhotoCachedSize.w, photoSizeFindPhotoCachedSize.h, 0, 0);
                Locale locale2 = Locale.US;
                TLRPC.FileLocation fileLocation = photoSizeFindPhotoCachedSize.location;
                long j = fileLocation.volume_id;
                int i5 = fileLocation.local_id;
                float f5 = messageSize2.x;
                float f6 = AndroidUtilities.density;
                String str2 = j + "_" + i5 + "@" + ((int) (f5 / f6)) + "_" + ((int) (messageSize2.y / f6)) + "_b";
                if (!getInstance().isInMemCache(str2, false)) {
                    String path = pathToAttach.getPath();
                    float f7 = messageSize2.x;
                    float f8 = AndroidUtilities.density;
                    Bitmap bitmapLoadBitmap = loadBitmap(path, null, (int) (f7 / f8), (int) (messageSize2.y / f8), false);
                    if (bitmapLoadBitmap != null) {
                        Utilities.blurBitmap(bitmapLoadBitmap, 3);
                        float f9 = messageSize2.x;
                        float f10 = AndroidUtilities.density;
                        Bitmap bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(bitmapLoadBitmap, (int) (f9 / f10), (int) (messageSize2.y / f10), true);
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

    private void generateThumb(int i, File file, ThumbGenerateInfo thumbGenerateInfo) {
        if ((i != 0 && i != 2 && i != 3) || file == null || thumbGenerateInfo == null) {
            return;
        }
        if (this.thumbGenerateTasks.get(FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)) == null) {
            this.thumbGeneratingQueue.postRunnable(new ThumbGenerateTask(i, file, thumbGenerateInfo));
        }
    }

    public BitmapDrawable getFromLottieCache(String str) {
        BitmapDrawable bitmapDrawable = this.lottieMemCache.get(str);
        if (!(bitmapDrawable instanceof AnimatedFileDrawable)) {
            return bitmapDrawable;
        }
        AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) bitmapDrawable;
        if (!animatedFileDrawable.isRecycled && animatedFileDrawable.decoderTryCount < 15) {
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
            for (int i = 0; i < ApplicationLoader.applicationContext.getExternalMediaDirs().length; i++) {
                File file2 = ApplicationLoader.applicationContext.getExternalMediaDirs()[i];
                if (file2 != null && file2.getPath().startsWith(SharedConfig.storageCacheDir)) {
                    file = ApplicationLoader.applicationContext.getExternalMediaDirs()[i];
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
        boolean z = !TextUtils.isEmpty(str) && str.contains("r");
        options.inPreferredConfig = (SharedConfig.deviceIsHigh() || z) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, length, options);
        if (z) {
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
        for (int i = 0; i < strArrSplit.length; i++) {
            if ("g".equals(strArrSplit[i]) || "gl".equals(strArrSplit[i]) || "pframe".equals(strArrSplit[i])) {
                return true;
            }
        }
        return false;
    }

    public void httpFileLoadError(String str) {
        this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda2(this, str, 3));
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

    public void lambda$cancelLoadingForImageReceiver$4(boolean z, ImageReceiver imageReceiver) {
        int i = 0;
        while (true) {
            int i2 = 3;
            if (i >= 3) {
                return;
            }
            if (i > 0 && !z) {
                return;
            }
            if (i == 0) {
                i2 = 1;
            } else if (i == 1) {
                i2 = 0;
            }
            int tag = imageReceiver.getTag(i2);
            if (tag != 0) {
                if (i == 0) {
                    removeFromWaitingForThumb(tag, imageReceiver);
                }
                CacheImage cacheImage = this.imageLoadingByTag.get(tag);
                if (cacheImage != null) {
                    cacheImage.removeImageReceiver(imageReceiver);
                }
            }
            i++;
        }
    }

    public void lambda$changeFileLoadingPriorityForImageReceiver$3(ImageReceiver imageReceiver, int i) {
        CacheImage cacheImage;
        int i2 = 0;
        while (true) {
            int i3 = 3;
            if (i2 >= 3) {
                return;
            }
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 == 1) {
                i3 = 0;
            }
            int tag = imageReceiver.getTag(i3);
            if (tag != 0 && (cacheImage = this.imageLoadingByTag.get(tag)) != null) {
                cacheImage.changePriority(i);
            }
            i2++;
        }
    }

    public static void lambda$checkMediaPaths$0(SparseArray sparseArray, Runnable runnable) {
        FileLoader.setMediaDirs(sparseArray);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$checkMediaPaths$1(Runnable runnable) {
        AndroidUtilities.runOnUIThread(new FileLog$$ExternalSyntheticLambda3(13, createMediaPaths(), runnable));
    }

    public void lambda$createLoadOperationForImageReceiver$7(int i, String str, String str2, int i2, ImageReceiver imageReceiver, int i3, String str3, int i4, ImageLocation imageLocation, boolean z, Object obj, int i5, TLRPC.Document document, boolean z2, boolean z3, String str4, int i6, long j) {
        String str5;
        int i7;
        boolean z4;
        String str6;
        boolean z5;
        int mediaType;
        String str7;
        File pathToMessage;
        int i8;
        File file;
        boolean z6;
        File file2;
        File file3;
        String attachFileName;
        ThumbGenerateInfo thumbGenerateInfo;
        TLRPC.Document document2;
        boolean z7;
        int i9;
        String str8;
        int i10;
        boolean z8;
        long j2;
        int i11;
        DispatchQueuePriority dispatchQueuePriority;
        Runnable priorityRunnable;
        int i12;
        long j3;
        String str9;
        String str10;
        File file4;
        int i13;
        boolean z9;
        boolean z10;
        ImageReceiver imageReceiver2 = imageReceiver;
        TLRPC.Document document3 = document;
        if (i != 2) {
            CacheImage cacheImage = this.imageLoadingByUrl.get(str);
            CacheImage cacheImage2 = this.imageLoadingByKeys.get(str2);
            CacheImage cacheImage3 = this.imageLoadingByTag.get(i2);
            if (cacheImage3 != null) {
                if (cacheImage3 == cacheImage2) {
                    cacheImage3.setImageReceiverGuid(imageReceiver2, i3);
                    cacheImage = cacheImage;
                    cacheImage2 = cacheImage2;
                    i7 = 0;
                } else if (cacheImage3 == cacheImage) {
                    cacheImage = cacheImage;
                    cacheImage2 = cacheImage2;
                    i7 = 0;
                    if (cacheImage2 == null) {
                        cacheImage3.replaceImageReceiver(imageReceiver2, str2, str3, i4, i3);
                    }
                } else {
                    i7 = 0;
                    cacheImage3.removeImageReceiver(imageReceiver2);
                }
                z10 = true;
                if (!z10 && cacheImage2 != null) {
                    cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i4, i3);
                    z10 = true;
                }
                if (!z10 || cacheImage == null) {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    z4 = z10;
                } else {
                    imageReceiver2 = imageReceiver;
                    str5 = str3;
                    cacheImage.addImageReceiver(imageReceiver2, str2, str5, i4, i3);
                    z4 = true;
                }
            } else {
                i7 = 0;
            }
            z10 = false;
            if (!z10) {
                cacheImage2.addImageReceiver(imageReceiver2, str2, str3, i4, i3);
                z10 = true;
            }
            if (z10) {
                imageReceiver2 = imageReceiver;
                str5 = str3;
                z4 = z10;
            } else {
                imageReceiver2 = imageReceiver;
                str5 = str3;
                z4 = z10;
            }
        } else {
            str5 = str3;
            i7 = 0;
            z4 = false;
        }
        if (z4) {
            return;
        }
        String str11 = imageLocation.path;
        String str12 = "_";
        if (str11 != null) {
            if (str11.startsWith("http") || str11.startsWith("athumb")) {
                str6 = "athumb";
                str12 = "_";
                i8 = i;
                z6 = false;
                z7 = false;
            } else if (str11.startsWith("thumb://")) {
                int iIndexOf = str11.indexOf(":", 8);
                if (iIndexOf >= 0) {
                    file3 = new File(str11.substring(iIndexOf + 1));
                    i8 = i;
                    str6 = "athumb";
                    str12 = "_";
                    z6 = false;
                    z7 = true;
                    i9 = 2;
                }
                i8 = i;
                str6 = "athumb";
                z6 = false;
                z7 = true;
            } else {
                if (str11.startsWith("vthumb://")) {
                    int iIndexOf2 = str11.indexOf(":", 9);
                    if (iIndexOf2 >= 0) {
                        file3 = new File(str11.substring(iIndexOf2 + 1));
                    }
                    i8 = i;
                    str6 = "athumb";
                    z6 = false;
                    z7 = true;
                } else {
                    file3 = new File(str11);
                }
                i8 = i;
                str6 = "athumb";
                str12 = "_";
                z6 = false;
                z7 = true;
                i9 = 2;
            }
            i9 = 2;
            file3 = null;
        } else {
            if (i == 0 && z) {
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    document2 = messageObject.getDocument();
                    str7 = messageObject.messageOwner.attachPath;
                    str6 = "athumb";
                    pathToMessage = FileLoader.getInstance(i5).getPathToMessage(messageObject.messageOwner);
                    mediaType = messageObject.getMediaType();
                    z5 = false;
                } else {
                    str6 = "athumb";
                    if (document3 != null) {
                        File pathToAttach = FileLoader.getInstance(i5).getPathToAttach(document3, true);
                        mediaType = MessageObject.isVideoDocument(document3) ? 2 : 3;
                        pathToMessage = pathToAttach;
                        z5 = true;
                        str7 = null;
                    } else {
                        z5 = false;
                        mediaType = 0;
                        document3 = null;
                        str7 = null;
                        pathToMessage = null;
                    }
                }
                if (document3 != null) {
                    if (z2) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb = new StringBuilder("q_");
                        sb.append(document3.dc_id);
                        sb.append("_");
                        str12 = "_";
                        file = new File(directory, SurfaceContainer$$ExternalSyntheticOutline0.m(sb, document3.id, ".jpg"));
                        if (file.exists()) {
                            z6 = true;
                        }
                        if (TextUtils.isEmpty(str7)) {
                            file2 = null;
                        } else {
                            file2 = new File(str7);
                            if (!file2.exists()) {
                                file2 = null;
                            }
                        }
                        if (file2 == null) {
                            file2 = pathToMessage;
                        }
                        if (file == null) {
                            attachFileName = FileLoader.getAttachFileName(document3);
                            thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                            if (thumbGenerateInfo == null) {
                                thumbGenerateInfo = new ThumbGenerateInfo();
                                thumbGenerateInfo.parentDocument = document3;
                                thumbGenerateInfo.filter = str5;
                                thumbGenerateInfo.big = z5;
                                this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                            }
                            if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver2)) {
                                thumbGenerateInfo.imageReceiverArray.add(imageReceiver2);
                                thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i3));
                            }
                            this.waitingForQualityThumbByTag.put(i2, attachFileName);
                            if (file2.exists() || !z3) {
                                return;
                            }
                            generateThumb(mediaType, file2, thumbGenerateInfo);
                            return;
                        }
                        i8 = i;
                        file3 = file;
                        z7 = true;
                        i9 = 2;
                    } else {
                        str12 = "_";
                    }
                    z6 = false;
                    file = null;
                    if (TextUtils.isEmpty(str7)) {
                        file2 = new File(str7);
                        if (!file2.exists()) {
                            file2 = null;
                        }
                    } else {
                        file2 = null;
                    }
                    if (file2 == null) {
                        file2 = pathToMessage;
                    }
                    if (file == null) {
                        attachFileName = FileLoader.getAttachFileName(document3);
                        thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                        if (thumbGenerateInfo == null) {
                            thumbGenerateInfo = new ThumbGenerateInfo();
                            thumbGenerateInfo.parentDocument = document3;
                            thumbGenerateInfo.filter = str5;
                            thumbGenerateInfo.big = z5;
                            this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                        }
                        if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver2)) {
                            thumbGenerateInfo.imageReceiverArray.add(imageReceiver2);
                            thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i3));
                        }
                        this.waitingForQualityThumbByTag.put(i2, attachFileName);
                        if (file2.exists()) {
                            return;
                        } else {
                            return;
                        }
                    }
                    i8 = i;
                    file3 = file;
                    z7 = true;
                    i9 = 2;
                } else {
                    document3 = document2;
                    i8 = i;
                    z6 = false;
                    z7 = true;
                }
            } else {
                str6 = "athumb";
                str12 = "_";
                i8 = i;
                z6 = false;
                z7 = false;
            }
            i9 = 2;
            file3 = null;
        }
        if (i8 != i9) {
            boolean zIsEncrypted = imageLocation.isEncrypted();
            boolean z11 = z7;
            CacheImage cacheImage4 = new CacheImage();
            cacheImage4.priority = imageReceiver2.getFileLoadingPriority() == 0 ? 0 : 1;
            if (!z) {
                if (imageLocation.imageType == i9 || MessageObject.isGifDocument(imageLocation.webFile) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.isVideoSticker(imageLocation.document)) {
                    cacheImage4.imageType = i9;
                } else {
                    String str13 = imageLocation.path;
                    if (str13 != null && !str13.startsWith("vthumb") && !str13.startsWith("thumb")) {
                        String httpUrlExtension = getHttpUrlExtension(str13, "jpg");
                        if (httpUrlExtension.equalsIgnoreCase("webm") || httpUrlExtension.equalsIgnoreCase("mp4") || httpUrlExtension.equalsIgnoreCase("gif")) {
                            cacheImage4.imageType = i9;
                        } else if ("tgs".equals(str4)) {
                            cacheImage4.imageType = 1;
                        }
                    }
                }
            }
            if (file3 == null) {
                TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                j2 = 0;
                String str14 = "gl";
                String str15 = "g";
                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                    str8 = str;
                    str14 = "gl";
                    str15 = "g";
                    i10 = i6;
                    z6 = z6;
                    j3 = 0;
                    z8 = true;
                } else {
                    SecureDocument secureDocument = imageLocation.secureDocument;
                    if (secureDocument != null) {
                        cacheImage4.secureDocument = secureDocument;
                        boolean z12 = secureDocument.secureFile.dc_id == Integer.MIN_VALUE;
                        str8 = str;
                        file3 = new File(FileLoader.getDirectory(4), str8);
                        z8 = z12;
                        str14 = "gl";
                        str15 = "g";
                    } else {
                        str8 = str;
                        boolean z13 = z6;
                        if ("g".equals(str5) || "gl".equals(str5) || isAnimatedAvatar(str5)) {
                            str9 = "application/x-tgwallpattern";
                        } else if (i6 != 0 || j <= 0 || imageLocation.path != null || zIsEncrypted) {
                            file3 = new File(FileLoader.getDirectory(4), str8);
                            if (file3.exists()) {
                                i13 = i6;
                                z9 = true;
                            } else {
                                i13 = i6;
                                if (i13 == 2) {
                                    file3 = new File(FileLoader.getDirectory(4), zzhr.m(str8, ".enc"));
                                }
                                z9 = z13;
                            }
                            TLRPC.Document document4 = imageLocation.document;
                            z6 = z9;
                            if (document4 == null) {
                                z8 = z11;
                            } else {
                                if (document4 instanceof DocumentObject.ThemeDocument) {
                                    if (((DocumentObject.ThemeDocument) document4).wallpaper == null) {
                                        z11 = true;
                                    }
                                    cacheImage4.imageType = 5;
                                } else if ("application/x-tgsdice".equals(document4.mime_type)) {
                                    cacheImage4.imageType = 1;
                                    z8 = true;
                                } else if ("application/x-tgsticker".equals(imageLocation.document.mime_type)) {
                                    cacheImage4.imageType = 1;
                                } else if ("application/x-tgwallpattern".equals(imageLocation.document.mime_type) || FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                    cacheImage4.imageType = 3;
                                }
                                z8 = z11;
                            }
                            j3 = 0;
                            i10 = i13;
                        } else {
                            str9 = "application/x-tgwallpattern";
                        }
                        TLRPC.Document document5 = imageLocation.document;
                        if (document5 != null) {
                            z8 = z11;
                            if (document5 instanceof TLRPC.TL_documentEncrypted) {
                                file4 = new File(FileLoader.getDirectory(4), str8);
                            } else {
                                file4 = MessageObject.isVideoDocument(document5) ? new File(FileLoader.getDirectory(2), str8) : new File(FileLoader.getDirectory(3), str8);
                            }
                            if ((isAnimatedAvatar(str5) || "g".equals(str5) || "gl".equals(str5)) && !file4.exists()) {
                                File directory2 = FileLoader.getDirectory(4);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(document5.dc_id);
                                sb2.append(str12);
                                file4 = new File(directory2, SurfaceContainer$$ExternalSyntheticOutline0.m(sb2, document5.id, ".temp"));
                            }
                            file3 = file4;
                            if (document5 instanceof DocumentObject.ThemeDocument) {
                                if (((DocumentObject.ThemeDocument) document5).wallpaper == null) {
                                    z8 = true;
                                }
                                cacheImage4.imageType = 5;
                            } else {
                                if ("application/x-tgsdice".equals(imageLocation.document.mime_type)) {
                                    cacheImage4.imageType = 1;
                                    z8 = true;
                                } else if ("application/x-tgsticker".equals(document5.mime_type)) {
                                    cacheImage4.imageType = 1;
                                } else if (str9.equals(document5.mime_type) || FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                    cacheImage4.imageType = 3;
                                }
                                z6 = z13;
                                i10 = i6;
                                j3 = document5.size;
                                str14 = "gl";
                            }
                            z6 = z13;
                            i10 = i6;
                            j3 = document5.size;
                            str14 = "gl";
                        } else {
                            z8 = z11;
                            str15 = "g";
                            String str16 = str12;
                            if (imageLocation.webFile != null) {
                                file3 = new File(FileLoader.getDirectory(3), str8);
                                z6 = z13;
                                str14 = "gl";
                            } else {
                                i10 = i6;
                                file3 = i10 == 1 ? new File(FileLoader.getDirectory(4), str8) : new File(FileLoader.getDirectory(i7), str8);
                                if (isAnimatedAvatar(str5)) {
                                    str14 = "gl";
                                    str10 = str15;
                                } else {
                                    str10 = str15;
                                    if (str10.equals(str5)) {
                                        str14 = "gl";
                                    } else {
                                        str14 = "gl";
                                        if (str14.equals(str5)) {
                                        }
                                        z6 = z13;
                                        j3 = 0;
                                        str15 = str10;
                                    }
                                    if (imageLocation.location == null || file3.exists()) {
                                        z6 = z13;
                                        j3 = 0;
                                        str15 = str10;
                                    }
                                }
                                File directory3 = FileLoader.getDirectory(4);
                                StringBuilder sb3 = new StringBuilder();
                                str15 = str10;
                                sb3.append(imageLocation.location.volume_id);
                                sb3.append(str16);
                                file3 = new File(directory3, SurfaceContainer$$ExternalSyntheticOutline0.m(imageLocation.location.local_id, ".temp", sb3));
                                z6 = z13;
                                j3 = 0;
                            }
                        }
                    }
                    j3 = 0;
                    i10 = i6;
                }
                if (hasAutoplayFilter(str5) || isAnimatedAvatar(str5)) {
                    cacheImage4.imageType = 2;
                    cacheImage4.size = j3;
                    cacheImage4.isPFrame = isPFrame(str5);
                    if (str15.equals(str5) || str14.equals(str5) || isAnimatedAvatar(str5)) {
                        z8 = true;
                    }
                }
                cacheImage4.type = i4;
                cacheImage4.key = str2;
                cacheImage4.cacheType = i10;
                cacheImage4.filter = str5;
                cacheImage4.imageLocation = imageLocation;
                cacheImage4.ext = str4;
                cacheImage4.currentAccount = i5;
                cacheImage4.parentObject = obj;
                i11 = imageLocation.imageType;
                if (i11 != 0) {
                    cacheImage4.imageType = i11;
                }
                if (i10 == 2) {
                    cacheImage4.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), zzhr.m(str8, ".enc.key"));
                }
                boolean z14 = z6;
                String str17 = str6;
                cacheImage4.addImageReceiver(imageReceiver, str2, str5, i4, i3);
                if (!z8 || z14 || file3.exists()) {
                    cacheImage4.finalFilePath = file3;
                    cacheImage4.imageLocation = imageLocation;
                    cacheImage4.cacheTask = new CacheOutTask(cacheImage4);
                    this.imageLoadingByKeys.put(str2, cacheImage4);
                    this.imageLoadingKeys.add(cutFilter(str2));
                    if (i != 0) {
                        this.cacheThumbOutQueue.postRunnable(cacheImage4.cacheTask);
                        return;
                    }
                    dispatchQueuePriority = this.cacheOutQueue;
                    priorityRunnable = cacheImage4.cacheTask;
                    i12 = cacheImage4.priority;
                    if (i12 != 1) {
                        dispatchQueuePriority.getClass();
                        priorityRunnable = new DispatchQueuePriority.PriorityRunnable(i12, priorityRunnable);
                    }
                    dispatchQueuePriority.threadPoolExecutor.execute(priorityRunnable);
                    cacheImage4.runningTask = priorityRunnable;
                }
                cacheImage4.url = str8;
                this.imageLoadingByUrl.put(str8, cacheImage4);
                if (cacheImage4.isPFrame) {
                    this.imageLoadingByUrlPframe.put(str8, cacheImage4);
                }
                String str18 = imageLocation.path;
                if (str18 != null) {
                    cacheImage4.tempFilePath = new File(FileLoader.getDirectory(4), zzhr.m(Utilities.MD5(str18), "_temp.jpg"));
                    cacheImage4.finalFilePath = file3;
                    if (imageLocation.path.startsWith(str17)) {
                        ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage4);
                        cacheImage4.artworkTask = artworkLoadTask;
                        this.artworkTasks.add(artworkLoadTask);
                        runArtworkTasks(false);
                        return;
                    }
                    HttpImageTask httpImageTask = new HttpImageTask(cacheImage4, j);
                    cacheImage4.httpTask = httpImageTask;
                    this.httpTasks.add(httpImageTask);
                    runHttpTasks(false);
                    return;
                }
                int fileLoadingPriority = i != 0 ? 3 : imageReceiver.getFileLoadingPriority();
                if (imageLocation.location != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation, obj, str4, fileLoadingPriority, (i10 != 0 || (j > j2 && imageLocation.key == null)) ? i10 : 1);
                } else if (imageLocation.document != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation.document, obj, fileLoadingPriority, i10);
                } else if (imageLocation.secureDocument != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation.secureDocument, fileLoadingPriority);
                } else if (imageLocation.webFile != null) {
                    FileLoader.getInstance(i5).loadFile(imageLocation.webFile, fileLoadingPriority, i10);
                }
                if (imageReceiver.isForceLoding()) {
                    this.forceLoadingImages.put(cacheImage4.key, 0);
                    return;
                }
                return;
            }
            str8 = str;
            i10 = i6;
            z8 = z11;
            j2 = 0;
            cacheImage4.type = i4;
            cacheImage4.key = str2;
            cacheImage4.cacheType = i10;
            cacheImage4.filter = str5;
            cacheImage4.imageLocation = imageLocation;
            cacheImage4.ext = str4;
            cacheImage4.currentAccount = i5;
            cacheImage4.parentObject = obj;
            i11 = imageLocation.imageType;
            if (i11 != 0) {
                cacheImage4.imageType = i11;
            }
            if (i10 == 2) {
                cacheImage4.encryptionKeyPath = new File(FileLoader.getInternalCacheDir(), zzhr.m(str8, ".enc.key"));
            }
            boolean z15 = z6;
            String str19 = str6;
            cacheImage4.addImageReceiver(imageReceiver, str2, str5, i4, i3);
            if (z8) {
            }
            cacheImage4.finalFilePath = file3;
            cacheImage4.imageLocation = imageLocation;
            cacheImage4.cacheTask = new CacheOutTask(cacheImage4);
            this.imageLoadingByKeys.put(str2, cacheImage4);
            this.imageLoadingKeys.add(cutFilter(str2));
            if (i != 0) {
                this.cacheThumbOutQueue.postRunnable(cacheImage4.cacheTask);
                return;
            }
            dispatchQueuePriority = this.cacheOutQueue;
            priorityRunnable = cacheImage4.cacheTask;
            i12 = cacheImage4.priority;
            if (i12 != 1) {
                dispatchQueuePriority.getClass();
                priorityRunnable = new DispatchQueuePriority.PriorityRunnable(i12, priorityRunnable);
            }
            dispatchQueuePriority.threadPoolExecutor.execute(priorityRunnable);
            cacheImage4.runningTask = priorityRunnable;
        }
    }

    public void lambda$fileDidFailedLoad$12(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage != null) {
            cacheImage.setImageAndClear(null, null);
        }
    }

    public void lambda$fileDidLoaded$11(String str, int i, File file) {
        Runnable priorityRunnable;
        ThumbGenerateInfo thumbGenerateInfo = this.waitingForQualityThumb.get(str);
        if (thumbGenerateInfo != null && thumbGenerateInfo.parentDocument != null) {
            generateThumb(i, file, thumbGenerateInfo);
            this.waitingForQualityThumb.remove(str);
        }
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage == null) {
            return;
        }
        this.imageLoadingByUrl.remove(str);
        this.imageLoadingByUrlPframe.remove(str);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < cacheImage.imageReceiverArray.size(); i2++) {
            String str2 = cacheImage.keys.get(i2);
            String str3 = cacheImage.filters.get(i2);
            int iIntValue = cacheImage.types.get(i2).intValue();
            ImageReceiver imageReceiver = cacheImage.imageReceiverArray.get(i2);
            int iIntValue2 = cacheImage.imageReceiverGuidsArray.get(i2).intValue();
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            CacheOutTask cacheOutTask = (CacheOutTask) arrayList.get(i3);
            if (cacheOutTask.cacheImage.type == 1) {
                this.cacheThumbOutQueue.postRunnable(cacheOutTask);
            } else {
                DispatchQueuePriority dispatchQueuePriority = this.cacheOutQueue;
                int i4 = cacheOutTask.cacheImage.priority;
                if (i4 != 1) {
                    priorityRunnable = cacheOutTask;
                    dispatchQueuePriority.getClass();
                    priorityRunnable = new DispatchQueuePriority.PriorityRunnable(i4, cacheOutTask);
                }
                priorityRunnable = cacheOutTask;
                dispatchQueuePriority.threadPoolExecutor.execute(priorityRunnable);
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
        } catch (Exception e) {
            FileLog.e(e);
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
        int i = forPath.imageType;
        if (i != 0) {
            cacheImage.imageType = i;
        }
        cacheImage.url = str2;
        this.imageLoadingByUrl.put(str2, cacheImage);
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), zzhr.m(Utilities.MD5(forPath.path), "_temp.jpg"));
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

    public void lambda$runHttpFileLoadTasks$14(HttpFileTask httpFileTask, int i) {
        ImageLoader imageLoader;
        int i2 = 0;
        if (httpFileTask != null) {
            this.currentHttpFileLoadTasksCount--;
        }
        if (httpFileTask == null) {
            imageLoader = this;
        } else if (i != 1) {
            imageLoader = this;
            if (i == 2) {
                imageLoader.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                File file = new File(FileLoader.getDirectory(4), Utilities.MD5(httpFileTask.url) + "." + httpFileTask.ext);
                if (!httpFileTask.tempFile.renameTo(file)) {
                    file = httpFileTask.tempFile;
                }
                NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidLoad, httpFileTask.url, file.toString());
            }
        } else if (httpFileTask.canRetry) {
            imageLoader = this;
            ImageLoader$$ExternalSyntheticLambda5 imageLoader$$ExternalSyntheticLambda5 = new ImageLoader$$ExternalSyntheticLambda5(i2, this, imageLoader.new HttpFileTask(httpFileTask.url, httpFileTask.tempFile, httpFileTask.ext, httpFileTask.currentAccount));
            imageLoader.retryHttpsTasks.put(httpFileTask.url, imageLoader$$ExternalSyntheticLambda5);
            AndroidUtilities.runOnUIThread(imageLoader$$ExternalSyntheticLambda5, 1000L);
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

    public static Bitmap loadBitmap(String str, Uri uri, float f, float f2, boolean z) throws FileNotFoundException {
        String str2;
        InputStream inputStreamOpenInputStream;
        float f3;
        float f4;
        float fMin;
        int i;
        Matrix matrix;
        float f5;
        Matrix matrix2;
        Bitmap bitmapDecodeFile;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
        Bitmap bitmapDecodeStream;
        Bitmap bitmapCreateBitmap3;
        Pair<Integer, Integer> imageOrientation;
        float f6;
        float f7;
        InputStream inputStreamOpenInputStream2;
        int i2;
        int i3;
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
                    f3 = options.outWidth;
                    f4 = options.outHeight;
                    if (z) {
                        fMin = Math.max(f3 / f, f4 / f2);
                    } else {
                        fMin = Math.min(f3 / f, f4 / f2);
                    }
                    if (fMin < 1.0f) {
                        fMin = 1.0f;
                    }
                    options.inJustDecodeBounds = false;
                    i = (int) fMin;
                    options.inSampleSize = i;
                    if (i % 2 != 0) {
                        i2 = 1;
                        while (true) {
                            i3 = i2 * 2;
                            if (i3 < options.inSampleSize) {
                                break;
                            }
                            i2 = i3;
                        }
                        options.inSampleSize = i2;
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
                                if (inputStreamOpenInputStream2 != null) {
                                }
                                if (((Integer) imageOrientation.first).intValue() == 0) {
                                }
                                matrix = new Matrix();
                                if (((Integer) imageOrientation.second).intValue() != 0) {
                                    f6 = -1.0f;
                                    if (((Integer) imageOrientation.second).intValue() == 1) {
                                        f7 = -1.0f;
                                    } else {
                                        f7 = 1.0f;
                                    }
                                    if (((Integer) imageOrientation.second).intValue() != 2) {
                                        f6 = 1.0f;
                                    }
                                    matrix.postScale(f7, f6);
                                }
                                if (((Integer) imageOrientation.first).intValue() != 0) {
                                    matrix.postRotate(((Integer) imageOrientation.first).intValue());
                                }
                                f5 = fMin / options.inSampleSize;
                                if (f5 > 1.0f) {
                                    if (matrix == null) {
                                        matrix = new Matrix();
                                    }
                                    float f8 = 1.0f / f5;
                                    matrix.postScale(f8, f8);
                                }
                                matrix2 = matrix;
                                if (str2 == null) {
                                    try {
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
                                                        inputStreamOpenInputStream.close();
                                                    } catch (Throwable th4) {
                                                        try {
                                                            inputStreamOpenInputStream.close();
                                                            throw th4;
                                                        } catch (Throwable th5) {
                                                            FileLog.e(th5);
                                                            throw th4;
                                                        }
                                                    }
                                                }
                                            } else {
                                                bitmapDecodeFile2 = bitmapDecodeStream;
                                            }
                                            inputStreamOpenInputStream.close();
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                        return bitmapDecodeFile2;
                                    } catch (Throwable th7) {
                                        FileLog.e(th7);
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
                                        } catch (Throwable th8) {
                                            th = th8;
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
                                                                return bitmapCreateBitmap;
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            bitmapDecodeFile2 = bitmapDecodeFile;
                                                            FileLog.e(th);
                                                            return bitmapDecodeFile2;
                                                        }
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    FileLog.e(th);
                                                    return bitmapDecodeFile2;
                                                }
                                            } else {
                                                bitmapDecodeFile = bitmapDecodeFile2;
                                                if (bitmapDecodeFile != null) {
                                                    bitmapCreateBitmap = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix2, true);
                                                    if (bitmapCreateBitmap != bitmapDecodeFile) {
                                                        bitmapDecodeFile.recycle();
                                                        return bitmapCreateBitmap;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
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
                            f6 = -1.0f;
                            if (((Integer) imageOrientation.second).intValue() == 1) {
                                f7 = -1.0f;
                            } else {
                                f7 = 1.0f;
                            }
                            if (((Integer) imageOrientation.second).intValue() != 2) {
                                f6 = 1.0f;
                            }
                            matrix.postScale(f7, f6);
                        }
                        if (((Integer) imageOrientation.first).intValue() != 0) {
                            matrix.postRotate(((Integer) imageOrientation.first).intValue());
                        }
                    } else {
                        matrix = null;
                    }
                    f5 = fMin / options.inSampleSize;
                    if (f5 > 1.0f) {
                        if (matrix == null) {
                            matrix = new Matrix();
                        }
                        float f9 = 1.0f / f5;
                        matrix.postScale(f9, f9);
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
                    inputStreamOpenInputStream.close();
                    return bitmapDecodeFile2;
                }
                BitmapFactory.decodeFile(str2, options);
                if (((Integer) imageOrientation.second).intValue() != 0) {
                    f6 = -1.0f;
                    if (((Integer) imageOrientation.second).intValue() == 1) {
                        f7 = -1.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    if (((Integer) imageOrientation.second).intValue() != 2) {
                        f6 = 1.0f;
                    }
                    matrix.postScale(f7, f6);
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
        f3 = options.outWidth;
        f4 = options.outHeight;
        if (z) {
            fMin = Math.max(f3 / f, f4 / f2);
        } else {
            fMin = Math.min(f3 / f, f4 / f2);
        }
        if (fMin < 1.0f) {
            fMin = 1.0f;
        }
        options.inJustDecodeBounds = false;
        i = (int) fMin;
        options.inSampleSize = i;
        if (i % 2 != 0) {
            i2 = 1;
            while (true) {
                i3 = i2 * 2;
                if (i3 < options.inSampleSize) {
                    break;
                    break;
                }
                i2 = i3;
            }
            options.inSampleSize = i2;
        }
        f5 = fMin / options.inSampleSize;
        if (f5 > 1.0f) {
            if (matrix == null) {
                matrix = new Matrix();
            }
            float f10 = 1.0f / f5;
            matrix.postScale(f10, f10);
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
        inputStreamOpenInputStream.close();
        return bitmapDecodeFile2;
    }

    private static void moveDirectory(File file, final File file2) {
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    Stream streamConvert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    try {
                        streamConvert.forEach(new Consumer() {
                            @Override
                            public final void s(Object obj) {
                                ImageLoader.lambda$moveDirectory$2(file2, (java.nio.file.Path) obj);
                            }

                            public final Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        streamConvert.close();
                    } catch (Throwable th) {
                        if (streamConvert != null) {
                            try {
                                streamConvert.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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

    private void removeFromWaitingForThumb(int i, ImageReceiver imageReceiver) {
        String str = this.waitingForQualityThumbByTag.get(i);
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
            this.waitingForQualityThumbByTag.remove(i);
        }
    }

    public void lambda$replaceImageInCache$5(String str, String str2, ImageLocation imageLocation) {
        int i = 0;
        while (i < 2) {
            ArrayList<String> filterKeys = i == 0 ? this.memCache.getFilterKeys(str) : this.smallImagesMemCache.getFilterKeys(str);
            if (filterKeys != null) {
                for (int i2 = 0; i2 < filterKeys.size(); i2++) {
                    String str3 = filterKeys.get(i2);
                    String strM = zzit.m(str, "@", str3);
                    String strM2 = zzit.m(str2, "@", str3);
                    performReplace(strM, strM2);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, strM, strM2, imageLocation);
                }
            } else {
                performReplace(str, str2);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str, str2, imageLocation);
            }
            i++;
        }
    }

    public void runArtworkTasks(boolean z) {
        if (z) {
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

    public void runHttpFileLoadTasks(HttpFileTask httpFileTask, int i) {
        AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda5(this, httpFileTask, i, 1));
    }

    public void runHttpTasks(boolean z) {
        if (z) {
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
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            while (i < tL_messageMediaPaidMedia.extended_media.size()) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    saveMessageThumbs(message, ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media);
                }
                i++;
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
        if (photoSizeFindPhotoCachedSize.h > 50 || photoSizeFindPhotoCachedSize.w > 50) {
            boolean z = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSizeFindPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z = false;
            }
            if (!pathToAttach.exists()) {
                if (z) {
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(photoSizeFindPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = photoSizeFindPhotoCachedSize.w;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.size = photoSizeFindPhotoCachedSize.size;
            tL_photoSize_layer127.type = photoSizeFindPhotoCachedSize.type;
        } else {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = photoSizeFindPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.w = photoSizeFindPhotoCachedSize.w;
        }
        TLRPC.MessageMedia messageMedia2 = message.media;
        if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia2.photo.sizes.size();
            while (i < size) {
                if (message.media.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia2.document.thumbs.size();
            while (i < size2) {
                if (message.media.document.thumbs.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.document.thumbs.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia2 instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia2.webpage.photo.sizes.size();
            while (i < size3) {
                if (message.media.webpage.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    message.media.webpage.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
        }
    }

    public static void saveMessagesThumbs(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            saveMessageThumbs(arrayList.get(i));
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f, float f2, int i, boolean z) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, 0, 0, false);
    }

    private static TLRPC.PhotoSize scaleAndSaveImageInternal(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z, int i, int i2, float f, float f2, float f3, int i3, boolean z2, boolean z3, boolean z4) throws IOException {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        int i4;
        Bitmap bitmapCreateScaledBitmap = (f3 > 1.0f || z3) ? Bitmaps.createScaledBitmap(bitmap, i, i2, true) : bitmap;
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
                photoSize.w = bitmapCreateScaledBitmap.getWidth();
                int height = bitmapCreateScaledBitmap.getHeight();
                photoSize.h = height;
                i4 = photoSize.w;
                if (i4 > 100 && height <= 100) {
                    photoSize.type = "s";
                } else if (i4 > 320 && height <= 320) {
                    photoSize.type = "m";
                } else if (i4 > 800 && height <= 800) {
                    photoSize.type = "x";
                } else if (i4 <= 1280 || height > 1280) {
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
            photoSize.w = bitmapCreateScaledBitmap.getWidth();
            int height2 = bitmapCreateScaledBitmap.getHeight();
            photoSize.h = height2;
            i4 = photoSize.w;
            if (i4 > 100) {
                if (i4 > 320) {
                    if (i4 > 800) {
                        if (i4 <= 1280) {
                            photoSize.type = "w";
                        } else {
                            photoSize.type = "w";
                        }
                    } else if (i4 <= 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i4 > 800) {
                    if (i4 <= 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i4 <= 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i4 > 320) {
                if (i4 > 800) {
                    if (i4 <= 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i4 <= 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i4 > 800) {
                if (i4 <= 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i4 <= 1280) {
                photoSize.type = "w";
            } else {
                photoSize.type = "w";
            }
        }
        int i5 = AnonymousClass7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        String str = (i5 == 1 || i5 == 2 || i5 == 3) ? ".webp" : ".jpg";
        StringBuilder sb = new StringBuilder();
        sb.append(tL_fileLocationToBeDeprecated.volume_id);
        sb.append("_");
        String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(tL_fileLocationToBeDeprecated.local_id, str, sb);
        File directory = (z4 || tL_fileLocationToBeDeprecated.volume_id == -2147483648L) ? FileLoader.getDirectory(4) : FileLoader.getDirectory(0);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(directory, strM));
        bitmapCreateScaledBitmap.compress(compressFormat, i3, fileOutputStream);
        if (!z2) {
            photoSize.size = (int) fileOutputStream.getChannel().size();
        }
        fileOutputStream.close();
        if (z2) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateScaledBitmap.compress(compressFormat, i3, byteArrayOutputStream);
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
        float f = options.outWidth;
        float f2 = options.outHeight;
        return f / f2 > 10.0f || f2 / f > 10.0f;
    }

    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) bitmapDrawable;
            return Math.max(animatedFileDrawable.getIntrinsicHeight() * animatedFileDrawable.getIntrinsicWidth(), animatedFileDrawable.renderingWidth * animatedFileDrawable.renderingHeight) * 12;
        }
        if (!(bitmapDrawable instanceof RLottieDrawable)) {
            return bitmapDrawable.getBitmap().getByteCount();
        }
        RLottieDrawable rLottieDrawable = (RLottieDrawable) bitmapDrawable;
        int i = rLottieDrawable.width * rLottieDrawable.height;
        return rLottieDrawable.isSingleChannel ? i * 2 : i * 8;
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
        this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda2(this, imageKey, 2));
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

    public void cancelLoadingForImageReceiver(ImageReceiver imageReceiver, boolean z) {
        if (imageReceiver == null) {
            return;
        }
        HashMap map = WebInstantView.loadingPhotos;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                ArrayList arrayList = (ArrayList) entry.getValue();
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((Pair) arrayList.get(i)).first == imageReceiver) {
                        arrayList.remove(i);
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    WebInstantView.loadingPhotos.remove(str);
                    break;
                }
            }
        }
        ArrayList<Runnable> loadingOperations = imageReceiver.getLoadingOperations();
        if (!loadingOperations.isEmpty()) {
            for (int i2 = 0; i2 < loadingOperations.size(); i2++) {
                this.imageLoadQueue.cancelRunnable(loadingOperations.get(i2));
            }
            loadingOperations.clear();
        }
        imageReceiver.addLoadingImageRunnable(null);
        this.imageLoadQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda11(this, z, imageReceiver, 2));
    }

    public void changeFileLoadingPriorityForImageReceiver(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda5(this, imageReceiver, imageReceiver.getFileLoadingPriority(), 4));
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        AndroidUtilities.createEmptyFile(new File(cacheDir, ".nomedia"));
        sparseArray.put(4, cacheDir);
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("cache path = " + cacheDir);
        }
        SQLitePreparedStatement$$ExternalSyntheticOutline0.m(SharedConfig.storageCacheDir, new StringBuilder("selected SD card = "));
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file2 = null;
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                    if (rootDirs != null) {
                        int size = rootDirs.size();
                        for (int i = 0; i < size; i++) {
                            File file3 = rootDirs.get(i);
                            FileLog.d("root dir " + i + " " + file3);
                            if (file3.getAbsolutePath().startsWith(SharedConfig.storageCacheDir)) {
                                externalStorageDirectory = file3;
                                break;
                            }
                        }
                    }
                    if (!externalStorageDirectory.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && (externalFilesDirs = ApplicationLoader.applicationContext.getExternalFilesDirs(null)) != null) {
                        for (int i2 = 0; i2 < externalFilesDirs.length; i2++) {
                            if (externalFilesDirs[i2] != null) {
                                FileLog.d("dirsDebug " + i2 + " " + externalFilesDirs[i2]);
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
                                } catch (Exception e2) {
                                    e = e2;
                                    FileLog.e(e);
                                }
                            } catch (Exception e3) {
                                file = publicStorageDir;
                                e = e3;
                            }
                        } else {
                            file = null;
                        }
                    } catch (Exception e4) {
                        e = e4;
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
                    for (int i3 = 0; i3 < size2; i3++) {
                        File file4 = dataDirs.get(i3);
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
                    } catch (Exception e5) {
                        FileLog.e(e5);
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                    } catch (Exception e8) {
                        FileLog.e(e8);
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
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
                    } catch (Exception e11) {
                        FileLog.e(e11);
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
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.d("this Android can't rename files");
            }
            SharedConfig.checkSaveToGalleryFiles();
        } catch (Exception e13) {
            FileLog.e(e13);
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

    public DispatchQueuePriority getCacheOutQueue() {
        return this.cacheOutQueue;
    }

    public Float getFileProgress(String str) {
        long[] jArr;
        if (str == null || (jArr = this.fileProgresses.get(str)) == null) {
            return null;
        }
        long j = jArr[1];
        return j == 0 ? Float.valueOf(0.0f) : Float.valueOf(Math.min(1.0f, jArr[0] / j));
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
            strMD5 = document.dc_id + "_" + document.id;
        } else if (tLObject instanceof SecureDocument) {
            SecureDocument secureDocument = (SecureDocument) tLObject;
            strMD5 = secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.id;
        } else if (tLObject instanceof WebFile) {
            strMD5 = Utilities.MD5(((WebFile) tLObject).url);
        }
        if (str2 != null) {
            strMD5 = zzit.m(strMD5, "@", str2);
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

    public boolean isInMemCache(String str, boolean z) {
        if (z) {
            return getFromLottieCache(str) != null;
        }
        return getFromMemCache(str) != null;
    }

    public boolean isLoadingHttpFile(String str) {
        return this.httpFileLoadTasksByKeys.containsKey(str);
    }

    public void loadHttpFile(String str, String str2, int i) {
        if (str == null || str.length() == 0 || this.httpFileLoadTasksByKeys.containsKey(str)) {
            return;
        }
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        File file = new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "_temp." + httpUrlExtension);
        file.delete();
        HttpFileTask httpFileTask = new HttpFileTask(str, file, httpUrlExtension, i);
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
        for (int i = 0; i < this.cachedAnimatedFileDrawables.size(); i++) {
            this.cachedAnimatedFileDrawables.get(i).repeatCount = 0;
        }
    }

    public void preloadArtwork(String str) {
        this.imageLoadQueue.postRunnable(new ImageLoader$$ExternalSyntheticLambda2(this, str, 0));
    }

    public void putImageToCache(BitmapDrawable bitmapDrawable, String str, boolean z) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z) {
            this.smallImagesMemCache.put(str, bitmapDrawable);
        } else {
            this.memCache.put(str, bitmapDrawable);
        }
    }

    public void putThumbsToCache(ArrayList<MessageThumb> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            putImageToCache(arrayList.get(i).drawable, arrayList.get(i).key, true);
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

    public void replaceImageInCache(String str, String str2, ImageLocation imageLocation, boolean z) {
        if (z) {
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda10(this, str, str2, imageLocation, 0));
        } else {
            lambda$replaceImageInCache$5(str, str2, imageLocation);
        }
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float f, float f2, int i, boolean z, boolean z2) {
        return scaleAndSaveImage(photoSize, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, 0, 0, z2);
    }

    public void checkMediaPaths(Runnable runnable) {
        DispatchQueuePriority dispatchQueuePriority = this.cacheOutQueue;
        dispatchQueuePriority.threadPoolExecutor.execute(new FileLog$$ExternalSyntheticLambda3(12, this, runnable));
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver, List<ImageReceiver> list) {
        boolean z;
        boolean z2;
        boolean z3;
        ImageReceiver imageReceiver2;
        boolean z4;
        ImageLocation forDocument;
        boolean z5;
        ImageLocation imageLocation;
        String strM;
        String str;
        ImageLocation imageLocation2;
        String str2;
        ImageLocation imageLocation3;
        boolean z6;
        int i;
        boolean z7;
        ImageLocation imageLocation4;
        String str3;
        BitmapDrawable fromLottieCache;
        boolean zHasBitmap;
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
            if (drawable instanceof RLottieDrawable) {
                zHasBitmap = ((RLottieDrawable) drawable).hasBitmap();
            } else {
                zHasBitmap = drawable instanceof AnimatedFileDrawable ? ((AnimatedFileDrawable) drawable).hasBitmap() : true;
            }
            if (zHasBitmap && drawable != null) {
                cancelLoadingForImageReceiver(imageReceiver3, true);
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                if (!imageReceiver.isForcePreview()) {
                    return;
                }
                imageReceiver3 = imageReceiver;
                z = true;
                z2 = false;
            } else if (drawable != null) {
                imageReceiver3 = imageReceiver;
                imageReceiver3.setImageBitmapByKey(drawable, mediaKey, 3, true, newGuid);
                mediaKey = mediaKey;
                z = false;
                z2 = true;
            } else {
                imageReceiver3 = imageReceiver;
                z = false;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        String imageKey = imageReceiver3.getImageKey();
        if (z || imageKey == null) {
            z3 = z;
        } else {
            ImageLocation imageLocation5 = imageReceiver3.getImageLocation();
            BitmapDrawable bitmapDrawableFindInPreloadImageReceivers2 = findInPreloadImageReceivers(imageKey, list);
            if (bitmapDrawableFindInPreloadImageReceivers2 == null && useLottieMemCache(imageLocation5, imageKey)) {
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
                if (!imageReceiver.isForcePreview() && (mediaKey == null || z2)) {
                    return;
                } else {
                    z3 = true;
                }
            } else {
                z3 = z;
            }
        }
        String thumbKey = imageReceiver.getThumbKey();
        if (thumbKey == null) {
            imageReceiver2 = imageReceiver;
            z4 = false;
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
                if (z3 && imageReceiver2.isForcePreview()) {
                    return;
                } else {
                    z4 = true;
                }
            } else {
                imageReceiver2 = imageReceiver;
                z4 = false;
            }
        }
        Object parentObject = imageReceiver2.getParentObject();
        TLRPC.Document qualityThumbDocument = imageReceiver2.getQualityThumbDocument();
        ImageLocation thumbLocation = imageReceiver2.getThumbLocation();
        String thumbFilter = imageReceiver2.getThumbFilter();
        ImageLocation mediaLocation2 = imageReceiver2.getMediaLocation();
        String mediaFilter = imageReceiver2.getMediaFilter();
        ImageLocation imageLocation6 = imageReceiver2.getImageLocation();
        String imageFilter = imageReceiver2.getImageFilter();
        if (imageLocation6 == null && imageReceiver2.isNeedsQualityThumb() && imageReceiver2.isCurrentKeyQuality()) {
            if (parentObject instanceof MessageObject) {
                forDocument = ImageLocation.getForDocument(((MessageObject) parentObject).getDocument());
            } else if (qualityThumbDocument != null) {
                forDocument = ImageLocation.getForDocument(qualityThumbDocument);
            } else {
                forDocument = imageLocation6;
                z5 = false;
            }
            z5 = true;
        } else {
            forDocument = imageLocation6;
            z5 = false;
        }
        String str4 = null;
        String str5 = (forDocument == null || forDocument.imageType != 2) ? null : "mp4";
        String str6 = (mediaLocation2 == null || mediaLocation2.imageType != 2) ? null : "mp4";
        String ext = imageReceiver2.getExt();
        if (ext == null) {
            ext = "jpg";
        }
        String str7 = str5 == null ? ext : str5;
        if (str6 == null) {
            str6 = ext;
        }
        boolean z8 = z4;
        ImageLocation imageLocation7 = mediaLocation2;
        boolean z9 = z5;
        String strM2 = null;
        String strM3 = null;
        String str8 = null;
        String str9 = null;
        int i2 = 0;
        boolean z10 = false;
        while (true) {
            imageLocation = imageLocation6;
            if (i2 >= 2) {
                break;
            }
            if (i2 == 0) {
                imageLocation3 = forDocument;
                str2 = str7;
            } else {
                str2 = str6;
                imageLocation3 = imageLocation7;
            }
            if (imageLocation3 == null) {
                i = newGuid;
                z6 = z2;
            } else {
                z6 = z2;
                i = newGuid;
                String key = imageLocation3.getKey(parentObject, imageLocation7 != null ? imageLocation7 : forDocument, false);
                if (key != null) {
                    z7 = z3;
                    String key2 = imageLocation3.getKey(parentObject, imageLocation7 != null ? imageLocation7 : forDocument, true);
                    if (imageLocation3.path != null) {
                        StringBuilder sbM = Log.m(key2, ".");
                        sbM.append(getHttpUrlExtension(imageLocation3.path, "jpg"));
                        key2 = sbM.toString();
                        imageLocation4 = forDocument;
                        str3 = thumbFilter;
                    } else {
                        TLRPC.PhotoSize photoSize = imageLocation3.photoSize;
                        imageLocation4 = forDocument;
                        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                            str3 = thumbFilter;
                            key2 = zzit.m(key2, ".", str2);
                        } else if (imageLocation3.location != null) {
                            key2 = zzit.m(key2, ".", str2);
                            if (imageReceiver.getExt() == null) {
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation3.location;
                                if (tL_fileLocationToBeDeprecated.key == null) {
                                    str3 = thumbFilter;
                                    if (tL_fileLocationToBeDeprecated.volume_id == -2147483648L && tL_fileLocationToBeDeprecated.local_id < 0) {
                                    }
                                } else {
                                    str3 = thumbFilter;
                                }
                            } else {
                                str3 = thumbFilter;
                            }
                        } else {
                            str3 = thumbFilter;
                            WebFile webFile = imageLocation3.webFile;
                            if (webFile != null) {
                                String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
                                StringBuilder sbM2 = Log.m(key2, ".");
                                sbM2.append(getHttpUrlExtension(imageLocation3.webFile.url, mimeTypePart));
                                key2 = sbM2.toString();
                            } else if (imageLocation3.secureDocument != null) {
                                key2 = zzit.m(key2, ".", str2);
                            } else if (imageLocation3.document != null) {
                                if (i2 == 0 && z9) {
                                    key = "q_".concat(key);
                                }
                                String documentFileName = FileLoader.getDocumentFileName(imageLocation3.document);
                                int iLastIndexOf = documentFileName.lastIndexOf(46);
                                String str10 = "";
                                String strSubstring = iLastIndexOf == -1 ? "" : documentFileName.substring(iLastIndexOf);
                                if (strSubstring.length() > 1) {
                                    str10 = strSubstring;
                                } else if ("video/mp4".equals(imageLocation3.document.mime_type)) {
                                    str10 = ".mp4";
                                } else if ("video/x-matroska".equals(imageLocation3.document.mime_type)) {
                                    str10 = ".mkv";
                                }
                                key2 = zzhr.m(key2, str10);
                                z10 = (MessageObject.isVideoDocument(imageLocation3.document) || MessageObject.isGifDocument(imageLocation3.document) || MessageObject.isRoundVideoDocument(imageLocation3.document) || MessageObject.canPreviewDocument(imageLocation3.document)) ? false : true;
                            } else if (parentObject instanceof TLRPC.StickerSet) {
                                key2 = zzit.m(key2, ".", str2);
                            }
                        }
                    }
                    if (i2 == 0) {
                        strM2 = key;
                        str8 = key2;
                    } else {
                        strM3 = key;
                        str9 = key2;
                    }
                    if (imageLocation3 != thumbLocation) {
                        forDocument = imageLocation4;
                    } else if (i2 == 0) {
                        strM2 = null;
                        forDocument = null;
                        str8 = null;
                    } else {
                        strM3 = null;
                        imageLocation7 = null;
                        str9 = null;
                        forDocument = imageLocation4;
                    }
                }
                i2++;
                thumbFilter = str3;
                imageLocation6 = imageLocation;
                newGuid = i;
                z2 = z6;
                z3 = z7;
            }
            str3 = thumbFilter;
            z7 = z3;
            i2++;
            thumbFilter = str3;
            imageLocation6 = imageLocation;
            newGuid = i;
            z2 = z6;
            z3 = z7;
        }
        ImageLocation imageLocation8 = forDocument;
        int i3 = newGuid;
        boolean z11 = z2;
        boolean z12 = z3;
        String str11 = thumbFilter;
        if (thumbLocation != null) {
            ImageLocation strippedLocation = imageReceiver.getStrippedLocation();
            if (strippedLocation == null) {
                imageLocation2 = imageLocation7 != null ? imageLocation7 : imageLocation;
            } else {
                imageLocation2 = strippedLocation;
            }
            String key3 = thumbLocation.getKey(parentObject, imageLocation2, false);
            String key4 = thumbLocation.getKey(parentObject, imageLocation2, true);
            if (thumbLocation.path != null) {
                StringBuilder sbM3 = Log.m(key4, ".");
                sbM3.append(getHttpUrlExtension(thumbLocation.path, "jpg"));
                key4 = sbM3.toString();
            } else {
                TLRPC.PhotoSize photoSize2 = thumbLocation.photoSize;
                if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize) || thumbLocation.location != null) {
                    key4 = zzit.m(key4, ".", ext);
                }
            }
            str4 = key4;
            strM = key3;
        } else {
            strM = null;
        }
        if (strM3 != null && mediaFilter != null) {
            strM3 = zzit.m(strM3, "@", mediaFilter);
        }
        if (strM2 != null && imageFilter != null) {
            strM2 = zzit.m(strM2, "@", imageFilter);
        }
        if (strM == null || str11 == null) {
            str = str11;
        } else {
            str = str11;
            strM = zzit.m(strM, "@", str);
        }
        if (imageReceiver.getUniqKeyPrefix() != null && strM2 != null) {
            strM2 = imageReceiver.getUniqKeyPrefix() + strM2;
        }
        String str12 = strM2;
        if (imageReceiver.getUniqKeyPrefix() != null && strM3 != null) {
            strM3 = imageReceiver.getUniqKeyPrefix() + strM3;
        }
        String str13 = strM3;
        if (imageLocation8 != null) {
            if (imageLocation8.path != null) {
                createLoadOperationForImageReceiver(imageReceiver, strM, str4, ext, thumbLocation, str, 0L, 1, 1, z8 ? 2 : 1, i3);
                createLoadOperationForImageReceiver(imageReceiver, str12, str8, str7, imageLocation8, imageFilter, imageReceiver.getSize(), 1, 0, 0, i3);
                return;
            }
            imageLocation8 = imageLocation8;
        }
        if (imageLocation7 == null) {
            int cacheType = imageReceiver.getCacheType();
            int i4 = (cacheType == 0 && z10) ? 1 : cacheType;
            createLoadOperationForImageReceiver(imageReceiver, strM, str4, ext, thumbLocation, str, 0L, i4 == 0 ? 1 : i4, 1, z8 ? 2 : 1, i3);
            createLoadOperationForImageReceiver(imageReceiver, str12, str8, str7, imageLocation8, imageFilter, imageReceiver.getSize(), i4, 0, 0, i3);
            return;
        }
        int cacheType2 = imageReceiver.getCacheType();
        int i5 = (cacheType2 == 0 && z10) ? 1 : cacheType2;
        int i6 = i5 == 0 ? 1 : i5;
        if (!z8) {
            createLoadOperationForImageReceiver(imageReceiver, strM, str4, ext, thumbLocation, str, 0L, i6, 1, 1, i3);
        }
        if (!z12) {
            createLoadOperationForImageReceiver(imageReceiver, str12, str8, str7, imageLocation8, imageFilter, 0L, 1, 0, 0, i3);
        }
        if (z11) {
            return;
        }
        createLoadOperationForImageReceiver(imageReceiver, str13, str9, str6, imageLocation7, mediaFilter, imageReceiver.getSize(), i5, 3, 0, i3);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f, float f2, int i, boolean z, int i2, int i3) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, i2, i3, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f, float f2, boolean z, int i, boolean z2, int i2, int i3) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, z, f, f2, i, z2, i2, i3, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f, float f2, int i, boolean z, int i2, int i3) {
        return scaleAndSaveImage(null, bitmap, compressFormat, false, f, f2, i, z, i2, i3, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z, float f, float f2, int i, boolean z2, int i2, int i3, boolean z3) {
        boolean z4;
        float fMax;
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width != 0.0f && height != 0.0f) {
            float fMax2 = Math.max(width / f, height / f2);
            if (i2 == 0 || i3 == 0) {
                z4 = false;
            } else {
                float f3 = i2;
                if (width < f3 || height < i3) {
                    if (width < f3 && height > i3) {
                        fMax = width / f3;
                    } else if (width > f3) {
                        float f4 = i3;
                        if (height < f4) {
                            fMax = height / f4;
                        } else {
                            fMax = Math.max(width / f3, height / i3);
                        }
                    } else {
                        fMax = Math.max(width / f3, height / i3);
                    }
                    fMax2 = fMax;
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            float f5 = fMax2;
            int i4 = (int) (width / f5);
            int i5 = (int) (height / f5);
            if (i5 != 0 && i4 != 0) {
                try {
                    return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z, i4, i5, width, height, f5, i, z2, z4, z3);
                } catch (Throwable th) {
                    FileLog.e(th);
                    getInstance().clearMemory();
                    System.gc();
                    try {
                        return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z, i4, i5, width, height, f5, i, z2, z4, z3);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
            }
        }
        return null;
    }

    private static TLRPC.PhotoSize findPhotoCachedSize(TLRPC.MessageMedia messageMedia) {
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i < size) {
                TLRPC.PhotoSize photoSize = messageMedia.photo.sizes.get(i);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document == null) {
                return null;
            }
            int size2 = document.thumbs.size();
            while (i < size2) {
                TLRPC.PhotoSize photoSize2 = messageMedia.document.thumbs.get(i);
                if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize2;
                }
                i++;
            }
            return null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo == null) {
                return null;
            }
            int size3 = photo.sizes.size();
            while (i < size3) {
                TLRPC.PhotoSize photoSize3 = messageMedia.webpage.photo.sizes.get(i);
                if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize3;
                }
                i++;
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
        int i = 0;
        if (photoSizeFindPhotoCachedSize.h <= 50 && photoSizeFindPhotoCachedSize.w <= 50) {
            tL_photoSize_layer127 = new TLRPC.TL_photoStrippedSize();
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.bytes = photoSizeFindPhotoCachedSize.bytes;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.w = photoSizeFindPhotoCachedSize.w;
        } else {
            boolean z = true;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSizeFindPhotoCachedSize, true);
            if (MessageObject.shouldEncryptPhotoOrVideo(UserConfig.selectedAccount, message)) {
                pathToAttach = new File(pathToAttach.getAbsolutePath() + ".enc");
            } else {
                z = false;
            }
            if (!pathToAttach.exists()) {
                if (z) {
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(pathToAttach, "rws");
                randomAccessFile2.write(photoSizeFindPhotoCachedSize.bytes);
                randomAccessFile2.close();
            }
            tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = photoSizeFindPhotoCachedSize.w;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.size = photoSizeFindPhotoCachedSize.size;
            tL_photoSize_layer127.type = photoSizeFindPhotoCachedSize.type;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i < size) {
                if (messageMedia.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            int size2 = messageMedia.document.thumbs.size();
            while (i < size2) {
                if (messageMedia.document.thumbs.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.document.thumbs.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            int size3 = messageMedia.webpage.photo.sizes.size();
            while (i < size3) {
                if (messageMedia.webpage.photo.sizes.get(i) instanceof TLRPC.TL_photoCachedSize) {
                    messageMedia.webpage.photo.sizes.set(i, tL_photoSize_layer127);
                    return;
                }
                i++;
            }
        }
    }
}
