package g9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
public abstract class h {
    public static final char[] f7159a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static ExecutorService a(String str) {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new w(str, new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new x(str, unconfigurableExecutorService), "Crashlytics Shutdown Hook for ".concat(str)));
        return unconfigurableExecutorService;
    }

    public static synchronized long b(Context context) {
        long j10;
        synchronized (h.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        }
        return j10;
    }

    public static void c(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    public static int d() {
        boolean g10 = g();
        ?? r02 = g10;
        if (h()) {
            r02 = (g10 ? 1 : 0) | true;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return r02;
        }
        return r02 | 4;
    }

    public static int e(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f7159a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean g() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean h() {
        boolean g10 = g();
        String str = Build.TAGS;
        if ((!g10 && str != null && str.contains("test-keys")) || com.google.android.recaptcha.internal.a.v("/system/app/Superuser.apk")) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!g10 && file.exists()) {
            return true;
        }
        return false;
    }

    public static String i(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return f(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e10);
            return "";
        }
    }

    public static String j(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
}
