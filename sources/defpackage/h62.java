package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class h62 extends le8 {
    public final s20 G;

    public h62(s20 s20Var, Context context, int i) {
        super(context, i, null, null);
        this.G = s20Var;
    }

    @Override
    public final void h(py pyVar, ActionMode actionMode) {
        if (pyVar.isFocused() && pyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                mu1.v6(menu, ((mu1) ((k62) this.G.e).b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        ((k62) this.G.e).b0(this, z);
    }

    @Override
    public final void k(le8 le8Var) {
        ((k62) this.G.e).c0(le8Var);
    }

    @Override
    public final void l(py pyVar) {
        ((k62) this.G.e).b.c1(pyVar, true);
    }
}
