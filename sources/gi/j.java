package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class j extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, String str, String str2) {
        g61 J = g61.J(j.class);
        J.f26498k = i10;
        J.f26499l = str;
        J.f26500m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((k) view).a(g61Var.f26499l, g61Var.f26500m, g61Var.f26498k);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
