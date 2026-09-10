package bi;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.bw0;
public final class d6 implements View.OnTouchListener {
    public final int f2547a;
    public final bw0 f2548b;

    public d6(bw0 bw0Var, int i10) {
        this.f2547a = i10;
        this.f2548b = bw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f2547a) {
            case 0:
                r7 r7Var = (r7) this.f2548b;
                r7Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = r7Var.H1) != null && p1Var.isShowing()) {
                    view.getHitRect(r7Var.J1);
                    if (!r7Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r7Var.H1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                pg.m0 m0Var = (pg.m0) this.f2548b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = m0Var.R1) != null && p1Var2.isShowing()) {
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
