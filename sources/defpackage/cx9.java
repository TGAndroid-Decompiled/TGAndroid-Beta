package defpackage;

import android.content.Context;
import android.view.View;
public final class cx9 extends oh8 {
    public final dx9 N;

    public cx9(dx9 dx9Var, Context context) {
        super(2, null, context);
        this.N = dx9Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        dx9 dx9Var = this.N;
        if (dx9Var.getParent() instanceof View) {
            ((View) dx9Var.getParent()).invalidate();
        }
    }
}
