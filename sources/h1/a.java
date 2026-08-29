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
    public final int f7502a;
    public final Object f7503b;

    public a(Object obj, int i10) {
        this.f7502a = i10;
        this.f7503b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f7502a) {
            case 0:
                c3 c3Var = (c3) this.f7503b;
                c3Var.f7504a = true;
                c3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f7503b;
                if (e2Var.K.isShowing()) {
                    e2Var.h();
                    return;
                }
                return;
            case 2:
                ((g) this.f7503b).f();
                return;
            default:
                yz0 yz0Var = (yz0) this.f7503b;
                ProfileActivity profileActivity = yz0Var.f44997n;
                int realCount = profileActivity.f36049j0.getRealCount();
                if (profileActivity.f36136w0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.J.A) {
                    profileActivity.f36136w0 = 1;
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
        switch (this.f7502a) {
            case 0:
                c3 c3Var = (c3) this.f7503b;
                c3Var.f7504a = false;
                c3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f7503b).dismiss();
                return;
            case 2:
                ((g) this.f7503b).f();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
