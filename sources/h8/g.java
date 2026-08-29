package h8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new g8.b(25);
    public final int f7888a;
    public final String f7889b;
    public final CommonWalletObject f7890c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f7888a = i10;
        this.f7889b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f4959a = str;
            this.f7890c = commonWalletObject2;
            return;
        }
        this.f7890c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f7888a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f7889b);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.f7890c, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
