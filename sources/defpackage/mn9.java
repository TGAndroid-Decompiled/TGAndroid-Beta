package defpackage;

import android.widget.OverScroller;
import org.telegram.ui.ActionBar.a;
public final class mn9 implements Runnable {
    public final byte a;
    public final nn9 b;

    public mn9(nn9 nn9Var, byte b) {
        this.a = b;
        this.b = nn9Var;
    }

    @Override
    public final void run() {
        float f;
        byte b = this.a;
        nn9 nn9Var = this.b;
        switch (b) {
            case 0:
                nn9Var.requestLayout();
                return;
            default:
                on9 on9Var = nn9Var.P;
                OverScroller overScroller = nn9Var.r;
                float f2 = 0.0f;
                if (overScroller.computeScrollOffset()) {
                    int currY = overScroller.getCurrY();
                    float f3 = -nn9Var.f();
                    float f4 = currY;
                    nn9Var.k(f4);
                    if ((f4 <= f3 || currY >= 0) && !overScroller.isFinished()) {
                        if (currY >= 0) {
                            f = Math.min(overScroller.getCurrVelocity(), gl.L(1200.0f));
                        } else {
                            f = -Math.min(overScroller.getCurrVelocity(), gl.L(2400.0f));
                        }
                        overScroller.abortAnimation();
                        if (currY < 0) {
                            f2 = f3;
                        }
                        nn9Var.l(f2, f, 380.0f);
                        return;
                    }
                    nn9Var.postOnAnimation(nn9Var.s);
                    return;
                }
                if (on9Var.e0 + on9Var.i0 < a.getCurrentActionBarHeight() + on9Var.R.b && on9Var.i0 > (-nn9Var.f())) {
                    nn9Var.l(-nn9Var.f(), 0.0f, 180.0f);
                    return;
                }
                return;
        }
    }
}
