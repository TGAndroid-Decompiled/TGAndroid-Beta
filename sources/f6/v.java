package f6;

import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
public final class v implements Parcelable.Creator {
    public final int f11339a;

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: f6.v.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f11339a) {
            case 0:
                return new a[i7];
            case 1:
                return new h[i7];
            case 2:
                return new w[i7];
            case 3:
                return new x[i7];
            case 4:
                return new b[i7];
            case 5:
                return new i[i7];
            case 6:
                return new MediaError[i7];
            case 7:
                return new MediaInfo[i7];
            case 8:
                return new j[i7];
            case 9:
                return new c[i7];
            case 10:
                return new k[i7];
            case 11:
                return new l[i7];
            case 12:
                return new m[i7];
            case 13:
                return new n[i7];
            case 14:
                return new o[i7];
            case 15:
                return new q[i7];
            case 16:
                return new MediaTrack[i7];
            case 17:
                return new d[i7];
            case 18:
                return new r[i7];
            case 19:
                return new s[i7];
            case 20:
                return new t[i7];
            case 21:
                return new u[i7];
            default:
                return new CastDevice[i7];
        }
    }
}
