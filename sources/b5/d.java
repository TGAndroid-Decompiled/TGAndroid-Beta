package b5;

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
import c6.q;
import com.google.android.gms.internal.clearcut.g2;
import e0.l0;
import java.util.concurrent.atomic.AtomicInteger;
import m.z0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.w0;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.v9;
import v7.h5;
public abstract class d {
    public static int f2488a;
    public static AtomicInteger f2489b;
    public static boolean f2490c;
    public static int d;
    public static g2 e;

    public static void A(float f7) {
        h5 h5Var;
        e6.h e7 = e();
        if (e7 == null) {
            return;
        }
        if (f2489b == null) {
            f2489b = new AtomicInteger(0);
        }
        f2489b.incrementAndGet();
        double d10 = f7;
        n6.l.d("Must be called from the main thread.");
        if (!e7.w()) {
            h5Var = e6.h.t();
        } else {
            e6.l lVar = new e6.l(e7, d10, 0);
            e6.h.x(lVar);
            h5Var = lVar;
        }
        h5Var.b(new v9(2));
    }

    public static boolean B(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void C() {
        AtomicInteger atomicInteger;
        long a2;
        boolean m10;
        q e7;
        long j10;
        int i10 = f2488a;
        if (i10 == 0) {
            PhotoViewer.v1().l3();
        } else if (i10 == 1) {
            MediaController B = MediaController.B();
            if (B.f14482u0 != null) {
                B.S1 = true;
                if (u() && ((atomicInteger = f2489b) == null || atomicInteger.get() <= 0)) {
                    e6.h e10 = e();
                    if (e10 == null) {
                        a2 = -1;
                    } else {
                        a2 = e10.a();
                    }
                    long D = B.D(B.f14482u0);
                    if (D >= 0 && a2 >= 0 && Math.abs(D - a2) > 1000) {
                        jj jjVar = B.f14482u0;
                        if ((B.f14457i0 != null || B.E0 != null) && jjVar != null && B.L(jjVar)) {
                            try {
                                u61 u61Var = B.f14457i0;
                                if (u61Var != null) {
                                    j10 = u61Var.U();
                                    if (j10 != -9223372036854775807L) {
                                        jjVar.f16299b0 = Utilities.l(((float) a2) / ((float) j10));
                                    }
                                    B.f14457i0.q0(a2, false);
                                    if (!B.S1) {
                                        v(a2);
                                    }
                                } else {
                                    u61 u61Var2 = B.E0;
                                    if (u61Var2 != null) {
                                        j10 = u61Var2.U();
                                        B.E0.p0(a2);
                                        if (!B.S1) {
                                            v(a2);
                                        }
                                    } else {
                                        j10 = 1;
                                    }
                                }
                                if (j10 != 0) {
                                    zs.f(jjVar.I1).k(zs.f19628i2, Integer.valueOf(jjVar.f1()), Float.valueOf(Utilities.l(((float) a2) / ((float) j10))));
                                }
                            } catch (Exception e11) {
                                f8.g(e11, true);
                            }
                        }
                    }
                    e6.h e12 = e();
                    if (e12 == null) {
                        m10 = false;
                    } else if (f2488a == 0) {
                        m10 = !e12.l();
                    } else {
                        m10 = e12.m();
                    }
                    if (m10) {
                        B.S(B.f14482u0);
                    } else {
                        B.R(B.f14482u0, true);
                    }
                    e6.h e13 = e();
                    float f7 = 1.0f;
                    if (e13 != null && (e7 = e13.e()) != null) {
                        f7 = (float) e7.d;
                    }
                    B.m0(true, f7);
                }
                B.n0();
                B.S1 = false;
            }
        }
    }

    public static void D(long j10) {
        long a2;
        if (j10 >= 0) {
            e6.h e7 = e();
            if (e7 == null) {
                a2 = -1;
            } else {
                a2 = e7.a();
            }
            if (a2 != -1 && Math.abs(a2 - j10) <= 1500) {
                return;
            }
            v(j10);
        }
    }

    public static Person E(l0 l0Var) {
        Person.Builder name = new Person.Builder().setName(l0Var.f6045a);
        IconCompat iconCompat = l0Var.f6046b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = iconCompat.m(null);
        }
        return name.setIcon(icon).setUri(l0Var.f6047c).setKey(l0Var.d).setBot(l0Var.e).setImportant(l0Var.f6048f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i10) {
        d6.a c10;
        f2488a = i10;
        if (!f2490c) {
            try {
                if (f() == null || (c10 = d6.a.c(f())) == null) {
                    return;
                }
                c10.b().a(new ae.j(i10));
                f2490c = true;
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z10) {
        boolean z11;
        Context f7;
        AudioManager audioManager;
        g2 g2Var = e;
        if (g2Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (z10) {
                Context f10 = f();
                if (f10 != null && (audioManager = (AudioManager) f10.getSystemService("audio")) != null) {
                    d = audioManager.getStreamVolume(3);
                    ContentResolver contentResolver = f10.getContentResolver();
                    Uri uri = Settings.System.CONTENT_URI;
                    g2 g2Var2 = new g2(new Handler(), 3);
                    e = g2Var2;
                    contentResolver.registerContentObserver(uri, true, g2Var2);
                    A(g());
                    audioManager.adjustStreamVolume(3, 0, 1);
                }
            } else if (g2Var != null && (f7 = f()) != null) {
                f7.getContentResolver().unregisterContentObserver(e);
                e = null;
                AudioManager audioManager2 = (AudioManager) f7.getSystemService("audio");
                if (audioManager2 != null) {
                    audioManager2.setStreamVolume(3, d, 0);
                    C();
                }
            }
        }
    }

    public static e6.h e() {
        d6.c c10;
        if (f() != null) {
            try {
                d6.a c11 = d6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null && c10.b()) {
                    n6.l.d("Must be called from the main thread.");
                    return c10.f5768j;
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return w0.f19025b;
        }
        return launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        int i10;
        Context f7 = f();
        if (f7 == null || (audioManager = (AudioManager) f7.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = audioManager.getStreamMinVolume(3);
        } else {
            i10 = 0;
        }
        return Utilities.l((streamVolume - i10) / (streamMaxVolume - i10));
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

    public static PrecomputedText.Params p(z0 z0Var) {
        return z0Var.getTextMetricsParams();
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
        d6.c c10;
        if (f() != null) {
            try {
                d6.a c11 = d6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null) {
                    if (!c10.c()) {
                        if (c10.b()) {
                        }
                    }
                    return true;
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                return false;
            }
        }
        return false;
    }

    public static void v(long j10) {
        e6.h e7 = e();
        if (e7 == null) {
            return;
        }
        if (f2489b == null) {
            f2489b = new AtomicInteger(0);
        }
        f2489b.incrementAndGet();
        e7.q(new c6.p(j10)).b(new v9(3));
    }

    public static void w(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void x(boolean z10) {
        h5 h5Var;
        h5 h5Var2;
        e6.h e7 = e();
        if (e7 != null && z10 != e7.m()) {
            if (f2489b == null) {
                f2489b = new AtomicInteger(0);
            }
            f2489b.incrementAndGet();
            if (z10) {
                n6.l.d("Must be called from the main thread.");
                if (!e7.w()) {
                    h5Var2 = e6.h.t();
                } else {
                    e6.i iVar = new e6.i(e7, 6);
                    e6.h.x(iVar);
                    h5Var2 = iVar;
                }
                h5Var2.b(new v9(0));
                return;
            }
            n6.l.d("Must be called from the main thread.");
            if (!e7.w()) {
                h5Var = e6.h.t();
            } else {
                e6.i iVar2 = new e6.i(e7, 5);
                e6.h.x(iVar2);
                h5Var = iVar2;
            }
            h5Var.b(new v9(1));
        }
    }

    public static void y(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void z(float f7) {
        h5 h5Var;
        e6.h e7 = e();
        if (e7 == null) {
            return;
        }
        if (f2489b == null) {
            f2489b = new AtomicInteger(0);
        }
        f2489b.incrementAndGet();
        double d10 = f7;
        n6.l.d("Must be called from the main thread.");
        if (!e7.w()) {
            h5Var = e6.h.t();
        } else {
            e6.l lVar = new e6.l(e7, d10, 1);
            e6.h.x(lVar);
            h5Var = lVar;
        }
        h5Var.b(new v9(4));
    }
}
