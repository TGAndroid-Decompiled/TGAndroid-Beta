package ii;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.u10;
public final class q0 implements LocationListener {
    public final LocationManager f15150a;
    public final LocationListener[] f15151b;
    public final u10 f15152c;
    public final s0 d;

    public q0(s0 s0Var, LocationManager locationManager, LocationListener[] locationListenerArr, u10 u10Var) {
        this.d = s0Var;
        this.f15150a = locationManager;
        this.f15151b = locationListenerArr;
        this.f15152c = u10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f15150a.removeUpdates(this.f15151b[0]);
        this.d.getClass();
        this.f15152c.a(s0.h(location));
    }
}
