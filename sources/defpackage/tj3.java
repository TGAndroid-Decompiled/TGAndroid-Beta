package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
public final class tj3 extends FrameLayout {
    public static final int M = 0;
    public i69 E;
    public boolean F;
    public ji3 G;
    public gk3 H;
    public boolean I;
    public final th3 J;
    public final th3 K;
    public final uj3 L;
    public qj3 a;
    public lp b;
    public uh3 c;
    public yh3 d;
    public lu5 e;
    public sj3 f;
    public int h;
    public xh3 n;
    public hw6 r;
    public int s;
    public byte w;
    public tk4 x;
    public sh3 y;

    public tj3(uj3 uj3Var, Context context) {
        super(context);
        this.L = uj3Var;
        this.J = new th3(this, (byte) 1);
        this.K = new th3(this, (byte) 2);
    }

    public final boolean a() {
        int i = this.s;
        if (i != 0 && i != 7 && i != 8) {
            return false;
        }
        return true;
    }

    public final void b(boolean z) {
        if (!((e) this.L).isPaused) {
            th3 th3Var = this.K;
            if (z) {
                hl.r(th3Var);
                this.a.setItemAnimator(this.y);
                th3Var.run();
            } else if (this.I) {
            } else {
                this.I = true;
                if (!this.y.k()) {
                    this.a.setItemAnimator(null);
                }
                hl.d3(th3Var, 36L);
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
        tj3 tj3Var;
        if (getTranslationX() != f) {
            super.setTranslationX(f);
            uj3 uj3Var = this.L;
            if (uj3Var.j3 && (tj3Var = uj3Var.f0[0]) == this) {
                uj3Var.A0.j(Math.abs(tj3Var.getTranslationX()) / uj3Var.f0[0].getMeasuredWidth(), uj3Var.f0[1].h);
            }
            ((e) uj3Var).glassEngine.g();
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (getTranslationY() != f) {
            ((e) this.L).glassEngine.g();
        }
        super.setTranslationY(f);
    }
}
