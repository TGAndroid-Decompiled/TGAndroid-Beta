package org.telegram.messenger;

import android.location.Location;
public final class v5 implements q0.a {
    public final int f20249a;
    public final LocationController f20250b;

    public v5(LocationController locationController, int i10) {
        this.f20249a = i10;
        this.f20250b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20249a) {
            case 0:
                this.f20250b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20250b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
