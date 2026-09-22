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
    public final int f10075a;
    public final Object f10076b;

    public a(Object obj, int i10) {
        this.f10075a = i10;
        this.f10076b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10075a) {
            case 0:
                z2 z2Var = (z2) this.f10076b;
                z2Var.f10077a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10076b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            case 2:
                d11 d11Var = (d11) this.f10076b;
                ProfileActivity profileActivity = d11Var.f32914n;
                int realCount = profileActivity.f31326n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                d11Var.a(false);
                d11Var.b(1.0f);
                if (profileActivity.f31346q0 != null) {
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
                ((g) this.f10076b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10075a) {
            case 0:
                z2 z2Var = (z2) this.f10076b;
                z2Var.f10077a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10076b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10076b).f();
                return;
        }
    }
}
