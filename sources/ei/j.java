package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class j extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(int i10, String str, String str2) {
        y51 J = y51.J(j.class);
        J.f30636k = i10;
        J.f30637l = str;
        J.f30638m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((k) view).a(y51Var.f30637l, y51Var.f30638m, y51Var.f30636k);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
