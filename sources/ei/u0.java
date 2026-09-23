package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8623a;
    public final LocationListener[] f8624b;
    public final Utilities.Callback f8625c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8623a = locationManager;
        this.f8624b = locationListenerArr;
        this.f8625c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8623a.removeUpdates(this.f8624b[0]);
        this.d.getClass();
        this.f8625c.run(w0.h(location));
    }
}
