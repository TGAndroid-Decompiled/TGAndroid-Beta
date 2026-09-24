package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class i extends u51 {
    public static final int f10022a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        long j3 = v51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), v51Var.f29041k, v51Var.f29042l, v51Var.f29044n, v51Var.f29047q);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
