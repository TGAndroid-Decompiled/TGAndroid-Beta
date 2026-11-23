package kg;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.n41;
import org.telegram.ui.pa0;
public final class x0 implements u10, org.telegram.ui.ActionBar.q1 {
    public final int f18622a;
    public final c1 f18623b;

    public x0(c1 c1Var, int i7) {
        this.f18622a = i7;
        this.f18623b = c1Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18622a) {
            case 1:
                this.f18623b.b0();
                return;
            case 2:
                this.f18623b.finishFragment();
                return;
            default:
                c1 c1Var = this.f18623b;
                c1Var.f18367b.b(true);
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
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c1 c1Var = this.f18623b;
        n41 n41Var = (n41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = n41Var.d;
        if (i7 != 1 && n41Var.f37647c != c1Var.f18370f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c1Var.getParentActivity());
                alertDialog$Builder.f28835a.S = gd.N0(2131752682, null);
                alertDialog$Builder.f28835a.U = gd.N0(2131752683, null);
                alertDialog$Builder.k(gd.N0(2131746125, null), new x0(c1Var, 3));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                c1Var.showDialog(alertDialog$Builder.f28835a);
            }
        } else if (c1Var.f18375x != null && n41Var.f37647c != c1Var.f18370f) {
            c1Var.f18375x = null;
            c1Var.f18366a.f35323g3.O(true);
        } else {
            pa0 pa0Var = new pa0(8);
            if (c1Var.f18375x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = c1Var.f18376y;
                tL_channelLocation.geo_point = c1Var.f18375x;
                pa0Var.I0 = tL_channelLocation;
            }
            pa0Var.M0 = new ab.g(23, c1Var, pa0Var);
            if (c1Var.f18375x == null && !TextUtils.isEmpty(c1Var.f18376y)) {
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, c1Var.getParentActivity(), null);
                t1Var.f30091j0 = false;
                t1Var.r(200L);
                Utilities.f22879g.c(new v0(c1Var, pa0Var, t1Var));
                return;
            }
            c1Var.presentFragment(pa0Var);
        }
    }
}
