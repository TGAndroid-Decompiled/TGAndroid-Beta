package gh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import b8.mc;
import org.telegram.ui.ActionBar.k6;
public final class c extends mc {
    public final Paint f12281a = new Paint(1);
    public final Paint f12282b;
    public final g f12283c;

    public c(g gVar) {
        this.f12283c = gVar;
        Paint paint = new Paint(1);
        this.f12282b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, si.a aVar) {
        boolean z10;
        g gVar = this.f12283c;
        f fVar = gVar.R;
        int i3 = gVar.f53579c;
        if (i3 != 0) {
            int r12 = k6.r1(i3 / 255.0f, gVar.f12336y);
            if (Color.alpha(gVar.f12335x) > 0 && i3 == 255) {
                float f10 = gVar.W;
                if (f10 > 0.0f) {
                    float f11 = gVar.U;
                    float f12 = gVar.V;
                    int r13 = k6.r1(f10, gVar.f12335x);
                    Paint paint = this.f12282b;
                    paint.setShadowLayer(f11, 0.0f, f12, r13);
                    fVar.d(canvas, paint, gVar.T);
                }
            }
            Rect rect = fVar.f12309m;
            float f13 = rect.left;
            float f14 = gVar.d;
            float f15 = f13 + f14;
            float f16 = rect.top;
            float f17 = gVar.f53580e;
            float f18 = f16 + f17;
            float f19 = rect.right;
            float f20 = f19 + f14;
            float f21 = rect.bottom;
            float f22 = f21 + f17;
            if (i3 != 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (z11) {
                canvas.saveLayerAlpha(f13, f16, f19, f21, i3);
            }
            canvas.save();
            canvas.clipPath(fVar.f12307k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f15, -f18);
            aVar.l(canvas, f15, f18, f20, f22);
            canvas.restore();
            if (Color.alpha(r12) > 0) {
                Paint paint2 = this.f12281a;
                paint2.setColor(r12);
                fVar.c(canvas, paint2);
            }
            if (z11) {
                canvas.restore();
            }
        }
    }
}
