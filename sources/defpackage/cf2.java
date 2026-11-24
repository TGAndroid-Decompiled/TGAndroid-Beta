package defpackage;

import android.app.Activity;
public final class cf2 extends wv4 {
    public final kf2 m1;

    public cf2(kf2 kf2Var, Activity activity, kf2 kf2Var2) {
        super(activity, kf2Var2);
        this.m1 = kf2Var;
    }

    @Override
    public final void E0() {
        kf2 kf2Var = this.m1;
        kf2Var.getMessagesController().O(kf2Var.getParentActivity(), kf2Var.n, kf2Var, new rh1(this, (byte) 25));
    }
}
