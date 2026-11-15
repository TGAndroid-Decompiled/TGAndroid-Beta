package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class g extends a41 {
    static {
        a41.h(new a41());
    }

    public static b41 i(int i7, int i10, CharSequence charSequence, String str) {
        b41 K = b41.K(g.class);
        K.d = i7;
        K.f33197z = i10;
        K.f33183k = 2131231105;
        K.f33184l = charSequence;
        K.f33185m = str;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((h) view).a(b41Var.f33197z, b41Var.f33183k, b41Var.f33184l, b41Var.f33185m);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new h(context, e6Var);
    }
}
