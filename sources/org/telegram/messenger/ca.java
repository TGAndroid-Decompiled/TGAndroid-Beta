package org.telegram.messenger;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
public final class ca implements va {
    public LatLngBounds f23248a;

    public final bb a() {
        LatLngBounds latLngBounds = this.f23248a;
        LatLng latLng = latLngBounds.f7400a;
        double d = latLng.f7398a;
        LatLng latLng2 = latLngBounds.f7401b;
        double d2 = (d + latLng2.f7398a) / 2.0d;
        double d10 = latLng2.f7399b;
        double d11 = latLng.f7399b;
        if (d11 > d10) {
            d10 += 360.0d;
        }
        LatLng latLng3 = new LatLng(d2, (d10 + d11) / 2.0d);
        return new bb(latLng3.f7398a, latLng3.f7399b);
    }
}
