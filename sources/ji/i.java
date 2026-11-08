package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class i extends w31 {
    public static final int f17098b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        long j3 = x31Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), x31Var.f40179k, x31Var.f40180l, x31Var.f40182n, x31Var.f40185q);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
