package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class j extends p61 {
    static {
        p61.setup(new p61());
    }

    public static q61 a(int i10, String str, String str2) {
        q61 J = q61.J(j.class);
        J.f30166k = i10;
        J.f30167l = str;
        J.f30168m = str2;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        ((k) view).a(q61Var.f30167l, q61Var.f30168m, q61Var.f30166k);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
