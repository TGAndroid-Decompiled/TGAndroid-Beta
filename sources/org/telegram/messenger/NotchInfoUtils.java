package org.telegram.messenger;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;

public class NotchInfoUtils {
    private static final String BOTTOM_MARKER = "@bottom";
    private static final String DP_MARKER = "@dp";
    private static final String LEFT_MARKER = "@left";
    private static final String RIGHT_MARKER = "@right";

    public static final class NotchInfo {
        public RectF bounds;
        public int gravity;
        public boolean isAccurate;
        public boolean isLikelyCircle;
        public Path path;
        public String rawPath;
    }

    public static NotchInfo getInfo(Context context) {
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        NotchInfo notchInfo = new NotchInfo();
        int identifier = context.getResources().getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
        if (identifier != 0) {
            String string = context.getString(identifier);
            if (string.isEmpty()) {
                return null;
            }
            String strTrim = string.trim();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i11 = displayMetrics.widthPixels;
            float f11 = displayMetrics.density;
            if (strTrim.endsWith("@right")) {
                f10 = i11;
                strTrim = strTrim.substring(0, strTrim.length() - 6).trim();
                i10 = 5;
            } else if (strTrim.endsWith("@left")) {
                strTrim = strTrim.substring(0, strTrim.length() - 5).trim();
                f10 = 0.0f;
                i10 = 3;
            } else {
                f10 = i11 / 2.0f;
                i10 = 17;
            }
            boolean zEndsWith = strTrim.endsWith("@dp");
            if (zEndsWith) {
                strTrim = com.google.android.recaptcha.internal.a.n(strTrim, 3, 0);
            }
            if (strTrim.contains("@bottom")) {
                strTrim = strTrim.split("@bottom", 2)[0].trim();
            }
            try {
                i0.e[] eVarArrC = g7.w7.c(strTrim);
                Path path = new Path();
                i0.e.b(eVarArrC, path);
                Matrix matrix = new Matrix();
                if (zEndsWith) {
                    matrix.postScale(f11, f11);
                }
                matrix.postTranslate(f10, 0.0f);
                path.transform(matrix);
                notchInfo.path = path;
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                notchInfo.bounds = rectF;
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (i10 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= AndroidUtilities.dp(2.0f)) {
                    i10 = 17;
                }
                int i12 = (i10 != 17 || rectF.left >= ((float) displayMetrics2.widthPixels) / 4.0f) ? i10 : 3;
                notchInfo.gravity = (i12 != 17 || rectF.right <= (((float) displayMetrics2.widthPixels) / 4.0f) * 3.0f) ? i12 : 5;
                notchInfo.rawPath = strTrim;
                notchInfo.isAccurate = strTrim.contains("C") || strTrim.contains("S") || strTrim.contains("Q");
                notchInfo.isLikelyCircle = rectF.width() <= ((float) AndroidUtilities.dp(32.0f)) || rectF.width() <= rectF.height();
                return notchInfo;
            } catch (Throwable th) {
                FileLog.e("Failed to parse notch info", th);
            }
        }
        return null;
    }
}
