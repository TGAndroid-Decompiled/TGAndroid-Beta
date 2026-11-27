package defpackage;

import android.database.DataSetObserver;
import org.telegram.ui.ProfileActivity;
public final class u43 extends DataSetObserver {
    public final byte a;
    public final Object b;

    public u43(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gfb gfbVar = (gfb) obj;
                gfbVar.a = true;
                gfbVar.notifyDataSetChanged();
                return;
            case 1:
                s76 s76Var = (s76) obj;
                if (s76Var.P.isShowing()) {
                    s76Var.g();
                    return;
                }
                return;
            case 2:
                yr8 yr8Var = (yr8) obj;
                ProfileActivity profileActivity = yr8Var.n;
                int realCount = profileActivity.o0.getRealCount();
                if (profileActivity.B0 == 0 && realCount > 1 && realCount <= 20 && profileActivity.N.F) {
                    profileActivity.B0 = (byte) 1;
                }
                yr8Var.a(false);
                yr8Var.b(1.0f);
                if (profileActivity.r0 != null) {
                    if (profileActivity.T0.y()) {
                        hl.d3(new uk8(yr8Var, (byte) 10), 500L);
                        return;
                    } else {
                        yr8Var.c();
                        return;
                    }
                }
                return;
            default:
                ((fic) obj).f();
                return;
        }
    }

    @Override
    public final void onInvalidated() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gfb gfbVar = (gfb) obj;
                gfbVar.a = false;
                gfbVar.notifyDataSetInvalidated();
                return;
            case 1:
                ((s76) obj).dismiss();
                return;
            case 2:
            default:
                super.onInvalidated();
                return;
            case 3:
                ((fic) obj).f();
                return;
        }
    }
}
