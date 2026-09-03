package b6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j7.f5;
public final class v extends c6.a {
    public static final Parcelable.Creator<v> CREATOR = new w.a(22);
    public final int f1662a;
    public final Account f1663b;
    public final int f1664c;
    public final GoogleSignInAccount d;

    public v(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f1662a = i10;
        this.f1663b = account;
        this.f1664c = i11;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f1662a);
        f5.k(parcel, 2, this.f1663b, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f1664c);
        f5.k(parcel, 4, this.d, i10);
        f5.r(parcel, q10);
    }
}
