package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kd0;
public final class x0 implements Runnable {
    public final int f10473a = 0;
    public final e1 f10474b;
    public final kd0 f10475c;
    public final org.telegram.ui.ActionBar.b2 d;

    public x0(e1 e1Var, org.telegram.ui.ActionBar.b2 b2Var, kd0 kd0Var) {
        this.f10474b = e1Var;
        this.d = b2Var;
        this.f10475c = kd0Var;
    }

    @Override
    public final void run() {
        switch (this.f10473a) {
            case 0:
                e1 e1Var = this.f10474b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.f10475c);
                return;
            default:
                e1 e1Var2 = this.f10474b;
                kd0 kd0Var = this.f10475c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.f10276y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.f10276y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        kd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, kd0Var));
                return;
        }
    }

    public x0(e1 e1Var, kd0 kd0Var, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f10474b = e1Var;
        this.f10475c = kd0Var;
        this.d = b2Var;
    }
}
