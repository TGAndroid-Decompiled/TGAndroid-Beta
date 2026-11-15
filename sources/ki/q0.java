package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.z10;
public final class q0 implements LocationListener {
    public final LocationManager f18497a;
    public final LocationListener[] f18498b;
    public final z10 f18499c;
    public final s0 d;

    public q0(s0 s0Var, LocationManager locationManager, LocationListener[] locationListenerArr, z10 z10Var) {
        this.d = s0Var;
        this.f18497a = locationManager;
        this.f18498b = locationListenerArr;
        this.f18499c = z10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18497a.removeUpdates(this.f18498b[0]);
        this.d.getClass();
        this.f18499c.a(s0.h(location));
    }
}
