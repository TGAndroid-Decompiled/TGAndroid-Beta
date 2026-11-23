package fh;

import a8.ea;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.ui.ActionBar.m6;
public final class c extends ea {
    public final Paint f11650a = new Paint(1);
    public final Paint f11651b;
    public final g f11652c;

    public c(g gVar) {
        this.f11652c = gVar;
        Paint paint = new Paint(1);
        this.f11651b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, ui.a aVar) {
        boolean z10;
        g gVar = this.f11652c;
        f fVar = gVar.R;
        int i7 = gVar.f56716c;
        if (i7 != 0) {
            int r12 = m6.r1(i7 / 255.0f, gVar.f11705y);
            if (Color.alpha(gVar.f11704x) > 0 && i7 == 255) {
                float f10 = gVar.W;
                if (f10 > 0.0f) {
                    float f11 = gVar.U;
                    float f12 = gVar.V;
                    int r13 = m6.r1(f10, gVar.f11704x);
                    Paint paint = this.f11651b;
                    paint.setShadowLayer(f11, 0.0f, f12, r13);
                    fVar.d(canvas, paint, gVar.T);
                }
            }
            Rect rect = fVar.f11678m;
            float f13 = rect.left;
            float f14 = gVar.d;
            float f15 = f13 + f14;
            float f16 = rect.top;
            float f17 = gVar.f56717e;
            float f18 = f16 + f17;
            float f19 = rect.right;
            float f20 = f19 + f14;
            float f21 = rect.bottom;
            float f22 = f21 + f17;
            if (i7 != 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (z11) {
                canvas.saveLayerAlpha(f13, f16, f19, f21, i7);
            }
            canvas.save();
            canvas.clipPath(fVar.f11676k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f15, -f18);
            aVar.o(f15, f18, f20, f22, canvas);
            canvas.restore();
            if (Color.alpha(r12) > 0) {
                Paint paint2 = this.f11650a;
                paint2.setColor(r12);
                fVar.c(canvas, paint2);
            }
            if (z11) {
                canvas.restore();
            }
        }
    }
}
