package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f16659a;
    public final String f16660b;

    public d(int i10, String str) {
        this.f16659a = i10;
        this.f16660b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f16659a == this.f16659a && l.l(dVar.f16660b, this.f16660b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16659a;
    }

    public final String toString() {
        return this.f16659a + ":" + this.f16660b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f16659a);
        w7.g0.l(parcel, 2, this.f16660b);
        w7.g0.r(parcel, q6);
    }
}
