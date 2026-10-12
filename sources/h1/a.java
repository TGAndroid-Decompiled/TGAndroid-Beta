package h1;

import android.database.DataSetObserver;
import m.a3;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d11;
import org.telegram.ui.pz0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10963a;
    public final Object f10964b;

    public a(Object obj, int i10) {
        this.f10963a = i10;
        this.f10964b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10963a) {
            case 0:
                a3 a3Var = (a3) this.f10964b;
                a3Var.f10965a = true;
                a3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f10964b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            case 2:
                d11 d11Var = (d11) this.f10964b;
                ProfileActivity profileActivity = d11Var.f36610n;
                int realCount = profileActivity.f34142n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                d11Var.a(false);
                d11Var.b(1.0f);
                if (profileActivity.f34162q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new pz0(d11Var, 3), 500L);
                        return;
                    } else {
                        d11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10964b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10963a) {
            case 0:
                a3 a3Var = (a3) this.f10964b;
                a3Var.f10965a = false;
                a3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f10964b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10964b).f();
                return;
        }
    }
}
