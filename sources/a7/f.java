package a7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new w.a(2);

    public final h[] f107a;

    public final String f108b;

    public final boolean f109c;
    public final Account d;

    public f(h[] hVarArr, String str, boolean z10, Account account) {
        this.f107a = hVarArr;
        this.f108b = str;
        this.f109c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (y5.l.l(this.f108b, fVar.f108b) && y5.l.l(Boolean.valueOf(this.f109c), Boolean.valueOf(fVar.f109c)) && y5.l.l(this.d, fVar.d) && Arrays.equals(this.f107a, fVar.f107a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f108b, Boolean.valueOf(this.f109c), this.d, Integer.valueOf(Arrays.hashCode(this.f107a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.o(parcel, 1, this.f107a, i10);
        r8.l(parcel, 2, this.f108b);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f109c ? 1 : 0);
        r8.k(parcel, 4, this.d, i10);
        r8.r(parcel, iQ);
    }
}
