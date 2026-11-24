package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
public final class j52 {
    public TextPaint B;
    public TextPaint C;
    public final k52 O;
    public k52 a;
    public jm6 b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public pla s;
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

    public j52(k52 k52Var) {
        this.O = k52Var;
        this.a = k52Var;
    }

    public final boolean a(android.graphics.Canvas r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j52.a(android.graphics.Canvas, boolean):boolean");
    }

    public final RectF b() {
        float f = 0.0f;
        if (this.g != null && this.c != null) {
            l52 l52Var = this.O.z;
            j52 j52Var = l52Var.Q.K;
            if (j52Var != null && j52Var.b == this.b) {
                f = l52Var.H;
            }
            float R1 = (((1.0f - f) * 0.2f) + 0.8f) * gl.R1(this.j, this.k, c());
            RectF e = e(c());
            float f2 = 1.0f - R1;
            float f3 = R1 + 1.0f;
            e.set(ls6.d(e.width(), f2, 2.0f, e.left), ((e.height() * f2) / 2.0f) + e.top, ls6.d(e.width(), f3, 2.0f, e.left), ((e.height() * f3) / 2.0f) + e.top);
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
        j52 j52Var = new j52(this.O);
        j52Var.g.set(this.g);
        j52Var.c = this.c;
        j52Var.b = this.b;
        return j52Var;
    }

    public final void d(g52 g52Var, c27 c27Var, boolean z) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.g;
        if (g52Var != null && c27Var != null) {
            this.i = c27Var.l;
            RectF rectF2 = this.q;
            if (z) {
                float c = c();
                RectF rectF3 = this.f;
                if (rectF3 != null) {
                    gl.X1(rectF3, rectF, c, rectF3);
                }
                RectF rectF4 = this.p;
                if (rectF4 != null) {
                    gl.X1(rectF4, rectF2, c, rectF4);
                }
                this.j = gl.R1(this.j, this.k, c);
                this.h = SystemClock.elapsedRealtime();
            }
            float f4 = c27Var.o;
            float f5 = g52Var.b;
            float f6 = f4 / f5;
            float f7 = c27Var.n;
            float f8 = g52Var.a;
            float f9 = f7 / f8;
            this.k = 1.0f;
            rectF.set(f6, f9, (c27Var.e / f5) + f6, (c27Var.f / f8) + f9);
            float L = gl.L(2.0f);
            float L2 = gl.L(gba.U0 - 1);
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
            this.j = gl.R1(this.j, this.k, c());
            RectF rectF7 = this.f;
            if (rectF7 != null) {
                gl.X1(rectF7, rectF, c(), this.f);
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
        k52 k52Var = this.O;
        int i = k52Var.m;
        RectF rectF2 = this.y;
        RectF rectF3 = this.g;
        if (rectF3 != null && this.c != null) {
            float f2 = (rectF3.left * k52Var.r) + k52Var.n;
            float f3 = (rectF3.top * k52Var.s) + k52Var.p;
            float width = rectF3.width() * k52Var.r;
            float height = rectF3.height() * k52Var.s;
            if (f < 1.0f && (rectF = this.f) != null) {
                f2 = gl.R1((rectF.left * k52Var.r) + k52Var.n, f2, f);
                f3 = gl.R1((this.f.top * k52Var.s) + k52Var.p, f3, f);
                width = gl.R1(this.f.width() * k52Var.r, width, f);
                height = gl.R1(this.f.height() * k52Var.s, height, f);
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

    public final void f(jm6 jm6Var) {
        l52 l52Var = this.O.z;
        this.b = jm6Var;
        if (jm6Var.b) {
            this.r = gl.g0(jm6Var.E, false, false);
        } else {
            this.r = null;
        }
        ImageReceiver imageReceiver = this.c;
        if (imageReceiver == null) {
            this.c = new ImageReceiver(l52Var);
            this.d = new ImageReceiver(l52Var);
            imageReceiver = this.c;
            imageReceiver.h1 = new q31(this, jm6Var, (byte) 25);
        }
        ImageReceiver imageReceiver2 = imageReceiver;
        int i = jm6Var.C;
        String str = jm6Var.I;
        String str2 = jm6Var.c;
        if (str2 != null) {
            imageReceiver2.Z(gl5.g(str2), null, null, null, bkb.Q4, 0L, null, null, 0);
        } else if (str != null) {
            if (jm6Var.b) {
                imageReceiver2.Z(gl5.g("vthumb://" + i + ":" + str), null, null, null, bkb.Q4, 0L, null, null, 0);
                this.c.u0 = true;
                return;
            }
            imageReceiver2.o0(jm6Var.J, 0, true);
            ImageReceiver imageReceiver3 = this.c;
            imageReceiver3.Z(gl5.g("thumb://" + i + ":" + str), null, null, null, bkb.Q4, 0L, null, null, 0);
        } else {
            imageReceiver2.g0(bkb.Q4);
        }
    }
}
