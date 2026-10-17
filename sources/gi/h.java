package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class h extends e61 {
    static {
        e61.setup(new e61());
    }

    public static f61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        f61 J = f61.J(h.class);
        J.d = i10;
        J.f26153z = i11;
        J.f26139k = i12;
        J.f26140l = charSequence;
        J.f26141m = str;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ((i) view).a(f61Var.f26153z, f61Var.f26139k, f61Var.f26140l, f61Var.f26141m);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
