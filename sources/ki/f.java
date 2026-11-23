package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class f extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(int i7, int i10, CharSequence charSequence, String str) {
        n41 K = n41.K(f.class);
        K.d = i7;
        K.A = i10;
        K.f37653k = 2131231107;
        K.f37655m = charSequence;
        K.f37656n = str;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((g) view).a(n41Var.A, n41Var.f37653k, n41Var.f37655m, n41Var.f37656n);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new g(context, i6Var);
    }
}
