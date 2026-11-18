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
import org.telegram.ui.Components.l41;
import org.telegram.ui.qa0;
public final class y0 implements v10, org.telegram.ui.ActionBar.r1 {
    public final int f18538a;
    public final d1 f18539b;

    public y0(d1 d1Var, int i7) {
        this.f18538a = i7;
        this.f18539b = d1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f18538a) {
            case 1:
                this.f18539b.b0();
                return;
            case 2:
                this.f18539b.finishFragment();
                return;
            default:
                d1 d1Var = this.f18539b;
                d1Var.f18277b.b(true);
                TLRPC.UserFull d2 = d1Var.getMessagesController().d2(d1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (d2 != null) {
                    d2.business_location = null;
                    d2.flags2 &= -3;
                }
                d1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new z0(d1Var, 1));
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        d1 d1Var = this.f18539b;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = l41Var.d;
        if (i7 != 1 && l41Var.f37010c != d1Var.f18280f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getParentActivity());
                alertDialog$Builder.f28744a.S = gd.M0(2131752683, null);
                alertDialog$Builder.f28744a.U = gd.M0(2131752684, null);
                alertDialog$Builder.k(gd.M0(2131746126, null), new y0(d1Var, 3));
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                d1Var.showDialog(alertDialog$Builder.f28744a);
            }
        } else if (d1Var.f18285x != null && l41Var.f37010c != d1Var.f18280f) {
            d1Var.f18285x = null;
            d1Var.f18276a.f34607g3.O(true);
        } else {
            qa0 qa0Var = new qa0(8);
            if (d1Var.f18285x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = d1Var.f18286y;
                tL_channelLocation.geo_point = d1Var.f18285x;
                qa0Var.I0 = tL_channelLocation;
            }
            qa0Var.M0 = new ab.g(23, d1Var, qa0Var);
            if (d1Var.f18285x == null && !TextUtils.isEmpty(d1Var.f18286y)) {
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, d1Var.getParentActivity(), null);
                u1Var.f30047j0 = false;
                u1Var.r(200L);
                Utilities.f22781g.c(new w0(d1Var, qa0Var, u1Var));
                return;
            }
            d1Var.presentFragment(qa0Var);
        }
    }
}
