package defpackage;

import android.app.Activity;
import android.content.Context;
public final class mf1 extends qf1 {
    public final byte K = 0;
    public final q59 L;

    public mf1(nf1 nf1Var, Activity activity, ylb ylbVar) {
        super(activity, ylbVar);
        this.L = nf1Var;
        this.a = true;
    }

    @Override
    public final String getUsernameEditable() {
        byte b = this.K;
        q59 q59Var = this.L;
        switch (b) {
            case 0:
                return ((nf1) q59Var).c.r;
            default:
                l7 l7Var = ((oa2) q59Var).c.i3.b;
                if (l7Var == null) {
                    return null;
                }
                return l7Var.getText().toString();
        }
    }

    public mf1(oa2 oa2Var, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.L = oa2Var;
    }
}
