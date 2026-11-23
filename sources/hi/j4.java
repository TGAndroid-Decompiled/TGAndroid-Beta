package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class j4 implements View.OnTouchListener {
    public final int f14764a;
    public final FrameLayout f14765b;

    public j4(int i7, FrameLayout frameLayout) {
        this.f14764a = i7;
        this.f14765b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        switch (this.f14764a) {
            case 0:
                l5 l5Var = (l5) this.f14765b;
                l5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = l5Var.f14913r1) != null && g1Var.isShowing()) {
                    view.getHitRect(l5Var.f14917t1);
                    if (!l5Var.f14917t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l5Var.f14913r1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f14765b;
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
                tg.h0 h0Var = (tg.h0) this.f14765b;
                h0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = h0Var.B1) != null && g1Var3.isShowing()) {
                    view.getHitRect(h0Var.D1);
                    if (!h0Var.D1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        h0Var.B1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
