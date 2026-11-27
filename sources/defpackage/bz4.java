package defpackage;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
public final class bz4 extends ky4 {
    public cz4 E;
    public cz4 F;
    public cz4 G;
    public oz4 H;
    public int I;
    public short J;
    public int K;
    public short L;
    public final RectF M;
    public final mz4 f;
    public final wy4 h;
    public final rne n;
    public final rne r;
    public rne s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public bz4(mz4 mz4Var) {
        wy4 wy4Var;
        boolean z;
        rne xy4Var;
        cz4 cz4Var = cz4.b;
        this.E = cz4Var;
        this.F = cz4Var;
        this.G = cz4Var;
        this.J = (short) 255;
        this.L = (short) 255;
        this.M = new RectF();
        this.f = mz4Var;
        if (mz4Var instanceof wy4) {
            wy4Var = (wy4) mz4Var;
        } else {
            wy4Var = null;
        }
        this.h = wy4Var;
        if (mz4Var instanceof qz4) {
            z = true;
        } else {
            z = true;
        }
        int i = Build.VERSION.SDK_INT;
        if (z) {
            if (i >= 29) {
                xy4Var = new yy4(this);
            } else {
                xy4Var = new xy4(this, false);
            }
            this.n = xy4Var;
            this.r = xy4Var;
        } else if (i >= 33) {
            this.n = new az4(this);
            this.r = new yy4(this);
        } else if (i >= 31) {
            this.n = new zy4(this);
            this.r = new yy4(this);
        } else {
            this.n = new xy4(this, true);
            this.r = new xy4(this, false);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bz4.draw(android.graphics.Canvas):void");
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
    public final void g(lz4 lz4Var) {
        rne rneVar;
        boolean z = lz4Var.a;
        rne rneVar2 = this.r;
        if (z) {
            rneVar = this.n;
        } else {
            rneVar = rneVar2;
        }
        rne rneVar3 = this.s;
        if (rneVar3 != rneVar) {
            if (rneVar3 != null) {
                rneVar3.b();
            }
            this.s = rneVar;
            rneVar.e(this.c / 255.0f);
            if (this.s == rneVar2) {
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
        rne rneVar = this.s;
        rneVar.getClass();
        return !(rneVar instanceof xy4);
    }

    public final LinearGradient l(cz4 cz4Var, float f, float f2, int i, int i2) {
        int i3;
        boolean z;
        if (cz4Var == null) {
            i3 = -1;
        } else {
            i3 = cz4Var.a;
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
        n15.a(n15.i, i, iArr);
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
        oz4 oz4Var = this.H;
        if (oz4Var != null) {
            this.I = aob.p1(this.J / 255.0f, oz4Var.b);
            this.K = aob.p1(this.L / 255.0f, this.H.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
