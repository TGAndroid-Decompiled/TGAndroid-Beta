package kg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pa0;
public final class t0 implements Runnable {
    public final int f17543a = 0;
    public final a1 f17544b;
    public final pa0 f17545c;
    public final org.telegram.ui.ActionBar.u1 d;

    public t0(a1 a1Var, org.telegram.ui.ActionBar.u1 u1Var, pa0 pa0Var) {
        this.f17544b = a1Var;
        this.d = u1Var;
        this.f17545c = pa0Var;
    }

    @Override
    public final void run() {
        switch (this.f17543a) {
            case 0:
                a1 a1Var = this.f17544b;
                a1Var.getClass();
                this.d.dismiss();
                a1Var.presentFragment(this.f17545c);
                return;
            default:
                a1 a1Var2 = this.f17544b;
                pa0 pa0Var = this.f17545c;
                try {
                    List<Address> fromLocationName = new Geocoder(a1Var2.getParentActivity(), id.E0().f23185y).getFromLocationName(a1Var2.f17311y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = a1Var2.f17311y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pa0Var.C0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new t0(a1Var2, this.d, pa0Var));
                return;
        }
    }

    public t0(a1 a1Var, pa0 pa0Var, org.telegram.ui.ActionBar.u1 u1Var) {
        this.f17544b = a1Var;
        this.f17545c = pa0Var;
        this.d = u1Var;
    }
}
