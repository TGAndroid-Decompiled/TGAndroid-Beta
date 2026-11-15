package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class v3 extends a41 {
    public static final int f15216b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        w3 w3Var = (w3) view;
        w3Var.a(b41Var.d, b41Var.f33197z, (d7) b41Var.G);
        w3Var.b(b41Var.f33178e, false);
        boolean z11 = b41Var.f33179f;
        if (w3Var.h != z11) {
            w3Var.h = z11;
            w3Var.G.a(z11);
            w3Var.invalidate();
        }
        w3Var.setOnCheckboxClick(b41Var.D);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w3(context, e6Var);
    }
}
