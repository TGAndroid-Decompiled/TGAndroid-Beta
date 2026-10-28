package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class i extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, String str, String str2) {
        u61 K = u61.K(i.class);
        K.f33248k = i10;
        K.f33249l = str;
        K.f33250m = str2;
        return K;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((j) view).a(u61Var.f33249l, u61Var.f33250m, u61Var.f33248k);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new j(context, u6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
