package bg;

import android.view.MotionEvent;
import android.view.View;
import nh.t5;
import org.telegram.ui.Components.iv0;
public final class w implements View.OnTouchListener {
    public final int f2584a;
    public final iv0 f2585b;

    public w(iv0 iv0Var, int i10) {
        this.f2584a = i10;
        this.f2585b = iv0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.f2584a) {
            case 0:
                g1 g1Var = (g1) this.f2585b;
                g1Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var = g1Var.N1) != null && o1Var.isShowing()) {
                    view.getHitRect(g1Var.P1);
                    if (!g1Var.P1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g1Var.N1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                t5 t5Var = (t5) this.f2585b;
                t5Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (o1Var2 = t5Var.D1) != null && o1Var2.isShowing()) {
                    view.getHitRect(t5Var.F1);
                    if (!t5Var.F1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        t5Var.D1.d(true);
                        return false;
                    }
                    return false;
                }
                return false;
        }
    }
}
