package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.i(9);
    public final int f13560a;
    public final String f13561b;

    public d(int i10, String str) {
        this.f13560a = i10;
        this.f13561b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f13560a == this.f13560a && l.k(dVar.f13561b, this.f13561b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13560a;
    }

    public final String toString() {
        return this.f13560a + ":" + this.f13561b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f13560a);
        w7.h0.l(parcel, 2, this.f13561b);
        w7.h0.r(parcel, q6);
    }
}
