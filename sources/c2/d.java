package c2;

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
import bi.s8;
public abstract class d {
    public static AudioManager f4175a;

    public static void a(AudioManager audioManager, c cVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = cVar.f4174f;
            obj.getClass();
            audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
            return;
        }
        audioManager.abandonAudioFocus(cVar.f4171b);
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean d(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null && display.isHdr()) {
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (d.class) {
            synchronized (d.class) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f4175a = null;
                }
                AudioManager audioManager = f4175a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    e2.g gVar = new e2.g();
                    e2.a.g().execute(new s8(16, applicationContext, gVar));
                    gVar.b();
                    AudioManager audioManager2 = f4175a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f4175a = audioManager3;
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

    public static int h(AudioManager audioManager, c cVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = cVar.f4174f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = cVar.f4171b;
        b2.e eVar = cVar.d;
        int i10 = 1;
        if ((eVar.f2032b & 1) != 1) {
            switch (eVar.f2033c) {
                case 2:
                    i10 = 0;
                    break;
                case 3:
                    i10 = 8;
                    break;
                case 4:
                    i10 = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i10 = 5;
                    break;
                case 6:
                    i10 = 2;
                    break;
                case 11:
                    i10 = 10;
                    break;
                case 12:
                default:
                    i10 = 3;
                    break;
                case 13:
                    break;
            }
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, i10, cVar.f4170a);
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
