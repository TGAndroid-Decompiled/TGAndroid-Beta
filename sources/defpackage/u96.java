package defpackage;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class u96 implements Runnable {
    public final byte a = 0;
    public final pa6 b;
    public final qa6 c;
    public final hd d;

    public u96(pa6 pa6Var, hd hdVar, qa6 qa6Var) {
        this.b = pa6Var;
        this.d = hdVar;
        this.c = qa6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd hdVar = this.d;
        qa6 qa6Var = this.c;
        pa6 pa6Var = this.b;
        switch (b) {
            case 0:
                hdVar.dismiss();
                pa6Var.presentFragment(qa6Var);
                return;
            default:
                try {
                    List<Address> fromLocationName = new Geocoder(pa6Var.getParentActivity(), k96.D0().y).getFromLocationName(pa6Var.y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = pa6Var.y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        qa6Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                gl.d3(new u96(pa6Var, hdVar, qa6Var));
                return;
        }
    }

    public u96(pa6 pa6Var, qa6 qa6Var, hd hdVar) {
        this.b = pa6Var;
        this.c = qa6Var;
        this.d = hdVar;
    }
}
