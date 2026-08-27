package nh;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;

public final class r0 implements LocationListener {

    public final LocationManager f18922a;

    public final LocationListener[] f18923b;

    public final Utilities.Callback f18924c;
    public final t0 d;

    public r0(t0 t0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = t0Var;
        this.f18922a = locationManager;
        this.f18923b = locationListenerArr;
        this.f18924c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f18922a.removeUpdates(this.f18923b[0]);
        this.d.getClass();
        this.f18924c.run(t0.h(location));
    }
}
