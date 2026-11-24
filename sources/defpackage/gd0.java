package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.ImageView;
public final class gd0 extends ImageView {
    public long a;
    public final hd0 b;

    public gd0(hd0 hd0Var, Activity activity) {
        super(activity);
        this.b = hd0Var;
        this.a = 0L;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p8c p8cVar;
        int action = motionEvent.getAction();
        hd0 hd0Var = this.b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.a + 350) {
                return false;
            }
            this.a = System.currentTimeMillis();
            hd0Var.b = true;
            hd0Var.c = false;
            gl.e3(new eg(hd0Var, 350, (byte) 8), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            hd0Var.b = false;
            if (!hd0Var.c && (p8cVar = hd0Var.d) != null) {
                p8cVar.a(Boolean.FALSE);
                try {
                    hd0Var.a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
