package kg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pa0;
public final class t0 implements Runnable {
    public final int f18103a = 0;
    public final a1 f18104b;
    public final pa0 f18105c;
    public final org.telegram.ui.ActionBar.t1 d;

    public t0(a1 a1Var, org.telegram.ui.ActionBar.t1 t1Var, pa0 pa0Var) {
        this.f18104b = a1Var;
        this.d = t1Var;
        this.f18105c = pa0Var;
    }

    @Override
    public final void run() {
        switch (this.f18103a) {
            case 0:
                a1 a1Var = this.f18104b;
                a1Var.getClass();
                this.d.dismiss();
                a1Var.presentFragment(this.f18105c);
                return;
            default:
                a1 a1Var2 = this.f18104b;
                pa0 pa0Var = this.f18105c;
                try {
                    List<Address> fromLocationName = new Geocoder(a1Var2.getParentActivity(), hd.E0().f24129y).getFromLocationName(a1Var2.f17870y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = a1Var2.f17870y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pa0Var.D0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new t0(a1Var2, this.d, pa0Var));
                return;
        }
    }

    public t0(a1 a1Var, pa0 pa0Var, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f18104b = a1Var;
        this.f18105c = pa0Var;
        this.d = t1Var;
    }
}
