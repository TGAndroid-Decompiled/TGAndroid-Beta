package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class dc6 extends c6 {
    public final pc6 a;

    public dc6(pc6 pc6Var) {
        this.a = pc6Var;
    }

    @Override
    public final void b(int i) {
        pc6 pc6Var = this.a;
        if (i == -1) {
            pc6Var.finishFragment();
            return;
        }
        int i2 = 1;
        if (i == 1) {
            try {
                TLRPC.GeoPoint geoPoint = pc6Var.J0.k.media.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                pc6Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else if (i == 5) {
            pc6Var.C0(false);
        } else if (i == 6) {
            pc6Var.B0(null);
        } else if ((i == 2 || i == 3 || i == 4) && pc6Var.F != null) {
            pc6Var.D0();
            s05 s05Var = pc6Var.F;
            if (i != 3) {
                if (i == 4) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            }
            s05Var.j(i2);
        }
    }
}
