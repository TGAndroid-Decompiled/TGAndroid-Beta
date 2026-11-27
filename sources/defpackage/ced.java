package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class ced implements Parcelable.Creator {
    public final byte a;

    public ced(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ced.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f33[i];
            case 1:
                return new ay8[i];
            case 2:
                return new by8[i];
            case 3:
                return new fed[i];
            case 4:
                return new led[i];
            case 5:
                return new pd9[i];
            case 6:
                return new ued[i];
            case 7:
                return new afd[i];
            case 8:
                return new ytb[i];
            case 9:
                return new aub[i];
            case 10:
                return new ey[i];
            case 11:
                return new UserAddress[i];
            case 12:
                return new m54[i];
            case 13:
                return new l9d[i];
            case 14:
                return new ze0[i];
            case 15:
                return new o9d[i];
            case 16:
                return new t9d[i];
            case 17:
                return new yrd[i];
            case 18:
                return new a94[i];
            case 19:
                return new aa[i];
            case 20:
                return new tbc[i];
            case 21:
                return new ubc[i];
            case 22:
                return new wcc[i];
            case 23:
                return new xcc[i];
            case 24:
                return new mhd[i];
            case 25:
                return new fjd[i];
            case 26:
                return new f26[i];
            case 27:
                return new jkd[i];
            case 28:
                return new MediaError[i];
            default:
                return new MediaInfo[i];
        }
    }
}
