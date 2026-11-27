package defpackage;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
public final class ime implements Parcelable.Creator {
    public final byte a;

    public ime(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ime.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new el6[i];
            case 1:
                return new yge[i];
            case 2:
                return new ue0[i];
            case 3:
                return new hi6[i];
            case 4:
                return new bhe[i];
            case 5:
                return new qwe[i];
            case 6:
                return new hme[i];
            case 7:
                return new s18[i];
            case 8:
                return new fs9[i];
            case 9:
                return new te0[i];
            case 10:
                return new gi6[i];
            case 11:
                return new kme[i];
            case 12:
                return new b50[i];
            case 13:
                return new mme[i];
            case 14:
                return new hre[i];
            case 15:
                return new we0[i];
            case 16:
                return new llb[i];
            case 17:
                return new ore[i];
            case 18:
                return new c50[i];
            case 19:
                return new sre[i];
            case 20:
                return new rwe[i];
            case 21:
                return new ve0[i];
            case 22:
                return new FullWallet[i];
            case 23:
                return new prb[i];
            case 24:
                return new ys2[i];
            case 25:
                return new d50[i];
            case 26:
                return new wwe[i];
            case 27:
                return new ye0[i];
            case 28:
                return new LandmarkParcel[i];
            default:
                return new rac[i];
        }
    }
}
