package c5;

import android.database.DataSetObserver;
import m.e2;
import m.z2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ow0;
import org.telegram.ui.tu0;
public final class h extends DataSetObserver {
    public final int f5316a;
    public final Object f5317b;

    public h(Object obj, int i7) {
        this.f5316a = i7;
        this.f5317b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f5316a) {
            case 0:
                ((k) this.f5317b).f();
                return;
            case 1:
                z2 z2Var = (z2) this.f5317b;
                z2Var.f15141a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 2:
                e2 e2Var = (e2) this.f5317b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            default:
                ow0 ow0Var = (ow0) this.f5317b;
                ProfileActivity profileActivity = ow0Var.f48533n;
                int realCount = profileActivity.f41791n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                ow0Var.a(false);
                ow0Var.b(1.0f);
                if (profileActivity.f41810q0 != null) {
                    if (profileActivity.S0.x()) {
                        g0.i3(new tu0(ow0Var, 4), 500L);
                        return;
                    } else {
                        ow0Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f5316a) {
            case 0:
                ((k) this.f5317b).f();
                return;
            case 1:
                z2 z2Var = (z2) this.f5317b;
                z2Var.f15141a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((e2) this.f5317b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
