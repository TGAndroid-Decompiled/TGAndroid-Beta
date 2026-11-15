package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f3075a;
    public final byte f3076b;
    public final String f3077c;

    public w0(byte b10, byte b11, String str) {
        this.f3075a = b10;
        this.f3076b = b11;
        this.f3077c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f3075a == w0Var.f3075a && this.f3076b == w0Var.f3076b && this.f3077c.equals(w0Var.f3077c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3077c.hashCode() + ((((this.f3075a + 31) * 31) + this.f3076b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3075a, ", mAttributeId=", this.f3076b, ", mValue='"), this.f3077c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3075a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3076b);
        yb.l(parcel, 4, this.f3077c);
        yb.s(parcel, r10);
    }
}
