package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
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
        J.f26959z = i11;
        J.f26945k = i12;
        J.f26946l = charSequence;
        J.f26947m = str;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((i) view).a(m61Var.f26959z, m61Var.f26945k, m61Var.f26946l, m61Var.f26947m);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }
}
