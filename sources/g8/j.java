package g8;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import m.n0;
public final class j implements Parcelable.Creator {
    public final int f8650a;

    public j(int i10) {
        this.f8650a = i10;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: g8.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f8650a) {
            case 0:
                return new g[i10];
            case 1:
                return new h[i10];
            case 2:
                return new k[i10];
            case 3:
                return new b[i10];
            case 4:
                return new LocationAvailability[i10];
            case 5:
                return new LocationRequest[i10];
            case 6:
                return new LocationResult[i10];
            case 7:
                return new e[i10];
            case 8:
                return new i6.b[i10];
            case 9:
                return new i6.c[i10];
            case 10:
                return new CameraPosition[i10];
            case 11:
                return new j8.b[i10];
            case 12:
                return new LatLngBounds[i10];
            case 13:
                return new LatLng[i10];
            case 14:
                return new j8.e[i10];
            case 15:
                return new j8.g[i10];
            case 16:
                return new j8.h[i10];
            case 17:
                return new k6.a[i10];
            case 18:
                return new k6.c[i10];
            case 19:
                return new k8.a[i10];
            case 20:
                return new DataHolder[i10];
            case 21:
                return new l8.a[i10];
            case 22:
                return new l8.b[i10];
            case 23:
                return new l8.c[i10];
            case 24:
                return new l8.d[i10];
            case 25:
                return new n0[i10];
            case 26:
                return new m6.a[i10];
            case 27:
                return new m8.e[i10];
            case 28:
                return new m8.a[i10];
            default:
                return new m8.f[i10];
        }
    }
}
