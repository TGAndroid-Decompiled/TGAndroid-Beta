package gi;

import android.content.Context;
import fi.h6;
import org.telegram.ui.Components.kv0;
public final class h extends l {
    public final m f13637w;

    public h(m mVar, Context context) {
        super(mVar, context);
        this.f13637w = mVar;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        m mVar = this.f13637w;
        if (mVar.f13655r.getVisibility() == 0) {
            mVar.f13658x.f();
        }
        kv0 kv0Var = mVar.E;
        if (kv0Var != null) {
            h6 h6Var = this.f13642e;
            if (h6Var != null && h6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            kv0Var.e(z10, true);
        }
    }
}
