package defpackage;

import android.view.View;
import android.view.ViewGroup;
public final class wt5 extends m8 {
    public final ViewGroup o;
    public final bu5 p;

    public wt5(bu5 bu5Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = bu5Var;
        this.o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        bu5 bu5Var = this.p;
        bu5Var.v(viewGroup);
        Runnable runnable = bu5Var.p;
        if (runnable != null) {
            runnable.run();
            bu5Var.p = null;
        }
    }
}
