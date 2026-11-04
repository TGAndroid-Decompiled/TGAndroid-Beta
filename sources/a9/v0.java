package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class v0 extends q6.a {
    public static final Parcelable.Creator<v0> CREATOR = new n0(8);
    public final byte f262a;
    public final byte f263b;
    public final String f264c;

    public v0(byte b10, byte b11, String str) {
        this.f262a = b10;
        this.f263b = b11;
        this.f264c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f262a == v0Var.f262a && this.f263b == v0Var.f263b && this.f264c.equals(v0Var.f264c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f264c.hashCode() + ((((this.f262a + 31) * 31) + this.f263b) * 31);
    }

    public final String toString() {
        return a1.g.s(com.google.android.recaptcha.internal.a.m("AmsEntityUpdateParcelable{, mEntityId=", this.f262a, ", mAttributeId=", this.f263b, ", mValue='"), this.f264c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f262a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f263b);
        j8.a.m(parcel, 4, this.f264c);
        j8.a.t(parcel, s6);
    }
}
