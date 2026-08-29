package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class x0 extends a6.a implements j8.l {
    public static final Parcelable.Creator<x0> CREATOR = new p0(8);
    public final byte f13578a;
    public final byte f13579b;
    public final String f13580c;

    public x0(byte b10, byte b11, String str) {
        this.f13578a = b10;
        this.f13579b = b11;
        this.f13580c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f13578a == x0Var.f13578a && this.f13579b == x0Var.f13579b && this.f13580c.equals(x0Var.f13580c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13580c.hashCode() + ((((this.f13578a + 31) * 31) + this.f13579b) * 31);
    }

    public final String toString() {
        return a4.w.q(com.google.android.recaptcha.internal.a.o("AmsEntityUpdateParcelable{, mEntityId=", this.f13578a, ", mAttributeId=", this.f13579b, ", mValue='"), this.f13580c, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13578a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13579b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.f13580c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
