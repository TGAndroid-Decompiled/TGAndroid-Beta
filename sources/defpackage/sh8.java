package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class sh8 extends zh8 {
    public final uh8 G;

    public sh8(uh8 uh8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = uh8Var;
    }

    @Override
    public final void h(qy qyVar, ActionMode actionMode) {
        if (qyVar.isFocused() && qyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zu1.E6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override
    public final void k(zh8 zh8Var) {
        this.G.d.o0(zh8Var);
    }
}
