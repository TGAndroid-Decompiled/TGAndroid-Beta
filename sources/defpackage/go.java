package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.Person;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.provider.Settings;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public abstract class go {
    public static boolean a;
    public static AtomicInteger b;
    public static boolean c;
    public static int d;
    public static pd1 e;
    public static String f;
    public static int g;
    public static Boolean h;

    public static void A(Notification.Action.Builder builder, int i) {
        builder.setSemanticAction(i);
    }

    public static void B(float f2) {
        BasePendingResult basePendingResult;
        v99 e2 = e();
        if (e2 == null) {
            return;
        }
        AtomicInteger atomicInteger = b;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            b = atomicInteger;
        }
        atomicInteger.incrementAndGet();
        double d2 = f2;
        xve.e("Must be called from the main thread.");
        if (!e2.w()) {
            basePendingResult = v99.t();
        } else {
            ngd ngdVar = new ngd(e2, d2, (byte) 1);
            v99.x(ngdVar);
            basePendingResult = ngdVar;
        }
        basePendingResult.b(new nd1((byte) 4));
    }

    public static void C(float f2) {
        BasePendingResult basePendingResult;
        v99 e2 = e();
        if (e2 == null) {
            return;
        }
        AtomicInteger atomicInteger = b;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            b = atomicInteger;
        }
        atomicInteger.incrementAndGet();
        double d2 = f2;
        xve.e("Must be called from the main thread.");
        if (!e2.w()) {
            basePendingResult = v99.t();
        } else {
            ngd ngdVar = new ngd(e2, d2, (byte) 0);
            v99.x(ngdVar);
            basePendingResult = ngdVar;
        }
        basePendingResult.b(new nd1((byte) 2));
    }

    public static boolean D(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void E() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m;
        j07 e2;
        long j;
        boolean z = a;
        if (!z) {
            PhotoViewer.q0().s2();
        } else if (z) {
            MediaController z2 = MediaController.z();
            if (z2.v0 != null) {
                z2.U1 = true;
                if (w() && ((atomicInteger = b) == null || atomicInteger.get() <= 0)) {
                    v99 e3 = e();
                    if (e3 == null) {
                        a2 = -1;
                    } else {
                        a2 = e3.a();
                    }
                    long B = z2.B(z2.v0);
                    if (B >= 0 && a2 >= 0 && Math.abs(B - a2) > 1000) {
                        r47 r47Var = z2.v0;
                        if ((z2.j0 != null || z2.F0 != null) && r47Var != null && z2.K(r47Var)) {
                            try {
                                kfc kfcVar = z2.j0;
                                if (kfcVar != null) {
                                    j = kfcVar.U();
                                    if (j != -9223372036854775807L) {
                                        r47Var.b0 = Utilities.l(((float) a2) / ((float) j));
                                    }
                                    z2.j0.p0(a2, false);
                                    r47Var.e0 = a2;
                                    if (!z2.U1) {
                                        x(a2);
                                    }
                                } else {
                                    kfc kfcVar2 = z2.F0;
                                    if (kfcVar2 != null) {
                                        j = kfcVar2.U();
                                        z2.F0.o0(a2);
                                        if (!z2.U1) {
                                            x(a2);
                                        }
                                    } else {
                                        j = 1;
                                    }
                                }
                                if (j != 0) {
                                    jn7.f(r47Var.K1).k(jn7.i2, Integer.valueOf(r47Var.e1()), Float.valueOf(Utilities.l(((float) a2) / ((float) j))));
                                }
                            } catch (Exception e4) {
                                cc4.g(e4, true);
                            }
                        }
                    }
                    v99 e5 = e();
                    if (e5 == null) {
                        m = false;
                    } else if (!a) {
                        m = !e5.l();
                    } else {
                        m = e5.m();
                    }
                    r47 r47Var2 = z2.v0;
                    if (m) {
                        z2.V(r47Var2);
                    } else {
                        z2.U(r47Var2, true);
                    }
                    v99 e6 = e();
                    float f2 = 1.0f;
                    if (e6 != null && (e2 = e6.e()) != null) {
                        f2 = (float) e2.d;
                    }
                    z2.o0(true, f2);
                }
                z2.p0();
                z2.U1 = false;
            }
        }
    }

    public static void F(long j) {
        long a2;
        if (j >= 0) {
            v99 e2 = e();
            if (e2 == null) {
                a2 = -1;
            } else {
                a2 = e2.a();
            }
            if (a2 != -1 && Math.abs(a2 - j) <= 1500) {
                return;
            }
            x(j);
        }
    }

    public static Person G(b78 b78Var) {
        Person.Builder name = new Person.Builder().setName(b78Var.a);
        IconCompat iconCompat = b78Var.b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = jpe.a(iconCompat, null);
        }
        return name.setIcon(icon).setUri(b78Var.c).setKey(b78Var.d).setBot(b78Var.e).setImportant(b78Var.f).build();
    }

    public static boolean H() {
        Boolean bool = h;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (invoke != null) {
                        bool = (Boolean) invoke;
                    } else {
                        throw new RuntimeException(laf.a("expected a non-null reference", objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            h = bool;
        }
        return bool.booleanValue();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i) {
        id1 c2;
        a = i;
        if (!c) {
            try {
                if (f() == null || (c2 = id1.c(f())) == null) {
                    return;
                }
                c2.b().a(new jp5(i));
                c = true;
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z) {
        boolean z2;
        Context f2;
        AudioManager audioManager;
        pd1 pd1Var = e;
        if (pd1Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (z) {
                Context f3 = f();
                if (f3 != null && (audioManager = (AudioManager) f3.getSystemService("audio")) != null) {
                    d = audioManager.getStreamVolume(3);
                    ContentResolver contentResolver = f3.getContentResolver();
                    Uri uri = Settings.System.CONTENT_URI;
                    pd1 pd1Var2 = new pd1(new Handler(), (byte) 0);
                    e = pd1Var2;
                    contentResolver.registerContentObserver(uri, true, pd1Var2);
                    C(g());
                    audioManager.adjustStreamVolume(3, 0, 1);
                }
            } else if (pd1Var != null && (f2 = f()) != null) {
                f2.getContentResolver().unregisterContentObserver(e);
                e = null;
                AudioManager audioManager2 = (AudioManager) f2.getSystemService("audio");
                if (audioManager2 != null) {
                    audioManager2.setStreamVolume(3, d, 0);
                    E();
                }
            }
        }
    }

    public static v99 e() {
        md1 c2;
        if (f() != null) {
            try {
                id1 c3 = id1.c(f());
                if (c3 != null && (c2 = c3.b().c()) != null && c2.b()) {
                    xve.e("Must be called from the main thread.");
                    return c2.j;
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return a.b;
        }
        return launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        int i;
        Context f2 = f();
        if (f2 == null || (audioManager = (AudioManager) f2.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i = audioManager.getStreamMinVolume(3);
        } else {
            i = 0;
        }
        return Utilities.l((streamVolume - i) / (streamMaxVolume - i));
    }

    public static String[] h(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor i(Context context) {
        return context.getMainExecutor();
    }

    public static String j() {
        BufferedReader bufferedReader;
        String str = f;
        if (str == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                String processName = Application.getProcessName();
                f = processName;
                return processName;
            }
            int i = g;
            if (i == 0) {
                i = Process.myPid();
                g = i;
            }
            String str2 = null;
            str2 = null;
            str2 = null;
            BufferedReader bufferedReader2 = null;
            if (i > 0) {
                try {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 14);
                    sb.append("/proc/");
                    sb.append(i);
                    sb.append("/cmdline");
                    String sb2 = sb.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(sb2));
                        try {
                            String readLine = bufferedReader.readLine();
                            xve.h(readLine);
                            str2 = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            xoe.a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                xoe.a(bufferedReader);
            }
            f = str2;
            return str2;
        }
        return str;
    }

    public static int k(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String l(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params r(tq tqVar) {
        return tqVar.getTextMetricsParams();
    }

    public static int s(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri t(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static final long u(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static ClassLoader v() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean w() {
        md1 c2;
        if (f() != null) {
            try {
                id1 c3 = id1.c(f());
                if (c3 != null && (c2 = c3.b().c()) != null) {
                    if (!c2.c()) {
                        if (c2.b()) {
                        }
                    }
                    return true;
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
                return false;
            }
        }
        return false;
    }

    public static void x(long j) {
        v99 e2 = e();
        if (e2 == null) {
            return;
        }
        AtomicInteger atomicInteger = b;
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            b = atomicInteger;
        }
        atomicInteger.incrementAndGet();
        e2.q(new sw6(j)).b(new nd1((byte) 3));
    }

    public static void y(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void z(boolean z) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        v99 e2 = e();
        if (e2 != null && z != e2.m()) {
            AtomicInteger atomicInteger = b;
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger(0);
                b = atomicInteger;
            }
            atomicInteger.incrementAndGet();
            if (z) {
                xve.e("Must be called from the main thread.");
                if (!e2.w()) {
                    basePendingResult2 = v99.t();
                } else {
                    qad qadVar = new qad(e2, (byte) 6);
                    v99.x(qadVar);
                    basePendingResult2 = qadVar;
                }
                basePendingResult2.b(new nd1((byte) 0));
                return;
            }
            xve.e("Must be called from the main thread.");
            if (!e2.w()) {
                basePendingResult = v99.t();
            } else {
                qad qadVar2 = new qad(e2, (byte) 5);
                v99.x(qadVar2);
                basePendingResult = qadVar2;
            }
            basePendingResult.b(new nd1((byte) 1));
        }
    }
}
