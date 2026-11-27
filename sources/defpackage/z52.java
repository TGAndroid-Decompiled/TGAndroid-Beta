package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class z52 {
    public TextPaint B;
    public TextPaint C;
    public final a62 O;
    public a62 a;
    public no6 b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public mpa s;
    public Bitmap v;
    public RectF f = null;
    public final RectF g = new RectF();
    public long h = 0;
    public int i = 0;
    public float j = 1.0f;
    public float k = 0.0f;
    public RectF p = null;
    public final RectF q = new RectF();
    public String r = null;
    public final Path t = new Path();
    public final float[] u = new float[8];
    public float w = 1.0f;
    public final Paint x = new Paint(1);
    public final RectF y = new RectF();
    public final Paint z = new Paint(1);
    public final Paint A = new Paint(1);
    public final Paint D = new Paint(1);
    public Bitmap E = null;
    public String F = null;
    public Bitmap G = null;
    public String H = null;
    public final Rect I = new Rect();
    public final Rect J = new Rect();
    public final Rect K = new Rect();
    public final Rect L = new Rect();
    public float M = 1.0f;
    public long N = 0;

    public z52(a62 a62Var) {
        this.O = a62Var;
        this.a = a62Var;
    }

    public final boolean a(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z52.a(android.graphics.Canvas, boolean):boolean");
    }

    public final RectF b() {
        float f = 0.0f;
        if (this.g != null && this.c != null) {
            b62 b62Var = this.O.z;
            z52 z52Var = b62Var.Q.K;
            if (z52Var != null && z52Var.b == this.b) {
                f = b62Var.H;
            }
            float R1 = (((1.0f - f) * 0.2f) + 0.8f) * hl.R1(this.j, this.k, c());
            RectF e = e(c());
            float f2 = 1.0f - R1;
            float f3 = R1 + 1.0f;
            e.set(qu6.d(e.width(), f2, 2.0f, e.left), ((e.height() * f2) / 2.0f) + e.top, qu6.d(e.width(), f3, 2.0f, e.left), ((e.height() * f3) / 2.0f) + e.top);
            return e;
        }
        RectF rectF = this.y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float c() {
        return this.O.j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final Object clone() {
        z52 z52Var = new z52(this.O);
        z52Var.g.set(this.g);
        z52Var.c = this.c;
        z52Var.b = this.b;
        return z52Var;
    }

    public final void d(w52 w52Var, j47 j47Var, boolean z) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.g;
        if (w52Var != null && j47Var != null) {
            this.i = j47Var.l;
            RectF rectF2 = this.q;
            if (z) {
                float c = c();
                RectF rectF3 = this.f;
                if (rectF3 != null) {
                    hl.X1(rectF3, rectF, c, rectF3);
                }
                RectF rectF4 = this.p;
                if (rectF4 != null) {
                    hl.X1(rectF4, rectF2, c, rectF4);
                }
                this.j = hl.R1(this.j, this.k, c);
                this.h = SystemClock.elapsedRealtime();
            }
            float f4 = j47Var.o;
            float f5 = w52Var.b;
            float f6 = f4 / f5;
            float f7 = j47Var.n;
            float f8 = w52Var.a;
            float f9 = f7 / f8;
            this.k = 1.0f;
            rectF.set(f6, f9, (j47Var.e / f5) + f6, (j47Var.f / f8) + f9);
            float L = hl.L(2.0f);
            float L2 = hl.L(xea.U0 - 1);
            int i = this.i;
            if ((i & 5) == 5) {
                f = L2;
            } else {
                f = L;
            }
            if ((i & 6) == 6) {
                f2 = L2;
            } else {
                f2 = L;
            }
            if ((i & 10) == 10) {
                f3 = L2;
            } else {
                f3 = L;
            }
            if ((i & 9) == 9) {
                L = L2;
            }
            rectF2.set(f, f2, f3, L);
            if (this.f == null) {
                RectF rectF5 = new RectF();
                this.f = rectF5;
                rectF5.set(rectF);
            }
            if (this.p == null) {
                RectF rectF6 = new RectF();
                this.p = rectF6;
                rectF6.set(rectF2);
            }
        } else if (z) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.j = hl.R1(this.j, this.k, c());
            RectF rectF7 = this.f;
            if (rectF7 != null) {
                hl.X1(rectF7, rectF, c(), this.f);
            }
            this.k = 0.0f;
            this.h = elapsedRealtime;
        } else {
            this.j = 0.0f;
            this.k = 0.0f;
        }
    }

    public final RectF e(float f) {
        RectF rectF;
        a62 a62Var = this.O;
        int i = a62Var.m;
        RectF rectF2 = this.y;
        RectF rectF3 = this.g;
        if (rectF3 != null && this.c != null) {
            float f2 = (rectF3.left * a62Var.r) + a62Var.n;
            float f3 = (rectF3.top * a62Var.s) + a62Var.p;
            float width = rectF3.width() * a62Var.r;
            float height = rectF3.height() * a62Var.s;
            if (f < 1.0f && (rectF = this.f) != null) {
                f2 = hl.R1((rectF.left * a62Var.r) + a62Var.n, f2, f);
                f3 = hl.R1((this.f.top * a62Var.s) + a62Var.p, f3, f);
                width = hl.R1(this.f.width() * a62Var.r, width, f);
                height = hl.R1(this.f.height() * a62Var.s, height, f);
            }
            int i2 = this.i;
            if ((i2 & 4) == 0) {
                float f4 = i;
                f3 += f4;
                height -= f4;
            }
            if ((i2 & 8) == 0) {
                height -= i;
            }
            if ((i2 & 1) == 0) {
                float f5 = i;
                f2 += f5;
                width -= f5;
            }
            if ((i2 & 2) == 0) {
                width -= i;
            }
            rectF2.set(f2, f3, width + f2, height + f3);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }

    public final void f(no6 no6Var) {
        b62 b62Var = this.O.z;
        this.b = no6Var;
        if (no6Var.b) {
            this.r = hl.g0(no6Var.E, false, false);
        } else {
            this.r = null;
        }
        ImageReceiver imageReceiver = this.c;
        if (imageReceiver == null) {
            this.c = new ImageReceiver(b62Var);
            this.d = new ImageReceiver(b62Var);
            imageReceiver = this.c;
            imageReceiver.h1 = new h01(this, no6Var, (byte) 27);
        }
        ImageReceiver imageReceiver2 = imageReceiver;
        int i = no6Var.C;
        String str = no6Var.I;
        String str2 = no6Var.c;
        if (str2 != null) {
            imageReceiver2.Z(jn5.g(str2), null, null, null, aob.R4, 0L, null, null, 0);
        } else if (str != null) {
            if (no6Var.b) {
                imageReceiver2.Z(jn5.g("vthumb://" + i + ":" + str), null, null, null, aob.R4, 0L, null, null, 0);
                this.c.u0 = true;
                return;
            }
            imageReceiver2.o0(no6Var.J, 0, true);
            ImageReceiver imageReceiver3 = this.c;
            imageReceiver3.Z(jn5.g("thumb://" + i + ":" + str), null, null, null, aob.R4, 0L, null, null, 0);
        } else {
            imageReceiver2.g0(aob.R4);
        }
    }
}
