package defpackage;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class xb6 implements Runnable {
    public final byte a = 0;
    public final tc6 b;
    public final uc6 c;
    public final id d;

    public xb6(tc6 tc6Var, id idVar, uc6 uc6Var) {
        this.b = tc6Var;
        this.d = idVar;
        this.c = uc6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        id idVar = this.d;
        uc6 uc6Var = this.c;
        tc6 tc6Var = this.b;
        switch (b) {
            case 0:
                idVar.dismiss();
                tc6Var.presentFragment(uc6Var);
                return;
            default:
                try {
                    List<Address> fromLocationName = new Geocoder(tc6Var.getParentActivity(), ob6.D0().y).getFromLocationName(tc6Var.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = tc6Var.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        uc6Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                hl.c3(new xb6(tc6Var, idVar, uc6Var));
                return;
        }
    }

    public xb6(tc6 tc6Var, uc6 uc6Var, id idVar) {
        this.b = tc6Var;
        this.c = uc6Var;
        this.d = idVar;
    }
}
