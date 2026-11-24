package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class n23 extends b4 {
    public static final Parcelable.Creator<n23> CREATOR = new j9d((byte) 0);
    public final String a;
    public final String b;

    public n23(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n23)) {
            return false;
        }
        n23 n23Var = (n23) obj;
        if (cqe.a(this.a, n23Var.a) && cqe.a(this.b, n23Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.l(parcel, 2, this.b);
        jte.s(parcel, r);
    }
}
