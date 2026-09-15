package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c11;
import org.telegram.ui.e01;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10074a;
    public final Object f10075b;

    public a(Object obj, int i10) {
        this.f10074a = i10;
        this.f10075b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10074a) {
            case 0:
                z2 z2Var = (z2) this.f10075b;
                z2Var.f10076a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10075b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            case 2:
                c11 c11Var = (c11) this.f10075b;
                ProfileActivity profileActivity = c11Var.f32633n;
                int realCount = profileActivity.f31329n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                c11Var.a(false);
                c11Var.b(1.0f);
                if (profileActivity.f31349q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new e01(c11Var, 2), 500L);
                        return;
                    } else {
                        c11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10075b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10074a) {
            case 0:
                z2 z2Var = (z2) this.f10075b;
                z2Var.f10076a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10075b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10075b).f();
                return;
        }
    }
}
