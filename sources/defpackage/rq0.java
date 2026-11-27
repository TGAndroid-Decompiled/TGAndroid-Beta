package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
public final class rq0 implements LocationListener {
    public final LocationManager a;
    public final LocationListener[] b;
    public final pcc c;
    public final tq0 d;

    public rq0(tq0 tq0Var, LocationManager locationManager, LocationListener[] locationListenerArr, pcc pccVar) {
        this.d = tq0Var;
        this.a = locationManager;
        this.b = locationListenerArr;
        this.c = pccVar;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.a.removeUpdates(this.b[0]);
        this.d.getClass();
        this.c.a(tq0.g(location));
    }
}
