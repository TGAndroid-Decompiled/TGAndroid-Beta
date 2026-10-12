package h1;

import android.database.DataSetObserver;
import m.a3;
import m.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i11;
import org.telegram.ui.uz0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f10308a;
    public final Object f10309b;

    public a(Object obj, int i10) {
        this.f10308a = i10;
        this.f10309b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f10308a) {
            case 0:
                a3 a3Var = (a3) this.f10309b;
                a3Var.f10310a = true;
                a3Var.notifyDataSetChanged();
                return;
            case 1:
                d2 d2Var = (d2) this.f10309b;
                if (d2Var.O.isShowing()) {
                    d2Var.g();
                    return;
                }
                return;
            case 2:
                i11 i11Var = (i11) this.f10309b;
                ProfileActivity profileActivity = i11Var.f37009n;
                int realCount = profileActivity.f32620n0.getRealCount();
                if (profileActivity.A0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.A0 = 1;
                }
                i11Var.a(false);
                i11Var.b(1.0f);
                if (profileActivity.f32640q0 != null) {
                    if (profileActivity.T0.t()) {
                        AndroidUtilities.runOnUIThread(new uz0(i11Var, 3), 500L);
                        return;
                    } else {
                        i11Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f10309b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f10308a) {
            case 0:
                a3 a3Var = (a3) this.f10309b;
                a3Var.f10310a = false;
                a3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((d2) this.f10309b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f10309b).f();
                return;
        }
    }
}
