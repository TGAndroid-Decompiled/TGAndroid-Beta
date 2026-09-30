package ei;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import org.telegram.messenger.Utilities;
public final class u0 implements LocationListener {
    public final LocationManager f8634a;
    public final LocationListener[] f8635b;
    public final Utilities.Callback f8636c;
    public final w0 d;

    public u0(w0 w0Var, LocationManager locationManager, LocationListener[] locationListenerArr, Utilities.Callback callback) {
        this.d = w0Var;
        this.f8634a = locationManager;
        this.f8635b = locationListenerArr;
        this.f8636c = callback;
    }

    @Override
    public final void onLocationChanged(Location location) {
        this.f8634a.removeUpdates(this.f8635b[0]);
        this.d.getClass();
        this.f8636c.run(w0.h(location));
    }
}
