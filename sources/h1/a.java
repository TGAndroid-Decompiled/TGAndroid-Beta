package h1;

import android.database.DataSetObserver;
import m.b3;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
import org.telegram.ui.qy0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f11618a;
    public final Object f11619b;

    public a(Object obj, int i10) {
        this.f11618a = i10;
        this.f11619b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f11618a) {
            case 0:
                b3 b3Var = (b3) this.f11619b;
                b3Var.f11620a = true;
                b3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f11619b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            case 2:
                e01 e01Var = (e01) this.f11619b;
                ProfileActivity profileActivity = e01Var.f36487n;
                int realCount = profileActivity.f33673o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.B0 = 1;
                }
                e01Var.a(false);
                e01Var.b(1.0f);
                if (profileActivity.f33693r0 != null) {
                    if (profileActivity.U0.t()) {
                        AndroidUtilities.runOnUIThread(new qy0(e01Var, 3), 500L);
                        return;
                    } else {
                        e01Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f11619b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f11618a) {
            case 0:
                b3 b3Var = (b3) this.f11619b;
                b3Var.f11620a = false;
                b3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f11619b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f11619b).f();
                return;
        }
    }
}
