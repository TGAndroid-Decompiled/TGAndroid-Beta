package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import j7.f5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new t(9);
    public final int f9267a;
    public final String f9268b;
    public final CommonWalletObject f9269c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f9267a = i10;
        this.f9268b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f3822a = str;
            this.f9269c = commonWalletObject2;
            return;
        }
        this.f9269c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f9267a);
        f5.l(parcel, 3, this.f9268b);
        f5.k(parcel, 4, this.f9269c, i10);
        f5.r(parcel, q10);
    }
}
