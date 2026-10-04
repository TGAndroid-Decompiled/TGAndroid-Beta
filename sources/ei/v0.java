package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class v0 implements LocationListener {
    public final LocationManager f9383a;
    public final LocationListener[] f9384b;
    public final Utilities.Callback f9385c;
    public final x0 d;

    public v0(x0 x0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = x0Var;
        this.f9383a = locationManager;
        this.f9384b = locationListenerArr;
        this.f9385c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9383a.removeUpdates(this.f9384b[0]);
        this.d.getClass();
        this.f9385c.run(x0.h(location));
    }
}
