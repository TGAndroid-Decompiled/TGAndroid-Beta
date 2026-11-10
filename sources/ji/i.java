package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class i extends w31 {
    public static final int f17098b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        long j3 = x31Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), x31Var.f40155k, x31Var.f40156l, x31Var.f40158n, x31Var.f40161q);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new j(context, h6Var, false);
    }
}
