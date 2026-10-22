package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class h extends g61 {
    public static final int f13173a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        long j10 = h61Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), h61Var.f26784k, h61Var.f26785l, h61Var.f26787n, h61Var.f26790q);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var, false);
    }
}
