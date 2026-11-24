package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class bj3 extends FrameLayout {
    public static final int M = 0;
    public t29 E;
    public boolean F;
    public ph3 G;
    public oj3 H;
    public boolean I;
    public final zg3 J;
    public final zg3 K;
    public final cj3 L;
    public yi3 a;
    public kp b;
    public ah3 c;
    public eh3 d;
    public is5 e;
    public aj3 f;
    public int h;
    public dh3 n;
    public cu6 r;
    public int s;
    public byte w;
    public pi4 x;
    public yg3 y;

    public bj3(cj3 cj3Var, Context context) {
        super(context);
        this.L = cj3Var;
        this.J = new zg3(this, (byte) 1);
        this.K = new zg3(this, (byte) 2);
    }

    public final boolean a() {
        int i = this.s;
        if (i != 0 && i != 7 && i != 8) {
            return false;
        }
        return true;
    }

    public final void b(boolean z) {
        if (!cj3.e2(this.L)) {
            zg3 zg3Var = this.K;
            if (z) {
                gl.r(zg3Var);
                this.a.setItemAnimator(this.y);
                zg3Var.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.y.k()) {
                    this.a.setItemAnimator(null);
                }
                gl.e3(zg3Var, 36L);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
    }

    @Override
    public void setTranslationX(float f) {
        bj3 bj3Var;
        if (getTranslationX() != f) {
            super.setTranslationX(f);
            cj3 cj3Var = this.L;
            if (cj3Var.j3 && (bj3Var = cj3Var.f0[0]) == this) {
                cj3Var.A0.h(Math.abs(bj3Var.getTranslationX()) / cj3Var.f0[0].getMeasuredWidth(), cj3Var.f0[1].h);
            }
            cj3.b2(cj3Var).g();
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (getTranslationY() != f) {
            cj3.Y(this.L).g();
        }
        super.setTranslationY(f);
    }
}
