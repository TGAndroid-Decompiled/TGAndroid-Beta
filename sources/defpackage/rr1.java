package defpackage;

import android.content.Context;
public final class rr1 extends fv1 {
    public final zu1 N;

    public rr1(zu1 zu1Var, Context context, vnb vnbVar, kq1 kq1Var, ll0 ll0Var) {
        super(context, vnbVar, kq1Var, ll0Var);
        this.N = zu1Var;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        ykf ykfVar = this.N.xd;
        boolean z2 = false;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getMeasuredWidth() > 0) {
            z2 = true;
        }
        ykfVar.s(3, z, z2);
    }
}
