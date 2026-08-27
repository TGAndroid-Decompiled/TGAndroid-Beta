package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class m0 extends z5.a implements i8.h {
    public static final Parcelable.Creator<m0> CREATOR = new c(29);

    public final String f12807a;

    public final String f12808b;

    public final int f12809c;
    public final boolean d;

    public m0(int i10, String str, String str2, boolean z10) {
        this.f12807a = str;
        this.f12808b = str2;
        this.f12809c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            return ((m0) obj).f12807a.equals(this.f12807a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12807a.hashCode();
    }

    public final String toString() {
        StringBuilder sbP = i0.a.p("Node{", this.f12808b, ", id=", this.f12807a, ", hops=");
        sbP.append(this.f12809c);
        sbP.append(", isNearby=");
        sbP.append(this.d);
        sbP.append("}");
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f12807a);
        r8.l(parcel, 3, this.f12808b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f12809c);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
