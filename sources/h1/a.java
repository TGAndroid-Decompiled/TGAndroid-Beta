package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.i0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay0;
import org.telegram.ui.wv0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f7568a;
    public final Object f7569b;

    public a(Object obj, int i10) {
        this.f7568a = i10;
        this.f7569b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f7568a) {
            case 0:
                z2 z2Var = (z2) this.f7569b;
                z2Var.f7570a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f7569b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            case 2:
                ay0 ay0Var = (ay0) this.f7569b;
                ProfileActivity profileActivity = ay0Var.f35908n;
                int realCount = profileActivity.f33864n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                ay0Var.a(false);
                ay0Var.b(1.0f);
                if (profileActivity.f33884q0 != null) {
                    if (profileActivity.S0.x()) {
                        i0.h3(new wv0(ay0Var, 6), 500L);
                        return;
                    } else {
                        ay0Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f7569b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f7568a) {
            case 0:
                z2 z2Var = (z2) this.f7569b;
                z2Var.f7570a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f7569b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f7569b).f();
                return;
        }
    }
}
