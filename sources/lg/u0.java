package lg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.la0;
public final class u0 implements Runnable {
    public final int f18480a = 0;
    public final b1 f18481b;
    public final la0 f18482c;
    public final org.telegram.ui.ActionBar.s1 d;

    public u0(b1 b1Var, org.telegram.ui.ActionBar.s1 s1Var, la0 la0Var) {
        this.f18481b = b1Var;
        this.d = s1Var;
        this.f18482c = la0Var;
    }

    @Override
    public final void run() {
        switch (this.f18480a) {
            case 0:
                b1 b1Var = this.f18481b;
                b1Var.getClass();
                this.d.dismiss();
                b1Var.presentFragment(this.f18482c);
                return;
            default:
                b1 b1Var2 = this.f18481b;
                la0 la0Var = this.f18482c;
                try {
                    List<Address> fromLocationName = new Geocoder(b1Var2.getParentActivity(), bd.E0().f21812y).getFromLocationName(b1Var2.f18248y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = b1Var2.f18248y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        la0Var.D0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new u0(b1Var2, this.d, la0Var));
                return;
        }
    }

    public u0(b1 b1Var, la0 la0Var, org.telegram.ui.ActionBar.s1 s1Var) {
        this.f18481b = b1Var;
        this.f18482c = la0Var;
        this.d = s1Var;
    }
}
