package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8635a;
    public final LocationListener[] f8636b;
    public final Utilities.Callback f8637c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8635a = locationManager;
        this.f8636b = locationListenerArr;
        this.f8637c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8635a.removeUpdates(this.f8636b[0]);
        this.d.getClass();
        this.f8637c.run(w0.h(location));
    }
}
