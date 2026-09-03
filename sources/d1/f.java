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
import b6.m;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.clearcut.g2;
import e0.o0;
import java.util.concurrent.atomic.AtomicInteger;
import m.a1;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.y9;
import q5.p;
import s5.h;
import s5.i;
import s5.l;
public abstract class f {
    public static int f4079a;
    public static AtomicInteger f4080b;
    public static boolean f4081c;
    public static int d;
    public static g2 e;

    public static void A(float f10) {
        BasePendingResult basePendingResult;
        h e6 = e();
        if (e6 == null) {
            return;
        }
        if (f4080b == null) {
            f4080b = new AtomicInteger(0);
        }
        f4080b.incrementAndGet();
        double d10 = f10;
        m.e("Must be called from the main thread.");
        if (!e6.w()) {
            basePendingResult = h.t();
        } else {
            l lVar = new l(e6, d10, 0);
            h.x(lVar);
            basePendingResult = lVar;
        }
        basePendingResult.b(new y9(2));
    }

    public static boolean B(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void C() {
        int i10 = f4079a;
        if (i10 == 0) {
            PhotoViewer.t1().i3();
        } else if (i10 == 1) {
            MediaController.getInstance().syncCastedPlayer();
        }
    }

    public static void D(long j10) {
        long a2;
        if (j10 >= 0) {
            h e6 = e();
            if (e6 == null) {
                a2 = -1;
            } else {
                a2 = e6.a();
            }
            if (a2 != -1 && Math.abs(a2 - j10) <= 1500) {
                return;
            }
            v(j10);
        }
    }

    public static Person E(o0 o0Var) {
        Person.Builder name = new Person.Builder().setName(o0Var.f5012a);
        IconCompat iconCompat = o0Var.f5013b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = iconCompat.m(null);
        }
        return name.setIcon(icon).setUri(o0Var.f5014c).setKey(o0Var.d).setBot(o0Var.e).setImportant(o0Var.f5015f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i10) {
        r5.a c3;
        f4079a = i10;
        if (!f4081c) {
            try {
                if (f() == null || (c3 = r5.a.c(f())) == null) {
                    return;
                }
                c3.b().a(new c5.c(i10));
                f4081c = true;
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z4) {
        boolean z10;
        Context f10;
        AudioManager audioManager;
        g2 g2Var = e;
        if (g2Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z4) {
            if (z4) {
                Context f11 = f();
                if (f11 != null && (audioManager = (AudioManager) f11.getSystemService("audio")) != null) {
                    d = audioManager.getStreamVolume(3);
                    ContentResolver contentResolver = f11.getContentResolver();
                    Uri uri = Settings.System.CONTENT_URI;
                    g2 g2Var2 = new g2(new Handler(), 1);
                    e = g2Var2;
                    contentResolver.registerContentObserver(uri, true, g2Var2);
                    A(g());
                    audioManager.adjustStreamVolume(3, 0, 1);
                }
            } else if (g2Var != null && (f10 = f()) != null) {
                f10.getContentResolver().unregisterContentObserver(e);
                e = null;
                AudioManager audioManager2 = (AudioManager) f10.getSystemService("audio");
                if (audioManager2 != null) {
                    audioManager2.setStreamVolume(3, d, 0);
                    C();
                }
            }
        }
    }

    public static h e() {
        r5.c c3;
        if (f() != null) {
            try {
                r5.a c10 = r5.a.c(f());
                if (c10 != null && (c3 = c10.b().c()) != null && c3.b()) {
                    m.e("Must be called from the main thread.");
                    return c3.f43383j;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return ApplicationLoader.applicationContext;
        }
        return launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        int i10;
        Context f10 = f();
        if (f10 == null || (audioManager = (AudioManager) f10.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = audioManager.getStreamMinVolume(3);
        } else {
            i10 = 0;
        }
        return Utilities.clamp01((streamVolume - i10) / (streamMaxVolume - i10));
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
        r5.c c3;
        if (f() != null) {
            try {
                r5.a c10 = r5.a.c(f());
                if (c10 != null && (c3 = c10.b().c()) != null) {
                    if (!c3.c()) {
                        if (c3.b()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                return false;
            }
        }
        return false;
    }

    public static void v(long j10) {
        h e6 = e();
        if (e6 == null) {
            return;
        }
        if (f4080b == null) {
            f4080b = new AtomicInteger(0);
        }
        f4080b.incrementAndGet();
        e6.q(new p(j10)).b(new y9(3));
    }

    public static void w(int i10, TextView textView) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void x(boolean z4) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        h e6 = e();
        if (e6 != null && z4 != e6.m()) {
            if (f4080b == null) {
                f4080b = new AtomicInteger(0);
            }
            f4080b.incrementAndGet();
            if (z4) {
                m.e("Must be called from the main thread.");
                if (!e6.w()) {
                    basePendingResult2 = h.t();
                } else {
                    i iVar = new i(e6, 6);
                    h.x(iVar);
                    basePendingResult2 = iVar;
                }
                basePendingResult2.b(new y9(0));
                return;
            }
            m.e("Must be called from the main thread.");
            if (!e6.w()) {
                basePendingResult = h.t();
            } else {
                i iVar2 = new i(e6, 5);
                h.x(iVar2);
                basePendingResult = iVar2;
            }
            basePendingResult.b(new y9(1));
        }
    }

    public static void y(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void z(float f10) {
        BasePendingResult basePendingResult;
        h e6 = e();
        if (e6 == null) {
            return;
        }
        if (f4080b == null) {
            f4080b = new AtomicInteger(0);
        }
        f4080b.incrementAndGet();
        double d10 = f10;
        m.e("Must be called from the main thread.");
        if (!e6.w()) {
            basePendingResult = h.t();
        } else {
            l lVar = new l(e6, d10, 1);
            h.x(lVar);
            basePendingResult = lVar;
        }
        basePendingResult.b(new y9(4));
    }
}
