package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class x4 extends m41 {
    static {
        m41.setup(new x4());
    }

    public static n41 a(String str) {
        n41 n41VarJ = n41.J(x4.class);
        n41VarJ.f30844l = str;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((y4) view).set(n41Var.f30844l);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y4(context, c6Var);
    }
}
