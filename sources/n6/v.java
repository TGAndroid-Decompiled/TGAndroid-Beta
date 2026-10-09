package n6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(15);
    public final int f16722a;
    public final Account f16723b;
    public final int f16724c;
    public final GoogleSignInAccount d;

    public v(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f16722a = i10;
        this.f16723b = account;
        this.f16724c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16722a);
        w7.d0.k(parcel, 2, this.f16723b, i10);
        w7.d0.s(parcel, 3, 4);
        parcel.writeInt(this.f16724c);
        w7.d0.k(parcel, 4, this.d, i10);
        w7.d0.r(parcel, q6);
    }
}
