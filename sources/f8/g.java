package f8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import g7.p8;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new r(13);
    public final int f5940a;
    public final String f5941b;
    public final CommonWalletObject f5942c;

    public g(int i9, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f5940a = i9;
        this.f5941b = str2;
        if (i9 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f3945a = str;
            this.f5942c = commonWalletObject2;
            return;
        }
        this.f5942c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f5940a);
        p8.l(parcel, 3, this.f5941b);
        p8.k(parcel, 4, this.f5942c, i9);
        p8.r(parcel, q10);
    }
}
