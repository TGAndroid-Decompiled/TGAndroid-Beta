package c5;

import android.database.DataSetObserver;
import m.e2;
import m.z2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.mw0;
import org.telegram.ui.ru0;
public final class h extends DataSetObserver {
    public final int f5318a;
    public final Object f5319b;

    public h(Object obj, int i7) {
        this.f5318a = i7;
        this.f5319b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f5318a) {
            case 0:
                ((k) this.f5319b).f();
                return;
            case 1:
                z2 z2Var = (z2) this.f5319b;
                z2Var.f15138a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 2:
                e2 e2Var = (e2) this.f5319b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            default:
                mw0 mw0Var = (mw0) this.f5319b;
                ProfileActivity profileActivity = mw0Var.f47892n;
                int realCount = profileActivity.f41780n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                mw0Var.a(false);
                mw0Var.b(1.0f);
                if (profileActivity.f41799q0 != null) {
                    if (profileActivity.S0.x()) {
                        g0.i3(new ru0(mw0Var, 4), 500L);
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
        switch (this.f5318a) {
            case 0:
                ((k) this.f5319b).f();
                return;
            case 1:
                z2 z2Var = (z2) this.f5319b;
                z2Var.f15138a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((e2) this.f5319b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
