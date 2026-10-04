package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class d4 extends f61 {
    public static final int f9002a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        e4 e4Var = (e4) view;
        CharSequence charSequence = g61Var.f26674l;
        CharSequence charSequence2 = g61Var.f26675m;
        e4Var.setText(charSequence);
        e4Var.f9017r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new e4(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
