package i7;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import m.n0;
public final class p implements Parcelable.Creator {
    public final int f14691a;

    public p(int i3) {
        this.f14691a = i3;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: i7.p.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f14691a) {
            case 0:
                return new o[i3];
            case 1:
                return new q[i3];
            case 2:
                return new r[i3];
            case 3:
                return new i8.e[i3];
            case 4:
                return new i8.f[i3];
            case 5:
                return new i8.g[i3];
            case 6:
                return new i8.a[i3];
            case 7:
                return new LocationAvailability[i3];
            case 8:
                return new LocationRequest[i3];
            case 9:
                return new LocationResult[i3];
            case 10:
                return new i8.c[i3];
            case 11:
                return new k6.b[i3];
            case 12:
                return new k6.c[i3];
            case 13:
                return new l6.a[i3];
            case 14:
                return new l6.f[i3];
            case 15:
                return new l6.b[i3];
            case 16:
                return new CameraPosition[i3];
            case 17:
                return new l8.b[i3];
            case 18:
                return new LatLngBounds[i3];
            case 19:
                return new LatLng[i3];
            case 20:
                return new l8.e[i3];
            case 21:
                return new l8.g[i3];
            case 22:
                return new l8.h[i3];
            case 23:
                return new n0[i3];
            case 24:
                return new m6.a[i3];
            case 25:
                return new m6.c[i3];
            case 26:
                return new m8.a[i3];
            case 27:
                return new DataHolder[i3];
            case 28:
                return new n8.a[i3];
            default:
                return new n8.b[i3];
        }
    }
}
