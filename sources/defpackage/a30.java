package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
public final class a30 extends dx9 {
    public final i30 n0;

    public a30(i30 i30Var, Activity activity, ylb ylbVar) {
        super(ylbVar, activity, false);
        this.n0 = i30Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
