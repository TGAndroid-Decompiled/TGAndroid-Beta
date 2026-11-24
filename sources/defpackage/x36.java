package defpackage;

import android.content.Context;
public final class x36 extends cj8 {
    public final i46 S;

    public x36(i46 i46Var, Context context, ylb ylbVar) {
        super(ylbVar, context, true);
        this.S = i46Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.a2) {
            return;
        }
        super.invalidate();
    }
}
