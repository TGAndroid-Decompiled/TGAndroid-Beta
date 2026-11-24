package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class j3d extends b4 {
    public static final Parcelable.Creator<j3d> CREATOR = new b1d((byte) 14);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public j3d(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.k(parcel, 2, this.b, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        jte.k(parcel, 4, this.d, i);
        jte.s(parcel, r);
    }
}
