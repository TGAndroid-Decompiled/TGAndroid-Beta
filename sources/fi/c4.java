package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class c4 extends g51 {
    public static final int f9624a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = h51Var.f26621l;
        CharSequence charSequence2 = h51Var.f26622m;
        d4Var.setText(charSequence);
        d4Var.f9651r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new d4(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
