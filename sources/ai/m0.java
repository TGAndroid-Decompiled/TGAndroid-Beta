package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class m0 extends e61 {
    static {
        e61.setup(new e61());
    }

    public static f61 a(String str, CharSequence charSequence, int i10) {
        f61 J = f61.J(m0.class);
        J.f44292b = false;
        J.f26153z = i10;
        J.f26140l = str;
        J.f26141m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        ((n0) view).a(f61Var.f26140l, f61Var.f26141m, f61Var.f26153z);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new n0(context, 0, d6Var);
    }
}
