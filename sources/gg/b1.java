package gg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;
public final class b1 implements Runnable {
    public final int f8819a = 0;
    public final k1 f8820b;
    public final id0 f8821c;
    public final org.telegram.ui.ActionBar.d2 d;

    public b1(k1 k1Var, org.telegram.ui.ActionBar.d2 d2Var, id0 id0Var) {
        this.f8820b = k1Var;
        this.d = d2Var;
        this.f8821c = id0Var;
    }

    @Override
    public final void run() {
        switch (this.f8819a) {
            case 0:
                k1 k1Var = this.f8820b;
                k1Var.getClass();
                this.d.dismiss();
                k1Var.presentFragment(this.f8821c);
                return;
            default:
                k1 k1Var2 = this.f8820b;
                id0 id0Var = this.f8821c;
                try {
                    List<Address> fromLocationName = new Geocoder(k1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(k1Var2.f8935y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = k1Var2.f8935y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        id0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new b1(k1Var2, this.d, id0Var));
                return;
        }
    }

    public b1(k1 k1Var, id0 id0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f8820b = k1Var;
        this.f8821c = id0Var;
        this.d = d2Var;
    }
}
