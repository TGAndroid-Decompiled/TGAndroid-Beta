package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class j extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, String str, String str2) {
        v51 J = v51.J(j.class);
        J.f29041k = i10;
        J.f29042l = str;
        J.f29043m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((k) view).a(v51Var.f29042l, v51Var.f29043m, v51Var.f29041k);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
