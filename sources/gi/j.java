package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class j extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, String str, String str2) {
        m61 J = m61.J(j.class);
        J.f28558k = i10;
        J.f28559l = str;
        J.f28560m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ((k) view).a(m61Var.f28559l, m61Var.f28560m, m61Var.f28558k);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new k(context, g6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
