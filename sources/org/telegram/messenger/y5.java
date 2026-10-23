package org.telegram.messenger;

import android.location.Location;
public final class y5 implements q0.a {
    public final int f20198a;
    public final LocationController f20199b;

    public y5(LocationController locationController, int i10) {
        this.f20198a = i10;
        this.f20199b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f20198a) {
            case 0:
                this.f20199b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f20199b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
