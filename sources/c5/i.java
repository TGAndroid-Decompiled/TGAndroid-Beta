package c5;

import android.database.DataSetObserver;
import m.d2;
import m.y2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mw0;
import org.telegram.ui.qu0;
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
                y2Var.f15999a = true;
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
                mw0 mw0Var = (mw0) this.f4418b;
                ProfileActivity profileActivity = mw0Var.f50133n;
                int realCount = profileActivity.f43733o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = 1;
                }
                mw0Var.a(false);
                mw0Var.b(1.0f);
                if (profileActivity.f43754r0 != null) {
                    if (profileActivity.T0.y()) {
                        g0.h3(new qu0(mw0Var, 4), 500L);
                        return;
                    } else {
                        mw0Var.c();
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
                y2Var.f15999a = false;
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
