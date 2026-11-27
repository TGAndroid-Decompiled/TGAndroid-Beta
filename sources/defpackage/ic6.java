package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class ic6 extends d6 {
    public final uc6 a;

    public ic6(uc6 uc6Var) {
        this.a = uc6Var;
    }

    @Override
    public final void b(int i) {
        uc6 uc6Var = this.a;
        if (i == -1) {
            uc6Var.finishFragment();
            return;
        }
        int i2 = 1;
        if (i == 1) {
            try {
                TLRPC.GeoPoint geoPoint = uc6Var.J0.k.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                uc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } else if (i == 5) {
            uc6Var.C0(false);
        } else if (i == 6) {
            uc6Var.B0(null);
        } else if ((i == 2 || i == 3 || i == 4) && uc6Var.F != null) {
            uc6Var.D0();
            x05 x05Var = uc6Var.F;
            if (i != 3) {
                if (i == 4) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            }
            x05Var.j(i2);
        }
    }
}
