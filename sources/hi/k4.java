package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class k4 implements View.OnTouchListener {
    public final int f14501a;
    public final FrameLayout f14502b;

    public k4(int i7, FrameLayout frameLayout) {
        this.f14501a = i7;
        this.f14502b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        switch (this.f14501a) {
            case 0:
                m5 m5Var = (m5) this.f14502b;
                m5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = m5Var.f14687r1) != null && g1Var.isShowing()) {
                    view.getHitRect(m5Var.f14691t1);
                    if (!m5Var.f14691t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m5Var.f14687r1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f14502b;
                q0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = q0Var.d) != null && g1Var2.isShowing()) {
                    view.getHitRect(q0Var.J);
                    if (!q0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                tg.g0 g0Var = (tg.g0) this.f14502b;
                g0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = g0Var.B1) != null && g1Var3.isShowing()) {
                    view.getHitRect(g0Var.D1);
                    if (!g0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g0Var.B1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
