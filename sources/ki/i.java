package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class i extends q31 {
    public static final int f17340b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        long j10 = r31Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), r31Var.f37626k, r31Var.f37627l, r31Var.f37629n, r31Var.f37632q);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new j(context, e6Var, false);
    }
}
