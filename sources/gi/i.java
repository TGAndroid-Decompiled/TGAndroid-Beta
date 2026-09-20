package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class i extends v51 {
    public static final int f10041a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        long j3 = w51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), w51Var.f29947k, w51Var.f29948l, w51Var.f29950n, w51Var.f29953q);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
