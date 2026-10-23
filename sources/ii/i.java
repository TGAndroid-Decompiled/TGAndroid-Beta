package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class i extends l61 {
    public static final int f13219a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        long j10 = m61Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), m61Var.f28558k, m61Var.f28559l, m61Var.f28561n, m61Var.f28564q);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new j(context, g6Var, false);
    }
}
