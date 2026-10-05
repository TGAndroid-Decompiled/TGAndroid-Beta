package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.nw0;
public final class g5 implements View.OnTouchListener {
    public final int f5110a;
    public final nw0 f5111b;

    public g5(nw0 nw0Var, int i10) {
        this.f5110a = i10;
        this.f5111b = nw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f5110a) {
            case 0:
                q6 q6Var = (q6) this.f5111b;
                q6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = q6Var.H1) != null && n1Var.isShowing()) {
                    view.getHitRect(q6Var.J1);
                    if (!q6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q6Var.H1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                qg.m0 m0Var = (qg.m0) this.f5111b;
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
