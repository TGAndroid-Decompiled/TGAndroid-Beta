package di;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.pv0;
public final class h5 implements View.OnTouchListener {
    public final int f7318a;
    public final pv0 f7319b;

    public h5(pv0 pv0Var, int i10) {
        this.f7318a = i10;
        this.f7319b = pv0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f7318a) {
            case 0:
                q6 q6Var = (q6) this.f7319b;
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
                rg.o0 o0Var = (rg.o0) this.f7319b;
                o0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = o0Var.R1) != null && n1Var2.isShowing()) {
                    view.getHitRect(o0Var.T1);
                    if (!o0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o0Var.R1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
