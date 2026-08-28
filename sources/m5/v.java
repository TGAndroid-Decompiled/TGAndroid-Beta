package m5;

import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
public final class v implements Parcelable.Creator {
    public final int f17482a;

    public v(int i9) {
        this.f17482a = i9;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: m5.v.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f17482a) {
            case 0:
                return new a[i9];
            case 1:
                return new h[i9];
            case 2:
                return new w[i9];
            case 3:
                return new x[i9];
            case 4:
                return new b[i9];
            case 5:
                return new i[i9];
            case 6:
                return new MediaError[i9];
            case 7:
                return new MediaInfo[i9];
            case 8:
                return new j[i9];
            case 9:
                return new c[i9];
            case 10:
                return new k[i9];
            case 11:
                return new l[i9];
            case 12:
                return new m[i9];
            case 13:
                return new n[i9];
            case 14:
                return new o[i9];
            case 15:
                return new q[i9];
            case 16:
                return new MediaTrack[i9];
            case 17:
                return new d[i9];
            case 18:
                return new r[i9];
            case 19:
                return new s[i9];
            case 20:
                return new t[i9];
            case 21:
                return new u[i9];
            default:
                return new CastDevice[i9];
        }
    }
}
