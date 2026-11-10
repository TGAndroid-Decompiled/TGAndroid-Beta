package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class h extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, String str, String str2) {
        x31 K = x31.K(h.class);
        K.f40155k = i7;
        K.f40156l = str;
        K.f40157m = str2;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((i) view).a(x31Var.f40155k, x31Var.f40156l, x31Var.f40157m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new i(context, h6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
