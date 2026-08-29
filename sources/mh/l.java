package mh;

import android.content.Context;
import lh.k6;
import org.telegram.ui.Components.qw0;
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
        if (rVar.f17047r.getVisibility() == 0) {
            rVar.f17049w.l();
        }
        qw0 qw0Var = rVar.f17051y;
        if (qw0Var != null) {
            k6 k6Var = this.f17036e;
            if (k6Var != null && k6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            qw0Var.e(z10, true);
        }
    }
}
