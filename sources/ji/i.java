package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class i extends q31 {
    public static final int f17095b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        long j3 = r31Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), r31Var.f37597k, r31Var.f37598l, r31Var.f37600n, r31Var.f37603q);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
