package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class i extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i3, String str, String str2) {
        r31 K = r31.K(i.class);
        K.f37626k = i3;
        K.f37627l = str;
        K.f37628m = str2;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ((j) view).a(r31Var.f37626k, r31Var.f37627l, r31Var.f37628m);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new j(context, e6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
