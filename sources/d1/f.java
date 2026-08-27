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
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.clearcut.h2;
import e0.p0;
import g7.f5;
import java.util.concurrent.atomic.AtomicInteger;
import m.a1;
import m5.q;
import o5.h;
import o5.i;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.u9;
import y5.l;

public abstract class f {

    public static int f4695a;

    public static AtomicInteger f4696b;

    public static boolean f4697c;
    public static int d;

    public static h2 f4698e;

    public static boolean A(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void B() {
        int i10 = f4695a;
        if (i10 == 0) {
            PhotoViewer.t1().i3();
        } else if (i10 == 1) {
            MediaController.getInstance().syncCastedPlayer();
        }
    }

    public static void C(long j10) {
        if (j10 < 0) {
            return;
        }
        h hVarE = e();
        long jA = hVarE == null ? -1L : hVarE.a();
        if (jA == -1 || Math.abs(jA - j10) > 1500) {
            u(j10);
        }
    }

    public static Person D(p0 p0Var) {
        Person.Builder name = new Person.Builder().setName(p0Var.f5106a);
        IconCompat iconCompat = p0Var.f5107b;
        return name.setIcon(iconCompat != null ? iconCompat.m(null) : null).setUri(p0Var.f5108c).setKey(p0Var.d).setBot(p0Var.f5109e).setImportant(p0Var.f5110f).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(int i10) {
        n5.a aVarC;
        f4695a = i10;
        if (f4697c) {
            return;
        }
        try {
            if (f() == null || (aVarC = n5.a.c(f())) == null) {
                return;
            }
            aVarC.b().a(new com.google.android.gms.internal.cast.a(i10));
            f4697c = true;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void d(boolean z10) {
        Context contextF;
        AudioManager audioManager;
        h2 h2Var = f4698e;
        if ((h2Var != null) != z10) {
            if (!z10) {
                if (h2Var == null || (contextF = f()) == null) {
                    return;
                }
                contextF.getContentResolver().unregisterContentObserver(f4698e);
                f4698e = null;
                AudioManager audioManager2 = (AudioManager) contextF.getSystemService("audio");
                if (audioManager2 == null) {
                    return;
                }
                audioManager2.setStreamVolume(3, d, 0);
                B();
                return;
            }
            Context contextF2 = f();
            if (contextF2 == null || (audioManager = (AudioManager) contextF2.getSystemService("audio")) == null) {
                return;
            }
            d = audioManager.getStreamVolume(3);
            ContentResolver contentResolver = contextF2.getContentResolver();
            Uri uri = Settings.System.CONTENT_URI;
            h2 h2Var2 = new h2(new Handler(), 1);
            f4698e = h2Var2;
            contentResolver.registerContentObserver(uri, true, h2Var2);
            z(g());
            audioManager.adjustStreamVolume(3, 0, 1);
        }
    }

    public static h e() {
        n5.c cVarC;
        if (f() != null) {
            try {
                n5.a aVarC = n5.a.c(f());
                if (aVarC != null && (cVarC = aVarC.b().c()) != null && cVarC.b()) {
                    l.e("Must be called from the main thread.");
                    return cVarC.f18308j;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }
        return null;
    }

    public static Context f() {
        LaunchActivity launchActivity = LaunchActivity.C1;
        return launchActivity == null ? ApplicationLoader.applicationContext : launchActivity;
    }

    public static float g() {
        AudioManager audioManager;
        Context contextF = f();
        if (contextF == null || (audioManager = (AudioManager) contextF.getSystemService("audio")) == null) {
            return 0.0f;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        return Utilities.clamp01((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume));
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

    public static boolean t() {
        n5.c cVarC;
        if (f() != null) {
            try {
                n5.a aVarC = n5.a.c(f());
                if (aVarC != null && (cVarC = aVarC.b().c()) != null && (cVarC.c() || cVarC.b())) {
                    return true;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return false;
            }
        }
        return false;
    }

    public static void u(long j10) {
        h hVarE = e();
        if (hVarE == null) {
            return;
        }
        if (f4696b == null) {
            f4696b = new AtomicInteger(0);
        }
        f4696b.incrementAndGet();
        hVarE.q(new q(j10)).b(new u9(3));
    }

    public static void v(int i10, TextView textView) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static void w(boolean z10) {
        f5 f5VarT;
        f5 f5VarT2;
        h hVarE = e();
        if (hVarE == null || z10 == hVarE.m()) {
            return;
        }
        if (f4696b == null) {
            f4696b = new AtomicInteger(0);
        }
        f4696b.incrementAndGet();
        if (z10) {
            l.e("Must be called from the main thread.");
            if (hVarE.w()) {
                i iVar = new i(hVarE, 6);
                h.x(iVar);
                f5VarT2 = iVar;
            } else {
                f5VarT2 = h.t();
            }
            f5VarT2.b(new u9(0));
            return;
        }
        l.e("Must be called from the main thread.");
        if (hVarE.w()) {
            i iVar2 = new i(hVarE, 5);
            h.x(iVar2);
            f5VarT = iVar2;
        } else {
            f5VarT = h.t();
        }
        f5VarT.b(new u9(1));
    }

    public static void x(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void y(float f10) {
        f5 f5VarT;
        h hVarE = e();
        if (hVarE == null) {
            return;
        }
        if (f4696b == null) {
            f4696b = new AtomicInteger(0);
        }
        f4696b.incrementAndGet();
        double d10 = f10;
        l.e("Must be called from the main thread.");
        if (hVarE.w()) {
            o5.l lVar = new o5.l(hVarE, d10, 1);
            h.x(lVar);
            f5VarT = lVar;
        } else {
            f5VarT = h.t();
        }
        f5VarT.b(new u9(4));
    }

    public static void z(float f10) {
        f5 f5VarT;
        h hVarE = e();
        if (hVarE == null) {
            return;
        }
        if (f4696b == null) {
            f4696b = new AtomicInteger(0);
        }
        f4696b.incrementAndGet();
        double d10 = f10;
        l.e("Must be called from the main thread.");
        if (hVarE.w()) {
            o5.l lVar = new o5.l(hVarE, d10, 0);
            h.x(lVar);
            f5VarT = lVar;
        } else {
            f5VarT = h.t();
        }
        f5VarT.b(new u9(2));
    }
}
