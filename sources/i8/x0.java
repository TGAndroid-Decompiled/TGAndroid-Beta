package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class x0 extends y5.a implements h8.l {
    public static final Parcelable.Creator<x0> CREATOR = new p0(8);
    public final byte f11055a;
    public final byte f11056b;
    public final String f11057c;

    public x0(byte b10, byte b11, String str) {
        this.f11055a = b10;
        this.f11056b = b11;
        this.f11057c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f11055a == x0Var.f11055a && this.f11056b == x0Var.f11056b && this.f11057c.equals(x0Var.f11057c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11057c.hashCode() + ((((this.f11055a + 31) * 31) + this.f11056b) * 31);
    }

    public final String toString() {
        return aa.d.r(e2.c.o("AmsEntityUpdateParcelable{, mEntityId=", this.f11055a, ", mAttributeId=", this.f11056b, ", mValue='"), this.f11057c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11055a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f11056b);
        p8.l(parcel, 4, this.f11057c);
        p8.r(parcel, q10);
    }
}
