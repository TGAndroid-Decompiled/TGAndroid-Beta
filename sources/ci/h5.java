package ci;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.bw0;
public final class h5 implements View.OnTouchListener {
    public final int f4747a;
    public final bw0 f4748b;

    public h5(bw0 bw0Var, int i10) {
        this.f4747a = i10;
        this.f4748b = bw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f4747a) {
            case 0:
                r6 r6Var = (r6) this.f4748b;
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
                qg.n0 n0Var = (qg.n0) this.f4748b;
                n0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = n0Var.R1) != null && n1Var2.isShowing()) {
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
