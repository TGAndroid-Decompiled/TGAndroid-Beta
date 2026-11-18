package hi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class j4 implements View.OnTouchListener {
    public final int f14807a;
    public final FrameLayout f14808b;

    public j4(int i7, FrameLayout frameLayout) {
        this.f14807a = i7;
        this.f14808b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        org.telegram.ui.ActionBar.h1 h1Var2;
        org.telegram.ui.ActionBar.h1 h1Var3;
        switch (this.f14807a) {
            case 0:
                l5 l5Var = (l5) this.f14808b;
                l5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (h1Var = l5Var.f14923r1) != null && h1Var.isShowing()) {
                    view.getHitRect(l5Var.f14927t1);
                    if (!l5Var.f14927t1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l5Var.f14923r1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f14808b;
                r0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (h1Var2 = r0Var.d) != null && h1Var2.isShowing()) {
                    view.getHitRect(r0Var.J);
                    if (!r0Var.J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                tg.g0 g0Var = (tg.g0) this.f14808b;
                g0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (h1Var3 = g0Var.B1) != null && h1Var3.isShowing()) {
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
