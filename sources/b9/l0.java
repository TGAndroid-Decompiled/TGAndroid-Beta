package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f3072a;
    public final String f3073b;
    public final int f3074c;
    public final boolean d;

    public l0(int i7, String str, String str2, boolean z9) {
        this.f3072a = str;
        this.f3073b = str2;
        this.f3074c = i7;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f3072a.equals(this.f3072a);
    }

    public final int hashCode() {
        return this.f3072a.hashCode();
    }

    public final String toString() {
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Node{", this.f3073b, ", id=", this.f3072a, ", hops=");
        n10.append(this.f3074c);
        n10.append(", isNearby=");
        n10.append(this.d);
        n10.append("}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f3072a);
        xb.l(parcel, 3, this.f3073b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f3074c);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.s(parcel, r10);
    }
}
