package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc0;
public final class u0 implements Runnable {
    public final int f13052a = 0;
    public final b1 f13053b;
    public final pc0 f13054c;
    public final org.telegram.ui.ActionBar.b2 d;

    public u0(b1 b1Var, org.telegram.ui.ActionBar.b2 b2Var, pc0 pc0Var) {
        this.f13053b = b1Var;
        this.d = b2Var;
        this.f13054c = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f13052a) {
            case 0:
                b1 b1Var = this.f13053b;
                b1Var.getClass();
                this.d.dismiss();
                b1Var.presentFragment(this.f13054c);
                return;
            default:
                b1 b1Var2 = this.f13053b;
                pc0 pc0Var = this.f13054c;
                try {
                    List<Address> fromLocationName = new Geocoder(b1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(b1Var2.f12842y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = b1Var2.f12842y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pc0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new u0(b1Var2, this.d, pc0Var));
                return;
        }
    }

    public u0(b1 b1Var, pc0 pc0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f13053b = b1Var;
        this.f13054c = pc0Var;
        this.d = b2Var;
    }
}
