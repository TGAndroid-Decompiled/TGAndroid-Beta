package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class o3 extends x31 {
    public static final int f14845b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        p3 p3Var = (p3) view;
        CharSequence charSequence = y31Var.f40568l;
        CharSequence charSequence2 = y31Var.f40569m;
        p3Var.setText(charSequence);
        p3Var.f14870r.setText(charSequence2);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new p3(context, g6Var);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
