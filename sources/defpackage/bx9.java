package defpackage;

import android.app.Activity;
import java.util.ArrayList;
public final class bx9 extends nk3 {
    public final bj3 l0;

    public bx9(bj3 bj3Var, d79 d79Var, Activity activity, int i, int i2) {
        super(d79Var, activity, i, i2, false, null);
        this.l0 = bj3Var;
    }

    @Override
    public final void O(boolean z) {
        boolean z2;
        ArrayList arrayList;
        super.O(z);
        ax9 ax9Var = this.l0.o0;
        if (!this.c0 && !this.d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        ax9Var.e(z2, z);
        ax9Var.d.setText(ob6.M0(2131747898, null));
        ax9Var.e.setVisibility(8);
    }
}
