package h1;

import android.database.DataSetObserver;
import m.b3;
import m.d2;
import m2.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l01;
import org.telegram.ui.xy0;
public final class a extends DataSetObserver {
    public final int f7181a;
    public final Object f7182b;

    public a(Object obj, int i10) {
        this.f7181a = i10;
        this.f7182b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f7181a) {
            case 0:
                b3 b3Var = (b3) this.f7182b;
                b3Var.f7183a = true;
                b3Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f7182b;
                if (d2Var.L.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            case 2:
                ((h) this.f7182b).f();
                return;
            default:
                l01 l01Var = (l01) this.f7182b;
                ProfileActivity profileActivity = l01Var.f38546n;
                int realCount = profileActivity.f34632k0.getRealCount();
                if (profileActivity.f34721x0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.K.B) {
                    profileActivity.f34721x0 = 1;
                }
                l01Var.a(false);
                l01Var.b(1.0f);
                if (profileActivity.f34652n0 != null) {
                    if (profileActivity.Q0.t()) {
                        AndroidUtilities.runOnUIThread(new xy0(l01Var, 3), 500L);
                        return;
                    } else {
                        l01Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f7181a) {
            case 0:
                b3 b3Var = (b3) this.f7182b;
                b3Var.f7183a = false;
                b3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f7182b).dismiss();
                return;
            case 2:
                ((h) this.f7182b).f();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
