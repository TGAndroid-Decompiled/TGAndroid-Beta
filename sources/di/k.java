package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class k extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, String str, String str2) {
        v51 J = v51.J(k.class);
        J.f27828k = i10;
        J.f27829l = str;
        J.f27830m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((l) view).a(v51Var.f27829l, v51Var.f27830m, v51Var.f27828k);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new l(context, f6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
