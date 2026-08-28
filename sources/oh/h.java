package oh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class h extends k41 {
    public static final int f19601a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        long j10 = l41Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), l41Var.f30338k, l41Var.f30339l, l41Var.f30341n, l41Var.f30344q);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new i(context, b6Var, false);
    }
}
