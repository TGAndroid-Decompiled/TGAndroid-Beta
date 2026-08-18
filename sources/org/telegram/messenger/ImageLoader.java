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
import androidx.core.graphics.ColorUtils;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
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
    private DispatchQueuePriority cacheOutQueue = new DispatchQueuePriority("cacheOutQueue");
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

    static byte[] access$1700() {
        return headerThumb;
    }

    static byte[] access$1800() {
        return header;
    }

    static boolean access$1900(ImageLoader imageLoader, String str) {
        return imageLoader.isAnimatedAvatar(str);
    }

    static boolean access$2000(ImageLoader imageLoader) {
        return imageLoader.canForce8888;
    }

    static ThreadLocal access$2100() {
        return bytesLocal;
    }

    static long access$2202(ImageLoader imageLoader, long j) {
        imageLoader.lastCacheOutTime = j;
        return j;
    }

    static ThreadLocal access$2300() {
        return bytesThumbLocal;
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

    public static Drawable createStripedBitmap(ArrayList<TLRPC.PhotoSize> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), getStrippedPhotoBitmap(((TLRPC.TL_photoStrippedSize) arrayList.get(i)).bytes, "b"));
            }
        }
        return null;
    }

    public static boolean isSdCardPath(File file) {
        return !TextUtils.isEmpty(SharedConfig.storageCacheDir) && file.getAbsolutePath().startsWith(SharedConfig.storageCacheDir);
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

    public void putThumbsToCache(ArrayList<MessageThumb> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            putImageToCache(arrayList.get(i).drawable, arrayList.get(i).key, true);
        }
    }

    public LruCache<BitmapDrawable> getLottieMemCahce() {
        return this.lottieMemCache;
    }

    private static class ThumbGenerateInfo {
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

    class HttpFileTask extends AsyncTask<Void, Void, Boolean> {
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

        private void reportProgress(final long j, final long j2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j != j2) {
                long j3 = this.lastProgressTime;
                if (j3 != 0 && j3 >= jElapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = jElapsedRealtime;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$reportProgress$1(j, j2);
                }
            });
        }

        public void lambda$reportProgress$1(final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(this.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$reportProgress$0(j, j2);
                }
            });
        }

        public void lambda$reportProgress$0(long j, long j2) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.url, Long.valueOf(j), Long.valueOf(j2));
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

        @Override
        protected void onCancelled() {
            ImageLoader.this.runHttpFileLoadTasks(this, 2);
        }
    }

    class ArtworkLoadTask extends AsyncTask<Void, Void, String> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private HttpURLConnection httpConnection;
        private boolean small;

        public ArtworkLoadTask(CacheImage cacheImage) {
            this.cacheImage = cacheImage;
            this.small = Uri.parse(cacheImage.imageLocation.path).getQueryParameter("s") != null;
        }

        @Override
        public String doInBackground(Void... voidArr) {
            InputStream inputStream;
            Throwable th;
            InputStream inputStream2;
            ByteArrayOutputStream byteArrayOutputStream;
            byte[] bArr;
            JSONArray jSONArray;
            HttpURLConnection httpURLConnection;
            String string;
            HttpURLConnection httpURLConnection2;
            HttpURLConnection httpURLConnection3;
            int i;
            int responseCode;
            try {
                HttpURLConnection httpURLConnection4 = (HttpURLConnection) new URL(this.cacheImage.imageLocation.path.replace("athumb://", "https://")).openConnection();
                this.httpConnection = httpURLConnection4;
                httpURLConnection4.setConnectTimeout(5000);
                this.httpConnection.setReadTimeout(5000);
                this.httpConnection.connect();
                try {
                    HttpURLConnection httpURLConnection5 = this.httpConnection;
                    if (httpURLConnection5 == null || (responseCode = httpURLConnection5.getResponseCode()) == 200 || responseCode == 202 || responseCode == 304) {
                        inputStream2 = this.httpConnection.getInputStream();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                bArr = new byte[32768];
                                while (!isCancelled() && (i = inputStream2.read(bArr)) > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                                this.canRetry = false;
                                jSONArray = new JSONObject(new String(byteArrayOutputStream.toByteArray())).getJSONArray("results");
                                if (jSONArray.length() > 0) {
                                    string = jSONArray.getJSONObject(0).getString("artworkUrl100");
                                    if (this.small) {
                                        try {
                                            httpURLConnection2 = this.httpConnection;
                                            if (httpURLConnection2 != null) {
                                                httpURLConnection2.disconnect();
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
                                        httpURLConnection3 = this.httpConnection;
                                        if (httpURLConnection3 != null) {
                                            httpURLConnection3.disconnect();
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
                                    httpURLConnection = this.httpConnection;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
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
                                    return null;
                                } finally {
                                    try {
                                        HttpURLConnection httpURLConnection6 = this.httpConnection;
                                        if (httpURLConnection6 != null) {
                                            httpURLConnection6.disconnect();
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
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Exception unused7) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            inputStream = inputStream2;
                            th = th7;
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
                            return null;
                        }
                    } else {
                        this.canRetry = false;
                        inputStream2 = this.httpConnection.getInputStream();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        bArr = new byte[32768];
                        while (!isCancelled()) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        this.canRetry = false;
                        jSONArray = new JSONObject(new String(byteArrayOutputStream.toByteArray())).getJSONArray("results");
                        if (jSONArray.length() > 0) {
                            string = jSONArray.getJSONObject(0).getString("artworkUrl100");
                            if (this.small) {
                                httpURLConnection2 = this.httpConnection;
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                byteArrayOutputStream.close();
                                return string;
                            }
                            String strReplace2 = string.replace("100x100", "600x600");
                            httpURLConnection3 = this.httpConnection;
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                            byteArrayOutputStream.close();
                            return strReplace2;
                        }
                        httpURLConnection = this.httpConnection;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                    }
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
            } catch (Throwable th8) {
                th = th8;
                inputStream = null;
            }
            return null;
        }

        @Override
        public void onPostExecute(final String str) {
            if (str != null) {
                ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onPostExecute$0(str);
                    }
                });
            } else if (this.canRetry) {
                ImageLoader.this.artworkLoadError(this.cacheImage.url);
            }
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$1();
                }
            });
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

        public void lambda$onCancelled$2() {
            ImageLoader.this.runArtworkTasks(true);
        }

        @Override
        protected void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCancelled$2();
                }
            });
        }
    }

    class HttpImageTask extends AsyncTask<Void, Void, Boolean> {
        private CacheImage cacheImage;
        private boolean canRetry = true;
        private RandomAccessFile fileOutputStream;
        private HttpURLConnection httpConnection;
        private long imageSize;
        private long lastProgressTime;
        private String overrideUrl;

        public static void lambda$doInBackground$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public HttpImageTask(CacheImage cacheImage, long j) {
            this.cacheImage = cacheImage;
            this.imageSize = j;
        }

        public HttpImageTask(CacheImage cacheImage, int i, String str) {
            this.cacheImage = cacheImage;
            this.imageSize = i;
            this.overrideUrl = str;
        }

        private void reportProgress(final long j, final long j2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (j != j2) {
                long j3 = this.lastProgressTime;
                if (j3 != 0 && j3 >= jElapsedRealtime - 100) {
                    return;
                }
            }
            this.lastProgressTime = jElapsedRealtime;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$reportProgress$1(j, j2);
                }
            });
        }

        public void lambda$reportProgress$1(final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(this.cacheImage.url, new long[]{j, j2});
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$reportProgress$0(j, j2);
                }
            });
        }

        public void lambda$reportProgress$0(long j, long j2) {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, this.cacheImage.url, Long.valueOf(j), Long.valueOf(j2));
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
                            ConnectionsManager.getInstance(this.cacheImage.currentAccount).sendRequest(tL_upload_getWebFile, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    ImageLoader.HttpImageTask.lambda$doInBackground$2(tLObject, tL_error);
                                }
                            });
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
        public void onPostExecute(final Boolean bool) {
            if (!bool.booleanValue() && this.canRetry) {
                ImageLoader.this.httpFileLoadError(this.cacheImage.url);
            } else {
                ImageLoader imageLoader = ImageLoader.this;
                CacheImage cacheImage = this.cacheImage;
                imageLoader.fileDidLoaded(cacheImage.url, cacheImage.finalFilePath, 0);
            }
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$4(bool);
                }
            });
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$5();
                }
            }, this.cacheImage.priority);
        }

        public void lambda$onPostExecute$4(final Boolean bool) {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$3(bool);
                }
            });
        }

        public void lambda$onPostExecute$3(Boolean bool) {
            if (bool.booleanValue()) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.cacheImage.currentAccount);
                int i = NotificationCenter.fileLoaded;
                CacheImage cacheImage = this.cacheImage;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i, cacheImage.url, cacheImage.finalFilePath);
                return;
            }
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 2);
        }

        public void lambda$onPostExecute$5() {
            ImageLoader.this.runHttpTasks(true);
        }

        public void lambda$onCancelled$6() {
            ImageLoader.this.runHttpTasks(true);
        }

        @Override
        protected void onCancelled() {
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCancelled$6();
                }
            }, this.cacheImage.priority);
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCancelled$8();
                }
            });
        }

        public void lambda$onCancelled$8() {
            ImageLoader.this.fileProgresses.remove(this.cacheImage.url);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCancelled$7();
                }
            });
        }

        public void lambda$onCancelled$7() {
            NotificationCenter.getInstance(this.cacheImage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, this.cacheImage.url, 1);
        }
    }

    class ThumbGenerateTask implements Runnable {
        private ThumbGenerateInfo info;
        private int mediaType;
        private File originalPath;

        public ThumbGenerateTask(int i, File file, ThumbGenerateInfo thumbGenerateInfo) {
            this.mediaType = i;
            this.originalPath = file;
            this.info = thumbGenerateInfo;
        }

        private void removeTask() {
            ThumbGenerateInfo thumbGenerateInfo = this.info;
            if (thumbGenerateInfo == null) {
                return;
            }
            final String attachFileName = FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument);
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$removeTask$0(attachFileName);
                }
            });
        }

        public void lambda$removeTask$0(String str) {
            ImageLoader.this.thumbGenerateTasks.remove(str);
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
                final String str = "q_" + this.info.parentDocument.dc_id + "_" + this.info.parentDocument.id;
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
                                if (lowerCase.endsWith("mp4")) {
                                    String string = this.originalPath.toString();
                                    if (!this.info.big) {
                                        i3 = 1;
                                    }
                                    bitmapLoadBitmap = SendMessagesHelper.createVideoThumbnail(string, i3);
                                } else {
                                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                                        float f2 = iMin;
                                        bitmapLoadBitmap = ImageLoader.loadBitmap(lowerCase, null, f2, f2, false);
                                    }
                                    FileLog.e(th);
                                    removeTask();
                                }
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
                                final BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                                final ArrayList arrayList = new ArrayList(this.info.imageReceiverArray);
                                final ArrayList arrayList2 = new ArrayList(this.info.imageReceiverGuidsArray);
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$run$1(str, arrayList, bitmapDrawable, arrayList2);
                                    }
                                });
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
                        final BitmapDrawable bitmapDrawable2 = new BitmapDrawable(bitmap);
                        final ArrayList arrayList3 = new ArrayList(this.info.imageReceiverArray);
                        final ArrayList arrayList4 = new ArrayList(this.info.imageReceiverGuidsArray);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$run$1(str, arrayList3, bitmapDrawable2, arrayList4);
                            }
                        });
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

        public void lambda$run$1(String str, ArrayList arrayList, BitmapDrawable bitmapDrawable, ArrayList arrayList2) {
            removeTask();
            if (this.info.filter != null) {
                str = str + "@" + this.info.filter;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(bitmapDrawable, str, 0, false, ((Integer) arrayList2.get(i)).intValue());
            }
            if (str.contains("nocache")) {
                return;
            }
            ImageLoader.this.memCache.put(str, bitmapDrawable);
        }
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
                        if (line != null) {
                            sb.append(line);
                        } else {
                            String string = sb.toString();
                            bufferedReader.close();
                            gZIPInputStream.close();
                            return string;
                        }
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

    class CacheOutTask implements Runnable {
        private CacheImage cacheImage;
        private boolean isCancelled;
        private Thread runningThread;
        private final Object sync = new Object();

        public CacheOutTask(CacheImage cacheImage) {
            this.cacheImage = cacheImage;
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageLoader.CacheOutTask.run():void");
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
                int patternColor2 = MotionBackgroundDrawable.getPatternColor(alphaComponent3, alphaComponent4, alphaComponent5, alphaComponent6);
                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
                motionBackgroundDrawable.setColors(alphaComponent3, alphaComponent4, alphaComponent5, alphaComponent6);
                motionBackgroundDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                motionBackgroundDrawable.setPatternBitmap(wallPaper.settings.intensity, bitmap);
                motionBackgroundDrawable.draw(canvas);
                patternColor = patternColor2;
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
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(rLottieDrawable.getIntrinsicWidth(), rLottieDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            rLottieDrawable.setGeneratingFrame(z ? rLottieDrawable.getFramesCount() - 1 : 0);
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

        private void onPostExecute(final Drawable drawable) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$1(drawable);
                }
            });
        }

        public void lambda$onPostExecute$1(final Drawable drawable) {
            RLottieDrawable rLottieDrawable;
            boolean z = false;
            final String str = null;
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
            ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPostExecute$0(drawable, str);
                }
            }, this.cacheImage.priority);
        }

        public void lambda$onPostExecute$0(Drawable drawable, String str) {
            this.cacheImage.setImageAndClear(drawable, str);
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
    }

    public boolean isAnimatedAvatar(String str) {
        return str != null && str.endsWith("avatar");
    }

    private boolean isPFrame(String str) {
        return str != null && str.endsWith("pframe");
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
        System.arraycopy(Bitmaps.footer, 0, bArr2, (Bitmaps.header.length + bArr.length) - 3, Bitmaps.footer.length);
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

    class CacheImage {
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

        public void setImageReceiverGuid(ImageReceiver imageReceiver, int i) {
            int iIndexOf = this.imageReceiverArray.indexOf(imageReceiver);
            if (iIndexOf == -1) {
                return;
            }
            this.imageReceiverGuidsArray.set(iIndexOf, Integer.valueOf(i));
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
                        ImageLoader.this.cacheOutQueue.cancelRunnable(this.cacheTask);
                        ImageLoader.this.cacheOutQueue.cancelRunnable(this.runningTask);
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

        void changePriority(int i) {
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

        public void setImageAndClear(final Drawable drawable, final String str) {
            if (drawable != null) {
                final ArrayList arrayList = new ArrayList(this.imageReceiverArray);
                final ArrayList arrayList2 = new ArrayList(this.imageReceiverGuidsArray);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setImageAndClear$0(drawable, arrayList, arrayList2, str);
                    }
                });
            }
            for (int i = 0; i < this.imageReceiverArray.size(); i++) {
                ImageLoader.this.imageLoadingByTag.remove(this.imageReceiverArray.get(i).getTag(this.type));
            }
            this.imageReceiverArray.clear();
            this.imageReceiverGuidsArray.clear();
            if (this.url != null) {
                ImageLoader.this.imageLoadingByUrl.remove(this.url);
            }
            if (this.url != null) {
                ImageLoader.this.imageLoadingByUrlPframe.remove(this.url);
            }
            String str2 = this.key;
            if (str2 != null) {
                ImageLoader.this.imageLoadingByKeys.remove(str2);
                ImageLoader.this.imageLoadingKeys.remove(ImageLoader.cutFilter(this.key));
            }
        }

        public void lambda$setImageAndClear$0(Drawable drawable, ArrayList arrayList, ArrayList arrayList2, String str) {
            int i = 0;
            if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                if (!animatedFileDrawable.isWebmSticker) {
                    boolean z = false;
                    while (i < arrayList.size()) {
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i);
                        AnimatedFileDrawable animatedFileDrawableMakeCopy = i == 0 ? animatedFileDrawable : animatedFileDrawable.makeCopy();
                        if (imageReceiver.setImageBitmapByKey(animatedFileDrawableMakeCopy, this.key, this.type, false, ((Integer) arrayList2.get(i)).intValue())) {
                            if (animatedFileDrawableMakeCopy == animatedFileDrawable) {
                                z = true;
                            }
                        } else if (animatedFileDrawableMakeCopy != animatedFileDrawable) {
                            animatedFileDrawableMakeCopy.recycle();
                        }
                        i++;
                    }
                    if (!z) {
                        animatedFileDrawable.recycle();
                    }
                } else {
                    while (i < arrayList.size()) {
                        ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(drawable, this.key, this.types.get(i).intValue(), false, ((Integer) arrayList2.get(i)).intValue());
                        i++;
                    }
                }
            } else {
                while (i < arrayList.size()) {
                    ((ImageReceiver) arrayList.get(i)).setImageBitmapByKey(drawable, this.key, this.types.get(i).intValue(), false, ((Integer) arrayList2.get(i)).intValue());
                    i++;
                }
            }
            if (str != null) {
                ImageLoader.this.decrementUseCount(str);
            }
        }
    }

    public static ImageLoader getInstance() {
        ImageLoader imageLoader = Instance;
        if (imageLoader == null) {
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
        }
        return imageLoader;
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
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }

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
        };
        this.smallImagesMemCache = new LruCache<BitmapDrawable>((int) (f * 0.2f)) {
            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }

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
        };
        this.wallpaperMemCache = new LruCache<BitmapDrawable>(iMin / 4) {
            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }
        };
        this.lottieMemCache = new LruCache<BitmapDrawable>(10485760) {
            @Override
            public int sizeOf(String str, BitmapDrawable bitmapDrawable) {
                return ImageLoader.this.sizeOfBitmapDrawable(bitmapDrawable);
            }

            @Override
            public BitmapDrawable put(String str, BitmapDrawable bitmapDrawable) {
                if (bitmapDrawable instanceof AnimatedFileDrawable) {
                    ImageLoader.this.cachedAnimatedFileDrawables.add((AnimatedFileDrawable) bitmapDrawable);
                }
                return (BitmapDrawable) super.put(str, bitmapDrawable);
            }

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

    class AnonymousClass5 implements FileLoader.FileLoaderDelegate {
        final int val$currentAccount;

        AnonymousClass5(int i) {
            this.val$currentAccount = i;
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

        public static void lambda$fileUploadProgressChanged$0(int i, String str, long j, long j2, boolean z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z));
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

        public static void lambda$fileDidUploaded$1(int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploaded, str, inputFile, inputEncryptedFile, bArr, bArr2, Long.valueOf(j));
        }

        public void lambda$fileDidUploaded$2(final int i, final String str, final TLRPC.InputFile inputFile, final TLRPC.InputEncryptedFile inputEncryptedFile, final byte[] bArr, final byte[] bArr2, final long j) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ImageLoader.AnonymousClass5.lambda$fileDidUploaded$1(i, str, inputFile, inputEncryptedFile, bArr, bArr2, j);
                }
            });
            ImageLoader.this.fileProgresses.remove(str);
        }

        @Override
        public void fileDidFailedUpload(final String str, final boolean z) {
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            final int i = this.val$currentAccount;
            dispatchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fileDidFailedUpload$4(i, str, z);
                }
            });
        }

        public static void lambda$fileDidFailedUpload$3(int i, String str, boolean z) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileUploadFailed, str, Boolean.valueOf(z));
        }

        public void lambda$fileDidFailedUpload$4(final int i, final String str, final boolean z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ImageLoader.AnonymousClass5.lambda$fileDidFailedUpload$3(i, str, z);
                }
            });
            ImageLoader.this.fileProgresses.remove(str);
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

        @Override
        public void fileDidFailedLoad(final String str, final int i) {
            ImageLoader.this.fileProgresses.remove(str);
            final int i2 = this.val$currentAccount;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fileDidFailedLoad$6(str, i, i2);
                }
            });
        }

        public void lambda$fileDidFailedLoad$6(String str, int i, int i2) {
            ImageLoader.this.fileDidFailedLoad(str, i);
            NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadFailed, str, Integer.valueOf(i));
        }

        @Override
        public void fileLoadProgressChanged(final FileLoadOperation fileLoadOperation, final String str, final long j, final long j2) {
            ImageLoader.this.fileProgresses.put(str, new long[]{j, j2});
            if (!ImageLoader.this.imageLoadingByUrlPframe.isEmpty() && fileLoadOperation.checkPrefixPreloadFinished()) {
                ImageLoader.this.imageLoadQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$fileLoadProgressChanged$7(str, fileLoadOperation);
                    }
                });
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = fileLoadOperation.lastProgressUpdateTime;
            if (j3 == 0 || j3 < jElapsedRealtime - 500 || j == 0) {
                fileLoadOperation.lastProgressUpdateTime = jElapsedRealtime;
                final int i = this.val$currentAccount;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(i, str, j, j2);
                    }
                });
            }
        }

        public void lambda$fileLoadProgressChanged$7(String str, FileLoadOperation fileLoadOperation) {
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
                    ImageLoader.this.cacheOutQueue.postRunnable(cacheOutTask, cacheOutTask.cacheImage.priority);
                }
            }
        }

        public static void lambda$fileLoadProgressChanged$8(int i, String str, long j, long j2) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoadProgressChanged, str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    class AnonymousClass6 extends BroadcastReceiver {
        AnonymousClass6() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("file system changed");
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onReceive$0();
                }
            };
            if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AndroidUtilities.runOnUIThread(runnable, 1000L);
            } else {
                runnable.run();
            }
        }

        public void lambda$onReceive$0() {
            ImageLoader.this.checkMediaPaths();
        }
    }

    public int sizeOfBitmapDrawable(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof AnimatedFileDrawable) {
            return ((AnimatedFileDrawable) bitmapDrawable).estimateSizeInCache();
        }
        if (bitmapDrawable instanceof RLottieDrawable) {
            return ((RLottieDrawable) bitmapDrawable).estimateSizeInCache();
        }
        return bitmapDrawable.getBitmap().getByteCount();
    }

    public void checkMediaPaths() {
        checkMediaPaths(null);
    }

    public void checkMediaPaths(final Runnable runnable) {
        this.cacheOutQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkMediaPaths$1(runnable);
            }
        });
    }

    public void lambda$checkMediaPaths$1(final Runnable runnable) {
        final SparseArray<File> sparseArrayCreateMediaPaths = createMediaPaths();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ImageLoader.lambda$checkMediaPaths$0(sparseArrayCreateMediaPaths, runnable);
            }
        });
    }

    public static void lambda$checkMediaPaths$0(SparseArray sparseArray, Runnable runnable) {
        FileLoader.setMediaDirs(sparseArray);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void addTestWebFile(String str, WebFile webFile) {
        if (str == null || webFile == null) {
            return;
        }
        this.testWebFile.put(str, webFile);
    }

    public void removeTestWebFile(String str) {
        if (str == null) {
            return;
        }
        this.testWebFile.remove(str);
    }

    private static void moveDirectory(File file, final File file2) {
        if (file.exists()) {
            if (file2.exists() || file2.mkdir()) {
                try {
                    Stream streamConvert = Stream.VivifiedWrapper.convert(Files.list(file.toPath()));
                    try {
                        streamConvert.forEach(new Consumer() {
                            @Override
                            public final void p(Object obj) {
                                ImageLoader.lambda$moveDirectory$2(file2, (java.nio.file.Path) obj);
                            }

                            public Consumer andThen(Consumer consumer) {
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
        FileLog.d("selected SD card = " + SharedConfig.storageCacheDir);
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

    public Float getFileProgress(String str) {
        long[] jArr;
        if (str == null || (jArr = this.fileProgresses.get(str)) == null) {
            return null;
        }
        long j = jArr[1];
        if (j == 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.min(1.0f, jArr[0] / j));
    }

    public long[] getFileProgressSizes(String str) {
        if (str == null) {
            return null;
        }
        return this.fileProgresses.get(str);
    }

    public String getReplacedKey(String str) {
        if (str == null) {
            return null;
        }
        return this.replacedBitmaps.get(str);
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
                if (bitmap.getWidth() <= bitmap2.getWidth() && bitmap.getHeight() <= bitmap2.getHeight()) {
                    this.ignoreRemoval = str;
                    lruCache.remove(str);
                    lruCache.put(str2, bitmapDrawable);
                    this.ignoreRemoval = null;
                } else {
                    lruCache.remove(str);
                }
            } else {
                this.ignoreRemoval = str;
                lruCache.remove(str);
                lruCache.put(str2, bitmapDrawable);
                this.ignoreRemoval = null;
            }
        }
        Integer num = this.bitmapUseCounts.get(str);
        if (num != null) {
            this.bitmapUseCounts.put(str2, num);
            this.bitmapUseCounts.remove(str);
        }
    }

    public void incrementUseCount(String str) {
        Integer num = this.bitmapUseCounts.get(str);
        if (num == null) {
            this.bitmapUseCounts.put(str, 1);
        } else {
            this.bitmapUseCounts.put(str, Integer.valueOf(num.intValue() + 1));
        }
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

    public void removeImage(String str) {
        this.bitmapUseCounts.remove(str);
        this.memCache.remove(str);
        this.smallImagesMemCache.remove(str);
    }

    public boolean isInMemCache(String str, boolean z) {
        if (z) {
            return getFromLottieCache(str) != null;
        }
        return getFromMemCache(str) != null;
    }

    public void clearMemory() {
        this.smallImagesMemCache.evictAll();
        this.memCache.evictAll();
        this.lottieMemCache.evictAll();
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

    public void changeFileLoadingPriorityForImageReceiver(final ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        final int fileLoadingPriority = imageReceiver.getFileLoadingPriority();
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$changeFileLoadingPriorityForImageReceiver$3(imageReceiver, fileLoadingPriority);
            }
        });
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

    public void cancelLoadingForImageReceiver(final ImageReceiver imageReceiver, final boolean z) {
        if (imageReceiver == null) {
            return;
        }
        WebInstantView.cancelLoadPhoto(imageReceiver);
        ArrayList<Runnable> loadingOperations = imageReceiver.getLoadingOperations();
        if (!loadingOperations.isEmpty()) {
            for (int i = 0; i < loadingOperations.size(); i++) {
                this.imageLoadQueue.cancelRunnable(loadingOperations.get(i));
            }
            loadingOperations.clear();
        }
        imageReceiver.addLoadingImageRunnable(null);
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cancelLoadingForImageReceiver$4(z, imageReceiver);
            }
        });
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
            strMD5 = strMD5 + "@" + str2;
        }
        return getFromMemCache(strMD5);
    }

    public void lambda$replaceImageInCache$5(String str, String str2, ImageLocation imageLocation) {
        ArrayList<String> filterKeys;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                filterKeys = this.memCache.getFilterKeys(str);
            } else {
                filterKeys = this.smallImagesMemCache.getFilterKeys(str);
            }
            if (filterKeys != null) {
                for (int i2 = 0; i2 < filterKeys.size(); i2++) {
                    String str3 = filterKeys.get(i2);
                    String str4 = str + "@" + str3;
                    String str5 = str2 + "@" + str3;
                    performReplace(str4, str5);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str4, str5, imageLocation);
                }
            } else {
                performReplace(str, str2);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReplacedPhotoInMemCache, str, str2, imageLocation);
            }
        }
    }

    public static String cutFilter(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(64);
        return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
    }

    public void replaceImageInCache(final String str, final String str2, final ImageLocation imageLocation, boolean z) {
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$replaceImageInCache$5(str, str2, imageLocation);
                }
            });
        } else {
            lambda$replaceImageInCache$5(str, str2, imageLocation);
        }
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

    private void generateThumb(int i, File file, ThumbGenerateInfo thumbGenerateInfo) {
        if ((i != 0 && i != 2 && i != 3) || file == null || thumbGenerateInfo == null) {
            return;
        }
        if (this.thumbGenerateTasks.get(FileLoader.getAttachFileName(thumbGenerateInfo.parentDocument)) == null) {
            this.thumbGeneratingQueue.postRunnable(new ThumbGenerateTask(i, file, thumbGenerateInfo));
        }
    }

    public void cancelForceLoadingForImageReceiver(ImageReceiver imageReceiver) {
        final String imageKey;
        if (imageReceiver == null || (imageKey = imageReceiver.getImageKey()) == null) {
            return;
        }
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$cancelForceLoadingForImageReceiver$6(imageKey);
            }
        });
    }

    public void lambda$cancelForceLoadingForImageReceiver$6(String str) {
        this.forceLoadingImages.remove(str);
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

    public void lambda$createLoadOperationForImageReceiver$7(int i, String str, String str2, int i2, ImageReceiver imageReceiver, int i3, String str3, int i4, ImageLocation imageLocation, boolean z, Object obj, int i5, TLRPC.Document document, boolean z2, boolean z3, String str4, int i6, long j) {
        boolean z4;
        int i7;
        boolean z5;
        int mediaType;
        boolean z6;
        String str5;
        File pathToAttach;
        String str6;
        int i8;
        boolean z7;
        File file;
        File file2;
        File file3;
        File file4;
        String attachFileName;
        ThumbGenerateInfo thumbGenerateInfo;
        int i9;
        boolean z8;
        boolean z9;
        String str7;
        String str8;
        String str9;
        long j2;
        String str10;
        File file5;
        File file6;
        String str11;
        String str12;
        boolean z10;
        boolean z11;
        TLRPC.Document document2 = document;
        String str13 = str4;
        if (i != 2) {
            CacheImage cacheImage = this.imageLoadingByUrl.get(str);
            CacheImage cacheImage2 = this.imageLoadingByKeys.get(str2);
            CacheImage cacheImage3 = this.imageLoadingByTag.get(i2);
            if (cacheImage3 != null) {
                if (cacheImage3 == cacheImage2) {
                    cacheImage3.setImageReceiverGuid(imageReceiver, i3);
                    cacheImage = cacheImage;
                    cacheImage2 = cacheImage2;
                    str13 = str13;
                    z5 = true;
                    i7 = 0;
                } else if (cacheImage3 == cacheImage) {
                    cacheImage = cacheImage;
                    if (cacheImage2 == null) {
                        i7 = 0;
                        cacheImage3.replaceImageReceiver(imageReceiver, str2, str3, i4, i3);
                    } else {
                        i7 = 0;
                    }
                    z5 = true;
                } else {
                    i7 = 0;
                    cacheImage3.removeImageReceiver(imageReceiver);
                }
                if (!z5 || cacheImage2 == null) {
                    z4 = true;
                } else {
                    z4 = true;
                    cacheImage2.addImageReceiver(imageReceiver, str2, str3, i4, i3);
                    z5 = true;
                }
                if (!z5 && cacheImage != null) {
                    cacheImage.addImageReceiver(imageReceiver, str2, str3, i4, i3);
                    z5 = true;
                }
            } else {
                i7 = 0;
            }
            z5 = false;
            if (z5) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (!z5) {
                cacheImage.addImageReceiver(imageReceiver, str2, str3, i4, i3);
                z5 = true;
            }
        } else {
            str13 = str13;
            z4 = true;
            i7 = 0;
            z5 = false;
        }
        if (z5) {
            return;
        }
        String str14 = imageLocation.path;
        if (str14 != null) {
            if (str14.startsWith("http") || str14.startsWith("athumb")) {
                str3 = str3;
                str6 = "athumb";
                i8 = 2;
                z7 = false;
                file = null;
                z4 = false;
            } else if (str14.startsWith("thumb://")) {
                int iIndexOf = str14.indexOf(":", 8);
                if (iIndexOf >= 0) {
                    file = new File(str14.substring(iIndexOf + (z4 ? 1 : 0)));
                    str3 = str3;
                    str6 = "athumb";
                    i8 = 2;
                    z7 = false;
                } else {
                    str3 = str3;
                    str6 = "athumb";
                    i8 = 2;
                    z7 = false;
                    file = null;
                }
            } else {
                if (str14.startsWith("vthumb://")) {
                    int iIndexOf2 = str14.indexOf(":", 9);
                    if (iIndexOf2 >= 0) {
                        file = new File(str14.substring(iIndexOf2 + (z4 ? 1 : 0)));
                    } else {
                        str3 = str3;
                        str6 = "athumb";
                        i8 = 2;
                        z7 = false;
                        file = null;
                    }
                } else {
                    file = new File(str14);
                }
                str3 = str3;
                str6 = "athumb";
                i8 = 2;
                z7 = false;
            }
        } else if (i == 0 && z) {
            if (obj instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj;
                TLRPC.Document document3 = messageObject.getDocument();
                String str15 = messageObject.messageOwner.attachPath;
                File pathToMessage = FileLoader.getInstance(i5).getPathToMessage(messageObject.messageOwner);
                mediaType = messageObject.getMediaType();
                pathToAttach = pathToMessage;
                z6 = false;
                document2 = document3;
                str5 = str15;
            } else if (document2 != null) {
                pathToAttach = FileLoader.getInstance(i5).getPathToAttach(document2, z4);
                mediaType = MessageObject.isVideoDocument(document) ? 2 : 3;
                z6 = true;
                str5 = null;
            } else {
                mediaType = 0;
                z6 = false;
                str5 = null;
                pathToAttach = null;
                document2 = null;
            }
            if (document2 != null) {
                if (z2) {
                    file2 = pathToAttach;
                    str6 = "athumb";
                    file3 = new File(FileLoader.getDirectory(4), "q_" + document2.dc_id + "_" + document2.id + ".jpg");
                    if (file3.exists()) {
                        z7 = true;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        file4 = null;
                    } else {
                        file4 = new File(str5);
                        if (!file4.exists()) {
                            file4 = null;
                        }
                    }
                    if (file4 == null) {
                        file4 = file2;
                    }
                    if (file3 == null) {
                        attachFileName = FileLoader.getAttachFileName(document2);
                        thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                        if (thumbGenerateInfo == null) {
                            thumbGenerateInfo = new ThumbGenerateInfo();
                            thumbGenerateInfo.parentDocument = document2;
                            thumbGenerateInfo.filter = str3;
                            thumbGenerateInfo.big = z6;
                            this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                        }
                        if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver)) {
                            thumbGenerateInfo.imageReceiverArray.add(imageReceiver);
                            thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i3));
                        }
                        this.waitingForQualityThumbByTag.put(i2, attachFileName);
                        if (file4.exists() || !z3) {
                            return;
                        }
                        generateThumb(mediaType, file4, thumbGenerateInfo);
                        return;
                    }
                    i8 = 2;
                    file = file3;
                } else {
                    file2 = pathToAttach;
                    str6 = "athumb";
                }
                z7 = false;
                file3 = null;
                if (TextUtils.isEmpty(str5)) {
                    file4 = new File(str5);
                    if (!file4.exists()) {
                        file4 = null;
                    }
                } else {
                    file4 = null;
                }
                if (file4 == null) {
                    file4 = file2;
                }
                if (file3 == null) {
                    attachFileName = FileLoader.getAttachFileName(document2);
                    thumbGenerateInfo = this.waitingForQualityThumb.get(attachFileName);
                    if (thumbGenerateInfo == null) {
                        thumbGenerateInfo = new ThumbGenerateInfo();
                        thumbGenerateInfo.parentDocument = document2;
                        thumbGenerateInfo.filter = str3;
                        thumbGenerateInfo.big = z6;
                        this.waitingForQualityThumb.put(attachFileName, thumbGenerateInfo);
                    }
                    if (!thumbGenerateInfo.imageReceiverArray.contains(imageReceiver)) {
                        thumbGenerateInfo.imageReceiverArray.add(imageReceiver);
                        thumbGenerateInfo.imageReceiverGuidsArray.add(Integer.valueOf(i3));
                    }
                    this.waitingForQualityThumbByTag.put(i2, attachFileName);
                    if (file4.exists()) {
                        return;
                    } else {
                        return;
                    }
                }
                i8 = 2;
                file = file3;
            } else {
                str6 = "athumb";
                i8 = 2;
                z7 = false;
                file = null;
            }
            z4 = true;
        } else {
            str3 = str3;
            str6 = "athumb";
            i8 = 2;
            z7 = false;
            file = null;
            z4 = false;
        }
        if (i != i8) {
            boolean zIsEncrypted = imageLocation.isEncrypted();
            CacheImage cacheImage4 = new CacheImage();
            cacheImage4.priority = imageReceiver.getFileLoadingPriority() == 0 ? 0 : 1;
            if (!z) {
                if (imageLocation.imageType == i8 || MessageObject.isGifDocument(imageLocation.webFile) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.isVideoSticker(imageLocation.document)) {
                    cacheImage4.imageType = i8;
                } else {
                    String str16 = imageLocation.path;
                    if (str16 != null && !str16.startsWith("vthumb") && !str16.startsWith("thumb")) {
                        String httpUrlExtension = getHttpUrlExtension(str16, "jpg");
                        if (httpUrlExtension.equalsIgnoreCase("webm") || httpUrlExtension.equalsIgnoreCase("mp4") || httpUrlExtension.equalsIgnoreCase("gif")) {
                            cacheImage4.imageType = i8;
                        } else if ("tgs".equals(str13)) {
                            cacheImage4.imageType = 1;
                        }
                    }
                }
            }
            if (file == null) {
                TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                z8 = z7;
                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                    i9 = i6;
                    str8 = "gl";
                    str9 = "g";
                    z8 = z8;
                    j2 = 0;
                    z9 = true;
                } else {
                    SecureDocument secureDocument = imageLocation.secureDocument;
                    if (secureDocument != null) {
                        cacheImage4.secureDocument = secureDocument;
                        boolean z12 = secureDocument.secureFile.dc_id == Integer.MIN_VALUE;
                        file = new File(FileLoader.getDirectory(4), str);
                        i9 = i6;
                        str8 = "gl";
                        z9 = z12;
                        str9 = "g";
                        j2 = 0;
                        z8 = z8;
                    } else {
                        z9 = z4;
                        if ("g".equals(str3) || "gl".equals(str3) || isAnimatedAvatar(str3)) {
                            i9 = i6;
                            str10 = "gl";
                        } else {
                            i9 = i6;
                            str10 = "gl";
                            if (i9 != 0 || j <= 0 || imageLocation.path != null || zIsEncrypted) {
                                File file7 = new File(FileLoader.getDirectory(4), str);
                                if (file7.exists()) {
                                    z11 = true;
                                } else {
                                    if (i9 == 2) {
                                        file7 = new File(FileLoader.getDirectory(4), str + ".enc");
                                    }
                                    z11 = z8;
                                }
                                TLRPC.Document document4 = imageLocation.document;
                                if (document4 == null) {
                                    z9 = z9 ? 1 : 0;
                                } else if (document4 instanceof DocumentObject.ThemeDocument) {
                                    z9 = ((DocumentObject.ThemeDocument) document4).wallpaper == null ? true : z9 ? 1 : 0;
                                    cacheImage4.imageType = 5;
                                } else if ("application/x-tgsdice".equals(document4.mime_type)) {
                                    z9 = true;
                                    cacheImage4.imageType = 1;
                                } else {
                                    if ("application/x-tgsticker".equals(imageLocation.document.mime_type)) {
                                        cacheImage4.imageType = 1;
                                    } else if ("application/x-tgwallpattern".equals(imageLocation.document.mime_type) || FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                        cacheImage4.imageType = 3;
                                    }
                                    z9 = z9 ? 1 : 0;
                                }
                                str8 = str10;
                                file = file7;
                                j2 = 0;
                                z8 = z11;
                                str9 = "g";
                            }
                        }
                        TLRPC.Document document5 = imageLocation.document;
                        if (document5 != null) {
                            if (document5 instanceof TLRPC.TL_documentEncrypted) {
                                file6 = new File(FileLoader.getDirectory(4), str);
                            } else if (MessageObject.isVideoDocument(document5)) {
                                file6 = new File(FileLoader.getDirectory(2), str);
                            } else {
                                file6 = new File(FileLoader.getDirectory(3), str);
                            }
                            if (isAnimatedAvatar(str3) || "g".equals(str3)) {
                                str11 = str10;
                            } else {
                                str11 = str10;
                                if (!str11.equals(str3)) {
                                    str12 = str11;
                                }
                                if (document5 instanceof DocumentObject.ThemeDocument) {
                                    if (((DocumentObject.ThemeDocument) document5).wallpaper == null) {
                                        z10 = true;
                                    } else {
                                        z10 = z9 ? 1 : 0;
                                    }
                                    cacheImage4.imageType = 5;
                                } else {
                                    if ("application/x-tgsdice".equals(imageLocation.document.mime_type)) {
                                        z10 = true;
                                        cacheImage4.imageType = 1;
                                    } else {
                                        if ("application/x-tgsticker".equals(document5.mime_type)) {
                                            cacheImage4.imageType = 1;
                                        } else if ("application/x-tgwallpattern".equals(document5.mime_type) || FileLoader.getDocumentFileName(imageLocation.document).endsWith(".svg")) {
                                            cacheImage4.imageType = 3;
                                        }
                                        z10 = z9 ? 1 : 0;
                                    }
                                    long j3 = document5.size;
                                    z8 = z8;
                                    z9 = z10;
                                    file = file6;
                                    j2 = j3;
                                    str3 = str3;
                                    str8 = str12;
                                    str9 = "g";
                                }
                                long j4 = document5.size;
                                z8 = z8;
                                z9 = z10;
                                file = file6;
                                j2 = j4;
                                str3 = str3;
                                str8 = str12;
                                str9 = "g";
                            }
                            if (file6.exists()) {
                                str12 = str11;
                            } else {
                                str12 = str11;
                                file6 = new File(FileLoader.getDirectory(4), document5.dc_id + "_" + document5.id + ".temp");
                            }
                            if (document5 instanceof DocumentObject.ThemeDocument) {
                                if (((DocumentObject.ThemeDocument) document5).wallpaper == null) {
                                    z10 = true;
                                } else {
                                    z10 = z9 ? 1 : 0;
                                }
                                cacheImage4.imageType = 5;
                            } else {
                                if ("application/x-tgsdice".equals(imageLocation.document.mime_type)) {
                                    z10 = true;
                                    cacheImage4.imageType = 1;
                                } else {
                                    if ("application/x-tgsticker".equals(document5.mime_type)) {
                                        cacheImage4.imageType = 1;
                                    } else if ("application/x-tgwallpattern".equals(document5.mime_type)) {
                                        cacheImage4.imageType = 3;
                                    } else {
                                        cacheImage4.imageType = 3;
                                    }
                                    z10 = z9 ? 1 : 0;
                                }
                                long j5 = document5.size;
                                z8 = z8;
                                z9 = z10;
                                file = file6;
                                j2 = j5;
                                str3 = str3;
                                str8 = str12;
                                str9 = "g";
                            }
                            long j6 = document5.size;
                            z8 = z8;
                            z9 = z10;
                            file = file6;
                            j2 = j6;
                            str3 = str3;
                            str8 = str12;
                            str9 = "g";
                        } else {
                            if (imageLocation.webFile != null) {
                                file = new File(FileLoader.getDirectory(3), str);
                                str3 = str3;
                                str8 = str10;
                                str9 = "g";
                            } else {
                                if (i9 == 1) {
                                    file5 = new File(FileLoader.getDirectory(4), str);
                                } else {
                                    file5 = new File(FileLoader.getDirectory(i7), str);
                                }
                                str3 = str3;
                                file = file5;
                                if (isAnimatedAvatar(str3)) {
                                    str8 = str10;
                                    str9 = "g";
                                } else {
                                    str9 = "g";
                                    if (str9.equals(str3)) {
                                        str8 = str10;
                                    } else {
                                        str8 = str10;
                                        if (str8.equals(str3)) {
                                        }
                                    }
                                    if (imageLocation.location != null && !file.exists()) {
                                    }
                                }
                                file = new File(FileLoader.getDirectory(4), imageLocation.location.volume_id + "_" + imageLocation.location.local_id + ".temp");
                            }
                            j2 = 0;
                        }
                    }
                }
                if (hasAutoplayFilter(str3) || isAnimatedAvatar(str3)) {
                    cacheImage4.imageType = 2;
                    cacheImage4.size = j2;
                    cacheImage4.isPFrame = isPFrame(str3);
                    if (str9.equals(str3) || str8.equals(str3) || isAnimatedAvatar(str3)) {
                        z9 = true;
                    }
                }
            } else {
                boolean z13 = z4;
                i9 = i6;
                z8 = z7;
                z9 = z13 ? 1 : 0;
            }
            cacheImage4.type = i4;
            cacheImage4.key = str2;
            cacheImage4.cacheType = i9;
            cacheImage4.filter = str3;
            cacheImage4.imageLocation = imageLocation;
            cacheImage4.ext = str4;
            cacheImage4.currentAccount = i5;
            cacheImage4.parentObject = obj;
            int i10 = imageLocation.imageType;
            if (i10 != 0) {
                cacheImage4.imageType = i10;
            }
            if (i9 == 2) {
                File internalCacheDir = FileLoader.getInternalCacheDir();
                StringBuilder sb = new StringBuilder();
                str7 = str;
                sb.append(str7);
                sb.append(".enc.key");
                cacheImage4.encryptionKeyPath = new File(internalCacheDir, sb.toString());
            } else {
                str7 = str;
            }
            String str17 = str6;
            cacheImage4.addImageReceiver(imageReceiver, str2, str3, i4, i3);
            if (z9 || z8 || file.exists()) {
                cacheImage4.finalFilePath = file;
                cacheImage4.imageLocation = imageLocation;
                cacheImage4.cacheTask = new CacheOutTask(cacheImage4);
                this.imageLoadingByKeys.put(str2, cacheImage4);
                this.imageLoadingKeys.add(cutFilter(str2));
                if (i != 0) {
                    this.cacheThumbOutQueue.postRunnable(cacheImage4.cacheTask);
                    return;
                } else {
                    cacheImage4.runningTask = this.cacheOutQueue.postRunnable(cacheImage4.cacheTask, cacheImage4.priority);
                    return;
                }
            }
            cacheImage4.url = str7;
            this.imageLoadingByUrl.put(str7, cacheImage4);
            if (cacheImage4.isPFrame) {
                this.imageLoadingByUrlPframe.put(str7, cacheImage4);
            }
            String str18 = imageLocation.path;
            if (str18 != null) {
                String strMD5 = Utilities.MD5(str18);
                cacheImage4.tempFilePath = new File(FileLoader.getDirectory(4), strMD5 + "_temp.jpg");
                cacheImage4.finalFilePath = file;
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
                FileLoader.getInstance(i5).loadFile(imageLocation, obj, str4, fileLoadingPriority, (i9 != 0 || (j > 0 && imageLocation.key == null)) ? i9 : 1);
            } else if (imageLocation.document != null) {
                FileLoader.getInstance(i5).loadFile(imageLocation.document, obj, fileLoadingPriority, i9);
            } else if (imageLocation.secureDocument != null) {
                FileLoader.getInstance(i5).loadFile(imageLocation.secureDocument, fileLoadingPriority);
            } else if (imageLocation.webFile != null) {
                FileLoader.getInstance(i5).loadFile(imageLocation.webFile, fileLoadingPriority, i9);
            }
            if (imageReceiver.isForceLoding()) {
                this.forceLoadingImages.put(cacheImage4.key, 0);
            }
        }
    }

    public void preloadArtwork(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$preloadArtwork$8(str);
            }
        });
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
        String strMD5 = Utilities.MD5(forPath.path);
        cacheImage.tempFilePath = new File(FileLoader.getDirectory(4), strMD5 + "_temp.jpg");
        cacheImage.finalFilePath = file;
        ArtworkLoadTask artworkLoadTask = new ArtworkLoadTask(cacheImage);
        cacheImage.artworkTask = artworkLoadTask;
        this.artworkTasks.add(artworkLoadTask);
        runArtworkTasks(false);
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver) {
        loadImageForImageReceiver(imageReceiver, null);
    }

    public void loadImageForImageReceiver(ImageReceiver imageReceiver, List<ImageReceiver> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ImageLocation forDocument;
        boolean z5;
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ImageLocation imageLocation;
        String str7;
        String str8;
        String str9;
        BitmapDrawable fromLottieCache;
        BitmapDrawable bitmapDrawable;
        boolean zHasBitmap;
        BitmapDrawable fromLottieCache2;
        if (imageReceiver == null) {
            return;
        }
        String mediaKey = imageReceiver.getMediaKey();
        int newGuid = imageReceiver.getNewGuid();
        if (mediaKey != null) {
            ImageLocation mediaLocation = imageReceiver.getMediaLocation();
            Drawable drawableFindInPreloadImageReceivers = findInPreloadImageReceivers(mediaKey, list);
            if (drawableFindInPreloadImageReceivers == null) {
                if (useLottieMemCache(mediaLocation, mediaKey)) {
                    fromLottieCache2 = getFromLottieCache(mediaKey);
                } else {
                    fromLottieCache2 = this.memCache.get(mediaKey);
                    if (fromLottieCache2 != null) {
                        this.memCache.moveToFront(mediaKey);
                    }
                    if (fromLottieCache2 == null && (fromLottieCache2 = this.smallImagesMemCache.get(mediaKey)) != null) {
                        this.smallImagesMemCache.moveToFront(mediaKey);
                    }
                    if (fromLottieCache2 == null && (fromLottieCache2 = this.wallpaperMemCache.get(mediaKey)) != null) {
                        this.wallpaperMemCache.moveToFront(mediaKey);
                    }
                }
                drawableFindInPreloadImageReceivers = fromLottieCache2;
            }
            if (drawableFindInPreloadImageReceivers instanceof RLottieDrawable) {
                zHasBitmap = ((RLottieDrawable) drawableFindInPreloadImageReceivers).hasBitmap();
            } else {
                zHasBitmap = drawableFindInPreloadImageReceivers instanceof AnimatedFileDrawable ? ((AnimatedFileDrawable) drawableFindInPreloadImageReceivers).hasBitmap() : true;
            }
            if (zHasBitmap && drawableFindInPreloadImageReceivers != null) {
                cancelLoadingForImageReceiver(imageReceiver, true);
                imageReceiver.setImageBitmapByKey(drawableFindInPreloadImageReceivers, mediaKey, 3, true, newGuid);
                if (!imageReceiver.isForcePreview()) {
                    return;
                }
                z = true;
                z2 = false;
            } else if (drawableFindInPreloadImageReceivers != null) {
                imageReceiver.setImageBitmapByKey(drawableFindInPreloadImageReceivers, mediaKey, 3, true, newGuid);
                z = false;
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        String imageKey = imageReceiver.getImageKey();
        if (z || imageKey == null) {
            z3 = z;
        } else {
            ImageLocation imageLocation2 = imageReceiver.getImageLocation();
            Drawable drawableFindInPreloadImageReceivers2 = findInPreloadImageReceivers(imageKey, list);
            if (drawableFindInPreloadImageReceivers2 == null && useLottieMemCache(imageLocation2, imageKey)) {
                drawableFindInPreloadImageReceivers2 = getFromLottieCache(imageKey);
            }
            if (drawableFindInPreloadImageReceivers2 == null) {
                bitmapDrawable = this.memCache.get(imageKey);
                if (bitmapDrawable != null) {
                    this.memCache.moveToFront(imageKey);
                }
                if (bitmapDrawable == null && (bitmapDrawable = this.smallImagesMemCache.get(imageKey)) != null) {
                    this.smallImagesMemCache.moveToFront(imageKey);
                }
                if (bitmapDrawable == null && (bitmapDrawable = this.wallpaperMemCache.get(imageKey)) != null) {
                    this.wallpaperMemCache.moveToFront(imageKey);
                }
            } else {
                bitmapDrawable = drawableFindInPreloadImageReceivers2;
            }
            if (bitmapDrawable != null) {
                cancelLoadingForImageReceiver(imageReceiver, true);
                imageReceiver.setImageBitmapByKey(bitmapDrawable, imageKey, 0, true, newGuid);
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
            BitmapDrawable bitmapDrawable2 = fromLottieCache;
            if (bitmapDrawable2 != null) {
                imageReceiver.setImageBitmapByKey(bitmapDrawable2, thumbKey, 1, true, newGuid);
                cancelLoadingForImageReceiver(imageReceiver, false);
                if (z3 && imageReceiver.isForcePreview()) {
                    return;
                } else {
                    z4 = true;
                }
            } else {
                z4 = false;
            }
        }
        Object parentObject = imageReceiver.getParentObject();
        TLRPC.Document qualityThumbDocument = imageReceiver.getQualityThumbDocument();
        ImageLocation thumbLocation = imageReceiver.getThumbLocation();
        String thumbFilter = imageReceiver.getThumbFilter();
        ImageLocation mediaLocation2 = imageReceiver.getMediaLocation();
        String mediaFilter = imageReceiver.getMediaFilter();
        ImageLocation imageLocation3 = imageReceiver.getImageLocation();
        String imageFilter = imageReceiver.getImageFilter();
        if (imageLocation3 == null && imageReceiver.isNeedsQualityThumb() && imageReceiver.isCurrentKeyQuality()) {
            if (parentObject instanceof MessageObject) {
                forDocument = ImageLocation.getForDocument(((MessageObject) parentObject).getDocument());
            } else if (qualityThumbDocument != null) {
                forDocument = ImageLocation.getForDocument(qualityThumbDocument);
            } else {
                forDocument = imageLocation3;
                z5 = false;
            }
            z5 = true;
        } else {
            forDocument = imageLocation3;
            z5 = false;
        }
        String str10 = null;
        String str11 = (forDocument == null || forDocument.imageType != 2) ? null : "mp4";
        ImageLocation imageLocation4 = forDocument;
        String str12 = (mediaLocation2 == null || mediaLocation2.imageType != 2) ? null : "mp4";
        String ext = imageReceiver.getExt();
        if (ext == null) {
            ext = "jpg";
        }
        String str13 = str11 == null ? ext : str11;
        String str14 = str12 == null ? ext : str12;
        ImageLocation imageLocation5 = imageLocation4;
        ImageLocation imageLocation6 = mediaLocation2;
        String string2 = null;
        String string3 = null;
        String str15 = null;
        String str16 = null;
        int i = 0;
        boolean z6 = false;
        while (i < 2) {
            if (i == 0) {
                imageLocation = imageLocation5;
                str6 = str13;
            } else {
                str6 = str14;
                imageLocation = imageLocation6;
            }
            boolean z7 = z4;
            Object obj = imageLocation5;
            if (imageLocation != null) {
                if (imageLocation6 != null) {
                    imageLocation5 = imageLocation6;
                }
                String key = imageLocation.getKey(parentObject, imageLocation5, false);
                if (key == null) {
                    str7 = thumbFilter;
                    str8 = imageFilter;
                    str9 = mediaFilter;
                } else {
                    str7 = thumbFilter;
                    String key2 = imageLocation.getKey(parentObject, imageLocation6 != null ? imageLocation6 : obj, true);
                    if (imageLocation.path != null) {
                        key2 = key2 + "." + getHttpUrlExtension(imageLocation.path, "jpg");
                        str8 = imageFilter;
                        str9 = mediaFilter;
                    } else {
                        TLRPC.PhotoSize photoSize = imageLocation.photoSize;
                        str8 = imageFilter;
                        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                            str9 = mediaFilter;
                            key2 = key2 + "." + str6;
                        } else if (imageLocation.location != null) {
                            key2 = key2 + "." + str6;
                            if (imageReceiver.getExt() == null) {
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
                                if (tL_fileLocationToBeDeprecated.key == null) {
                                    str9 = mediaFilter;
                                    if (tL_fileLocationToBeDeprecated.volume_id == -2147483648L && tL_fileLocationToBeDeprecated.local_id < 0) {
                                    }
                                } else {
                                    str9 = mediaFilter;
                                }
                            } else {
                                str9 = mediaFilter;
                            }
                        } else {
                            str9 = mediaFilter;
                            WebFile webFile = imageLocation.webFile;
                            if (webFile != null) {
                                key2 = key2 + "." + getHttpUrlExtension(imageLocation.webFile.url, FileLoader.getMimeTypePart(webFile.mime_type));
                            } else if (imageLocation.secureDocument != null) {
                                key2 = key2 + "." + str6;
                            } else if (imageLocation.document != null) {
                                if (i == 0 && z5) {
                                    key = "q_" + key;
                                }
                                String documentFileName = FileLoader.getDocumentFileName(imageLocation.document);
                                int iLastIndexOf = documentFileName.lastIndexOf(46);
                                String str17 = "";
                                String strSubstring = iLastIndexOf == -1 ? "" : documentFileName.substring(iLastIndexOf);
                                if (strSubstring.length() > 1) {
                                    str17 = strSubstring;
                                } else if ("video/mp4".equals(imageLocation.document.mime_type)) {
                                    str17 = ".mp4";
                                } else if ("video/x-matroska".equals(imageLocation.document.mime_type)) {
                                    str17 = ".mkv";
                                }
                                key2 = key2 + str17;
                                z6 = (MessageObject.isVideoDocument(imageLocation.document) || MessageObject.isGifDocument(imageLocation.document) || MessageObject.isRoundVideoDocument(imageLocation.document) || MessageObject.canPreviewDocument(imageLocation.document)) ? false : true;
                            } else if (parentObject instanceof TLRPC.StickerSet) {
                                key2 = key2 + "." + str6;
                            }
                        }
                    }
                    if (i == 0) {
                        str15 = key2;
                        string3 = key;
                    } else {
                        str16 = key2;
                        string2 = key;
                    }
                    if (imageLocation == thumbLocation) {
                        if (i == 0) {
                            string3 = null;
                            imageLocation5 = null;
                            str15 = null;
                        } else {
                            string2 = null;
                            str16 = null;
                            imageLocation6 = null;
                        }
                    }
                }
                imageLocation5 = obj;
            } else {
                str7 = thumbFilter;
                str8 = imageFilter;
                str9 = mediaFilter;
                imageLocation5 = obj;
            }
            i++;
            newGuid = newGuid;
            z4 = z7;
            thumbFilter = str7;
            imageFilter = str8;
            mediaFilter = str9;
        }
        boolean z8 = z4;
        String str18 = thumbFilter;
        ImageLocation imageLocation7 = imageLocation5;
        String str19 = imageFilter;
        String str20 = mediaFilter;
        int i2 = newGuid;
        if (thumbLocation != null) {
            ImageLocation strippedLocation = imageReceiver.getStrippedLocation();
            if (strippedLocation == null) {
                strippedLocation = imageLocation6 != null ? imageLocation6 : imageLocation3;
            }
            String key3 = thumbLocation.getKey(parentObject, strippedLocation, false);
            String key4 = thumbLocation.getKey(parentObject, strippedLocation, true);
            if (thumbLocation.path != null) {
                key4 = key4 + "." + getHttpUrlExtension(thumbLocation.path, "jpg");
            } else {
                TLRPC.PhotoSize photoSize2 = thumbLocation.photoSize;
                if ((photoSize2 instanceof TLRPC.TL_photoStrippedSize) || (photoSize2 instanceof TLRPC.TL_photoPathSize)) {
                    key4 = key4 + "." + ext;
                } else if (thumbLocation.location != null) {
                    key4 = key4 + "." + ext;
                }
            }
            str10 = key4;
            string = key3;
        } else {
            string = null;
        }
        if (string2 == null || str20 == null) {
            str = str20;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            sb.append("@");
            str = str20;
            sb.append(str);
            string2 = sb.toString();
        }
        if (string3 == null || str19 == null) {
            str2 = str19;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string3);
            sb2.append("@");
            str2 = str19;
            sb2.append(str2);
            string3 = sb2.toString();
        }
        if (string == null || str18 == null) {
            str3 = str18;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("@");
            str3 = str18;
            sb3.append(str3);
            string = sb3.toString();
        }
        String str21 = string;
        if (imageReceiver.getUniqKeyPrefix() == null || string3 == null) {
            str4 = string3;
        } else {
            str4 = imageReceiver.getUniqKeyPrefix() + string3;
        }
        if (imageReceiver.getUniqKeyPrefix() == null || string2 == null) {
            str5 = string2;
        } else {
            str5 = imageReceiver.getUniqKeyPrefix() + string2;
        }
        if (imageLocation7 != null && imageLocation7.path != null) {
            createLoadOperationForImageReceiver(imageReceiver, str21, str10, ext, thumbLocation, str3, 0L, 1, 1, z8 ? 2 : 1, i2);
            createLoadOperationForImageReceiver(imageReceiver, str4, str15, str13, imageLocation7, str2, imageReceiver.getSize(), 1, 0, 0, i2);
            return;
        }
        ImageLocation imageLocation8 = imageLocation7;
        if (imageLocation6 != null) {
            int cacheType = imageReceiver.getCacheType();
            int i3 = (cacheType == 0 && z6) ? 1 : cacheType;
            int i4 = i3 == 0 ? 1 : i3;
            if (!z8) {
                createLoadOperationForImageReceiver(imageReceiver, str21, str10, ext, thumbLocation, str3, 0L, i4, 1, 1, i2);
            }
            if (!z3) {
                createLoadOperationForImageReceiver(imageReceiver, str4, str15, str13, imageLocation8, str2, 0L, 1, 0, 0, i2);
            }
            if (z2) {
                return;
            }
            createLoadOperationForImageReceiver(imageReceiver, str5, str16, str14, imageLocation6, str, imageReceiver.getSize(), i3, 3, 0, i2);
            return;
        }
        int cacheType2 = imageReceiver.getCacheType();
        int i5 = (cacheType2 == 0 && z6) ? 1 : cacheType2;
        createLoadOperationForImageReceiver(imageReceiver, str21, str10, ext, thumbLocation, str3, 0L, i5 == 0 ? 1 : i5, 1, z8 ? 2 : 1, i2);
        createLoadOperationForImageReceiver(imageReceiver, str4, str15, str13, imageLocation8, str2, imageReceiver.getSize(), i5, 0, 0, i2);
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

    public BitmapDrawable getFromLottieCache(String str) {
        BitmapDrawable bitmapDrawable = this.lottieMemCache.get(str);
        if (!(bitmapDrawable instanceof AnimatedFileDrawable) || !((AnimatedFileDrawable) bitmapDrawable).isRecycled()) {
            return bitmapDrawable;
        }
        this.lottieMemCache.remove(str);
        return null;
    }

    private boolean useLottieMemCache(ImageLocation imageLocation, String str) {
        if (str.endsWith("_firstframe") || str.endsWith("_lastframe")) {
            return false;
        }
        return (imageLocation != null && (MessageObject.isAnimatedStickerDocument(imageLocation.document, true) || imageLocation.imageType == 1 || MessageObject.isVideoSticker(imageLocation.document))) || isAnimatedAvatar(str);
    }

    public boolean hasLottieMemCache(String str) {
        LruCache<BitmapDrawable> lruCache = this.lottieMemCache;
        return lruCache != null && lruCache.contains(str);
    }

    public void httpFileLoadError(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$httpFileLoadError$9(str);
            }
        });
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

    public void artworkLoadError(final String str) {
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$artworkLoadError$10(str);
            }
        });
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

    public void fileDidLoaded(final String str, final File file, final int i) {
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$fileDidLoaded$11(str, i, file);
            }
        });
    }

    public void lambda$fileDidLoaded$11(String str, int i, File file) {
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
            if (cacheOutTask.cacheImage.type != 1) {
                this.cacheOutQueue.postRunnable(cacheOutTask, cacheOutTask.cacheImage.priority);
            } else {
                this.cacheThumbOutQueue.postRunnable(cacheOutTask);
            }
        }
    }

    public void fileDidFailedLoad(final String str, int i) {
        if (i == 1) {
            return;
        }
        this.imageLoadQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$fileDidFailedLoad$12(str);
            }
        });
    }

    public void lambda$fileDidFailedLoad$12(String str) {
        CacheImage cacheImage = this.imageLoadingByUrl.get(str);
        if (cacheImage != null) {
            cacheImage.setImageAndClear(null, null);
        }
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

    public boolean isLoadingHttpFile(String str) {
        return this.httpFileLoadTasksByKeys.containsKey(str);
    }

    public static String getHttpFileName(String str) {
        return Utilities.MD5(str);
    }

    public static File getHttpFilePath(String str, String str2) {
        String httpUrlExtension = getHttpUrlExtension(str, str2);
        return new File(FileLoader.getDirectory(4), Utilities.MD5(str) + "." + httpUrlExtension);
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

    public void runHttpFileLoadTasks(final HttpFileTask httpFileTask, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runHttpFileLoadTasks$14(httpFileTask, i);
            }
        });
    }

    public void lambda$runHttpFileLoadTasks$14(HttpFileTask httpFileTask, int i) {
        if (httpFileTask != null) {
            this.currentHttpFileLoadTasksCount--;
        }
        if (httpFileTask != null) {
            if (i == 1) {
                if (!httpFileTask.canRetry) {
                    this.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                    NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidFailedLoad, httpFileTask.url, 0);
                } else {
                    final HttpFileTask httpFileTask2 = new HttpFileTask(httpFileTask.url, httpFileTask.tempFile, httpFileTask.ext, httpFileTask.currentAccount);
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$runHttpFileLoadTasks$13(httpFileTask2);
                        }
                    };
                    this.retryHttpsTasks.put(httpFileTask.url, runnable);
                    AndroidUtilities.runOnUIThread(runnable, 1000L);
                }
            } else if (i == 2) {
                this.httpFileLoadTasksByKeys.remove(httpFileTask.url);
                File file = new File(FileLoader.getDirectory(4), Utilities.MD5(httpFileTask.url) + "." + httpFileTask.ext);
                if (!httpFileTask.tempFile.renameTo(file)) {
                    file = httpFileTask.tempFile;
                }
                NotificationCenter.getInstance(httpFileTask.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.httpFileDidLoad, httpFileTask.url, file.toString());
            }
        }
        while (this.currentHttpFileLoadTasksCount < 2 && !this.httpFileLoadTasks.isEmpty()) {
            this.httpFileLoadTasks.poll().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            this.currentHttpFileLoadTasksCount++;
        }
    }

    public void lambda$runHttpFileLoadTasks$13(HttpFileTask httpFileTask) {
        this.httpFileLoadTasks.add(httpFileTask);
        runHttpFileLoadTasks(null, 0);
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

    public static Bitmap loadBitmap(String str, Uri uri, float f, float f2, boolean z) {
        String str2;
        InputStream inputStreamOpenInputStream;
        float f3;
        float f4;
        float fMin;
        int i;
        Matrix matrix;
        float f5;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2;
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
        Bitmap bitmapDecodeFile = null;
        try {
            try {
                if (str2 != null) {
                    BitmapFactory.decodeFile(str2, options);
                } else {
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
                                if (str2 == null) {
                                    if (uri == null) {
                                        return null;
                                    }
                                    try {
                                        bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                                        if (bitmapDecodeFile != null) {
                                            bitmapDecodeFile.recycle();
                                            bitmapDecodeFile = bitmapCreateBitmap2;
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            FileLog.e(th3);
                                        } finally {
                                            try {
                                                inputStreamOpenInputStream.close();
                                            } catch (Throwable th4) {
                                                FileLog.e(th4);
                                            }
                                        }
                                    }
                                    try {
                                        return bitmapDecodeFile;
                                    } catch (Throwable th5) {
                                        return bitmapDecodeFile;
                                    }
                                }
                                try {
                                    bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                                    if (bitmapDecodeFile != null) {
                                        return bitmapDecodeFile;
                                    }
                                    return bitmapDecodeFile;
                                } catch (Throwable th6) {
                                    FileLog.e(th6);
                                    getInstance().clearMemory();
                                    if (bitmapDecodeFile == null) {
                                        try {
                                            bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                                        } catch (Throwable th7) {
                                            FileLog.e(th7);
                                            return bitmapDecodeFile;
                                        }
                                    }
                                    if (bitmapDecodeFile == null) {
                                        return bitmapDecodeFile;
                                    }
                                    bitmapCreateBitmap = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                                    if (bitmapCreateBitmap == bitmapDecodeFile) {
                                        return bitmapDecodeFile;
                                    }
                                    bitmapDecodeFile.recycle();
                                }
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
                    if (str2 == null) {
                        bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                        if (bitmapDecodeFile != null || (bitmapCreateBitmap = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true)) == bitmapDecodeFile) {
                            return bitmapDecodeFile;
                        }
                        bitmapDecodeFile.recycle();
                        return bitmapCreateBitmap;
                    }
                    if (uri == null) {
                        return null;
                    }
                    bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (bitmapDecodeFile != null && (bitmapCreateBitmap2 = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true)) != bitmapDecodeFile) {
                        bitmapDecodeFile.recycle();
                        bitmapDecodeFile = bitmapCreateBitmap2;
                    }
                    return bitmapDecodeFile;
                }
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
        if (str2 == null) {
            bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
            if (bitmapDecodeFile != null) {
                return bitmapDecodeFile;
            }
            return bitmapDecodeFile;
            return bitmapCreateBitmap;
        }
        if (uri == null) {
            return null;
        }
        bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        if (bitmapDecodeFile != null) {
            bitmapDecodeFile.recycle();
            bitmapDecodeFile = bitmapCreateBitmap2;
        }
        return bitmapDecodeFile;
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
            } else if (i <= 1280 && i2 <= 1280) {
                tL_photoSize_layer127.type = "y";
            } else {
                tL_photoSize_layer127.type = "w";
            }
            String str2 = tL_fileLocationToBeDeprecated.volume_id + "_" + tL_fileLocationToBeDeprecated.local_id + ".jpg";
            File directory = (z || tL_fileLocationToBeDeprecated.volume_id == -2147483648L) ? FileLoader.getDirectory(4) : FileLoader.getDirectory(0);
            File file = new File(directory, str2);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
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

    private static TLRPC.PhotoSize scaleAndSaveImageInternal(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z, int i, int i2, float f, float f2, float f3, int i3, boolean z2, boolean z3, boolean z4) throws IOException {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        int i4;
        Bitmap bitmapCreateScaledBitmap = (f3 > 1.0f || z3) ? Bitmaps.createScaledBitmap(bitmap, i, i2, true) : bitmap;
        if (photoSize != null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (!(fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated)) {
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
                } else if (i4 > 1280 && height <= 1280) {
                    photoSize.type = "y";
                } else {
                    photoSize.type = "w";
                }
            } else {
                tL_fileLocationToBeDeprecated = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
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
                        if (i4 > 1280) {
                            photoSize.type = "w";
                        } else {
                            photoSize.type = "w";
                        }
                    } else if (i4 > 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i4 > 800) {
                    if (i4 > 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i4 > 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i4 > 320) {
                if (i4 > 800) {
                    if (i4 > 1280) {
                        photoSize.type = "w";
                    } else {
                        photoSize.type = "w";
                    }
                } else if (i4 > 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i4 > 800) {
                if (i4 > 1280) {
                    photoSize.type = "w";
                } else {
                    photoSize.type = "w";
                }
            } else if (i4 > 1280) {
                photoSize.type = "w";
            } else {
                photoSize.type = "w";
            }
        }
        int i5 = AnonymousClass7.$SwitchMap$android$graphics$Bitmap$CompressFormat[compressFormat.ordinal()];
        String str = tL_fileLocationToBeDeprecated.volume_id + "_" + tL_fileLocationToBeDeprecated.local_id + ((i5 == 1 || i5 == 2 || i5 == 3) ? ".webp" : ".jpg");
        File directory = (z4 || tL_fileLocationToBeDeprecated.volume_id == -2147483648L) ? FileLoader.getDirectory(4) : FileLoader.getDirectory(0);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(directory, str));
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

    static class AnonymousClass7 {
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

    public static TLRPC.PhotoSize scaleAndSaveImage(Bitmap bitmap, float f, float f2, int i, boolean z) {
        return scaleAndSaveImage(null, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, 0, 0, false);
    }

    public static TLRPC.PhotoSize scaleAndSaveImage(TLRPC.PhotoSize photoSize, Bitmap bitmap, float f, float f2, int i, boolean z, boolean z2) {
        return scaleAndSaveImage(photoSize, bitmap, Bitmap.CompressFormat.JPEG, false, f, f2, i, z, 0, 0, z2);
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
        float f3;
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
                f3 = fMax2;
                z4 = false;
            } else {
                float f4 = i2;
                if (width < f4 || height < i3) {
                    if (width < f4 && height > i3) {
                        fMax = width / f4;
                    } else if (width > f4) {
                        float f5 = i3;
                        if (height < f5) {
                            fMax = height / f5;
                        } else {
                            fMax = Math.max(width / f4, height / i3);
                        }
                    } else {
                        fMax = Math.max(width / f4, height / i3);
                    }
                    f3 = fMax;
                    z4 = true;
                } else {
                    f3 = fMax2;
                    z4 = false;
                }
            }
            int i4 = (int) (width / f3);
            int i5 = (int) (height / f3);
            if (i5 != 0 && i4 != 0) {
                try {
                    return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z, i4, i5, width, height, f3, i, z2, z4, z3);
                } catch (Throwable th) {
                    FileLog.e(th);
                    getInstance().clearMemory();
                    System.gc();
                    try {
                        return scaleAndSaveImageInternal(photoSize, bitmap, compressFormat, z, i4, i5, width, height, f3, i, z2, z4, z3);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                }
            }
        }
        return null;
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
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i < size2) {
                    TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i++;
                }
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i < size3) {
                    TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i++;
                }
            }
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
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
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i < size2) {
                    TLRPC.PhotoSize photoSize2 = messageMedia.document.thumbs.get(i);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i++;
                }
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i < size3) {
                    TLRPC.PhotoSize photoSize3 = messageMedia.webpage.photo.sizes.get(i);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i++;
                }
            }
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (messageMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) messageMedia.extended_media.get(0)).thumb;
        }
        return null;
    }

    public static void saveMessagesThumbs(ArrayList<TLRPC.Message> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            saveMessageThumbs(arrayList.get(i));
        }
    }

    public static MessageThumb generateMessageThumb(TLRPC.Message message) {
        int i;
        int i2;
        Bitmap strippedPhotoBitmap;
        byte[] bArr;
        TLRPC.PhotoSize photoSizeFindPhotoCachedSize = findPhotoCachedSize(message);
        if (photoSizeFindPhotoCachedSize != null && (bArr = photoSizeFindPhotoCachedSize.bytes) != null && bArr.length != 0) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(photoSizeFindPhotoCachedSize, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = photoSizeFindPhotoCachedSize.w;
            tL_photoSize_layer127.h = photoSizeFindPhotoCachedSize.h;
            tL_photoSize_layer127.location = photoSizeFindPhotoCachedSize.location;
            tL_photoSize_layer127.size = photoSizeFindPhotoCachedSize.size;
            tL_photoSize_layer127.type = photoSizeFindPhotoCachedSize.type;
            if (pathToAttach.exists() && message.grouped_id == 0) {
                PointF messageSize = ChatMessageCell.getMessageSize(photoSizeFindPhotoCachedSize.w, photoSizeFindPhotoCachedSize.h);
                String str = String.format(Locale.US, "%d_%d@%d_%d_b", Long.valueOf(photoSizeFindPhotoCachedSize.location.volume_id), Integer.valueOf(photoSizeFindPhotoCachedSize.location.local_id), Integer.valueOf((int) (messageSize.x / AndroidUtilities.density)), Integer.valueOf((int) (messageSize.y / AndroidUtilities.density)));
                if (!getInstance().isInMemCache(str, false)) {
                    String path = pathToAttach.getPath();
                    float f = messageSize.x;
                    float f2 = AndroidUtilities.density;
                    Bitmap bitmapLoadBitmap = loadBitmap(path, null, (int) (f / f2), (int) (messageSize.y / f2), false);
                    if (bitmapLoadBitmap != null) {
                        Utilities.blurBitmap(bitmapLoadBitmap, 3);
                        float f3 = messageSize.x;
                        float f4 = AndroidUtilities.density;
                        Bitmap bitmapCreateScaledBitmap = Bitmaps.createScaledBitmap(bitmapLoadBitmap, (int) (f3 / f4), (int) (messageSize.y / f4), true);
                        if (bitmapCreateScaledBitmap != bitmapLoadBitmap) {
                            bitmapLoadBitmap.recycle();
                            bitmapLoadBitmap = bitmapCreateScaledBitmap;
                        }
                        return new MessageThumb(str, new BitmapDrawable(bitmapLoadBitmap));
                    }
                }
            }
        } else {
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
                        PointF messageSize2 = ChatMessageCell.getMessageSize(i, i2);
                        String str2 = String.format(Locale.US, "%s_false@%d_%d_b", ImageLocation.getStrippedKey(message, message, photoSize), Integer.valueOf((int) (messageSize2.x / AndroidUtilities.density)), Integer.valueOf((int) (messageSize2.y / AndroidUtilities.density)));
                        if (!getInstance().isInMemCache(str2, false) && (strippedPhotoBitmap = getStrippedPhotoBitmap(photoSize.bytes, null)) != null) {
                            Utilities.blurBitmap(strippedPhotoBitmap, 3);
                            float f5 = messageSize2.x;
                            float f6 = AndroidUtilities.density;
                            Bitmap bitmapCreateScaledBitmap2 = Bitmaps.createScaledBitmap(strippedPhotoBitmap, (int) (f5 / f6), (int) (messageSize2.y / f6), true);
                            if (bitmapCreateScaledBitmap2 != strippedPhotoBitmap) {
                                strippedPhotoBitmap.recycle();
                                strippedPhotoBitmap = bitmapCreateScaledBitmap2;
                            }
                            return new MessageThumb(str2, new BitmapDrawable(strippedPhotoBitmap));
                        }
                    }
                }
            }
        }
        return null;
    }

    public void onFragmentStackChanged() {
        for (int i = 0; i < this.cachedAnimatedFileDrawables.size(); i++) {
            this.cachedAnimatedFileDrawables.get(i).repeatCount = 0;
        }
    }

    public DispatchQueuePriority getCacheOutQueue() {
        return this.cacheOutQueue;
    }

    public static class MessageThumb {
        BitmapDrawable drawable;
        String key;

        public MessageThumb(String str, BitmapDrawable bitmapDrawable) {
            this.key = str;
            this.drawable = bitmapDrawable;
        }
    }
}
