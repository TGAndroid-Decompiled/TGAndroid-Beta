package defpackage;

import android.app.Activity;
import android.content.Context;
public final class ne1 extends re1 {
    public final byte K = 0;
    public final c79 L;

    public ne1(oe1 oe1Var, Activity activity, vnb vnbVar) {
        super(activity, vnbVar);
        this.L = oe1Var;
        this.a = true;
    }

    @Override
    public final String getUsernameEditable() {
        byte b = this.K;
        c79 c79Var = this.L;
        switch (b) {
            case 0:
                return ((oe1) c79Var).c.r;
            default:
                m7 m7Var = ((t92) c79Var).c.i3.b;
                if (m7Var == null) {
                    return null;
                }
                return m7Var.getText().toString();
        }
    }

    public ne1(t92 t92Var, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.L = t92Var;
    }
}
