package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class fa implements xa {
    public LatLngBounds f15715a;

    public final db a() {
        LatLngBounds latLngBounds = this.f15715a;
        LatLng latLng = latLngBounds.f5418a;
        double d = latLng.f5416a;
        LatLng latLng2 = latLngBounds.f5419b;
        double d10 = (d + latLng2.f5416a) / 2.0d;
        double d11 = latLng2.f5417b;
        double d12 = latLng.f5417b;
        if (d12 > d11) {
            d11 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d10, (d11 + d12) / 2.0d);
        return new db(latLng3.f5416a, latLng3.f5417b);
    }
}
