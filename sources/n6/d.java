package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f16627a;
    public final String f16628b;

    public d(int i10, String str) {
        this.f16627a = i10;
        this.f16628b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f16627a == this.f16627a && l.l(dVar.f16628b, this.f16628b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16627a;
    }

    public final String toString() {
        return this.f16627a + ":" + this.f16628b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.s(parcel, 1, 4);
        parcel.writeInt(this.f16627a);
        w7.d0.l(parcel, 2, this.f16628b);
        w7.d0.r(parcel, q6);
    }
}
