package mh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class s0 implements LocationListener {
    public final LocationManager f18090a;
    public final LocationListener[] f18091b;
    public final Utilities.Callback f18092c;
    public final u0 d;

    public s0(u0 u0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = u0Var;
        this.f18090a = locationManager;
        this.f18091b = locationListenerArr;
        this.f18092c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18090a.removeUpdates(this.f18091b[0]);
        this.d.getClass();
        this.f18092c.run(u0.h(location));
    }
}
