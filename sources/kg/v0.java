package kg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pa0;
public final class v0 implements Runnable {
    public final int f18598a = 0;
    public final c1 f18599b;
    public final pa0 f18600c;
    public final org.telegram.ui.ActionBar.t1 d;

    public v0(c1 c1Var, org.telegram.ui.ActionBar.t1 t1Var, pa0 pa0Var) {
        this.f18599b = c1Var;
        this.d = t1Var;
        this.f18600c = pa0Var;
    }

    @Override
    public final void run() {
        switch (this.f18598a) {
            case 0:
                c1 c1Var = this.f18599b;
                c1Var.getClass();
                this.d.dismiss();
                c1Var.presentFragment(this.f18600c);
                return;
            default:
                c1 c1Var2 = this.f18599b;
                pa0 pa0Var = this.f18600c;
                try {
                    List<Address> fromLocationName = new Geocoder(c1Var2.getParentActivity(), gd.E0().f24342y).getFromLocationName(c1Var2.f18376y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = c1Var2.f18376y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pa0Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.g3(new v0(c1Var2, this.d, pa0Var));
                return;
        }
    }

    public v0(c1 c1Var, pa0 pa0Var, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f18599b = c1Var;
        this.f18600c = pa0Var;
        this.d = t1Var;
    }
}
