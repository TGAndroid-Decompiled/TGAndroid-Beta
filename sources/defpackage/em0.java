package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
public final class em0 extends pqd {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final im0 c;

    public em0(im0 im0Var) {
        this.c = im0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, iz4 iz4Var) {
        boolean z;
        im0 im0Var = this.c;
        hm0 hm0Var = im0Var.S;
        int i = im0Var.c;
        if (i != 0) {
            int p1 = cmb.p1(i / 255.0f, im0Var.y);
            if (Color.alpha(im0Var.x) > 0 && i == 255) {
                float f = im0Var.X;
                if (f > 0.0f) {
                    float f2 = im0Var.V;
                    float f3 = im0Var.W;
                    int p12 = cmb.p1(f, im0Var.x);
                    Paint paint = this.b;
                    paint.setShadowLayer(f2, 0.0f, f3, p12);
                    hm0Var.d(canvas, paint, im0Var.U);
                }
            }
            Rect rect = hm0Var.m;
            float f4 = rect.left;
            float f5 = im0Var.d;
            float f6 = f4 + f5;
            float f7 = rect.top;
            float f8 = im0Var.e;
            float f9 = f7 + f8;
            float f10 = rect.right;
            float f11 = f10 + f5;
            float f12 = rect.bottom;
            float f13 = f12 + f8;
            if (i != 255) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (z2) {
                canvas.saveLayerAlpha(f4, f7, f10, f12, i);
            }
            canvas.save();
            canvas.clipPath(hm0Var.k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f6, -f9);
            iz4Var.e(f6, f9, f11, f13, canvas);
            canvas.restore();
            if (Color.alpha(p1) > 0) {
                Paint paint2 = this.a;
                paint2.setColor(p1);
                hm0Var.c(canvas, paint2);
            }
            if (z2) {
                canvas.restore();
            }
        }
    }
}
