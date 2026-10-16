package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class d4 extends l61 {
    public static final int f9235a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        e4 e4Var = (e4) view;
        CharSequence charSequence = m61Var.f26946l;
        CharSequence charSequence2 = m61Var.f26947m;
        e4Var.setText(charSequence);
        e4Var.f9253r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new e4(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
