package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.w10;
public final class p0 implements LocationListener {
    public final LocationManager f18923a;
    public final LocationListener[] f18924b;
    public final w10 f18925c;
    public final r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, w10 w10Var) {
        this.d = r0Var;
        this.f18923a = locationManager;
        this.f18924b = locationListenerArr;
        this.f18925c = w10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18923a.removeUpdates(this.f18924b[0]);
        this.d.getClass();
        this.f18925c.a(r0.h(location));
    }
}
