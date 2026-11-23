package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class t4 implements View.OnTouchListener {
    public final int f15436a;
    public final FrameLayout f15437b;

    public t4(int i7, FrameLayout frameLayout) {
        this.f15436a = i7;
        this.f15437b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        switch (this.f15436a) {
            case 0:
                v5 v5Var = (v5) this.f15437b;
                v5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = v5Var.f15587r1) != null && g1Var.isShowing()) {
                    view.getHitRect(v5Var.f15591t1);
                    if (!v5Var.f15591t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        v5Var.f15587r1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f15437b;
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
                tg.l0 l0Var = (tg.l0) this.f15437b;
                l0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = l0Var.B1) != null && g1Var3.isShowing()) {
                    view.getHitRect(l0Var.D1);
                    if (!l0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l0Var.B1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
