package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class c4 extends x51 {
    public static final int f8286a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = y51Var.f30518l;
        CharSequence charSequence2 = y51Var.f30519m;
        d4Var.setText(charSequence);
        d4Var.f8301r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new d4(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
