package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hz0;
import org.telegram.ui.v01;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10960a;
    public final Object f10961b;

    public a(Object obj, int i10) {
        this.f10960a = i10;
        this.f10961b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10960a) {
            case 0:
                z2 z2Var = (z2) this.f10961b;
                z2Var.f10962a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10961b;
                if (d2Var.O.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            case 2:
                v01 v01Var = (v01) this.f10961b;
                ProfileActivity profileActivity = v01Var.f41521n;
                int realCount = profileActivity.f34300n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                v01Var.a(false);
                v01Var.b(1.0f);
                if (profileActivity.f34320q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new hz0(v01Var, 3), 500L);
                        return;
                    } else {
                        v01Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10961b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10960a) {
            case 0:
                z2 z2Var = (z2) this.f10961b;
                z2Var.f10962a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10961b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10961b).f();
                return;
        }
    }
}
