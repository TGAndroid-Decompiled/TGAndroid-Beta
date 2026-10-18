package ei;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.kw0;
public final class x4 implements View.OnTouchListener {
    public final int f10103a;
    public final kw0 f10104b;

    public x4(kw0 kw0Var, int i10) {
        this.f10103a = i10;
        this.f10104b = kw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f10103a) {
            case 0:
                f6 f6Var = (f6) this.f10104b;
                f6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var = f6Var.H1) != null && m1Var.isShowing()) {
                    view.getHitRect(f6Var.J1);
                    if (!f6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        f6Var.H1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                rg.m0 m0Var = (rg.m0) this.f10104b;
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
