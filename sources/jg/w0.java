package jg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.pc0;
public final class w0 implements Runnable {
    public final int f15878a = 0;
    public final d1 f15879b;
    public final pc0 f15880c;
    public final org.telegram.ui.ActionBar.e2 d;

    public w0(d1 d1Var, org.telegram.ui.ActionBar.e2 e2Var, pc0 pc0Var) {
        this.f15879b = d1Var;
        this.d = e2Var;
        this.f15880c = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f15878a) {
            case 0:
                d1 d1Var = this.f15879b;
                d1Var.getClass();
                this.d.dismiss();
                d1Var.presentFragment(this.f15880c);
                return;
            default:
                d1 d1Var2 = this.f15879b;
                pc0 pc0Var = this.f15880c;
                try {
                    List<Address> fromLocationName = new Geocoder(d1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(d1Var2.f15674x, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = d1Var2.f15674x;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pc0Var.f42462z0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new w0(d1Var2, this.d, pc0Var));
                return;
        }
    }

    public w0(d1 d1Var, pc0 pc0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f15879b = d1Var;
        this.f15880c = pc0Var;
        this.d = e2Var;
    }
}
