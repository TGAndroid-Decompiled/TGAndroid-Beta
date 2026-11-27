package defpackage;

import android.view.View;
import android.view.ViewGroup;
public final class zt5 extends n8 {
    public final ViewGroup o;
    public final fu5 p;

    public zt5(fu5 fu5Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = fu5Var;
        this.o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        fu5 fu5Var = this.p;
        fu5Var.v(viewGroup);
        Runnable runnable = fu5Var.p;
        if (runnable != null) {
            runnable.run();
            fu5Var.p = null;
        }
    }
}
