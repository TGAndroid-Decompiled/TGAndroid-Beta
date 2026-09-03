package org.telegram.messenger;

import android.location.Location;
public final class v5 implements q0.a {
    public final int f20251a;
    public final LocationController f20252b;

    public v5(LocationController locationController, int i10) {
        this.f20251a = i10;
        this.f20252b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20251a) {
            case 0:
                this.f20252b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20252b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
