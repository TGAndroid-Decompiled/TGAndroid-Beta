package org.telegram.messenger.pip.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.pip.PipSource;

public abstract class PipUtils {
    private static final int[] tmpCords = new int[2];

    public static WindowManager.LayoutParams createWindowLayoutParams(Context context, boolean z) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        layoutParams.type = getWindowLayoutParamsType(context, z);
        layoutParams.flags = 520;
        return layoutParams;
    }

    public static int getWindowLayoutParamsType(Context context, boolean z) {
        if (z || !AndroidUtilities.checkInlinePermissions(context)) {
            return 2;
        }
        return Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
    }

    public static int checkPermissions(Context context) {
        if (AndroidUtilities.checkInlinePermissions(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return AndroidUtilities.checkPipPermissions(context) ? 1 : -2;
        }
        return -1;
    }

    public static boolean checkAnyPipPermissions(Context context) {
        return checkPermissions(context) > 0;
    }

    public static boolean useAutoEnterInPictureInPictureMode() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static void applyPictureInPictureParams(Activity activity, PipSource pipSource) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (pipSource != null) {
                AndroidUtilities.setPictureInPictureParams(activity, pipSource.buildPictureInPictureParams());
            } else {
                AndroidUtilities.resetPictureInPictureParams(activity);
            }
        }
    }

    public static void getPipSourceRectHintPosition(Activity activity, View view, Rect rect) {
        int[] iArr = tmpCords;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        View decorView = activity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int width = view.getWidth() + i3;
        int height = view.getHeight() + i4;
        int i5 = iArr[0];
        int iClamp = MathUtils.clamp(i3, i5, decorView.getWidth() + i5);
        int i6 = iArr[1];
        int iClamp2 = MathUtils.clamp(i4, i6, decorView.getHeight() + i6);
        int i7 = iArr[0];
        int iClamp3 = MathUtils.clamp(width, i7, decorView.getWidth() + i7);
        int i8 = iArr[1];
        rect.set(iClamp, iClamp2, iClamp3, MathUtils.clamp(height, i8, decorView.getHeight() + i8));
    }
}
