package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class m5 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(String str) {
        r31 K = r31.K(m5.class);
        K.f37627l = str;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        ((n5) view).set(r31Var.f37627l);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new n5(context, e6Var);
    }
}
