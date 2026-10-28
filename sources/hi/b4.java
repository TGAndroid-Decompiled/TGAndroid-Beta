package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class b4 extends t61 {
    public static final int f12894a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        c4 c4Var = (c4) view;
        CharSequence charSequence = u61Var.f33249l;
        CharSequence charSequence2 = u61Var.f33250m;
        c4Var.setText(charSequence);
        c4Var.f12913r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new c4(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
