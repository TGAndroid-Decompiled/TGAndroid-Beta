package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class h extends v31 {
    static {
        v31.h(new v31());
    }

    public static w31 i(int i7, String str, String str2) {
        w31 K = w31.K(h.class);
        K.f39829k = i7;
        K.f39830l = str;
        K.f39831m = str2;
        return K;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ((i) view).a(w31Var.f39829k, w31Var.f39830l, w31Var.f39831m);
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
