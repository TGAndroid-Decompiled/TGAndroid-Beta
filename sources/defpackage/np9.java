package defpackage;

import android.widget.OverScroller;
import org.telegram.ui.ActionBar.a;
public final class np9 implements Runnable {
    public final byte a;
    public final op9 b;

    public np9(op9 op9Var, byte b) {
        this.a = b;
        this.b = op9Var;
    }

    @Override
    public final void run() {
        float f;
        byte b = this.a;
        op9 op9Var = this.b;
        switch (b) {
            case 0:
                op9Var.requestLayout();
                return;
            default:
                pp9 pp9Var = op9Var.P;
                OverScroller overScroller = op9Var.r;
                float f2 = 0.0f;
                if (overScroller.computeScrollOffset()) {
                    int currY = overScroller.getCurrY();
                    float f3 = -op9Var.f();
                    float f4 = currY;
                    op9Var.k(f4);
                    if ((f4 <= f3 || currY >= 0) && !overScroller.isFinished()) {
                        if (currY >= 0) {
                            f = Math.min(overScroller.getCurrVelocity(), gm.L(1200.0f));
                        } else {
                            f = -Math.min(overScroller.getCurrVelocity(), gm.L(2400.0f));
                        }
                        overScroller.abortAnimation();
                        if (currY < 0) {
                            f2 = f3;
                        }
                        op9Var.l(f2, f, 380.0f);
                        return;
                    }
                    op9Var.postOnAnimation(op9Var.s);
                    return;
                }
                if (pp9Var.e0 + pp9Var.i0 < a.getCurrentActionBarHeight() + pp9Var.R.b && pp9Var.i0 > (-op9Var.f())) {
                    op9Var.l(-op9Var.f(), 0.0f, 180.0f);
                    return;
                }
                return;
        }
    }
}
