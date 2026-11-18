package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;
public final class od implements LocationListener {
    public final int f26051a;
    public final Object f26052b;

    public od(Object obj, int i7) {
        this.f26051a = i7;
        this.f26052b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.f26051a) {
            case 0:
                qd qdVar = (qd) this.f26052b;
                if (location != null) {
                    Location location2 = qdVar.f26386s;
                    if (location2 != null && (this == qdVar.h || this == qdVar.f26384n)) {
                        if (!qdVar.E && location.distanceTo(location2) > 20.0f) {
                            qdVar.m(location);
                            qdVar.f26387w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    qdVar.m(location);
                    return;
                }
                return;
            default:
                a8.b8 b8Var = (a8.b8) this.f26052b;
                if (location != null && ((xr) b8Var.f344e) != null) {
                    if (s2.f26721a) {
                        a8.b("found location " + location);
                    }
                    b8Var.f345f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((vy) b8Var.f341a).f(location);
                        xr xrVar = (xr) b8Var.f344e;
                        if (xrVar != null) {
                            g0.r(xrVar);
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
        int i7 = this.f26051a;
    }

    @Override
    public final void onProviderEnabled(String str) {
        int i7 = this.f26051a;
    }

    @Override
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
        int i10 = this.f26051a;
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
