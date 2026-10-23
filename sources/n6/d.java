package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(10);
    public final int f17222a;
    public final String f17223b;

    public d(int i10, String str) {
        this.f17222a = i10;
        this.f17223b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f17222a == this.f17222a && l.l(dVar.f17223b, this.f17223b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17222a;
    }

    public final String toString() {
        return this.f17222a + ":" + this.f17223b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f17222a);
        w7.f0.l(parcel, 2, this.f17223b);
        w7.f0.r(parcel, q6);
    }
}
