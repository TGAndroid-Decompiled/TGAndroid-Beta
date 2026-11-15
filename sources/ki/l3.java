package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class l3 extends a41 {
    public static final int f18429b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        m3 m3Var = (m3) view;
        CharSequence charSequence = b41Var.f33181l;
        CharSequence charSequence2 = b41Var.f33182m;
        m3Var.setText(charSequence);
        m3Var.f18454r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new m3(context, e6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
