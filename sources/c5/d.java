package c5;

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
import e0.l0;
import java.util.concurrent.atomic.AtomicInteger;
import m.z0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z9;
public abstract class d {
    public static int f6139a;
    public static AtomicInteger f6140b;
    public static boolean f6141c;
    public static int d;
    public static e2 e;

    public static void A(float f7) {
        BasePendingResult basePendingResult;
        f6.h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f6140b == null) {
            f6140b = new AtomicInteger(0);
        }
        f6140b.incrementAndGet();
        double d10 = f7;
        o6.l.e("Must be called from the main thread.");
        if (!e10.w()) {
            basePendingResult = f6.h.t();
        } else {
            f6.m mVar = new f6.m(e10, d10, 0);
            f6.h.x(mVar);
            basePendingResult = mVar;
        }
        basePendingResult.b(new z9(2));
    }

    public static boolean B(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void C() {
        int i10 = f6139a;
        if (i10 == 0) {
            PhotoViewer.v1().l3();
        } else if (i10 == 1) {
            MediaController.getInstance().syncCastedPlayer();
        }
    }

    public static void D(long j10) {
        long a2;
        if (j10 >= 0) {
            f6.h e10 = e();
            if (e10 == null) {
                a2 = -1;
            } else {
                a2 = e10.a();
            }
            if (a2 != -1 && Math.abs(a2 - j10) <= 1500) {
                return;
            }
            v(j10);
        }
    }

    public static Person E(l0 l0Var) {
        Person.Builder name = new Person.Builder().setName(l0Var.f9564a);
        IconCompat iconCompat = l0Var.f9565b;
        Icon icon = null;
        if (iconCompat != null) {
            icon = iconCompat.m(null);
        }
        return name.setIcon(icon).setUri(l0Var.f9566c).setKey(l0Var.d).setBot(l0Var.e).setImportant(l0Var.f9567f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i10) {
        e6.a c10;
        f6139a = i10;
        if (!f6141c) {
            try {
                if (f() == null || (c10 = e6.a.c(f())) == null) {
                    return;
                }
                c10.b().a(new ag.j(i10));
                f6141c = true;
            } catch (Exception e10) {
                FileLog.e(e10);
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
        e2 e2Var = e;
        if (e2Var != null) {
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
                    e2 e2Var2 = new e2(new Handler(), 1);
                    e = e2Var2;
                    contentResolver.registerContentObserver(uri, true, e2Var2);
                    A(g());
                    audioManager.adjustStreamVolume(3, 0, 1);
                }
            } else if (e2Var != null && (f7 = f()) != null) {
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

    public static f6.h e() {
        e6.c c10;
        if (f() != null) {
            try {
                e6.a c11 = e6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null && c10.b()) {
                    o6.l.e("Must be called from the main thread.");
                    return c10.f9807j;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return ApplicationLoader.applicationContext;
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
        e6.c c10;
        if (f() != null) {
            try {
                e6.a c11 = e6.a.c(f());
                if (c11 != null && (c10 = c11.b().c()) != null) {
                    if (!c10.c()) {
                        if (c10.b()) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return false;
            }
        }
        return false;
    }

    public static void v(long j10) {
        f6.h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f6140b == null) {
            f6140b = new AtomicInteger(0);
        }
        f6140b.incrementAndGet();
        e10.q(new d6.p(j10)).b(new z9(3));
    }

    public static void w(int i10, TextView textView) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void x(boolean z10) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        f6.h e10 = e();
        if (e10 != null && z10 != e10.m()) {
            if (f6140b == null) {
                f6140b = new AtomicInteger(0);
            }
            f6140b.incrementAndGet();
            if (z10) {
                o6.l.e("Must be called from the main thread.");
                if (!e10.w()) {
                    basePendingResult2 = f6.h.t();
                } else {
                    f6.j jVar = new f6.j(e10, 6);
                    f6.h.x(jVar);
                    basePendingResult2 = jVar;
                }
                basePendingResult2.b(new z9(0));
                return;
            }
            o6.l.e("Must be called from the main thread.");
            if (!e10.w()) {
                basePendingResult = f6.h.t();
            } else {
                f6.j jVar2 = new f6.j(e10, 5);
                f6.h.x(jVar2);
                basePendingResult = jVar2;
            }
            basePendingResult.b(new z9(1));
        }
    }

    public static void y(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void z(float f7) {
        BasePendingResult basePendingResult;
        f6.h e10 = e();
        if (e10 == null) {
            return;
        }
        if (f6140b == null) {
            f6140b = new AtomicInteger(0);
        }
        f6140b.incrementAndGet();
        double d10 = f7;
        o6.l.e("Must be called from the main thread.");
        if (!e10.w()) {
            basePendingResult = f6.h.t();
        } else {
            f6.m mVar = new f6.m(e10, d10, 1);
            f6.h.x(mVar);
            basePendingResult = mVar;
        }
        basePendingResult.b(new z9(4));
    }
}
