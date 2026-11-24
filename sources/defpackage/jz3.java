package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class jz3 extends ImageView {
    public final t14 a;

    public jz3(t14 t14Var, Context context) {
        super(context);
        this.a = t14Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u04 u04Var;
        int action = motionEvent.getAction();
        t14 t14Var = this.a;
        if (action == 0) {
            t14Var.Q1 = true;
            t14Var.R1 = false;
            gl.d3(new sm3(t14Var, 350, (byte) 3), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            t14Var.Q1 = false;
            if (!t14Var.R1 && (u04Var = t14Var.u1) != null && u04Var.l()) {
                try {
                    t14Var.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
