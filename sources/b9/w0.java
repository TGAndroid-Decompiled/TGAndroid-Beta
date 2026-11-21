package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f3085a;
    public final byte f3086b;
    public final String f3087c;

    public w0(byte b10, byte b11, String str) {
        this.f3085a = b10;
        this.f3086b = b11;
        this.f3087c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f3085a == w0Var.f3085a && this.f3086b == w0Var.f3086b && this.f3087c.equals(w0Var.f3087c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3087c.hashCode() + ((((this.f3085a + 31) * 31) + this.f3086b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.f3085a, ", mAttributeId=", this.f3086b, ", mValue='"), this.f3087c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3085a);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f3086b);
        bc.l(parcel, 4, this.f3087c);
        bc.s(parcel, r10);
    }
}
