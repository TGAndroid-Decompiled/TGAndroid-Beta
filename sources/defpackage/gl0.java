package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
public final class gl0 extends ctd {
    public NinePatchDrawable d;
    public long e;
    public final jl0 g;
    public final qeb a = new Object();
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Bitmap[] f = new Bitmap[1];

    public gl0(jl0 jl0Var) {
        this.g = jl0Var;
    }

    @Override
    public final void b(Canvas canvas, mz4 mz4Var) {
        int i;
        mz4 v = jl0.v(mz4Var);
        jl0 jl0Var = this.g;
        if (Color.alpha(jl0Var.y) != 255 && (v instanceof oz4)) {
            i = ((oz4) v).b;
        } else {
            i = 0;
        }
        c(canvas, vm2.k(jl0Var.y, i));
    }

    public final void c(Canvas canvas, int i) {
        long j;
        int i2;
        jl0 jl0Var = this.g;
        il0 il0Var = jl0Var.S;
        if (Color.alpha(i) == 0 && Color.alpha(jl0Var.x) == 0) {
            return;
        }
        if (il0Var.e()) {
            float f = jl0Var.c / 255.0f;
            int p1 = aob.p1(f, i);
            Paint paint = this.b;
            paint.setColor(p1);
            int p12 = aob.p1(f * jl0Var.X, jl0Var.x);
            if (Color.alpha(p12) != 0) {
                paint.setShadowLayer(jl0Var.V, 0.0f, jl0Var.W, p12);
            } else {
                paint.clearShadowLayer();
            }
            canvas.drawPath(il0Var.k, paint);
            return;
        }
        qeb qebVar = this.a;
        qebVar.a = 0L;
        qebVar.b = false;
        qebVar.a(i);
        qebVar.a(jl0Var.x);
        for (float f2 : il0Var.b) {
            qebVar.c(f2);
        }
        qebVar.c(jl0Var.V);
        qebVar.c(0.0f);
        qebVar.c(jl0Var.W);
        if (qebVar.b) {
            j = -1;
        } else {
            j = qebVar.a;
        }
        NinePatchDrawable ninePatchDrawable = this.d;
        Rect rect = this.c;
        if (ninePatchDrawable == null || this.e != j) {
            this.e = j;
            if (Color.alpha(i) == 255) {
                i2 = i;
            } else {
                i2 = 1;
            }
            NinePatchDrawable b = jue.b(this.f, i, il0Var.b, jl0Var.V, jl0Var.x, jl0Var.W, i2);
            this.d = b;
            b.getPadding(rect);
        }
        NinePatchDrawable ninePatchDrawable2 = this.d;
        Rect rect2 = il0Var.m;
        ninePatchDrawable2.setBounds(rect2.left - rect.left, rect2.top - rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
        ninePatchDrawable2.setAlpha(jl0Var.c);
        ninePatchDrawable2.draw(canvas);
    }
}
