package defpackage;

import android.content.Context;
public final class gab extends ri5 {
    public final oab a;

    public gab(oab oabVar, Context context) {
        super(context);
        this.a = oabVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c40 c40Var = this.a.G0;
        if (c40Var != null) {
            c40Var.m();
        }
    }
}
