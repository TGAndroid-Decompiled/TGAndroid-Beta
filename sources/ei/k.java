package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class k extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, String str, String str2) {
        g61 J = g61.J(k.class);
        J.f26667k = i10;
        J.f26668l = str;
        J.f26669m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ((l) view).a(g61Var.f26668l, g61Var.f26669m, g61Var.f26667k);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new l(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
