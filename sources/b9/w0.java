package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f3043a;
    public final byte f3044b;
    public final String f3045c;

    public w0(byte b10, byte b11, String str) {
        this.f3043a = b10;
        this.f3044b = b11;
        this.f3045c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f3043a == w0Var.f3043a && this.f3044b == w0Var.f3044b && this.f3045c.equals(w0Var.f3045c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3045c.hashCode() + ((((this.f3043a + 31) * 31) + this.f3044b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3043a, ", mAttributeId=", this.f3044b, ", mValue='"), this.f3045c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f3043a);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.f3044b);
        cc.l(parcel, 4, this.f3045c);
        cc.s(parcel, r10);
    }
}
