package fh;

import a8.aa;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.ui.ActionBar.m6;
public final class c extends aa {
    public final Paint f11492a = new Paint(1);
    public final Paint f11493b;
    public final g f11494c;

    public c(g gVar) {
        this.f11494c = gVar;
        Paint paint = new Paint(1);
        this.f11493b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, ri.a aVar) {
        boolean z9;
        g gVar = this.f11494c;
        f fVar = gVar.Q;
        int i7 = gVar.f21081c;
        if (i7 != 0) {
            int r12 = m6.r1(i7 / 255.0f, gVar.f11546y);
            if (Color.alpha(gVar.f11545x) > 0 && i7 == 255) {
                float f10 = gVar.V;
                if (f10 > 0.0f) {
                    float f11 = gVar.T;
                    float f12 = gVar.U;
                    int r13 = m6.r1(f10, gVar.f11545x);
                    Paint paint = this.f11493b;
                    paint.setShadowLayer(f11, 0.0f, f12, r13);
                    fVar.d(canvas, paint, gVar.S);
                }
            }
            Rect rect = fVar.f11520m;
            float f13 = rect.left;
            float f14 = gVar.d;
            float f15 = f13 + f14;
            float f16 = rect.top;
            float f17 = gVar.f21082e;
            float f18 = f16 + f17;
            float f19 = rect.right;
            float f20 = f19 + f14;
            float f21 = rect.bottom;
            float f22 = f21 + f17;
            if (i7 != 255) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z10 = z9;
            if (z10) {
                canvas.saveLayerAlpha(f13, f16, f19, f21, i7);
            }
            canvas.save();
            canvas.clipPath(fVar.f11518k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f15, -f18);
            aVar.e(canvas, f15, f18, f20, f22);
            canvas.restore();
            if (Color.alpha(r12) > 0) {
                Paint paint2 = this.f11492a;
                paint2.setColor(r12);
                fVar.c(canvas, paint2);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }
}
