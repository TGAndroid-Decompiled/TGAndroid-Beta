package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f2995a;
    public final String f2996b;
    public final int f2997c;
    public final boolean d;

    public l0(int i7, String str, String str2, boolean z10) {
        this.f2995a = str;
        this.f2996b = str2;
        this.f2997c = i7;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f2995a.equals(this.f2995a);
    }

    public final int hashCode() {
        return this.f2995a.hashCode();
    }

    public final String toString() {
        StringBuilder n10 = e2.n("Node{", this.f2996b, ", id=", this.f2995a, ", hops=");
        n10.append(this.f2997c);
        n10.append(", isNearby=");
        n10.append(this.d);
        n10.append("}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f2995a);
        cc.l(parcel, 3, this.f2996b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.f2997c);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.s(parcel, r10);
    }
}
