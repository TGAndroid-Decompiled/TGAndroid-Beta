package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f19066a;
    public final LocationController f19067b;

    public t5(LocationController locationController, int i10) {
        this.f19066a = i10;
        this.f19067b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19066a) {
            case 0:
                this.f19067b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19067b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
