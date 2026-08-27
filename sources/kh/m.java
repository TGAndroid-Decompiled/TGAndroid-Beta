package kh;

import android.content.Context;
import jh.j6;
import org.telegram.ui.Components.iw0;

public final class m extends q {
    public final r v;

    public m(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override
    public final void l() {
        super.l();
        r rVar = this.v;
        if (rVar.f15220r.getVisibility() == 0) {
            rVar.f15222w.l();
        }
        iw0 iw0Var = rVar.f15224y;
        if (iw0Var != null) {
            j6 j6Var = this.f15209e;
            iw0Var.e(j6Var != null && j6Var.k(), true);
        }
    }
}
