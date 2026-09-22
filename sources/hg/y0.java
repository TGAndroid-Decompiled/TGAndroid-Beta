package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.id0;
public final class y0 implements Runnable {
    public final int f10476a = 0;
    public final f1 f10477b;
    public final id0 f10478c;
    public final org.telegram.ui.ActionBar.b2 d;

    public y0(f1 f1Var, org.telegram.ui.ActionBar.b2 b2Var, id0 id0Var) {
        this.f10477b = f1Var;
        this.d = b2Var;
        this.f10478c = id0Var;
    }

    @Override
    public final void run() {
        switch (this.f10476a) {
            case 0:
                f1 f1Var = this.f10477b;
                f1Var.getClass();
                this.d.dismiss();
                f1Var.presentFragment(this.f10478c);
                return;
            default:
                f1 f1Var2 = this.f10477b;
                id0 id0Var = this.f10478c;
                try {
                    List<Address> fromLocationName = new Geocoder(f1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(f1Var2.f10280y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = f1Var2.f10280y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        id0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new y0(f1Var2, this.d, id0Var));
                return;
        }
    }

    public y0(f1 f1Var, id0 id0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f10477b = f1Var;
        this.f10478c = id0Var;
        this.d = b2Var;
    }
}
