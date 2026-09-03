package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class d0 extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(String str, CharSequence charSequence, int i10) {
        i51 J = i51.J(d0.class);
        J.f1831b = false;
        J.f25598z = i10;
        J.f25585l = str;
        J.f25586m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((e0) view).a(i51Var.f25585l, i51Var.f25586m, i51Var.f25598z);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new e0(context, 0, f6Var);
    }
}
