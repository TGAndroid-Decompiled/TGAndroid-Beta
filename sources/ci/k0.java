package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class k0 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(String str, CharSequence charSequence, int i3) {
        r31 K = r31.K(k0.class);
        K.f54716b = false;
        K.f37640z = i3;
        K.f37627l = str;
        K.f37628m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ((l0) view).a(r31Var.f37640z, r31Var.f37627l, r31Var.f37628m);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l0(0, context, e6Var);
    }
}
