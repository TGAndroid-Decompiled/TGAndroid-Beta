package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f9383a;
    public final LocationListener[] f9384b;
    public final Utilities.Callback f9385c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f9383a = locationManager;
        this.f9384b = locationListenerArr;
        this.f9385c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9383a.removeUpdates(this.f9384b[0]);
        this.d.getClass();
        this.f9385c.run(w0.h(location));
    }
}
