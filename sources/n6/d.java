package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(10);
    public final int f17157a;
    public final String f17158b;

    public d(int i10, String str) {
        this.f17157a = i10;
        this.f17158b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f17157a == this.f17157a && l.l(dVar.f17158b, this.f17158b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17157a;
    }

    public final String toString() {
        return this.f17157a + ":" + this.f17158b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f17157a);
        w7.f0.l(parcel, 2, this.f17158b);
        w7.f0.r(parcel, q6);
    }
}
