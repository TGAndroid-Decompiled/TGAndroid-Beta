package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class i extends x51 {
    public static final int f10036a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        long j3 = y51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), y51Var.f30636k, y51Var.f30637l, y51Var.f30639n, y51Var.f30642q);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
