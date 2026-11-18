package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f3073a;
    public final byte f3074b;
    public final String f3075c;

    public w0(byte b10, byte b11, String str) {
        this.f3073a = b10;
        this.f3074b = b11;
        this.f3075c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f3073a == w0Var.f3073a && this.f3074b == w0Var.f3074b && this.f3075c.equals(w0Var.f3075c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3075c.hashCode() + ((((this.f3073a + 31) * 31) + this.f3074b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3073a, ", mAttributeId=", this.f3074b, ", mValue='"), this.f3075c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3073a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3074b);
        bc.l(parcel, 4, this.f3075c);
        bc.s(parcel, r10);
    }
}
