package gi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class s0 implements LocationListener {
    public final LocationManager f11460a;
    public final LocationListener[] f11461b;
    public final Utilities.Callback f11462c;
    public final u0 d;

    public s0(u0 u0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = u0Var;
        this.f11460a = locationManager;
        this.f11461b = locationListenerArr;
        this.f11462c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f11460a.removeUpdates(this.f11461b[0]);
        this.d.getClass();
        this.f11462c.run(u0.h(location));
    }
}
