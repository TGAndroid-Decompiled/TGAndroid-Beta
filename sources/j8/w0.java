package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class w0 extends z5.a implements i8.l {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);

    public final byte f12850a;

    public final byte f12851b;

    public final String f12852c;

    public w0(byte b10, byte b11, String str) {
        this.f12850a = b10;
        this.f12851b = b11;
        this.f12852c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f12850a == w0Var.f12850a && this.f12851b == w0Var.f12851b && this.f12852c.equals(w0Var.f12852c);
    }

    public final int hashCode() {
        return this.f12852c.hashCode() + ((((this.f12850a + 31) * 31) + this.f12851b) * 31);
    }

    public final String toString() {
        return a9.p.p(com.google.android.recaptcha.internal.a.p("AmsEntityUpdateParcelable{, mEntityId=", this.f12850a, ", mAttributeId=", this.f12851b, ", mValue='"), this.f12852c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12850a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12851b);
        r8.l(parcel, 4, this.f12852c);
        r8.r(parcel, iQ);
    }
}
