package lg;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.r31;
import org.telegram.ui.la0;
public final class w0 implements s10, org.telegram.ui.ActionBar.p1 {
    public final int f18500a;
    public final b1 f18501b;

    public w0(b1 b1Var, int i3) {
        this.f18500a = i3;
        this.f18501b = b1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f18500a) {
            case 1:
                this.f18501b.b0();
                return;
            case 2:
                this.f18501b.finishFragment();
                return;
            default:
                b1 b1Var = this.f18501b;
                b1Var.f18239b.b(true);
                TLRPC.UserFull b22 = b1Var.getMessagesController().b2(b1Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (b22 != null) {
                    b22.business_location = null;
                    b22.flags2 &= -3;
                }
                b1Var.getConnectionsManager().sendRequest(updatebusinesslocation, new x0(b1Var, 1));
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b1 b1Var = this.f18501b;
        r31 r31Var = (r31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        int i3 = r31Var.d;
        if (i3 != 1 && r31Var.f37620c != b1Var.f18242f) {
            if (i3 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b1Var.getParentActivity());
                alertDialog$Builder.f27343a.S = bd.M0(2131752694, null);
                alertDialog$Builder.f27343a.U = bd.M0(2131752695, null);
                alertDialog$Builder.k(bd.M0(2131746329, null), new w0(b1Var, 3));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                b1Var.showDialog(alertDialog$Builder.f27343a);
            }
        } else if (b1Var.f18247x != null && r31Var.f37620c != b1Var.f18242f) {
            b1Var.f18247x = null;
            b1Var.f18238a.f35594g3.O(true);
        } else {
            la0 la0Var = new la0(8);
            if (b1Var.f18247x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = b1Var.f18248y;
                tL_channelLocation.geo_point = b1Var.f18247x;
                la0Var.D0 = tL_channelLocation;
            }
            la0Var.H0 = new ai.n(27, b1Var, la0Var);
            if (b1Var.f18247x == null && !TextUtils.isEmpty(b1Var.f18248y)) {
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, b1Var.getParentActivity(), null);
                s1Var.f28546j0 = false;
                s1Var.r(200L);
                Utilities.f21389g.c(new u0(b1Var, la0Var, s1Var));
                return;
            }
            b1Var.presentFragment(la0Var);
        }
    }
}
