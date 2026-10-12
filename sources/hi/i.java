package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class i extends k61 {
    public static final int f10842a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        long j10 = l61Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), l61Var.f26953k, l61Var.f26954l, l61Var.f26956n, l61Var.f26959q);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new j(context, c6Var, false);
    }
}
