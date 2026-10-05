package n6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new m8.h(15);
    public final int f16754a;
    public final Account f16755b;
    public final int f16756c;
    public final GoogleSignInAccount d;

    public u(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f16754a = i10;
        this.f16755b = account;
        this.f16756c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16754a);
        w7.g0.k(parcel, 2, this.f16755b, i10);
        w7.g0.s(parcel, 3, 4);
        parcel.writeInt(this.f16756c);
        w7.g0.k(parcel, 4, this.d, i10);
        w7.g0.r(parcel, q6);
    }
}
