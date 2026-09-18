package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.cw0;
public final class h5 implements View.OnTouchListener {
    public final int f4746a;
    public final cw0 f4747b;

    public h5(cw0 cw0Var, int i10) {
        this.f4746a = i10;
        this.f4747b = cw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f4746a) {
            case 0:
                r6 r6Var = (r6) this.f4747b;
                r6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = r6Var.H1) != null && n1Var.isShowing()) {
                    view.getHitRect(r6Var.J1);
                    if (!r6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r6Var.H1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                qg.m0 m0Var = (qg.m0) this.f4747b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = m0Var.R1) != null && n1Var2.isShowing()) {
                    view.getHitRect(m0Var.T1);
                    if (!m0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m0Var.R1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
