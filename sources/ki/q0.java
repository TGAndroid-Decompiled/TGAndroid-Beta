package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.x10;
public final class q0 implements LocationListener {
    public final LocationManager f18844a;
    public final LocationListener[] f18845b;
    public final x10 f18846c;
    public final s0 d;

    public q0(s0 s0Var, LocationManager locationManager, LocationListener[] locationListenerArr, x10 x10Var) {
        this.d = s0Var;
        this.f18844a = locationManager;
        this.f18845b = locationListenerArr;
        this.f18846c = x10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18844a.removeUpdates(this.f18845b[0]);
        this.d.getClass();
        this.f18846c.a(s0.h(location));
    }
}
