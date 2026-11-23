package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;
public final class aa implements ra {
    public LocationRequest f22893a;

    public final void a() {
        this.f22893a.f7384c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.f22893a;
        long j3 = locationRequest.f7384c;
        long j10 = locationRequest.f7383b;
        if (j3 == j10 / 6) {
            locationRequest.f7384c = 166L;
        }
        if (locationRequest.f7388r == j10) {
            locationRequest.f7388r = 1000L;
        }
        locationRequest.f7383b = 1000L;
    }

    public final void c() {
        this.f22893a.f7382a = 100;
    }
}
