package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class j extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, String str, String str2) {
        w51 J = w51.J(j.class);
        J.f29894k = i10;
        J.f29895l = str;
        J.f29896m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((k) view).a(w51Var.f29895l, w51Var.f29896m, w51Var.f29894k);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
