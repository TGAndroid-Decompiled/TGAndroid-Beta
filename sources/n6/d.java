package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f16377a;
    public final String f16378b;

    public d(int i10, String str) {
        this.f16377a = i10;
        this.f16378b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f16377a == this.f16377a && m.l(dVar.f16378b, this.f16378b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16377a;
    }

    public final String toString() {
        return this.f16377a + ":" + this.f16378b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 1, 4);
        parcel.writeInt(this.f16377a);
        w7.c0.l(parcel, 2, this.f16378b);
        w7.c0.r(parcel, q6);
    }
}
