package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class i extends v31 {
    public static final int f17095b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        long j3 = w31Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), w31Var.f39829k, w31Var.f39830l, w31Var.f39832n, w31Var.f39835q);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
