package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class v5e extends b4 {
    public static final Parcelable.Creator<v5e> CREATOR = new qyd((byte) 19);
    public final fse[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public v5e(fse[] fseVarArr, String str, boolean z, Account account) {
        this.a = fseVarArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v5e) {
            v5e v5eVar = (v5e) obj;
            if (cqe.a(this.b, v5eVar.b) && cqe.a(Boolean.valueOf(this.c), Boolean.valueOf(v5eVar.c)) && cqe.a(this.d, v5eVar.d) && Arrays.equals(this.a, v5eVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.o(parcel, 1, this.a, i);
        jte.l(parcel, 2, this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.k(parcel, 4, this.d, i);
        jte.s(parcel, r);
    }
}
