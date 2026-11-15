package c5;

import android.database.DataSetObserver;
import m.d2;
import m.y2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lw0;
import org.telegram.ui.pu0;
public final class i extends DataSetObserver {
    public final int f4144a;
    public final Object f4145b;

    public i(Object obj, int i7) {
        this.f4144a = i7;
        this.f4145b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f4144a) {
            case 0:
                ((l) this.f4145b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f4145b;
                y2Var.f15595a = true;
                y2Var.notifyDataSetChanged();
                return;
            case 2:
                d2 d2Var = (d2) this.f4145b;
                if (d2Var.P.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            default:
                lw0 lw0Var = (lw0) this.f4145b;
                ProfileActivity profileActivity = lw0Var.f49051n;
                int realCount = profileActivity.f43161o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = 1;
                }
                lw0Var.a(false);
                lw0Var.b(1.0f);
                if (profileActivity.f43182r0 != null) {
                    if (profileActivity.T0.y()) {
                        g0.i3(new pu0(lw0Var, 4), 500L);
                        return;
                    } else {
                        lw0Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f4144a) {
            case 0:
                ((l) this.f4145b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f4145b;
                y2Var.f15595a = false;
                y2Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((d2) this.f4145b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
