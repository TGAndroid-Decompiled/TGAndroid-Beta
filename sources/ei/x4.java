package ei;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.pw0;
public final class x4 implements View.OnTouchListener {
    public final int f10117a;
    public final pw0 f10118b;

    public x4(pw0 pw0Var, int i10) {
        this.f10117a = i10;
        this.f10118b = pw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f10117a) {
            case 0:
                f6 f6Var = (f6) this.f10118b;
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
                rg.m0 m0Var = (rg.m0) this.f10118b;
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
