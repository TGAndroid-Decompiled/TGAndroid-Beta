package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class i extends w51 {
    public static final int f10028a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        long j3 = x51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), x51Var.f30301k, x51Var.f30302l, x51Var.f30304n, x51Var.f30307q);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, e6 e6Var) {
        return new j(context, e6Var, false);
    }
}
