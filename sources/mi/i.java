package mi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class i extends k41 {
    public static final int f21036b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        long j3 = l41Var.C;
        ((j) view).a((int) j3, (int) (j3 >>> 32), l41Var.f37016k, l41Var.f37018m, l41Var.f37020o, l41Var.f37023r);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new j(context, i6Var, false);
    }
}
