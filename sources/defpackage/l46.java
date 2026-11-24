package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
public class l46 {
    public final ml1 a;
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
    public final ylb p;

    public l46(ml1 ml1Var, boolean z, ylb ylbVar) {
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
        this.p = ylbVar;
        this.a = ml1Var;
        paint2.setStrokeWidth(gm.N(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!ng0.B1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(ml1Var.h);
        paint.setStrokeWidth(gm.N(1.0f));
        paint.setStyle(style);
        paint.setColor(ml1Var.h);
        paint3.setStrokeWidth(gm.N(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(ml1Var.h);
        long[] jArr = ml1Var.a;
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
        ml1 ml1Var = this.a;
        int i2 = ml1Var.g;
        ylb ylbVar = this.p;
        if (i2 >= 0 && cmb.d1(i2)) {
            i = cmb.v0(ml1Var.g, ylbVar);
            this.m = i;
        } else {
            if (on2.h(cmb.v0(cmb.c6, ylbVar)) < 0.5d) {
                i = ml1Var.i;
            } else {
                i = ml1Var.h;
            }
            this.m = i;
        }
        this.c.setColor(i);
        this.b.setColor(this.m);
        this.d.setColor(this.m);
    }
}
