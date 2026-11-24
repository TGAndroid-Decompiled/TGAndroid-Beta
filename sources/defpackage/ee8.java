package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class ee8 extends le8 {
    public final ge8 G;

    public ee8(ge8 ge8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = ge8Var;
    }

    @Override
    public final void h(py pyVar, ActionMode actionMode) {
        if (pyVar.isFocused() && pyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                mu1.x6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override
    public final void k(le8 le8Var) {
        this.G.d.o0(le8Var);
    }
}
