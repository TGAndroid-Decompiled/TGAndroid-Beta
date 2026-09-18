package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8639a;
    public final LocationListener[] f8640b;
    public final Utilities.Callback f8641c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8639a = locationManager;
        this.f8640b = locationListenerArr;
        this.f8641c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8639a.removeUpdates(this.f8640b[0]);
        this.d.getClass();
        this.f8641c.run(w0.h(location));
    }
}
