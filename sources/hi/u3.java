package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class u3 extends n41 {
    public static final int f15537b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        v3 v3Var = (v3) view;
        v3Var.a(o41Var.d, o41Var.A, (c7) o41Var.H);
        v3Var.b(o41Var.f38085e, false);
        boolean z11 = o41Var.f38086f;
        if (v3Var.h != z11) {
            v3Var.h = z11;
            v3Var.G.a(z11);
            v3Var.invalidate();
        }
        v3Var.setOnCheckboxClick(o41Var.E);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new v3(context, h6Var);
    }
}
