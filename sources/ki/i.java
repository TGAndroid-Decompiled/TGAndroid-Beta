package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class i extends a41 {
    static {
        a41.h(new a41());
    }

    public static b41 i(int i7, String str, String str2) {
        b41 K = b41.K(i.class);
        K.f33183k = i7;
        K.f33184l = str;
        K.f33185m = str2;
        return K;
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((j) view).a(b41Var.f33183k, b41Var.f33184l, b41Var.f33185m);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new j(context, e6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
