package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class j extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, String str, String str2) {
        h61 J = h61.J(j.class);
        J.f26784k = i10;
        J.f26785l = str;
        J.f26786m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((k) view).a(h61Var.f26785l, h61Var.f26786m, h61Var.f26784k);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
