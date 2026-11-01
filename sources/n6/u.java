package n6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new m8.i(12);
    public final int f13643a;
    public final Account f13644b;
    public final int f13645c;
    public final GoogleSignInAccount d;

    public u(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f13643a = i10;
        this.f13644b = account;
        this.f13645c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f13643a);
        w7.h0.k(parcel, 2, this.f13644b, i10);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.f13645c);
        w7.h0.k(parcel, 4, this.d, i10);
        w7.h0.r(parcel, q6);
    }
}
