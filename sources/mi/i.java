package mi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class i extends a41 {
    public static final int f20672b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        long j3 = b41Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), b41Var.f33183k, b41Var.f33184l, b41Var.f33186n, b41Var.f33189q);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new j(context, e6Var, false);
    }
}
