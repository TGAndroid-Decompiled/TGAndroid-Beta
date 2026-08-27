package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class q3 extends m41 {

    public static final int f18904a = 0;

    static {
        m41.setup(new q3());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        r3 r3Var = (r3) view;
        CharSequence charSequence = n41Var.f30844l;
        CharSequence charSequence2 = n41Var.f30845m;
        r3Var.setText(charSequence);
        r3Var.f18936r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new r3(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
