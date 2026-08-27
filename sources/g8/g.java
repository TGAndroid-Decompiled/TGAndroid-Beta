package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import h7.r8;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new f4.e(26);

    public final int f6741a;

    public final String f6742b;

    public final CommonWalletObject f6743c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f6741a = i10;
        this.f6742b = str2;
        if (i10 >= 3) {
            this.f6743c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.f4387a = str;
        this.f6743c = commonWalletObject2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f6741a);
        r8.l(parcel, 3, this.f6742b);
        r8.k(parcel, 4, this.f6743c, i10);
        r8.r(parcel, iQ);
    }
}
