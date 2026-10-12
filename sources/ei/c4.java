package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class c4 extends t61 {
    public static final int f8994a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = u61Var.f31071l;
        CharSequence charSequence2 = u61Var.f31072m;
        d4Var.setText(charSequence);
        d4Var.f9013r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new d4(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
