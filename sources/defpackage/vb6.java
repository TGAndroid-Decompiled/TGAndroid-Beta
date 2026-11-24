package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vb6 implements oac, ee {
    public final byte a;
    public final oc6 b;

    public vb6(oc6 oc6Var, byte b) {
        this.a = b;
        this.b = oc6Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        oc6 oc6Var = this.b;
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        int i = c6cVar.d;
        if (i != 1 && c6cVar.c != oc6Var.f) {
            if (i == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oc6Var.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131752647, null);
                alertDialog$Builder.a.U = jb6.M0(2131752648, null);
                alertDialog$Builder.j(jb6.M0(2131746054, null), new vb6(oc6Var, (byte) 3));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                oc6Var.showDialog(alertDialog$Builder.a);
            }
        } else if (oc6Var.x != null && c6cVar.c != oc6Var.f) {
            oc6Var.x = null;
            oc6Var.a.g3.O(true);
        } else {
            pc6 pc6Var = new pc6(8);
            TLRPC.GeoPoint geoPoint = oc6Var.x;
            if (geoPoint != null) {
                TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                tL_channelLocation.address = oc6Var.y;
                TLRPC.GeoPoint geoPoint2 = oc6Var.x;
                tL_channelLocation.geo_point = geoPoint2;
                pc6Var.I0 = tL_channelLocation;
                geoPoint = geoPoint2;
            }
            pc6Var.M0 = new nv4(oc6Var, pc6Var, (byte) 17);
            if (geoPoint == null && !TextUtils.isEmpty(oc6Var.y)) {
                he heVar = new he(3, null, oc6Var.getParentActivity());
                heVar.j0 = false;
                heVar.q(200L);
                Utilities.g.c(new tb6(oc6Var, pc6Var, heVar));
                return;
            }
            oc6Var.presentFragment(pc6Var);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        oc6 oc6Var = this.b;
        switch (b) {
            case 1:
                oc6Var.b0();
                return;
            case 2:
                oc6Var.finishFragment();
                return;
            default:
                oc6Var.b.b(true);
                TLRPC.UserFull X1 = oc6Var.getMessagesController().X1(oc6Var.getUserConfig().e());
                TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
                if (X1 != null) {
                    X1.business_location = null;
                    X1.flags2 &= -3;
                }
                oc6Var.getConnectionsManager().sendRequest(updatebusinesslocation, new bc6(oc6Var, (byte) 1));
                return;
        }
    }
}
