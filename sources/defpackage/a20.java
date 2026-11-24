package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
public final class a20 extends av9 {
    public final i20 n0;

    public a20(i20 i20Var, Activity activity, wjb wjbVar) {
        super(wjbVar, activity, false);
        this.n0 = i20Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
