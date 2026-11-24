package defpackage;

import android.content.Context;
public final class er1 extends su1 {
    public final mu1 M;

    public er1(mu1 mu1Var, Context context, wjb wjbVar, wp1 wp1Var, kl0 kl0Var) {
        super(context, wjbVar, wp1Var, kl0Var);
        this.M = mu1Var;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        igf igfVar = this.M.kd;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getMeasuredWidth() > 0) {
            z2 = true;
        }
        igfVar.s(3, z, z2);
    }
}
