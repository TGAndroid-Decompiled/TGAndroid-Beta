package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f3078a;
    public final byte f3079b;
    public final String f3080c;

    public w0(byte b10, byte b11, String str) {
        this.f3078a = b10;
        this.f3079b = b11;
        this.f3080c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f3078a == w0Var.f3078a && this.f3079b == w0Var.f3079b && this.f3080c.equals(w0Var.f3080c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3080c.hashCode() + ((((this.f3078a + 31) * 31) + this.f3079b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3078a, ", mAttributeId=", this.f3079b, ", mValue='"), this.f3080c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3078a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.f3079b);
        yb.l(parcel, 4, this.f3080c);
        yb.s(parcel, r10);
    }
}
