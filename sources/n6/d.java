package n6;

import android.os.Parcel;
import android.os.Parcelable;
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int f13839a;
    public final String f13840b;

    public d(int i10, String str) {
        this.f13839a = i10;
        this.f13840b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f13839a == this.f13839a && l.l(dVar.f13840b, this.f13840b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13839a;
    }

    public final String toString() {
        return this.f13839a + ":" + this.f13840b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f13839a);
        w7.e0.l(parcel, 2, this.f13840b);
        w7.e0.r(parcel, q6);
    }
}
