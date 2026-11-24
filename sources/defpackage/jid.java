package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
public final class jid implements Parcelable.Creator {
    public final byte a;

    public jid(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jid.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new did[i];
            case 1:
                return new et6[i];
            case 2:
                return new vi2[i];
            case 3:
                return new le5[i];
            case 4:
                return new w6d[i];
            case 5:
                return new CommonWalletObject[i];
            case 6:
                return new uq2[i];
            case 7:
                return new x50[i];
            case 8:
                return new aa[i];
            case 9:
                return new gt6[i];
            case 10:
                return new dkd[i];
            case 11:
                return new it6[i];
            case 12:
                return new yt6[i];
            case 13:
                return new tkd[i];
            case 14:
                return new zt6[i];
            case 15:
                return new au6[i];
            case 16:
                return new f07[i];
            case 17:
                return new MediaTrack[i];
            case 18:
                return new uid[i];
            case 19:
                return new c64[i];
            case 20:
                return new mf0[i];
            case 21:
                return new FaceParcel[i];
            case 22:
                return new ty5[i];
            case 23:
                return new ConnectionConfiguration[i];
            case 24:
                return new gjd[i];
            case 25:
                return new Scope[i];
            case 26:
                return new w50[i];
            case 27:
                return new ws[i];
            case 28:
                return new mqd[i];
            default:
                return new DataItemAssetParcelable[i];
        }
    }
}
