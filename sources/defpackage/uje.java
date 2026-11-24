package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class uje extends b4 {
    public static final Parcelable.Creator<uje> CREATOR = new sje((byte) 11);
    public final byte a;
    public final byte b;
    public final String c;

    public uje(byte b, byte b2, String str) {
        this.a = b;
        this.b = b2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uje.class != obj.getClass()) {
            return false;
        }
        uje ujeVar = (uje) obj;
        if (this.a == ujeVar.a && this.b == ujeVar.b && this.c.equals(ujeVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    public final String toString() {
        return b10.j(ts2.o("AmsEntityUpdateParcelable{, mEntityId=", this.a, ", mAttributeId=", this.b, ", mValue='"), this.c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.l(parcel, 4, this.c);
        mve.s(parcel, r);
    }
}
