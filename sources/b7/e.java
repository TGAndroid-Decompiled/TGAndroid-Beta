package b7;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(16);
    public final g[] f1943a;
    public final String f1944b;
    public final boolean f1945c;
    public final Account d;

    public e(g[] gVarArr, String str, boolean z10, Account account) {
        this.f1943a = gVarArr;
        this.f1944b = str;
        this.f1945c = z10;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (z5.l.l(this.f1944b, eVar.f1944b) && z5.l.l(Boolean.valueOf(this.f1945c), Boolean.valueOf(eVar.f1945c)) && z5.l.l(this.d, eVar.d) && Arrays.equals(this.f1943a, eVar.f1943a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1944b, Boolean.valueOf(this.f1945c), this.d, Integer.valueOf(Arrays.hashCode(this.f1943a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.o(parcel, 1, this.f1943a, i10);
        o.l(parcel, 2, this.f1944b);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.f1945c ? 1 : 0);
        o.k(parcel, 4, this.d, i10);
        o.r(parcel, q6);
    }
}
