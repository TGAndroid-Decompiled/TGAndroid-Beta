package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class jq7 extends b4 {
    public static final Parcelable.Creator<jq7> CREATOR = new yhf((byte) 3);
    public final int a;
    public final String b;
    public final CommonWalletObject c;

    public jq7(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i;
        this.b = str2;
        if (i < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.a = str;
            this.c = commonWalletObject2;
            return;
        }
        this.c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 3, this.b);
        mve.k(parcel, 4, this.c, i);
        mve.s(parcel, r);
    }
}
