package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class g extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        u61 K = u61.K(g.class);
        K.d = i10;
        K.f33262z = i11;
        K.f33248k = i12;
        K.f33249l = charSequence;
        K.f33250m = str;
        return K;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((h) view).a(u61Var.f33262z, u61Var.f33248k, u61Var.f33249l, u61Var.f33250m);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new h(context, u6Var);
    }
}
