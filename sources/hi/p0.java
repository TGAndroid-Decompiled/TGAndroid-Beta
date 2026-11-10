package hi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.c20;
public final class p0 implements LocationListener {
    public final LocationManager f14858a;
    public final LocationListener[] f14859b;
    public final c20 f14860c;
    public final r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, c20 c20Var) {
        this.d = r0Var;
        this.f14858a = locationManager;
        this.f14859b = locationListenerArr;
        this.f14860c = c20Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f14858a.removeUpdates(this.f14859b[0]);
        this.d.getClass();
        this.f14860c.a(r0.h(location));
    }
}
