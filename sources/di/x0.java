package di;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class x0 implements LocationListener {
    public final LocationManager f6993a;
    public final LocationListener[] f6994b;
    public final Utilities.Callback f6995c;
    public final z0 d;

    public x0(z0 z0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = z0Var;
        this.f6993a = locationManager;
        this.f6994b = locationListenerArr;
        this.f6995c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f6993a.removeUpdates(this.f6994b[0]);
        this.d.getClass();
        this.f6995c.run(z0.h(location));
    }
}
