package defpackage;

import android.view.View;
import android.view.ViewGroup;
public final class xr5 extends m8 {
    public final ViewGroup o;
    public final cs5 p;

    public xr5(cs5 cs5Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = cs5Var;
        this.o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        cs5 cs5Var = this.p;
        cs5Var.v(viewGroup);
        Runnable runnable = cs5Var.p;
        if (runnable != null) {
            runnable.run();
            cs5Var.p = null;
        }
    }
}
