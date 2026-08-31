package eg;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.sv0;
import qh.b5;
public final class u implements View.OnTouchListener {
    public final int f5498a;
    public final sv0 f5499b;

    public u(sv0 sv0Var, int i10) {
        this.f5498a = i10;
        this.f5499b = sv0Var;
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
                b5 b5Var = (b5) this.f5499b;
                b5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = b5Var.E1) != null && p1Var2.isShowing()) {
                    view.getHitRect(b5Var.G1);
                    if (!b5Var.G1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        b5Var.E1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
