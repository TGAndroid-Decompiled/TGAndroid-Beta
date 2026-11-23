package c5;

import android.database.DataSetObserver;
import m.d2;
import m.y2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ow0;
import org.telegram.ui.su0;
public final class i extends DataSetObserver {
    public final int f4417a;
    public final Object f4418b;

    public i(Object obj, int i7) {
        this.f4417a = i7;
        this.f4418b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f4417a) {
            case 0:
                ((l) this.f4418b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f4418b;
                y2Var.f15904a = true;
                y2Var.notifyDataSetChanged();
                return;
            case 2:
                d2 d2Var = (d2) this.f4418b;
                if (d2Var.P.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            default:
                ow0 ow0Var = (ow0) this.f4418b;
                ProfileActivity profileActivity = ow0Var.f50651n;
                int realCount = profileActivity.f43617o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = 1;
                }
                ow0Var.a(false);
                ow0Var.b(1.0f);
                if (profileActivity.f43638r0 != null) {
                    if (profileActivity.T0.y()) {
                        g0.h3(new su0(ow0Var, 4), 500L);
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
        switch (this.f4417a) {
            case 0:
                ((l) this.f4418b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f4418b;
                y2Var.f15904a = false;
                y2Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((d2) this.f4418b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
