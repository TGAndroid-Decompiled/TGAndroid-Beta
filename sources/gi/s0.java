package gi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class s0 implements LocationListener {
    public final LocationManager f11437a;
    public final LocationListener[] f11438b;
    public final Utilities.Callback f11439c;
    public final u0 d;

    public s0(u0 u0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = u0Var;
        this.f11437a = locationManager;
        this.f11438b = locationListenerArr;
        this.f11439c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f11437a.removeUpdates(this.f11438b[0]);
        this.d.getClass();
        this.f11439c.run(u0.h(location));
    }
}
