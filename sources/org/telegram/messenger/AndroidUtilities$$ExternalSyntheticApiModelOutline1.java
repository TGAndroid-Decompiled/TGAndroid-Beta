package org.telegram.messenger;

import android.app.NotificationChannel;
import android.app.PictureInPictureParams;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.VibrationEffect;

public abstract class AndroidUtilities$$ExternalSyntheticApiModelOutline1 {
    public static NotificationChannel m$1(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static void m$1() {
    }

    public static NotificationChannel m(String str) {
        return new NotificationChannel("Assistant_verifier", str, 2);
    }

    public static PictureInPictureParams.Builder m() {
        return new PictureInPictureParams.Builder();
    }

    public static Typeface.Builder m(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static VibrationEffect m(Object obj) {
        return (VibrationEffect) obj;
    }

    public static void m166m() {
    }

    public static boolean m(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
