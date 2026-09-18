package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class j extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, String str, String str2) {
        j51 J = j51.J(j.class);
        J.f25126k = i10;
        J.f25127l = str;
        J.f25128m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        ((k) view).a(j51Var.f25127l, j51Var.f25128m, j51Var.f25126k);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new k(context, f6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
