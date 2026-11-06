package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import fh.g;
import jh.k;
public abstract class d {
    public static final Matrix f15481a = new Matrix();
    public static final RectF f15482b = new RectF();
    public static final RectF f15483c = new RectF();

    public static void a(eh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(aVar, canvas, rectF, view, viewGroup, 255);
    }

    public static void b(eh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i7) {
        boolean z9;
        if (i7 > 0 && aVar != null) {
            RectF rectF2 = f15483c;
            if (k.c(view, viewGroup, rectF2)) {
                float f10 = rectF2.left;
                float f11 = rectF2.top;
                RectF rectF3 = f15482b;
                rectF3.set(rectF);
                rectF3.offset(-f10, -f11);
                boolean z10 = true;
                if (f10 == 0.0f && f11 == 0.0f) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (i7 == 255) {
                    z10 = false;
                }
                if (z9) {
                    canvas.save();
                    canvas.translate(f10, f11);
                }
                if (z10) {
                    canvas.saveLayerAlpha(rectF3, i7);
                }
                aVar.d(canvas, rectF3);
                if (z10) {
                    canvas.restore();
                }
                if (z9) {
                    canvas.restore();
                }
            }
        }
    }

    public static void c(ri.b bVar, View view) {
        Bitmap bitmap;
        if (bVar != null && view != null && view.getWidth() != 0 && view.getHeight() != 0 && (bitmap = bVar.d) != null && !bitmap.isRecycled() && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            Matrix matrix = f15481a;
            matrix.reset();
            matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
            bVar.f54441b.set(matrix);
        }
    }

    public static c d(g gVar, int i7, int i10) {
        return new c(i7, i10, gVar);
    }
}
