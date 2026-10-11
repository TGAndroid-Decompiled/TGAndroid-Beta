package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f16709a;
    public final String f16710b;

    public d(int i10, String str) {
        this.f16709a = i10;
        this.f16710b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f16709a == this.f16709a && m.l(dVar.f16710b, this.f16710b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16709a;
    }

    public final String toString() {
        return this.f16709a + ":" + this.f16710b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16709a);
        w7.d0.l(parcel, 2, this.f16710b);
        w7.d0.r(parcel, q6);
    }
}
