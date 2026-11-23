package bg;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.am0;
import org.telegram.ui.r3;
public abstract class u0 {
    public static final q0 f3313a = new q0(0);
    public static final q0 f3314b = new q0(1);
    public static Path f3315c;
    public static Outline d;
    public static Rect f3316e;

    public static void a(Canvas canvas, am0 am0Var, r3 r3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = am0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && am0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f3315c == null) {
                    f3315c = new Path();
                    d = new Outline();
                    f3316e = new Rect();
                }
                path = f3315c;
                outline = d;
                rect = f3316e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(am0Var, outline);
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
