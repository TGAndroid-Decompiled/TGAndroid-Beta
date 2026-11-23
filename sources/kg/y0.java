package kg;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.o41;
import org.telegram.ui.qa0;
public final class y0 implements w10, org.telegram.ui.ActionBar.q1 {
    public final int f18535a;
    public final d1 f18536b;

    public y0(d1 d1Var, int i7) {
        this.f18535a = i7;
        this.f18536b = d1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18535a) {
            case 1:
                this.f18536b.b0();
                return;
            case 2:
                this.f18536b.finishFragment();
                return;
            default:
                d1 d1Var = this.f18536b;
                d1Var.f18275b.b(true);
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
        d1 d1Var = this.f18536b;
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i7 = o41Var.d;
        if (i7 != 1 && o41Var.f38050c != d1Var.f18278f) {
            if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d1Var.getParentActivity());
                alertDialog$Builder.f28743a.S = hd.N0(2131752682, null);
                alertDialog$Builder.f28743a.U = hd.N0(2131752683, null);
                alertDialog$Builder.k(hd.N0(2131746125, null), new y0(d1Var, 3));
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
                d1Var.showDialog(alertDialog$Builder.f28743a);
            }
        } else if (d1Var.f18283x != null && o41Var.f38050c != d1Var.f18278f) {
            d1Var.f18283x = null;
            d1Var.f18274a.f35742g3.O(true);
        } else {
            qa0 qa0Var = new qa0(8);
            if (d1Var.f18283x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = d1Var.f18284y;
                tL_channelLocation.geo_point = d1Var.f18283x;
                qa0Var.I0 = tL_channelLocation;
            }
            qa0Var.M0 = new ab.g(23, d1Var, qa0Var);
            if (d1Var.f18283x == null && !TextUtils.isEmpty(d1Var.f18284y)) {
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, d1Var.getParentActivity(), null);
                t1Var.f29999j0 = false;
                t1Var.r(200L);
                Utilities.f22776g.c(new w0(d1Var, qa0Var, t1Var));
                return;
            }
            d1Var.presentFragment(qa0Var);
        }
    }
}
