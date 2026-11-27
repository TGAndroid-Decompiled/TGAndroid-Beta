package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;
public final class gd6 implements LocationListener {
    public final byte a;
    public final Object b;

    public gd6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                id6 id6Var = (id6) this.b;
                if (location != null) {
                    Location location2 = id6Var.s;
                    if (location2 != null && (this == id6Var.h || this == id6Var.n)) {
                        if (!id6Var.E && location.distanceTo(location2) > 20.0f) {
                            id6Var.m(location);
                            id6Var.w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    id6Var.m(location);
                    return;
                }
                return;
            case 1:
                fp fpVar = (fp) this.b;
                if (location != null && ((ux9) fpVar.e) != null) {
                    if (f11.a) {
                        cc4.b("found location " + location);
                    }
                    fpVar.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((n7a) fpVar.a).T(location);
                        ux9 ux9Var = (ux9) fpVar.e;
                        if (ux9Var != null) {
                            hl.r(ux9Var);
                        }
                        fpVar.c();
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
                    themeActivity.G0(location, false);
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
