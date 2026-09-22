package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8637a;
    public final LocationListener[] f8638b;
    public final Utilities.Callback f8639c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8637a = locationManager;
        this.f8638b = locationListenerArr;
        this.f8639c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8637a.removeUpdates(this.f8638b[0]);
        this.d.getClass();
        this.f8639c.run(w0.h(location));
    }
}
