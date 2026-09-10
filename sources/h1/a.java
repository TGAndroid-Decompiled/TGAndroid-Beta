package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i11;
import org.telegram.ui.k01;
import z4.g;
public final class a extends DataSetObserver {
    public final int f9192a;
    public final Object f9193b;

    public a(Object obj, int i10) {
        this.f9192a = i10;
        this.f9193b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f9192a) {
            case 0:
                z2 z2Var = (z2) this.f9193b;
                z2Var.f9194a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f9193b;
                if (d2Var.O.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            case 2:
                i11 i11Var = (i11) this.f9193b;
                ProfileActivity profileActivity = i11Var.f33518n;
                int realCount = profileActivity.f30441n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                i11Var.a(false);
                i11Var.b(1.0f);
                if (profileActivity.f30461q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new k01(i11Var, 2), 500L);
                        return;
                    } else {
                        i11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f9193b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f9192a) {
            case 0:
                z2 z2Var = (z2) this.f9193b;
                z2Var.f9194a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f9193b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f9193b).f();
                return;
        }
    }
}
