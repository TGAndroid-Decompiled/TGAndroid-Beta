package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f9385a;
    public final LocationListener[] f9386b;
    public final Utilities.Callback f9387c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f9385a = locationManager;
        this.f9386b = locationListenerArr;
        this.f9387c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f9385a.removeUpdates(this.f9386b[0]);
        this.d.getClass();
        this.f9387c.run(w0.h(location));
    }
}
