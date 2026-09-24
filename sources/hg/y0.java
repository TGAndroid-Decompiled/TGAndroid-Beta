package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cd0;
public final class y0 implements Runnable {
    public final int f10462a = 0;
    public final f1 f10463b;
    public final cd0 f10464c;
    public final org.telegram.ui.ActionBar.a2 d;

    public y0(f1 f1Var, org.telegram.ui.ActionBar.a2 a2Var, cd0 cd0Var) {
        this.f10463b = f1Var;
        this.d = a2Var;
        this.f10464c = cd0Var;
    }

    @Override
    public final void run() {
        switch (this.f10462a) {
            case 0:
                f1 f1Var = this.f10463b;
                f1Var.getClass();
                this.d.dismiss();
                f1Var.presentFragment(this.f10464c);
                return;
            default:
                f1 f1Var2 = this.f10463b;
                cd0 cd0Var = this.f10464c;
                try {
                    List<Address> fromLocationName = new Geocoder(f1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(f1Var2.f10266y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = f1Var2.f10266y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        cd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new y0(f1Var2, this.d, cd0Var));
                return;
        }
    }

    public y0(f1 f1Var, cd0 cd0Var, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f10463b = f1Var;
        this.f10464c = cd0Var;
        this.d = a2Var;
    }
}
