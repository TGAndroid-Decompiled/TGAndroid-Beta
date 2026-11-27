package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class e04 extends ImageView {
    public final o24 a;

    public e04(o24 o24Var, Context context) {
        super(context);
        this.a = o24Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p14 p14Var;
        int action = motionEvent.getAction();
        o24 o24Var = this.a;
        if (action == 0) {
            o24Var.Q1 = true;
            o24Var.R1 = false;
            hl.d3(new hl3(o24Var, 350, (byte) 4), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            o24Var.Q1 = false;
            if (!o24Var.R1 && (p14Var = o24Var.u1) != null && p14Var.l()) {
                try {
                    o24Var.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
