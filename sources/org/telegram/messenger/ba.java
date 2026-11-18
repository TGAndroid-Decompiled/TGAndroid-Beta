package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class ba implements ua {
    public LatLngBounds f23051a;

    public final ab a() {
        LatLngBounds latLngBounds = this.f23051a;
        LatLng latLng = latLngBounds.f7368a;
        double d = latLng.f7366a;
        LatLng latLng2 = latLngBounds.f7369b;
        double d2 = (d + latLng2.f7366a) / 2.0d;
        double d10 = latLng2.f7367b;
        double d11 = latLng.f7367b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new ab(latLng3.f7366a, latLng3.f7367b);
    }
}
