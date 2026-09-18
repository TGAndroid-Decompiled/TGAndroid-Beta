package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e11;
import org.telegram.ui.g01;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10079a;
    public final Object f10080b;

    public a(Object obj, int i10) {
        this.f10079a = i10;
        this.f10080b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10079a) {
            case 0:
                z2 z2Var = (z2) this.f10080b;
                z2Var.f10081a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10080b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            case 2:
                e11 e11Var = (e11) this.f10080b;
                ProfileActivity profileActivity = e11Var.f33266n;
                int realCount = profileActivity.f31346n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                e11Var.a(false);
                e11Var.b(1.0f);
                if (profileActivity.f31366q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new g01(e11Var, 2), 500L);
                        return;
                    } else {
                        e11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10080b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10079a) {
            case 0:
                z2 z2Var = (z2) this.f10080b;
                z2Var.f10081a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10080b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10080b).f();
                return;
        }
    }
}
