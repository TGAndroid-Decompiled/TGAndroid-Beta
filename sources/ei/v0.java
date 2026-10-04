package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class v0 implements LocationListener {
    public final LocationManager f9382a;
    public final LocationListener[] f9383b;
    public final Utilities.Callback f9384c;
    public final x0 d;

    public v0(x0 x0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = x0Var;
        this.f9382a = locationManager;
        this.f9383b = locationListenerArr;
        this.f9384c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9382a.removeUpdates(this.f9383b[0]);
        this.d.getClass();
        this.f9384c.run(x0.h(location));
    }
}
