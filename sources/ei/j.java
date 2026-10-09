package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class j extends o61 {
    static {
        o61.setup(new o61());
    }

    public static p61 a(int i10, String str, String str2) {
        p61 J = p61.J(j.class);
        J.f29733k = i10;
        J.f29734l = str;
        J.f29735m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((k) view).a(p61Var.f29734l, p61Var.f29735m, p61Var.f29733k);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new k(context, e6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
