package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class d5 extends a41 {
    static {
        a41.h(new a41());
    }

    public static b41 i(String str) {
        b41 K = b41.K(d5.class);
        K.f33184l = str;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((e5) view).set(b41Var.f33184l);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e5(context, e6Var);
    }
}
