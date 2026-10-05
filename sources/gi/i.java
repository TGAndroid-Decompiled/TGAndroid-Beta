package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class i extends g61 {
    public static final int f10917a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        long j3 = h61Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), h61Var.f27092k, h61Var.f27093l, h61Var.f27095n, h61Var.f27098q);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
