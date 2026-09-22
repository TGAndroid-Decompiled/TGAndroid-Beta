package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class j extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(int i10, String str, String str2) {
        y51 J = y51.J(j.class);
        J.f30517k = i10;
        J.f30518l = str;
        J.f30519m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((k) view).a(y51Var.f30518l, y51Var.f30519m, y51Var.f30517k);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new k(context, f6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
