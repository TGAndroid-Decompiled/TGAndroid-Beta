package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f3072a;
    public final byte f3073b;
    public final String f3074c;

    public w0(byte b10, byte b11, String str) {
        this.f3072a = b10;
        this.f3073b = b11;
        this.f3074c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f3072a == w0Var.f3072a && this.f3073b == w0Var.f3073b && this.f3074c.equals(w0Var.f3074c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3074c.hashCode() + ((((this.f3072a + 31) * 31) + this.f3073b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3072a, ", mAttributeId=", this.f3073b, ", mValue='"), this.f3074c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3072a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3073b);
        bc.l(parcel, 4, this.f3074c);
        bc.s(parcel, r10);
    }
}
