package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
public class o46 {
    public final nk1 a;
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
    public final vnb p;

    public o46(nk1 nk1Var, boolean z, vnb vnbVar) {
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
        this.p = vnbVar;
        this.a = nk1Var;
        paint2.setStrokeWidth(hl.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!pf0.B1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(nk1Var.h);
        paint.setStrokeWidth(hl.N(1.0f));
        paint.setStyle(style);
        paint.setColor(nk1Var.h);
        paint3.setStrokeWidth(hl.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(nk1Var.h);
        long[] jArr = nk1Var.a;
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
        nk1 nk1Var = this.a;
        int i2 = nk1Var.g;
        vnb vnbVar = this.p;
        if (i2 >= 0 && aob.d1(i2)) {
            i = aob.v0(nk1Var.g, vnbVar);
            this.m = i;
        } else {
            if (vm2.h(aob.v0(aob.d6, vnbVar)) < 0.5d) {
                i = nk1Var.i;
            } else {
                i = nk1Var.h;
            }
            this.m = i;
        }
        this.c.setColor(i);
        this.b.setColor(this.m);
        this.d.setColor(this.m);
    }
}
