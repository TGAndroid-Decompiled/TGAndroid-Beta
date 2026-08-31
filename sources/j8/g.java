package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import j7.g5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new t(9);
    public final int f9895a;
    public final String f9896b;
    public final CommonWalletObject f9897c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f9895a = i10;
        this.f9896b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f3856a = str;
            this.f9897c = commonWalletObject2;
            return;
        }
        this.f9897c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f9895a);
        g5.l(parcel, 3, this.f9896b);
        g5.k(parcel, 4, this.f9897c, i10);
        g5.r(parcel, q10);
    }
}
