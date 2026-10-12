package fi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class t0 implements LocationListener {
    public final LocationManager f9543a;
    public final LocationListener[] f9544b;
    public final Utilities.Callback f9545c;
    public final v0 d;

    public t0(v0 v0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = v0Var;
        this.f9543a = locationManager;
        this.f9544b = locationListenerArr;
        this.f9545c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9543a.removeUpdates(this.f9544b[0]);
        this.d.getClass();
        this.f9545c.run(v0.h(location));
    }
}
