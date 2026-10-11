package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class i extends p61 {
    public static final int f10921a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        long j3 = q61Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), q61Var.f30166k, q61Var.f30167l, q61Var.f30169n, q61Var.f30172q);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
