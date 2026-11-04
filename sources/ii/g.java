package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class g extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i3, int i10, CharSequence charSequence, String str) {
        r31 K = r31.K(g.class);
        K.d = i3;
        K.f37640z = i10;
        K.f37626k = 2131231105;
        K.f37627l = charSequence;
        K.f37628m = str;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ((h) view).a(r31Var.f37640z, r31Var.f37626k, r31Var.f37627l, r31Var.f37628m);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new h(context, e6Var);
    }
}
