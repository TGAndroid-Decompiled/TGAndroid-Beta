package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.nv0;
public final class h extends l {
    public final m f13666w;

    public h(m mVar, Context context) {
        super(mVar, context);
        this.f13666w = mVar;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        m mVar = this.f13666w;
        if (mVar.f13684r.getVisibility() == 0) {
            mVar.f13687x.f();
        }
        nv0 nv0Var = mVar.E;
        if (nv0Var != null) {
            h6 h6Var = this.f13671e;
            if (h6Var != null && h6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            nv0Var.e(z10, true);
        }
    }
}
