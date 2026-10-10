package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b11;
import org.telegram.ui.nz0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10965a;
    public final Object f10966b;

    public a(Object obj, int i10) {
        this.f10965a = i10;
        this.f10966b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10965a) {
            case 0:
                z2 z2Var = (z2) this.f10966b;
                z2Var.f10967a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10966b;
                if (d2Var.O.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            case 2:
                b11 b11Var = (b11) this.f10966b;
                ProfileActivity profileActivity = b11Var.f36139n;
                int realCount = profileActivity.f34341n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                b11Var.a(false);
                b11Var.b(1.0f);
                if (profileActivity.f34361q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new nz0(b11Var, 3), 500L);
                        return;
                    } else {
                        b11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10966b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10965a) {
            case 0:
                z2 z2Var = (z2) this.f10966b;
                z2Var.f10967a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10966b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10966b).f();
                return;
        }
    }
}
