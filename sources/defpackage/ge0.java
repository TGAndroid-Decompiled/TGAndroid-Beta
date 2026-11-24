package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class ge0 extends ImageView {
    public long a;
    public final he0 b;

    public ge0(he0 he0Var, Activity activity) {
        super(activity);
        this.b = he0Var;
        this.a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qac qacVar;
        int action = motionEvent.getAction();
        he0 he0Var = this.b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.a + 350) {
                return false;
            }
            this.a = System.currentTimeMillis();
            he0Var.b = true;
            he0Var.c = false;
            gm.d3(new eh(he0Var, 350, (byte) 8), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            he0Var.b = false;
            if (!he0Var.c && (qacVar = he0Var.d) != null) {
                qacVar.a(Boolean.FALSE);
                try {
                    he0Var.a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
