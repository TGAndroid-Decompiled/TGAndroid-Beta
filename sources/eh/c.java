package eh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.m90;
public final class c extends m90 {
    public final e W;

    public c(e eVar, o2 o2Var, long j10) {
        super(o2Var, j10);
        this.W = eVar;
    }

    @Override
    public final void dismiss() {
        e eVar = this.W;
        c cVar = eVar.f5180i;
        if (cVar != null && !cVar.Q.f5247b) {
            eVar.f5180i = null;
        }
        super.dismiss();
    }
}
