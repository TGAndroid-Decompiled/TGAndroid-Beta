package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class i extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        v51 J = v51.J(i.class);
        J.d = i10;
        J.f27842z = i11;
        J.f27828k = i12;
        J.f27829l = charSequence;
        J.f27830m = str;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((j) view).a(v51Var.f27842z, v51Var.f27828k, v51Var.f27829l, v51Var.f27830m);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var);
    }
}
