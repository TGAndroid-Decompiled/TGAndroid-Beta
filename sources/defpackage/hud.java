package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLngBounds;
public final class hud implements Parcelable.Creator {
    public final byte a;

    public hud(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hud.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new aud[i];
            case 1:
                return new tud[i];
            case 2:
                return new evd[i];
            case 3:
                return new pvd[i];
            case 4:
                return new haa[i];
            case 5:
                return new bwd[i];
            case 6:
                return new tmb[i];
            case 7:
                return new ddc[i];
            case 8:
                return new mwd[i];
            case 9:
                return new bfc[i];
            case 10:
                return new zwd[i];
            case 11:
                return new kxd[i];
            case 12:
                return new iyd[i];
            case 13:
                return new a50[i];
            case 14:
                return new srd[i];
            case 15:
                return new wrd[i];
            case 16:
                return new qe0[i];
            case 17:
                return new i3e[i];
            case 18:
                return new bd1[i];
            case 19:
                return new Status[i];
            case 20:
                return new oyd[i];
            case 21:
                return new bzd[i];
            case 22:
                return new kzd[i];
            case 23:
                return new vzd[i];
            case 24:
                return new e0e[i];
            case 25:
                return new n0e[i];
            case 26:
                return new x0e[i];
            case 27:
                return new g1e[i];
            case 28:
                return new q1e[i];
            default:
                return new LatLngBounds[i];
        }
    }
}
