package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class gr7 extends c4 {
    public static final Parcelable.Creator<gr7> CREATOR = new nkf((byte) 3);
    public final int a;
    public final String b;
    public final CommonWalletObject c;

    public gr7(int i, String str, String str2, CommonWalletObject commonWalletObject) {
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
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 3, this.b);
        bye.k(parcel, 4, this.c, i);
        bye.s(parcel, r);
    }
}
