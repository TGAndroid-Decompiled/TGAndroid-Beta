package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.mv0;
public final class h extends l {
    public final m f13632w;

    public h(m mVar, Context context) {
        super(mVar, context);
        this.f13632w = mVar;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        m mVar = this.f13632w;
        if (mVar.f13650r.getVisibility() == 0) {
            mVar.f13653x.f();
        }
        mv0 mv0Var = mVar.E;
        if (mv0Var != null) {
            h6 h6Var = this.f13637e;
            if (h6Var != null && h6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            mv0Var.e(z10, true);
        }
    }
}
