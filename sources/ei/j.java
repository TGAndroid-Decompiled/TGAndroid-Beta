package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class j extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, String str, String str2) {
        i51 J = i51.J(j.class);
        J.f24899k = i10;
        J.f24900l = str;
        J.f24901m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        ((k) view).a(i51Var.f24900l, i51Var.f24901m, i51Var.f24899k);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new k(context, e6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
