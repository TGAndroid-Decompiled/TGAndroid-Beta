package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ih.k;
public abstract class d {
    public static final Matrix f11339a = new Matrix();
    public static final RectF f11340b = new RectF();
    public static final RectF f11341c = new RectF();

    public static void a(ch.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i10) {
        boolean z10;
        if (i10 > 0) {
            RectF rectF2 = f11341c;
            if (k.c(view, viewGroup, rectF2)) {
                float f7 = rectF2.left;
                float f10 = rectF2.top;
                RectF rectF3 = f11340b;
                rectF3.set(rectF);
                rectF3.offset(-f7, -f10);
                boolean z11 = true;
                if (f7 == 0.0f && f10 == 0.0f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i10 == 255) {
                    z11 = false;
                }
                if (z10) {
                    canvas.save();
                    canvas.translate(f7, f10);
                }
                if (z11) {
                    canvas.saveLayerAlpha(rectF3, i10);
                }
                aVar.f(canvas, rectF3);
                if (z11) {
                    canvas.restore();
                }
                if (z10) {
                    canvas.restore();
                }
            }
        }
    }

    public static void b(ch.a aVar, Canvas canvas, RectF rectF, View view, FrameLayout frameLayout) {
        a(aVar, canvas, rectF, view, frameLayout, 255);
    }

    public static void c(gh.b bVar, View view) {
        Bitmap bitmap;
        if (bVar != null && view != null && view.getWidth() != 0 && view.getHeight() != 0 && (bitmap = bVar.d) != null && !bitmap.isRecycled() && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            Matrix matrix = f11339a;
            matrix.reset();
            matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
            bVar.f10647b.set(matrix);
        }
    }

    public static c d(dh.d dVar, int i10, int i11) {
        return new c(i10, i11, dVar);
    }
}
