package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class i extends t61 {
    public static final int f15993a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        long j10 = u61Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), u61Var.f33248k, u61Var.f33249l, u61Var.f33251n, u61Var.f33254q);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new j(context, u6Var, false);
    }
}
