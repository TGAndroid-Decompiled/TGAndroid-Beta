package org.telegram.messenger;

import android.location.Location;
public final class a6 implements q0.a {
    public final int f19594a;
    public final LocationController f19595b;

    public a6(LocationController locationController, int i10) {
        this.f19594a = i10;
        this.f19595b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19594a) {
            case 0:
                this.f19595b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19595b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
