package eg;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.rv0;
import qh.a5;
public final class u implements View.OnTouchListener {
    public final int f5498a;
    public final rv0 f5499b;

    public u(rv0 rv0Var, int i10) {
        this.f5498a = i10;
        this.f5499b = rv0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f5498a) {
            case 0:
                c1 c1Var = (c1) this.f5499b;
                c1Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = c1Var.O1) != null && p1Var.isShowing()) {
                    view.getHitRect(c1Var.Q1);
                    if (!c1Var.Q1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        c1Var.O1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                a5 a5Var = (a5) this.f5499b;
                a5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = a5Var.E1) != null && p1Var2.isShowing()) {
                    view.getHitRect(a5Var.G1);
                    if (!a5Var.G1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        a5Var.E1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
