package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
public final class ot9 extends xj3 {
    public final cj3 g0;
    public final hi3 h0;

    public ot9(hi3 hi3Var, o39 o39Var, Activity activity, int i, int i2, cj3 cj3Var) {
        super(o39Var, activity, i, i2);
        this.h0 = hi3Var;
        this.g0 = cj3Var;
    }

    @Override
    public final void O(boolean z) {
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z);
        gt9 gt9Var = this.h0.j0;
        if (!this.Z && !this.a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        gt9Var.e(z2, z);
        if (TextUtils.isEmpty(this.e0)) {
            gt9Var.d.setText(k96.M0(2131748039, null));
            gt9Var.e.setVisibility(0);
            gt9Var.e.setText(k96.M0(2131748040, null));
            return;
        }
        gt9Var.d.setText(k96.M0(2131747975, null));
        gt9Var.e.setVisibility(8);
    }
}
