package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.maps.model.LatLng;
public final class qyd implements Parcelable.Creator {
    public final byte a;

    public qyd(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mn5[i];
            case 1:
                return new ne0[i];
            case 2:
                return new mtd[i];
            case 3:
                return new uw5[i];
            case 4:
                return new zle[i];
            case 5:
                return new h5e[i];
            case 6:
                return new LatLng[i];
            case 7:
                return new nn5[i];
            case 8:
                return new ryd[i];
            case 9:
                return new qe0[i];
            case 10:
                return new uc1[i];
            case 11:
                return new tyd[i];
            case 12:
                return new wyd[i];
            case 13:
                return new a9e[i];
            case 14:
                return new m9e[i];
            case 15:
                return new w9e[i];
            case 16:
                return new kae[i];
            case 17:
                return new wae[i];
            case 18:
                return new ube[i];
            case 19:
                return new v5e[i];
            case 20:
                return new w5e[i];
            case 21:
                return new ek5[i];
            case 22:
                return new gi6[i];
            case 23:
                return new m64[i];
            case 24:
                return new pe0[i];
            case 25:
                return new BinderWrapper[i];
            case 26:
                return new sce[i];
            case 27:
                return new ede[i];
            case 28:
                return new wde[i];
            default:
                return new dce[i];
        }
    }
}
