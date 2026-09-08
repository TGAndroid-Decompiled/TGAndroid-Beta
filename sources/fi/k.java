package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class k extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, String str, String str2) {
        h51 J = h51.J(k.class);
        J.f26620k = i10;
        J.f26621l = str;
        J.f26622m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((l) view).a(h51Var.f26621l, h51Var.f26622m, h51Var.f26620k);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new l(context, f6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
