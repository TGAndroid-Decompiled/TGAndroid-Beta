package h1;

import android.database.DataSetObserver;
import m.c3;
import m.f2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h11;
import org.telegram.ui.tz0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10312a;
    public final Object f10313b;

    public a(Object obj, int i10) {
        this.f10312a = i10;
        this.f10313b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10312a) {
            case 0:
                c3 c3Var = (c3) this.f10313b;
                c3Var.f10314a = true;
                c3Var.notifyDataSetChanged();
                return;
            case 1:
                f2 f2Var = (f2) this.f10313b;
                if (f2Var.O.isShowing()) {
                    f2Var.g();
                    return;
                }
                return;
            case 2:
                h11 h11Var = (h11) this.f10313b;
                ProfileActivity profileActivity = h11Var.f36368n;
                int realCount = profileActivity.f32322n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                h11Var.a(false);
                h11Var.b(1.0f);
                if (profileActivity.f32342q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new tz0(h11Var, 3), 500L);
                        return;
                    } else {
                        h11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10313b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10312a) {
            case 0:
                c3 c3Var = (c3) this.f10313b;
                c3Var.f10314a = false;
                c3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((f2) this.f10313b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10313b).f();
                return;
        }
    }
}
