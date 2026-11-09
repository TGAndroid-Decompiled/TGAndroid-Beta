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
public abstract class u0 {
    public static final q0 f3380a = new q0(0);
    public static final q0 f3381b = new q0(1);
    public static Path f3382c;
    public static Outline d;
    public static Rect f3383e;

    public static void a(Canvas canvas, yl0 yl0Var, r3 r3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = yl0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && yl0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f3382c == null) {
                    f3382c = new Path();
                    d = new Outline();
                    f3383e = new Rect();
                }
                path = f3382c;
                outline = d;
                rect = f3383e;
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
