package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLngBounds;
public final class rpd implements Parcelable.Creator {
    public final byte a;

    public rpd(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kpd[i];
            case 1:
                return new dqd[i];
            case 2:
                return new oqd[i];
            case 3:
                return new zqd[i];
            case 4:
                return new p6a[i];
            case 5:
                return new lrd[i];
            case 6:
                return new xib[i];
            case 7:
                return new d9c[i];
            case 8:
                return new wrd[i];
            case 9:
                return new bbc[i];
            case 10:
                return new jsd[i];
            case 11:
                return new usd[i];
            case 12:
                return new std[i];
            case 13:
                return new y40[i];
            case 14:
                return new bnd[i];
            case 15:
                return new fnd[i];
            case 16:
                return new oe0[i];
            case 17:
                return new syd[i];
            case 18:
                return new tc1[i];
            case 19:
                return new Status[i];
            case 20:
                return new ytd[i];
            case 21:
                return new lud[i];
            case 22:
                return new uud[i];
            case 23:
                return new fvd[i];
            case 24:
                return new ovd[i];
            case 25:
                return new xvd[i];
            case 26:
                return new hwd[i];
            case 27:
                return new qwd[i];
            case 28:
                return new axd[i];
            default:
                return new LatLngBounds[i];
        }
    }
}
