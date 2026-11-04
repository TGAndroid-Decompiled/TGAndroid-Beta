package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import gh.g;
import kh.k;
public abstract class d {
    public static final Matrix f16256a = new Matrix();
    public static final RectF f16257b = new RectF();
    public static final RectF f16258c = new RectF();

    public static void a(fh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(aVar, canvas, rectF, view, viewGroup, 255);
    }

    public static void b(fh.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i3) {
        boolean z10;
        if (i3 > 0 && aVar != null) {
            RectF rectF2 = f16258c;
            if (k.c(view, viewGroup, rectF2)) {
                float f10 = rectF2.left;
                float f11 = rectF2.top;
                RectF rectF3 = f16257b;
                rectF3.set(rectF);
                rectF3.offset(-f10, -f11);
                boolean z11 = true;
                if (f10 == 0.0f && f11 == 0.0f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i3 == 255) {
                    z11 = false;
                }
                if (z10) {
                    canvas.save();
                    canvas.translate(f10, f11);
                }
                if (z11) {
                    canvas.saveLayerAlpha(rectF3, i3);
                }
                aVar.d(canvas, rectF3);
                if (z11) {
                    canvas.restore();
                }
                if (z10) {
                    canvas.restore();
                }
            }
        }
    }

    public static void c(si.b bVar, View view) {
        Bitmap bitmap;
        if (bVar != null && view != null && view.getWidth() != 0 && view.getHeight() != 0 && (bitmap = bVar.d) != null && !bitmap.isRecycled() && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            Matrix matrix = f16256a;
            matrix.reset();
            matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
            bVar.f54741b.set(matrix);
        }
    }

    public static c d(g gVar, int i3, int i10) {
        return new c(i3, i10, gVar);
    }
}
