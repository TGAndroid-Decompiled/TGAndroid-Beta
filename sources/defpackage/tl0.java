package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
public abstract class tl0 {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(vi5 vi5Var, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(vi5Var, canvas, rectF, view, viewGroup, 255);
    }

    public static void b(vi5 vi5Var, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i) {
        boolean z;
        if (i > 0 && vi5Var != null) {
            RectF rectF2 = c;
            if (zgc.c(view, viewGroup, rectF2)) {
                float f = rectF2.left;
                float f2 = rectF2.top;
                RectF rectF3 = b;
                rectF3.set(rectF);
                rectF3.offset(-f, -f2);
                boolean z2 = true;
                if (f == 0.0f && f2 == 0.0f) {
                    z = false;
                } else {
                    z = true;
                }
                if (i == 255) {
                    z2 = false;
                }
                if (z) {
                    canvas.save();
                    canvas.translate(f, f2);
                }
                if (z2) {
                    canvas.saveLayerAlpha(rectF3, i);
                }
                vi5Var.g(canvas, rectF3);
                if (z2) {
                    canvas.restore();
                }
                if (z) {
                    canvas.restore();
                }
            }
        }
    }

    public static void c(jz4 jz4Var, View view) {
        Bitmap bitmap;
        if (jz4Var != null && view != null && view.getWidth() != 0 && view.getHeight() != 0 && (bitmap = jz4Var.d) != null && !bitmap.isRecycled() && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            Matrix matrix = a;
            matrix.reset();
            matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
            jz4Var.b.set(matrix);
        }
    }

    public static sl0 d(im0 im0Var, int i, int i2) {
        return new sl0(i, i2, im0Var);
    }
}
