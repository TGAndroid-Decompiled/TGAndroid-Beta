package defpackage;

import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
public final class igd implements Parcelable.Creator {
    public final byte a;

    public igd(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igd.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cgd[i];
            case 1:
                return new er6[i];
            case 2:
                return new hh2[i];
            case 3:
                return new nc5[i];
            case 4:
                return new u4d[i];
            case 5:
                return new CommonWalletObject[i];
            case 6:
                return new jp2[i];
            case 7:
                return new x40[i];
            case 8:
                return new aa[i];
            case 9:
                return new gr6[i];
            case 10:
                return new cid[i];
            case 11:
                return new ir6[i];
            case 12:
                return new xr6[i];
            case 13:
                return new rid[i];
            case 14:
                return new yr6[i];
            case 15:
                return new zr6[i];
            case 16:
                return new fy6[i];
            case 17:
                return new MediaTrack[i];
            case 18:
                return new tgd[i];
            case 19:
                return new r44[i];
            case 20:
                return new me0[i];
            case 21:
                return new FaceParcel[i];
            case 22:
                return new tw5[i];
            case 23:
                return new ConnectionConfiguration[i];
            case 24:
                return new fhd[i];
            case 25:
                return new Scope[i];
            case 26:
                return new w40[i];
            case 27:
                return new wr[i];
            case 28:
                return new jod[i];
            default:
                return new DataItemAssetParcelable[i];
        }
    }
}
