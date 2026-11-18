package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class v extends k41 {
    public static final int f22394b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((w) view).h((a) l41Var.H, (m3) l41Var.I);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        w wVar = new w(i7, context, i6Var);
        wVar.setBackground(new w1(n6.w0(n6.f29394d6, i6Var)));
        return wVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
