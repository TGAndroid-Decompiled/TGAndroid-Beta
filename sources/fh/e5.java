package fh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class e5 extends k41 {
    static {
        k41.setup(new k41());
    }

    public static l41 a(String str) {
        l41 J = l41.J(e5.class);
        J.f30339l = str;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((f5) view).set(l41Var.f30339l);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new f5(context, b6Var);
    }
}
