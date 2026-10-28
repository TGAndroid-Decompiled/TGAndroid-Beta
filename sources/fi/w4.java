package fi;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.xw0;
public final class w4 implements View.OnTouchListener {
    public final int f11849a;
    public final xw0 f11850b;

    public w4(xw0 xw0Var, int i10) {
        this.f11849a = i10;
        this.f11850b = xw0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f11849a) {
            case 0:
                e6 e6Var = (e6) this.f11850b;
                e6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = e6Var.f10820w1) != null && o1Var.isShowing()) {
                    view.getHitRect(e6Var.f10824y1);
                    if (!e6Var.f10824y1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        e6Var.f10820w1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                sg.m0 m0Var = (sg.m0) this.f11850b;
                m0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = m0Var.G1) != null && o1Var2.isShowing()) {
                    view.getHitRect(m0Var.I1);
                    if (!m0Var.I1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m0Var.G1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
