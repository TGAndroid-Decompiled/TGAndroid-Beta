package defpackage;

import android.widget.OverScroller;
import org.telegram.ui.ActionBar.a;
public final class cr9 implements Runnable {
    public final byte a;
    public final dr9 b;

    public cr9(dr9 dr9Var, byte b) {
        this.a = b;
        this.b = dr9Var;
    }

    @Override
    public final void run() {
        float f;
        byte b = this.a;
        dr9 dr9Var = this.b;
        switch (b) {
            case 0:
                dr9Var.requestLayout();
                return;
            default:
                er9 er9Var = dr9Var.P;
                OverScroller overScroller = dr9Var.r;
                float f2 = 0.0f;
                if (overScroller.computeScrollOffset()) {
                    int currY = overScroller.getCurrY();
                    float f3 = -dr9Var.f();
                    float f4 = currY;
                    dr9Var.k(f4);
                    if ((f4 <= f3 || currY >= 0) && !overScroller.isFinished()) {
                        if (currY >= 0) {
                            f = Math.min(overScroller.getCurrVelocity(), hl.L(1200.0f));
                        } else {
                            f = -Math.min(overScroller.getCurrVelocity(), hl.L(2400.0f));
                        }
                        overScroller.abortAnimation();
                        if (currY < 0) {
                            f2 = f3;
                        }
                        dr9Var.l(f2, f, 380.0f);
                        return;
                    }
                    dr9Var.postOnAnimation(dr9Var.s);
                    return;
                }
                if (er9Var.e0 + er9Var.i0 < a.getCurrentActionBarHeight() + er9Var.R.b && er9Var.i0 > (-dr9Var.f())) {
                    dr9Var.l(-dr9Var.f(), 0.0f, 180.0f);
                    return;
                }
                return;
        }
    }
}
