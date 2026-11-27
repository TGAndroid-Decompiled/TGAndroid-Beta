package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
public final class fl0 extends ctd {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final jl0 c;

    public fl0(jl0 jl0Var) {
        this.c = jl0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, mz4 mz4Var) {
        boolean z;
        jl0 jl0Var = this.c;
        il0 il0Var = jl0Var.S;
        int i = jl0Var.c;
        if (i != 0) {
            int p1 = aob.p1(i / 255.0f, jl0Var.y);
            if (Color.alpha(jl0Var.x) > 0 && i == 255) {
                float f = jl0Var.X;
                if (f > 0.0f) {
                    float f2 = jl0Var.V;
                    float f3 = jl0Var.W;
                    int p12 = aob.p1(f, jl0Var.x);
                    Paint paint = this.b;
                    paint.setShadowLayer(f2, 0.0f, f3, p12);
                    il0Var.d(canvas, paint, jl0Var.U);
                }
            }
            Rect rect = il0Var.m;
            float f4 = rect.left;
            float f5 = jl0Var.d;
            float f6 = f4 + f5;
            float f7 = rect.top;
            float f8 = jl0Var.e;
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
            canvas.clipPath(il0Var.k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f6, -f9);
            mz4Var.e(f6, f9, f11, f13, canvas);
            canvas.restore();
            if (Color.alpha(p1) > 0) {
                Paint paint2 = this.a;
                paint2.setColor(p1);
                il0Var.c(canvas, paint2);
            }
            if (z2) {
                canvas.restore();
            }
        }
    }
}
