package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLngBounds;
public final class urd implements Parcelable.Creator {
    public final byte a;

    public urd(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new nrd[i];
            case 1:
                return new gsd[i];
            case 2:
                return new rsd[i];
            case 3:
                return new ctd[i];
            case 4:
                return new r8a[i];
            case 5:
                return new otd[i];
            case 6:
                return new ykb[i];
            case 7:
                return new ebc[i];
            case 8:
                return new ztd[i];
            case 9:
                return new edc[i];
            case 10:
                return new mud[i];
            case 11:
                return new xud[i];
            case 12:
                return new vvd[i];
            case 13:
                return new y50[i];
            case 14:
                return new epd[i];
            case 15:
                return new ipd[i];
            case 16:
                return new of0[i];
            case 17:
                return new v0e[i];
            case 18:
                return new be1[i];
            case 19:
                return new Status[i];
            case 20:
                return new bwd[i];
            case 21:
                return new owd[i];
            case 22:
                return new xwd[i];
            case 23:
                return new ixd[i];
            case 24:
                return new rxd[i];
            case 25:
                return new ayd[i];
            case 26:
                return new kyd[i];
            case 27:
                return new tyd[i];
            case 28:
                return new dzd[i];
            default:
                return new LatLngBounds[i];
        }
    }
}
