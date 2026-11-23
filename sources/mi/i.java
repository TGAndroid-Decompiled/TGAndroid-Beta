package mi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class i extends n41 {
    public static final int f21064b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        long j3 = o41Var.C;
        ((j) view).a((int) j3, (int) (j3 >>> 32), o41Var.f38089k, o41Var.f38091m, o41Var.f38093o, o41Var.f38096r);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new j(context, h6Var, false);
    }
}
