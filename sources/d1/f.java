package d1;

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
import android.provider.Settings;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.clearcut.f2;
import e0.j0;
import f6.p;
import f6.q;
import h6.h;
import h6.i;
import h6.l;
import java.util.concurrent.atomic.AtomicInteger;
import m.a1;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.t9;
import q6.m;
public abstract class f {
    public static int f7944a;
    public static AtomicInteger f7945b;
    public static boolean f7946c;
    public static int d;
    public static f2 f7947e;

    public static void A(float f10) {
        BasePendingResult basePendingResult;
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f7945b == null) {
            f7945b = new AtomicInteger(0);
        }
        f7945b.incrementAndGet();
        double d2 = f10;
        m.d("Must be called from the main thread.");
        if (!e10.w()) {
            basePendingResult = h.t();
        } else {
            l lVar = new l(e10, d2, 0);
            h.x(lVar);
            basePendingResult = lVar;
        }
        basePendingResult.b(new t9(2));
    }

    public static boolean B(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void C() {
        AtomicInteger atomicInteger;
        long a10;
        boolean m10;
        q e10;
        long j3;
        int i7 = f7944a;
        if (i7 == 0) {
            PhotoViewer.p1().f3();
        } else if (i7 == 1) {
            MediaController B = MediaController.B();
            if (B.f21292u0 != null) {
                B.T1 = true;
                if (u() && ((atomicInteger = f7945b) == null || atomicInteger.get() <= 0)) {
                    h e11 = e();
                    if (e11 == null) {
                        a10 = -1;
                    } else {
                        a10 = e11.a();
                    }
                    long D = B.D(B.f21292u0);
                    if (D >= 0 && a10 >= 0 && Math.abs(D - a10) > 1000) {
                        ij ijVar = B.f21292u0;
                        if ((B.f21268i0 != null || B.E0 != null) && ijVar != null && B.L(ijVar)) {
                            try {
                                t51 t51Var = B.f21268i0;
                                if (t51Var != null) {
                                    j3 = t51Var.U();
                                    if (j3 != -9223372036854775807L) {
                                        ijVar.f23204b0 = Utilities.l(((float) a10) / ((float) j3));
                                    }
                                    B.f21268i0.q0(a10, false);
                                    if (!B.T1) {
                                        v(a10);
                                    }
                                } else {
                                    t51 t51Var2 = B.E0;
                                    if (t51Var2 != null) {
                                        j3 = t51Var2.U();
                                        B.E0.p0(a10);
                                        if (!B.T1) {
                                            v(a10);
                                        }
                                    } else {
                                        j3 = 1;
                                    }
                                }
                                if (j3 != 0) {
                                    qs.f(ijVar.I1).k(qs.f25007i2, Integer.valueOf(ijVar.f1()), Float.valueOf(Utilities.l(((float) a10) / ((float) j3))));
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                        }
                    }
                    h e13 = e();
                    if (e13 == null) {
                        m10 = false;
                    } else if (f7944a == 0) {
                        m10 = !e13.l();
                    } else {
                        m10 = e13.m();
                    }
                    if (m10) {
                        B.S(B.f21292u0);
                    } else {
                        B.R(B.f21292u0, true);
                    }
                    h e14 = e();
                    float f10 = 1.0f;
                    if (e14 != null && (e10 = e14.e()) != null) {
                        f10 = (float) e10.d;
                    }
                    B.m0(true, f10);
                }
                B.n0();
                B.T1 = false;
            }
        }
    }

    public static void D(long j3) {
        long a10;
        if (j3 >= 0) {
            h e10 = e();
            if (e10 == null) {
                a10 = -1;
            } else {
                a10 = e10.a();
            }
            if (a10 != -1 && Math.abs(a10 - j3) <= 1500) {
                return;
            }
            v(j3);
        }
    }

    public static Person E(j0 j0Var) {
        Person.Builder name = new Person.Builder().setName(j0Var.f10077a);
        IconCompat iconCompat = j0Var.f10078b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = iconCompat.m(null);
        }
        return name.setIcon(icon).setUri(j0Var.f10079c).setKey(j0Var.d).setBot(j0Var.f10080e).setImportant(j0Var.f10081f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i7) {
        g6.a c10;
        f7944a = i7;
        if (!f7946c) {
            try {
                if (f() == null || (c10 = g6.a.c(f())) == null) {
                    return;
                }
                c10.b().a(new b7.l(i7));
                f7946c = true;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z9) {
        boolean z10;
        Context f10;
        AudioManager audioManager;
        f2 f2Var = f7947e;
        if (f2Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9) {
            if (z9) {
                Context f11 = f();
                if (f11 != null && (audioManager = (AudioManager) f11.getSystemService("audio")) != null) {
                    d = audioManager.getStreamVolume(3);
                    ContentResolver contentResolver = f11.getContentResolver();
                    Uri uri = Settings.System.CONTENT_URI;
                    f2 f2Var2 = new f2(new Handler(), 3);
                    f7947e = f2Var2;
                    contentResolver.registerContentObserver(uri, true, f2Var2);
                    A(g());
                    audioManager.adjustStreamVolume(3, 0, 1);
                }
            } else if (f2Var != null && (f10 = f()) != null) {
                f10.getContentResolver().unregisterContentObserver(f7947e);
                f7947e = null;
                AudioManager audioManager2 = (AudioManager) f10.getSystemService("audio");
                if (audioManager2 != null) {
                    audioManager2.setStreamVolume(3, d, 0);
                    C();
                }
            }
        }
    }

    public static h e() {
        g6.c c10;
        if (f() != null) {
            try {
                g6.a c11 = g6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null && c10.b()) {
                    m.d("Must be called from the main thread.");
                    return c10.f13549j;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return t0.f25563b;
        }
        return launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        int i7;
        Context f10 = f();
        if (f10 == null || (audioManager = (AudioManager) f10.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i7 = audioManager.getStreamMinVolume(3);
        } else {
            i7 = 0;
        }
        return Utilities.l((streamVolume - i7) / (streamMaxVolume - i7));
    }

    public static String[] h(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static int i(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String j(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params p(a1 a1Var) {
        return a1Var.getTextMetricsParams();
    }

    public static int q(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri r(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static final long s(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static ClassLoader t() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean u() {
        g6.c c10;
        if (f() != null) {
            try {
                g6.a c11 = g6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null) {
                    if (!c10.c()) {
                        if (c10.b()) {
                        }
                    }
                    return true;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return false;
            }
        }
        return false;
    }

    public static void v(long j3) {
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f7945b == null) {
            f7945b = new AtomicInteger(0);
        }
        f7945b.incrementAndGet();
        e10.q(new p(j3)).b(new t9(3));
    }

    public static void w(TextView textView, int i7) {
        textView.setFirstBaselineToTopHeight(i7);
    }

    public static void x(boolean z9) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        h e10 = e();
        if (e10 != null && z9 != e10.m()) {
            if (f7945b == null) {
                f7945b = new AtomicInteger(0);
            }
            f7945b.incrementAndGet();
            if (z9) {
                m.d("Must be called from the main thread.");
                if (!e10.w()) {
                    basePendingResult2 = h.t();
                } else {
                    i iVar = new i(e10, 6);
                    h.x(iVar);
                    basePendingResult2 = iVar;
                }
                basePendingResult2.b(new t9(0));
                return;
            }
            m.d("Must be called from the main thread.");
            if (!e10.w()) {
                basePendingResult = h.t();
            } else {
                i iVar2 = new i(e10, 5);
                h.x(iVar2);
                basePendingResult = iVar2;
            }
            basePendingResult.b(new t9(1));
        }
    }

    public static void y(Notification.Action.Builder builder, int i7) {
        builder.setSemanticAction(i7);
    }

    public static void z(float f10) {
        BasePendingResult basePendingResult;
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f7945b == null) {
            f7945b = new AtomicInteger(0);
        }
        f7945b.incrementAndGet();
        double d2 = f10;
        m.d("Must be called from the main thread.");
        if (!e10.w()) {
            basePendingResult = h.t();
        } else {
            l lVar = new l(e10, d2, 1);
            h.x(lVar);
            basePendingResult = lVar;
        }
        basePendingResult.b(new t9(4));
    }
}
