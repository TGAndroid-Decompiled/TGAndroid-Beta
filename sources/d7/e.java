package d7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Arrays;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new b9.e(7);
    public final g[] f4298a;
    public final String f4299b;
    public final boolean f4300c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z4, Account account) {
        this.f4298a = gVarArr;
        this.f4299b = str;
        this.f4300c = z4;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (b6.m.l(this.f4299b, eVar.f4299b) && b6.m.l(Boolean.valueOf(this.f4300c), Boolean.valueOf(eVar.f4300c)) && b6.m.l(this.d, eVar.d) && Arrays.equals(this.f4298a, eVar.f4298a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4299b, Boolean.valueOf(this.f4300c), this.d, Integer.valueOf(Arrays.hashCode(this.f4298a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.o(parcel, 1, this.f4298a, i10);
        g5.l(parcel, 2, this.f4299b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f4300c ? 1 : 0);
        g5.k(parcel, 4, this.d, i10);
        g5.r(parcel, q10);
    }
}
