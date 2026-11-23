package jg;

import android.content.Context;
import android.view.View;
import fi.b6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class j1 extends m41 {
    public static final int f17641b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((k1) view).a((b6) n41Var.H);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new k1(context, i6Var);
    }
}
