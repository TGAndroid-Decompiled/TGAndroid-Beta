package defpackage;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
public final class ww4 extends fw4 {
    public xw4 E;
    public xw4 F;
    public xw4 G;
    public ix4 H;
    public int I;
    public short J;
    public int K;
    public short L;
    public final RectF M;
    public final gx4 f;
    public final rw4 h;
    public final xie n;
    public final xie r;
    public xie s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public ww4(gx4 gx4Var) {
        rw4 rw4Var;
        boolean z;
        xie sw4Var;
        xw4 xw4Var = xw4.b;
        this.E = xw4Var;
        this.F = xw4Var;
        this.G = xw4Var;
        this.J = (short) 255;
        this.L = (short) 255;
        this.M = new RectF();
        this.f = gx4Var;
        if (gx4Var instanceof rw4) {
            rw4Var = (rw4) gx4Var;
        } else {
            rw4Var = null;
        }
        this.h = rw4Var;
        if (gx4Var instanceof kx4) {
            z = true;
        } else {
            z = true;
        }
        int i = Build.VERSION.SDK_INT;
        if (z) {
            if (i >= 29) {
                sw4Var = new tw4(this);
            } else {
                sw4Var = new sw4(this, false);
            }
            this.n = sw4Var;
            this.r = sw4Var;
        } else if (i >= 33) {
            this.n = new vw4(this);
            this.r = new tw4(this);
        } else if (i >= 31) {
            this.n = new uw4(this);
            this.r = new tw4(this);
        } else {
            this.n = new sw4(this, true);
            this.r = new sw4(this, false);
        }
        g(this.b);
    }

    public static float k(float f, int i, int i2) {
        float f2;
        float f3;
        return (((float) Math.floor((f - f2) / f3)) * i2) + i;
    }

    @Override
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.s.a(bounds, rectF);
    }

    @Override
    public final void draw(android.graphics.Canvas r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww4.draw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean e() {
        return this.s.d();
    }

    @Override
    public final void f(int i) {
        this.s.e(i / 255.0f);
        invalidateSelf();
    }

    @Override
    public final void g(fx4 fx4Var) {
        xie xieVar;
        boolean z = fx4Var.a;
        xie xieVar2 = this.r;
        if (z) {
            xieVar = this.n;
        } else {
            xieVar = xieVar2;
        }
        xie xieVar3 = this.s;
        if (xieVar3 != xieVar) {
            if (xieVar3 != null) {
                xieVar3.b();
            }
            this.s = xieVar;
            xieVar.e(this.c / 255.0f);
            if (this.s == xieVar2) {
                this.x = true;
            } else {
                this.w = true;
            }
            invalidateSelf();
        }
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final boolean j() {
        xie xieVar = this.s;
        xieVar.getClass();
        return !(xieVar instanceof sw4);
    }

    public final LinearGradient l(xw4 xw4Var, float f, float f2, int i, int i2) {
        int i3;
        boolean z;
        if (xw4Var == null) {
            i3 = -1;
        } else {
            i3 = xw4Var.a;
        }
        float f3 = 0.0f;
        float f4 = f - 0.0f;
        float max = Math.max(0.0f, f4 - f2);
        if (i3 != -1) {
            max = Math.min(i3, max);
        }
        float f5 = 1.0f;
        float f6 = 1.0f / i2;
        int i4 = this.y;
        if (i4 != 1 && i4 != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f3 = -0.0f;
        } else {
            f4 = 0.0f;
        }
        float f7 = (f4 + f3) * f6;
        if (z) {
            f5 = -1.0f;
        }
        float max2 = (Math.max(max * f6, 0.001f) * f5) + f7;
        int[] iArr = new int[8];
        jz4.a(jz4.i, i, iArr);
        int i5 = this.y;
        if (i5 != 1 && i5 != 4) {
            return new LinearGradient(max2, 0.0f, f7, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, max2, 0.0f, f7, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.w = true;
        this.x = true;
    }

    @Override
    public final void updateColors() {
        ix4 ix4Var = this.H;
        if (ix4Var != null) {
            this.I = bkb.p1(this.J / 255.0f, ix4Var.b);
            this.K = bkb.p1(this.L / 255.0f, this.H.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
