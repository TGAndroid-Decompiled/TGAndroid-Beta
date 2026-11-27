package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class id0 extends ImageView {
    public long a;
    public final jd0 b;

    public id0(jd0 jd0Var, Activity activity) {
        super(activity);
        this.b = jd0Var;
        this.a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pcc pccVar;
        int action = motionEvent.getAction();
        jd0 jd0Var = this.b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.a + 350) {
                return false;
            }
            this.a = System.currentTimeMillis();
            jd0Var.b = true;
            jd0Var.c = false;
            hl.d3(new zd(jd0Var, 350, (byte) 8), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            jd0Var.b = false;
            if (!jd0Var.c && (pccVar = jd0Var.d) != null) {
                pccVar.a(Boolean.FALSE);
                try {
                    jd0Var.a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
