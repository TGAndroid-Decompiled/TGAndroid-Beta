package d7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Arrays;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new b9.e(7);
    public final g[] f4226a;
    public final String f4227b;
    public final boolean f4228c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z4, Account account) {
        this.f4226a = gVarArr;
        this.f4227b = str;
        this.f4228c = z4;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (b6.m.l(this.f4227b, eVar.f4227b) && b6.m.l(Boolean.valueOf(this.f4228c), Boolean.valueOf(eVar.f4228c)) && b6.m.l(this.d, eVar.d) && Arrays.equals(this.f4226a, eVar.f4226a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4227b, Boolean.valueOf(this.f4228c), this.d, Integer.valueOf(Arrays.hashCode(this.f4226a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.o(parcel, 1, this.f4226a, i10);
        f5.l(parcel, 2, this.f4227b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f4228c ? 1 : 0);
        f5.k(parcel, 4, this.d, i10);
        f5.r(parcel, q10);
    }
}
