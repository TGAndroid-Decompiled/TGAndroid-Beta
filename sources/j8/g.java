package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import j7.f5;
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new t(9);
    public final int f9249a;
    public final String f9250b;
    public final CommonWalletObject f9251c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f9249a = i10;
        this.f9250b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f3805a = str;
            this.f9251c = commonWalletObject2;
            return;
        }
        this.f9251c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f9249a);
        f5.l(parcel, 3, this.f9250b);
        f5.k(parcel, 4, this.f9251c, i10);
        f5.r(parcel, q10);
    }
}
