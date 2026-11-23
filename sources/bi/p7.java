package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class p7 extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(String str) {
        n41 K = n41.K(p7.class);
        K.f37655m = str;
        return K;
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((q7) view).set(n41Var.f37655m);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new q7(context, i6Var);
    }
}
