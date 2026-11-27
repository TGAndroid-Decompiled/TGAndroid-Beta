package defpackage;

import android.content.Context;
public final class dcb extends ui5 {
    public final lcb a;

    public dcb(lcb lcbVar, Context context) {
        super(context);
        this.a = lcbVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d30 d30Var = this.a.G0;
        if (d30Var != null) {
            d30Var.m();
        }
    }
}
