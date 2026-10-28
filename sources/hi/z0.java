package hi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class z0 implements LocationListener {
    public final LocationManager f13385a;
    public final LocationListener[] f13386b;
    public final Utilities.Callback f13387c;
    public final b1 d;

    public z0(b1 b1Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = b1Var;
        this.f13385a = locationManager;
        this.f13386b = locationListenerArr;
        this.f13387c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f13385a.removeUpdates(this.f13386b[0]);
        this.d.getClass();
        this.f13387c.run(b1.h(location));
    }
}
