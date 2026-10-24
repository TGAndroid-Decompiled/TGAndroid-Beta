package h1;

import android.database.DataSetObserver;
import m.b3;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h01;
import org.telegram.ui.ly0;
import z4.h;
public final class a extends DataSetObserver {
    public final int f11643a;
    public final Object f11644b;

    public a(Object obj, int i10) {
        this.f11643a = i10;
        this.f11644b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f11643a) {
            case 0:
                b3 b3Var = (b3) this.f11644b;
                b3Var.f11645a = true;
                b3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f11644b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            case 2:
                h01 h01Var = (h01) this.f11644b;
                ProfileActivity profileActivity = h01Var.f37712n;
                int realCount = profileActivity.f33983o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.B0 = 1;
                }
                h01Var.a(false);
                h01Var.b(1.0f);
                if (profileActivity.f34003r0 != null) {
                    if (profileActivity.U0.t()) {
                        AndroidUtilities.runOnUIThread(new ly0(h01Var, 4), 500L);
                        return;
                    } else {
                        h01Var.c();
                        return;
                    }
                }
                return;
            default:
                ((h) this.f11644b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f11643a) {
            case 0:
                b3 b3Var = (b3) this.f11644b;
                b3Var.f11645a = false;
                b3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f11644b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((h) this.f11644b).f();
                return;
        }
    }
}
