package f2;

import android.app.RemoteInput;
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
public abstract class i {
    public static AudioManager f10917a;

    public static void a(AudioManager audioManager, g gVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = gVar.f10913f;
            obj.getClass();
            audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
            return;
        }
        audioManager.abandonAudioFocus(gVar.f10910b);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean c(Context context) {
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
        for (int i7 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i7 == 1) {
                return true;
            }
        }
        return false;
    }

    public static synchronized AudioManager d(Context context) {
        synchronized (i.class) {
            synchronized (i.class) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    f10917a = null;
                }
                AudioManager audioManager = f10917a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    h2.i iVar = new h2.i();
                    h2.a.e().execute(new h(0, (Object) applicationContext, (Object) iVar));
                    iVar.b();
                    AudioManager audioManager2 = f10917a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                f10917a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            }
        }
    }

    public static int e(android.media.AudioManager r4, f2.g r5) {
        throw new UnsupportedOperationException("Method not decompiled: f2.i.e(android.media.AudioManager, f2.g):int");
    }

    public static void f(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void g(MenuItem menuItem, char c10, int i7) {
        menuItem.setAlphabeticShortcut(c10, i7);
    }

    public static void h(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void i(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void j(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void k(MenuItem menuItem, char c10, int i7) {
        menuItem.setNumericShortcut(c10, i7);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
