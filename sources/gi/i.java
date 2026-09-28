package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class i extends w51 {
    public static final int f10022a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        long j3 = x51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), x51Var.f30291k, x51Var.f30292l, x51Var.f30294n, x51Var.f30297q);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
