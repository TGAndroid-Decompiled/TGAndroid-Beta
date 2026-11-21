package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.x10;
public final class p0 implements LocationListener {
    public final LocationManager f18851a;
    public final LocationListener[] f18852b;
    public final x10 f18853c;
    public final r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, x10 x10Var) {
        this.d = r0Var;
        this.f18851a = locationManager;
        this.f18852b = locationListenerArr;
        this.f18853c = x10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18851a.removeUpdates(this.f18852b[0]);
        this.d.getClass();
        this.f18853c.a(r0.h(location));
    }
}
