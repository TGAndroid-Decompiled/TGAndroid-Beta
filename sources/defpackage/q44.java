package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class q44 extends b4 {
    public static final Parcelable.Creator<q44> CREATOR = new j9d((byte) 12);
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q44) {
            q44 q44Var = (q44) obj;
            if (cqe.a(this.a, q44Var.a) && cqe.a(this.b, q44Var.b)) {
                return true;
            }
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
