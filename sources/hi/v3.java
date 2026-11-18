package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class v3 extends k41 {
    public static final int f15568b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        w3 w3Var = (w3) view;
        w3Var.a(l41Var.d, l41Var.A, (d7) l41Var.H);
        w3Var.b(l41Var.f37011e, false);
        boolean z11 = l41Var.f37012f;
        if (w3Var.h != z11) {
            w3Var.h = z11;
            w3Var.G.a(z11);
            w3Var.invalidate();
        }
        w3Var.setOnCheckboxClick(l41Var.E);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new w3(context, i6Var);
    }
}
