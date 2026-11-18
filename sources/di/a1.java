package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.z41;
public final class a1 extends z41 {
    public final h1 Q;

    public a1(h1 h1Var, ck0 ck0Var, Context context, int i7, bi.b bVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(ck0Var, context, i7, 0, true, bVar, i6Var);
        this.Q = h1Var;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        super.t(f1Var, i7);
        View view = f1Var.f59123a;
        if (!(view instanceof f1)) {
            return;
        }
        f1 f1Var2 = (f1) view;
        c1 c1Var = f1Var2.f8754w;
        boolean g12 = this.Q.g1(c1Var);
        f1Var2.f8748c.f(g12, false);
        f1Var2.f8752r.a(g12, false);
        f1Var2.setOnClickListener(new ai.v2(13, this, c1Var));
    }
}
