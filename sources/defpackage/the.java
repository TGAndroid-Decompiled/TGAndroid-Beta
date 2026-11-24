package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class the extends b4 {
    public static final Parcelable.Creator<the> CREATOR = new rhe((byte) 11);
    public final byte a;
    public final byte b;
    public final String c;

    public the(byte b, byte b2, String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || the.class != obj.getClass()) {
            return false;
        }
        the theVar = (the) obj;
        if (this.a == theVar.a && this.b == theVar.b && this.c.equals(theVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    public final String toString() {
        return b00.j(ir2.p("AmsEntityUpdateParcelable{, mEntityId=", this.a, ", mAttributeId=", this.b, ", mValue='"), this.c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.l(parcel, 4, this.c);
        jte.s(parcel, r);
    }
}
