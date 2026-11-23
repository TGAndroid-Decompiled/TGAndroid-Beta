package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.y10;
public final class p0 implements LocationListener {
    public final LocationManager f18854a;
    public final LocationListener[] f18855b;
    public final y10 f18856c;
    public final r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, y10 y10Var) {
        this.d = r0Var;
        this.f18854a = locationManager;
        this.f18855b = locationListenerArr;
        this.f18856c = y10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18854a.removeUpdates(this.f18855b[0]);
        this.d.getClass();
        this.f18856c.a(r0.h(location));
    }
}
