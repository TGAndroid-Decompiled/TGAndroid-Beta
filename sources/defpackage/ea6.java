package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class ea6 extends c6 {
    public final qa6 a;

    public ea6(qa6 qa6Var) {
        this.a = qa6Var;
    }

    @Override
    public final void b(int i) {
        qa6 qa6Var = this.a;
        if (i == -1) {
            qa6Var.finishFragment();
            return;
        }
        int i2 = 1;
        if (i == 1) {
            try {
                TLRPC.GeoPoint geoPoint = qa6Var.J0.k.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                qa6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else if (i == 5) {
            qa6Var.B0(false);
        } else if (i == 6) {
            qa6Var.A0(null);
        } else if ((i == 2 || i == 3 || i == 4) && qa6Var.F != null) {
            qa6Var.C0();
            ty4 ty4Var = qa6Var.F;
            if (i != 3) {
                if (i == 4) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            }
            ty4Var.j(i2);
        }
    }
}
