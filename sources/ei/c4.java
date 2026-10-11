package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class c4 extends q61 {
    public static final int f8996a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = r61Var.f30361l;
        CharSequence charSequence2 = r61Var.f30362m;
        d4Var.setText(charSequence);
        d4Var.f9015r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new d4(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
