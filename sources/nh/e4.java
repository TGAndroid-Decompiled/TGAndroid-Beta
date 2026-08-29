package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class e4 extends v41 {
    public static final int f17592a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        f4 f4Var = (f4) view;
        f4Var.a(w41Var.d, w41Var.f34313z, (o7) w41Var.G);
        f4Var.b(w41Var.f34294e, false);
        boolean z11 = w41Var.f34295f;
        if (f4Var.f17636f != z11) {
            f4Var.f17636f = z11;
            f4Var.A.a(z11);
            f4Var.invalidate();
        }
        f4Var.setOnCheckboxClick(w41Var.D);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new f4(context, c6Var);
    }
}
