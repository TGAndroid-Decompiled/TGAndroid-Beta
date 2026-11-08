package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class o3 extends w31 {
    public static final int f14845b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        p3 p3Var = (p3) view;
        CharSequence charSequence = x31Var.f40180l;
        CharSequence charSequence2 = x31Var.f40181m;
        p3Var.setText(charSequence);
        p3Var.f14870r.setText(charSequence2);
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
