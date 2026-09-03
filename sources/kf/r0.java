package kf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import gg.j1;
import org.telegram.ui.cp0;
import org.telegram.ui.y3;
public abstract class r0 {
    public static final j1 f10496a = new j1(2);
    public static final j1 f10497b = new j1(3);
    public static Path f10498c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, cp0 cp0Var, y3 y3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = cp0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && cp0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f10498c == null) {
                    f10498c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = f10498c;
                outline = d;
                rect = e;
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
                y3Var.run(canvas);
                canvas.restoreToCount(save);
                return;
            }
            y3Var.run(canvas);
            return;
        }
        y3Var.run(canvas);
    }
}
