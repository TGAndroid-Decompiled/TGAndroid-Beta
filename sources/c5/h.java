package c5;

import android.database.DataSetObserver;
import m.e2;
import m.z2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pw0;
import org.telegram.ui.uu0;
public final class h extends DataSetObserver {
    public final int f5321a;
    public final Object f5322b;

    public h(Object obj, int i7) {
        this.f5321a = i7;
        this.f5322b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f5321a) {
            case 0:
                ((k) this.f5322b).f();
                return;
            case 1:
                z2 z2Var = (z2) this.f5322b;
                z2Var.f15143a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 2:
                e2 e2Var = (e2) this.f5322b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            default:
                pw0 pw0Var = (pw0) this.f5322b;
                ProfileActivity profileActivity = pw0Var.f48849n;
                int realCount = profileActivity.f41782n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                pw0Var.a(false);
                pw0Var.b(1.0f);
                if (profileActivity.f41801q0 != null) {
                    if (profileActivity.S0.x()) {
                        g0.i3(new uu0(pw0Var, 4), 500L);
                        return;
                    } else {
                        pw0Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f5321a) {
            case 0:
                ((k) this.f5322b).f();
                return;
            case 1:
                z2 z2Var = (z2) this.f5322b;
                z2Var.f15143a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((e2) this.f5322b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
