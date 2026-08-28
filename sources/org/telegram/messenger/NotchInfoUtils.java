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
        int i9;
        boolean z10;
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
            String trim = string.trim();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i10 = displayMetrics.widthPixels;
            float f11 = displayMetrics.density;
            int i11 = 3;
            int i12 = 5;
            boolean z11 = false;
            if (trim.endsWith("@right")) {
                f10 = i10;
                trim = trim.substring(0, trim.length() - 6).trim();
                i9 = 5;
            } else if (trim.endsWith("@left")) {
                trim = trim.substring(0, trim.length() - 5).trim();
                f10 = 0.0f;
                i9 = 3;
            } else {
                f10 = i10 / 2.0f;
                i9 = 17;
            }
            boolean endsWith = trim.endsWith("@dp");
            if (endsWith) {
                trim = e2.c.m(trim, 3, 0);
            }
            if (trim.contains("@bottom")) {
                trim = trim.split("@bottom", 2)[0].trim();
            }
            try {
                i0.d[] c10 = f7.i8.c(trim);
                Path path = new Path();
                i0.d.b(c10, path);
                Matrix matrix = new Matrix();
                if (endsWith) {
                    matrix.postScale(f11, f11);
                }
                matrix.postTranslate(f10, 0.0f);
                path.transform(matrix);
                notchInfo.path = path;
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                notchInfo.bounds = rectF;
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (i9 != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= AndroidUtilities.dp(2.0f)) {
                    i9 = 17;
                }
                if (i9 != 17 || rectF.left >= displayMetrics2.widthPixels / 4.0f) {
                    i11 = i9;
                }
                if (i11 != 17 || rectF.right <= (displayMetrics2.widthPixels / 4.0f) * 3.0f) {
                    i12 = i11;
                }
                notchInfo.gravity = i12;
                notchInfo.rawPath = trim;
                if (!trim.contains("C") && !trim.contains("S") && !trim.contains("Q")) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                notchInfo.isAccurate = z10;
                notchInfo.isLikelyCircle = (rectF.width() <= ((float) AndroidUtilities.dp(32.0f)) || rectF.width() <= rectF.height()) ? true : true;
                return notchInfo;
            } catch (Throwable th) {
                FileLog.e("Failed to parse notch info", th);
            }
        }
        return null;
    }
}
