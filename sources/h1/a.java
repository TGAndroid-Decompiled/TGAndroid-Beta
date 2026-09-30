package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.t01;
import org.telegram.ui.vz0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10074a;
    public final Object f10075b;

    public a(Object obj, int i10) {
        this.f10074a = i10;
        this.f10075b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10074a) {
            case 0:
                z2 z2Var = (z2) this.f10075b;
                z2Var.f10076a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10075b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            case 2:
                t01 t01Var = (t01) this.f10075b;
                ProfileActivity profileActivity = t01Var.f38016n;
                int realCount = profileActivity.f31689n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                t01Var.a(false);
                t01Var.b(1.0f);
                if (profileActivity.f31709q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new vz0(t01Var, 2), 500L);
                        return;
                    } else {
                        t01Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10075b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10074a) {
            case 0:
                z2 z2Var = (z2) this.f10075b;
                z2Var.f10076a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10075b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10075b).f();
                return;
        }
    }
}
