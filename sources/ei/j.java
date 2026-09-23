package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class j extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, String str, String str2) {
        h51 J = h51.J(j.class);
        J.f24506k = i10;
        J.f24507l = str;
        J.f24508m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((k) view).a(h51Var.f24507l, h51Var.f24508m, h51Var.f24506k);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
