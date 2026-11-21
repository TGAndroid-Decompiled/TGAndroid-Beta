package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class m0 extends r6.a {
    public static final Parcelable.Creator<m0> CREATOR = new c(29);
    public final String f3042a;
    public final String f3043b;
    public final int f3044c;
    public final boolean d;

    public m0(int i7, String str, String str2, boolean z10) {
        this.f3042a = str;
        this.f3043b = str2;
        this.f3044c = i7;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        return ((m0) obj).f3042a.equals(this.f3042a);
    }

    public final int hashCode() {
        return this.f3042a.hashCode();
    }

    public final String toString() {
        StringBuilder n10 = e2.n("Node{", this.f3043b, ", id=", this.f3042a, ", hops=");
        n10.append(this.f3044c);
        n10.append(", isNearby=");
        n10.append(this.d);
        n10.append("}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f3042a);
        bc.l(parcel, 3, this.f3043b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f3044c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }
}
