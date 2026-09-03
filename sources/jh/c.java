package jh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ga0;
public final class c extends ga0 {
    public final e X;

    public c(e eVar, p2 p2Var, long j10) {
        super(p2Var, j10);
        this.X = eVar;
    }

    @Override
    public final void dismiss() {
        e eVar = this.X;
        c cVar = eVar.f9405i;
        if (cVar != null && !cVar.R.f9461b) {
            eVar.f9405i = null;
        }
        super.dismiss();
    }
}
