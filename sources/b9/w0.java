package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f3092a;
    public final byte f3093b;
    public final String f3094c;

    public w0(byte b10, byte b11, String str) {
        this.f3092a = b10;
        this.f3093b = b11;
        this.f3094c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f3092a == w0Var.f3092a && this.f3093b == w0Var.f3093b && this.f3094c.equals(w0Var.f3094c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3094c.hashCode() + ((((this.f3092a + 31) * 31) + this.f3093b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3092a, ", mAttributeId=", this.f3093b, ", mValue='"), this.f3094c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3092a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3093b);
        bc.l(parcel, 4, this.f3094c);
        bc.s(parcel, r10);
    }
}
