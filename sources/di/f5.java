package di;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.pw0;
public final class f5 implements View.OnTouchListener {
    public final int f6942a;
    public final pw0 f6943b;

    public f5(pw0 pw0Var, int i10) {
        this.f6942a = i10;
        this.f6943b = pw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f6942a) {
            case 0:
                o6 o6Var = (o6) this.f6943b;
                o6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var = o6Var.H1) != null && m1Var.isShowing()) {
                    view.getHitRect(o6Var.J1);
                    if (!o6Var.J1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o6Var.H1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                rg.o0 o0Var = (rg.o0) this.f6943b;
                o0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (m1Var2 = o0Var.R1) != null && m1Var2.isShowing()) {
                    view.getHitRect(o0Var.T1);
                    if (!o0Var.T1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        o0Var.R1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
