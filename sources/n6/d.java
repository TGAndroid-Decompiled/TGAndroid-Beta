package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f16511a;
    public final String f16512b;

    public d(int i10, String str) {
        this.f16511a = i10;
        this.f16512b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f16511a == this.f16511a && l.l(dVar.f16512b, this.f16512b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16511a;
    }

    public final String toString() {
        return this.f16511a + ":" + this.f16512b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16511a);
        w7.e0.l(parcel, 2, this.f16512b);
        w7.e0.r(parcel, q6);
    }
}
