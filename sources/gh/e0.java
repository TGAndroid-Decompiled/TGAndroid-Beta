package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class e0 extends k41 {
    static {
        k41.setup(new k41());
    }

    public static l41 a(String str, CharSequence charSequence, int i9) {
        l41 J = l41.J(e0.class);
        J.f48815b = false;
        J.f30352z = i9;
        J.f30339l = str;
        J.f30340m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((f0) view).a(l41Var.f30339l, l41Var.f30340m, l41Var.f30352z);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new f0(context, 0, b6Var);
    }
}
