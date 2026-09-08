package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d11;
import org.telegram.ui.f01;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10856a;
    public final Object f10857b;

    public a(Object obj, int i10) {
        this.f10856a = i10;
        this.f10857b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10856a) {
            case 0:
                z2 z2Var = (z2) this.f10857b;
                z2Var.f10858a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10857b;
                if (d2Var.O.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            case 2:
                d11 d11Var = (d11) this.f10857b;
                ProfileActivity profileActivity = d11Var.f35638n;
                int realCount = profileActivity.f33975n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                d11Var.a(false);
                d11Var.b(1.0f);
                if (profileActivity.f33995q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new f01(d11Var, 2), 500L);
                        return;
                    } else {
                        d11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10857b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10856a) {
            case 0:
                z2 z2Var = (z2) this.f10857b;
                z2Var.f10858a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10857b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10857b).f();
                return;
        }
    }
}
