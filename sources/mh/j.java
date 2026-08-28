package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class j extends k41 {
    static {
        k41.setup(new k41());
    }

    public static l41 a(int i9, String str, String str2) {
        l41 J = l41.J(j.class);
        J.f30338k = i9;
        J.f30339l = str;
        J.f30340m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((k) view).a(l41Var.f30339l, l41Var.f30340m, l41Var.f30338k);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new k(context, b6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
