package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new n4.x(10);
    public final int f19101a;
    public final String f19102b;

    public d(int i10, String str) {
        this.f19101a = i10;
        this.f19102b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (dVar.f19101a == this.f19101a && l.l(dVar.f19102b, this.f19102b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19101a;
    }

    public final String toString() {
        return this.f19101a + ":" + this.f19102b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19101a);
        df.l(parcel, 2, this.f19102b);
        df.r(parcel, q5);
    }
}
