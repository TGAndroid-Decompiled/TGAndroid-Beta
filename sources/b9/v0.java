package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f3038a;
    public final byte f3039b;
    public final String f3040c;

    public v0(byte b10, byte b11, String str) {
        this.f3038a = b10;
        this.f3039b = b11;
        this.f3040c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f3038a == v0Var.f3038a && this.f3039b == v0Var.f3039b && this.f3040c.equals(v0Var.f3040c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3040c.hashCode() + ((((this.f3038a + 31) * 31) + this.f3039b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3038a, ", mAttributeId=", this.f3039b, ", mValue='"), this.f3040c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3038a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3039b);
        cc.l(parcel, 4, this.f3040c);
        cc.s(parcel, r10);
    }
}
