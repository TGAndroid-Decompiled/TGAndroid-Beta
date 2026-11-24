package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
public final class s72 extends ng8 {
    public final s30 G;

    public s72(s30 s30Var, Context context, int i) {
        super(context, i, null, null);
        this.G = s30Var;
    }

    @Override
    public final void h(pz pzVar, ActionMode actionMode) {
        if (pzVar.isFocused() && pzVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                yv1.E6(menu, ((yv1) ((v72) this.G.e).b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void j(boolean z) {
        ((v72) this.G.e).b0(this, z);
    }

    @Override
    public final void k(ng8 ng8Var) {
        ((v72) this.G.e).c0(ng8Var);
    }

    @Override
    public final void l(pz pzVar) {
        ((v72) this.G.e).b.c1(pzVar, true);
    }
}
