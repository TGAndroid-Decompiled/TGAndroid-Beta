package ki;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.y10;
public final class p0 implements LocationListener {
    public final LocationManager f18820a;
    public final LocationListener[] f18821b;
    public final y10 f18822c;
    public final r0 d;

    public p0(r0 r0Var, LocationManager locationManager, LocationListener[] locationListenerArr, y10 y10Var) {
        this.d = r0Var;
        this.f18820a = locationManager;
        this.f18821b = locationListenerArr;
        this.f18822c = y10Var;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18820a.removeUpdates(this.f18821b[0]);
        this.d.getClass();
        this.f18822c.a(r0.h(location));
    }
}
