package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
public final class el0 extends mod {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final il0 c;

    public el0(il0 il0Var) {
        this.c = il0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, gx4 gx4Var) {
        boolean z;
        il0 il0Var = this.c;
        hl0 hl0Var = il0Var.S;
        int i = il0Var.c;
        if (i != 0) {
            int p1 = bkb.p1(i / 255.0f, il0Var.y);
            if (Color.alpha(il0Var.x) > 0 && i == 255) {
                float f = il0Var.X;
                if (f > 0.0f) {
                    float f2 = il0Var.V;
                    float f3 = il0Var.W;
                    int p12 = bkb.p1(f, il0Var.x);
                    Paint paint = this.b;
                    paint.setShadowLayer(f2, 0.0f, f3, p12);
                    hl0Var.d(canvas, paint, il0Var.U);
                }
            }
            Rect rect = hl0Var.m;
            float f4 = rect.left;
            float f5 = il0Var.d;
            float f6 = f4 + f5;
            float f7 = rect.top;
            float f8 = il0Var.e;
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
            canvas.clipPath(hl0Var.k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f6, -f9);
            gx4Var.e(f6, f9, f11, f13, canvas);
            canvas.restore();
            if (Color.alpha(p1) > 0) {
                Paint paint2 = this.a;
                paint2.setColor(p1);
                hl0Var.c(canvas, paint2);
            }
            if (z2) {
                canvas.restore();
            }
        }
    }
}
