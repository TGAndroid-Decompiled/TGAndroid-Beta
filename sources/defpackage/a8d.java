package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class a8d extends c4 {
    public static final Parcelable.Creator<a8d> CREATOR = new s5d((byte) 14);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public a8d(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 2, this.b, i);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        bye.k(parcel, 4, this.d, i);
        bye.s(parcel, r);
    }
}
