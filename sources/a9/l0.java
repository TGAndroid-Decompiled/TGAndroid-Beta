package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class l0 extends q6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String f219a;
    public final String f220b;
    public final int f221c;
    public final boolean d;

    public l0(int i3, String str, String str2, boolean z10) {
        this.f219a = str;
        this.f220b = str2;
        this.f221c = i3;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        return ((l0) obj).f219a.equals(this.f219a);
    }

    public final int hashCode() {
        return this.f219a.hashCode();
    }

    public final String toString() {
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("Node{", this.f220b, ", id=", this.f219a, ", hops=");
        n4.append(this.f221c);
        n4.append(", isNearby=");
        n4.append(this.d);
        n4.append("}");
        return n4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f219a);
        j8.a.m(parcel, 3, this.f220b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f221c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
