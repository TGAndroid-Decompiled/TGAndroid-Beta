package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class h extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        m61 J = m61.J(h.class);
        J.d = i10;
        J.f28572z = i11;
        J.f28558k = i12;
        J.f28559l = charSequence;
        J.f28560m = str;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ((i) view).a(m61Var.f28572z, m61Var.f28558k, m61Var.f28559l, m61Var.f28560m);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new i(context, g6Var);
    }
}
