package me.vkryl.android;

import android.view.View;

public abstract class ViewUtils {
    public static void onClick(View view) {
        if (view != null) {
            view.playSoundEffect(0);
        }
    }

    public static void hapticVibrate(View view, boolean z, boolean z2) {
        if (view != null) {
            view.performHapticFeedback(z ? 0 : 3, z2 ? 2 : 0);
        }
    }
}
