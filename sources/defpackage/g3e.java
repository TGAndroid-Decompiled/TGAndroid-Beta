package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.maps.model.LatLng;
public final class g3e implements Parcelable.Creator {
    public final byte a;

    public g3e(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g3e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new pp5[i];
            case 1:
                return new pe0[i];
            case 2:
                return new cyd[i];
            case 3:
                return new zy5[i];
            case 4:
                return new qqe[i];
            case 5:
                return new x9e[i];
            case 6:
                return new LatLng[i];
            case 7:
                return new qp5[i];
            case 8:
                return new h3e[i];
            case 9:
                return new se0[i];
            case 10:
                return new cd1[i];
            case 11:
                return new j3e[i];
            case 12:
                return new m3e[i];
            case 13:
                return new qde[i];
            case 14:
                return new cee[i];
            case 15:
                return new mee[i];
            case 16:
                return new afe[i];
            case 17:
                return new mfe[i];
            case 18:
                return new kge[i];
            case 19:
                return new lae[i];
            case 20:
                return new mae[i];
            case 21:
                return new hm5[i];
            case 22:
                return new kk6[i];
            case 23:
                return new g74[i];
            case 24:
                return new re0[i];
            case 25:
                return new BinderWrapper[i];
            case 26:
                return new jhe[i];
            case 27:
                return new vhe[i];
            case 28:
                return new nie[i];
            default:
                return new tge[i];
        }
    }
}
