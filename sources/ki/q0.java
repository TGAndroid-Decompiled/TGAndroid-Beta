package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.x10;
public final class q0 implements LocationListener {
    public final LocationManager f18841a;
    public final LocationListener[] f18842b;
    public final x10 f18843c;
    public final s0 d;

    public q0(s0 s0Var, LocationManager locationManager, LocationListener[] locationListenerArr, x10 x10Var) {
        this.d = s0Var;
        this.f18841a = locationManager;
        this.f18842b = locationListenerArr;
        this.f18843c = x10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18841a.removeUpdates(this.f18842b[0]);
        this.d.getClass();
        this.f18843c.a(s0.h(location));
    }
}
