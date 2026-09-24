package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8622a;
    public final LocationListener[] f8623b;
    public final Utilities.Callback f8624c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8622a = locationManager;
        this.f8623b = locationListenerArr;
        this.f8624c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8622a.removeUpdates(this.f8623b[0]);
        this.d.getClass();
        this.f8624c.run(w0.h(location));
    }
}
