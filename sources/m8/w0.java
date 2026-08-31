package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class w0 extends c6.a implements l8.l {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f13589a;
    public final byte f13590b;
    public final String f13591c;

    public w0(byte b10, byte b11, String str) {
        this.f13589a = b10;
        this.f13590b = b11;
        this.f13591c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f13589a == w0Var.f13589a && this.f13590b == w0Var.f13590b && this.f13591c.equals(w0Var.f13591c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13591c.hashCode() + ((((this.f13589a + 31) * 31) + this.f13590b) * 31);
    }

    public final String toString() {
        return android.support.v4.media.a.r(e2.c.m("AmsEntityUpdateParcelable{, mEntityId=", this.f13589a, ", mAttributeId=", this.f13590b, ", mValue='"), this.f13591c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13589a);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f13590b);
        g5.l(parcel, 4, this.f13591c);
        g5.r(parcel, q10);
    }
}
