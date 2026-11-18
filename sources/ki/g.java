package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class g extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(int i7, int i10, CharSequence charSequence, String str) {
        l41 K = l41.K(g.class);
        K.d = i7;
        K.A = i10;
        K.f37016k = 2131231105;
        K.f37018m = charSequence;
        K.f37019n = str;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((h) view).a(l41Var.A, l41Var.f37016k, l41Var.f37018m, l41Var.f37019n);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new h(context, i6Var);
    }
}
