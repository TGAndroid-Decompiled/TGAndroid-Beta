package org.telegram.messenger;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.SystemClock;
public final class jd implements LocationListener {
    public final int f23660a;
    public final Object f23661b;

    public jd(Object obj, int i3) {
        this.f23660a = i3;
        this.f23661b = obj;
    }

    @Override
    public final void onLocationChanged(Location location) {
        switch (this.f23660a) {
            case 0:
                ld ldVar = (ld) this.f23661b;
                if (location != null) {
                    Location location2 = ldVar.f23981s;
                    if (location2 != null && (this == ldVar.h || this == ldVar.f23979n)) {
                        if (!ldVar.E && location.distanceTo(location2) > 20.0f) {
                            ldVar.m(location);
                            ldVar.f23982w = SystemClock.elapsedRealtime() - 25000;
                            return;
                        }
                        return;
                    }
                    ldVar.m(location);
                    return;
                }
                return;
            default:
                l2.e eVar = (l2.e) this.f23661b;
                if (location != null && ((vs) eVar.f17692e) != null) {
                    if (r2.f25040a) {
                        a8.b("found location " + location);
                    }
                    eVar.f17693f = location;
                    if (location.getAccuracy() < 100.0f) {
                        ((uy) eVar.f17689a).B(location);
                        vs vsVar = (vs) eVar.f17692e;
                        if (vsVar != null) {
                            g0.r(vsVar);
                        }
                        eVar.d();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onProviderDisabled(String str) {
        int i3 = this.f23660a;
    }

    @Override
    public final void onProviderEnabled(String str) {
        int i3 = this.f23660a;
    }

    @Override
    public final void onStatusChanged(String str, int i3, Bundle bundle) {
        int i10 = this.f23660a;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }

    private final void e(String str, int i3, Bundle bundle) {
    }

    private final void f(String str, int i3, Bundle bundle) {
    }
}
