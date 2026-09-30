package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class r4 extends x51 {
    public static final int f5461a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        s4 s4Var = (s4) view;
        s4Var.a(y51Var.d, y51Var.f30650z, (l8) y51Var.G);
        s4Var.b(y51Var.e, false);
        boolean z11 = y51Var.f30632f;
        if (s4Var.f5495f != z11) {
            s4Var.f5495f = z11;
            s4Var.E.a(z11);
            s4Var.invalidate();
        }
        s4Var.setOnCheckboxClick(y51Var.D);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s4(context, d6Var);
    }
}
