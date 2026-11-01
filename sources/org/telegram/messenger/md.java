package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;
public final class md implements LocationListener {
    public final int f17109a;
    public final Object f17110b;

    public md(Object obj, int i10) {
        this.f17109a = i10;
        this.f17110b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.f17109a) {
            case 0:
                od odVar = (od) this.f17110b;
                if (location != null) {
                    Location location2 = odVar.f17425s;
                    if (location2 != null && (this == odVar.h || this == odVar.f17423n)) {
                        if (!odVar.D && location.distanceTo(location2) > 20.0f) {
                            odVar.m(location);
                            odVar.f17426w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    odVar.m(location);
                    return;
                }
                return;
            default:
                j2.f fVar = (j2.f) this.f17110b;
                if (location != null && ((ns) fVar.e) != null) {
                    if (v2.f18578a) {
                        f8.b("found location " + location);
                    }
                    fVar.f9351f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((nz) fVar.f9348a).F(location);
                        ns nsVar = (ns) fVar.e;
                        if (nsVar != null) {
                            i0.r(nsVar);
                        }
                        fVar.j();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onProviderDisabled(String str) {
        int i10 = this.f17109a;
    }

    @Override
    public final void onProviderEnabled(String str) {
        int i10 = this.f17109a;
    }

    @Override
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
        int i11 = this.f17109a;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str, int i10, Bundle bundle) {
    }

    private final void f(String str, int i10, Bundle bundle) {
    }
}
