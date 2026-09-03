package d7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new b9.e(7);
    public final g[] f4207a;
    public final String f4208b;
    public final boolean f4209c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z4, Account account) {
        this.f4207a = gVarArr;
        this.f4208b = str;
        this.f4209c = z4;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (b6.m.l(this.f4208b, eVar.f4208b) && b6.m.l(Boolean.valueOf(this.f4209c), Boolean.valueOf(eVar.f4209c)) && b6.m.l(this.d, eVar.d) && Arrays.equals(this.f4207a, eVar.f4207a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4208b, Boolean.valueOf(this.f4209c), this.d, Integer.valueOf(Arrays.hashCode(this.f4207a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.o(parcel, 1, this.f4207a, i10);
        f5.l(parcel, 2, this.f4208b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f4209c ? 1 : 0);
        f5.k(parcel, 4, this.d, i10);
        f5.r(parcel, q10);
    }
}
