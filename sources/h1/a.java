package h1;

import android.database.DataSetObserver;
import m.c3;
import m.e2;
import m2.g;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ky0;
import org.telegram.ui.yz0;
public final class a extends DataSetObserver {
    public final int f9308a;
    public final Object f9309b;

    public a(Object obj, int i9) {
        this.f9308a = i9;
        this.f9309b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f9308a) {
            case 0:
                c3 c3Var = (c3) this.f9309b;
                c3Var.f9310a = true;
                c3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f9309b;
                if (e2Var.K.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            case 2:
                ((g) this.f9309b).f();
                return;
            default:
                yz0 yz0Var = (yz0) this.f9309b;
                ProfileActivity profileActivity = yz0Var.f44986n;
                int realCount = profileActivity.f35984j0.getRealCount();
                if (profileActivity.f36070w0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.J.A) {
                    profileActivity.f36070w0 = 1;
                }
                yz0Var.a(false);
                yz0Var.b(1.0f);
                if (profileActivity.m0 != null) {
                    if (profileActivity.P0.t()) {
                        AndroidUtilities.runOnUIThread(new ky0(yz0Var, 3), 500L);
                        return;
                    } else {
                        yz0Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f9308a) {
            case 0:
                c3 c3Var = (c3) this.f9309b;
                c3Var.f9310a = false;
                c3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f9309b).dismiss();
                return;
            case 2:
                ((g) this.f9309b).f();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
