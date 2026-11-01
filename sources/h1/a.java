package h1;

import android.database.DataSetObserver;
import m.d2;
import m.z2;
import org.telegram.messenger.i0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vv0;
import org.telegram.ui.zx0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f7569a;
    public final Object f7570b;

    public a(Object obj, int i10) {
        this.f7569a = i10;
        this.f7570b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f7569a) {
            case 0:
                z2 z2Var = (z2) this.f7570b;
                z2Var.f7571a = true;
                z2Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f7570b;
                if (d2Var.O.isShowing()) {
                    d2Var.h();
                    return;
                }
                return;
            case 2:
                zx0 zx0Var = (zx0) this.f7570b;
                ProfileActivity profileActivity = zx0Var.f44251n;
                int realCount = profileActivity.f33871n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.M.E) {
                    profileActivity.A0 = 1;
                }
                zx0Var.a(false);
                zx0Var.b(1.0f);
                if (profileActivity.f33891q0 != null) {
                    if (profileActivity.S0.x()) {
                        i0.h3(new vv0(zx0Var, 6), 500L);
                        return;
                    } else {
                        zx0Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f7570b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f7569a) {
            case 0:
                z2 z2Var = (z2) this.f7570b;
                z2Var.f7571a = false;
                z2Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f7570b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f7570b).f();
                return;
        }
    }
}
