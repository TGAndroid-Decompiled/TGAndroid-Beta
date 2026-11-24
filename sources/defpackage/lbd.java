package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class lbd implements Parcelable.Creator {
    public final byte a;

    public lbd(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new y33[i];
            case 1:
                return new sw8[i];
            case 2:
                return new tw8[i];
            case 3:
                return new obd[i];
            case 4:
                return new ubd[i];
            case 5:
                return new bc9[i];
            case 6:
                return new dcd[i];
            case 7:
                return new jcd[i];
            case 8:
                return new yrb[i];
            case 9:
                return new asb[i];
            case 10:
                return new dz[i];
            case 11:
                return new UserAddress[i];
            case 12:
                return new b64[i];
            case 13:
                return new u6d[i];
            case 14:
                return new xf0[i];
            case 15:
                return new x6d[i];
            case 16:
                return new c7d[i];
            case 17:
                return new kpd[i];
            case 18:
                return new o94[i];
            case 19:
                return new z9[i];
            case 20:
                return new u9c[i];
            case 21:
                return new v9c[i];
            case 22:
                return new xac[i];
            case 23:
                return new yac[i];
            case 24:
                return new ved[i];
            case 25:
                return new pgd[i];
            case 26:
                return new b26[i];
            case 27:
                return new thd[i];
            case 28:
                return new MediaError[i];
            default:
                return new MediaInfo[i];
        }
    }
}
