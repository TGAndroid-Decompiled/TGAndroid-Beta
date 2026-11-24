package defpackage;

import android.content.Context;
import android.view.View;
public final class ez9 extends pj8 {
    public final fz9 N;

    public ez9(fz9 fz9Var, Context context) {
        super(2, null, context);
        this.N = fz9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        fz9 fz9Var = this.N;
        if (fz9Var.getParent() instanceof View) {
            ((View) fz9Var.getParent()).invalidate();
        }
    }
}
