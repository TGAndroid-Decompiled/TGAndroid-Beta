package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f19039a;
    public final LocationController f19040b;

    public t5(LocationController locationController, int i10) {
        this.f19039a = i10;
        this.f19040b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19039a) {
            case 0:
                this.f19040b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19040b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
