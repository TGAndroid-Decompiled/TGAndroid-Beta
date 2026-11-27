package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
public final class b20 extends uy9 {
    public final j20 n0;

    public b20(j20 j20Var, Activity activity, vnb vnbVar) {
        super(vnbVar, activity, false);
        this.n0 = j20Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
