package hg;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fd0;
public final class x0 implements Runnable {
    public final int f10460a = 0;
    public final e1 f10461b;
    public final fd0 f10462c;
    public final org.telegram.ui.ActionBar.c2 d;

    public x0(e1 e1Var, org.telegram.ui.ActionBar.c2 c2Var, fd0 fd0Var) {
        this.f10461b = e1Var;
        this.d = c2Var;
        this.f10462c = fd0Var;
    }

    @Override
    public final void run() {
        switch (this.f10460a) {
            case 0:
                e1 e1Var = this.f10461b;
                e1Var.getClass();
                this.d.dismiss();
                e1Var.presentFragment(this.f10462c);
                return;
            default:
                e1 e1Var2 = this.f10461b;
                fd0 fd0Var = this.f10462c;
                try {
                    List<Address> fromLocationName = new Geocoder(e1Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(e1Var2.f10263y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = e1Var2.f10263y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        fd0Var.A0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new x0(e1Var2, this.d, fd0Var));
                return;
        }
    }

    public x0(e1 e1Var, fd0 fd0Var, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f10461b = e1Var;
        this.f10462c = fd0Var;
        this.d = c2Var;
    }
}
