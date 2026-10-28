package jg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rc0;
public final class w0 implements Runnable {
    public final int f15877a = 0;
    public final d1 f15878b;
    public final rc0 f15879c;
    public final org.telegram.ui.ActionBar.e2 d;

    public w0(d1 d1Var, org.telegram.ui.ActionBar.e2 e2Var, rc0 rc0Var) {
        this.f15878b = d1Var;
        this.d = e2Var;
        this.f15879c = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f15877a) {
            case 0:
                d1 d1Var = this.f15878b;
                d1Var.getClass();
                this.d.dismiss();
                d1Var.presentFragment(this.f15879c);
                return;
            default:
                d1 d1Var2 = this.f15878b;
                rc0 rc0Var = this.f15879c;
                try {
                    List<Address> fromLocationName = new Geocoder(d1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(d1Var2.f15673x, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = d1Var2.f15673x;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        rc0Var.f42955z0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new w0(d1Var2, this.d, rc0Var));
                return;
        }
    }

    public w0(d1 d1Var, rc0 rc0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f15878b = d1Var;
        this.f15879c = rc0Var;
        this.d = e2Var;
    }
}
