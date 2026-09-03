package org.telegram.messenger;

import android.location.Location;
public final class v5 implements q0.a {
    public final int f18616a;
    public final LocationController f18617b;

    public v5(LocationController locationController, int i10) {
        this.f18616a = i10;
        this.f18617b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18616a) {
            case 0:
                this.f18617b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f18617b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
