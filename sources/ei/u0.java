package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8625a;
    public final LocationListener[] f8626b;
    public final Utilities.Callback f8627c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8625a = locationManager;
        this.f8626b = locationListenerArr;
        this.f8627c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8625a.removeUpdates(this.f8626b[0]);
        this.d.getClass();
        this.f8627c.run(w0.h(location));
    }
}
