package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class v3 extends n41 {
    public static final int f15522b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        w3 w3Var = (w3) view;
        w3Var.a(o41Var.d, o41Var.A, (d7) o41Var.H);
        w3Var.b(o41Var.f38051e, false);
        boolean z11 = o41Var.f38052f;
        if (w3Var.h != z11) {
            w3Var.h = z11;
            w3Var.G.a(z11);
            w3Var.invalidate();
        }
        w3Var.setOnCheckboxClick(o41Var.E);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w3(context, h6Var);
    }
}
