package jh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class m0 extends m41 {

    public static final int f13647a = 0;

    static {
        m41.setup(new m0());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((n0) view).set((s0) n41Var.G);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        n0 n0Var = new n0(i10, context, false);
        n0Var.setLayoutParams(new f2.y0(-2, -2));
        return n0Var;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.G == n41Var2.G;
    }
}
