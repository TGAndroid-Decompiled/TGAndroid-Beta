package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;
public final class x0 implements Runnable {
    public final int f11439a = 0;
    public final e1 f11440b;
    public final id0 f11441c;
    public final org.telegram.ui.ActionBar.a2 d;

    public x0(e1 e1Var, org.telegram.ui.ActionBar.a2 a2Var, id0 id0Var) {
        this.f11440b = e1Var;
        this.d = a2Var;
        this.f11441c = id0Var;
    }

    @Override
    public final void run() {
        switch (this.f11439a) {
            case 0:
                e1 e1Var = this.f11440b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.f11441c);
                return;
            default:
                e1 e1Var2 = this.f11440b;
                id0 id0Var = this.f11441c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.f11213y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.f11213y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        id0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, id0Var));
                return;
        }
    }

    public x0(e1 e1Var, id0 id0Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f11440b = e1Var;
        this.f11441c = id0Var;
        this.d = a2Var;
    }
}
