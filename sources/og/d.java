package og;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import pg.i;
public abstract class d {
    public static final Matrix f19570a = new Matrix();
    public static final RectF f19571b = new RectF();
    public static final RectF f19572c = new RectF();

    public static void a(jg.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i9) {
        boolean z10;
        if (i9 > 0) {
            RectF rectF2 = f19572c;
            if (i.c(view, viewGroup, rectF2)) {
                float f10 = rectF2.left;
                float f11 = rectF2.top;
                RectF rectF3 = f19571b;
                rectF3.set(rectF);
                rectF3.offset(-f10, -f11);
                boolean z11 = true;
                if (f10 == 0.0f && f11 == 0.0f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i9 == 255) {
                    z11 = false;
                }
                if (z10) {
                    canvas.save();
                    canvas.translate(f10, f11);
                }
                if (z11) {
                    canvas.saveLayerAlpha(rectF3, i9);
                }
                aVar.e(canvas, rectF3);
                if (z11) {
                    canvas.restore();
                }
                if (z10) {
                    canvas.restore();
                }
            }
        }
    }

    public static void b(jg.a aVar, Canvas canvas, RectF rectF, View view, FrameLayout frameLayout) {
        a(aVar, canvas, rectF, view, frameLayout, 255);
    }

    public static void c(ng.b bVar, View view) {
        Bitmap bitmap;
        if (bVar != null && view != null && view.getWidth() != 0 && view.getHeight() != 0 && (bitmap = bVar.d) != null && !bitmap.isRecycled() && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            Matrix matrix = f19570a;
            matrix.reset();
            matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
            bVar.f18595b.set(matrix);
        }
    }

    public static c d(kg.d dVar, int i9, int i10) {
        return new c(i9, i10, dVar);
    }
}
