package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nc0;
public final class w0 implements Runnable {
    public final int f13069a = 0;
    public final d1 f13070b;
    public final nc0 f13071c;
    public final org.telegram.ui.ActionBar.b2 d;

    public w0(d1 d1Var, org.telegram.ui.ActionBar.b2 b2Var, nc0 nc0Var) {
        this.f13070b = d1Var;
        this.d = b2Var;
        this.f13071c = nc0Var;
    }

    @Override
    public final void run() {
        switch (this.f13069a) {
            case 0:
                d1 d1Var = this.f13070b;
                d1Var.getClass();
                this.d.dismiss();
                d1Var.presentFragment(this.f13071c);
                return;
            default:
                d1 d1Var2 = this.f13070b;
                nc0 nc0Var = this.f13071c;
                try {
                    List<Address> fromLocationName = new Geocoder(d1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(d1Var2.f12861y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = d1Var2.f12861y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        nc0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new w0(d1Var2, this.d, nc0Var));
                return;
        }
    }

    public w0(d1 d1Var, nc0 nc0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f13070b = d1Var;
        this.f13071c = nc0Var;
        this.d = b2Var;
    }
}
