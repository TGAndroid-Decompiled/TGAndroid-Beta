package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class h extends k41 {
    static {
        k41.setup(new k41());
    }

    public static l41 a(int i9, int i10, int i11, CharSequence charSequence, String str) {
        l41 J = l41.J(h.class);
        J.d = i9;
        J.f30352z = i10;
        J.f30338k = i11;
        J.f30339l = charSequence;
        J.f30340m = str;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((i) view).a(l41Var.f30352z, l41Var.f30338k, l41Var.f30339l, l41Var.f30340m);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new i(context, b6Var);
    }
}
