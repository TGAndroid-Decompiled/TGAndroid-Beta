package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.cw0;
public final class g5 implements View.OnTouchListener {
    public final int f4722a;
    public final cw0 f4723b;

    public g5(cw0 cw0Var, int i10) {
        this.f4722a = i10;
        this.f4723b = cw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f4722a) {
            case 0:
                q6 q6Var = (q6) this.f4723b;
                q6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var = q6Var.H1) != null && m1Var.isShowing()) {
                    view.getHitRect(q6Var.J1);
                    if (!q6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q6Var.H1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                qg.n0 n0Var = (qg.n0) this.f4723b;
                n0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = n0Var.R1) != null && m1Var2.isShowing()) {
                    view.getHitRect(n0Var.T1);
                    if (!n0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n0Var.R1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
