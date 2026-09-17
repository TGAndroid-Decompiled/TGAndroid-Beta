package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class i extends i51 {
    public static final int f10041a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        long j3 = j51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), j51Var.f25123k, j51Var.f25124l, j51Var.f25126n, j51Var.f25129q);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
