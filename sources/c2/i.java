package c2;

import ai.pa;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.Display;
import android.view.ViewConfiguration;
public abstract class i {
    public static AudioManager f4511a;

    public static void a(AudioManager audioManager, h hVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = hVar.f4510f;
            obj.getClass();
            audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
            return;
        }
        audioManager.abandonAudioFocus(hVar.f4508b);
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
        for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (i.class) {
            synchronized (i.class) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f4511a = null;
                }
                AudioManager audioManager = f4511a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    e2.i iVar = new e2.i();
                    e2.a.e().execute(new pa(8, applicationContext, iVar));
                    iVar.b();
                    AudioManager audioManager2 = f4511a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f4511a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            }
        }
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static int h(android.media.AudioManager r4, c2.h r5) {
        throw new UnsupportedOperationException("Method not decompiled: c2.i.h(android.media.AudioManager, c2.h):int");
    }

    public static void i(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void j(Notification.Builder builder, int i10) {
        builder.setGroupAlertBehavior(i10);
    }

    public static void k(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void l(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void m(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
