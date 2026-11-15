package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;
public final class pd implements LocationListener {
    public final int f25923a;
    public final Object f25924b;

    public pd(Object obj, int i7) {
        this.f25923a = i7;
        this.f25924b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.f25923a) {
            case 0:
                rd rdVar = (rd) this.f25924b;
                if (location != null) {
                    Location location2 = rdVar.f26284s;
                    if (location2 != null && (this == rdVar.h || this == rdVar.f26282n)) {
                        if (!rdVar.E && location.distanceTo(location2) > 20.0f) {
                            rdVar.m(location);
                            rdVar.f26285w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    rdVar.m(location);
                    return;
                }
                return;
            default:
                a8.b8 b8Var = (a8.b8) this.f25924b;
                if (location != null && ((as) b8Var.f344e) != null) {
                    if (r2.f26206a) {
                        a8.b("found location " + location);
                    }
                    b8Var.f345f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((az) b8Var.f341a).f(location);
                        as asVar = (as) b8Var.f344e;
                        if (asVar != null) {
                            g0.r(asVar);
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
        int i7 = this.f25923a;
    }

    @Override
    public final void onProviderEnabled(String str) {
        int i7 = this.f25923a;
    }

    @Override
    public final void onStatusChanged(String str, int i7, Bundle bundle) {
        int i10 = this.f25923a;
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
