package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class i extends o61 {
    public static final int f10922a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        long j3 = p61Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), p61Var.f29733k, p61Var.f29734l, p61Var.f29736n, p61Var.f29739q);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new j(context, e6Var, false);
    }
}
