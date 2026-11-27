package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
public abstract class yhc {
    public static final yi a = new yi((byte) 20);
    public static final yi b = new yi((byte) 21);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, u38 u38Var, ji7 ji7Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = u38Var.getOutlineProvider();
        if (!canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 24 && u38Var.getClipToOutline() && outlineProvider != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (c == null) {
                    c = new Path();
                    d = new Outline();
                    e = new Rect();
                }
                path = c;
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
            outlineProvider.getOutline(u38Var, outline);
            path2.rewind();
            if (!outline.isEmpty() && outline.getRect(rect)) {
                float radius = outline.getRadius();
                int i = (radius > 0.0f ? 1 : (radius == 0.0f ? 0 : -1));
                float f = rect.left;
                float f2 = rect.top;
                if (i > 0) {
                    path2.addRoundRect(f, f2, rect.right, rect.bottom, radius, radius, Path.Direction.CW);
                } else {
                    path2.addRect(f, f2, rect.right, rect.bottom, Path.Direction.CW);
                }
                int save = canvas.save();
                canvas.clipPath(path2);
                ji7Var.a(canvas);
                canvas.restoreToCount(save);
                return;
            }
            ji7Var.a(canvas);
            return;
        }
        ji7Var.a(canvas);
    }
}
