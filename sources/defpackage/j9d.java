package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.identity.intents.model.UserAddress;
public final class j9d implements Parcelable.Creator {
    public final byte a;

    public j9d(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j9d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new n23[i];
            case 1:
                return new ru8[i];
            case 2:
                return new su8[i];
            case 3:
                return new m9d[i];
            case 4:
                return new s9d[i];
            case 5:
                return new ba9[i];
            case 6:
                return new bad[i];
            case 7:
                return new had[i];
            case 8:
                return new xpb[i];
            case 9:
                return new zpb[i];
            case 10:
                return new dy[i];
            case 11:
                return new UserAddress[i];
            case 12:
                return new q44[i];
            case 13:
                return new s4d[i];
            case 14:
                return new xe0[i];
            case 15:
                return new v4d[i];
            case 16:
                return new a5d[i];
            case 17:
                return new hnd[i];
            case 18:
                return new f84[i];
            case 19:
                return new z9[i];
            case 20:
                return new t7c[i];
            case 21:
                return new u7c[i];
            case 22:
                return new w8c[i];
            case 23:
                return new x8c[i];
            case 24:
                return new tcd[i];
            case 25:
                return new oed[i];
            case 26:
                return new b06[i];
            case 27:
                return new sfd[i];
            case 28:
                return new MediaError[i];
            default:
                return new MediaInfo[i];
        }
    }
}
