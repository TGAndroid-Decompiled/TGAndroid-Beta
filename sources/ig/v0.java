package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rc0;
public final class v0 implements Runnable {
    public final int f13097a = 0;
    public final c1 f13098b;
    public final rc0 f13099c;
    public final org.telegram.ui.ActionBar.c2 d;

    public v0(c1 c1Var, org.telegram.ui.ActionBar.c2 c2Var, rc0 rc0Var) {
        this.f13098b = c1Var;
        this.d = c2Var;
        this.f13099c = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f13097a) {
            case 0:
                c1 c1Var = this.f13098b;
                c1Var.getClass();
                this.d.dismiss();
                c1Var.presentFragment(this.f13099c);
                return;
            default:
                c1 c1Var2 = this.f13098b;
                rc0 rc0Var = this.f13099c;
                try {
                    List<Address> fromLocationName = new Geocoder(c1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(c1Var2.E, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = c1Var2.E;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        rc0Var.f41126z0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new v0(c1Var2, this.d, rc0Var));
                return;
        }
    }

    public v0(c1 c1Var, rc0 rc0Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f13098b = c1Var;
        this.f13099c = rc0Var;
        this.d = c2Var;
    }
}
