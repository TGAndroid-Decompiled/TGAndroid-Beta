package m6;

import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import q4.p;
import q4.v;
import q4.w;
public final class e implements Parcelable.Creator {
    public final int f19896a;

    public e(int i7) {
        this.f19896a = i7;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r23) {
        throw new UnsupportedOperationException("Method not decompiled: m6.e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f19896a) {
            case 0:
                return new g[i7];
            case 1:
                return new b[i7];
            case 2:
                return new CameraPosition[i7];
            case 3:
                return new m8.b[i7];
            case 4:
                return new LatLngBounds[i7];
            case 5:
                return new LatLng[i7];
            case 6:
                return new m8.e[i7];
            case 7:
                return new m8.g[i7];
            case 8:
                return new m8.h[i7];
            case 9:
                return new n6.a[i7];
            case 10:
                return new n6.c[i7];
            case 11:
                return new n8.a[i7];
            case 12:
                return new DataHolder[i7];
            case 13:
                return new o8.a[i7];
            case 14:
                return new o8.b[i7];
            case 15:
                return new o8.c[i7];
            case 16:
                return new o8.d[i7];
            case 17:
                return new p6.a[i7];
            case 18:
                return new p8.e[i7];
            case 19:
                return new p8.a[i7];
            case 20:
                return new p8.f[i7];
            case 21:
                return new p8.g[i7];
            case 22:
                return new p8.h[i7];
            case 23:
                return new p8.b[i7];
            case 24:
                return new q4.h[i7];
            case 25:
                return new q4.i[i7];
            case 26:
                return new q4.o[i7];
            case 27:
                return new p[i7];
            case 28:
                return new w[i7];
            default:
                return new v[i7];
        }
    }
}
