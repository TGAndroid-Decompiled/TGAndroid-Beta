package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f3115a;
    public final byte f3116b;
    public final String f3117c;

    public v0(byte b10, byte b11, String str) {
        this.f3115a = b10;
        this.f3116b = b11;
        this.f3117c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f3115a == v0Var.f3115a && this.f3116b == v0Var.f3116b && this.f3117c.equals(v0Var.f3117c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3117c.hashCode() + ((((this.f3115a + 31) * 31) + this.f3116b) * 31);
    }

    public final String toString() {
        return a8.p0.s(jg.g.o("AmsEntityUpdateParcelable{, mEntityId=", this.f3115a, ", mAttributeId=", this.f3116b, ", mValue='"), this.f3117c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.f3115a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f3116b);
        xb.l(parcel, 4, this.f3117c);
        xb.s(parcel, r10);
    }
}
