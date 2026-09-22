package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.qv0;
public final class h5 implements View.OnTouchListener {
    public final int f4743a;
    public final qv0 f4744b;

    public h5(qv0 qv0Var, int i10) {
        this.f4743a = i10;
        this.f4744b = qv0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f4743a) {
            case 0:
                r6 r6Var = (r6) this.f4744b;
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
                qg.p0 p0Var = (qg.p0) this.f4744b;
                p0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = p0Var.R1) != null && n1Var2.isShowing()) {
                    view.getHitRect(p0Var.T1);
                    if (!p0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        p0Var.R1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
