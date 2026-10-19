package gi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class s0 implements LocationListener {
    public final LocationManager f11434a;
    public final LocationListener[] f11435b;
    public final Utilities.Callback f11436c;
    public final u0 d;

    public s0(u0 u0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = u0Var;
        this.f11434a = locationManager;
        this.f11435b = locationListenerArr;
        this.f11436c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f11434a.removeUpdates(this.f11435b[0]);
        this.d.getClass();
        this.f11436c.run(u0.h(location));
    }
}
