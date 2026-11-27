package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class xi3 implements hj, qq4 {
    public final uj3 a;

    public xi3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    public final void a(ph4 ph4Var) {
        uj3 uj3Var = this.a;
        if (!uj3Var.s3) {
            return;
        }
        bj3 bj3Var = uj3Var.D0;
        if (bj3Var != null) {
            bj3Var.D0.remove(ph4Var);
            bj3 bj3Var2 = uj3Var.D0;
            String obj = uj3Var.k0.getSearchField().getText().toString();
            View currentView = bj3Var2.getCurrentView();
            boolean z = true;
            boolean z2 = !bj3Var2.h0;
            if (!TextUtils.isEmpty(bj3Var2.N0)) {
                z = z2;
            }
            bj3Var2.N0 = obj;
            bj3Var2.Q(currentView, bj3Var2.getCurrentPosition(), obj, z);
        }
        uj3Var.t5(true, null, null, false, true);
        uj3Var.Z.a.l(uj3Var.Y.r);
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        uj3 uj3Var = this.a;
        ArrayList arrayList = uj3Var.K2;
        uj3Var.M2 = i;
        uj3Var.N2 = i2;
        uj3Var.O2 = false;
        if (uj3Var.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(jf7.a(((Long) uj3Var.K2.get(i3)).longValue(), 0L));
            }
            uj3Var.E2.q(uj3Var, arrayList2, uj3Var.D1.getFieldText(), false, z, i, i2, null);
        }
    }
}
