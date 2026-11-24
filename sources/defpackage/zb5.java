package defpackage;

import android.app.Activity;
public final class zb5 extends i46 {
    public final ac5 S2;

    public zb5(ac5 ac5Var, ac5 ac5Var2, Activity activity, int i, int i2, ylb ylbVar) {
        super(i, i2, ylbVar, activity, ac5Var2);
        this.S2 = ac5Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S2.C0 = false;
    }

    @Override
    public final void w() {
        this.S2.C0 = false;
    }
}
