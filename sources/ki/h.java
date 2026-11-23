package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class h extends n41 {
    static {
        n41.h(new n41());
    }

    public static o41 i(int i7, String str, String str2) {
        o41 K = o41.K(h.class);
        K.f38056k = i7;
        K.f38058m = str;
        K.f38059n = str2;
        return K;
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((i) view).a(o41Var.f38056k, o41Var.f38058m, o41Var.f38059n);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new i(context, h6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
