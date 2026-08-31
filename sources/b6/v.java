package b6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j7.g5;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new w.a(22);
    public final int f1786a;
    public final Account f1787b;
    public final int f1788c;
    public final GoogleSignInAccount d;

    public v(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f1786a = i10;
        this.f1787b = account;
        this.f1788c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f1786a);
        g5.k(parcel, 2, this.f1787b, i10);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f1788c);
        g5.k(parcel, 4, this.d, i10);
        g5.r(parcel, q10);
    }
}
