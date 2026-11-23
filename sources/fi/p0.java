package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class p0 extends n41 {
    public static final int f12361b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((q0) view).set((s0) o41Var.H);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new q0(context);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.H == o41Var2.H) {
            return true;
        }
        return false;
    }
}
