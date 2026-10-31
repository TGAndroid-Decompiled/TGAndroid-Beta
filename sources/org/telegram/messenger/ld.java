package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;
public final class ld implements LocationListener {
    public final int f16725a;
    public final Object f16726b;

    public ld(Object obj, int i10) {
        this.f16725a = i10;
        this.f16726b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.f16725a) {
            case 0:
                nd ndVar = (nd) this.f16726b;
                if (location != null) {
                    Location location2 = ndVar.f17088s;
                    if (location2 != null && (this == ndVar.h || this == ndVar.f17086n)) {
                        if (!ndVar.D && location.distanceTo(location2) > 20.0f) {
                            ndVar.m(location);
                            ndVar.f17089w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    ndVar.m(location);
                    return;
                }
                return;
            default:
                j2.f fVar = (j2.f) this.f16726b;
                if (location != null && ((ms) fVar.e) != null) {
                    if (v2.f18448a) {
                        f8.b("found location " + location);
                    }
                    fVar.f9350f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((mz) fVar.f9347a).F(location);
                        ms msVar = (ms) fVar.e;
                        if (msVar != null) {
                            i0.r(msVar);
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
        int i10 = this.f16725a;
    }

    @Override
    public final void onProviderEnabled(String str) {
        int i10 = this.f16725a;
    }

    @Override
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
        int i11 = this.f16725a;
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
