package h1;

import android.database.DataSetObserver;
import m.c3;
import m.e2;
import m2.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q01;
import org.telegram.ui.sz0;
public final class a extends DataSetObserver {
    public final int f6871a;
    public final Object f6872b;

    public a(Object obj, int i10) {
        this.f6871a = i10;
        this.f6872b = obj;
    }

    @Override
    public final void onChanged() {
        switch (this.f6871a) {
            case 0:
                c3 c3Var = (c3) this.f6872b;
                c3Var.f6873a = true;
                c3Var.notifyDataSetChanged();
                return;
            case 1:
                e2 e2Var = (e2) this.f6872b;
                if (e2Var.L.isShowing()) {
                    e2Var.g();
                    return;
                }
                return;
            case 2:
                ((h) this.f6872b).f();
                return;
            default:
                q01 q01Var = (q01) this.f6872b;
                ProfileActivity profileActivity = q01Var.f37274n;
                int realCount = profileActivity.f32073k0.getRealCount();
                if (profileActivity.f32162x0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.K.B) {
                    profileActivity.f32162x0 = 1;
                }
                q01Var.a(false);
                q01Var.b(1.0f);
                if (profileActivity.f32093n0 != null) {
                    if (profileActivity.Q0.t()) {
                        AndroidUtilities.runOnUIThread(new sz0(q01Var, 2), 500L);
                        return;
                    } else {
                        q01Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void onInvalidated() {
        switch (this.f6871a) {
            case 0:
                c3 c3Var = (c3) this.f6872b;
                c3Var.f6873a = false;
                c3Var.notifyDataSetInvalidated();
                return;
            case 1:
                ((e2) this.f6872b).dismiss();
                return;
            case 2:
                ((h) this.f6872b).f();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
