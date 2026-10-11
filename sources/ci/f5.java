package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.vw0;
public final class f5 implements View.OnTouchListener {
    public final int f5067a;
    public final vw0 f5068b;

    public f5(vw0 vw0Var, int i10) {
        this.f5067a = i10;
        this.f5068b = vw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f5067a) {
            case 0:
                q6 q6Var = (q6) this.f5068b;
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
                qg.m0 m0Var = (qg.m0) this.f5068b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = m0Var.R1) != null && m1Var2.isShowing()) {
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
