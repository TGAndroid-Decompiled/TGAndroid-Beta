package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
public final class i extends x51 {
    public static final int f10041a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        long j3 = y51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), y51Var.f30517k, y51Var.f30518l, y51Var.f30520n, y51Var.f30523q);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var, false);
    }
}
