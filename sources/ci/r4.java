package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class r4 extends v51 {
    public static final int f5452a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        s4 s4Var = (s4) view;
        s4Var.a(w51Var.d, w51Var.f29908z, (l8) w51Var.G);
        s4Var.b(w51Var.e, false);
        boolean z11 = w51Var.f29890f;
        if (s4Var.f5486f != z11) {
            s4Var.f5486f = z11;
            s4Var.E.a(z11);
            s4Var.invalidate();
        }
        s4Var.setOnCheckboxClick(w51Var.D);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s4(context, d6Var);
    }
}
