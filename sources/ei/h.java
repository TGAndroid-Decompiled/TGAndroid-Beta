package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class h extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        i51 J = i51.J(h.class);
        J.d = i10;
        J.f24907z = i11;
        J.f24893k = i12;
        J.f24894l = charSequence;
        J.f24895m = str;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        ((i) view).a(i51Var.f24907z, i51Var.f24893k, i51Var.f24894l, i51Var.f24895m);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new i(context, e6Var);
    }
}
