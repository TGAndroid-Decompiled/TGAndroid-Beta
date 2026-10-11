package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a11;
import org.telegram.ui.mz0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10964a;
    public final Object f10965b;

    public a(Object obj, int i10) {
        this.f10964a = i10;
        this.f10965b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10964a) {
            case 0:
                z2 z2Var = (z2) this.f10965b;
                z2Var.f10966a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10965b;
                if (d2Var.O.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            case 2:
                a11 a11Var = (a11) this.f10965b;
                ProfileActivity profileActivity = a11Var.f35874n;
                int realCount = profileActivity.f34365n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                a11Var.a(false);
                a11Var.b(1.0f);
                if (profileActivity.f34385q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new mz0(a11Var, 3), 500L);
                        return;
                    } else {
                        a11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10965b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10964a) {
            case 0:
                z2 z2Var = (z2) this.f10965b;
                z2Var.f10966a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10965b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10965b).f();
                return;
        }
    }
}
