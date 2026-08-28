package org.telegram.messenger;

import android.location.Location;
public final class s5 implements q0.a {
    public final int f21454a;
    public final LocationController f21455b;

    public s5(LocationController locationController, int i9) {
        this.f21454a = i9;
        this.f21455b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f21454a) {
            case 0:
                this.f21455b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f21455b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
