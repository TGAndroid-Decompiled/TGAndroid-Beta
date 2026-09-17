package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f15019a;
    public final String f15020b;

    public d(int i10, String str) {
        this.f15019a = i10;
        this.f15020b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f15019a == this.f15019a && l.l(dVar.f15020b, this.f15020b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15019a;
    }

    public final String toString() {
        return this.f15019a + ":" + this.f15020b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f15019a);
        w7.e0.l(parcel, 2, this.f15020b);
        w7.e0.r(parcel, q6);
    }
}
