package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f9386a;
    public final LocationListener[] f9387b;
    public final Utilities.Callback f9388c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f9386a = locationManager;
        this.f9387b = locationListenerArr;
        this.f9388c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9386a.removeUpdates(this.f9387b[0]);
        this.d.getClass();
        this.f9388c.run(w0.h(location));
    }
}
