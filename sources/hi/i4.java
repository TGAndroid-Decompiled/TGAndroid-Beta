package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class i4 implements View.OnTouchListener {
    public final int f14788a;
    public final FrameLayout f14789b;

    public i4(int i7, FrameLayout frameLayout) {
        this.f14788a = i7;
        this.f14789b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        switch (this.f14788a) {
            case 0:
                k5 k5Var = (k5) this.f14789b;
                k5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = k5Var.f14901r1) != null && g1Var.isShowing()) {
                    view.getHitRect(k5Var.f14905t1);
                    if (!k5Var.f14905t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        k5Var.f14901r1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f14789b;
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
                tg.h0 h0Var = (tg.h0) this.f14789b;
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
