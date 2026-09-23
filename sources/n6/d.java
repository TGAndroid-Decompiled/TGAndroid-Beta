package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f14984a;
    public final String f14985b;

    public d(int i10, String str) {
        this.f14984a = i10;
        this.f14985b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f14984a == this.f14984a && l.l(dVar.f14985b, this.f14985b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14984a;
    }

    public final String toString() {
        return this.f14984a + ":" + this.f14985b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f14984a);
        w7.e0.l(parcel, 2, this.f14985b);
        w7.e0.r(parcel, q6);
    }
}
