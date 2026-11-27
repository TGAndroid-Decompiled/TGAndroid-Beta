package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class x62 extends zh8 {
    public final t20 G;

    public x62(t20 t20Var, Context context, int i) {
        super(context, i, null, null);
        this.G = t20Var;
    }

    @Override
    public final void h(qy qyVar, ActionMode actionMode) {
        if (qyVar.isFocused() && qyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zu1.E6(menu, ((zu1) ((a72) this.G.e).b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        ((a72) this.G.e).a0(this, z);
    }

    @Override
    public final void k(zh8 zh8Var) {
        ((a72) this.G.e).b0(zh8Var);
    }

    @Override
    public final void l(qy qyVar) {
        ((a72) this.G.e).b.d1(qyVar, true);
    }
}
