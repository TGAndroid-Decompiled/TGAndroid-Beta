package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class i extends l61 {
    public static final int f10846a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        long j10 = m61Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), m61Var.f26945k, m61Var.f26946l, m61Var.f26948n, m61Var.f26951q);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new j(context, c6Var, false);
    }
}
