package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class pj3 implements gk, nq4 {
    public final nk3 a;

    public pj3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    public final void a(sh4 sh4Var) {
        nk3 nk3Var = this.a;
        if (!nk3Var.s3) {
            return;
        }
        sj3 sj3Var = nk3Var.D0;
        if (sj3Var != null) {
            sj3Var.D0.remove(sh4Var);
            sj3 sj3Var2 = nk3Var.D0;
            String obj = nk3Var.k0.getSearchField().getText().toString();
            View currentView = sj3Var2.getCurrentView();
            boolean z = true;
            boolean z2 = !sj3Var2.h0;
            if (!TextUtils.isEmpty(sj3Var2.N0)) {
                z = z2;
            }
            sj3Var2.N0 = obj;
            sj3Var2.P(currentView, sj3Var2.getCurrentPosition(), obj, z);
        }
        nk3Var.t5(true, null, null, false, true);
        nk3Var.Z.a.l(nk3Var.Y.r);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        nk3 nk3Var = this.a;
        ArrayList arrayList = nk3Var.K2;
        nk3Var.M2 = i;
        nk3Var.N2 = i2;
        nk3Var.O2 = false;
        if (nk3Var.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(bf7.a(((Long) nk3Var.K2.get(i3)).longValue(), 0L));
            }
            nk3Var.E2.q(nk3Var, arrayList2, nk3Var.D1.getFieldText(), false, z, i, i2, null);
        }
    }
}
