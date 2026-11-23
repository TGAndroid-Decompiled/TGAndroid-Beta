package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class g0 extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(String str, CharSequence charSequence, int i7) {
        n41 K = n41.K(g0.class);
        K.f56713b = false;
        K.A = i7;
        K.f37655m = str;
        K.f37656n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((h0) view).a(n41Var.A, n41Var.f37655m, n41Var.f37656n);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new h0(0, context, i6Var);
    }
}
