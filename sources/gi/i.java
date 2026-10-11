package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class i extends q61 {
    public static final int f10921a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        long j3 = r61Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), r61Var.f30360k, r61Var.f30361l, r61Var.f30363n, r61Var.f30366q);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
