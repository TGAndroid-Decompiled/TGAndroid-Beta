package defpackage;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class tb6 implements Runnable {
    public final byte a = 0;
    public final oc6 b;
    public final pc6 c;
    public final he d;

    public tb6(oc6 oc6Var, he heVar, pc6 pc6Var) {
        this.b = oc6Var;
        this.d = heVar;
        this.c = pc6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        he heVar = this.d;
        pc6 pc6Var = this.c;
        oc6 oc6Var = this.b;
        switch (b) {
            case 0:
                heVar.dismiss();
                oc6Var.presentFragment(pc6Var);
                return;
            default:
                try {
                    List<Address> fromLocationName = new Geocoder(oc6Var.getParentActivity(), jb6.D0().y).getFromLocationName(oc6Var.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = oc6Var.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pc6Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                gm.c3(new tb6(oc6Var, heVar, pc6Var));
                return;
        }
    }

    public tb6(oc6 oc6Var, pc6 pc6Var, he heVar) {
        this.b = oc6Var;
        this.c = pc6Var;
        this.d = heVar;
    }
}
