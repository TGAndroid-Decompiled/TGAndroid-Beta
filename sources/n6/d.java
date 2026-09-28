package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f15237a;
    public final String f15238b;

    public d(int i10, String str) {
        this.f15237a = i10;
        this.f15238b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f15237a == this.f15237a && l.l(dVar.f15238b, this.f15238b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15237a;
    }

    public final String toString() {
        return this.f15237a + ":" + this.f15238b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f15237a);
        w7.f0.l(parcel, 2, this.f15238b);
        w7.f0.r(parcel, q6);
    }
}
