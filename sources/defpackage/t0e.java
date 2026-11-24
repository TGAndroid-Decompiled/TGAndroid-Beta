package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.maps.model.LatLng;
public final class t0e implements Parcelable.Creator {
    public final byte a;

    public t0e(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0e.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mp5[i];
            case 1:
                return new nf0[i];
            case 2:
                return new pvd[i];
            case 3:
                return new uy5[i];
            case 4:
                return new boe[i];
            case 5:
                return new k7e[i];
            case 6:
                return new LatLng[i];
            case 7:
                return new np5[i];
            case 8:
                return new u0e[i];
            case 9:
                return new qf0[i];
            case 10:
                return new ce1[i];
            case 11:
                return new w0e[i];
            case 12:
                return new z0e[i];
            case 13:
                return new bbe[i];
            case 14:
                return new nbe[i];
            case 15:
                return new xbe[i];
            case 16:
                return new lce[i];
            case 17:
                return new xce[i];
            case 18:
                return new vde[i];
            case 19:
                return new y7e[i];
            case 20:
                return new z7e[i];
            case 21:
                return new em5[i];
            case 22:
                return new ik6[i];
            case 23:
                return new v74[i];
            case 24:
                return new pf0[i];
            case 25:
                return new BinderWrapper[i];
            case 26:
                return new tee[i];
            case 27:
                return new ffe[i];
            case 28:
                return new xfe[i];
            default:
                return new eee[i];
        }
    }
}
