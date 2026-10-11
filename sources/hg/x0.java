package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gd0;
public final class x0 implements Runnable {
    public final int f11440a = 0;
    public final e1 f11441b;
    public final gd0 f11442c;
    public final org.telegram.ui.ActionBar.a2 d;

    public x0(e1 e1Var, org.telegram.ui.ActionBar.a2 a2Var, gd0 gd0Var) {
        this.f11441b = e1Var;
        this.d = a2Var;
        this.f11442c = gd0Var;
    }

    @Override
    public final void run() {
        switch (this.f11440a) {
            case 0:
                e1 e1Var = this.f11441b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.f11442c);
                return;
            default:
                e1 e1Var2 = this.f11441b;
                gd0 gd0Var = this.f11442c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.f11214y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.f11214y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        gd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, gd0Var));
                return;
        }
    }

    public x0(e1 e1Var, gd0 gd0Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f11441b = e1Var;
        this.f11442c = gd0Var;
        this.d = a2Var;
    }
}
