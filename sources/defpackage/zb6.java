package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zb6 implements ncc, fd {
    public final byte a;
    public final tc6 b;

    public zb6(tc6 tc6Var, byte b) {
        this.a = b;
        this.b = tc6Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        tc6 tc6Var = this.b;
        b8c b8cVar = (b8c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        int i = b8cVar.d;
        if (i != 1 && b8cVar.c != tc6Var.f) {
            if (i == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc6Var.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131752675, null);
                alertDialog$Builder.a.U = ob6.M0(2131752676, null);
                alertDialog$Builder.j(ob6.M0(2131746048, null), new zb6(tc6Var, (byte) 3));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                tc6Var.showDialog(alertDialog$Builder.a);
            }
        } else if (tc6Var.x != null && b8cVar.c != tc6Var.f) {
            tc6Var.x = null;
            tc6Var.a.g3.O(true);
        } else {
            uc6 uc6Var = new uc6(8);
            TLRPC.GeoPoint geoPoint = tc6Var.x;
            if (geoPoint != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = tc6Var.y;
                TLRPC.GeoPoint geoPoint2 = tc6Var.x;
                tL_channelLocation.geo_point = geoPoint2;
                uc6Var.I0 = tL_channelLocation;
                geoPoint = geoPoint2;
            }
            uc6Var.M0 = new u34(tc6Var, uc6Var, (byte) 21);
            if (geoPoint == null && !TextUtils.isEmpty(tc6Var.y)) {
                id idVar = new id(3, null, tc6Var.getParentActivity());
                idVar.j0 = false;
                idVar.q(200L);
                Utilities.g.c(new xb6(tc6Var, uc6Var, idVar));
                return;
            }
            tc6Var.presentFragment(uc6Var);
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        tc6 tc6Var = this.b;
        switch (b) {
            case 1:
                tc6Var.a0();
                return;
            case 2:
                tc6Var.finishFragment();
                return;
            default:
                tc6Var.b.b(true);
                TLRPC.UserFull Y1 = tc6Var.getMessagesController().Y1(tc6Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (Y1 != null) {
                    Y1.business_location = null;
                    Y1.flags2 &= -3;
                }
                tc6Var.getConnectionsManager().sendRequest(updatebusinesslocation, new gc6(tc6Var, (byte) 1));
                return;
        }
    }
}
