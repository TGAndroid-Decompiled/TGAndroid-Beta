package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
public final class ix9 extends pk3 {
    public final uj3 g0;
    public final bj3 h0;

    public ix9(bj3 bj3Var, d79 d79Var, Activity activity, int i, int i2, uj3 uj3Var) {
        super(d79Var, activity, i, i2);
        this.h0 = bj3Var;
        this.g0 = uj3Var;
    }

    @Override
    public final void O(boolean z) {
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z);
        ax9 ax9Var = this.h0.j0;
        if (!this.Z && !this.a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        ax9Var.e(z2, z);
        if (TextUtils.isEmpty(this.e0)) {
            ax9Var.d.setText(ob6.M0(2131747962, null));
            ax9Var.e.setVisibility(0);
            ax9Var.e.setText(ob6.M0(2131747963, null));
            return;
        }
        ax9Var.d.setText(ob6.M0(2131747898, null));
        ax9Var.e.setVisibility(8);
    }
}
