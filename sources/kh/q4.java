package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class q4 extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(String str) {
        i51 J = i51.J(q4.class);
        J.f25565l = str;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((r4) view).set(i51Var.f25565l);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r4(context, f6Var);
    }
}
