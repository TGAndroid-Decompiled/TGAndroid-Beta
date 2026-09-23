package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class i extends g51 {
    public static final int f10023a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        long j3 = h51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), h51Var.f24506k, h51Var.f24507l, h51Var.f24509n, h51Var.f24512q);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
