package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class g3 extends m41 {
    public static final int f18798b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        h3 h3Var = (h3) view;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        h3Var.setText(charSequence);
        h3Var.f18804r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new h3(context, i6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
