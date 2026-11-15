package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class g0 extends a41 {
    static {
        a41.h(new a41());
    }

    public static b41 i(String str, CharSequence charSequence, int i7) {
        b41 K = b41.K(g0.class);
        K.f56016b = false;
        K.f33197z = i7;
        K.f33184l = str;
        K.f33185m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((h0) view).a(b41Var.f33197z, b41Var.f33184l, b41Var.f33185m);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h0(0, context, e6Var);
    }
}
