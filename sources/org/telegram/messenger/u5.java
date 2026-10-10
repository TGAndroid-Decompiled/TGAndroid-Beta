package org.telegram.messenger;

import android.location.Location;
public final class u5 implements q0.a {
    public final int f19306a;
    public final LocationController f19307b;

    public u5(LocationController locationController, int i10) {
        this.f19306a = i10;
        this.f19307b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19306a) {
            case 0:
                this.f19307b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19307b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
