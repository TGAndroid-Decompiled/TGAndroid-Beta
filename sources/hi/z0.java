package hi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class z0 implements LocationListener {
    public final LocationManager f13386a;
    public final LocationListener[] f13387b;
    public final Utilities.Callback f13388c;
    public final b1 d;

    public z0(b1 b1Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = b1Var;
        this.f13386a = locationManager;
        this.f13387b = locationListenerArr;
        this.f13388c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f13386a.removeUpdates(this.f13387b[0]);
        this.d.getClass();
        this.f13388c.run(b1.h(location));
    }
}
