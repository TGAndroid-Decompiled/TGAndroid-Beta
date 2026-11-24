package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
public class k26 {
    public final ek1 a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public final Path g;
    public ValueAnimator h;
    public ValueAnimator i;
    public int j;
    public final float[] k;
    public final float[] l;
    public int m;
    public boolean n;
    public float o;
    public final wjb p;

    public k26(ek1 ek1Var, boolean z, wjb wjbVar) {
        int i;
        int i2;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.n = true;
        this.o = 1.0f;
        this.p = wjbVar;
        this.a = ek1Var;
        paint2.setStrokeWidth(gl.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!nf0.B1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(ek1Var.h);
        paint.setStrokeWidth(gl.N(1.0f));
        paint.setStyle(style);
        paint.setColor(ek1Var.h);
        paint3.setStrokeWidth(gl.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(ek1Var.h);
        long[] jArr = ek1Var.a;
        int length = jArr.length;
        if (z) {
            i = length << 3;
        } else {
            i = length << 2;
        }
        this.k = new float[i];
        int length2 = jArr.length;
        if (z) {
            i2 = length2 << 3;
        } else {
            i2 = length2 << 2;
        }
        this.l = new float[i2];
    }

    public void a() {
        int i;
        ek1 ek1Var = this.a;
        int i2 = ek1Var.g;
        wjb wjbVar = this.p;
        if (i2 >= 0 && bkb.d1(i2)) {
            i = bkb.v0(ek1Var.g, wjbVar);
            this.m = i;
        } else {
            if (bm2.h(bkb.v0(bkb.c6, wjbVar)) < 0.5d) {
                i = ek1Var.i;
            } else {
                i = ek1Var.h;
            }
            this.m = i;
        }
        this.c.setColor(i);
        this.b.setColor(this.m);
        this.d.setColor(this.m);
    }
}
