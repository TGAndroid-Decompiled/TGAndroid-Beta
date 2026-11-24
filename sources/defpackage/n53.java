package defpackage;

import android.database.DataSetObserver;
import org.telegram.ui.ProfileActivity;
public final class n53 extends DataSetObserver {
    public final byte a;
    public final Object b;

    public n53(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mdb mdbVar = (mdb) obj;
                mdbVar.a = true;
                mdbVar.notifyDataSetChanged();
                return;
            case 1:
                o76 o76Var = (o76) obj;
                if (o76Var.P.isShowing()) {
                    o76Var.f();
                    return;
                }
                return;
            case 2:
                nq8 nq8Var = (nq8) obj;
                ProfileActivity profileActivity = nq8Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = (byte) 1;
                }
                nq8Var.a(false);
                nq8Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (profileActivity.T0.y()) {
                        gm.d3(new pp8(nq8Var, (byte) 2), 500L);
                        return;
                    } else {
                        nq8Var.c();
                        return;
                    }
                }
                return;
            default:
                ((ggc) obj).f();
                return;
        }
    }

    @Override
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mdb mdbVar = (mdb) obj;
                mdbVar.a = false;
                mdbVar.notifyDataSetInvalidated();
                return;
            case 1:
                ((o76) obj).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((ggc) obj).f();
                return;
        }
    }
}
