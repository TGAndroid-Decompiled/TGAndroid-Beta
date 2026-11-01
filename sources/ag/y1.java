package ag;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.p20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b51;
import org.telegram.ui.xb0;
public final class y1 implements p20, org.telegram.ui.ActionBar.u1 {
    public final int f805a;
    public final f2 f806b;

    public y1(f2 f2Var, int i10) {
        this.f805a = i10;
        this.f806b = f2Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f805a) {
            case 1:
                this.f806b.b0();
                return;
            case 2:
                this.f806b.finishFragment();
                return;
            default:
                f2 f2Var = this.f806b;
                f2Var.f516b.b(true);
                TLRPC.UserFull a2 = f2Var.getMessagesController().a2(f2Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (a2 != null) {
                    a2.business_location = null;
                    a2.flags2 &= -3;
                }
                f2Var.getConnectionsManager().sendRequest(updatebusinesslocation, new z1(f2Var, 1));
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        f2 f2Var = this.f806b;
        b51 b51Var = (b51) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        int i10 = b51Var.d;
        if (i10 != 1 && b51Var.f24637c != f2Var.f518f) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
                alertDialog$Builder.f20135a.R = dd.L0(2131752694, null);
                alertDialog$Builder.f20135a.T = dd.L0(2131752695, null);
                alertDialog$Builder.k(dd.L0(2131746336, null), new y1(f2Var, 3));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                f2Var.showDialog(alertDialog$Builder.f20135a);
            }
        } else if (f2Var.f523x != null && b51Var.f24637c != f2Var.f518f) {
            f2Var.f523x = null;
            f2Var.f515a.f31183f3.O(true);
        } else {
            xb0 xb0Var = new xb0(8);
            if (f2Var.f523x != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = f2Var.f524y;
                tL_channelLocation.geo_point = f2Var.f523x;
                xb0Var.I0 = tL_channelLocation;
            }
            xb0Var.N0 = new m(2, f2Var, xb0Var);
            if (f2Var.f523x == null && !TextUtils.isEmpty(f2Var.f524y)) {
                org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, f2Var.getParentActivity(), null);
                x1Var.f21489i0 = false;
                x1Var.r(200L);
                Utilities.f14523g.c(new w1(f2Var, xb0Var, x1Var));
                return;
            }
            f2Var.presentFragment(xb0Var);
        }
    }
}
