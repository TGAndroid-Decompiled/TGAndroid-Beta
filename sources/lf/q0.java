package lf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import hg.j1;
import org.telegram.ui.cp0;
import org.telegram.ui.w3;
public abstract class q0 {
    public static final j1 f12504a = new j1(2);
    public static final j1 f12505b = new j1(3);
    public static Path f12506c;
    public static Outline d;
    public static Rect f12507e;

    public static void a(Canvas canvas, cp0 cp0Var, w3 w3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = cp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && cp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f12506c == null) {
                    f12506c = new Path();
                    d = new Outline();
                    f12507e = new Rect();
                }
                path = f12506c;
                outline = d;
                rect = f12507e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(cp0Var, outline);
            path2.rewind();
            if (!outline.isEmpty() && outline.getRect(rect)) {
                float radius = outline.getRadius();
                if (radius > 0.0f) {
                    path2.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, radius, radius, Path.Direction.CW);
                } else {
                    path2.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
                }
                int save = canvas.save();
                canvas.clipPath(path2);
                w3Var.run(canvas);
                canvas.restoreToCount(save);
                return;
            }
            w3Var.run(canvas);
            return;
        }
        w3Var.run(canvas);
    }
}
