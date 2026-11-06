package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class o3 extends q31 {
    public static final int f14842b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        p3 p3Var = (p3) view;
        CharSequence charSequence = r31Var.f37598l;
        CharSequence charSequence2 = r31Var.f37599m;
        p3Var.setText(charSequence);
        p3Var.f14867r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new p3(context, f6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
