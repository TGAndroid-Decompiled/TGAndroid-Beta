package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class h extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i7, String str, String str2) {
        r31 K = r31.K(h.class);
        K.f37597k = i7;
        K.f37598l = str;
        K.f37599m = str2;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((i) view).a(r31Var.f37597k, r31Var.f37598l, r31Var.f37599m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new i(context, f6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
