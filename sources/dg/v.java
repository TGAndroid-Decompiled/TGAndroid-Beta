package dg;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.rv0;
import ph.c5;
public final class v implements View.OnTouchListener {
    public final int f4820a;
    public final rv0 f4821b;

    public v(rv0 rv0Var, int i10) {
        this.f4820a = i10;
        this.f4821b = rv0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        org.telegram.ui.ActionBar.p1 p1Var2;
        switch (this.f4820a) {
            case 0:
                e1 e1Var = (e1) this.f4821b;
                e1Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var = e1Var.O1) != null && p1Var.isShowing()) {
                    view.getHitRect(e1Var.Q1);
                    if (!e1Var.Q1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        e1Var.O1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                c5 c5Var = (c5) this.f4821b;
                c5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (p1Var2 = c5Var.E1) != null && p1Var2.isShowing()) {
                    view.getHitRect(c5Var.G1);
                    if (!c5Var.G1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        c5Var.E1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
