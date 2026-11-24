package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
public final class l5d extends b4 {
    public static final Parcelable.Creator<l5d> CREATOR = new d3d((byte) 14);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public l5d(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 2, this.b, i);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c);
        mve.k(parcel, 4, this.d, i);
        mve.s(parcel, r);
    }
}
