package kg;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b41;
import org.telegram.ui.pa0;
public final class v0 implements x10, org.telegram.ui.ActionBar.q1 {
    public final int f18120a;
    public final a1 f18121b;

    public v0(a1 a1Var, int i7) {
        this.f18120a = i7;
        this.f18121b = a1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18120a) {
            case 1:
                this.f18121b.b0();
                return;
            case 2:
                this.f18121b.finishFragment();
                return;
            default:
                a1 a1Var = this.f18121b;
                a1Var.f17861b.b(true);
                TLRPC.UserFull b22 = a1Var.getMessagesController().b2(a1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (b22 != null) {
                    b22.business_location = null;
                    b22.flags2 &= -3;
                }
                a1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new w0(a1Var, 1));
                return;
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a1 a1Var = this.f18121b;
        b41 b41Var = (b41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = b41Var.d;
        if (i7 != 1 && b41Var.f33174c != a1Var.f17864f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a1Var.getParentActivity());
                alertDialog$Builder.f28392a.S = hd.M0(2131752694, null);
                alertDialog$Builder.f28392a.U = hd.M0(2131752695, null);
                alertDialog$Builder.k(hd.M0(2131746321, null), new v0(a1Var, 3));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                a1Var.showDialog(alertDialog$Builder.f28392a);
            }
        } else if (a1Var.f17869x != null && b41Var.f33174c != a1Var.f17864f) {
            a1Var.f17869x = null;
            a1Var.f17860a.f39895g3.O(true);
        } else {
            pa0 pa0Var = new pa0(8);
            if (a1Var.f17869x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = a1Var.f17870y;
                tL_channelLocation.geo_point = a1Var.f17869x;
                pa0Var.D0 = tL_channelLocation;
            }
            pa0Var.H0 = new ab.g(25, a1Var, pa0Var);
            if (a1Var.f17869x == null && !TextUtils.isEmpty(a1Var.f17870y)) {
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, a1Var.getParentActivity(), null);
                t1Var.f29637j0 = false;
                t1Var.r(200L);
                Utilities.f22418g.c(new t0(a1Var, pa0Var, t1Var));
                return;
            }
            a1Var.presentFragment(pa0Var);
        }
    }
}
