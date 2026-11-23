package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class ba implements ua {
    public LatLngBounds f23176a;

    public final ab a() {
        LatLngBounds latLngBounds = this.f23176a;
        LatLng latLng = latLngBounds.f7362a;
        double d = latLng.f7360a;
        LatLng latLng2 = latLngBounds.f7363b;
        double d2 = (d + latLng2.f7360a) / 2.0d;
        double d10 = latLng2.f7361b;
        double d11 = latLng.f7361b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new ab(latLng3.f7360a, latLng3.f7361b);
    }
}
