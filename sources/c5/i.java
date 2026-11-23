package c5;

import android.database.DataSetObserver;
import m.d2;
import m.y2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ow0;
import org.telegram.ui.ru0;
public final class i extends DataSetObserver {
    public final int f4454a;
    public final Object f4455b;

    public i(Object obj, int i7) {
        this.f4454a = i7;
        this.f4455b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f4454a) {
            case 0:
                ((l) this.f4455b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f4455b;
                y2Var.f15938a = true;
                y2Var.notifyDataSetChanged();
                return;
            case 2:
                d2 d2Var = (d2) this.f4455b;
                if (d2Var.P.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            default:
                ow0 ow0Var = (ow0) this.f4455b;
                ProfileActivity profileActivity = ow0Var.f50670n;
                int realCount = profileActivity.f43652o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = 1;
                }
                ow0Var.a(false);
                ow0Var.b(1.0f);
                if (profileActivity.f43673r0 != null) {
                    if (profileActivity.T0.y()) {
                        g0.h3(new ru0(ow0Var, 4), 500L);
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
        switch (this.f4454a) {
            case 0:
                ((l) this.f4455b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f4455b;
                y2Var.f15938a = false;
                y2Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((d2) this.f4455b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
