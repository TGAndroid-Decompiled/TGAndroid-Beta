package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class n0 extends y5.a implements h8.h {
    public static final Parcelable.Creator<n0> CREATOR = new c(29);
    public final String f11012a;
    public final String f11013b;
    public final int f11014c;
    public final boolean d;

    public n0(int i9, String str, String str2, boolean z10) {
        this.f11012a = str;
        this.f11013b = str2;
        this.f11014c = i9;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        return ((n0) obj).f11012a.equals(this.f11012a);
    }

    public final int hashCode() {
        return this.f11012a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = j3.r0.q("Node{", this.f11013b, ", id=", this.f11012a, ", hops=");
        q10.append(this.f11014c);
        q10.append(", isNearby=");
        q10.append(this.d);
        q10.append("}");
        return q10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f11012a);
        p8.l(parcel, 3, this.f11013b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f11014c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.r(parcel, q10);
    }
}
