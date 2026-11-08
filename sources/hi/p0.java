package hi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.c20;
public final class p0 implements LocationListener {
    public final LocationManager f14856a;
    public final LocationListener[] f14857b;
    public final c20 f14858c;
    public final r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, c20 c20Var) {
        this.d = r0Var;
        this.f14856a = locationManager;
        this.f14857b = locationListenerArr;
        this.f14858c = c20Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f14856a.removeUpdates(this.f14857b[0]);
        this.d.getClass();
        this.f14858c.a(r0.h(location));
    }
}
