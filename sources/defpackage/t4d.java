package defpackage;

import android.os.Parcelable;
public final class t4d implements Parcelable.Creator {
    public final byte a;

    public t4d(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new le0[i];
            case 1:
                return new aj2[i];
            case 2:
                return new ds2[i];
            case 3:
                return new lb6[i];
            case 4:
                return new oy7[i];
            case 5:
                return new ql7[i];
            case 6:
                return new bif[i];
            case 7:
                return new whf[i];
            case 8:
                return new mb6[i];
            case 9:
                return new py7[i];
            case 10:
                return new m5d[i];
            case 11:
                return new n5d[i];
            case 12:
                return new v5d[i];
            case 13:
                return new vz7[i];
            case 14:
                return new z5d[i];
            case 15:
                return new wz7[i];
            case 16:
                return new dz4[i];
            case 17:
                return new mj9[i];
            case 18:
                return new s6d[i];
            case 19:
                return new d7d[i];
            case 20:
                return new l7d[i];
            case 21:
                return new w7d[i];
            case 22:
                return new lga[i];
            case 23:
                return new mu8[i];
            case 24:
                return new ku8[i];
            case 25:
                return new myb[i];
            case 26:
                return new p8d[i];
            case 27:
                return new nu8[i];
            case 28:
                return new ou8[i];
            default:
                return new pu8[i];
        }
    }
}
