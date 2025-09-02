package org.telegram.messenger;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.core.graphics.PathParser;

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
        float f;
        int i;
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
            int i2 = displayMetrics.widthPixels;
            float f2 = displayMetrics.density;
            if (trim.endsWith("@right")) {
                f = i2;
                trim = trim.substring(0, trim.length() - 6).trim();
                i = 5;
            } else if (trim.endsWith("@left")) {
                trim = trim.substring(0, trim.length() - 5).trim();
                f = 0.0f;
                i = 3;
            } else {
                f = i2 / 2.0f;
                i = 17;
            }
            boolean endsWith = trim.endsWith("@dp");
            if (endsWith) {
                trim = trim.substring(0, trim.length() - 3);
            }
            if (trim.contains("@bottom")) {
                trim = trim.split("@bottom", 2)[0].trim();
            }
            try {
                PathParser.PathDataNode[] createNodesFromPathData = PathParser.createNodesFromPathData(trim);
                Path path = new Path();
                PathParser.PathDataNode.nodesToPath(createNodesFromPathData, path);
                Matrix matrix = new Matrix();
                if (endsWith) {
                    matrix.postScale(f2, f2);
                }
                matrix.postTranslate(f, 0.0f);
                path.transform(matrix);
                notchInfo.path = path;
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                notchInfo.bounds = rectF;
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (i != 17 && Math.abs(rectF.centerX() - (displayMetrics2.widthPixels / 2.0f)) <= AndroidUtilities.dp(2.0f)) {
                    i = 17;
                }
                int i3 = (i != 17 || rectF.left >= ((float) displayMetrics2.widthPixels) / 4.0f) ? i : 3;
                notchInfo.gravity = (i3 != 17 || rectF.right <= (((float) displayMetrics2.widthPixels) / 4.0f) * 3.0f) ? i3 : 5;
                notchInfo.rawPath = trim;
                notchInfo.isAccurate = trim.contains("C") || trim.contains("S") || trim.contains("Q");
                notchInfo.isLikelyCircle = rectF.width() <= ((float) AndroidUtilities.dp(32.0f)) || rectF.width() <= rectF.height();
                return notchInfo;
            } catch (Throwable th) {
                FileLog.e("Failed to parse notch info", th);
            }
        }
        return null;
    }
}
