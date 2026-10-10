package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class c4 extends p61 {
    public static final int f8997a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = q61Var.f30063l;
        CharSequence charSequence2 = q61Var.f30064m;
        d4Var.setText(charSequence);
        d4Var.f9016r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new d4(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
