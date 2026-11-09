package fi;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class n4 implements View.OnTouchListener {
    public final int f12477a;
    public final FrameLayout f12478b;

    public n4(int i7, FrameLayout frameLayout) {
        this.f12477a = i7;
        this.f12478b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        org.telegram.ui.ActionBar.g1 g1Var3;
        switch (this.f12477a) {
            case 0:
                o5 o5Var = (o5) this.f12478b;
                o5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var = o5Var.f12540q1) != null && g1Var.isShowing()) {
                    view.getHitRect(o5Var.f12544s1);
                    if (!o5Var.f12544s1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o5Var.f12540q1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f12478b;
                r0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var2 = r0Var.d) != null && g1Var2.isShowing()) {
                    view.getHitRect(r0Var.I);
                    if (!r0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                tg.g0 g0Var = (tg.g0) this.f12478b;
                g0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (g1Var3 = g0Var.A1) != null && g1Var3.isShowing()) {
                    view.getHitRect(g0Var.C1);
                    if (!g0Var.C1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g0Var.A1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
