package org.telegram.messenger;

import com.google.android.gms.location.LocationRequest;
public final class aa implements ra {
    public LocationRequest f22857a;

    public final void a() {
        this.f22857a.f7347c = 1000L;
    }

    public final void b() {
        LocationRequest locationRequest = this.f22857a;
        long j3 = locationRequest.f7347c;
        long j10 = locationRequest.f7346b;
        if (j3 == j10 / 6) {
            locationRequest.f7347c = 166L;
        }
        if (locationRequest.f7351r == j10) {
            locationRequest.f7351r = 1000L;
        }
        locationRequest.f7346b = 1000L;
    }

    public final void c() {
        this.f22857a.f7345a = 100;
    }
}
