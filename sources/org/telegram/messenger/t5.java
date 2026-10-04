package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f19209a;
    public final LocationController f19210b;

    public t5(LocationController locationController, int i10) {
        this.f19209a = i10;
        this.f19210b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f19209a) {
            case 0:
                this.f19210b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f19210b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
