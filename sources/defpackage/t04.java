package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class t04 extends ImageView {
    public final e34 a;

    public t04(e34 e34Var, Context context) {
        super(context);
        this.a = e34Var;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f24 f24Var;
        int action = motionEvent.getAction();
        e34 e34Var = this.a;
        if (action == 0) {
            e34Var.Q1 = true;
            e34Var.R1 = false;
            gm.d3(new bm3(e34Var, 350, (byte) 4), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            e34Var.Q1 = false;
            if (!e34Var.R1 && (f24Var = e34Var.u1) != null && f24Var.l()) {
                try {
                    e34Var.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
