package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class h extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        w51 J = w51.J(h.class);
        J.d = i10;
        J.f29961z = i11;
        J.f29947k = i12;
        J.f29948l = charSequence;
        J.f29949m = str;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((i) view).a(w51Var.f29961z, w51Var.f29947k, w51Var.f29948l, w51Var.f29949m);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new i(context, f6Var);
    }
}
