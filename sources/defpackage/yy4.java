package defpackage;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
public final class yy4 extends hy4 {
    public zy4 E;
    public zy4 F;
    public zy4 G;
    public kz4 H;
    public int I;
    public short J;
    public int K;
    public short L;
    public final RectF M;
    public final iz4 f;
    public final ty4 h;
    public final yke n;
    public final yke r;
    public yke s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public yy4(iz4 iz4Var) {
        ty4 ty4Var;
        boolean z;
        yke uy4Var;
        zy4 zy4Var = zy4.b;
        this.E = zy4Var;
        this.F = zy4Var;
        this.G = zy4Var;
        this.J = (short) 255;
        this.L = (short) 255;
        this.M = new RectF();
        this.f = iz4Var;
        if (iz4Var instanceof ty4) {
            ty4Var = (ty4) iz4Var;
        } else {
            ty4Var = null;
        }
        this.h = ty4Var;
        if (iz4Var instanceof mz4) {
            z = true;
        } else {
            z = true;
        }
        int i = Build.VERSION.SDK_INT;
        if (z) {
            if (i >= 29) {
                uy4Var = new vy4(this);
            } else {
                uy4Var = new uy4(this, false);
            }
            this.n = uy4Var;
            this.r = uy4Var;
        } else if (i >= 33) {
            this.n = new xy4(this);
            this.r = new vy4(this);
        } else if (i >= 31) {
            this.n = new wy4(this);
            this.r = new vy4(this);
        } else {
            this.n = new uy4(this, true);
            this.r = new uy4(this, false);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy4.draw(android.graphics.Canvas):void");
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
    public final void g(hz4 hz4Var) {
        yke ykeVar;
        boolean z = hz4Var.a;
        yke ykeVar2 = this.r;
        if (z) {
            ykeVar = this.n;
        } else {
            ykeVar = ykeVar2;
        }
        yke ykeVar3 = this.s;
        if (ykeVar3 != ykeVar) {
            if (ykeVar3 != null) {
                ykeVar3.b();
            }
            this.s = ykeVar;
            ykeVar.e(this.c / 255.0f);
            if (this.s == ykeVar2) {
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
        yke ykeVar = this.s;
        ykeVar.getClass();
        return !(ykeVar instanceof uy4);
    }

    public final LinearGradient l(zy4 zy4Var, float f, float f2, int i, int i2) {
        int i3;
        boolean z;
        if (zy4Var == null) {
            i3 = -1;
        } else {
            i3 = zy4Var.a;
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
        i15.a(i15.i, i, iArr);
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
        kz4 kz4Var = this.H;
        if (kz4Var != null) {
            this.I = cmb.p1(this.J / 255.0f, kz4Var.b);
            this.K = cmb.p1(this.L / 255.0f, this.H.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
