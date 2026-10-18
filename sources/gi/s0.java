package gi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class s0 implements LocationListener {
    public final LocationManager f11435a;
    public final LocationListener[] f11436b;
    public final Utilities.Callback f11437c;
    public final u0 d;

    public s0(u0 u0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = u0Var;
        this.f11435a = locationManager;
        this.f11436b = locationListenerArr;
        this.f11437c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f11435a.removeUpdates(this.f11436b[0]);
        this.d.getClass();
        this.f11437c.run(u0.h(location));
    }
}
