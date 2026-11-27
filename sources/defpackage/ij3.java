package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class ij3 extends fg4 {
    public final uj3 I0;

    public ij3(uj3 uj3Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.I0 = uj3Var;
    }

    @Override
    public final void g() {
        uj3 uj3Var = this.I0;
        if (!uj3Var.getMessagesController().M3()) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            v21 J = d31.b0(uj3Var).J(2131624018, hl.S2(ob6.a0(null, null, 2131748698, ob6.M0(2131750772, null))), ob6.M0(2131746762, null), 5000, false, new zg3(this, (byte) 7));
            J.k(true);
            uj3Var.q3 = J;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.I0.p3 = false;
        return super.onInterceptTouchEvent(motionEvent);
    }
}
