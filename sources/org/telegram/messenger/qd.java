package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;
public final class qd implements LocationListener {
    public final int f24678a;
    public final Object f24679b;

    public qd(Object obj, int i7) {
        this.f24678a = i7;
        this.f24679b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.f24678a) {
            case 0:
                sd sdVar = (sd) this.f24679b;
                if (location != null) {
                    Location location2 = sdVar.f25448s;
                    if (location2 != null && (this == sdVar.h || this == sdVar.f25446n)) {
                        if (!sdVar.D && location.distanceTo(location2) > 20.0f) {
                            sdVar.m(location);
                            sdVar.f25449w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    sdVar.m(location);
                    return;
                }
                return;
            default:
                a8.b8 b8Var = (a8.b8) this.f24679b;
                if (location != null && ((ds) b8Var.f338e) != null) {
                    if (r2.f25191a) {
                        a8.b("found location " + location);
                    }
                    b8Var.f339f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((cz) b8Var.f335a).K(location);
                        ds dsVar = (ds) b8Var.f338e;
                        if (dsVar != null) {
                            g0.r(dsVar);
                        }
                        b8Var.d();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onProviderDisabled(String str) {
        int i7 = this.f24678a;
    }

    @Override
    public final void onProviderEnabled(String str) {
        int i7 = this.f24678a;
    }

    @Override
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
        int i10 = this.f24678a;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str, int i7, Bundle bundle) {
    }

    private final void f(String str, int i7, Bundle bundle) {
    }
}
