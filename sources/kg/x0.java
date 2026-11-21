package kg;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.o41;
import org.telegram.ui.qa0;
public final class x0 implements v10, org.telegram.ui.ActionBar.q1 {
    public final int f18558a;
    public final c1 f18559b;

    public x0(c1 c1Var, int i7) {
        this.f18558a = i7;
        this.f18559b = c1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18558a) {
            case 1:
                this.f18559b.b0();
                return;
            case 2:
                this.f18559b.finishFragment();
                return;
            default:
                c1 c1Var = this.f18559b;
                c1Var.f18302b.b(true);
                TLRPC.UserFull d2 = c1Var.getMessagesController().d2(c1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (d2 != null) {
                    d2.business_location = null;
                    d2.flags2 &= -3;
                }
                c1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new y0(c1Var, 1));
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c1 c1Var = this.f18559b;
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = o41Var.d;
        if (i7 != 1 && o41Var.f38090c != c1Var.f18305f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getParentActivity());
                alertDialog$Builder.f28774a.S = gd.N0(2131752682, null);
                alertDialog$Builder.f28774a.U = gd.N0(2131752683, null);
                alertDialog$Builder.k(gd.N0(2131746125, null), new x0(c1Var, 3));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                c1Var.showDialog(alertDialog$Builder.f28774a);
            }
        } else if (c1Var.f18310x != null && o41Var.f38090c != c1Var.f18305f) {
            c1Var.f18310x = null;
            c1Var.f18301a.f35796g3.O(true);
        } else {
            qa0 qa0Var = new qa0(8);
            if (c1Var.f18310x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = c1Var.f18311y;
                tL_channelLocation.geo_point = c1Var.f18310x;
                qa0Var.I0 = tL_channelLocation;
            }
            qa0Var.M0 = new ab.g(23, c1Var, qa0Var);
            if (c1Var.f18310x == null && !TextUtils.isEmpty(c1Var.f18311y)) {
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, c1Var.getParentActivity(), null);
                t1Var.f30030j0 = false;
                t1Var.r(200L);
                Utilities.f22809g.c(new v0(c1Var, qa0Var, t1Var));
                return;
            }
            c1Var.presentFragment(qa0Var);
        }
    }
}
