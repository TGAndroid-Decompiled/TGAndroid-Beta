package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f19210a;
    public final LocationController f19211b;

    public t5(LocationController locationController, int i10) {
        this.f19210a = i10;
        this.f19211b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19210a) {
            case 0:
                this.f19211b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19211b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
