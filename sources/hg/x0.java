package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hd0;
public final class x0 implements Runnable {
    public final int f11441a = 0;
    public final e1 f11442b;
    public final hd0 f11443c;
    public final org.telegram.ui.ActionBar.b2 d;

    public x0(e1 e1Var, org.telegram.ui.ActionBar.b2 b2Var, hd0 hd0Var) {
        this.f11442b = e1Var;
        this.d = b2Var;
        this.f11443c = hd0Var;
    }

    @Override
    public final void run() {
        switch (this.f11441a) {
            case 0:
                e1 e1Var = this.f11442b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.f11443c);
                return;
            default:
                e1 e1Var2 = this.f11442b;
                hd0 hd0Var = this.f11443c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.f11215y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.f11215y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        hd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, hd0Var));
                return;
        }
    }

    public x0(e1 e1Var, hd0 hd0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f11442b = e1Var;
        this.f11443c = hd0Var;
        this.d = b2Var;
    }
}
