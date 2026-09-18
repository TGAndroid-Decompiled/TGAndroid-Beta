package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f15194a;
    public final String f15195b;

    public d(int i10, String str) {
        this.f15194a = i10;
        this.f15195b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f15194a == this.f15194a && l.l(dVar.f15195b, this.f15195b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15194a;
    }

    public final String toString() {
        return this.f15194a + ":" + this.f15195b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f15194a);
        w7.f0.l(parcel, 2, this.f15195b);
        w7.f0.r(parcel, q6);
    }
}
