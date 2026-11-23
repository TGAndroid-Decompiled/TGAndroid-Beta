package mi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class i extends m41 {
    public static final int f21126b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        long j3 = n41Var.C;
        ((j) view).a((int) j3, (int) (j3 >>> 32), n41Var.f37653k, n41Var.f37655m, n41Var.f37657o, n41Var.f37660r);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new j(context, i6Var, false);
    }
}
