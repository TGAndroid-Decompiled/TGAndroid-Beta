package fi;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ww0;
public final class w4 implements View.OnTouchListener {
    public final int f11850a;
    public final ww0 f11851b;

    public w4(ww0 ww0Var, int i10) {
        this.f11850a = i10;
        this.f11851b = ww0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f11850a) {
            case 0:
                e6 e6Var = (e6) this.f11851b;
                e6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = e6Var.f10821w1) != null && o1Var.isShowing()) {
                    view.getHitRect(e6Var.f10825y1);
                    if (!e6Var.f10825y1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        e6Var.f10821w1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                sg.n0 n0Var = (sg.n0) this.f11851b;
                n0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = n0Var.G1) != null && o1Var2.isShowing()) {
                    view.getHitRect(n0Var.I1);
                    if (!n0Var.I1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        n0Var.G1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
