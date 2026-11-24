package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
public final class rr0 implements LocationListener {
    public final LocationManager a;
    public final LocationListener[] b;
    public final qac c;
    public final tr0 d;

    public rr0(tr0 tr0Var, LocationManager locationManager, LocationListener[] locationListenerArr, qac qacVar) {
        this.d = tr0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = qacVar;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(tr0.g(location));
    }
}
