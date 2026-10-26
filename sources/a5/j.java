package a5;

import android.database.DataSetObserver;
import m.a3;
import m.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
import org.telegram.ui.my0;
public final class j extends DataSetObserver {
    public final int f293a;
    public final Object f294b;

    public j(Object obj, int i10) {
        this.f293a = i10;
        this.f294b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f293a) {
            case 0:
                ((m) this.f294b).f();
                return;
            case 1:
                a3 a3Var = (a3) this.f294b;
                a3Var.f12554a = true;
                a3Var.notifyDataSetChanged();
                return;
            case 2:
                d2 d2Var = (d2) this.f294b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            default:
                m01 m01Var = (m01) this.f294b;
                ProfileActivity profileActivity = m01Var.f41429n;
                int realCount = profileActivity.f36040n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                m01Var.a(false);
                m01Var.b(1.0f);
                if (profileActivity.f36061q0 != null) {
                    if (profileActivity.T0.x()) {
                        AndroidUtilities.runOnUIThread(new my0(m01Var, 5), 500L);
                        return;
                    } else {
                        m01Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f293a) {
            case 0:
                ((m) this.f294b).f();
                return;
            case 1:
                a3 a3Var = (a3) this.f294b;
                a3Var.f12554a = false;
                a3Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((d2) this.f294b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
