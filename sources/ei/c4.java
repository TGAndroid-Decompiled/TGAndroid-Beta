package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class c4 extends o61 {
    public static final int f8997a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = p61Var.f29734l;
        CharSequence charSequence2 = p61Var.f29735m;
        d4Var.setText(charSequence);
        d4Var.f9016r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new d4(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
