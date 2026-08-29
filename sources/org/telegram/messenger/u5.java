package org.telegram.messenger;

import android.location.Location;
public final class u5 implements q0.a {
    public final int f21697a;
    public final LocationController f21698b;

    public u5(LocationController locationController, int i10) {
        this.f21697a = i10;
        this.f21698b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f21697a) {
            case 0:
                this.f21698b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f21698b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
