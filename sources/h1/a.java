package h1;

import android.database.DataSetObserver;
import m.b3;
import m.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g01;
import org.telegram.ui.sy0;
import z4.g;
public final class a extends DataSetObserver {
    public final int f11619a;
    public final Object f11620b;

    public a(Object obj, int i10) {
        this.f11619a = i10;
        this.f11620b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f11619a) {
            case 0:
                b3 b3Var = (b3) this.f11620b;
                b3Var.f11621a = true;
                b3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f11620b;
                if (e2Var.O.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            case 2:
                g01 g01Var = (g01) this.f11620b;
                ProfileActivity profileActivity = g01Var.f37048n;
                int realCount = profileActivity.f33674o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.E) {
                    profileActivity.B0 = 1;
                }
                g01Var.a(false);
                g01Var.b(1.0f);
                if (profileActivity.f33694r0 != null) {
                    if (profileActivity.U0.t()) {
                        AndroidUtilities.runOnUIThread(new sy0(g01Var, 3), 500L);
                        return;
                    } else {
                        g01Var.c();
                        return;
                    }
                }
                return;
            default:
                ((g) this.f11620b).f();
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f11619a) {
            case 0:
                b3 b3Var = (b3) this.f11620b;
                b3Var.f11621a = false;
                b3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f11620b).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((g) this.f11620b).f();
                return;
        }
    }
}
