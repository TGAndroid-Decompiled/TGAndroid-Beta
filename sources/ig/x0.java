package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nd0;
public final class x0 implements Runnable {
    public final int f11687a = 0;
    public final e1 f11688b;
    public final nd0 f11689c;
    public final org.telegram.ui.ActionBar.a2 d;

    public x0(e1 e1Var, org.telegram.ui.ActionBar.a2 a2Var, nd0 nd0Var) {
        this.f11688b = e1Var;
        this.d = a2Var;
        this.f11689c = nd0Var;
    }

    @Override
    public final void run() {
        switch (this.f11687a) {
            case 0:
                e1 e1Var = this.f11688b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.f11689c);
                return;
            default:
                e1 e1Var2 = this.f11688b;
                nd0 nd0Var = this.f11689c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.f11488y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.f11488y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        nd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, nd0Var));
                return;
        }
    }

    public x0(e1 e1Var, nd0 nd0Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f11688b = e1Var;
        this.f11689c = nd0Var;
        this.d = a2Var;
    }
}
