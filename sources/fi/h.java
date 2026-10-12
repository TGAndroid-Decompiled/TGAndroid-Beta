package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class h extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        l61 J = l61.J(h.class);
        J.d = i10;
        J.f26967z = i11;
        J.f26953k = i12;
        J.f26954l = charSequence;
        J.f26955m = str;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((i) view).a(l61Var.f26967z, l61Var.f26953k, l61Var.f26954l, l61Var.f26955m);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }
}
