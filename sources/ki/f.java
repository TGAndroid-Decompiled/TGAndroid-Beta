package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class f extends n41 {
    static {
        n41.h(new n41());
    }

    public static o41 i(int i7, int i10, CharSequence charSequence, String str) {
        o41 K = o41.K(f.class);
        K.d = i7;
        K.A = i10;
        K.f38089k = 2131231105;
        K.f38091m = charSequence;
        K.f38092n = str;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((g) view).a(o41Var.A, o41Var.f38089k, o41Var.f38091m, o41Var.f38092n);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new g(context, h6Var);
    }
}
