package n6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new m8.h(15);
    public final int f16471a;
    public final Account f16472b;
    public final int f16473c;
    public final GoogleSignInAccount d;

    public v(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f16471a = i10;
        this.f16472b = account;
        this.f16473c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16471a);
        w7.c0.k(parcel, 2, this.f16472b, i10);
        w7.c0.s(parcel, 3, 4);
        parcel.writeInt(this.f16473c);
        w7.c0.k(parcel, 4, this.d, i10);
        w7.c0.r(parcel, q6);
    }
}
