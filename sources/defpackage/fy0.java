package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
public final class fy0 {
    public final RectF a = new RectF();
    public final gy0 b;
    public final xx0 c;
    public final vx0 d;
    public final Paint e;
    public final Matrix f;
    public final float[] g;
    public final float[] h;
    public float i;
    public ValueAnimator j;
    public final v41 k;
    public final Paint l;
    public final RectF m;
    public final Path n;
    public final Paint o;
    public final RadialGradient p;
    public final Matrix q;
    public final Paint r;

    public fy0(gy0 gy0Var, xx0 xx0Var, vx0 vx0Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new Matrix();
        this.g = new float[8];
        this.h = new float[8];
        this.i = 0.0f;
        this.l = new Paint(1);
        this.m = new RectF();
        this.n = new Path();
        this.o = new Paint(3);
        this.p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.q = new Matrix();
        this.r = new Paint(1);
        this.b = gy0Var;
        this.c = xx0Var;
        this.d = vx0Var;
        this.k = new v41(gy0Var);
        paint.setColor(xx0Var.r);
    }

    public final void a(float f) {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, f);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new g0(this, (byte) 21));
        this.j.addListener(new u7(this, f, (byte) 2));
        int i = (Math.abs(f) > 0.1f ? 1 : (Math.abs(f) == 0.1f ? 0 : -1));
        ValueAnimator valueAnimator2 = this.j;
        if (i < 0) {
            hl.n(valueAnimator2, 285.0d, 20.0d);
        } else {
            valueAnimator2.setInterpolator(k43.h);
        }
        this.j.start();
    }
}
