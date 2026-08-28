package kh;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.yu0;
public final class y4 implements View.OnTouchListener {
    public final int f16397a;
    public final yu0 f16398b;

    public y4(yu0 yu0Var, int i9) {
        this.f16397a = i9;
        this.f16398b = yu0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f16397a) {
            case 0:
                g6 g6Var = (g6) this.f16398b;
                g6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = g6Var.D1) != null && o1Var.isShowing()) {
                    view.getHitRect(g6Var.F1);
                    if (!g6Var.F1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g6Var.D1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                yf.l0 l0Var = (yf.l0) this.f16398b;
                l0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = l0Var.N1) != null && o1Var2.isShowing()) {
                    view.getHitRect(l0Var.P1);
                    if (!l0Var.P1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l0Var.N1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
