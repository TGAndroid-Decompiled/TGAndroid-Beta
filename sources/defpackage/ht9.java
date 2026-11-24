package defpackage;

import android.app.Activity;
import java.util.ArrayList;
public final class ht9 extends vj3 {
    public final hi3 l0;

    public ht9(hi3 hi3Var, o39 o39Var, Activity activity, int i, int i2) {
        super(o39Var, activity, i, i2, false, null);
        this.l0 = hi3Var;
    }

    @Override
    public final void O(boolean z) {
        boolean z2;
        ArrayList arrayList;
        super.O(z);
        gt9 gt9Var = this.l0.o0;
        if (!this.c0 && !this.d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        gt9Var.e(z2, z);
        gt9Var.d.setText(k96.M0(2131747975, null));
        gt9Var.e.setVisibility(8);
    }
}
