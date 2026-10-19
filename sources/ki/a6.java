package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class a6 extends f61 {
    public static final int f15132a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((c6) view).g((a) g61Var.G, (z5) g61Var.H, g61Var.f26503r);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        c6 c6Var = new c6(context, d6Var);
        c6Var.setBackground(new a2(h6.w0(h6.f20987d6, d6Var)));
        return c6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
