package jh;

import android.content.Context;

public final class a9 extends v {

    public final i9 f13064a;

    public a9(Context context, i9 i9Var) {
        super(context);
        this.f13064a = i9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d4 d4Var = this.f13064a.C0;
        if (d4Var != null) {
            d4Var.a();
        }
    }
}
