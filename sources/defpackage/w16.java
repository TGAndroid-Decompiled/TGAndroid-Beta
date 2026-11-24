package defpackage;

import android.content.Context;
public final class w16 extends ah8 {
    public final h26 S;

    public w16(h26 h26Var, Context context, wjb wjbVar) {
        super(wjbVar, context, true);
        this.S = h26Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.a2) {
            return;
        }
        super.invalidate();
    }
}
