package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class i extends u51 {
    public static final int f8321a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        long j3 = v51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), v51Var.f27828k, v51Var.f27829l, v51Var.f27831n, v51Var.f27834q);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
