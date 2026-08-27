package hh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class e0 extends m41 {
    static {
        m41.setup(new e0());
    }

    public static n41 a(String str, CharSequence charSequence, int i10) {
        n41 n41VarJ = n41.J(e0.class);
        n41VarJ.f49414b = false;
        n41VarJ.f30857z = i10;
        n41VarJ.f30844l = str;
        n41VarJ.f30845m = charSequence;
        return n41VarJ;
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((f0) view).a(n41Var.f30844l, n41Var.f30845m, n41Var.f30857z);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new f0(context, 0, c6Var);
    }
}
