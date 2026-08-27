package fh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.q90;

public final class c extends q90 {
    public final e W;

    public c(e eVar, n2 n2Var, long j10) {
        super(n2Var, j10);
        this.W = eVar;
    }

    @Override
    public final void dismiss() {
        e eVar = this.W;
        c cVar = eVar.f6111i;
        if (cVar != null && !cVar.Q.f6174b) {
            eVar.f6111i = null;
        }
        super.dismiss();
    }
}
