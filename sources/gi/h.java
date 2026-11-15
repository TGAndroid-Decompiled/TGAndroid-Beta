package gi;

import android.content.Context;
import fi.k6;
import org.telegram.ui.Components.cv0;
public final class h extends l {
    public final m f13325w;

    public h(m mVar, Context context) {
        super(mVar, context);
        this.f13325w = mVar;
    }

    @Override
    public final void f() {
        boolean z10;
        super.f();
        m mVar = this.f13325w;
        if (mVar.f13343r.getVisibility() == 0) {
            mVar.f13346x.f();
        }
        cv0 cv0Var = mVar.E;
        if (cv0Var != null) {
            k6 k6Var = this.f13330e;
            if (k6Var != null && k6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            cv0Var.e(z10, true);
        }
    }
}
