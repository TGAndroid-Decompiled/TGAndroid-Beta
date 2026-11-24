package defpackage;

import android.app.Activity;
import java.util.ArrayList;
public final class jv9 extends gl3 {
    public final sj3 l0;

    public jv9(sj3 sj3Var, r59 r59Var, Activity activity, int i, int i2) {
        super(r59Var, activity, i, i2, false, null);
        this.l0 = sj3Var;
    }

    @Override
    public final void O(boolean z) {
        boolean z2;
        ArrayList arrayList;
        super.O(z);
        iv9 iv9Var = this.l0.o0;
        if (!this.c0 && !this.d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        iv9Var.e(z2, z);
        iv9Var.d.setText(jb6.M0(2131747901, null));
        iv9Var.e.setVisibility(8);
    }
}
