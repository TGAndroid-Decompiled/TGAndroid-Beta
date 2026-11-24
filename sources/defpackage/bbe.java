package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class bbe extends b4 {
    public static final Parcelable.Creator<bbe> CREATOR = new t0e((byte) 13);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public bbe(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbe)) {
            return false;
        }
        return ((bbe) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder m = mlb.m("Node{", this.b, ", id=", this.a, ", hops=");
        m.append(this.c);
        m.append(", isNearby=");
        m.append(this.d);
        m.append("}");
        return m.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.s(parcel, r);
    }
}
