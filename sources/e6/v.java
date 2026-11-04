package e6;

import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
public final class v implements Parcelable.Creator {
    public final int f9782a;

    public v(int i3) {
        this.f9782a = i3;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: e6.v.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f9782a) {
            case 0:
                return new a[i3];
            case 1:
                return new h[i3];
            case 2:
                return new w[i3];
            case 3:
                return new x[i3];
            case 4:
                return new b[i3];
            case 5:
                return new i[i3];
            case 6:
                return new MediaError[i3];
            case 7:
                return new MediaInfo[i3];
            case 8:
                return new j[i3];
            case 9:
                return new c[i3];
            case 10:
                return new k[i3];
            case 11:
                return new l[i3];
            case 12:
                return new m[i3];
            case 13:
                return new n[i3];
            case 14:
                return new o[i3];
            case 15:
                return new q[i3];
            case 16:
                return new MediaTrack[i3];
            case 17:
                return new d[i3];
            case 18:
                return new r[i3];
            case 19:
                return new s[i3];
            case 20:
                return new t[i3];
            case 21:
                return new u[i3];
            default:
                return new CastDevice[i3];
        }
    }
}
