package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class x9 implements pa {
    public LatLngBounds f26356a;

    public final va a() {
        LatLngBounds latLngBounds = this.f26356a;
        LatLng latLng = latLngBounds.f7753a;
        double d = latLng.f7751a;
        LatLng latLng2 = latLngBounds.f7754b;
        double d10 = (d + latLng2.f7751a) / 2.0d;
        double d11 = latLng2.f7752b;
        double d12 = latLng.f7752b;
        if (d12 > d11) {
            d11 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d10, (d11 + d12) / 2.0d);
        return new va(latLng3.f7751a, latLng3.f7752b);
    }
}
