package org.telegram.messenger;

import android.location.Location;
public final class t5 implements q0.a {
    public final int f17334a;
    public final LocationController f17335b;

    public t5(LocationController locationController, int i10) {
        this.f17334a = i10;
        this.f17335b = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f17334a) {
            case 0:
                this.f17335b.lambda$onConnected$4((Integer) obj);
                return;
            default:
                this.f17335b.setLastKnownLocation((Location) obj);
                return;
        }
    }
}
