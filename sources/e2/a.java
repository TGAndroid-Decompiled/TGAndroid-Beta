package e2;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public abstract class a {
    public static ExecutorService f8720a;
    public static final Object f8721b = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 == null) {
            replace = null;
        } else {
            synchronized (f8721b) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 != null) {
                        try {
                            if (th3 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th3 = th3.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder g10 = w.f.g(str, "\n  ");
            g10.append(replace.replace("\n", "\n  "));
            g10.append('\n');
            return g10.toString();
        }
        return str;
    }

    public static void b() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (!z10) {
            return;
        }
        throw new Exception(sb2.toString());
    }

    public static void c(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new Exception(str);
    }

    public static void d(String str, String str2) {
        synchronized (f8721b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f8721b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        synchronized (f8721b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor g() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (f8720a == null) {
                    String str = d0.f8737a;
                    f8720a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = f8720a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public static int[] h(String str) {
        int i10;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void i(String str, String str2) {
        synchronized (f8721b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean j(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        b();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        if (eglQueryString == null || !eglQueryString.contains(str)) {
            return false;
        }
        return true;
    }

    public static String k(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i15 = i10;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb2.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb2.charAt(i16) == '.') {
                sb2.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb2.charAt(i16) == '.' && sb2.charAt(i17) == '.') {
                    i13 = sb2.lastIndexOf("/", i16 - 2) + 1;
                    if (i13 > i10) {
                        i14 = i13;
                    } else {
                        i14 = i10;
                    }
                    sb2.delete(i14, i12);
                    i11 -= i12 - i14;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb2.toString();
    }

    public static String l(String str, String str2) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] h = h(str2);
        if (h[0] != -1) {
            sb2.append(str2);
            k(sb2, h[1], h[2]);
            return sb2.toString();
        }
        int[] h10 = h(str);
        if (h[3] == 0) {
            sb2.append((CharSequence) str, 0, h10[3]);
            sb2.append(str2);
            return sb2.toString();
        } else if (h[2] == 0) {
            sb2.append((CharSequence) str, 0, h10[2]);
            sb2.append(str2);
            return sb2.toString();
        } else {
            int i11 = h[1];
            if (i11 != 0) {
                int i12 = h10[0] + 1;
                sb2.append((CharSequence) str, 0, i12);
                sb2.append(str2);
                return k(sb2, h[1] + i12, i12 + h[2]);
            } else if (str2.charAt(i11) == '/') {
                sb2.append((CharSequence) str, 0, h10[1]);
                sb2.append(str2);
                int i13 = h10[1];
                return k(sb2, i13, h[2] + i13);
            } else {
                int i14 = h10[0] + 2;
                int i15 = h10[1];
                if (i14 < i15 && i15 == h10[2]) {
                    sb2.append((CharSequence) str, 0, i15);
                    sb2.append('/');
                    sb2.append(str2);
                    int i16 = h10[1];
                    return k(sb2, i16, h[2] + i16 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, h10[2] - 1);
                if (lastIndexOf == -1) {
                    i10 = h10[1];
                } else {
                    i10 = lastIndexOf + 1;
                }
                sb2.append((CharSequence) str, 0, i10);
                sb2.append(str2);
                return k(sb2, h10[1], i10 + h[2]);
            }
        }
    }

    public static Uri m(String str, String str2) {
        return Uri.parse(l(str, str2));
    }

    public static void n(String str, String str2) {
        synchronized (f8721b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void o(String str, String str2, Throwable th2) {
        synchronized (f8721b) {
            Log.w(str, a(str2, th2));
        }
    }
}
