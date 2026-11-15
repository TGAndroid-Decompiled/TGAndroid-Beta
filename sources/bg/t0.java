package bg;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.r3;
import org.telegram.ui.yl0;
public abstract class t0 {
    public static final p0 f3335a = new p0(0);
    public static final p0 f3336b = new p0(1);
    public static Path f3337c;
    public static Outline d;
    public static Rect f3338e;

    public static void a(Canvas canvas, yl0 yl0Var, r3 r3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = yl0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && yl0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f3337c == null) {
                    f3337c = new Path();
                    d = new Outline();
                    f3338e = new Rect();
                }
                path = f3337c;
                outline = d;
                rect = f3338e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(yl0Var, outline);
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
                r3Var.a(canvas);
                canvas.restoreToCount(save);
                return;
            }
            r3Var.a(canvas);
            return;
        }
        r3Var.a(canvas);
    }
}
