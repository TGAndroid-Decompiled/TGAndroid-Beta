package defpackage;

import android.app.Activity;
import android.content.Context;
public final class ee1 extends ie1 {
    public final byte K = 1;
    public final n39 L;

    public ee1(fe1 fe1Var, Activity activity, wjb wjbVar) {
        super(activity, wjbVar);
        this.L = fe1Var;
        this.a = true;
    }

    @Override
    public final String getUsernameEditable() {
        byte b = this.K;
        n39 n39Var = this.L;
        switch (b) {
            case 0:
                return ((fe1) n39Var).c.r;
            default:
                l7 l7Var = ((d92) n39Var).c.i3.b;
                if (l7Var == null) {
                    return null;
                }
                return l7Var.getText().toString();
        }
    }

    public ee1(d92 d92Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.L = d92Var;
    }
}
