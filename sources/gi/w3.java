package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class w3 extends q31 {
    public static final int f13793b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        x3 x3Var = (x3) view;
        x3Var.a(r31Var.d, r31Var.f37640z, (f7) r31Var.G);
        x3Var.b(r31Var.f37621e, false);
        boolean z11 = r31Var.f37622f;
        if (x3Var.h != z11) {
            x3Var.h = z11;
            x3Var.G.a(z11);
            x3Var.invalidate();
        }
        x3Var.setOnCheckboxClick(r31Var.D);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new x3(context, e6Var);
    }
}
