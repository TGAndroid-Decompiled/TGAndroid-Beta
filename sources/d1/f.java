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
import com.google.android.gms.internal.clearcut.e2;
import e0.k0;
import e6.p;
import e6.q;
import g6.h;
import g6.i;
import g6.l;
import java.util.concurrent.atomic.AtomicInteger;
import m.z0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.t0;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.m51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.t9;
import p6.m;
public abstract class f {
    public static int f7999a;
    public static AtomicInteger f8000b;
    public static boolean f8001c;
    public static int d;
    public static e2 f8002e;

    public static void A(float f10) {
        BasePendingResult basePendingResult;
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f8000b == null) {
            f8000b = new AtomicInteger(0);
        }
        f8000b.incrementAndGet();
        double d10 = f10;
        m.d("Must be called from the main thread.");
        if (!e10.w()) {
            basePendingResult = h.t();
        } else {
            l lVar = new l(e10, d10, 0);
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
        long j10;
        int i3 = f7999a;
        if (i3 == 0) {
            PhotoViewer.v1().l3();
        } else if (i3 == 1) {
            MediaController B = MediaController.B();
            if (B.f21348v0 != null) {
                B.U1 = true;
                if (u() && ((atomicInteger = f8000b) == null || atomicInteger.get() <= 0)) {
                    h e11 = e();
                    if (e11 == null) {
                        a10 = -1;
                    } else {
                        a10 = e11.a();
                    }
                    long D = B.D(B.f21348v0);
                    if (D >= 0 && a10 >= 0 && Math.abs(D - a10) > 1000) {
                        zi ziVar = B.f21348v0;
                        if ((B.f21324j0 != null || B.F0 != null) && ziVar != null && B.L(ziVar)) {
                            try {
                                m51 m51Var = B.f21324j0;
                                if (m51Var != null) {
                                    j10 = m51Var.U();
                                    if (j10 != -9223372036854775807L) {
                                        ziVar.f26828b0 = Utilities.l(((float) a10) / ((float) j10));
                                    }
                                    B.f21324j0.q0(a10, false);
                                    if (!B.U1) {
                                        v(a10);
                                    }
                                } else {
                                    m51 m51Var2 = B.F0;
                                    if (m51Var2 != null) {
                                        j10 = m51Var2.U();
                                        B.F0.p0(a10);
                                        if (!B.U1) {
                                            v(a10);
                                        }
                                    } else {
                                        j10 = 1;
                                    }
                                }
                                if (j10 != 0) {
                                    hs.f(ziVar.I1).k(hs.f23245i2, Integer.valueOf(ziVar.f1()), Float.valueOf(Utilities.l(((float) a10) / ((float) j10))));
                                }
                            } catch (Exception e12) {
                                a8.g(e12, true);
                            }
                        }
                    }
                    h e13 = e();
                    if (e13 == null) {
                        m10 = false;
                    } else if (f7999a == 0) {
                        m10 = !e13.l();
                    } else {
                        m10 = e13.m();
                    }
                    if (m10) {
                        B.S(B.f21348v0);
                    } else {
                        B.R(B.f21348v0, true);
                    }
                    h e14 = e();
                    float f10 = 1.0f;
                    if (e14 != null && (e10 = e14.e()) != null) {
                        f10 = (float) e10.d;
                    }
                    B.m0(true, f10);
                }
                B.n0();
                B.U1 = false;
            }
        }
    }

    public static void D(long j10) {
        long a10;
        if (j10 >= 0) {
            h e10 = e();
            if (e10 == null) {
                a10 = -1;
            } else {
                a10 = e10.a();
            }
            if (a10 != -1 && Math.abs(a10 - j10) <= 1500) {
                return;
            }
            v(j10);
        }
    }

    public static Person E(k0 k0Var) {
        Person.Builder name = new Person.Builder().setName(k0Var.f9264a);
        IconCompat iconCompat = k0Var.f9265b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = iconCompat.m(null);
        }
        return name.setIcon(icon).setUri(k0Var.f9266c).setKey(k0Var.d).setBot(k0Var.f9267e).setImportant(k0Var.f9268f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i3) {
        f6.a c2;
        f7999a = i3;
        if (!f8001c) {
            try {
                if (f() == null || (c2 = f6.a.c(f())) == null) {
                    return;
                }
                c2.b().a(new a7.l(i3));
                f8001c = true;
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z10) {
        boolean z11;
        Context f10;
        AudioManager audioManager;
        e2 e2Var = f8002e;
        if (e2Var != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (z10) {
                Context f11 = f();
                if (f11 != null && (audioManager = (AudioManager) f11.getSystemService("audio")) != null) {
                    d = audioManager.getStreamVolume(3);
                    ContentResolver contentResolver = f11.getContentResolver();
                    Uri uri = Settings.System.CONTENT_URI;
                    e2 e2Var2 = new e2(new Handler(), 3);
                    f8002e = e2Var2;
                    contentResolver.registerContentObserver(uri, true, e2Var2);
                    A(g());
                    audioManager.adjustStreamVolume(3, 0, 1);
                }
            } else if (e2Var != null && (f10 = f()) != null) {
                f10.getContentResolver().unregisterContentObserver(f8002e);
                f8002e = null;
                AudioManager audioManager2 = (AudioManager) f10.getSystemService("audio");
                if (audioManager2 != null) {
                    audioManager2.setStreamVolume(3, d, 0);
                    C();
                }
            }
        }
    }

    public static h e() {
        f6.c c2;
        if (f() != null) {
            try {
                f6.a c10 = f6.a.c(f());
                if (c10 != null && (c2 = c10.b().c()) != null && c2.b()) {
                    m.d("Must be called from the main thread.");
                    return c2.f11473j;
                }
            } catch (Exception e10) {
                a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null) {
            return t0.f25457b;
        }
        return launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        int i3;
        Context f10 = f();
        if (f10 == null || (audioManager = (AudioManager) f10.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i3 = audioManager.getStreamMinVolume(3);
        } else {
            i3 = 0;
        }
        return Utilities.l((streamVolume - i3) / (streamMaxVolume - i3));
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
        f6.c c2;
        if (f() != null) {
            try {
                f6.a c10 = f6.a.c(f());
                if (c10 != null && (c2 = c10.b().c()) != null) {
                    if (!c2.c()) {
                        if (c2.b()) {
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

    public static void v(long j10) {
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f8000b == null) {
            f8000b = new AtomicInteger(0);
        }
        f8000b.incrementAndGet();
        e10.q(new p(j10)).b(new t9(3));
    }

    public static void w(TextView textView, int i3) {
        textView.setFirstBaselineToTopHeight(i3);
    }

    public static void x(boolean z10) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        h e10 = e();
        if (e10 != null && z10 != e10.m()) {
            if (f8000b == null) {
                f8000b = new AtomicInteger(0);
            }
            f8000b.incrementAndGet();
            if (z10) {
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

    public static void y(Notification.Action.Builder builder, int i3) {
        builder.setSemanticAction(i3);
    }

    public static void z(float f10) {
        BasePendingResult basePendingResult;
        h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f8000b == null) {
            f8000b = new AtomicInteger(0);
        }
        f8000b.incrementAndGet();
        double d10 = f10;
        m.d("Must be called from the main thread.");
        if (!e10.w()) {
            basePendingResult = h.t();
        } else {
            l lVar = new l(e10, d10, 1);
            h.x(lVar);
            basePendingResult = lVar;
        }
        basePendingResult.b(new t9(4));
    }
}
