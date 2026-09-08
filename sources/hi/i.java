package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class i extends g51 {
    public static final int f11400a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        long j3 = h51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), h51Var.f26620k, h51Var.f26621l, h51Var.f26623n, h51Var.f26626q);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
