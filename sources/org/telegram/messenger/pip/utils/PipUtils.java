package org.telegram.messenger.pip.utils;

import android.app.PictureInPictureParams;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import android.view.WindowManager;
import com.google.zxing.BinaryBitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline1;
import org.telegram.messenger.pip.PipSource;
import org.telegram.ui.LaunchActivity;

public abstract class PipUtils {
    public static final int[] tmpCords = new int[2];

    public static void applyPictureInPictureParams(LaunchActivity launchActivity, PipSource pipSource) {
        int i;
        Rational rational;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            if (pipSource == null) {
                AndroidUtilities.resetPictureInPictureParams(launchActivity);
                return;
            }
            BinaryBitmap binaryBitmap = pipSource.params;
            binaryBitmap.getClass();
            PictureInPictureParams.Builder builderM = AndroidUtilities$$ExternalSyntheticApiModelOutline1.m();
            Point point = (Point) binaryBitmap.matrix;
            int i3 = point.x;
            if (i3 <= 0 || (i = point.y) <= 0) {
                builderM.setAspectRatio(null);
                if (i2 >= 33) {
                    builderM.setExpandedAspectRatio(null);
                }
            } else {
                double d = i3 / i;
                if (d < 0.45d) {
                    rational = new Rational(45, 100);
                } else {
                    rational = d > 2.35d ? new Rational(235, 100) : new Rational(point.x, point.y);
                }
                builderM.setAspectRatio(rational);
                if (i2 >= 33) {
                    builderM.setExpandedAspectRatio(rational);
                }
            }
            Rect rect = (Rect) binaryBitmap.binarizer;
            if (rect.isEmpty()) {
                builderM.setSourceRectHint(null);
            } else {
                builderM.setSourceRectHint(rect);
            }
            builderM.setActions(null);
            if (i2 >= 31) {
                builderM.setAutoEnterEnabled(i2 >= 31);
            }
            AndroidUtilities.setPictureInPictureParams(launchActivity, builderM.build());
        }
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

    public static WindowManager.LayoutParams createWindowLayoutParams(Context context, boolean z) {
        int i;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (z || !AndroidUtilities.checkInlinePermissions(context)) {
            i = 2;
        } else {
            i = Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
        }
        layoutParams.type = i;
        layoutParams.flags = 520;
        return layoutParams;
    }
}
