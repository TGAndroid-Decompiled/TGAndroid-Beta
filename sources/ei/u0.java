package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8640a;
    public final LocationListener[] f8641b;
    public final Utilities.Callback f8642c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8640a = locationManager;
        this.f8641b = locationListenerArr;
        this.f8642c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8640a.removeUpdates(this.f8641b[0]);
        this.d.getClass();
        this.f8642c.run(w0.h(location));
    }
}
