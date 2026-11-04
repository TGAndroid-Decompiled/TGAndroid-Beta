package e2;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.MenuItem;
import ci.e0;
public abstract class h {
    public static AudioManager f9348a;

    public static void a(AudioManager audioManager, g gVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = gVar.f9347f;
            obj.getClass();
            audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
            return;
        }
        audioManager.abandonAudioFocus(gVar.f9344b);
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean d(Context context) {
        Display display;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i3 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i3 == 1) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (h.class) {
            synchronized (h.class) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f9348a = null;
                }
                AudioManager audioManager = f9348a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    g2.j jVar = new g2.j();
                    g2.a.e().execute(new e0(29, applicationContext, jVar));
                    jVar.b();
                    AudioManager audioManager2 = f9348a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f9348a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            }
        }
    }

    public static int f(android.media.AudioManager r4, e2.g r5) {
        throw new UnsupportedOperationException("Method not decompiled: e2.h.f(android.media.AudioManager, e2.g):int");
    }

    public static void g(MenuItem menuItem, char c2, int i3) {
        menuItem.setAlphabeticShortcut(c2, i3);
    }

    public static void h(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void j(Notification.Builder builder, int i3) {
        builder.setGroupAlertBehavior(i3);
    }

    public static void k(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void l(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void m(MenuItem menuItem, char c2, int i3) {
        menuItem.setNumericShortcut(c2, i3);
    }

    public static void n(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void o(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void p(Notification.Builder builder, long j10) {
        builder.setTimeoutAfter(j10);
    }

    public static void q(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
