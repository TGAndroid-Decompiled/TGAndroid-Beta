package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class h extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, String str, String str2) {
        x31 K = x31.K(h.class);
        K.f40158k = i7;
        K.f40159l = str;
        K.f40160m = str2;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((i) view).a(x31Var.f40158k, x31Var.f40159l, x31Var.f40160m);
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
