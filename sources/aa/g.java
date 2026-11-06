package aa;

import a8.p0;
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
public abstract class g {
    public static final char[] f810a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized long a(Context context) {
        long j3;
        synchronized (g.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j3 = memoryInfo.totalMem;
        }
        return j3;
    }

    public static void b(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", str, e10);
            }
        }
    }

    public static boolean c(Context context, String str, boolean z9) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int e10 = e(context, str, "bool");
            if (e10 > 0) {
                return resources.getBoolean(e10);
            }
            int e11 = e(context, str, "string");
            if (e11 > 0) {
                return Boolean.parseBoolean(context.getString(e11));
            }
        }
        return z9;
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
        int i7 = context.getApplicationContext().getApplicationInfo().icon;
        if (i7 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i7);
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
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b10 = bArr[i7];
            int i10 = i7 * 2;
            char[] cArr2 = f810a;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
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
        if ((!g10 && str != null && str.contains("test-keys")) || p0.B("/system/app/Superuser.apk")) {
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
        String str;
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            } else {
                str = "";
            }
            useDelimiter.close();
            return str;
        } catch (Throwable th2) {
            if (useDelimiter != null) {
                try {
                    useDelimiter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
