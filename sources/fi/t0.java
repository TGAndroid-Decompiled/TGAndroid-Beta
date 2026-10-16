package fi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class t0 implements LocationListener {
    public final LocationManager f9546a;
    public final LocationListener[] f9547b;
    public final Utilities.Callback f9548c;
    public final v0 d;

    public t0(v0 v0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = v0Var;
        this.f9546a = locationManager;
        this.f9547b = locationListenerArr;
        this.f9548c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9546a.removeUpdates(this.f9547b[0]);
        this.d.getClass();
        this.f9548c.run(v0.h(location));
    }
}
