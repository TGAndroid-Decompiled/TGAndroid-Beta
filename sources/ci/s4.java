package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class s4 extends x51 {
    public static final int f5510a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(y51Var.d, y51Var.f30531z, (o8) y51Var.G);
        t4Var.b(y51Var.e, false);
        boolean z11 = y51Var.f30513f;
        if (t4Var.f5560f != z11) {
            t4Var.f5560f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(y51Var.D);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t4(context, f6Var);
    }
}
