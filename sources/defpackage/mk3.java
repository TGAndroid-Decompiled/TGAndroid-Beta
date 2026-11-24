package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class mk3 extends FrameLayout {
    public static final int M = 0;
    public w49 E;
    public boolean F;
    public bj3 G;
    public zk3 H;
    public boolean I;
    public final li3 J;
    public final li3 K;
    public final nk3 L;
    public jk3 a;
    public kq b;
    public mi3 c;
    public qi3 d;
    public hu5 e;
    public lk3 f;
    public int h;
    public pi3 n;
    public cw6 r;
    public int s;
    public byte w;
    public tk4 x;
    public ki3 y;

    public mk3(nk3 nk3Var, Context context) {
        super(context);
        this.L = nk3Var;
        this.J = new li3(this, (byte) 1);
        this.K = new li3(this, (byte) 2);
    }

    public final boolean a() {
        int i = this.s;
        if (i != 0 && i != 7 && i != 8) {
            return false;
        }
        return true;
    }

    public final void b(boolean z) {
        if (!nk3.g2(this.L)) {
            li3 li3Var = this.K;
            if (z) {
                gm.r(li3Var);
                this.a.setItemAnimator(this.y);
                li3Var.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.y.k()) {
                    this.a.setItemAnimator(null);
                }
                gm.d3(li3Var, 36L);
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
        mk3 mk3Var;
        if (getTranslationX() != f) {
            super.setTranslationX(f);
            nk3 nk3Var = this.L;
            if (nk3Var.j3 && (mk3Var = nk3Var.f0[0]) == this) {
                nk3Var.A0.h(Math.abs(mk3Var.getTranslationX()) / nk3Var.f0[0].getMeasuredWidth(), nk3Var.f0[1].h);
            }
            nk3.d2(nk3Var).g();
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (getTranslationY() != f) {
            nk3.Z(this.L).g();
        }
        super.setTranslationY(f);
    }
}
