package defpackage;

import android.content.Context;
public final class a46 extends ok8 {
    public final l46 S;

    public a46(l46 l46Var, Context context, vnb vnbVar) {
        super(vnbVar, context, true);
        this.S = l46Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.a2) {
            return;
        }
        super.invalidate();
    }
}
