package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class w0 extends c6.a implements l8.l {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f13591a;
    public final byte f13592b;
    public final String f13593c;

    public w0(byte b10, byte b11, String str) {
        this.f13591a = b10;
        this.f13592b = b11;
        this.f13593c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f13591a == w0Var.f13591a && this.f13592b == w0Var.f13592b && this.f13593c.equals(w0Var.f13593c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13593c.hashCode() + ((((this.f13591a + 31) * 31) + this.f13592b) * 31);
    }

    public final String toString() {
        return android.support.v4.media.a.r(e2.c.m("AmsEntityUpdateParcelable{, mEntityId=", this.f13591a, ", mAttributeId=", this.f13592b, ", mValue='"), this.f13593c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13591a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13592b);
        g5.l(parcel, 4, this.f13593c);
        g5.r(parcel, q10);
    }
}
