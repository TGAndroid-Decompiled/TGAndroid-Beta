package defpackage;

import android.database.DataSetObserver;
import org.telegram.ui.ProfileActivity;
public final class c43 extends DataSetObserver {
    public final byte a;
    public final Object b;

    public c43(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kbb kbbVar = (kbb) obj;
                kbbVar.a = true;
                kbbVar.notifyDataSetChanged();
                return;
            case 1:
                o56 o56Var = (o56) obj;
                if (o56Var.P.isShowing()) {
                    o56Var.f();
                    return;
                }
                return;
            case 2:
                mo8 mo8Var = (mo8) obj;
                ProfileActivity profileActivity = mo8Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = (byte) 1;
                }
                mo8Var.a(false);
                mo8Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (profileActivity.T0.y()) {
                        gl.d3(new w88(mo8Var, (byte) 24), 500L);
                        return;
                    } else {
                        mo8Var.c();
                        return;
                    }
                }
                return;
            default:
                ((gec) obj).f();
                return;
        }
    }

    @Override
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kbb kbbVar = (kbb) obj;
                kbbVar.a = false;
                kbbVar.notifyDataSetInvalidated();
                return;
            case 1:
                ((o56) obj).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((gec) obj).f();
                return;
        }
    }
}
