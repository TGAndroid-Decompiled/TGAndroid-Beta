package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.qv0;
public final class g5 implements View.OnTouchListener {
    public final int f4722a;
    public final qv0 f4723b;

    public g5(qv0 qv0Var, int i10) {
        this.f4722a = i10;
        this.f4723b = qv0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f4722a) {
            case 0:
                q6 q6Var = (q6) this.f4723b;
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
                qg.p0 p0Var = (qg.p0) this.f4723b;
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
