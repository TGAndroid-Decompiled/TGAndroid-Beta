package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class go7 extends b4 {
    public static final Parcelable.Creator<go7> CREATOR = new xff((byte) 3);
    public final int a;
    public final String b;
    public final CommonWalletObject c;

    public go7(int i, String str, String str2, CommonWalletObject commonWalletObject) {
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 3, this.b);
        jte.k(parcel, 4, this.c, i);
        jte.s(parcel, r);
    }
}
