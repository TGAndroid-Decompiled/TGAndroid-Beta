package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class f extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i7, int i10, CharSequence charSequence, String str) {
        r31 K = r31.K(f.class);
        K.d = i7;
        K.f37611z = i10;
        K.f37597k = 2131231105;
        K.f37598l = charSequence;
        K.f37599m = str;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((g) view).a(r31Var.f37611z, r31Var.f37597k, r31Var.f37598l, r31Var.f37599m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new g(context, f6Var);
    }
}
