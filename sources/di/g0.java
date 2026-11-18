package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class g0 extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(String str, CharSequence charSequence, int i7) {
        l41 K = l41.K(g0.class);
        K.f56590b = false;
        K.A = i7;
        K.f37018m = str;
        K.f37019n = charSequence;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((h0) view).a(l41Var.A, l41Var.f37018m, l41Var.f37019n);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new h0(0, context, i6Var);
    }
}
