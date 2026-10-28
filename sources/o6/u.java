package o6;

import a8.df;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class u extends p6.a {
    public static final Parcelable.Creator<u> CREATOR = new n4.x(13);
    public final int f19183a;
    public final Account f19184b;
    public final int f19185c;
    public final GoogleSignInAccount d;

    public u(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f19183a = i10;
        this.f19184b = account;
        this.f19185c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19183a);
        df.k(parcel, 2, this.f19184b, i10);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f19185c);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
