package h1;

import android.database.DataSetObserver;
import m.c3;
import m.e2;
import m2.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j01;
import org.telegram.ui.vy0;
public final class a extends DataSetObserver {
    public final int f6884a;
    public final Object f6885b;

    public a(Object obj, int i10) {
        this.f6884a = i10;
        this.f6885b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f6884a) {
            case 0:
                c3 c3Var = (c3) this.f6885b;
                c3Var.f6886a = true;
                c3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f6885b;
                if (e2Var.L.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            case 2:
                ((h) this.f6885b).f();
                return;
            default:
                j01 j01Var = (j01) this.f6885b;
                ProfileActivity profileActivity = j01Var.f35196n;
                int realCount = profileActivity.f32099k0.getRealCount();
                if (profileActivity.f32188x0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.K.B) {
                    profileActivity.f32188x0 = 1;
                }
                j01Var.a(false);
                j01Var.b(1.0f);
                if (profileActivity.f32119n0 != null) {
                    if (profileActivity.Q0.t()) {
                        AndroidUtilities.runOnUIThread(new vy0(j01Var, 3), 500L);
                        return;
                    } else {
                        j01Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f6884a) {
            case 0:
                c3 c3Var = (c3) this.f6885b;
                c3Var.f6886a = false;
                c3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f6885b).dismiss();
                return;
            case 2:
                ((h) this.f6885b).f();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
