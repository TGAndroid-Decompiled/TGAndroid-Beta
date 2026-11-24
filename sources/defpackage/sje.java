package defpackage;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
public final class sje implements Parcelable.Creator {
    public final byte a;

    public sje(byte b) {
        this.a = b;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sje.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cl6[i];
            case 1:
                return new jee[i];
            case 2:
                return new sf0[i];
            case 3:
                return new di6[i];
            case 4:
                return new mee[i];
            case 5:
                return new cue[i];
            case 6:
                return new rje[i];
            case 7:
                return new o08[i];
            case 8:
                return new oq9[i];
            case 9:
                return new rf0[i];
            case 10:
                return new ci6[i];
            case 11:
                return new uje[i];
            case 12:
                return new z50[i];
            case 13:
                return new wje[i];
            case 14:
                return new toe[i];
            case 15:
                return new uf0[i];
            case 16:
                return new qjb[i];
            case 17:
                return new ape[i];
            case 18:
                return new a60[i];
            case 19:
                return new epe[i];
            case 20:
                return new due[i];
            case 21:
                return new tf0[i];
            case 22:
                return new FullWallet[i];
            case 23:
                return new qpb[i];
            case 24:
                return new qt2[i];
            case 25:
                return new b60[i];
            case 26:
                return new iue[i];
            case 27:
                return new wf0[i];
            case 28:
                return new LandmarkParcel[i];
            default:
                return new s8c[i];
        }
    }
}
