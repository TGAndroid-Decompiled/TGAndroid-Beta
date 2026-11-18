package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class j7 extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(String str) {
        l41 K = l41.K(j7.class);
        K.f37018m = str;
        return K;
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((k7) view).set(l41Var.f37018m);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new k7(context, i6Var);
    }
}
