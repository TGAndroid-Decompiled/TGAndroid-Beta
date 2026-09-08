package fi;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f10016a;
    public final LocationListener[] f10017b;
    public final Utilities.Callback f10018c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f10016a = locationManager;
        this.f10017b = locationListenerArr;
        this.f10018c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f10016a.removeUpdates(this.f10017b[0]);
        this.d.getClass();
        this.f10018c.run(w0.h(location));
    }
}
