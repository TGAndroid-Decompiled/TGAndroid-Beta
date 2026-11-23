package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class h extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(int i7, String str, String str2) {
        n41 K = n41.K(h.class);
        K.f37653k = i7;
        K.f37655m = str;
        K.f37656n = str2;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((i) view).a(n41Var.f37653k, n41Var.f37655m, n41Var.f37656n);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new i(context, i6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
