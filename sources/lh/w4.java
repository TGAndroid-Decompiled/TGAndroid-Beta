package lh;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.av0;

public final class w4 implements View.OnTouchListener {

    public final int f17008a;

    public final av0 f17009b;

    public w4(av0 av0Var, int i10) {
        this.f17008a = i10;
        this.f17009b = av0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.f17008a) {
            case 0:
                f6 f6Var = (f6) this.f17009b;
                f6Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var = f6Var.D1) != null && n1Var.isShowing()) {
                    view.getHitRect(f6Var.F1);
                    if (!f6Var.F1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        f6Var.D1.d(true);
                    }
                    break;
                }
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.f17009b;
                l0Var.getClass();
                if (motionEvent.getActionMasked() == 0 && (n1Var2 = l0Var.N1) != null && n1Var2.isShowing()) {
                    view.getHitRect(l0Var.P1);
                    if (!l0Var.P1.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l0Var.N1.d(true);
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
