package jg;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import vh.b4;
public final class r implements View.OnTouchListener {
    public final int f10162a;
    public final FrameLayout f10163b;

    public r(int i10, FrameLayout frameLayout) {
        this.f10162a = i10;
        this.f10163b = frameLayout;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        org.telegram.ui.ActionBar.k1 k1Var3;
        switch (this.f10162a) {
            case 0:
                r0 r0Var = (r0) this.f10163b;
                r0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (k1Var = r0Var.A1) != null && k1Var.isShowing()) {
                    view.getHitRect(r0Var.C1);
                    if (!r0Var.C1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        r0Var.A1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f10163b;
                t0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (k1Var2 = t0Var.d) != null && k1Var2.isShowing()) {
                    view.getHitRect(t0Var.I);
                    if (!t0Var.I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        t0Var.d.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                b4 b4Var = (b4) this.f10163b;
                b4Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (k1Var3 = b4Var.f50990q1) != null && k1Var3.isShowing()) {
                    view.getHitRect(b4Var.f50994s1);
                    if (!b4Var.f50994s1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        b4Var.f50990q1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
