package kg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qa0;
public final class w0 implements Runnable {
    public final int f18514a = 0;
    public final d1 f18515b;
    public final qa0 f18516c;
    public final org.telegram.ui.ActionBar.t1 d;

    public w0(d1 d1Var, org.telegram.ui.ActionBar.t1 t1Var, qa0 qa0Var) {
        this.f18515b = d1Var;
        this.d = t1Var;
        this.f18516c = qa0Var;
    }

    @Override
    public final void run() {
        switch (this.f18514a) {
            case 0:
                d1 d1Var = this.f18515b;
                d1Var.getClass();
                this.d.dismiss();
                d1Var.presentFragment(this.f18516c);
                return;
            default:
                d1 d1Var2 = this.f18515b;
                qa0 qa0Var = this.f18516c;
                try {
                    List<Address> fromLocationName = new Geocoder(d1Var2.getParentActivity(), hd.E0().f24436y).getFromLocationName(d1Var2.f18284y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = d1Var2.f18284y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        qa0Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.g3(new w0(d1Var2, this.d, qa0Var));
                return;
        }
    }

    public w0(d1 d1Var, qa0 qa0Var, org.telegram.ui.ActionBar.t1 t1Var) {
        this.f18515b = d1Var;
        this.f18516c = qa0Var;
        this.d = t1Var;
    }
}
