package di;

import android.content.Context;
import ci.a7;
import org.telegram.ui.Components.sx0;
public final class l extends q {
    public final r v;

    public l(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        r rVar = this.v;
        if (rVar.f8061r.getVisibility() == 0) {
            rVar.f8063w.l();
        }
        sx0 sx0Var = rVar.f8065y;
        if (sx0Var != null) {
            a7 a7Var = this.e;
            if (a7Var != null && a7Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            sx0Var.e(z10, true);
        }
    }
}
