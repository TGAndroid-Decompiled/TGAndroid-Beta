package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class j extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, String str, String str2) {
        w51 J = w51.J(j.class);
        J.f29947k = i10;
        J.f29948l = str;
        J.f29949m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((k) view).a(w51Var.f29948l, w51Var.f29949m, w51Var.f29947k);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new k(context, f6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
