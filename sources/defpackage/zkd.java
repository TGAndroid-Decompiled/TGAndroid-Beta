package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
public final class zkd implements Parcelable.Creator {
    public final byte a;

    public zkd(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tkd[i];
            case 1:
                return new it6[i];
            case 2:
                return new zh2[i];
            case 3:
                return new oe5[i];
            case 4:
                return new n9d[i];
            case 5:
                return new CommonWalletObject[i];
            case 6:
                return new cq2[i];
            case 7:
                return new z40[i];
            case 8:
                return new ba[i];
            case 9:
                return new kt6[i];
            case 10:
                return new tmd[i];
            case 11:
                return new mt6[i];
            case 12:
                return new cu6[i];
            case 13:
                return new ind[i];
            case 14:
                return new du6[i];
            case 15:
                return new eu6[i];
            case 16:
                return new j07[i];
            case 17:
                return new MediaTrack[i];
            case 18:
                return new kld[i];
            case 19:
                return new n54[i];
            case 20:
                return new oe0[i];
            case 21:
                return new FaceParcel[i];
            case 22:
                return new yy5[i];
            case 23:
                return new ConnectionConfiguration[i];
            case 24:
                return new wld[i];
            case 25:
                return new Scope[i];
            case 26:
                return new y40[i];
            case 27:
                return new xr[i];
            case 28:
                return new zsd[i];
            default:
                return new DataItemAssetParcelable[i];
        }
    }
}
