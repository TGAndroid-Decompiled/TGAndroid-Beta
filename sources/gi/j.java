package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class j extends e61 {
    static {
        e61.setup(new e61());
    }

    public static f61 a(int i10, String str, String str2) {
        f61 J = f61.J(j.class);
        J.f26139k = i10;
        J.f26140l = str;
        J.f26141m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ((k) view).a(f61Var.f26140l, f61Var.f26141m, f61Var.f26139k);
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
