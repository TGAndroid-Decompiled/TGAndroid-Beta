package gi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class k4 implements View.OnTouchListener {
    public final int f13032a;
    public final FrameLayout f13033b;

    public k4(int i3, FrameLayout frameLayout) {
        this.f13032a = i3;
        this.f13033b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        org.telegram.ui.ActionBar.f1 f1Var3;
        switch (this.f13032a) {
            case 0:
                m5 m5Var = (m5) this.f13033b;
                m5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (f1Var = m5Var.f13226r1) != null && f1Var.isShowing()) {
                    view.getHitRect(m5Var.f13230t1);
                    if (!m5Var.f13230t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m5Var.f13226r1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f13033b;
                q0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (f1Var2 = q0Var.d) != null && f1Var2.isShowing()) {
                    view.getHitRect(q0Var.J);
                    if (!q0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        q0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                ug.f0 f0Var = (ug.f0) this.f13033b;
                f0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (f1Var3 = f0Var.B1) != null && f1Var3.isShowing()) {
                    view.getHitRect(f0Var.D1);
                    if (!f0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        f0Var.B1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
