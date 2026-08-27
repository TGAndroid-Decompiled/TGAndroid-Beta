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

    public final int f7740a;

    public final Object f7741b;

    public a(Object obj, int i10) {
        this.f7740a = i10;
        this.f7741b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f7740a) {
            case 0:
                c3 c3Var = (c3) this.f7741b;
                c3Var.f7742a = true;
                c3Var.notifyDataSetChanged();
                break;
            case 1:
                e2 e2Var = (e2) this.f7741b;
                if (e2Var.K.isShowing()) {
                    e2Var.g();
                }
                break;
            case 2:
                ((g) this.f7741b).f();
                break;
            default:
                yz0 yz0Var = (yz0) this.f7741b;
                ProfileActivity profileActivity = yz0Var.f44979n;
                int realCount = profileActivity.f35987j0.getRealCount();
                if (profileActivity.f36073w0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.J.A) {
                    profileActivity.f36073w0 = 1;
                }
                yz0Var.a(false);
                yz0Var.b(1.0f);
                if (profileActivity.m0 != null) {
                    if (!profileActivity.P0.t()) {
                        yz0Var.c();
                    } else {
                        AndroidUtilities.runOnUIThread(new ky0(yz0Var, 3), 500L);
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f7740a) {
            case 0:
                c3 c3Var = (c3) this.f7741b;
                c3Var.f7742a = false;
                c3Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((e2) this.f7741b).dismiss();
                break;
            case 2:
                ((g) this.f7741b).f();
                break;
            default:
                super.onInvalidated();
                break;
        }
    }
}
