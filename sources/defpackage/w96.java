package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w96 implements n8c, ed {
    public final byte a;
    public final pa6 b;

    public w96(pa6 pa6Var, byte b) {
        this.a = b;
        this.b = pa6Var;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        pa6 pa6Var = this.b;
        c4c c4cVar = (c4c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        int i = c4cVar.d;
        if (i != 1 && c4cVar.c != pa6Var.f) {
            if (i == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pa6Var.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131752682, null);
                alertDialog$Builder.a.U = k96.M0(2131752683, null);
                alertDialog$Builder.j(k96.M0(2131746128, null), new w96(pa6Var, (byte) 3));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                pa6Var.showDialog(alertDialog$Builder.a);
            }
        } else if (pa6Var.x != null && c4cVar.c != pa6Var.f) {
            pa6Var.x = null;
            pa6Var.a.g3.O(true);
        } else {
            qa6 qa6Var = new qa6(8);
            TLRPC.GeoPoint geoPoint = pa6Var.x;
            if (geoPoint != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = pa6Var.y;
                TLRPC.GeoPoint geoPoint2 = pa6Var.x;
                tL_channelLocation.geo_point = geoPoint2;
                qa6Var.I0 = tL_channelLocation;
                geoPoint = geoPoint2;
            }
            qa6Var.M0 = new h45(pa6Var, qa6Var, (byte) 16);
            if (geoPoint == null && !TextUtils.isEmpty(pa6Var.y)) {
                hd hdVar = new hd(3, null, pa6Var.getParentActivity());
                hdVar.j0 = false;
                hdVar.q(200L);
                Utilities.g.c(new u96(pa6Var, qa6Var, hdVar));
                return;
            }
            pa6Var.presentFragment(qa6Var);
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        pa6 pa6Var = this.b;
        switch (b) {
            case 1:
                pa6Var.a0();
                return;
            case 2:
                pa6Var.finishFragment();
                return;
            default:
                pa6Var.b.b(true);
                TLRPC.UserFull W1 = pa6Var.getMessagesController().W1(pa6Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (W1 != null) {
                    W1.business_location = null;
                    W1.flags2 &= -3;
                }
                pa6Var.getConnectionsManager().sendRequest(updatebusinesslocation, new ca6(pa6Var, (byte) 1));
                return;
        }
    }
}
