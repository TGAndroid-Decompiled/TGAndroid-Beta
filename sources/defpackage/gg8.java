package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class gg8 extends ng8 {
    public final ig8 G;

    public gg8(ig8 ig8Var, Context context, int i) {
        super(context, i, null, null);
        this.G = ig8Var;
    }

    @Override
    public final void h(pz pzVar, ActionMode actionMode) {
        if (pzVar.isFocused() && pzVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                yv1.E6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        this.G.d.o0(this, z);
    }

    @Override
    public final void k(ng8 ng8Var) {
        this.G.d.p0(ng8Var);
    }
}
