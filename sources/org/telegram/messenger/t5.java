package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f19217a;
    public final LocationController f19218b;

    public t5(LocationController locationController, int i10) {
        this.f19217a = i10;
        this.f19218b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19217a) {
            case 0:
                this.f19218b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19218b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
