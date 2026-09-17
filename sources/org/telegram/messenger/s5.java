package org.telegram.messenger;

import android.location.Location;
public final class s5 implements q0.a {
    public final int f18982a;
    public final LocationController f18983b;

    public s5(LocationController locationController, int i10) {
        this.f18982a = i10;
        this.f18983b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18982a) {
            case 0:
                this.f18983b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f18983b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
