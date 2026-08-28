package ih;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class s0 extends k41 {
    public static final int f12099a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((t0) view).set((v0) l41Var.G);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new t0(context);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.G == l41Var2.G) {
            return true;
        }
        return false;
    }
}
