package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f16538a;
    public final String f16539b;

    public d(int i10, String str) {
        this.f16538a = i10;
        this.f16539b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f16538a == this.f16538a && l.l(dVar.f16539b, this.f16539b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16538a;
    }

    public final String toString() {
        return this.f16538a + ":" + this.f16539b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f16538a);
        w7.e0.l(parcel, 2, this.f16539b);
        w7.e0.r(parcel, q6);
    }
}
