package defpackage;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
public final class rhe implements Parcelable.Creator {
    public final byte a;

    public rhe(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhe.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zi6[i];
            case 1:
                return new ice[i];
            case 2:
                return new se0[i];
            case 3:
                return new dg6[i];
            case 4:
                return new lce[i];
            case 5:
                return new zre[i];
            case 6:
                return new qhe[i];
            case 7:
                return new my7[i];
            case 8:
                return new no9[i];
            case 9:
                return new re0[i];
            case 10:
                return new cg6[i];
            case 11:
                return new the[i];
            case 12:
                return new z40[i];
            case 13:
                return new vhe[i];
            case 14:
                return new qme[i];
            case 15:
                return new ue0[i];
            case 16:
                return new phb[i];
            case 17:
                return new xme[i];
            case 18:
                return new a50[i];
            case 19:
                return new bne[i];
            case 20:
                return new ase[i];
            case 21:
                return new te0[i];
            case 22:
                return new FullWallet[i];
            case 23:
                return new pnb[i];
            case 24:
                return new fs2[i];
            case 25:
                return new b50[i];
            case 26:
                return new fse[i];
            case 27:
                return new we0[i];
            case 28:
                return new LandmarkParcel[i];
            default:
                return new r6c[i];
        }
    }
}
