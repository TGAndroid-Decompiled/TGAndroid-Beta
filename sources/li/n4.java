package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class n4 extends s61 {
    public static final int f17381a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((o4) view).g((a) t61Var.G, (m4) t61Var.H);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new o4(context, i10, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
