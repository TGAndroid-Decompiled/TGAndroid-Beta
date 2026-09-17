package fi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f9988a;
    public final LocationListener[] f9989b;
    public final Utilities.Callback f9990c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f9988a = locationManager;
        this.f9989b = locationListenerArr;
        this.f9990c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9988a.removeUpdates(this.f9989b[0]);
        this.d.getClass();
        this.f9990c.run(w0.h(location));
    }
}
