package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
public final class qv9 extends il3 {
    public final nk3 g0;
    public final sj3 h0;

    public qv9(sj3 sj3Var, r59 r59Var, Activity activity, int i, int i2, nk3 nk3Var) {
        super(r59Var, activity, i, i2);
        this.h0 = sj3Var;
        this.g0 = nk3Var;
    }

    @Override
    public final void O(boolean z) {
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z);
        iv9 iv9Var = this.h0.j0;
        if (!this.Z && !this.a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        iv9Var.e(z2, z);
        if (TextUtils.isEmpty(this.e0)) {
            iv9Var.d.setText(jb6.M0(2131747965, null));
            iv9Var.e.setVisibility(0);
            iv9Var.e.setText(jb6.M0(2131747966, null));
            return;
        }
        iv9Var.d.setText(jb6.M0(2131747901, null));
        iv9Var.e.setVisibility(8);
    }
}
