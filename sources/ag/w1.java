package ag;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yb0;
public final class w1 implements Runnable {
    public final int f771a = 0;
    public final f2 f772b;
    public final yb0 f773c;
    public final org.telegram.ui.ActionBar.x1 d;

    public w1(f2 f2Var, org.telegram.ui.ActionBar.x1 x1Var, yb0 yb0Var) {
        this.f772b = f2Var;
        this.d = x1Var;
        this.f773c = yb0Var;
    }

    @Override
    public final void run() {
        switch (this.f771a) {
            case 0:
                f2 f2Var = this.f772b;
                f2Var.getClass();
                this.d.dismiss();
                f2Var.presentFragment(this.f773c);
                return;
            default:
                f2 f2Var2 = this.f772b;
                yb0 yb0Var = this.f773c;
                try {
                    List<Address> fromLocationName = new Geocoder(f2Var2.getParentActivity(), cd.D0().f15003y).getFromLocationName(f2Var2.f524y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = f2Var2.f524y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        yb0Var.I0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                org.telegram.messenger.i0.g3(new w1(f2Var2, this.d, yb0Var));
                return;
        }
    }

    public w1(f2 f2Var, yb0 yb0Var, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f772b = f2Var;
        this.f773c = yb0Var;
        this.d = x1Var;
    }
}
