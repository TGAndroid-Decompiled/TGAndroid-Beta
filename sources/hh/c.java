package hh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.aa0;
public final class c extends aa0 {
    public final e W;

    public c(e eVar, o2 o2Var, long j10) {
        super(o2Var, j10);
        this.W = eVar;
    }

    @Override
    public final void dismiss() {
        e eVar = this.W;
        c cVar = eVar.f8058i;
        if (cVar != null && !cVar.Q.f8121b) {
            eVar.f8058i = null;
        }
        super.dismiss();
    }
}
