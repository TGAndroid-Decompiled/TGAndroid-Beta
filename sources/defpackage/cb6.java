package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;
public final class cb6 implements LocationListener {
    public final byte a;
    public final Object b;

    public cb6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                eb6 eb6Var = (eb6) this.b;
                if (location != null) {
                    Location location2 = eb6Var.s;
                    if (location2 != null && (this == eb6Var.h || this == eb6Var.n)) {
                        if (!eb6Var.E && location.distanceTo(location2) > 20.0f) {
                            eb6Var.m(location);
                            eb6Var.w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    eb6Var.m(location);
                    return;
                }
                return;
            case 1:
                ep epVar = (ep) this.b;
                if (location != null && ((zk9) epVar.e) != null) {
                    if (w01.a) {
                        fa4.b("found location " + location);
                    }
                    epVar.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((v3a) epVar.a).X(location);
                        zk9 zk9Var = (zk9) epVar.e;
                        if (zk9Var != null) {
                            gl.r(zk9Var);
                        }
                        epVar.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.b;
                if (location != null) {
                    themeActivity.M0 = false;
                    LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
                    locationManager.removeUpdates(themeActivity.S0);
                    locationManager.removeUpdates(themeActivity.T0);
                    themeActivity.F0(location, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onProviderDisabled(String str) {
        byte b = this.a;
    }

    @Override
    public final void onProviderEnabled(String str) {
        byte b = this.a;
    }

    @Override
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        byte b = this.a;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str) {
    }

    private final void f(String str) {
    }

    private final void g(String str, int i, Bundle bundle) {
    }

    private final void h(String str, int i, Bundle bundle) {
    }

    private final void i(String str, int i, Bundle bundle) {
    }
}
