package fh;

import a8.aa;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.ui.ActionBar.k6;
public final class c extends aa {
    public final Paint f11487a = new Paint(1);
    public final Paint f11488b;
    public final g f11489c;

    public c(g gVar) {
        this.f11489c = gVar;
        Paint paint = new Paint(1);
        this.f11488b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, ri.a aVar) {
        boolean z9;
        g gVar = this.f11489c;
        f fVar = gVar.Q;
        int i7 = gVar.f21076c;
        if (i7 != 0) {
            int r12 = k6.r1(i7 / 255.0f, gVar.f11541y);
            if (Color.alpha(gVar.f11540x) > 0 && i7 == 255) {
                float f10 = gVar.V;
                if (f10 > 0.0f) {
                    float f11 = gVar.T;
                    float f12 = gVar.U;
                    int r13 = k6.r1(f10, gVar.f11540x);
                    Paint paint = this.f11488b;
                    paint.setShadowLayer(f11, 0.0f, f12, r13);
                    fVar.d(canvas, paint, gVar.S);
                }
            }
            Rect rect = fVar.f11515m;
            float f13 = rect.left;
            float f14 = gVar.d;
            float f15 = f13 + f14;
            float f16 = rect.top;
            float f17 = gVar.f21077e;
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
            canvas.clipPath(fVar.f11513k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f15, -f18);
            aVar.e(canvas, f15, f18, f20, f22);
            canvas.restore();
            if (Color.alpha(r12) > 0) {
                Paint paint2 = this.f11487a;
                paint2.setColor(r12);
                fVar.c(canvas, paint2);
            }
            if (z10) {
                canvas.restore();
            }
        }
    }
}
