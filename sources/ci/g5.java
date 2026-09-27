package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.dw0;
public final class g5 implements View.OnTouchListener {
    public final int f4729a;
    public final dw0 f4730b;

    public g5(dw0 dw0Var, int i10) {
        this.f4729a = i10;
        this.f4730b = dw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f4729a) {
            case 0:
                q6 q6Var = (q6) this.f4730b;
                q6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = q6Var.H1) != null && o1Var.isShowing()) {
                    view.getHitRect(q6Var.J1);
                    if (!q6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q6Var.H1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                qg.m0 m0Var = (qg.m0) this.f4730b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = m0Var.R1) != null && o1Var2.isShowing()) {
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
