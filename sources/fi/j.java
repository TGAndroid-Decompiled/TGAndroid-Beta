package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class j extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, String str, String str2) {
        m61 J = m61.J(j.class);
        J.f26945k = i10;
        J.f26946l = str;
        J.f26947m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((k) view).a(m61Var.f26946l, m61Var.f26947m, m61Var.f26945k);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new k(context, c6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
