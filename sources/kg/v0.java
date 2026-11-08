package kg;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.x31;
import org.telegram.ui.pa0;
public final class v0 implements a20, org.telegram.ui.ActionBar.r1 {
    public final int f17561a;
    public final a1 f17562b;

    public v0(a1 a1Var, int i7) {
        this.f17561a = i7;
        this.f17562b = a1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f17561a) {
            case 1:
                this.f17562b.b0();
                return;
            case 2:
                this.f17562b.finishFragment();
                return;
            default:
                a1 a1Var = this.f17562b;
                a1Var.f17302b.b(true);
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
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        a1 a1Var = this.f17562b;
        x31 x31Var = (x31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = x31Var.d;
        if (i7 != 1 && x31Var.f40173c != a1Var.f17305f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a1Var.getParentActivity());
                alertDialog$Builder.f27296a.R = id.M0(2131752694, null);
                alertDialog$Builder.f27296a.T = id.M0(2131752695, null);
                alertDialog$Builder.k(id.M0(2131746322, null), new v0(a1Var, 3));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                a1Var.showDialog(alertDialog$Builder.f27296a);
            }
        } else if (a1Var.f17310x != null && x31Var.f40173c != a1Var.f17305f) {
            a1Var.f17310x = null;
            a1Var.f17301a.f37190f3.O(true);
        } else {
            pa0 pa0Var = new pa0(8);
            if (a1Var.f17310x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = a1Var.f17311y;
                tL_channelLocation.geo_point = a1Var.f17310x;
                pa0Var.C0 = tL_channelLocation;
            }
            pa0Var.G0 = new ab.g(21, a1Var, pa0Var);
            if (a1Var.f17310x == null && !TextUtils.isEmpty(a1Var.f17311y)) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a1Var.getParentActivity(), null);
                u1Var.f28572i0 = false;
                u1Var.r(200L);
                Utilities.f21338g.c(new t0(a1Var, pa0Var, u1Var));
                return;
            }
            a1Var.presentFragment(pa0Var);
        }
    }
}
