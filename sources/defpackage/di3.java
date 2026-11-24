package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class di3 implements gj, mo4 {
    public final cj3 a;

    public di3(cj3 cj3Var) {
        this.a = cj3Var;
    }

    public final void a(rf4 rf4Var) {
        cj3 cj3Var = this.a;
        if (!cj3Var.s3) {
            return;
        }
        hi3 hi3Var = cj3Var.D0;
        if (hi3Var != null) {
            hi3Var.D0.remove(rf4Var);
            hi3 hi3Var2 = cj3Var.D0;
            String obj = cj3Var.k0.getSearchField().getText().toString();
            View currentView = hi3Var2.getCurrentView();
            boolean z = true;
            boolean z2 = !hi3Var2.h0;
            if (!TextUtils.isEmpty(hi3Var2.N0)) {
                z = z2;
            }
            hi3Var2.N0 = obj;
            hi3Var2.P(currentView, hi3Var2.getCurrentPosition(), obj, z);
        }
        cj3Var.p5(true, null, null, false, true);
        cj3Var.Z.a.l(cj3Var.Y.r);
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        cj3 cj3Var = this.a;
        ArrayList arrayList = cj3Var.K2;
        cj3Var.M2 = i;
        cj3Var.N2 = i2;
        cj3Var.O2 = false;
        if (cj3Var.E2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList2.add(zc7.a(((Long) cj3Var.K2.get(i3)).longValue(), 0L));
            }
            cj3Var.E2.r(cj3Var, arrayList2, cj3Var.D1.getFieldText(), false, z, i, i2, null);
        }
    }
}
