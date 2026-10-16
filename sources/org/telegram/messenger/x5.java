package org.telegram.messenger;

import android.location.Location;
public final class x5 implements q0.a {
    public final int f18685a;
    public final LocationController f18686b;

    public x5(LocationController locationController, int i10) {
        this.f18685a = i10;
        this.f18686b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f18685a) {
            case 0:
                this.f18686b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f18686b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
