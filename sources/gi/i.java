package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class i extends h51 {
    public static final int f10036a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        long j3 = i51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), i51Var.f24893k, i51Var.f24894l, i51Var.f24896n, i51Var.f24899q);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new j(context, e6Var, false);
    }
}
