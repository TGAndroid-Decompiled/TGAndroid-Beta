package ig;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;
public final class x0 implements Runnable {
    public final int f12297a = 0;
    public final e1 f12298b;
    public final id0 f12299c;
    public final org.telegram.ui.ActionBar.b2 d;

    public x0(e1 e1Var, org.telegram.ui.ActionBar.b2 b2Var, id0 id0Var) {
        this.f12298b = e1Var;
        this.d = b2Var;
        this.f12299c = id0Var;
    }

    @Override
    public final void run() {
        switch (this.f12297a) {
            case 0:
                e1 e1Var = this.f12298b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.f12299c);
                return;
            default:
                e1 e1Var2 = this.f12298b;
                id0 id0Var = this.f12299c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.f12077y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.f12077y;
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

    public x0(e1 e1Var, id0 id0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f12298b = e1Var;
        this.f12299c = id0Var;
        this.d = b2Var;
    }
}
