package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class h extends f61 {
    public static final int f13173a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        long j10 = g61Var.B;
        ((i) view).a((int) j10, (int) (j10 >>> 32), g61Var.f26496k, g61Var.f26497l, g61Var.f26499n, g61Var.f26502q);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var, false);
    }
}
