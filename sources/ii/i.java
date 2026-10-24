package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class i extends k61 {
    public static final int f13219a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        long j10 = l61Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), l61Var.f28226k, l61Var.f28227l, l61Var.f28229n, l61Var.f28232q);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new j(context, g6Var, false);
    }
}
