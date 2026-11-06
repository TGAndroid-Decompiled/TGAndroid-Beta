package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class p0 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(String str, CharSequence charSequence, int i7) {
        r31 K = r31.K(p0.class);
        K.f54416b = false;
        K.f37611z = i7;
        K.f37598l = str;
        K.f37599m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((q0) view).a(r31Var.f37611z, r31Var.f37598l, r31Var.f37599m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q0(0, context, f6Var);
    }
}
