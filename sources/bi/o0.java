package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class o0 extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(String str, CharSequence charSequence, int i10) {
        u61 K = u61.K(o0.class);
        K.f47076b = false;
        K.f33262z = i10;
        K.f33249l = str;
        K.f33250m = charSequence;
        return K;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((p0) view).a(u61Var.f33249l, u61Var.f33250m, u61Var.f33262z);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new p0(context, 0, u6Var);
    }
}
