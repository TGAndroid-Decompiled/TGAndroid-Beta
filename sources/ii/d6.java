package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class d6 extends p61 {
    public static final int f12349a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((f6) view).g((a) q61Var.G, (c6) q61Var.H, q61Var.f30069r);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        f6 f6Var = new f6(context, e6Var);
        f6Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var)));
        return f6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
