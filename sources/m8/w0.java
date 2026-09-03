package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class w0 extends c6.a implements l8.l {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte f13857a;
    public final byte f13858b;
    public final String f13859c;

    public w0(byte b10, byte b11, String str) {
        this.f13857a = b10;
        this.f13858b = b11;
        this.f13859c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f13857a == w0Var.f13857a && this.f13858b == w0Var.f13858b && this.f13859c.equals(w0Var.f13859c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13859c.hashCode() + ((((this.f13857a + 31) * 31) + this.f13858b) * 31);
    }

    public final String toString() {
        return android.support.v4.media.a.r(e2.c.m("AmsEntityUpdateParcelable{, mEntityId=", this.f13857a, ", mAttributeId=", this.f13858b, ", mValue='"), this.f13859c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13857a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13858b);
        f5.l(parcel, 4, this.f13859c);
        f5.r(parcel, q10);
    }
}
