package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v01;
import org.telegram.ui.xz0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10061a;
    public final Object f10062b;

    public a(Object obj, int i10) {
        this.f10061a = i10;
        this.f10062b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10061a) {
            case 0:
                z2 z2Var = (z2) this.f10062b;
                z2Var.f10063a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10062b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            case 2:
                v01 v01Var = (v01) this.f10062b;
                ProfileActivity profileActivity = v01Var.f38259n;
                int realCount = profileActivity.f31300n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                v01Var.a(false);
                v01Var.b(1.0f);
                if (profileActivity.f31320q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new xz0(v01Var, 2), 500L);
                        return;
                    } else {
                        v01Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10062b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10061a) {
            case 0:
                z2 z2Var = (z2) this.f10062b;
                z2Var.f10063a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10062b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10062b).f();
                return;
        }
    }
}
