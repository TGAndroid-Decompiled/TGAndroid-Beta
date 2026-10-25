package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class b6 extends s61 {
    public static final int f17156a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((d6) view).f((a) t61Var.G, (a6) t61Var.H, t61Var.f32878r);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        d6 d6Var = new d6(context, u6Var);
        d6Var.setBackground(new y1(y6.w0(y6.f23354d6, u6Var)));
        return d6Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
