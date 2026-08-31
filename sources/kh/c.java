package kh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ha0;
public final class c extends ha0 {
    public final e X;

    public c(e eVar, p2 p2Var, long j10) {
        super(p2Var, j10);
        this.X = eVar;
    }

    @Override
    public final void dismiss() {
        e eVar = this.X;
        c cVar = eVar.f11242i;
        if (cVar != null && !cVar.R.f11305b) {
            eVar.f11242i = null;
        }
        super.dismiss();
    }
}
