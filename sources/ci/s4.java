package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class s4 extends i51 {
    public static final int f5511a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(j51Var.d, j51Var.f25140z, (o8) j51Var.G);
        t4Var.b(j51Var.e, false);
        boolean z11 = j51Var.f25122f;
        if (t4Var.f5561f != z11) {
            t4Var.f5561f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(j51Var.D);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t4(context, f6Var);
    }
}
