package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import org.telegram.messenger.a;
import org.telegram.ui.ThemeActivity;
public final class bd6 implements LocationListener {
    public final byte a;
    public final Object b;

    public bd6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.a) {
            case 0:
                dd6 dd6Var = (dd6) this.b;
                if (location != null) {
                    Location location2 = dd6Var.s;
                    if (location2 != null && (this == dd6Var.h || this == dd6Var.n)) {
                        if (!dd6Var.E && location.distanceTo(location2) > 20.0f) {
                            dd6Var.m(location);
                            dd6Var.w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    dd6Var.m(location);
                    return;
                }
                return;
            case 1:
                eq eqVar = (eq) this.b;
                if (location != null && ((c0a) eqVar.e) != null) {
                    if (e21.a) {
                        fc4.b("found location " + location);
                    }
                    eqVar.f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((w5a) eqVar.a).U(location);
                        c0a c0aVar = (c0a) eqVar.e;
                        if (c0aVar != null) {
                            gm.r(c0aVar);
                        }
                        eqVar.c();
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
