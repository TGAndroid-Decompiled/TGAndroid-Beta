package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class g0 extends n41 {
    static {
        n41.h(new n41());
    }

    public static o41 i(String str, CharSequence charSequence, int i7) {
        o41 K = o41.K(g0.class);
        K.f56631b = false;
        K.A = i7;
        K.f38098m = str;
        K.f38099n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((h0) view).a(o41Var.A, o41Var.f38098m, o41Var.f38099n);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new h0(0, context, h6Var);
    }
}
