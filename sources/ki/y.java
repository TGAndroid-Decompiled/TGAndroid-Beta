package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class y extends l61 {
    public static final int f15717a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ((z) view).h((a) m61Var.G, (q3) m61Var.H);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        z zVar = new z(context, i10, g6Var);
        zVar.setBackground(new a2(k6.w0(k6.f21183d6, g6Var)));
        return zVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
