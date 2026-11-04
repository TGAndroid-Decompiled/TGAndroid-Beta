package b5;

import android.database.DataSetObserver;
import m.d2;
import m.y2;
import org.telegram.messenger.g0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ew0;
import org.telegram.ui.pu0;
public final class i extends DataSetObserver {
    public final int f2406a;
    public final Object f2407b;

    public i(Object obj, int i3) {
        this.f2406a = i3;
        this.f2407b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f2406a) {
            case 0:
                ((l) this.f2407b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f2407b;
                y2Var.f14094a = true;
                y2Var.notifyDataSetChanged();
                return;
            case 2:
                d2 d2Var = (d2) this.f2407b;
                if (d2Var.P.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            default:
                ew0 ew0Var = (ew0) this.f2407b;
                ProfileActivity profileActivity = ew0Var.f45062n;
                int realCount = profileActivity.f41817o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = 1;
                }
                ew0Var.a(false);
                ew0Var.b(1.0f);
                if (profileActivity.f41839r0 != null) {
                    if (profileActivity.T0.x()) {
                        g0.i3(new pu0(ew0Var, 3), 500L);
                        return;
                    } else {
                        ew0Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f2406a) {
            case 0:
                ((l) this.f2407b).f();
                return;
            case 1:
                y2 y2Var = (y2) this.f2407b;
                y2Var.f14094a = false;
                y2Var.notifyDataSetInvalidated();
                return;
            case 2:
                ((d2) this.f2407b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
