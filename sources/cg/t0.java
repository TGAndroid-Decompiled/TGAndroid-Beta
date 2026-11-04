package cg;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import org.telegram.ui.rl0;
import org.telegram.ui.s3;
public abstract class t0 {
    public static final p0 f4745a = new p0(0);
    public static final p0 f4746b = new p0(1);
    public static Path f4747c;
    public static Outline d;
    public static Rect f4748e;

    public static void a(Canvas canvas, rl0 rl0Var, s3 s3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = rl0Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && rl0Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (f4747c == null) {
                    f4747c = new Path();
                    d = new Outline();
                    f4748e = new Rect();
                }
                path = f4747c;
                outline = d;
                rect = f4748e;
                outline.setEmpty();
                rect.setEmpty();
            } else {
                path = new Path();
                outline = new Outline();
                rect = new Rect();
            }
            Path path2 = path;
            outlineProvider.getOutline(rl0Var, outline);
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
                s3Var.a(canvas);
                canvas.restoreToCount(save);
                return;
            }
            s3Var.a(canvas);
            return;
        }
        s3Var.a(canvas);
    }
}
