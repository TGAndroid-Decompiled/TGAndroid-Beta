package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class h extends p61 {
    static {
        p61.setup(new p61());
    }

    public static q61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        q61 J = q61.J(h.class);
        J.d = i10;
        J.f30076z = i11;
        J.f30062k = i12;
        J.f30063l = charSequence;
        J.f30064m = str;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((i) view).a(q61Var.f30076z, q61Var.f30062k, q61Var.f30063l, q61Var.f30064m);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new i(context, e6Var);
    }
}
