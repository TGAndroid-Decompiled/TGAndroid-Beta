package ci;

import android.content.Context;
import bi.o8;
import org.telegram.ui.Components.wx0;
public final class l extends s {
    public final t v;

    public l(t tVar, Context context) {
        super(tVar, context);
        this.v = tVar;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        t tVar = this.v;
        if (tVar.f4785r.getVisibility() == 0) {
            tVar.f4787w.l();
        }
        wx0 wx0Var = tVar.f4789y;
        if (wx0Var != null) {
            o8 o8Var = this.e;
            if (o8Var != null && o8Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            wx0Var.e(z10, true);
        }
    }
}
